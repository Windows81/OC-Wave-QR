package org.bson.json;

import org.bson.BsonMaxKey;

class ExtendedJsonMaxKeyConverter implements Converter<BsonMaxKey> {
    /* renamed from: b */
    public void a(BsonMaxKey bsonMaxKey, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.d("$maxKey", "1");
        strictJsonWriter.a();
    }
}
