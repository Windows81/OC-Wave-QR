package com.google.android.gms.measurement.internal;

final class zzaw implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzax f26213A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzja f26214z;

    public zzaw(zzax zzax, zzja zzja) {
        this.f26214z = zzja;
        this.f26213A = zzax;
    }

    public final void run() {
        this.f26214z.e();
        if (zzac.a()) {
            this.f26214z.f().D(this);
            return;
        }
        boolean e2 = this.f26213A.e();
        this.f26213A.f26218c = 0;
        if (e2) {
            this.f26213A.d();
        }
    }
}
