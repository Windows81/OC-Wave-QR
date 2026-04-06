package com.google.android.gms.measurement.internal;

final class zzit implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzp f26575A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzia f26576B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzok f26577z;

    public zzit(zzia zzia, zzok zzok, zzp zzp) {
        this.f26577z = zzok;
        this.f26575A = zzp;
        this.f26576B = zzia;
    }

    public final void run() {
        this.f26576B.f26522l.z0();
        if (this.f26577z.H() == null) {
            this.f26576B.f26522l.G(this.f26577z.f26959A, this.f26575A);
        } else {
            this.f26576B.f26522l.y(this.f26577z, this.f26575A);
        }
    }
}
