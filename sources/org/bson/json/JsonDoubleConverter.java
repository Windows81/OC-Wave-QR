package org.bson.json;

class JsonDoubleConverter implements Converter<Double> {
    /* renamed from: b */
    public void a(Double d2, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.g(Double.toString(d2.doubleValue()));
    }
}
