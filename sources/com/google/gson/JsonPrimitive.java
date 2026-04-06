package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;
import java.util.Objects;

public final class JsonPrimitive extends JsonElement {

    /* renamed from: z  reason: collision with root package name */
    public final Object f31680z;

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f31680z = bool;
    }

    public static boolean A(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.f31680z;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean B() {
        return this.f31680z instanceof Number;
    }

    public boolean C() {
        return this.f31680z instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.f31680z == null) {
            return jsonPrimitive.f31680z == null;
        }
        if (A(this) && A(jsonPrimitive)) {
            return v().longValue() == jsonPrimitive.v().longValue();
        }
        Object obj2 = this.f31680z;
        if (!(obj2 instanceof Number) || !(jsonPrimitive.f31680z instanceof Number)) {
            return obj2.equals(jsonPrimitive.f31680z);
        }
        double doubleValue = v().doubleValue();
        double doubleValue2 = jsonPrimitive.v().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f31680z == null) {
            return 31;
        }
        if (A(this)) {
            doubleToLongBits = v().longValue();
        } else {
            Object obj = this.f31680z;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(v().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean p() {
        return z() ? ((Boolean) this.f31680z).booleanValue() : Boolean.parseBoolean(w());
    }

    public double q() {
        return B() ? v().doubleValue() : Double.parseDouble(w());
    }

    public int s() {
        return B() ? v().intValue() : Integer.parseInt(w());
    }

    public long u() {
        return B() ? v().longValue() : Long.parseLong(w());
    }

    public Number v() {
        Object obj = this.f31680z;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String w() {
        Object obj = this.f31680z;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (B()) {
            return v().toString();
        }
        if (z()) {
            return ((Boolean) this.f31680z).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f31680z.getClass());
    }

    public boolean z() {
        return this.f31680z instanceof Boolean;
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.f31680z = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.f31680z = str;
    }
}
