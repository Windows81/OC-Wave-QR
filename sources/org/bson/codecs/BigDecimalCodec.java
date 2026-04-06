package org.bson.codecs;

import java.math.BigDecimal;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.Decimal128;

public final class BigDecimalCodec implements Codec<BigDecimal> {
    /* renamed from: c */
    public BigDecimal b(BsonReader bsonReader, DecoderContext decoderContext) {
        return bsonReader.K().d();
    }

    public Class d() {
        return BigDecimal.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BigDecimal bigDecimal, EncoderContext encoderContext) {
        bsonWriter.o0(new Decimal128(bigDecimal));
    }
}
