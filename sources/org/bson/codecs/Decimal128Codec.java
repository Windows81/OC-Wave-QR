package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.Decimal128;

public final class Decimal128Codec implements Codec<Decimal128> {
    /* renamed from: c */
    public Decimal128 b(BsonReader bsonReader, DecoderContext decoderContext) {
        return bsonReader.K();
    }

    public Class d() {
        return Decimal128.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Decimal128 decimal128, EncoderContext encoderContext) {
        bsonWriter.o0(decimal128);
    }
}
