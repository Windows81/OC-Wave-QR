package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;

public class StringCodec implements Codec<String> {
    /* renamed from: c */
    public String b(BsonReader bsonReader, DecoderContext decoderContext) {
        return bsonReader.C1() == BsonType.SYMBOL ? bsonReader.b0() : bsonReader.h();
    }

    public Class d() {
        return String.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, String str, EncoderContext encoderContext) {
        bsonWriter.p(str);
    }
}
