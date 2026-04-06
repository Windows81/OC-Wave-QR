package com.google.android.gms.internal.measurement;

public enum zzlm {
    VOID(Void.class, Void.class, (Class) null),
    INT(r0, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzjs.class, zzjs.class, zzjs.f25568A),
    ENUM(r0, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: z  reason: collision with root package name */
    public final Class f25639z;

    /* access modifiers changed from: public */
    zzlm(Class cls, Class cls2, Object obj) {
        this.f25639z = cls2;
    }

    public final Class d() {
        return this.f25639z;
    }
}
