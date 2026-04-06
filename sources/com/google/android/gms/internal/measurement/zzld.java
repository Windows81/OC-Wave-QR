package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;

final class zzld implements zzmi {

    /* renamed from: a  reason: collision with root package name */
    public static final zzld f25632a = new zzld();

    public static zzld c() {
        return f25632a;
    }

    public final zzmj a(Class cls) {
        Class<zzlc> cls2 = zzlc.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzmj) zzlc.p(cls.asSubclass(cls2)).s(zzlc.zze.f25626c, (Object) null, (Object) null);
            } catch (Exception e2) {
                String name = cls.getName();
                throw new RuntimeException("Unable to get message info for " + name, e2);
            }
        } else {
            String name2 = cls.getName();
            throw new IllegalArgumentException("Unsupported message type: " + name2);
        }
    }

    public final boolean b(Class cls) {
        return zzlc.class.isAssignableFrom(cls);
    }
}
