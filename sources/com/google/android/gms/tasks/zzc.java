package com.google.android.gms.tasks;

final class zzc implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzd f27199A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Task f27200z;

    public zzc(zzd zzd, Task task) {
        this.f27199A = zzd;
        this.f27200z = task;
    }

    public final void run() {
        if (this.f27200z.l()) {
            this.f27199A.f27203c.s();
            return;
        }
        try {
            this.f27199A.f27203c.r(this.f27199A.f27202b.a(this.f27200z));
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f27199A.f27203c.q((Exception) e2.getCause());
            } else {
                this.f27199A.f27203c.q(e2);
            }
        } catch (Exception e3) {
            this.f27199A.f27203c.q(e3);
        }
    }
}
