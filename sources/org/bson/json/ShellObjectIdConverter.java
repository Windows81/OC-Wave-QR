package org.bson.json;

import org.bson.types.ObjectId;

class ShellObjectIdConverter implements Converter<ObjectId> {
    /* renamed from: b */
    public void a(ObjectId objectId, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.c(String.format("ObjectId(\"%s\")", new Object[]{objectId.A()}));
    }
}
