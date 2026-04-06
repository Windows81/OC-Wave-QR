package org.bson;

public class BsonElement {

    /* renamed from: a  reason: collision with root package name */
    public final String f43656a;

    /* renamed from: b  reason: collision with root package name */
    public final BsonValue f43657b;

    public BsonElement(String str, BsonValue bsonValue) {
        this.f43656a = str;
        this.f43657b = bsonValue;
    }

    public String a() {
        return this.f43656a;
    }

    public BsonValue b() {
        return this.f43657b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BsonElement bsonElement = (BsonElement) obj;
        if (a() == null ? bsonElement.a() == null : a().equals(bsonElement.a())) {
            return b() == null ? bsonElement.b() == null : b().equals(bsonElement.b());
        }
        return false;
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = (a() != null ? a().hashCode() : 0) * 31;
        if (b() != null) {
            i2 = b().hashCode();
        }
        return hashCode + i2;
    }
}
