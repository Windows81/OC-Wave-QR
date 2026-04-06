package org.bson.codecs;

import org.bson.BsonReader;

public interface Decoder<T> {
    Object b(BsonReader bsonReader, DecoderContext decoderContext);
}
