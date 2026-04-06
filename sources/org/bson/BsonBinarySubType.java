package org.bson;

public enum BsonBinarySubType {
    BINARY((byte) 0),
    FUNCTION((byte) 1),
    OLD_BINARY((byte) 2),
    UUID_LEGACY((byte) 3),
    UUID_STANDARD((byte) 4),
    MD5((byte) 5),
    USER_DEFINED(Byte.MIN_VALUE);
    

    /* renamed from: z  reason: collision with root package name */
    public final byte f43623z;

    /* access modifiers changed from: public */
    BsonBinarySubType(byte b2) {
        this.f43623z = b2;
    }

    public static boolean f(byte b2) {
        return b2 == UUID_LEGACY.d() || b2 == UUID_STANDARD.d();
    }

    public byte d() {
        return this.f43623z;
    }
}
