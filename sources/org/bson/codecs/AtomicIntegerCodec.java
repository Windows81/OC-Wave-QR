package org.bson.codecs;

import java.util.concurrent.atomic.AtomicInteger;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class AtomicIntegerCodec implements Codec<AtomicInteger> {
    /* renamed from: c */
    public AtomicInteger b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new AtomicInteger(NumberCodecHelper.b(bsonReader));
    }

    public Class d() {
        return AtomicInteger.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, AtomicInteger atomicInteger, EncoderContext encoderContext) {
        bsonWriter.q(atomicInteger.intValue());
    }
}
