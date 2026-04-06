package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzn implements zzq {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f27225a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f27226b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public OnSuccessListener f27227c;

    public zzn(Executor executor, OnSuccessListener onSuccessListener) {
        this.f27225a = executor;
        this.f27227c = onSuccessListener;
    }

    public final void c() {
        synchronized (this.f27226b) {
            this.f27227c = null;
        }
    }

    public final void d(Task task) {
        if (task.n()) {
            synchronized (this.f27226b) {
                try {
                    if (this.f27227c != null) {
                        this.f27225a.execute(new zzm(this, task));
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
