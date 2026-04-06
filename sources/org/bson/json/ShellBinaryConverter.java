package org.bson.json;

import org.bson.BsonBinary;
import org.bson.internal.Base64;

class ShellBinaryConverter implements Converter<BsonBinary> {
    /* renamed from: b */
    public void a(BsonBinary bsonBinary, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.c(String.format("new BinData(%s, \"%s\")", new Object[]{Integer.toString(bsonBinary.q0() & 255), Base64.c(bsonBinary.p0())}));
    }
}
