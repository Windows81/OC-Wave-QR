package com.google.gson;

import com.google.gson.reflect.TypeToken;

public interface TypeAdapterFactory {
    TypeAdapter b(Gson gson, TypeToken typeToken);
}
