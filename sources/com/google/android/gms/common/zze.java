package com.google.android.gms.common;

import java.util.concurrent.Callable;

public final /* synthetic */ class zze implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f25160a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f25161b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ zzj f25162c;

    public /* synthetic */ zze(boolean z2, String str, zzj zzj) {
        this.f25160a = z2;
        this.f25161b = str;
        this.f25162c = zzj;
    }

    public final Object call() {
        return zzn.c(this.f25160a, this.f25161b, this.f25162c);
    }
}
