package org.bson.codecs;

import org.bson.BsonJavaScript;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonJavaScriptCodec implements Codec<BsonJavaScript> {
    /* renamed from: c */
    public BsonJavaScript b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonJavaScript(bsonReader.R0());
    }

    public Class d() {
        return BsonJavaScript.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonJavaScript bsonJavaScript, EncoderContext encoderContext) {
        bsonWriter.X(bsonJavaScript.l0());
    }
}
