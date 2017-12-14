package net.vincenthoang.dotatracker.model.remote.executor;

import io.reactivex.Scheduler;

/**
 * Created by vincenthoang on 12/14/17.
 */

public interface PostExecutionThread {
    Scheduler getScheduler();
}
