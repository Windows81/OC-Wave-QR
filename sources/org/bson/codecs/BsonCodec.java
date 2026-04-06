package org.bson.codecs;

import org.bson.BsonDocument;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

public class BsonCodec implements Codec<Bson> {

    /* renamed from: b  reason: collision with root package name */
    public static final Codec f43701b = new BsonDocumentCodec();

    /* renamed from: a  reason: collision with root package name */
    public final CodecRegistry f43702a;

    public BsonCodec(CodecRegistry codecRegistry) {
        this.f43702a = codecRegistry;
    }

    /* renamed from: c */
    public Bson b(BsonReader bsonReader, DecoderContext decoderContext) {
        throw new UnsupportedOperationException("The BsonCodec can only encode to Bson");
    }

    public Class d() {
        return Bson.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Bson bson, EncoderContext encoderContext) {
        try {
            f43701b.a(bsonWriter, bson.h(BsonDocument.class, this.f43702a), encoderContext);
        } catch (Exception e2) {
            throw new CodecConfigurationException(String.format("Unable to encode a Bson implementation: %s", new Object[]{bson}), e2);
        }
    }
}
