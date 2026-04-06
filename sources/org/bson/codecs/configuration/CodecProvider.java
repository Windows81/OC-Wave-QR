package org.bson.codecs.configuration;

import org.bson.codecs.Codec;

public interface CodecProvider {
    Codec b(Class cls, CodecRegistry codecRegistry);
}
