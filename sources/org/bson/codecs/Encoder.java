package org.bson.codecs;

import org.bson.BsonWriter;

public interface Encoder<T> {
    void a(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext);

    Class d();
}
