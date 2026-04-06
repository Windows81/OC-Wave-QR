package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.MaxKey;

public class MaxKeyCodec implements Codec<MaxKey> {
    /* renamed from: c */
    public MaxKey b(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.D0();
        return new MaxKey();
    }

    public Class d() {
        return MaxKey.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, MaxKey maxKey, EncoderContext encoderContext) {
        bsonWriter.E();
    }
}
