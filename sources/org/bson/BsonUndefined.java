package org.bson;

public final class BsonUndefined extends BsonValue {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BsonUndefined.class == obj.getClass();
    }

    public int hashCode() {
        return 0;
    }

    public BsonType j0() {
        return BsonType.UNDEFINED;
    }
}
