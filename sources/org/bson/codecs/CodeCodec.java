package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.Code;

public class CodeCodec implements Codec<Code> {
    /* renamed from: c */
    public Code b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new Code(bsonReader.R0());
    }

    public Class d() {
        return Code.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Code code, EncoderContext encoderContext) {
        bsonWriter.X(code.a());
    }
}
