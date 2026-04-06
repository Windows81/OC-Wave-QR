package com.google.gson;

import java.lang.reflect.Type;

public interface JsonDeserializer<T> {
    Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext);
}
