package net.vincenthoang.dotatracker.presenter;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by vincenthoang on 12/13/17.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {
}
