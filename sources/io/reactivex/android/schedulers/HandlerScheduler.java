package io.reactivex.android.schedulers;

import android.os.Handler;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;

final class HandlerScheduler extends Scheduler {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f39848a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f39849b;

    public static final class HandlerWorker extends Scheduler.Worker {
    }

    public static final class ScheduledRunnable implements Runnable, Disposable {

        /* renamed from: z  reason: collision with root package name */
        public final Runnable f39850z;

        public void run() {
            try {
                this.f39850z.run();
            } catch (Throwable th) {
                RxJavaPlugins.onError(th);
            }
        }
    }

    public HandlerScheduler(Handler handler, boolean z2) {
        this.f39848a = handler;
        this.f39849b = z2;
    }
}
