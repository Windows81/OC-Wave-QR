package org.bson.json;

class JsonBooleanConverter implements Converter<Boolean> {
    /* renamed from: b */
    public void a(Boolean bool, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeBoolean(bool.booleanValue());
    }
}
