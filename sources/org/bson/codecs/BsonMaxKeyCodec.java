package org.bson.codecs;

import org.bson.BsonMaxKey;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonMaxKeyCodec implements Codec<BsonMaxKey> {
    /* renamed from: c */
    public BsonMaxKey b(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.D0();
        return new BsonMaxKey();
    }

    public Class d() {
        return BsonMaxKey.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonMaxKey bsonMaxKey, EncoderContext encoderContext) {
        bsonWriter.E();
    }
}
