package org.bson.json;

import org.bson.BsonBinary;
import org.bson.internal.Base64;

class LegacyExtendedJsonBinaryConverter implements Converter<BsonBinary> {
    /* renamed from: b */
    public void a(BsonBinary bsonBinary, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.C("$binary", Base64.c(bsonBinary.p0()));
        strictJsonWriter.C("$type", String.format("%02X", new Object[]{Byte.valueOf(bsonBinary.q0())}));
        strictJsonWriter.a();
    }
}
