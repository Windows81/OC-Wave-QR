package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class zznw implements zzgo {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26933a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f26934b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ zznv f26935c;

    public zznw(zznv zznv, String str, List list) {
        this.f26933a = str;
        this.f26934b = list;
        this.f26935c = zznv;
    }

    public final void a(String str, int i2, Throwable th, byte[] bArr, Map map) {
        this.f26935c.K(true, i2, th, bArr, this.f26933a, this.f26934b);
    }
}
