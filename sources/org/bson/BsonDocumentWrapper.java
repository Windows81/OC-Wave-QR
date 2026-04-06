package org.bson;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.bson.codecs.Encoder;
import org.bson.codecs.EncoderContext;

public final class BsonDocumentWrapper<T> extends BsonDocument {

    /* renamed from: A  reason: collision with root package name */
    public final transient Object f43650A;

    /* renamed from: B  reason: collision with root package name */
    public final transient Encoder f43651B;
    public BsonDocument C;

    public BsonDocumentWrapper(Object obj, Encoder encoder) {
        if (obj != null) {
            this.f43650A = obj;
            this.f43651B = encoder;
            return;
        }
        throw new IllegalArgumentException("Document can not be null");
    }

    public boolean B0() {
        return this.C != null;
    }

    public void clear() {
        super.clear();
    }

    public boolean containsKey(Object obj) {
        return y0().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return y0().containsValue(obj);
    }

    public Set entrySet() {
        return y0().entrySet();
    }

    public boolean equals(Object obj) {
        return y0().equals(obj);
    }

    public int hashCode() {
        return y0().hashCode();
    }

    public boolean isEmpty() {
        return y0().isEmpty();
    }

    public Set keySet() {
        return y0().keySet();
    }

    /* renamed from: l0 */
    public BsonDocument clone() {
        return y0().clone();
    }

    /* renamed from: p0 */
    public BsonValue get(Object obj) {
        return y0().get(obj);
    }

    public void putAll(Map map) {
        super.putAll(map);
    }

    /* renamed from: q0 */
    public BsonValue put(String str, BsonValue bsonValue) {
        return y0().put(str, bsonValue);
    }

    /* renamed from: r0 */
    public BsonValue remove(Object obj) {
        return y0().remove(obj);
    }

    public int size() {
        return y0().size();
    }

    public String toString() {
        return y0().toString();
    }

    public Collection values() {
        return y0().values();
    }

    public Encoder x0() {
        return this.f43651B;
    }

    public final BsonDocument y0() {
        if (this.f43651B != null) {
            if (this.C == null) {
                BsonDocument bsonDocument = new BsonDocument();
                this.f43651B.a(new BsonDocumentWriter(bsonDocument), this.f43650A, EncoderContext.a().b());
                this.C = bsonDocument;
            }
            return this.C;
        }
        throw new BsonInvalidOperationException("Can not unwrap a BsonDocumentWrapper with no Encoder");
    }

    public Object z0() {
        return this.f43650A;
    }
}
