package org.bson;

public class BsonJavaScript extends BsonValue {

    /* renamed from: z  reason: collision with root package name */
    public final String f43660z;

    public BsonJavaScript(String str) {
        this.f43660z = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f43660z.equals(((BsonJavaScript) obj).f43660z);
    }

    public int hashCode() {
        return this.f43660z.hashCode();
    }

    public BsonType j0() {
        return BsonType.JAVASCRIPT;
    }

    public String l0() {
        return this.f43660z;
    }

    public String toString() {
        return "BsonJavaScript{code='" + this.f43660z + '\'' + '}';
    }
}
