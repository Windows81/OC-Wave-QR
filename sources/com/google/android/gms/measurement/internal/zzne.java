package com.google.android.gms.measurement.internal;

public final /* synthetic */ class zzne implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ zznf f26868z;

    public /* synthetic */ zzne(zznf zznf) {
        this.f26868z = zznf;
    }

    public final void run() {
        zznf zznf = this.f26868z;
        zznc zznc = zznf.f26870B;
        long j2 = zznf.f26871z;
        long j3 = zznf.f26869A;
        zznc.f26865b.n();
        zznc.f26865b.m().F().a("Application going to the background");
        zznc.f26865b.i().f26374u.a(true);
        zznc.f26865b.D(true);
        if (!zznc.f26865b.d().Z()) {
            if (zznc.f26865b.d().t(zzbj.P0)) {
                zznc.f26865b.E(false, false, j3);
                zznc.f26865b.f26862f.e(j3);
            } else {
                zznc.f26865b.f26862f.e(j3);
                zznc.f26865b.E(false, false, j3);
            }
        }
        zznc.f26865b.m().J().b("Application backgrounded at: timestamp_millis", Long.valueOf(j2));
        if (zznc.f26865b.d().t(zzbj.i1)) {
            zznc.f26865b.r().B0();
        }
    }
}
