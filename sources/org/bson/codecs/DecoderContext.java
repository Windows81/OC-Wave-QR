package org.bson.codecs;

import org.bson.BsonReader;

public final class DecoderContext {

    /* renamed from: b  reason: collision with root package name */
    public static final DecoderContext f43715b = a().a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f43716a;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f43717a;

        public DecoderContext a() {
            return new DecoderContext(this);
        }

        public Builder b(boolean z2) {
            this.f43717a = z2;
            return this;
        }

        public boolean c() {
            return this.f43717a;
        }

        public Builder() {
        }
    }

    public static Builder a() {
        return new Builder();
    }

    public Object b(Decoder decoder, BsonReader bsonReader) {
        return decoder.b(bsonReader, f43715b);
    }

    public boolean c() {
        return this.f43716a;
    }

    public DecoderContext(Builder builder) {
        this.f43716a = builder.c();
    }
}
