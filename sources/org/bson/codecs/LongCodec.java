package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;

public class LongCodec implements Codec<Long> {
    /* renamed from: c */
    public Long b(BsonReader bsonReader, DecoderContext decoderContext) {
        return Long.valueOf(NumberCodecHelper.c(bsonReader));
    }

    public Class d() {
        return Long.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Long l2, EncoderContext encoderContext) {
        bsonWriter.z(l2.longValue());
    }
}
