package org.bson.codecs;

import org.bson.BsonDocumentWrapper;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonDocumentWrapperCodec implements Codec<BsonDocumentWrapper> {

    /* renamed from: a  reason: collision with root package name */
    public final Codec f43706a;

    public BsonDocumentWrapperCodec(Codec codec) {
        this.f43706a = codec;
    }

    /* renamed from: c */
    public BsonDocumentWrapper b(BsonReader bsonReader, DecoderContext decoderContext) {
        throw new UnsupportedOperationException("Decoding into a BsonDocumentWrapper is not allowed");
    }

    public Class d() {
        return BsonDocumentWrapper.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonDocumentWrapper bsonDocumentWrapper, EncoderContext encoderContext) {
        if (bsonDocumentWrapper.B0()) {
            this.f43706a.a(bsonWriter, bsonDocumentWrapper, encoderContext);
        } else {
            bsonDocumentWrapper.x0().a(bsonWriter, bsonDocumentWrapper.z0(), encoderContext);
        }
    }
}
