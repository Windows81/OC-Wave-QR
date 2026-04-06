package org.bson;

import java.util.Arrays;
import org.bson.assertions.Assertions;

public final class BsonRegularExpression extends BsonValue {

    /* renamed from: A  reason: collision with root package name */
    public final String f43665A;

    /* renamed from: z  reason: collision with root package name */
    public final String f43666z;

    public BsonRegularExpression(String str, String str2) {
        this.f43666z = (String) Assertions.d("pattern", str);
        this.f43665A = str2 == null ? "" : q0(str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BsonRegularExpression.class != obj.getClass()) {
            return false;
        }
        BsonRegularExpression bsonRegularExpression = (BsonRegularExpression) obj;
        return this.f43665A.equals(bsonRegularExpression.f43665A) && this.f43666z.equals(bsonRegularExpression.f43666z);
    }

    public int hashCode() {
        return (this.f43666z.hashCode() * 31) + this.f43665A.hashCode();
    }

    public BsonType j0() {
        return BsonType.REGULAR_EXPRESSION;
    }

    public String l0() {
        return this.f43665A;
    }

    public String p0() {
        return this.f43666z;
    }

    public final String q0(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public String toString() {
        return "BsonRegularExpression{pattern='" + this.f43666z + '\'' + ", options='" + this.f43665A + '\'' + '}';
    }
}
