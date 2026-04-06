package org.bson.codecs;

import org.bson.BsonBinary;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.Binary;

public class BinaryCodec implements Codec<Binary> {
    /* renamed from: c */
    public Binary b(BsonReader bsonReader, DecoderContext decoderContext) {
        BsonBinary J = bsonReader.J();
        return new Binary(J.q0(), J.p0());
    }

    public Class d() {
        return Binary.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Binary binary, EncoderContext encoderContext) {
        bsonWriter.F(new BsonBinary(binary.b(), binary.a()));
    }
}
