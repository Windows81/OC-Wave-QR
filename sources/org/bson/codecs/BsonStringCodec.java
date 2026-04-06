package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonString;
import org.bson.BsonWriter;

public class BsonStringCodec implements Codec<BsonString> {
    /* renamed from: c */
    public BsonString b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonString(bsonReader.h());
    }

    public Class d() {
        return BsonString.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonString bsonString, EncoderContext encoderContext) {
        bsonWriter.p(bsonString.p0());
    }
}
