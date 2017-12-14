package net.vincenthoang.dotatracker.view;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import net.vincenthoang.dotatracker.BuildConfig;
import net.vincenthoang.dotatracker.presenter.components.ApplicationComponent;
import net.vincenthoang.dotatracker.presenter.components.DaggerApplicationComponent;
import net.vincenthoang.dotatracker.presenter.modules.ApplicationModule;

/**
 * Created by vincenthoang on 12/13/17.
 */

public class AndroidApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeInjector();
        this.initializeLeakDetection();
    }

    private void initializeInjector() {
        this.mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.mApplicationComponent;
    }

    private void initializeLeakDetection() {
        if (BuildConfig.DEBUG) {
            LeakCanary.install(this);
        }
    }
}
