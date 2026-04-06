package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzmz {

    /* renamed from: c  reason: collision with root package name */
    public static final zzmz f25688c = new zzmz();

    /* renamed from: a  reason: collision with root package name */
    public final zznc f25689a = new zzlz();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap f25690b = new ConcurrentHashMap();

    public static zzmz a() {
        return f25688c;
    }

    public final zznd b(Class cls) {
        zzle.f(cls, "messageType");
        zznd zznd = (zznd) this.f25690b.get(cls);
        if (zznd != null) {
            return zznd;
        }
        zznd a2 = this.f25689a.a(cls);
        zzle.f(cls, "messageType");
        zzle.f(a2, "schema");
        zznd zznd2 = (zznd) this.f25690b.putIfAbsent(cls, a2);
        return zznd2 != null ? zznd2 : a2;
    }

    public final zznd c(Object obj) {
        return b(obj.getClass());
    }
}
