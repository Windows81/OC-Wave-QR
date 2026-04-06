package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzm;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzhh implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ zzhg f26451a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ String f26452b;

    public /* synthetic */ zzhh(zzhg zzhg, String str) {
        this.f26451a = zzhg;
        this.f26452b = str;
    }

    public final Object call() {
        return new zzm("internal.remoteConfig", new zzho(this.f26451a, this.f26452b));
    }
}
