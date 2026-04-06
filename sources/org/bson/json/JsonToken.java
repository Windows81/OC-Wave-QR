package org.bson.json;

import org.bson.BsonDouble;
import org.bson.types.Decimal128;

class JsonToken {

    /* renamed from: a  reason: collision with root package name */
    public final Object f43947a;

    /* renamed from: b  reason: collision with root package name */
    public final JsonTokenType f43948b;

    public JsonToken(JsonTokenType jsonTokenType, Object obj) {
        this.f43947a = obj;
        this.f43948b = jsonTokenType;
    }

    public JsonTokenType a() {
        return this.f43948b;
    }

    public Object b() {
        return this.f43947a;
    }

    public Object c(Class cls) {
        if (Long.class == cls) {
            try {
                Object obj = this.f43947a;
                if (obj instanceof Integer) {
                    return cls.cast(Long.valueOf(((Integer) obj).longValue()));
                }
                if (obj instanceof String) {
                    return cls.cast(Long.valueOf((String) obj));
                }
            } catch (Exception e2) {
                throw new JsonParseException(String.format("Exception converting value '%s' to type %s", new Object[]{this.f43947a, cls.getName()}), e2);
            }
        } else if (Integer.class == cls) {
            Object obj2 = this.f43947a;
            if (obj2 instanceof String) {
                return cls.cast(Integer.valueOf((String) obj2));
            }
        } else if (Double.class == cls) {
            Object obj3 = this.f43947a;
            if (obj3 instanceof String) {
                return cls.cast(Double.valueOf((String) obj3));
            }
        } else if (Decimal128.class == cls) {
            Object obj4 = this.f43947a;
            if (obj4 instanceof Integer) {
                return cls.cast(new Decimal128((long) ((Integer) this.f43947a).intValue()));
            }
            if (obj4 instanceof Long) {
                return cls.cast(new Decimal128(((Long) this.f43947a).longValue()));
            }
            if (obj4 instanceof Double) {
                return cls.cast(new BsonDouble(((Double) obj4).doubleValue()).p0());
            }
            if (obj4 instanceof String) {
                return cls.cast(Decimal128.z((String) obj4));
            }
        }
        return cls.cast(this.f43947a);
    }
}
