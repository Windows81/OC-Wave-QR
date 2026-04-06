package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.Document;
import org.bson.types.CodeWithScope;

public class CodeWithScopeCodec implements Codec<CodeWithScope> {

    /* renamed from: a  reason: collision with root package name */
    public final Codec f43714a;

    public CodeWithScopeCodec(Codec codec) {
        this.f43714a = codec;
    }

    /* renamed from: c */
    public CodeWithScope b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new CodeWithScope(bsonReader.C0(), (Document) this.f43714a.b(bsonReader, decoderContext));
    }

    public Class d() {
        return CodeWithScope.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, CodeWithScope codeWithScope, EncoderContext encoderContext) {
        bsonWriter.g0(codeWithScope.a());
        this.f43714a.a(bsonWriter, codeWithScope.b(), encoderContext);
    }
}
