package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonRegularExpression;
import org.bson.BsonWriter;

public class BsonRegularExpressionCodec implements Codec<BsonRegularExpression> {
    /* renamed from: c */
    public BsonRegularExpression b(BsonReader bsonReader, DecoderContext decoderContext) {
        return bsonReader.f1();
    }

    public Class d() {
        return BsonRegularExpression.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonRegularExpression bsonRegularExpression, EncoderContext encoderContext) {
        bsonWriter.G(bsonRegularExpression);
    }
}
