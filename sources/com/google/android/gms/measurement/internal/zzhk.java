package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzx;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzhk implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ zzhg f26456a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ String f26457b;

    public /* synthetic */ zzhk(zzhg zzhg, String str) {
        this.f26456a = zzhg;
        this.f26457b = str;
    }

    public final Object call() {
        return new zzx("internal.appMetadata", new zzhi(this.f26456a, this.f26457b));
    }
}
