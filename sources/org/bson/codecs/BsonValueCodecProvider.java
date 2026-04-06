package org.bson.codecs;

import java.util.HashMap;
import java.util.Map;
import org.bson.BsonArray;
import org.bson.BsonBinary;
import org.bson.BsonBoolean;
import org.bson.BsonDateTime;
import org.bson.BsonDbPointer;
import org.bson.BsonDecimal128;
import org.bson.BsonDocument;
import org.bson.BsonDocumentWrapper;
import org.bson.BsonDouble;
import org.bson.BsonInt32;
import org.bson.BsonInt64;
import org.bson.BsonJavaScript;
import org.bson.BsonJavaScriptWithScope;
import org.bson.BsonMaxKey;
import org.bson.BsonMinKey;
import org.bson.BsonNull;
import org.bson.BsonObjectId;
import org.bson.BsonRegularExpression;
import org.bson.BsonString;
import org.bson.BsonSymbol;
import org.bson.BsonTimestamp;
import org.bson.BsonType;
import org.bson.BsonUndefined;
import org.bson.BsonValue;
import org.bson.RawBsonDocument;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

public class BsonValueCodecProvider implements CodecProvider {

    /* renamed from: b  reason: collision with root package name */
    public static final BsonTypeClassMap f43712b;

    /* renamed from: a  reason: collision with root package name */
    public final Map f43713a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(BsonType.NULL, BsonNull.class);
        hashMap.put(BsonType.ARRAY, BsonArray.class);
        hashMap.put(BsonType.BINARY, BsonBinary.class);
        hashMap.put(BsonType.BOOLEAN, BsonBoolean.class);
        hashMap.put(BsonType.DATE_TIME, BsonDateTime.class);
        hashMap.put(BsonType.DB_POINTER, BsonDbPointer.class);
        hashMap.put(BsonType.DOCUMENT, BsonDocument.class);
        hashMap.put(BsonType.DOUBLE, BsonDouble.class);
        hashMap.put(BsonType.INT32, BsonInt32.class);
        hashMap.put(BsonType.INT64, BsonInt64.class);
        hashMap.put(BsonType.DECIMAL128, BsonDecimal128.class);
        hashMap.put(BsonType.MAX_KEY, BsonMaxKey.class);
        hashMap.put(BsonType.MIN_KEY, BsonMinKey.class);
        hashMap.put(BsonType.JAVASCRIPT, BsonJavaScript.class);
        hashMap.put(BsonType.JAVASCRIPT_WITH_SCOPE, BsonJavaScriptWithScope.class);
        hashMap.put(BsonType.OBJECT_ID, BsonObjectId.class);
        hashMap.put(BsonType.REGULAR_EXPRESSION, BsonRegularExpression.class);
        hashMap.put(BsonType.STRING, BsonString.class);
        hashMap.put(BsonType.SYMBOL, BsonSymbol.class);
        hashMap.put(BsonType.TIMESTAMP, BsonTimestamp.class);
        hashMap.put(BsonType.UNDEFINED, BsonUndefined.class);
        f43712b = new BsonTypeClassMap(hashMap);
    }

    public BsonValueCodecProvider() {
        c();
    }

    public static BsonTypeClassMap d() {
        return f43712b;
    }

    public static Class e(BsonType bsonType) {
        return f43712b.b(bsonType);
    }

    public final void a(Codec codec) {
        this.f43713a.put(codec.d(), codec);
    }

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        if (this.f43713a.containsKey(cls)) {
            return (Codec) this.f43713a.get(cls);
        }
        Class<BsonDocument> cls2 = BsonDocument.class;
        if (cls == BsonJavaScriptWithScope.class) {
            return new BsonJavaScriptWithScopeCodec(codecRegistry.a(cls2));
        }
        if (cls == BsonValue.class) {
            return new BsonValueCodec(codecRegistry);
        }
        if (cls == BsonDocumentWrapper.class) {
            return new BsonDocumentWrapperCodec(codecRegistry.a(cls2));
        }
        if (cls == RawBsonDocument.class) {
            return new RawBsonDocumentCodec();
        }
        if (cls2.isAssignableFrom(cls)) {
            return new BsonDocumentCodec(codecRegistry);
        }
        if (BsonArray.class.isAssignableFrom(cls)) {
            return new BsonArrayCodec(codecRegistry);
        }
        return null;
    }

    public final void c() {
        a(new BsonNullCodec());
        a(new BsonBinaryCodec());
        a(new BsonBooleanCodec());
        a(new BsonDateTimeCodec());
        a(new BsonDBPointerCodec());
        a(new BsonDoubleCodec());
        a(new BsonInt32Codec());
        a(new BsonInt64Codec());
        a(new BsonDecimal128Codec());
        a(new BsonMinKeyCodec());
        a(new BsonMaxKeyCodec());
        a(new BsonJavaScriptCodec());
        a(new BsonObjectIdCodec());
        a(new BsonRegularExpressionCodec());
        a(new BsonStringCodec());
        a(new BsonSymbolCodec());
        a(new BsonTimestampCodec());
        a(new BsonUndefinedCodec());
    }
}
