package org.bson.codecs;

import org.bson.BsonBoolean;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonBooleanCodec implements Codec<BsonBoolean> {
    /* renamed from: c */
    public BsonBoolean b(BsonReader bsonReader, DecoderContext decoderContext) {
        return BsonBoolean.q0(bsonReader.readBoolean());
    }

    public Class d() {
        return BsonBoolean.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonBoolean bsonBoolean, EncoderContext encoderContext) {
        bsonWriter.writeBoolean(bsonBoolean.p0());
    }
}
