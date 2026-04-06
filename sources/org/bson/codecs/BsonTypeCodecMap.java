package org.bson.codecs;

import org.bson.BsonType;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.configuration.CodecRegistry;

public class BsonTypeCodecMap {

    /* renamed from: a  reason: collision with root package name */
    public final BsonTypeClassMap f43709a;

    /* renamed from: b  reason: collision with root package name */
    public final Codec[] f43710b = new Codec[256];

    public BsonTypeCodecMap(BsonTypeClassMap bsonTypeClassMap, CodecRegistry codecRegistry) {
        this.f43709a = (BsonTypeClassMap) Assertions.d("bsonTypeClassMap", bsonTypeClassMap);
        Assertions.d("codecRegistry", codecRegistry);
        for (BsonType bsonType : bsonTypeClassMap.c()) {
            Class b2 = bsonTypeClassMap.b(bsonType);
            if (b2 != null) {
                try {
                    this.f43710b[bsonType.f()] = codecRegistry.a(b2);
                } catch (CodecConfigurationException unused) {
                }
            }
        }
    }

    public Codec a(BsonType bsonType) {
        Codec codec = this.f43710b[bsonType.f()];
        if (codec != null) {
            return codec;
        }
        Class b2 = this.f43709a.b(bsonType);
        if (b2 == null) {
            throw new CodecConfigurationException(String.format("No class mapped for BSON type %s.", new Object[]{bsonType}));
        }
        throw new CodecConfigurationException(String.format("Can't find a codec for %s.", new Object[]{b2}));
    }
}
