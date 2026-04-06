package org.bson.json;

class ExtendedJsonDoubleConverter implements Converter<Double> {
    /* renamed from: b */
    public void a(Double d2, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.A("$numberDouble");
        strictJsonWriter.p(Double.toString(d2.doubleValue()));
        strictJsonWriter.a();
    }
}
