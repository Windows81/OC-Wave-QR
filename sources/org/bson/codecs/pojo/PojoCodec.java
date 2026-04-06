package org.bson.codecs.pojo;

import org.bson.codecs.Codec;

abstract class PojoCodec<T> implements Codec<T> {
    public abstract ClassModel c();
}
