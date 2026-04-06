package org.bson.codecs.configuration;

import org.bson.codecs.Codec;

public interface CodecRegistry {
    Codec a(Class cls);
}
