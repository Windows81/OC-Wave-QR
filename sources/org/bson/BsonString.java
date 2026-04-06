package org.bson;

public class BsonString extends BsonValue implements Comparable<BsonString> {

    /* renamed from: z  reason: collision with root package name */
    public final String f43667z;

    public BsonString(String str) {
        if (str != null) {
            this.f43667z = str;
            return;
        }
        throw new IllegalArgumentException("Value can not be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f43667z.equals(((BsonString) obj).f43667z);
    }

    public int hashCode() {
        return this.f43667z.hashCode();
    }

    public BsonType j0() {
        return BsonType.STRING;
    }

    /* renamed from: l0 */
    public int compareTo(BsonString bsonString) {
        return this.f43667z.compareTo(bsonString.f43667z);
    }

    public String p0() {
        return this.f43667z;
    }

    public String toString() {
        return "BsonString{value='" + this.f43667z + '\'' + '}';
    }
}
