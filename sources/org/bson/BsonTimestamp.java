package org.bson;

import org.bson.internal.UnsignedLongs;

public final class BsonTimestamp extends BsonValue implements Comparable<BsonTimestamp> {

    /* renamed from: z  reason: collision with root package name */
    public final long f43669z;

    public BsonTimestamp(long j2) {
        this.f43669z = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BsonTimestamp.class == obj.getClass() && this.f43669z == ((BsonTimestamp) obj).f43669z;
    }

    public int hashCode() {
        long j2 = this.f43669z;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public BsonType j0() {
        return BsonType.TIMESTAMP;
    }

    /* renamed from: l0 */
    public int compareTo(BsonTimestamp bsonTimestamp) {
        return UnsignedLongs.a(this.f43669z, bsonTimestamp.f43669z);
    }

    public int p0() {
        return (int) this.f43669z;
    }

    public int q0() {
        return (int) (this.f43669z >> 32);
    }

    public long r0() {
        return this.f43669z;
    }

    public String toString() {
        return "Timestamp{value=" + r0() + ", seconds=" + q0() + ", inc=" + p0() + '}';
    }

    public BsonTimestamp(int i2, int i3) {
        this.f43669z = (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }
}
