package org.bson;

import org.bson.types.ObjectId;

public class BsonDbPointer extends BsonValue {

    /* renamed from: A  reason: collision with root package name */
    public final ObjectId f43635A;

    /* renamed from: z  reason: collision with root package name */
    public final String f43636z;

    public BsonDbPointer(String str, ObjectId objectId) {
        if (str == null) {
            throw new IllegalArgumentException("namespace can not be null");
        } else if (objectId != null) {
            this.f43636z = str;
            this.f43635A = objectId;
        } else {
            throw new IllegalArgumentException("id can not be null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BsonDbPointer bsonDbPointer = (BsonDbPointer) obj;
        return this.f43635A.equals(bsonDbPointer.f43635A) && this.f43636z.equals(bsonDbPointer.f43636z);
    }

    public int hashCode() {
        return (this.f43636z.hashCode() * 31) + this.f43635A.hashCode();
    }

    public BsonType j0() {
        return BsonType.DB_POINTER;
    }

    public ObjectId l0() {
        return this.f43635A;
    }

    public String p0() {
        return this.f43636z;
    }

    public String toString() {
        return "BsonDbPointer{namespace='" + this.f43636z + '\'' + ", id=" + this.f43635A + '}';
    }
}
