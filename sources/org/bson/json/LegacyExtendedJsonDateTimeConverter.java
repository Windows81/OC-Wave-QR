package org.bson.json;

class LegacyExtendedJsonDateTimeConverter implements Converter<Long> {
    /* renamed from: b */
    public void a(Long l2, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.d("$date", Long.toString(l2.longValue()));
        strictJsonWriter.a();
    }
}
