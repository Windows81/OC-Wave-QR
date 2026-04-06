package org.bson.codecs;

import org.bson.Transformer;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

public class IterableCodecProvider implements CodecProvider {

    /* renamed from: a  reason: collision with root package name */
    public final BsonTypeClassMap f43736a;

    /* renamed from: b  reason: collision with root package name */
    public final Transformer f43737b;

    public IterableCodecProvider() {
        this(new BsonTypeClassMap());
    }

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        if (Iterable.class.isAssignableFrom(cls)) {
            return new IterableCodec(codecRegistry, this.f43736a, this.f43737b);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IterableCodecProvider iterableCodecProvider = (IterableCodecProvider) obj;
        if (!this.f43736a.equals(iterableCodecProvider.f43736a)) {
            return false;
        }
        Transformer transformer = this.f43737b;
        Transformer transformer2 = iterableCodecProvider.f43737b;
        return transformer == null ? transformer2 == null : transformer.equals(transformer2);
    }

    public int hashCode() {
        int hashCode = this.f43736a.hashCode() * 31;
        Transformer transformer = this.f43737b;
        return hashCode + (transformer != null ? transformer.hashCode() : 0);
    }

    public IterableCodecProvider(BsonTypeClassMap bsonTypeClassMap) {
        this(bsonTypeClassMap, (Transformer) null);
    }

    public IterableCodecProvider(BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this.f43736a = (BsonTypeClassMap) Assertions.d("bsonTypeClassMap", bsonTypeClassMap);
        this.f43737b = transformer;
    }
}
