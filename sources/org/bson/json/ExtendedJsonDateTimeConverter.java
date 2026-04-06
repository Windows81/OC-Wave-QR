package org.bson.json;

class ExtendedJsonDateTimeConverter implements Converter<Long> {
    /* renamed from: b */
    public void a(Long l2, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.b("$date");
        strictJsonWriter.C("$numberLong", Long.toString(l2.longValue()));
        strictJsonWriter.a();
        strictJsonWriter.a();
    }
}
