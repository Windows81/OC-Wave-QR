package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f31772A;

    /* renamed from: z  reason: collision with root package name */
    public final ConstructorConstructor f31773z;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter f31774a;

        /* renamed from: b  reason: collision with root package name */
        public final TypeAdapter f31775b;

        /* renamed from: c  reason: collision with root package name */
        public final ObjectConstructor f31776c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, ObjectConstructor objectConstructor) {
            this.f31774a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f31775b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f31776c = objectConstructor;
        }

        public final String e(JsonElement jsonElement) {
            if (jsonElement.o()) {
                JsonPrimitive h2 = jsonElement.h();
                if (h2.B()) {
                    return String.valueOf(h2.v());
                }
                if (h2.z()) {
                    return Boolean.toString(h2.p());
                }
                if (h2.C()) {
                    return h2.w();
                }
                throw new AssertionError();
            } else if (jsonElement.m()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        public Map b(JsonReader jsonReader) {
            JsonToken S = jsonReader.S();
            if (S == JsonToken.NULL) {
                jsonReader.I();
                return null;
            }
            Map map = (Map) this.f31776c.a();
            if (S == JsonToken.BEGIN_ARRAY) {
                jsonReader.a();
                while (jsonReader.t()) {
                    jsonReader.a();
                    Object b2 = this.f31774a.b(jsonReader);
                    if (map.put(b2, this.f31775b.b(jsonReader)) == null) {
                        jsonReader.g();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + b2);
                    }
                }
                jsonReader.g();
            } else {
                jsonReader.b();
                while (jsonReader.t()) {
                    JsonReaderInternalAccess.f31732a.a(jsonReader);
                    Object b3 = this.f31774a.b(jsonReader);
                    if (map.put(b3, this.f31775b.b(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + b3);
                    }
                }
                jsonReader.j();
            }
            return map;
        }

        /* renamed from: g */
        public void d(JsonWriter jsonWriter, Map map) {
            if (map == null) {
                jsonWriter.y();
            } else if (!MapTypeAdapterFactory.this.f31772A) {
                jsonWriter.d();
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.t(String.valueOf(entry.getKey()));
                    this.f31775b.d(jsonWriter, entry.getValue());
                }
                jsonWriter.j();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z2 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    JsonElement c2 = this.f31774a.c(entry2.getKey());
                    arrayList.add(c2);
                    arrayList2.add(entry2.getValue());
                    z2 |= c2.i() || c2.n();
                }
                if (z2) {
                    jsonWriter.c();
                    int size = arrayList.size();
                    while (i2 < size) {
                        jsonWriter.c();
                        Streams.b((JsonElement) arrayList.get(i2), jsonWriter);
                        this.f31775b.d(jsonWriter, arrayList2.get(i2));
                        jsonWriter.g();
                        i2++;
                    }
                    jsonWriter.g();
                    return;
                }
                jsonWriter.d();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    jsonWriter.t(e((JsonElement) arrayList.get(i2)));
                    this.f31775b.d(jsonWriter, arrayList2.get(i2));
                    i2++;
                }
                jsonWriter.j();
            }
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z2) {
        this.f31773z = constructorConstructor;
        this.f31772A = z2;
    }

    public final TypeAdapter a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f31832f : gson.l(TypeToken.get(type));
    }

    public TypeAdapter b(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] j2 = C$Gson$Types.j(type, rawType);
        return new Adapter(gson, j2[0], a(gson, j2[0]), j2[1], gson.l(TypeToken.get(j2[1])), this.f31773z.b(typeToken));
    }
}
