package org.bson.json;

import org.bson.BsonBinary;
import org.bson.internal.Base64;

class ExtendedJsonBinaryConverter implements Converter<BsonBinary> {
    /* renamed from: b */
    public void a(BsonBinary bsonBinary, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.b("$binary");
        strictJsonWriter.C("base64", Base64.c(bsonBinary.p0()));
        strictJsonWriter.C("subType", String.format("%02X", new Object[]{Byte.valueOf(bsonBinary.q0())}));
        strictJsonWriter.a();
        strictJsonWriter.a();
    }
}
