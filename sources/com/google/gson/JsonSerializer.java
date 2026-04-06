package com.google.gson;

import java.lang.reflect.Type;

public interface JsonSerializer<T> {
    JsonElement a(Object obj, Type type, JsonSerializationContext jsonSerializationContext);
}
