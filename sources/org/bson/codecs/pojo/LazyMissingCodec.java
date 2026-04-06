package org.bson.codecs.pojo;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

class LazyMissingCodec<S> implements Codec<S> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f43813a;

    /* renamed from: b  reason: collision with root package name */
    public final CodecConfigurationException f43814b;

    public LazyMissingCodec(Class cls, CodecConfigurationException codecConfigurationException) {
        this.f43813a = cls;
        this.f43814b = codecConfigurationException;
    }

    public void a(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        throw this.f43814b;
    }

    public Object b(BsonReader bsonReader, DecoderContext decoderContext) {
        throw this.f43814b;
    }

    public Class d() {
        return this.f43813a;
    }
}
