package org.bson.json;

class JsonSymbolConverter implements Converter<String> {
    /* renamed from: b */
    public void a(String str, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.C("$symbol", str);
        strictJsonWriter.a();
    }
}
