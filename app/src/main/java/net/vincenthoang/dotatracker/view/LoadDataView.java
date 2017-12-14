package net.vincenthoang.dotatracker.view;

import android.content.Context;

/**
 * Created by vincenthoang on 12/14/17.
 */

public interface LoadDataView {

    void showLoading();

    void hideLoading();

    void showRetry();

    void hideRetry();

    void showError(String message);

    Context context();
}
