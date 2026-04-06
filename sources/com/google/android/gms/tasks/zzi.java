package com.google.android.gms.tasks;

final class zzi implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzj f27213A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Task f27214z;

    public zzi(zzj zzj, Task task) {
        this.f27213A = zzj;
        this.f27214z = task;
    }

    public final void run() {
        synchronized (this.f27213A.f27216b) {
            try {
                zzj zzj = this.f27213A;
                if (zzj.f27217c != null) {
                    zzj.f27217c.a(this.f27214z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
