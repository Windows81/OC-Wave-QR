package org.bson.codecs;

import java.util.concurrent.atomic.AtomicBoolean;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class AtomicBooleanCodec implements Codec<AtomicBoolean> {
    /* renamed from: c */
    public AtomicBoolean b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new AtomicBoolean(bsonReader.readBoolean());
    }

    public Class d() {
        return AtomicBoolean.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, AtomicBoolean atomicBoolean, EncoderContext encoderContext) {
        bsonWriter.writeBoolean(atomicBoolean.get());
    }
}
