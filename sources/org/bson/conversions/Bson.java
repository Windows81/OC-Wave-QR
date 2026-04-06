package org.bson.conversions;

import org.bson.BsonDocument;
import org.bson.codecs.configuration.CodecRegistry;

public interface Bson {
    BsonDocument h(Class cls, CodecRegistry codecRegistry);
}
