package org.bson.codecs;

import java.util.Map;
import org.bson.Transformer;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

public class MapCodecProvider implements CodecProvider {

    /* renamed from: a  reason: collision with root package name */
    public final BsonTypeClassMap f43745a;

    /* renamed from: b  reason: collision with root package name */
    public final Transformer f43746b;

    public MapCodecProvider() {
        this(new BsonTypeClassMap());
    }

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        if (Map.class.isAssignableFrom(cls)) {
            return new MapCodec(codecRegistry, this.f43745a, this.f43746b);
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
        MapCodecProvider mapCodecProvider = (MapCodecProvider) obj;
        if (!this.f43745a.equals(mapCodecProvider.f43745a)) {
            return false;
        }
        Transformer transformer = this.f43746b;
        Transformer transformer2 = mapCodecProvider.f43746b;
        return transformer == null ? transformer2 == null : transformer.equals(transformer2);
    }

    public int hashCode() {
        int hashCode = this.f43745a.hashCode() * 31;
        Transformer transformer = this.f43746b;
        return hashCode + (transformer != null ? transformer.hashCode() : 0);
    }

    public MapCodecProvider(BsonTypeClassMap bsonTypeClassMap) {
        this(bsonTypeClassMap, (Transformer) null);
    }

    public MapCodecProvider(BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this.f43745a = (BsonTypeClassMap) Assertions.d("bsonTypeClassMap", bsonTypeClassMap);
        this.f43746b = transformer;
    }
}
