package org.bson.codecs.pojo;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

final class AutomaticPojoCodec<T> extends PojoCodec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final PojoCodec f43757a;

    public AutomaticPojoCodec(PojoCodec pojoCodec) {
        this.f43757a = pojoCodec;
    }

    public void a(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        try {
            this.f43757a.a(bsonWriter, obj, encoderContext);
        } catch (CodecConfigurationException e2) {
            throw new CodecConfigurationException(String.format("An exception occurred when encoding using the AutomaticPojoCodec.%nEncoding a %s: '%s' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type.", new Object[]{d().getSimpleName(), obj, e2.getMessage()}), e2);
        }
    }

    public Object b(BsonReader bsonReader, DecoderContext decoderContext) {
        try {
            return this.f43757a.b(bsonReader, decoderContext);
        } catch (CodecConfigurationException e2) {
            throw new CodecConfigurationException(String.format("An exception occurred when decoding using the AutomaticPojoCodec.%nDecoding into a '%s' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type.", new Object[]{this.f43757a.d().getSimpleName(), e2.getMessage()}), e2);
        }
    }

    public ClassModel c() {
        return this.f43757a.c();
    }

    public Class d() {
        return this.f43757a.d();
    }
}
