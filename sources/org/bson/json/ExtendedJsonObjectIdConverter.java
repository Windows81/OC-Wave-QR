package org.bson.json;

import org.bson.types.ObjectId;

class ExtendedJsonObjectIdConverter implements Converter<ObjectId> {
    /* renamed from: b */
    public void a(ObjectId objectId, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.C("$oid", objectId.A());
        strictJsonWriter.a();
    }
}
