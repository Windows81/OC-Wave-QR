package org.bson.codecs;

import org.bson.BsonMinKey;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonMinKeyCodec implements Codec<BsonMinKey> {
    /* renamed from: c */
    public BsonMinKey b(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.Z();
        return new BsonMinKey();
    }

    public Class d() {
        return BsonMinKey.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonMinKey bsonMinKey, EncoderContext encoderContext) {
        bsonWriter.Q();
    }
}
