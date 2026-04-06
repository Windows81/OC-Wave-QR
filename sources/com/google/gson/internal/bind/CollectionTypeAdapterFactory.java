package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: z  reason: collision with root package name */
    public final ConstructorConstructor f31761z;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter f31762a;

        /* renamed from: b  reason: collision with root package name */
        public final ObjectConstructor f31763b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, ObjectConstructor objectConstructor) {
            this.f31762a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f31763b = objectConstructor;
        }

        /* renamed from: e */
        public Collection b(JsonReader jsonReader) {
            if (jsonReader.S() == JsonToken.NULL) {
                jsonReader.I();
                return null;
            }
            Collection collection = (Collection) this.f31763b.a();
            jsonReader.a();
            while (jsonReader.t()) {
                collection.add(this.f31762a.b(jsonReader));
            }
            jsonReader.g();
            return collection;
        }

        /* renamed from: f */
        public void d(JsonWriter jsonWriter, Collection collection) {
            if (collection == null) {
                jsonWriter.y();
                return;
            }
            jsonWriter.c();
            for (Object d2 : collection) {
                this.f31762a.d(jsonWriter, d2);
            }
            jsonWriter.g();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.f31761z = constructorConstructor;
    }

    public TypeAdapter b(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h2 = C$Gson$Types.h(type, rawType);
        return new Adapter(gson, h2, gson.l(TypeToken.get(h2)), this.f31761z.b(typeToken));
    }
}
