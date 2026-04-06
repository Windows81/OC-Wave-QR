package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zziv implements Callable<List<zzom>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26581a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzia f26582b;

    public zziv(zzia zzia, String str) {
        this.f26581a = str;
        this.f26582b = zzia;
    }

    public final /* synthetic */ Object call() {
        this.f26582b.f26522l.z0();
        return this.f26582b.f26522l.l0().X0(this.f26581a);
    }
}
