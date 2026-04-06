package org.bson;

public class BsonJavaScriptWithScope extends BsonValue {

    /* renamed from: A  reason: collision with root package name */
    public final BsonDocument f43661A;

    /* renamed from: z  reason: collision with root package name */
    public final String f43662z;

    public BsonJavaScriptWithScope(String str, BsonDocument bsonDocument) {
        if (str == null) {
            throw new IllegalArgumentException("code can not be null");
        } else if (bsonDocument != null) {
            this.f43662z = str;
            this.f43661A = bsonDocument;
        } else {
            throw new IllegalArgumentException("scope can not be null");
        }
    }

    public static BsonJavaScriptWithScope l0(BsonJavaScriptWithScope bsonJavaScriptWithScope) {
        return new BsonJavaScriptWithScope(bsonJavaScriptWithScope.f43662z, bsonJavaScriptWithScope.f43661A.clone());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BsonJavaScriptWithScope bsonJavaScriptWithScope = (BsonJavaScriptWithScope) obj;
        return this.f43662z.equals(bsonJavaScriptWithScope.f43662z) && this.f43661A.equals(bsonJavaScriptWithScope.f43661A);
    }

    public int hashCode() {
        return (this.f43662z.hashCode() * 31) + this.f43661A.hashCode();
    }

    public BsonType j0() {
        return BsonType.JAVASCRIPT_WITH_SCOPE;
    }

    public String p0() {
        return this.f43662z;
    }

    public BsonDocument q0() {
        return this.f43661A;
    }

    public String toString() {
        return "BsonJavaScriptWithScope{code=" + p0() + "scope=" + this.f43661A + '}';
    }
}
