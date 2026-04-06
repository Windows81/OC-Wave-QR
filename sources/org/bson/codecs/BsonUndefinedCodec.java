package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonUndefined;
import org.bson.BsonWriter;

public class BsonUndefinedCodec implements Codec<BsonUndefined> {
    /* renamed from: c */
    public BsonUndefined b(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.X0();
        return new BsonUndefined();
    }

    public Class d() {
        return BsonUndefined.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonUndefined bsonUndefined, EncoderContext encoderContext) {
        bsonWriter.n0();
    }
}
