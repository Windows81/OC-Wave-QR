package org.bson.json;

class ExtendedJsonInt64Converter implements Converter<Long> {
    /* renamed from: b */
    public void a(Long l2, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.A("$numberLong");
        strictJsonWriter.p(Long.toString(l2.longValue()));
        strictJsonWriter.a();
    }
}
