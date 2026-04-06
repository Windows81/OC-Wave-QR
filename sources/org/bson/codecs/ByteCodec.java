package org.bson.codecs;

import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class ByteCodec implements Codec<Byte> {
    /* renamed from: c */
    public Byte b(BsonReader bsonReader, DecoderContext decoderContext) {
        int b2 = NumberCodecHelper.b(bsonReader);
        if (b2 >= -128 && b2 <= 127) {
            return Byte.valueOf((byte) b2);
        }
        throw new BsonInvalidOperationException(String.format("%s can not be converted into a Byte.", new Object[]{Integer.valueOf(b2)}));
    }

    public Class d() {
        return Byte.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Byte b2, EncoderContext encoderContext) {
        bsonWriter.q(b2.byteValue());
    }
}
