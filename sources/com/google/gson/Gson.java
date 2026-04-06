package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {

    /* renamed from: A  reason: collision with root package name */
    public static final FieldNamingStrategy f31624A = FieldNamingPolicy.IDENTITY;

    /* renamed from: B  reason: collision with root package name */
    public static final ToNumberStrategy f31625B = ToNumberPolicy.DOUBLE;
    public static final ToNumberStrategy C = ToNumberPolicy.LAZILY_PARSED_NUMBER;

    /* renamed from: z  reason: collision with root package name */
    public static final String f31626z = null;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f31627a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap f31628b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstructorConstructor f31629c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f31630d;

    /* renamed from: e  reason: collision with root package name */
    public final List f31631e;

    /* renamed from: f  reason: collision with root package name */
    public final Excluder f31632f;

    /* renamed from: g  reason: collision with root package name */
    public final FieldNamingStrategy f31633g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f31634h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f31635i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f31636j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f31637k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f31638l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f31639m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f31640n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f31641o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f31642p;

    /* renamed from: q  reason: collision with root package name */
    public final String f31643q;

    /* renamed from: r  reason: collision with root package name */
    public final int f31644r;

    /* renamed from: s  reason: collision with root package name */
    public final int f31645s;

    /* renamed from: t  reason: collision with root package name */
    public final LongSerializationPolicy f31646t;

    /* renamed from: u  reason: collision with root package name */
    public final List f31647u;

    /* renamed from: v  reason: collision with root package name */
    public final List f31648v;

    /* renamed from: w  reason: collision with root package name */
    public final ToNumberStrategy f31649w;

    /* renamed from: x  reason: collision with root package name */
    public final ToNumberStrategy f31650x;

    /* renamed from: y  reason: collision with root package name */
    public final List f31651y;

    public static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public TypeAdapter f31656a = null;

        private TypeAdapter f() {
            TypeAdapter typeAdapter = this.f31656a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public Object b(JsonReader jsonReader) {
            return f().b(jsonReader);
        }

        public void d(JsonWriter jsonWriter, Object obj) {
            f().d(jsonWriter, obj);
        }

        public TypeAdapter e() {
            return f();
        }

        public void g(TypeAdapter typeAdapter) {
            if (this.f31656a == null) {
                this.f31656a = typeAdapter;
                return;
            }
            throw new AssertionError("Delegate is already set");
        }
    }

    public Gson() {
        this(Excluder.F, f31624A, Collections.emptyMap(), false, false, false, true, false, false, false, true, LongSerializationPolicy.DEFAULT, f31626z, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f31625B, C, Collections.emptyList());
    }

    public static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.S() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IOException e3) {
                throw new JsonIOException((Throwable) e3);
            }
        }
    }

    public static TypeAdapter b(final TypeAdapter typeAdapter) {
        return new TypeAdapter<AtomicLong>() {
            /* renamed from: e */
            public AtomicLong b(JsonReader jsonReader) {
                return new AtomicLong(((Number) TypeAdapter.this.b(jsonReader)).longValue());
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicLong atomicLong) {
                TypeAdapter.this.d(jsonWriter, Long.valueOf(atomicLong.get()));
            }
        }.a();
    }

    public static TypeAdapter c(final TypeAdapter typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() {
            /* renamed from: e */
            public AtomicLongArray b(JsonReader jsonReader) {
                ArrayList arrayList = new ArrayList();
                jsonReader.a();
                while (jsonReader.t()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.b(jsonReader)).longValue()));
                }
                jsonReader.g();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) {
                jsonWriter.c();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    TypeAdapter.this.d(jsonWriter, Long.valueOf(atomicLongArray.get(i2)));
                }
                jsonWriter.g();
            }
        }.a();
    }

    public static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static TypeAdapter o(LongSerializationPolicy longSerializationPolicy) {
        return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? TypeAdapters.f31846t : new TypeAdapter<Number>() {
            /* renamed from: e */
            public Number b(JsonReader jsonReader) {
                if (jsonReader.S() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.F());
                }
                jsonReader.I();
                return null;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) {
                if (number == null) {
                    jsonWriter.y();
                } else {
                    jsonWriter.X(number.toString());
                }
            }
        };
    }

    public final TypeAdapter e(boolean z2) {
        return z2 ? TypeAdapters.f31848v : new TypeAdapter<Number>() {
            /* renamed from: e */
            public Double b(JsonReader jsonReader) {
                if (jsonReader.S() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.D());
                }
                jsonReader.I();
                return null;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) {
                if (number == null) {
                    jsonWriter.y();
                    return;
                }
                double doubleValue = number.doubleValue();
                Gson.d(doubleValue);
                jsonWriter.O(doubleValue);
            }
        };
    }

    public final TypeAdapter f(boolean z2) {
        return z2 ? TypeAdapters.f31847u : new TypeAdapter<Number>() {
            /* renamed from: e */
            public Float b(JsonReader jsonReader) {
                if (jsonReader.S() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.D());
                }
                jsonReader.I();
                return null;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) {
                if (number == null) {
                    jsonWriter.y();
                    return;
                }
                float floatValue = number.floatValue();
                Gson.d((double) floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                jsonWriter.T(number);
            }
        };
    }

    public Object g(JsonReader jsonReader, TypeToken typeToken) {
        boolean x2 = jsonReader.x();
        jsonReader.f0(true);
        try {
            jsonReader.S();
            Object b2 = l(typeToken).b(jsonReader);
            jsonReader.f0(x2);
            return b2;
        } catch (EOFException e2) {
            if (1 != 0) {
                jsonReader.f0(x2);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IllegalStateException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (IOException e4) {
            throw new JsonSyntaxException((Throwable) e4);
        } catch (AssertionError e5) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e5.getMessage(), e5);
        } catch (Throwable th) {
            jsonReader.f0(x2);
            throw th;
        }
    }

    public Object h(Reader reader, TypeToken typeToken) {
        JsonReader p2 = p(reader);
        Object g2 = g(p2, typeToken);
        a(g2, p2);
        return g2;
    }

    public Object i(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        return h(new StringReader(str), typeToken);
    }

    public Object j(String str, Class cls) {
        return Primitives.b(cls).cast(i(str, TypeToken.get(cls)));
    }

    public Object k(String str, Type type) {
        return i(str, TypeToken.get(type));
    }

    public TypeAdapter l(TypeToken typeToken) {
        boolean z2;
        Objects.requireNonNull(typeToken, "type must not be null");
        TypeAdapter typeAdapter = (TypeAdapter) this.f31628b.get(typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map map = (Map) this.f31627a.get();
        if (map == null) {
            map = new HashMap();
            this.f31627a.set(map);
            z2 = true;
        } else {
            TypeAdapter typeAdapter2 = (TypeAdapter) map.get(typeToken);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z2 = false;
        }
        try {
            FutureTypeAdapter futureTypeAdapter = new FutureTypeAdapter();
            map.put(typeToken, futureTypeAdapter);
            Iterator it = this.f31631e.iterator();
            TypeAdapter typeAdapter3 = null;
            while (true) {
                if (it.hasNext()) {
                    typeAdapter3 = ((TypeAdapterFactory) it.next()).b(this, typeToken);
                    if (typeAdapter3 != null) {
                        futureTypeAdapter.g(typeAdapter3);
                        map.put(typeToken, typeAdapter3);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (typeAdapter3 != null) {
                if (z2) {
                    this.f31628b.putAll(map);
                }
                return typeAdapter3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } finally {
            if (z2) {
                this.f31627a.remove();
            }
        }
    }

    public TypeAdapter m(Class cls) {
        return l(TypeToken.get(cls));
    }

    public TypeAdapter n(TypeAdapterFactory typeAdapterFactory, TypeToken typeToken) {
        if (!this.f31631e.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.f31630d;
        }
        boolean z2 = false;
        for (TypeAdapterFactory typeAdapterFactory2 : this.f31631e) {
            if (z2) {
                TypeAdapter b2 = typeAdapterFactory2.b(this, typeToken);
                if (b2 != null) {
                    return b2;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z2 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public JsonReader p(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.f0(this.f31640n);
        return jsonReader;
    }

    public JsonWriter q(Writer writer) {
        if (this.f31637k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f31639m) {
            jsonWriter.G("  ");
        }
        jsonWriter.F(this.f31638l);
        jsonWriter.H(this.f31640n);
        jsonWriter.I(this.f31635i);
        return jsonWriter;
    }

    public String r(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        v(jsonElement, stringWriter);
        return stringWriter.toString();
    }

    public String s(Object obj) {
        return obj == null ? r(JsonNull.f31678z) : t(obj, obj.getClass());
    }

    public String t(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        x(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f31635i + ",factories:" + this.f31631e + ",instanceCreators:" + this.f31629c + "}";
    }

    public void u(JsonElement jsonElement, JsonWriter jsonWriter) {
        boolean m2 = jsonWriter.m();
        jsonWriter.H(true);
        boolean l2 = jsonWriter.l();
        jsonWriter.F(this.f31638l);
        boolean k2 = jsonWriter.k();
        jsonWriter.I(this.f31635i);
        try {
            Streams.b(jsonElement, jsonWriter);
            jsonWriter.H(m2);
            jsonWriter.F(l2);
            jsonWriter.I(k2);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
        } catch (Throwable th) {
            jsonWriter.H(m2);
            jsonWriter.F(l2);
            jsonWriter.I(k2);
            throw th;
        }
    }

    public void v(JsonElement jsonElement, Appendable appendable) {
        try {
            u(jsonElement, q(Streams.c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public void w(Object obj, Type type, JsonWriter jsonWriter) {
        TypeAdapter l2 = l(TypeToken.get(type));
        boolean m2 = jsonWriter.m();
        jsonWriter.H(true);
        boolean l3 = jsonWriter.l();
        jsonWriter.F(this.f31638l);
        boolean k2 = jsonWriter.k();
        jsonWriter.I(this.f31635i);
        try {
            l2.d(jsonWriter, obj);
            jsonWriter.H(m2);
            jsonWriter.F(l3);
            jsonWriter.I(k2);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
        } catch (Throwable th) {
            jsonWriter.H(m2);
            jsonWriter.F(l3);
            jsonWriter.I(k2);
            throw th;
        }
    }

    public void x(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, q(Streams.c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, LongSerializationPolicy longSerializationPolicy, String str, int i2, int i3, List list, List list2, List list3, ToNumberStrategy toNumberStrategy, ToNumberStrategy toNumberStrategy2, List list4) {
        Map map2 = map;
        boolean z10 = z3;
        boolean z11 = z8;
        boolean z12 = z9;
        List list5 = list4;
        this.f31627a = new ThreadLocal();
        this.f31628b = new ConcurrentHashMap();
        this.f31632f = excluder;
        this.f31633g = fieldNamingStrategy;
        this.f31634h = map2;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map2, z12, list5);
        this.f31629c = constructorConstructor;
        this.f31635i = z2;
        this.f31636j = z10;
        this.f31637k = z4;
        this.f31638l = z5;
        this.f31639m = z6;
        this.f31640n = z7;
        this.f31641o = z11;
        this.f31642p = z12;
        this.f31646t = longSerializationPolicy;
        this.f31643q = str;
        this.f31644r = i2;
        this.f31645s = i3;
        this.f31647u = list;
        this.f31648v = list2;
        this.f31649w = toNumberStrategy;
        this.f31650x = toNumberStrategy2;
        this.f31651y = list5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.W);
        arrayList.add(ObjectTypeAdapter.e(toNumberStrategy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.C);
        arrayList.add(TypeAdapters.f31839m);
        arrayList.add(TypeAdapters.f31833g);
        arrayList.add(TypeAdapters.f31835i);
        arrayList.add(TypeAdapters.f31837k);
        TypeAdapter o2 = o(longSerializationPolicy);
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, o2));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, e(z11)));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, f(z11)));
        arrayList.add(NumberTypeAdapter.e(toNumberStrategy2));
        arrayList.add(TypeAdapters.f31841o);
        arrayList.add(TypeAdapters.f31843q);
        arrayList.add(TypeAdapters.a(AtomicLong.class, b(o2)));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, c(o2)));
        arrayList.add(TypeAdapters.f31845s);
        arrayList.add(TypeAdapters.f31850x);
        arrayList.add(TypeAdapters.E);
        arrayList.add(TypeAdapters.G);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.f31852z));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.f31825A));
        arrayList.add(TypeAdapters.a(LazilyParsedNumber.class, TypeAdapters.f31826B));
        arrayList.add(TypeAdapters.I);
        arrayList.add(TypeAdapters.K);
        arrayList.add(TypeAdapters.O);
        arrayList.add(TypeAdapters.Q);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TypeAdapters.M);
        arrayList.add(TypeAdapters.f31830d);
        arrayList.add(DateTypeAdapter.f31764b);
        arrayList.add(TypeAdapters.S);
        if (SqlTypesSupport.f31885a) {
            arrayList.add(SqlTypesSupport.f31889e);
            arrayList.add(SqlTypesSupport.f31888d);
            arrayList.add(SqlTypesSupport.f31890f);
        }
        arrayList.add(ArrayTypeAdapter.f31758c);
        arrayList.add(TypeAdapters.f31828b);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z10));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f31630d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.X);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f31631e = Collections.unmodifiableList(arrayList);
    }
}
