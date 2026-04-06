package org.bson.codecs.jsr310;

import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecConfigurationException;

abstract class DateTimeBasedCodec<T> implements Codec<T> {
    public long c(BsonReader bsonReader) {
        BsonType C1 = bsonReader.C1();
        BsonType bsonType = BsonType.DATE_TIME;
        if (C1.equals(bsonType)) {
            return bsonReader.r0();
        }
        throw new CodecConfigurationException(String.format("Could not decode into %s, expected '%s' BsonType but got '%s'.", new Object[]{d().getSimpleName(), bsonType, C1}));
    }
}
