package org.bson.json;

class ExtendedJsonInt32Converter implements Converter<Integer> {
    /* renamed from: b */
    public void a(Integer num, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.A("$numberInt");
        strictJsonWriter.p(Integer.toString(num.intValue()));
        strictJsonWriter.a();
    }
}
