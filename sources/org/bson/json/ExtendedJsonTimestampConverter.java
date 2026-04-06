package org.bson.json;

import org.bson.BsonTimestamp;
import org.bson.internal.UnsignedLongs;

class ExtendedJsonTimestampConverter implements Converter<BsonTimestamp> {
    /* renamed from: b */
    public void a(BsonTimestamp bsonTimestamp, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.b("$timestamp");
        strictJsonWriter.d("t", UnsignedLongs.e(c(bsonTimestamp.q0())));
        strictJsonWriter.d("i", UnsignedLongs.e(c(bsonTimestamp.p0())));
        strictJsonWriter.a();
        strictJsonWriter.a();
    }

    public final long c(int i2) {
        return ((long) i2) & 4294967295L;
    }
}
