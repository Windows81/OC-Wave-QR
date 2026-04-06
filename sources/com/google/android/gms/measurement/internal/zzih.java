package com.google.android.gms.measurement.internal;

final class zzih implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzp f26539A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzia f26540B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzaf f26541z;

    public zzih(zzia zzia, zzaf zzaf, zzp zzp) {
        this.f26541z = zzaf;
        this.f26539A = zzp;
        this.f26540B = zzia;
    }

    public final void run() {
        this.f26540B.f26522l.z0();
        if (this.f26541z.f26175B.H() == null) {
            this.f26540B.f26522l.t(this.f26541z, this.f26539A);
        } else {
            this.f26540B.f26522l.X(this.f26541z, this.f26539A);
        }
    }
}
