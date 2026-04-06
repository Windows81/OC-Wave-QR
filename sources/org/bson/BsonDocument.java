package org.bson;

import java.io.Serializable;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bson.codecs.BsonDocumentCodec;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;
import org.bson.json.JsonWriter;
import org.bson.json.JsonWriterSettings;

public class BsonDocument extends BsonValue implements Map<String, BsonValue>, Cloneable, Bson, Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Map f43638z = new LinkedHashMap();

    /* renamed from: org.bson.BsonDocument$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43639a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43639a = r0
                org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43639a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.BsonType r1 = org.bson.BsonType.ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43639a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.BsonType r1 = org.bson.BsonType.BINARY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43639a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.BsonDocument.AnonymousClass1.<clinit>():void");
        }
    }

    public static class SerializationProxy implements Serializable {
    }

    public BsonDocument(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BsonElement bsonElement = (BsonElement) it.next();
            put(bsonElement.a(), bsonElement.b());
        }
    }

    public void clear() {
        this.f43638z.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f43638z.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f43638z.containsValue(obj);
    }

    public Set entrySet() {
        return this.f43638z.entrySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BsonDocument)) {
            return false;
        }
        return entrySet().equals(((BsonDocument) obj).entrySet());
    }

    public BsonDocument h(Class cls, CodecRegistry codecRegistry) {
        return this;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return this.f43638z.isEmpty();
    }

    public BsonType j0() {
        return BsonType.DOCUMENT;
    }

    public Set keySet() {
        return this.f43638z.keySet();
    }

    /* renamed from: l0 */
    public BsonDocument clone() {
        BsonDocument bsonDocument = new BsonDocument();
        for (Map.Entry entry : entrySet()) {
            int i2 = AnonymousClass1.f43639a[((BsonValue) entry.getValue()).j0().ordinal()];
            if (i2 == 1) {
                bsonDocument.put((String) entry.getKey(), ((BsonValue) entry.getValue()).R().clone());
            } else if (i2 == 2) {
                bsonDocument.put((String) entry.getKey(), ((BsonValue) entry.getValue()).n().clone());
            } else if (i2 == 3) {
                bsonDocument.put((String) entry.getKey(), BsonBinary.l0(((BsonValue) entry.getValue()).o()));
            } else if (i2 != 4) {
                bsonDocument.put((String) entry.getKey(), (BsonValue) entry.getValue());
            } else {
                bsonDocument.put((String) entry.getKey(), BsonJavaScriptWithScope.l0(((BsonValue) entry.getValue()).Z()));
            }
        }
        return bsonDocument;
    }

    /* renamed from: p0 */
    public BsonValue get(Object obj) {
        return (BsonValue) this.f43638z.get(obj);
    }

    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put((String) entry.getKey(), (BsonValue) entry.getValue());
        }
    }

    /* renamed from: q0 */
    public BsonValue put(String str, BsonValue bsonValue) {
        if (bsonValue == null) {
            throw new IllegalArgumentException(String.format("The value for key %s can not be null", new Object[]{str}));
        } else if (!str.contains("\u0000")) {
            return (BsonValue) this.f43638z.put(str, bsonValue);
        } else {
            throw new BSONException(String.format("BSON cstring '%s' is not valid because it contains a null character at index %d", new Object[]{str, Integer.valueOf(str.indexOf(0))}));
        }
    }

    /* renamed from: r0 */
    public BsonValue remove(Object obj) {
        return (BsonValue) this.f43638z.remove(obj);
    }

    public int size() {
        return this.f43638z.size();
    }

    public String toString() {
        return u0();
    }

    public String u0() {
        return v0(new JsonWriterSettings());
    }

    public String v0(JsonWriterSettings jsonWriterSettings) {
        StringWriter stringWriter = new StringWriter();
        new BsonDocumentCodec().a(new JsonWriter(stringWriter, jsonWriterSettings), this, EncoderContext.a().b());
        return stringWriter.toString();
    }

    public Collection values() {
        return this.f43638z.values();
    }

    public BsonDocument() {
    }
}
