package org.bson.codecs;

import java.util.UUID;
import org.bson.UuidRepresentation;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

public class UuidCodecProvider implements CodecProvider {

    /* renamed from: a  reason: collision with root package name */
    public UuidRepresentation f43752a;

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        if (cls == UUID.class) {
            return new UuidCodec(this.f43752a);
        }
        return null;
    }
}
