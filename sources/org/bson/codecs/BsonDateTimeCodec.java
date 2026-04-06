package org.bson.codecs;

import org.bson.BsonDateTime;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonDateTimeCodec implements Codec<BsonDateTime> {
    /* renamed from: c */
    public BsonDateTime b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonDateTime(bsonReader.r0());
    }

    public Class d() {
        return BsonDateTime.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonDateTime bsonDateTime, EncoderContext encoderContext) {
        bsonWriter.c0(bsonDateTime.p0());
    }
}
