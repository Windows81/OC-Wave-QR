package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

final class zzho implements zzo {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26463a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzhg f26464b;

    public zzho(zzhg zzhg, String str) {
        this.f26463a = str;
        this.f26464b = zzhg;
    }

    public final String m(String str) {
        Map map = (Map) this.f26464b.f26440d.get(this.f26463a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
