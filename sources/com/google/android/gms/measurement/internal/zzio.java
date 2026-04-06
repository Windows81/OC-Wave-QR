package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zzio implements Callable<List<zzaf>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26561a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f26562b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f26563c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzia f26564d;

    public zzio(zzia zzia, String str, String str2, String str3) {
        this.f26561a = str;
        this.f26562b = str2;
        this.f26563c = str3;
        this.f26564d = zzia;
    }

    public final /* synthetic */ Object call() {
        this.f26564d.f26522l.z0();
        return this.f26564d.f26522l.l0().R(this.f26561a, this.f26562b, this.f26563c);
    }
}
