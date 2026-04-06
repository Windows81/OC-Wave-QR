package org.bson.json;

import org.bson.BsonUndefined;

class ExtendedJsonUndefinedConverter implements Converter<BsonUndefined> {
    /* renamed from: b */
    public void a(BsonUndefined bsonUndefined, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.e("$undefined", true);
        strictJsonWriter.a();
    }
}
