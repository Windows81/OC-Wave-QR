package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

final class zzk implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzl f27218A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Task f27219z;

    public zzk(zzl zzl, Task task) {
        this.f27218A = zzl;
        this.f27219z = task;
    }

    public final void run() {
        synchronized (this.f27218A.f27221b) {
            try {
                zzl zzl = this.f27218A;
                if (zzl.f27222c != null) {
                    zzl.f27222c.e((Exception) Preconditions.m(this.f27219z.j()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
