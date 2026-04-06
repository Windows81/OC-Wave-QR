package org.bson.codecs.pojo;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.configuration.CodecRegistry;

final class EnumPropertyCodecProvider implements PropertyCodecProvider {

    /* renamed from: a  reason: collision with root package name */
    public final CodecRegistry f43799a;

    public static class EnumCodec<T extends Enum<T>> implements Codec<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class f43800a;

        public EnumCodec(Class cls) {
            this.f43800a = cls;
        }

        /* renamed from: c */
        public Enum b(BsonReader bsonReader, DecoderContext decoderContext) {
            return Enum.valueOf(this.f43800a, bsonReader.h());
        }

        public Class d() {
            return this.f43800a;
        }

        /* renamed from: e */
        public void a(BsonWriter bsonWriter, Enum enumR, EncoderContext encoderContext) {
            bsonWriter.p(enumR.name());
        }
    }

    public EnumPropertyCodecProvider(CodecRegistry codecRegistry) {
        this.f43799a = codecRegistry;
    }

    public Codec a(TypeWithTypeParameters typeWithTypeParameters, PropertyCodecRegistry propertyCodecRegistry) {
        Class type = typeWithTypeParameters.getType();
        if (!Enum.class.isAssignableFrom(type)) {
            return null;
        }
        try {
            return this.f43799a.a(type);
        } catch (CodecConfigurationException unused) {
            return new EnumCodec(type);
        }
    }
}
