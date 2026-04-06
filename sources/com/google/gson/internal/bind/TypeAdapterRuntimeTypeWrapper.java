package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f31822a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter f31823b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f31824c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f31822a = gson;
        this.f31823b = typeAdapter;
        this.f31824c = type;
    }

    public static Type e(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    public static boolean f(TypeAdapter typeAdapter) {
        TypeAdapter e2;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (e2 = ((SerializationDelegatingTypeAdapter) typeAdapter).e()) != typeAdapter) {
            typeAdapter = e2;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    public Object b(JsonReader jsonReader) {
        return this.f31823b.b(jsonReader);
    }

    public void d(JsonWriter jsonWriter, Object obj) {
        TypeAdapter typeAdapter = this.f31823b;
        Type e2 = e(this.f31824c, obj);
        if (e2 != this.f31824c) {
            typeAdapter = this.f31822a.l(TypeToken.get(e2));
            if ((typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !f(this.f31823b)) {
                typeAdapter = this.f31823b;
            }
        }
        typeAdapter.d(jsonWriter, obj);
    }
}
