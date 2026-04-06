package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zziu implements Callable<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzbh f26578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f26579b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ zzia f26580c;

    public zziu(zzia zzia, zzbh zzbh, String str) {
        this.f26578a = zzbh;
        this.f26579b = str;
        this.f26580c = zzia;
    }

    public final /* synthetic */ Object call() {
        this.f26580c.f26522l.z0();
        return this.f26580c.f26522l.u0().y(this.f26578a, this.f26579b);
    }
}
