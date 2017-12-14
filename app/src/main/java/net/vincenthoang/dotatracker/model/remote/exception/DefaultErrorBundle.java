package net.vincenthoang.dotatracker.model.remote.exception;

/**
 * Created by vincenthoang on 12/14/17.
 */

public class DefaultErrorBundle implements ErrorBundle {

    private static final String DEFAULT_ERROR_MSG = "Unknown error";

    private final Exception mException;

    public DefaultErrorBundle(Exception e) {
        this.mException = e;
    }

    @Override
    public Exception getException() {
        return mException;
    }

    @Override
    public String getErrorMessage() {
        return (mException != null) ? this.mException.getMessage() : DEFAULT_ERROR_MSG;
    }
}
