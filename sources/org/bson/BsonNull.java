package org.bson;

public final class BsonNull extends BsonValue {

    /* renamed from: z  reason: collision with root package name */
    public static final BsonNull f43663z = new BsonNull();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BsonNull.class == obj.getClass();
    }

    public int hashCode() {
        return 0;
    }

    public BsonType j0() {
        return BsonType.NULL;
    }

    public String toString() {
        return "BsonNull";
    }
}
