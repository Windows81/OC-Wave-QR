package org.bson;

public final class BsonMaxKey extends BsonValue {
    public boolean equals(Object obj) {
        return obj instanceof BsonMaxKey;
    }

    public int hashCode() {
        return 0;
    }

    public BsonType j0() {
        return BsonType.MAX_KEY;
    }

    public String toString() {
        return "BsonMaxKey";
    }
}
