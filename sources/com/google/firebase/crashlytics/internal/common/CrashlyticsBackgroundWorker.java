package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class CrashlyticsBackgroundWorker {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f29969a;

    /* renamed from: b  reason: collision with root package name */
    public Task f29970b = Tasks.e((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final Object f29971c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal f29972d = new ThreadLocal();

    public CrashlyticsBackgroundWorker(Executor executor) {
        this.f29969a = executor;
        executor.execute(new Runnable() {
            public void run() {
                CrashlyticsBackgroundWorker.this.f29972d.set(Boolean.TRUE);
            }
        });
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f29969a;
    }

    public final Task d(Task task) {
        return task.h(this.f29969a, new Continuation<Object, Void>() {
            /* renamed from: b */
            public Void a(Task task) {
                return null;
            }
        });
    }

    public final boolean e() {
        return Boolean.TRUE.equals(this.f29972d.get());
    }

    public final Continuation f(final Callable callable) {
        return new Continuation<Void, Object>() {
            public Object a(Task task) {
                return callable.call();
            }
        };
    }

    public Task g(final Runnable runnable) {
        return h(new Callable<Void>() {
            /* renamed from: a */
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public Task h(Callable callable) {
        Task h2;
        synchronized (this.f29971c) {
            h2 = this.f29970b.h(this.f29969a, f(callable));
            this.f29970b = d(h2);
        }
        return h2;
    }

    public Task i(Callable callable) {
        Task i2;
        synchronized (this.f29971c) {
            i2 = this.f29970b.i(this.f29969a, f(callable));
            this.f29970b = d(i2);
        }
        return i2;
    }
}
