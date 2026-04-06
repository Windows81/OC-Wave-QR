package org.bson;

public class BsonDateTime extends BsonValue implements Comparable<BsonDateTime> {

    /* renamed from: z  reason: collision with root package name */
    public final long f43634z;

    public BsonDateTime(long j2) {
        this.f43634z = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f43634z == ((BsonDateTime) obj).f43634z;
    }

    public int hashCode() {
        long j2 = this.f43634z;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public BsonType j0() {
        return BsonType.DATE_TIME;
    }

    /* renamed from: l0 */
    public int compareTo(BsonDateTime bsonDateTime) {
        return Long.valueOf(this.f43634z).compareTo(Long.valueOf(bsonDateTime.f43634z));
    }

    public long p0() {
        return this.f43634z;
    }

    public String toString() {
        return "BsonDateTime{value=" + this.f43634z + '}';
    }
}
