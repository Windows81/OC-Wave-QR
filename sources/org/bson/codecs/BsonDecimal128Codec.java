package org.bson.codecs;

import org.bson.BsonDecimal128;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonDecimal128Codec implements Codec<BsonDecimal128> {
    /* renamed from: c */
    public BsonDecimal128 b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonDecimal128(bsonReader.K());
    }

    public Class d() {
        return BsonDecimal128.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonDecimal128 bsonDecimal128, EncoderContext encoderContext) {
        bsonWriter.o0(bsonDecimal128.l0());
    }
}
