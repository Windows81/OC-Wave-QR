package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final JsonSerializer f31810a;

    /* renamed from: b  reason: collision with root package name */
    public final JsonDeserializer f31811b;

    /* renamed from: c  reason: collision with root package name */
    public final Gson f31812c;

    /* renamed from: d  reason: collision with root package name */
    public final TypeToken f31813d;

    /* renamed from: e  reason: collision with root package name */
    public final TypeAdapterFactory f31814e;

    /* renamed from: f  reason: collision with root package name */
    public final GsonContextImpl f31815f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f31816g;

    /* renamed from: h  reason: collision with root package name */
    public volatile TypeAdapter f31817h;

    public final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
        public GsonContextImpl() {
        }
    }

    public static final class SingleTypeFactory implements TypeAdapterFactory {

        /* renamed from: A  reason: collision with root package name */
        public final boolean f31819A;

        /* renamed from: B  reason: collision with root package name */
        public final Class f31820B;
        public final JsonSerializer C;
        public final JsonDeserializer D;

        /* renamed from: z  reason: collision with root package name */
        public final TypeToken f31821z;

        public TypeAdapter b(Gson gson, TypeToken typeToken) {
            TypeToken typeToken2 = this.f31821z;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.f31819A && this.f31821z.getType() == typeToken.getRawType()) : this.f31820B.isAssignableFrom(typeToken.getRawType())) {
                return new TreeTypeAdapter(this.C, this.D, gson, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(JsonSerializer jsonSerializer, JsonDeserializer jsonDeserializer, Gson gson, TypeToken typeToken, TypeAdapterFactory typeAdapterFactory, boolean z2) {
        this.f31815f = new GsonContextImpl();
        this.f31810a = jsonSerializer;
        this.f31811b = jsonDeserializer;
        this.f31812c = gson;
        this.f31813d = typeToken;
        this.f31814e = typeAdapterFactory;
        this.f31816g = z2;
    }

    private TypeAdapter f() {
        TypeAdapter typeAdapter = this.f31817h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter n2 = this.f31812c.n(this.f31814e, this.f31813d);
        this.f31817h = n2;
        return n2;
    }

    public Object b(JsonReader jsonReader) {
        if (this.f31811b == null) {
            return f().b(jsonReader);
        }
        JsonElement a2 = Streams.a(jsonReader);
        if (!this.f31816g || !a2.m()) {
            return this.f31811b.a(a2, this.f31813d.getType(), this.f31815f);
        }
        return null;
    }

    public void d(JsonWriter jsonWriter, Object obj) {
        JsonSerializer jsonSerializer = this.f31810a;
        if (jsonSerializer == null) {
            f().d(jsonWriter, obj);
        } else if (!this.f31816g || obj != null) {
            Streams.b(jsonSerializer.a(obj, this.f31813d.getType(), this.f31815f), jsonWriter);
        } else {
            jsonWriter.y();
        }
    }

    public TypeAdapter e() {
        return this.f31810a != null ? this : f();
    }

    public TreeTypeAdapter(JsonSerializer jsonSerializer, JsonDeserializer jsonDeserializer, Gson gson, TypeToken typeToken, TypeAdapterFactory typeAdapterFactory) {
        this(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, true);
    }
}
