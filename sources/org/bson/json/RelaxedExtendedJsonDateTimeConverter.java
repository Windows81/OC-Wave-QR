package org.bson.json;

class RelaxedExtendedJsonDateTimeConverter implements Converter<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static final Converter f44004a = new ExtendedJsonDateTimeConverter();

    /* renamed from: b */
    public void a(Long l2, StrictJsonWriter strictJsonWriter) {
        if (l2.longValue() < 0 || l2.longValue() > 253402300799999L) {
            f44004a.a(l2, strictJsonWriter);
            return;
        }
        strictJsonWriter.f();
        strictJsonWriter.C("$date", DateTimeFormatter.a(l2.longValue()));
        strictJsonWriter.a();
    }
}
