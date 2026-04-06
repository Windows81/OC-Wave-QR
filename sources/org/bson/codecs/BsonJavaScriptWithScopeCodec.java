package org.bson.codecs;

import org.bson.BsonDocument;
import org.bson.BsonJavaScriptWithScope;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonJavaScriptWithScopeCodec implements Codec<BsonJavaScriptWithScope> {

    /* renamed from: a  reason: collision with root package name */
    public final Codec f43707a;

    public BsonJavaScriptWithScopeCodec(Codec codec) {
        this.f43707a = codec;
    }

    /* renamed from: c */
    public BsonJavaScriptWithScope b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonJavaScriptWithScope(bsonReader.C0(), (BsonDocument) this.f43707a.b(bsonReader, decoderContext));
    }

    public Class d() {
        return BsonJavaScriptWithScope.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonJavaScriptWithScope bsonJavaScriptWithScope, EncoderContext encoderContext) {
        bsonWriter.g0(bsonJavaScriptWithScope.p0());
        this.f43707a.a(bsonWriter, bsonJavaScriptWithScope.q0(), encoderContext);
    }
}
