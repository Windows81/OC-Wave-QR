package com.google.android.gms.measurement.internal;

final class zzir implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26569A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzia f26570B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzbh f26571z;

    public zzir(zzia zzia, zzbh zzbh, String str) {
        this.f26571z = zzbh;
        this.f26569A = str;
        this.f26570B = zzia;
    }

    public final void run() {
        this.f26570B.f26522l.z0();
        this.f26570B.f26522l.v(this.f26571z, this.f26569A);
    }
}
