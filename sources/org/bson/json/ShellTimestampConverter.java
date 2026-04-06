package org.bson.json;

import org.bson.BsonTimestamp;

class ShellTimestampConverter implements Converter<BsonTimestamp> {
    /* renamed from: b */
    public void a(BsonTimestamp bsonTimestamp, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.c(String.format("Timestamp(%d, %d)", new Object[]{Integer.valueOf(bsonTimestamp.q0()), Integer.valueOf(bsonTimestamp.p0())}));
    }
}
