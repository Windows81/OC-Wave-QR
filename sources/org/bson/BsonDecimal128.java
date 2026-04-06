package org.bson;

import org.bson.assertions.Assertions;
import org.bson.types.Decimal128;

public final class BsonDecimal128 extends BsonNumber {

    /* renamed from: z  reason: collision with root package name */
    public final Decimal128 f43637z;

    public BsonDecimal128(Decimal128 decimal128) {
        Assertions.d("value", decimal128);
        this.f43637z = decimal128;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BsonDecimal128.class == obj.getClass() && this.f43637z.equals(((BsonDecimal128) obj).f43637z);
    }

    public int hashCode() {
        return this.f43637z.hashCode();
    }

    public BsonType j0() {
        return BsonType.DECIMAL128;
    }

    public Decimal128 l0() {
        return this.f43637z;
    }

    public String toString() {
        return "BsonDecimal128{value=" + this.f43637z + '}';
    }
}
