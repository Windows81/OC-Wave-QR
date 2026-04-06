package org.bson.codecs.pojo;

import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;

final class FallbackPropertyCodecProvider implements PropertyCodecProvider {

    /* renamed from: a  reason: collision with root package name */
    public final CodecRegistry f43801a;

    /* renamed from: b  reason: collision with root package name */
    public final PojoCodec f43802b;

    public FallbackPropertyCodecProvider(PojoCodec pojoCodec, CodecRegistry codecRegistry) {
        this.f43802b = pojoCodec;
        this.f43801a = codecRegistry;
    }

    public Codec a(TypeWithTypeParameters typeWithTypeParameters, PropertyCodecRegistry propertyCodecRegistry) {
        return typeWithTypeParameters.getType() == this.f43802b.d() ? this.f43802b : this.f43801a.a(typeWithTypeParameters.getType());
    }
}
