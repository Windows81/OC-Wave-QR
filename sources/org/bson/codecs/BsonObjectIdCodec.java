package org.bson.codecs;

import org.bson.BsonObjectId;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonObjectIdCodec implements Codec<BsonObjectId> {
    /* renamed from: c */
    public BsonObjectId b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonObjectId(bsonReader.w());
    }

    public Class d() {
        return BsonObjectId.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonObjectId bsonObjectId, EncoderContext encoderContext) {
        bsonWriter.N(bsonObjectId.p0());
    }
}
