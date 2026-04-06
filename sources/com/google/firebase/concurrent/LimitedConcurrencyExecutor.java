package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

class LimitedConcurrencyExecutor implements Executor {

    /* renamed from: A  reason: collision with root package name */
    public final Semaphore f29824A;

    /* renamed from: B  reason: collision with root package name */
    public final LinkedBlockingQueue f29825B;

    /* renamed from: z  reason: collision with root package name */
    public final Executor f29826z;

    public final Runnable b(Runnable runnable) {
        return new v(this, runnable);
    }

    public final /* synthetic */ void c(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f29824A.release();
            d();
        }
    }

    public final void d() {
        while (this.f29824A.tryAcquire()) {
            Runnable runnable = (Runnable) this.f29825B.poll();
            if (runnable != null) {
                this.f29826z.execute(b(runnable));
            } else {
                this.f29824A.release();
                return;
            }
        }
    }

    public void execute(Runnable runnable) {
        this.f29825B.offer(runnable);
        d();
    }
}
