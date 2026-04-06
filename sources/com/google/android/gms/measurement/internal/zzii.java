package com.google.android.gms.measurement.internal;

final class zzii implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26542A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f26543B;
    public final /* synthetic */ long C;
    public final /* synthetic */ zzia D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f26544z;

    public zzii(zzia zzia, String str, String str2, String str3, long j2) {
        this.f26544z = str;
        this.f26542A = str2;
        this.f26543B = str3;
        this.C = j2;
        this.D = zzia;
    }

    public final void run() {
        String str = this.f26544z;
        if (str == null) {
            this.D.f26522l.F(this.f26542A, (zzlh) null);
            return;
        }
        this.D.f26522l.F(this.f26542A, new zzlh(this.f26543B, str, this.C));
    }
}
