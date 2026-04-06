package org.bson.json;

import org.bson.BsonMaxKey;

class ShellMaxKeyConverter implements Converter<BsonMaxKey> {
    /* renamed from: b */
    public void a(BsonMaxKey bsonMaxKey, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.c("MaxKey");
    }
}
