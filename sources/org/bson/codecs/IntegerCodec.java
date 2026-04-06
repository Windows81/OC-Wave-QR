package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;

public class IntegerCodec implements Codec<Integer> {
    /* renamed from: c */
    public Integer b(BsonReader bsonReader, DecoderContext decoderContext) {
        return Integer.valueOf(NumberCodecHelper.b(bsonReader));
    }

    public Class d() {
        return Integer.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Integer num, EncoderContext encoderContext) {
        bsonWriter.q(num.intValue());
    }
}
