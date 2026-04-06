package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final TypeAdapterFactory f31782c = f(ToNumberPolicy.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    public final Gson f31783a;

    /* renamed from: b  reason: collision with root package name */
    public final ToNumberStrategy f31784b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31786a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31786a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31786a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31786a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31786a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31786a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31786a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.<clinit>():void");
        }
    }

    public static TypeAdapterFactory e(ToNumberStrategy toNumberStrategy) {
        return toNumberStrategy == ToNumberPolicy.DOUBLE ? f31782c : f(toNumberStrategy);
    }

    private static TypeAdapterFactory f(final ToNumberStrategy toNumberStrategy) {
        return new TypeAdapterFactory() {
            public TypeAdapter b(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(gson, ToNumberStrategy.this);
                }
                return null;
            }
        };
    }

    public Object b(JsonReader jsonReader) {
        JsonToken S = jsonReader.S();
        Object h2 = h(jsonReader, S);
        if (h2 == null) {
            return g(jsonReader, S);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.t()) {
                String G = h2 instanceof Map ? jsonReader.G() : null;
                JsonToken S2 = jsonReader.S();
                Object h3 = h(jsonReader, S2);
                boolean z2 = h3 != null;
                if (h3 == null) {
                    h3 = g(jsonReader, S2);
                }
                if (h2 instanceof List) {
                    ((List) h2).add(h3);
                } else {
                    ((Map) h2).put(G, h3);
                }
                if (z2) {
                    arrayDeque.addLast(h2);
                    h2 = h3;
                }
            } else {
                if (h2 instanceof List) {
                    jsonReader.g();
                } else {
                    jsonReader.j();
                }
                if (arrayDeque.isEmpty()) {
                    return h2;
                }
                h2 = arrayDeque.removeLast();
            }
        }
    }

    public void d(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.y();
            return;
        }
        TypeAdapter m2 = this.f31783a.m(obj.getClass());
        if (m2 instanceof ObjectTypeAdapter) {
            jsonWriter.d();
            jsonWriter.j();
            return;
        }
        m2.d(jsonWriter, obj);
    }

    public final Object g(JsonReader jsonReader, JsonToken jsonToken) {
        int i2 = AnonymousClass2.f31786a[jsonToken.ordinal()];
        if (i2 == 3) {
            return jsonReader.O();
        }
        if (i2 == 4) {
            return this.f31784b.d(jsonReader);
        }
        if (i2 == 5) {
            return Boolean.valueOf(jsonReader.C());
        }
        if (i2 == 6) {
            jsonReader.I();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    public final Object h(JsonReader jsonReader, JsonToken jsonToken) {
        int i2 = AnonymousClass2.f31786a[jsonToken.ordinal()];
        if (i2 == 1) {
            jsonReader.a();
            return new ArrayList();
        } else if (i2 != 2) {
            return null;
        } else {
            jsonReader.b();
            return new LinkedTreeMap();
        }
    }

    public ObjectTypeAdapter(Gson gson, ToNumberStrategy toNumberStrategy) {
        this.f31783a = gson;
        this.f31784b = toNumberStrategy;
    }
}
