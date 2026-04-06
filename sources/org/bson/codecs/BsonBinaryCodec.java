package org.bson.codecs;

import org.bson.BsonBinary;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonBinaryCodec implements Codec<BsonBinary> {
    /* renamed from: c */
    public BsonBinary b(BsonReader bsonReader, DecoderContext decoderContext) {
        return bsonReader.J();
    }

    public Class d() {
        return BsonBinary.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonBinary bsonBinary, EncoderContext encoderContext) {
        bsonWriter.F(bsonBinary);
    }
}
