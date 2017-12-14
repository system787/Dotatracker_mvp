package net.vincenthoang.dotatracker.model.remote.interactor;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by vincenthoang on 12/14/17.
 */

public class DefaultObserver<T> extends DisposableObserver<T> {
    /**
     * Provides the Observer with a new item to observe.
     * <p>
     * The {@link Observable} may call this method 0 or more times.
     * <p>
     * The {@code Observable} will not call this method again after it calls either {@link #onComplete} or
     * {@link #onError}.
     *
     * @param t the item emitted by the Observable
     */
    @Override
    public void onNext(T t) {
        // no-op by default
    }

    /**
     * Notifies the Observer that the {@link Observable} has experienced an error condition.
     * <p>
     * If the {@link Observable} calls this method, it will not thereafter call {@link #onNext} or
     * {@link #onComplete}.
     *
     * @param e the exception encountered by the Observable
     */
    @Override
    public void onError(Throwable e) {
        // no-op by default
    }

    /**
     * Notifies the Observer that the {@link Observable} has finished sending push-based notifications.
     * <p>
     * The {@link Observable} will not call this method if it calls {@link #onError}.
     */
    @Override
    public void onComplete() {
        // no-op by default
    }
}
