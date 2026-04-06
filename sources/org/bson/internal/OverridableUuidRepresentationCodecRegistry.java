package org.bson.internal;

import org.bson.UuidRepresentation;
import org.bson.codecs.Codec;
import org.bson.codecs.OverridableUuidRepresentationCodec;
import org.bson.codecs.configuration.CodecProvider;

public class OverridableUuidRepresentationCodecRegistry implements CycleDetectingCodecRegistry {

    /* renamed from: a  reason: collision with root package name */
    public final CodecProvider f43894a;

    /* renamed from: b  reason: collision with root package name */
    public final CodecCache f43895b;

    /* renamed from: c  reason: collision with root package name */
    public final UuidRepresentation f43896c;

    public Codec a(Class cls) {
        return c(new ChildCodecRegistry((CycleDetectingCodecRegistry) this, cls));
    }

    public Codec c(ChildCodecRegistry childCodecRegistry) {
        if (!this.f43895b.a(childCodecRegistry.b())) {
            Codec b2 = this.f43894a.b(childCodecRegistry.b(), childCodecRegistry);
            if (b2 instanceof OverridableUuidRepresentationCodec) {
                b2 = ((OverridableUuidRepresentationCodec) b2).c(this.f43896c);
            }
            this.f43895b.c(childCodecRegistry.b(), b2);
        }
        return this.f43895b.b(childCodecRegistry.b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OverridableUuidRepresentationCodecRegistry overridableUuidRepresentationCodecRegistry = (OverridableUuidRepresentationCodecRegistry) obj;
        if (!this.f43894a.equals(overridableUuidRepresentationCodecRegistry.f43894a)) {
            return false;
        }
        return this.f43896c == overridableUuidRepresentationCodecRegistry.f43896c;
    }

    public int hashCode() {
        return (this.f43894a.hashCode() * 31) + this.f43896c.hashCode();
    }
}
