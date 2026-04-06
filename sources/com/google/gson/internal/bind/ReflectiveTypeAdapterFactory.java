package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: A  reason: collision with root package name */
    public final FieldNamingStrategy f31787A;

    /* renamed from: B  reason: collision with root package name */
    public final Excluder f31788B;
    public final JsonAdapterAnnotationTypeAdapterFactory C;
    public final List D;

    /* renamed from: z  reason: collision with root package name */
    public final ConstructorConstructor f31789z;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Map f31799a;

        public Adapter(Map map) {
            this.f31799a = map;
        }

        public Object b(JsonReader jsonReader) {
            if (jsonReader.S() == JsonToken.NULL) {
                jsonReader.I();
                return null;
            }
            Object e2 = e();
            try {
                jsonReader.b();
                while (jsonReader.t()) {
                    BoundField boundField = (BoundField) this.f31799a.get(jsonReader.G());
                    if (boundField != null) {
                        if (boundField.f31804e) {
                            g(e2, jsonReader, boundField);
                        }
                    }
                    jsonReader.Y();
                }
                jsonReader.j();
                return f(e2);
            } catch (IllegalStateException e3) {
                throw new JsonSyntaxException((Throwable) e3);
            } catch (IllegalAccessException e4) {
                throw ReflectionHelper.e(e4);
            }
        }

        public void d(JsonWriter jsonWriter, Object obj) {
            if (obj == null) {
                jsonWriter.y();
                return;
            }
            jsonWriter.d();
            try {
                for (BoundField c2 : this.f31799a.values()) {
                    c2.c(jsonWriter, obj);
                }
                jsonWriter.j();
            } catch (IllegalAccessException e2) {
                throw ReflectionHelper.e(e2);
            }
        }

        public abstract Object e();

        public abstract Object f(Object obj);

        public abstract void g(Object obj, JsonReader jsonReader, BoundField boundField);
    }

    public static abstract class BoundField {

        /* renamed from: a  reason: collision with root package name */
        public final String f31800a;

        /* renamed from: b  reason: collision with root package name */
        public final Field f31801b;

        /* renamed from: c  reason: collision with root package name */
        public final String f31802c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f31803d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f31804e;

        public BoundField(String str, Field field, boolean z2, boolean z3) {
            this.f31800a = str;
            this.f31801b = field;
            this.f31802c = field.getName();
            this.f31803d = z2;
            this.f31804e = z3;
        }

        public abstract void a(JsonReader jsonReader, int i2, Object[] objArr);

        public abstract void b(JsonReader jsonReader, Object obj);

        public abstract void c(JsonWriter jsonWriter, Object obj);
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b  reason: collision with root package name */
        public final ObjectConstructor f31805b;

        public FieldReflectionAdapter(ObjectConstructor objectConstructor, Map map) {
            super(map);
            this.f31805b = objectConstructor;
        }

        public Object e() {
            return this.f31805b.a();
        }

        public Object f(Object obj) {
            return obj;
        }

        public void g(Object obj, JsonReader jsonReader, BoundField boundField) {
            boundField.b(jsonReader, obj);
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e  reason: collision with root package name */
        public static final Map f31806e = j();

        /* renamed from: b  reason: collision with root package name */
        public final Constructor f31807b;

        /* renamed from: c  reason: collision with root package name */
        public final Object[] f31808c;

        /* renamed from: d  reason: collision with root package name */
        public final Map f31809d = new HashMap();

        public RecordAdapter(Class cls, Map map, boolean z2) {
            super(map);
            Constructor i2 = ReflectionHelper.i(cls);
            this.f31807b = i2;
            if (z2) {
                ReflectiveTypeAdapterFactory.c((Object) null, i2);
            } else {
                ReflectionHelper.l(i2);
            }
            String[] j2 = ReflectionHelper.j(cls);
            for (int i3 = 0; i3 < j2.length; i3++) {
                this.f31809d.put(j2[i3], Integer.valueOf(i3));
            }
            Class[] parameterTypes = this.f31807b.getParameterTypes();
            this.f31808c = new Object[parameterTypes.length];
            for (int i4 = 0; i4 < parameterTypes.length; i4++) {
                this.f31808c[i4] = f31806e.get(parameterTypes[i4]);
            }
        }

        public static Map j() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        /* renamed from: h */
        public Object[] e() {
            return (Object[]) this.f31808c.clone();
        }

        /* renamed from: i */
        public Object f(Object[] objArr) {
            try {
                return this.f31807b.newInstance(objArr);
            } catch (IllegalAccessException e2) {
                throw ReflectionHelper.e(e2);
            } catch (IllegalArgumentException | InstantiationException e3) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.c(this.f31807b) + "' with args " + Arrays.toString(objArr), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.c(this.f31807b) + "' with args " + Arrays.toString(objArr), e4.getCause());
            }
        }

        /* renamed from: k */
        public void g(Object[] objArr, JsonReader jsonReader, BoundField boundField) {
            Integer num = (Integer) this.f31809d.get(boundField.f31802c);
            if (num != null) {
                boundField.a(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ReflectionHelper.c(this.f31807b) + "' for field with name '" + boundField.f31802c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f31789z = constructorConstructor;
        this.f31787A = fieldNamingStrategy;
        this.f31788B = excluder;
        this.C = jsonAdapterAnnotationTypeAdapterFactory;
        this.D = list;
    }

    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!ReflectionAccessFilterHelper.a(accessibleObject, obj)) {
            String g2 = ReflectionHelper.g(accessibleObject, true);
            throw new JsonIOException(g2 + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        }
    }

    public TypeAdapter b(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        ReflectionAccessFilter.FilterResult b2 = ReflectionAccessFilterHelper.b(this.D, rawType);
        if (b2 != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            boolean z2 = b2 == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            return ReflectionHelper.k(rawType) ? new RecordAdapter(rawType, e(gson, typeToken, rawType, z2, true), z2) : new FieldReflectionAdapter(this.f31789z.b(typeToken), e(gson, typeToken, rawType, z2, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final BoundField d(Gson gson, Field field, Method method, String str, TypeToken typeToken, boolean z2, boolean z3, boolean z4) {
        Gson gson2 = gson;
        TypeToken typeToken2 = typeToken;
        final boolean a2 = Primitives.a(typeToken.getRawType());
        int modifiers = field.getModifiers();
        final boolean z5 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        TypeAdapter a3 = jsonAdapter != null ? this.C.a(this.f31789z, gson2, typeToken2, jsonAdapter) : null;
        final boolean z6 = a3 != null;
        if (a3 == null) {
            a3 = gson2.l(typeToken2);
        }
        final TypeAdapter typeAdapter = a3;
        final boolean z7 = z4;
        final Method method2 = method;
        final Gson gson3 = gson;
        final TypeToken typeToken3 = typeToken;
        return new BoundField(str, field, z2, z3) {
            public void a(JsonReader jsonReader, int i2, Object[] objArr) {
                Object b2 = typeAdapter.b(jsonReader);
                if (b2 != null || !a2) {
                    objArr[i2] = b2;
                    return;
                }
                throw new JsonParseException("null is not allowed as value for record component '" + this.f31802c + "' of primitive type; at path " + jsonReader.l());
            }

            public void b(JsonReader jsonReader, Object obj) {
                Object b2 = typeAdapter.b(jsonReader);
                if (b2 != null || !a2) {
                    if (z7) {
                        ReflectiveTypeAdapterFactory.c(obj, this.f31801b);
                    } else if (z5) {
                        String g2 = ReflectionHelper.g(this.f31801b, false);
                        throw new JsonIOException("Cannot set value of 'static final' " + g2);
                    }
                    this.f31801b.set(obj, b2);
                }
            }

            public void c(JsonWriter jsonWriter, Object obj) {
                Object obj2;
                if (this.f31803d) {
                    if (z7) {
                        Method method = method2;
                        if (method == null) {
                            ReflectiveTypeAdapterFactory.c(obj, this.f31801b);
                        } else {
                            ReflectiveTypeAdapterFactory.c(obj, method);
                        }
                    }
                    Method method2 = method2;
                    if (method2 != null) {
                        try {
                            obj2 = method2.invoke(obj, (Object[]) null);
                        } catch (InvocationTargetException e2) {
                            String g2 = ReflectionHelper.g(method2, false);
                            throw new JsonIOException("Accessor " + g2 + " threw exception", e2.getCause());
                        }
                    } else {
                        obj2 = this.f31801b.get(obj);
                    }
                    if (obj2 != obj) {
                        jsonWriter.t(this.f31800a);
                        (z6 ? typeAdapter : new TypeAdapterRuntimeTypeWrapper(gson3, typeAdapter, typeToken3.getType())).d(jsonWriter, obj2);
                    }
                }
            }
        };
    }

    public final Map e(Gson gson, TypeToken typeToken, Class cls, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        int i3;
        Method method;
        boolean z5;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        Class cls2 = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        TypeToken typeToken2 = typeToken;
        boolean z6 = z2;
        Class cls3 = cls2;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            boolean z7 = true;
            boolean z8 = false;
            if (cls3 != cls2 && declaredFields.length > 0) {
                ReflectionAccessFilter.FilterResult b2 = ReflectionAccessFilterHelper.b(reflectiveTypeAdapterFactory.D, cls3);
                if (b2 != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
                    z6 = b2 == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
                } else {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls3 + " (supertype of " + cls2 + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
            }
            boolean z9 = z6;
            int length = declaredFields.length;
            int i4 = 0;
            while (i4 < length) {
                Field field = declaredFields[i4];
                boolean g2 = reflectiveTypeAdapterFactory.g(field, z7);
                boolean g3 = reflectiveTypeAdapterFactory.g(field, z8);
                if (g2 || g3) {
                    BoundField boundField = null;
                    if (!z3) {
                        z5 = g3;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z5 = z8;
                    } else {
                        Method h2 = ReflectionHelper.h(cls3, field);
                        if (!z9) {
                            ReflectionHelper.l(h2);
                        }
                        Class cls4 = SerializedName.class;
                        if (h2.getAnnotation(cls4) == null || field.getAnnotation(cls4) != null) {
                            z5 = g3;
                            method = h2;
                        } else {
                            throw new JsonIOException("@SerializedName on " + ReflectionHelper.g(h2, z8) + " is not supported");
                        }
                    }
                    if (!z9 && method == null) {
                        ReflectionHelper.l(field);
                    }
                    Type o2 = C$Gson$Types.o(typeToken2.getType(), cls3, field.getGenericType());
                    List f2 = reflectiveTypeAdapterFactory.f(field);
                    int size = f2.size();
                    int i5 = z8;
                    while (i5 < size) {
                        String str = (String) f2.get(i5);
                        boolean z10 = i5 != 0 ? z8 : g2;
                        int i6 = i5;
                        BoundField boundField2 = boundField;
                        int i7 = size;
                        List list = f2;
                        Field field2 = field;
                        int i8 = i4;
                        int i9 = length;
                        boolean z11 = z8;
                        boundField = boundField2 == null ? (BoundField) linkedHashMap.put(str, d(gson, field, method, str, TypeToken.get(o2), z10, z5, z9)) : boundField2;
                        i5 = i6 + 1;
                        g2 = z10;
                        i4 = i8;
                        size = i7;
                        f2 = list;
                        field = field2;
                        length = i9;
                        z8 = z11;
                    }
                    BoundField boundField3 = boundField;
                    Field field3 = field;
                    i3 = i4;
                    i2 = length;
                    z4 = z8;
                    if (boundField3 != null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + boundField3.f31800a + "'; conflict is caused by fields " + ReflectionHelper.f(boundField3.f31801b) + " and " + ReflectionHelper.f(field3));
                    }
                } else {
                    i3 = i4;
                    i2 = length;
                    z4 = z8;
                }
                i4 = i3 + 1;
                z7 = true;
                reflectiveTypeAdapterFactory = this;
                length = i2;
                z8 = z4;
            }
            typeToken2 = TypeToken.get(C$Gson$Types.o(typeToken2.getType(), cls3, cls3.getGenericSuperclass()));
            cls3 = typeToken2.getRawType();
            reflectiveTypeAdapterFactory = this;
            z6 = z9;
        }
        return linkedHashMap;
    }

    public final List f(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.f31787A.d(field));
        }
        String value = serializedName.value();
        String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    public final boolean g(Field field, boolean z2) {
        return !this.f31788B.e(field.getType(), z2) && !this.f31788B.h(field, z2);
    }
}
