package com.google.android.gms.tasks;

final class zzm implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzn f27223A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Task f27224z;

    public zzm(zzn zzn, Task task) {
        this.f27223A = zzn;
        this.f27224z = task;
    }

    public final void run() {
        synchronized (this.f27223A.f27226b) {
            try {
                zzn zzn = this.f27223A;
                if (zzn.f27227c != null) {
                    zzn.f27227c.a(this.f27224z.k());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
