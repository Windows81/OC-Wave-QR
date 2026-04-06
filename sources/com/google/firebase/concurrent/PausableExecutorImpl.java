package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

final class PausableExecutorImpl implements PausableExecutor {

    /* renamed from: A  reason: collision with root package name */
    public final Executor f29827A;

    /* renamed from: B  reason: collision with root package name */
    public final LinkedBlockingQueue f29828B;

    /* renamed from: z  reason: collision with root package name */
    public volatile boolean f29829z;

    public final void a() {
        if (!this.f29829z) {
            Runnable runnable = (Runnable) this.f29828B.poll();
            while (runnable != null) {
                this.f29827A.execute(runnable);
                runnable = !this.f29829z ? (Runnable) this.f29828B.poll() : null;
            }
        }
    }

    public void execute(Runnable runnable) {
        this.f29828B.offer(runnable);
        a();
    }
}
