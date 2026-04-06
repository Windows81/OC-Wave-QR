package org.bson.codecs;

import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class FloatCodec implements Codec<Float> {
    /* renamed from: c */
    public Float b(BsonReader bsonReader, DecoderContext decoderContext) {
        double a2 = NumberCodecHelper.a(bsonReader);
        if (a2 >= -3.4028234663852886E38d && a2 <= 3.4028234663852886E38d) {
            return Float.valueOf((float) a2);
        }
        throw new BsonInvalidOperationException(String.format("%s can not be converted into a Float.", new Object[]{Double.valueOf(a2)}));
    }

    public Class d() {
        return Float.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Float f2, EncoderContext encoderContext) {
        bsonWriter.writeDouble((double) f2.floatValue());
    }
}
