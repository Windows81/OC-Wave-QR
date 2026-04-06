package org.bson.codecs;

import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

public class BsonCodecProvider implements CodecProvider {
    public Codec b(Class cls, CodecRegistry codecRegistry) {
        if (Bson.class.isAssignableFrom(cls)) {
            return new BsonCodec(codecRegistry);
        }
        return null;
    }
}
