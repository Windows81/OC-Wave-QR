package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

final class zzns {

    /* renamed from: a  reason: collision with root package name */
    public String f26891a;

    /* renamed from: b  reason: collision with root package name */
    public Map f26892b;

    /* renamed from: c  reason: collision with root package name */
    public zznt f26893c;

    public zzns(String str, zznt zznt) {
        this.f26891a = str;
        this.f26893c = zznt;
    }

    public final zznt a() {
        return this.f26893c;
    }

    public final String b() {
        return this.f26891a;
    }

    public final Map c() {
        Map map = this.f26892b;
        return map == null ? Collections.emptyMap() : map;
    }

    public zzns(String str, Map map, zznt zznt) {
        this.f26891a = str;
        this.f26892b = map;
        this.f26893c = zznt;
    }
}
