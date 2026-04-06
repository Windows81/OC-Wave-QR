package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzhi implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ zzhg f26453a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ String f26454b;

    public /* synthetic */ zzhi(zzhg zzhg, String str) {
        this.f26453a = zzhg;
        this.f26454b = str;
    }

    public final Object call() {
        zzhg zzhg = this.f26453a;
        String str = this.f26454b;
        zzh L0 = zzhg.q().L0(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        hashMap.put("gmp_version", 102001L);
        if (L0 != null) {
            String o2 = L0.o();
            if (o2 != null) {
                hashMap.put("app_version", o2);
            }
            hashMap.put("app_version_int", Long.valueOf(L0.U()));
            hashMap.put("dynamite_version", Long.valueOf(L0.v0()));
        }
        return hashMap;
    }
}
