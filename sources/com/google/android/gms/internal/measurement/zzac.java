package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzac {

    /* renamed from: a  reason: collision with root package name */
    public zzad f25315a;

    /* renamed from: b  reason: collision with root package name */
    public zzad f25316b;

    /* renamed from: c  reason: collision with root package name */
    public List f25317c;

    public zzac() {
        this.f25315a = new zzad("", 0, (Map) null);
        this.f25316b = new zzad("", 0, (Map) null);
        this.f25317c = new ArrayList();
    }

    public final zzad a() {
        return this.f25315a;
    }

    public final void b(zzad zzad) {
        this.f25315a = zzad;
        this.f25316b = (zzad) zzad.clone();
        this.f25317c.clear();
    }

    public final void c(String str, long j2, Map map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, zzad.c(str2, this.f25315a.b(str2), map.get(str2)));
        }
        this.f25317c.add(new zzad(str, j2, hashMap));
    }

    public final /* synthetic */ Object clone() {
        zzac zzac = new zzac((zzad) this.f25315a.clone());
        for (zzad clone : this.f25317c) {
            zzac.f25317c.add((zzad) clone.clone());
        }
        return zzac;
    }

    public final zzad d() {
        return this.f25316b;
    }

    public final void e(zzad zzad) {
        this.f25316b = zzad;
    }

    public final List f() {
        return this.f25317c;
    }

    public zzac(zzad zzad) {
        this.f25315a = zzad;
        this.f25316b = (zzad) zzad.clone();
        this.f25317c = new ArrayList();
    }
}
