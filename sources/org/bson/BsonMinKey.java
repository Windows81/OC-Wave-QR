package org.bson;

public final class BsonMinKey extends BsonValue {
    public boolean equals(Object obj) {
        return obj instanceof BsonMinKey;
    }

    public int hashCode() {
        return 0;
    }

    public BsonType j0() {
        return BsonType.MIN_KEY;
    }

    public String toString() {
        return "BsonMinKey";
    }
}
