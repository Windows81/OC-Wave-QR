package org.bson.codecs;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bson.BsonDbPointer;
import org.bson.BsonRegularExpression;
import org.bson.BsonTimestamp;
import org.bson.BsonType;
import org.bson.BsonUndefined;
import org.bson.Document;
import org.bson.types.Binary;
import org.bson.types.Code;
import org.bson.types.CodeWithScope;
import org.bson.types.Decimal128;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.ObjectId;
import org.bson.types.Symbol;

public class BsonTypeClassMap {

    /* renamed from: a  reason: collision with root package name */
    public final Map f43708a;

    public BsonTypeClassMap(Map map) {
        HashMap hashMap = new HashMap();
        this.f43708a = hashMap;
        a();
        hashMap.putAll(map);
    }

    public final void a() {
        this.f43708a.put(BsonType.ARRAY, List.class);
        this.f43708a.put(BsonType.BINARY, Binary.class);
        this.f43708a.put(BsonType.BOOLEAN, Boolean.class);
        this.f43708a.put(BsonType.DATE_TIME, Date.class);
        this.f43708a.put(BsonType.DB_POINTER, BsonDbPointer.class);
        this.f43708a.put(BsonType.DOCUMENT, Document.class);
        this.f43708a.put(BsonType.DOUBLE, Double.class);
        this.f43708a.put(BsonType.INT32, Integer.class);
        this.f43708a.put(BsonType.INT64, Long.class);
        this.f43708a.put(BsonType.DECIMAL128, Decimal128.class);
        this.f43708a.put(BsonType.MAX_KEY, MaxKey.class);
        this.f43708a.put(BsonType.MIN_KEY, MinKey.class);
        this.f43708a.put(BsonType.JAVASCRIPT, Code.class);
        this.f43708a.put(BsonType.JAVASCRIPT_WITH_SCOPE, CodeWithScope.class);
        this.f43708a.put(BsonType.OBJECT_ID, ObjectId.class);
        this.f43708a.put(BsonType.REGULAR_EXPRESSION, BsonRegularExpression.class);
        this.f43708a.put(BsonType.STRING, String.class);
        this.f43708a.put(BsonType.SYMBOL, Symbol.class);
        this.f43708a.put(BsonType.TIMESTAMP, BsonTimestamp.class);
        this.f43708a.put(BsonType.UNDEFINED, BsonUndefined.class);
    }

    public Class b(BsonType bsonType) {
        return (Class) this.f43708a.get(bsonType);
    }

    public Set c() {
        return this.f43708a.keySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f43708a.equals(((BsonTypeClassMap) obj).f43708a);
    }

    public int hashCode() {
        return this.f43708a.hashCode();
    }

    public BsonTypeClassMap() {
        this(Collections.emptyMap());
    }
}
