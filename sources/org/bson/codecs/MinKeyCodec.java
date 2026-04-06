package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.MinKey;

public class MinKeyCodec implements Codec<MinKey> {
    /* renamed from: c */
    public MinKey b(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.Z();
        return new MinKey();
    }

    public Class d() {
        return MinKey.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, MinKey minKey, EncoderContext encoderContext) {
        bsonWriter.Q();
    }
}
