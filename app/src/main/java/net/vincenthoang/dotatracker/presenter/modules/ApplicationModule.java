package net.vincenthoang.dotatracker.presenter.modules;

import android.content.Context;

import net.vincenthoang.dotatracker.view.AndroidApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vincenthoang on 12/13/17.
 */

@Module
public class ApplicationModule {
    private final AndroidApplication mApplication;

    public ApplicationModule(AndroidApplication application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.mApplication;
    }
}
