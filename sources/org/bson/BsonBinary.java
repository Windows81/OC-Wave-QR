package org.bson;

import java.util.Arrays;

public class BsonBinary extends BsonValue {

    /* renamed from: A  reason: collision with root package name */
    public final byte[] f43610A;

    /* renamed from: z  reason: collision with root package name */
    public final byte f43611z;

    public BsonBinary(byte[] bArr) {
        this(BsonBinarySubType.BINARY, bArr);
    }

    public static BsonBinary l0(BsonBinary bsonBinary) {
        return new BsonBinary(bsonBinary.f43611z, (byte[]) bsonBinary.f43610A.clone());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BsonBinary bsonBinary = (BsonBinary) obj;
        return Arrays.equals(this.f43610A, bsonBinary.f43610A) && this.f43611z == bsonBinary.f43611z;
    }

    public int hashCode() {
        return (this.f43611z * 31) + Arrays.hashCode(this.f43610A);
    }

    public BsonType j0() {
        return BsonType.BINARY;
    }

    public byte[] p0() {
        return this.f43610A;
    }

    public byte q0() {
        return this.f43611z;
    }

    public String toString() {
        return "BsonBinary{type=" + this.f43611z + ", data=" + Arrays.toString(this.f43610A) + '}';
    }

    public BsonBinary(BsonBinarySubType bsonBinarySubType, byte[] bArr) {
        if (bsonBinarySubType == null) {
            throw new IllegalArgumentException("type may not be null");
        } else if (bArr != null) {
            this.f43611z = bsonBinarySubType.d();
            this.f43610A = bArr;
        } else {
            throw new IllegalArgumentException("data may not be null");
        }
    }

    public BsonBinary(byte b2, byte[] bArr) {
        if (bArr != null) {
            this.f43611z = b2;
            this.f43610A = bArr;
            return;
        }
        throw new IllegalArgumentException("data may not be null");
    }
}
