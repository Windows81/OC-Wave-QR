package io.reactivex.android.plugins;

import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

public final class RxAndroidPlugins {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Function f39845a;

    public static Object a(Function function, Object obj) {
        try {
            return function.apply(obj);
        } catch (Throwable th) {
            throw Exceptions.propagate(th);
        }
    }

    public static Scheduler b(Function function, Callable callable) {
        Scheduler scheduler = (Scheduler) a(function, callable);
        if (scheduler != null) {
            return scheduler;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    public static Scheduler c(Callable callable) {
        try {
            Scheduler scheduler = (Scheduler) callable.call();
            if (scheduler != null) {
                return scheduler;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw Exceptions.propagate(th);
        }
    }

    public static Scheduler d(Callable callable) {
        if (callable != null) {
            Function function = f39845a;
            return function == null ? c(callable) : b(function, callable);
        }
        throw new NullPointerException("scheduler == null");
    }
}
