package org.bson;

import org.bson.types.ObjectId;

public class BsonObjectId extends BsonValue implements Comparable<BsonObjectId> {

    /* renamed from: z  reason: collision with root package name */
    public final ObjectId f43664z;

    public BsonObjectId() {
        this(new ObjectId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f43664z.equals(((BsonObjectId) obj).f43664z);
    }

    public int hashCode() {
        return this.f43664z.hashCode();
    }

    public BsonType j0() {
        return BsonType.OBJECT_ID;
    }

    /* renamed from: l0 */
    public int compareTo(BsonObjectId bsonObjectId) {
        return this.f43664z.compareTo(bsonObjectId.f43664z);
    }

    public ObjectId p0() {
        return this.f43664z;
    }

    public String toString() {
        return "BsonObjectId{value=" + this.f43664z.A() + '}';
    }

    public BsonObjectId(ObjectId objectId) {
        if (objectId != null) {
            this.f43664z = objectId;
            return;
        }
        throw new IllegalArgumentException("value may not be null");
    }
}
