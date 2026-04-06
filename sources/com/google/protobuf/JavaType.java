package com.google.protobuf;

public enum JavaType {
    VOID(Void.class, Void.class, (Class) null),
    INT(r4, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(ByteString.class, ByteString.class, ByteString.f31983A),
    ENUM(r4, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: A  reason: collision with root package name */
    public final Class f32190A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f32191B;

    /* renamed from: z  reason: collision with root package name */
    public final Class f32192z;

    /* access modifiers changed from: public */
    JavaType(Class cls, Class cls2, Object obj) {
        this.f32192z = cls;
        this.f32190A = cls2;
        this.f32191B = obj;
    }

    public Class f() {
        return this.f32190A;
    }
}
