package org.bson.json;

import org.bson.BsonMinKey;

class ExtendedJsonMinKeyConverter implements Converter<BsonMinKey> {
    /* renamed from: b */
    public void a(BsonMinKey bsonMinKey, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.d("$minKey", "1");
        strictJsonWriter.a();
    }
}
