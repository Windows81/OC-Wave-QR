package org.bson.internal;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

class LazyCodec<T> implements Codec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CodecRegistry f43889a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f43890b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Codec f43891c;

    public LazyCodec(CodecRegistry codecRegistry, Class cls) {
        this.f43889a = codecRegistry;
        this.f43890b = cls;
    }

    public void a(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        c().a(bsonWriter, obj, encoderContext);
    }

    public Object b(BsonReader bsonReader, DecoderContext decoderContext) {
        return c().b(bsonReader, decoderContext);
    }

    public final Codec c() {
        if (this.f43891c == null) {
            this.f43891c = this.f43889a.a(this.f43890b);
        }
        return this.f43891c;
    }

    public Class d() {
        return this.f43890b;
    }
}
