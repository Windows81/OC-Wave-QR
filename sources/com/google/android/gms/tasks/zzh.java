package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzh implements zzq {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f27210a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f27211b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public OnCanceledListener f27212c;

    public zzh(Executor executor, OnCanceledListener onCanceledListener) {
        this.f27210a = executor;
        this.f27212c = onCanceledListener;
    }

    public final void c() {
        synchronized (this.f27211b) {
            this.f27212c = null;
        }
    }

    public final void d(Task task) {
        if (task.l()) {
            synchronized (this.f27211b) {
                try {
                    if (this.f27212c != null) {
                        this.f27210a.execute(new zzg(this));
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
