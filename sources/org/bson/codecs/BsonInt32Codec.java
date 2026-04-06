package org.bson.codecs;

import org.bson.BsonInt32;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonInt32Codec implements Codec<BsonInt32> {
    /* renamed from: c */
    public BsonInt32 b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonInt32(bsonReader.i());
    }

    public Class d() {
        return BsonInt32.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonInt32 bsonInt32, EncoderContext encoderContext) {
        bsonWriter.q(bsonInt32.p0());
    }
}
