package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zzil implements Callable<List<zzaf>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26551a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f26552b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f26553c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzia f26554d;

    public zzil(zzia zzia, String str, String str2, String str3) {
        this.f26551a = str;
        this.f26552b = str2;
        this.f26553c = str3;
        this.f26554d = zzia;
    }

    public final /* synthetic */ Object call() {
        this.f26554d.f26522l.z0();
        return this.f26554d.f26522l.l0().R(this.f26551a, this.f26552b, this.f26553c);
    }
}
