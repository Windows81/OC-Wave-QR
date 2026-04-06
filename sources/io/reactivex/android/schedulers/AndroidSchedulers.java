package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import java.util.concurrent.Callable;

public final class AndroidSchedulers {

    /* renamed from: a  reason: collision with root package name */
    public static final Scheduler f39846a = RxAndroidPlugins.d(new Callable<Scheduler>() {
        /* renamed from: a */
        public Scheduler call() {
            return MainHolder.f39847a;
        }
    });

    public static final class MainHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final Scheduler f39847a = new HandlerScheduler(new Handler(Looper.getMainLooper()), false);
    }

    public static Scheduler a(Looper looper) {
        return b(looper, false);
    }

    public static Scheduler b(Looper looper, boolean z2) {
        if (looper != null) {
            return new HandlerScheduler(new Handler(looper), z2);
        }
        throw new NullPointerException("looper == null");
    }
}
