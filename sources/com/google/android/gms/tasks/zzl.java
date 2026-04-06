package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzl implements zzq {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f27220a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f27221b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public OnFailureListener f27222c;

    public zzl(Executor executor, OnFailureListener onFailureListener) {
        this.f27220a = executor;
        this.f27222c = onFailureListener;
    }

    public final void c() {
        synchronized (this.f27221b) {
            this.f27222c = null;
        }
    }

    public final void d(Task task) {
        if (!task.n() && !task.l()) {
            synchronized (this.f27221b) {
                try {
                    if (this.f27222c != null) {
                        this.f27220a.execute(new zzk(this, task));
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }
}
