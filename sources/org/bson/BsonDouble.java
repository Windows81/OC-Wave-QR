package org.bson;

import java.math.BigDecimal;
import org.bson.types.Decimal128;

public class BsonDouble extends BsonNumber implements Comparable<BsonDouble> {

    /* renamed from: z  reason: collision with root package name */
    public final double f43655z;

    public BsonDouble(double d2) {
        this.f43655z = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Double.compare(((BsonDouble) obj).f43655z, this.f43655z) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f43655z);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public BsonType j0() {
        return BsonType.DOUBLE;
    }

    /* renamed from: l0 */
    public int compareTo(BsonDouble bsonDouble) {
        return Double.compare(this.f43655z, bsonDouble.f43655z);
    }

    public Decimal128 p0() {
        return Double.isNaN(this.f43655z) ? Decimal128.L : Double.isInfinite(this.f43655z) ? this.f43655z > 0.0d ? Decimal128.I : Decimal128.J : new Decimal128(new BigDecimal(this.f43655z));
    }

    public double q0() {
        return this.f43655z;
    }

    public String toString() {
        return "BsonDouble{value=" + this.f43655z + '}';
    }
}
