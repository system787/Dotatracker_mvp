package net.vincenthoang.dotatracker.model.remote.interactor;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by vincenthoang on 12/14/17.
 */

public class DefaultObserver<T> extends DisposableObserver<T> {
    @Override
    public void onNext(T t) {
        // no-op by default
    }

    @Override
    public void onError(Throwable e) {
        // no-op by default
    }
    @Override
    public void onComplete() {
        // no-op by default
    }
}
