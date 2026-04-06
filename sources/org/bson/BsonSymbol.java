package org.bson;

public class BsonSymbol extends BsonValue {

    /* renamed from: z  reason: collision with root package name */
    public final String f43668z;

    public BsonSymbol(String str) {
        if (str != null) {
            this.f43668z = str;
            return;
        }
        throw new IllegalArgumentException("Value can not be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f43668z.equals(((BsonSymbol) obj).f43668z);
    }

    public int hashCode() {
        return this.f43668z.hashCode();
    }

    public BsonType j0() {
        return BsonType.SYMBOL;
    }

    public String l0() {
        return this.f43668z;
    }

    public String toString() {
        return this.f43668z;
    }
}
