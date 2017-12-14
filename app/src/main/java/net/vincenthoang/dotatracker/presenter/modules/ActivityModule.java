package net.vincenthoang.dotatracker.presenter.modules;

import android.app.Activity;

import net.vincenthoang.dotatracker.presenter.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vincenthoang on 12/13/17.
 */

@Module
public class ActivityModule {
    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @PerActivity
    Activity activity() {
        return this.activity();
    }
}
