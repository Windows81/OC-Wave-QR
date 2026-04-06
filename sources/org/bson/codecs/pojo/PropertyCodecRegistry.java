package org.bson.codecs.pojo;

import org.bson.codecs.Codec;

public interface PropertyCodecRegistry {
    Codec a(TypeWithTypeParameters typeWithTypeParameters);
}
