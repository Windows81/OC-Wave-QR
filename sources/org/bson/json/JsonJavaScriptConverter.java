package org.bson.json;

class JsonJavaScriptConverter implements Converter<String> {
    /* renamed from: b */
    public void a(String str, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.C("$code", str);
        strictJsonWriter.a();
    }
}
