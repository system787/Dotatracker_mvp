package net.vincenthoang.dotatracker.presenter.components;

import android.content.Context;

import net.vincenthoang.dotatracker.presenter.modules.ApplicationModule;
import net.vincenthoang.dotatracker.view.activity.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by vincenthoang on 12/13/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    Context context();
}
