package org.bson;

public final class BsonInt32 extends BsonNumber implements Comparable<BsonInt32> {

    /* renamed from: z  reason: collision with root package name */
    public final int f43658z;

    public BsonInt32(int i2) {
        this.f43658z = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BsonInt32.class == obj.getClass() && this.f43658z == ((BsonInt32) obj).f43658z;
    }

    public int hashCode() {
        return this.f43658z;
    }

    public BsonType j0() {
        return BsonType.INT32;
    }

    /* renamed from: l0 */
    public int compareTo(BsonInt32 bsonInt32) {
        int i2 = this.f43658z;
        int i3 = bsonInt32.f43658z;
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public int p0() {
        return this.f43658z;
    }

    public String toString() {
        return "BsonInt32{value=" + this.f43658z + '}';
    }
}
