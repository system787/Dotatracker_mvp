package net.vincenthoang.dotatracker.presenter.components;

import android.app.Activity;

import net.vincenthoang.dotatracker.presenter.PerActivity;
import net.vincenthoang.dotatracker.presenter.modules.ActivityModule;

import dagger.Component;

/**
 * Created by vincenthoang on 12/13/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
