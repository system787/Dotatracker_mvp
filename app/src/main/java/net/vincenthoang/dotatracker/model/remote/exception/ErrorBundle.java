package net.vincenthoang.dotatracker.model.remote.exception;

/**
 * Created by vincenthoang on 12/14/17.
 */

public interface ErrorBundle {
    Exception getException();
    String getErrorMessage();
}
