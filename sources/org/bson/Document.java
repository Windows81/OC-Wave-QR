package org.bson;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

public class Document implements Map<String, Object>, Serializable, Bson {

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f43676z = new LinkedHashMap();

    /* renamed from: a */
    public Object put(String str, Object obj) {
        return this.f43676z.put(str, obj);
    }

    public void clear() {
        this.f43676z.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f43676z.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f43676z.containsValue(obj);
    }

    public Set entrySet() {
        return this.f43676z.entrySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f43676z.equals(((Document) obj).f43676z);
    }

    public Object get(Object obj) {
        return this.f43676z.get(obj);
    }

    public BsonDocument h(Class cls, CodecRegistry codecRegistry) {
        return new BsonDocumentWrapper(this, codecRegistry.a(Document.class));
    }

    public int hashCode() {
        return this.f43676z.hashCode();
    }

    public boolean isEmpty() {
        return this.f43676z.isEmpty();
    }

    public Set keySet() {
        return this.f43676z.keySet();
    }

    public void putAll(Map map) {
        this.f43676z.putAll(map);
    }

    public Object remove(Object obj) {
        return this.f43676z.remove(obj);
    }

    public int size() {
        return this.f43676z.size();
    }

    public String toString() {
        return "Document{" + this.f43676z + '}';
    }

    public Collection values() {
        return this.f43676z.values();
    }
}
