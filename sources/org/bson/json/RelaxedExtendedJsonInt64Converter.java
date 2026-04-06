package org.bson.json;

class RelaxedExtendedJsonInt64Converter implements Converter<Long> {
    /* renamed from: b */
    public void a(Long l2, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.g(Long.toString(l2.longValue()));
    }
}
