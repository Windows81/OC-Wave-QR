package org.bson.codecs;

import org.bson.BsonInt64;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonInt64Codec implements Codec<BsonInt64> {
    /* renamed from: c */
    public BsonInt64 b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonInt64(bsonReader.n());
    }

    public Class d() {
        return BsonInt64.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonInt64 bsonInt64, EncoderContext encoderContext) {
        bsonWriter.z(bsonInt64.p0());
    }
}
