package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final TypeAdapterFactory f31758c = new TypeAdapterFactory() {
        public TypeAdapter b(Gson gson, TypeToken typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g2 = C$Gson$Types.g(type);
            return new ArrayTypeAdapter(gson, gson.l(TypeToken.get(g2)), C$Gson$Types.k(g2));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Class f31759a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter f31760b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.f31760b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f31759a = cls;
    }

    public Object b(JsonReader jsonReader) {
        if (jsonReader.S() == JsonToken.NULL) {
            jsonReader.I();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.a();
        while (jsonReader.t()) {
            arrayList.add(this.f31760b.b(jsonReader));
        }
        jsonReader.g();
        int size = arrayList.size();
        if (!this.f31759a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance(this.f31759a, size));
        }
        Object newInstance = Array.newInstance(this.f31759a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    public void d(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.y();
            return;
        }
        jsonWriter.c();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f31760b.d(jsonWriter, Array.get(obj, i2));
        }
        jsonWriter.g();
    }
}
