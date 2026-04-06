package org.bson.codecs;

import org.bson.BsonWriter;

public final class EncoderContext {

    /* renamed from: b  reason: collision with root package name */
    public static final EncoderContext f43728b = a().b();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f43729a;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f43730a;

        public EncoderContext b() {
            return new EncoderContext(this);
        }

        public Builder() {
        }
    }

    public static Builder a() {
        return new Builder();
    }

    public void b(Encoder encoder, BsonWriter bsonWriter, Object obj) {
        encoder.a(bsonWriter, obj, f43728b);
    }

    public EncoderContext c() {
        return f43728b;
    }

    public boolean d() {
        return this.f43729a;
    }

    public EncoderContext(Builder builder) {
        this.f43729a = builder.f43730a;
    }
}
