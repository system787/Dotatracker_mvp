package net.vincenthoang.dotatracker.presenter;

import android.support.annotation.NonNull;

import net.vincenthoang.dotatracker.view.RankedDetailsView;

import javax.inject.Inject;

/**
 * Created by vincenthoang on 12/14/17.
 */

public class RankedDetailsPresenter implements Presenter {

    private RankedDetailsView mRankedDetailsView;

    @Inject
    public RankedDetailsPresenter() {
        // TODO: domain layer
    }

    public void setView(@NonNull RankedDetailsView view) {
        this.mRankedDetailsView = view;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {
        // TODO: dispose domain layer
        this.mRankedDetailsView = null;
    }

    public void initialize(long accountId) {

    }
}
