package org.bson.json;

class RelaxedExtendedJsonDoubleConverter implements Converter<Double> {

    /* renamed from: a  reason: collision with root package name */
    public static final Converter f44005a = new ExtendedJsonDoubleConverter();

    /* renamed from: b */
    public void a(Double d2, StrictJsonWriter strictJsonWriter) {
        if (d2.isNaN() || d2.isInfinite()) {
            f44005a.a(d2, strictJsonWriter);
        } else {
            strictJsonWriter.g(Double.toString(d2.doubleValue()));
        }
    }
}
