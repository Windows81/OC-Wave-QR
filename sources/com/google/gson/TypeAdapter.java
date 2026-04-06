package com.google.gson;

import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public abstract class TypeAdapter<T> {
    public final TypeAdapter a() {
        return new TypeAdapter<T>() {
            public Object b(JsonReader jsonReader) {
                if (jsonReader.S() != JsonToken.NULL) {
                    return TypeAdapter.this.b(jsonReader);
                }
                jsonReader.I();
                return null;
            }

            public void d(JsonWriter jsonWriter, Object obj) {
                if (obj == null) {
                    jsonWriter.y();
                } else {
                    TypeAdapter.this.d(jsonWriter, obj);
                }
            }
        };
    }

    public abstract Object b(JsonReader jsonReader);

    public final JsonElement c(Object obj) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            d(jsonTreeWriter, obj);
            return jsonTreeWriter.f0();
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public abstract void d(JsonWriter jsonWriter, Object obj);
}
