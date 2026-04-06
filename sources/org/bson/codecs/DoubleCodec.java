package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;

public class DoubleCodec implements Codec<Double> {
    /* renamed from: c */
    public Double b(BsonReader bsonReader, DecoderContext decoderContext) {
        return Double.valueOf(NumberCodecHelper.a(bsonReader));
    }

    public Class d() {
        return Double.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Double d2, EncoderContext encoderContext) {
        bsonWriter.writeDouble(d2.doubleValue());
    }
}
