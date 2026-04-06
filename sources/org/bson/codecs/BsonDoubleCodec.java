package org.bson.codecs;

import org.bson.BsonDouble;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonDoubleCodec implements Codec<BsonDouble> {
    /* renamed from: c */
    public BsonDouble b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonDouble(bsonReader.readDouble());
    }

    public Class d() {
        return BsonDouble.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonDouble bsonDouble, EncoderContext encoderContext) {
        bsonWriter.writeDouble(bsonDouble.q0());
    }
}
