package org.bson.codecs.pojo;

import org.bson.codecs.Codec;

public interface PropertyCodecProvider {
    Codec a(TypeWithTypeParameters typeWithTypeParameters, PropertyCodecRegistry propertyCodecRegistry);
}
