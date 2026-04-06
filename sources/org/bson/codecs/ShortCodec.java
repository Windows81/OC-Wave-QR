package org.bson.codecs;

import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class ShortCodec implements Codec<Short> {
    /* renamed from: c */
    public Short b(BsonReader bsonReader, DecoderContext decoderContext) {
        int b2 = NumberCodecHelper.b(bsonReader);
        if (b2 >= -32768 && b2 <= 32767) {
            return Short.valueOf((short) b2);
        }
        throw new BsonInvalidOperationException(String.format("%s can not be converted into a Short.", new Object[]{Integer.valueOf(b2)}));
    }

    public Class d() {
        return Short.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Short sh, EncoderContext encoderContext) {
        bsonWriter.q(sh.shortValue());
    }
}
