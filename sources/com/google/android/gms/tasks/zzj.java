package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzj implements zzq {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f27215a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f27216b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public OnCompleteListener f27217c;

    public zzj(Executor executor, OnCompleteListener onCompleteListener) {
        this.f27215a = executor;
        this.f27217c = onCompleteListener;
    }

    public final void c() {
        synchronized (this.f27216b) {
            this.f27217c = null;
        }
    }

    public final void d(Task task) {
        synchronized (this.f27216b) {
            try {
                if (this.f27217c != null) {
                    this.f27215a.execute(new zzi(this, task));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
