package org.bson;

public enum BsonType {
    END_OF_DOCUMENT(0),
    DOUBLE(1),
    STRING(2),
    DOCUMENT(3),
    ARRAY(4),
    BINARY(5),
    UNDEFINED(6),
    OBJECT_ID(7),
    BOOLEAN(8),
    DATE_TIME(9),
    NULL(10),
    REGULAR_EXPRESSION(11),
    DB_POINTER(12),
    JAVASCRIPT(13),
    SYMBOL(14),
    JAVASCRIPT_WITH_SCOPE(15),
    INT32(16),
    TIMESTAMP(17),
    INT64(18),
    DECIMAL128(19),
    MIN_KEY(255),
    MAX_KEY(127);
    
    public static final BsonType[] W = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f43672z;

    static {
        BsonType bsonType;
        W = new BsonType[(bsonType.f() + 1)];
        for (BsonType bsonType2 : values()) {
            W[bsonType2.f()] = bsonType2;
        }
    }

    /* access modifiers changed from: public */
    BsonType(int i2) {
        this.f43672z = i2;
    }

    public static BsonType d(int i2) {
        return W[i2 & 255];
    }

    public int f() {
        return this.f43672z;
    }
}
