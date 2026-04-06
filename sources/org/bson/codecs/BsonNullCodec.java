package org.bson.codecs;

import org.bson.BsonNull;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonNullCodec implements Codec<BsonNull> {
    /* renamed from: c */
    public BsonNull b(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.i1();
        return BsonNull.f43663z;
    }

    public Class d() {
        return BsonNull.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonNull bsonNull, EncoderContext encoderContext) {
        bsonWriter.D();
    }
}
