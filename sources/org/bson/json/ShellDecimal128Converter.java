package org.bson.json;

import org.bson.types.Decimal128;

class ShellDecimal128Converter implements Converter<Decimal128> {
    /* renamed from: b */
    public void a(Decimal128 decimal128, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.c(String.format("NumberDecimal(\"%s\")", new Object[]{decimal128.toString()}));
    }
}
