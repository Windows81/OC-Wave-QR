package org.bson.codecs;

import org.bson.BsonBinary;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class ByteArrayCodec implements Codec<byte[]> {
    /* renamed from: c */
    public byte[] b(BsonReader bsonReader, DecoderContext decoderContext) {
        return bsonReader.J().p0();
    }

    public Class d() {
        return byte[].class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, byte[] bArr, EncoderContext encoderContext) {
        bsonWriter.F(new BsonBinary(bArr));
    }
}
