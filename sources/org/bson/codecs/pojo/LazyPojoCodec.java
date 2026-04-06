package org.bson.codecs.pojo;

import java.util.concurrent.ConcurrentMap;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

class LazyPojoCodec<T> extends PojoCodec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ClassModel f43815a;

    /* renamed from: b  reason: collision with root package name */
    public final CodecRegistry f43816b;

    /* renamed from: c  reason: collision with root package name */
    public final PropertyCodecRegistry f43817c;

    /* renamed from: d  reason: collision with root package name */
    public final DiscriminatorLookup f43818d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentMap f43819e;

    /* renamed from: f  reason: collision with root package name */
    public volatile PojoCodecImpl f43820f;

    public LazyPojoCodec(ClassModel classModel, CodecRegistry codecRegistry, PropertyCodecRegistry propertyCodecRegistry, DiscriminatorLookup discriminatorLookup, ConcurrentMap concurrentMap) {
        this.f43815a = classModel;
        this.f43816b = codecRegistry;
        this.f43817c = propertyCodecRegistry;
        this.f43818d = discriminatorLookup;
        this.f43819e = concurrentMap;
    }

    public void a(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        e().a(bsonWriter, obj, encoderContext);
    }

    public Object b(BsonReader bsonReader, DecoderContext decoderContext) {
        return e().b(bsonReader, decoderContext);
    }

    public ClassModel c() {
        return this.f43815a;
    }

    public Class d() {
        return this.f43815a.l();
    }

    public final Codec e() {
        if (this.f43820f == null) {
            this.f43820f = new PojoCodecImpl(this.f43815a, this.f43816b, this.f43817c, this.f43818d, this.f43819e, true);
        }
        return this.f43820f;
    }
}
