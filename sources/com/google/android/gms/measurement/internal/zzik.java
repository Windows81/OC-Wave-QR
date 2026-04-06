package com.google.android.gms.measurement.internal;

final class zzik implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzia f26549A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzaf f26550z;

    public zzik(zzia zzia, zzaf zzaf) {
        this.f26550z = zzaf;
        this.f26549A = zzia;
    }

    public final void run() {
        this.f26549A.f26522l.z0();
        if (this.f26550z.f26175B.H() == null) {
            this.f26549A.f26522l.s(this.f26550z);
        } else {
            this.f26549A.f26522l.W(this.f26550z);
        }
    }
}
