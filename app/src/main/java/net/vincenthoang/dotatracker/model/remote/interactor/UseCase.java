package net.vincenthoang.dotatracker.model.remote.interactor;

import net.vincenthoang.dotatracker.model.remote.executor.PostExecutionThread;
import net.vincenthoang.dotatracker.model.remote.executor.ThreadExecutor;

import dagger.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by vincenthoang on 12/14/17.
 */

public abstract class UseCase<T, Param> {
    private final ThreadExecutor mThreadExecutor;
    private final PostExecutionThread mPostExecutionThread;
    private final CompositeDisposable mDisposable;

    UseCase(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        this.mThreadExecutor = threadExecutor;
        this.mPostExecutionThread = postExecutionThread;
        this.mDisposable = new CompositeDisposable();
    }

    abstract Observable<T> buildUseCaseObservable(Param params);

    public void execute(DisposableObserver<T> observer, Param params) {
        Preconditions.checkNotNull(observer);
        final Observable<T> observable = this.buildUseCaseObservable(params)
                .subscribeOn(Schedulers.from(mThreadExecutor))
                .observeOn(mPostExecutionThread.getScheduler());
        addDisposable(observable.subscribeWith(observer));
    }

    public void dispose() {
        if (!mDisposable.isDisposed()) {
            mDisposable.dispose();
        }
    }

    private void addDisposable(Disposable disposable) {
        Preconditions.checkNotNull(disposable);
        Preconditions.checkNotNull(mDisposable);
        mDisposable.add(disposable);
    }
}
