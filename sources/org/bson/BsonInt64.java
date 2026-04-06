package org.bson;

public final class BsonInt64 extends BsonNumber implements Comparable<BsonInt64> {

    /* renamed from: z  reason: collision with root package name */
    public final long f43659z;

    public BsonInt64(long j2) {
        this.f43659z = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BsonInt64.class == obj.getClass() && this.f43659z == ((BsonInt64) obj).f43659z;
    }

    public int hashCode() {
        long j2 = this.f43659z;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public BsonType j0() {
        return BsonType.INT64;
    }

    /* renamed from: l0 */
    public int compareTo(BsonInt64 bsonInt64) {
        long j2 = this.f43659z;
        long j3 = bsonInt64.f43659z;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public long p0() {
        return this.f43659z;
    }

    public String toString() {
        return "BsonInt64{value=" + this.f43659z + '}';
    }
}
