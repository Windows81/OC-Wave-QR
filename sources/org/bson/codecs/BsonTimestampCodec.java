package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonTimestamp;
import org.bson.BsonWriter;

public class BsonTimestampCodec implements Codec<BsonTimestamp> {
    /* renamed from: c */
    public BsonTimestamp b(BsonReader bsonReader, DecoderContext decoderContext) {
        return bsonReader.W();
    }

    public Class d() {
        return BsonTimestamp.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonTimestamp bsonTimestamp, EncoderContext encoderContext) {
        bsonWriter.S(bsonTimestamp);
    }
}
