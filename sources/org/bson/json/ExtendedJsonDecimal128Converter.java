package org.bson.json;

import org.bson.types.Decimal128;

class ExtendedJsonDecimal128Converter implements Converter<Decimal128> {
    /* renamed from: b */
    public void a(Decimal128 decimal128, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.A("$numberDecimal");
        strictJsonWriter.p(decimal128.toString());
        strictJsonWriter.a();
    }
}
