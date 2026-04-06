package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BooleanCodec implements Codec<Boolean> {
    /* renamed from: c */
    public Boolean b(BsonReader bsonReader, DecoderContext decoderContext) {
        return Boolean.valueOf(bsonReader.readBoolean());
    }

    public Class d() {
        return Boolean.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Boolean bool, EncoderContext encoderContext) {
        bsonWriter.writeBoolean(bool.booleanValue());
    }
}
