package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zzij implements Callable<List<zzom>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26545a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f26546b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f26547c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzia f26548d;

    public zzij(zzia zzia, String str, String str2, String str3) {
        this.f26545a = str;
        this.f26546b = str2;
        this.f26547c = str3;
        this.f26548d = zzia;
    }

    public final /* synthetic */ Object call() {
        this.f26548d.f26522l.z0();
        return this.f26548d.f26522l.l0().D0(this.f26545a, this.f26546b, this.f26547c);
    }
}
