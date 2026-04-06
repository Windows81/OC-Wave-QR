package com.google.android.gms.tasks;

final class zzg implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzh f27209z;

    public zzg(zzh zzh) {
        this.f27209z = zzh;
    }

    public final void run() {
        synchronized (this.f27209z.f27211b) {
            try {
                zzh zzh = this.f27209z;
                if (zzh.f27212c != null) {
                    zzh.f27212c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
