package org.bson.json;

class JsonInt32Converter implements Converter<Integer> {
    /* renamed from: b */
    public void a(Integer num, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.g(Integer.toString(num.intValue()));
    }
}
