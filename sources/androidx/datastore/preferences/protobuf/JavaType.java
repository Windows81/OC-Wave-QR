package androidx.datastore.preferences.protobuf;

public enum JavaType {
    VOID(Void.class, Void.class, (Class) null),
    INT(r0, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(ByteString.class, ByteString.class, ByteString.f20770A),
    ENUM(r0, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: A  reason: collision with root package name */
    public final Class f21033A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f21034B;

    /* renamed from: z  reason: collision with root package name */
    public final Class f21035z;

    /* access modifiers changed from: public */
    JavaType(Class cls, Class cls2, Object obj) {
        this.f21035z = cls;
        this.f21033A = cls2;
        this.f21034B = obj;
    }

    public Class d() {
        return this.f21033A;
    }
}
