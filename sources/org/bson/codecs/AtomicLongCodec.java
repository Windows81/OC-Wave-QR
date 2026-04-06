package org.bson.codecs;

import java.util.concurrent.atomic.AtomicLong;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class AtomicLongCodec implements Codec<AtomicLong> {
    /* renamed from: c */
    public AtomicLong b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new AtomicLong(NumberCodecHelper.c(bsonReader));
    }

    public Class d() {
        return AtomicLong.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, AtomicLong atomicLong, EncoderContext encoderContext) {
        bsonWriter.z(atomicLong.longValue());
    }
}
