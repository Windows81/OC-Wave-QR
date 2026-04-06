package org.bson;

public final class BsonBoolean extends BsonValue implements Comparable<BsonBoolean> {

    /* renamed from: A  reason: collision with root package name */
    public static final BsonBoolean f43628A = new BsonBoolean(true);

    /* renamed from: B  reason: collision with root package name */
    public static final BsonBoolean f43629B = new BsonBoolean(false);

    /* renamed from: z  reason: collision with root package name */
    public final boolean f43630z;

    public BsonBoolean(boolean z2) {
        this.f43630z = z2;
    }

    public static BsonBoolean q0(boolean z2) {
        return z2 ? f43628A : f43629B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BsonBoolean.class == obj.getClass() && this.f43630z == ((BsonBoolean) obj).f43630z;
    }

    public int hashCode() {
        return this.f43630z ? 1 : 0;
    }

    public BsonType j0() {
        return BsonType.BOOLEAN;
    }

    /* renamed from: l0 */
    public int compareTo(BsonBoolean bsonBoolean) {
        return Boolean.valueOf(this.f43630z).compareTo(Boolean.valueOf(bsonBoolean.f43630z));
    }

    public boolean p0() {
        return this.f43630z;
    }

    public String toString() {
        return "BsonBoolean{value=" + this.f43630z + '}';
    }
}
