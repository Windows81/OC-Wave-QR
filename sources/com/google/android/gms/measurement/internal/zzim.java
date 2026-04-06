package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zzim implements Callable<List<zzom>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26555a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f26556b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f26557c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzia f26558d;

    public zzim(zzia zzia, String str, String str2, String str3) {
        this.f26555a = str;
        this.f26556b = str2;
        this.f26557c = str3;
        this.f26558d = zzia;
    }

    public final /* synthetic */ Object call() {
        this.f26558d.f26522l.z0();
        return this.f26558d.f26522l.l0().D0(this.f26555a, this.f26556b, this.f26557c);
    }
}
