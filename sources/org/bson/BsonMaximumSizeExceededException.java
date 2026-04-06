package org.bson;

public class BsonMaximumSizeExceededException extends BsonSerializationException {
    public BsonMaximumSizeExceededException(String str) {
        super(str);
    }
}
