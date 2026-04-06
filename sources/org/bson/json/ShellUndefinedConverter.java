package org.bson.json;

import org.bson.BsonUndefined;

class ShellUndefinedConverter implements Converter<BsonUndefined> {
    /* renamed from: b */
    public void a(BsonUndefined bsonUndefined, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.c("undefined");
    }
}
