package org.bson.json;

import org.bson.BsonMinKey;

class ShellMinKeyConverter implements Converter<BsonMinKey> {
    /* renamed from: b */
    public void a(BsonMinKey bsonMinKey, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.c("MinKey");
    }
}
