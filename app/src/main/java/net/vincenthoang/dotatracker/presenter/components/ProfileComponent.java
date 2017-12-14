package net.vincenthoang.dotatracker.presenter.components;

import net.vincenthoang.dotatracker.presenter.PerActivity;
import net.vincenthoang.dotatracker.presenter.modules.ActivityModule;
import net.vincenthoang.dotatracker.presenter.modules.ProfileModule;
import net.vincenthoang.dotatracker.view.fragment.RankedStatsFragment;

import dagger.Component;

/**
 * Created by vincenthoang on 12/14/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = { ActivityModule.class, ProfileModule.class })
public interface ProfileComponent extends ApplicationComponent {
    void inject(RankedStatsFragment rankedStatsFragment);
}
