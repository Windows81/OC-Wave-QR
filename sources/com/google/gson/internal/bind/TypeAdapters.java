package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {

    /* renamed from: A  reason: collision with root package name */
    public static final TypeAdapter f31825A = new TypeAdapter<BigInteger>() {
        /* renamed from: e */
        public BigInteger b(JsonReader jsonReader) {
            if (jsonReader.S() == JsonToken.NULL) {
                jsonReader.I();
                return null;
            }
            String O = jsonReader.O();
            try {
                return new BigInteger(O);
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException("Failed parsing '" + O + "' as BigInteger; at path " + jsonReader.r(), e2);
            }
        }

        /* renamed from: f */
        public void d(JsonWriter jsonWriter, BigInteger bigInteger) {
            jsonWriter.T(bigInteger);
        }
    };

    /* renamed from: B  reason: collision with root package name */
    public static final TypeAdapter f31826B = new TypeAdapter<LazilyParsedNumber>() {
        /* renamed from: e */
        public LazilyParsedNumber b(JsonReader jsonReader) {
            if (jsonReader.S() != JsonToken.NULL) {
                return new LazilyParsedNumber(jsonReader.O());
            }
            jsonReader.I();
            return null;
        }

        /* renamed from: f */
        public void d(JsonWriter jsonWriter, LazilyParsedNumber lazilyParsedNumber) {
            jsonWriter.T(lazilyParsedNumber);
        }
    };
    public static final TypeAdapterFactory C;
    public static final TypeAdapter D;
    public static final TypeAdapterFactory E;
    public static final TypeAdapter F;
    public static final TypeAdapterFactory G;
    public static final TypeAdapter H;
    public static final TypeAdapterFactory I;
    public static final TypeAdapter J;
    public static final TypeAdapterFactory K;
    public static final TypeAdapter L;
    public static final TypeAdapterFactory M;
    public static final TypeAdapter N;
    public static final TypeAdapterFactory O;
    public static final TypeAdapter P;
    public static final TypeAdapterFactory Q;
    public static final TypeAdapter R;
    public static final TypeAdapterFactory S;
    public static final TypeAdapter T;
    public static final TypeAdapterFactory U;
    public static final TypeAdapter V;
    public static final TypeAdapterFactory W;
    public static final TypeAdapterFactory X = new TypeAdapterFactory() {
        public TypeAdapter b(Gson gson, TypeToken typeToken) {
            Class<? super Enum> rawType = typeToken.getRawType();
            Class<Enum> cls = Enum.class;
            if (!cls.isAssignableFrom(rawType) || rawType == cls) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final TypeAdapter f31827a;

    /* renamed from: b  reason: collision with root package name */
    public static final TypeAdapterFactory f31828b;

    /* renamed from: c  reason: collision with root package name */
    public static final TypeAdapter f31829c;

    /* renamed from: d  reason: collision with root package name */
    public static final TypeAdapterFactory f31830d;

    /* renamed from: e  reason: collision with root package name */
    public static final TypeAdapter f31831e;

    /* renamed from: f  reason: collision with root package name */
    public static final TypeAdapter f31832f = new TypeAdapter<Boolean>() {
        /* renamed from: e */
        public Boolean b(JsonReader jsonReader) {
            if (jsonReader.S() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.O());
            }
            jsonReader.I();
            return null;
        }

        /* renamed from: f */
        public void d(JsonWriter jsonWriter, Boolean bool) {
            jsonWriter.X(bool == null ? "null" : bool.toString());
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final TypeAdapterFactory f31833g;

    /* renamed from: h  reason: collision with root package name */
    public static final TypeAdapter f31834h;

    /* renamed from: i  reason: collision with root package name */
    public static final TypeAdapterFactory f31835i;

    /* renamed from: j  reason: collision with root package name */
    public static final TypeAdapter f31836j;

    /* renamed from: k  reason: collision with root package name */
    public static final TypeAdapterFactory f31837k;

    /* renamed from: l  reason: collision with root package name */
    public static final TypeAdapter f31838l;

    /* renamed from: m  reason: collision with root package name */
    public static final TypeAdapterFactory f31839m;

    /* renamed from: n  reason: collision with root package name */
    public static final TypeAdapter f31840n;

    /* renamed from: o  reason: collision with root package name */
    public static final TypeAdapterFactory f31841o;

    /* renamed from: p  reason: collision with root package name */
    public static final TypeAdapter f31842p;

    /* renamed from: q  reason: collision with root package name */
    public static final TypeAdapterFactory f31843q;

    /* renamed from: r  reason: collision with root package name */
    public static final TypeAdapter f31844r;

    /* renamed from: s  reason: collision with root package name */
    public static final TypeAdapterFactory f31845s;

    /* renamed from: t  reason: collision with root package name */
    public static final TypeAdapter f31846t = new TypeAdapter<Number>() {
        /* renamed from: e */
        public Number b(JsonReader jsonReader) {
            if (jsonReader.S() == JsonToken.NULL) {
                jsonReader.I();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.F());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: f */
        public void d(JsonWriter jsonWriter, Number number) {
            if (number == null) {
                jsonWriter.y();
            } else {
                jsonWriter.Q(number.longValue());
            }
        }
    };

    /* renamed from: u  reason: collision with root package name */
    public static final TypeAdapter f31847u = new TypeAdapter<Number>() {
        /* renamed from: e */
        public Number b(JsonReader jsonReader) {
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
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            jsonWriter.T(number);
        }
    };

    /* renamed from: v  reason: collision with root package name */
    public static final TypeAdapter f31848v = new TypeAdapter<Number>() {
        /* renamed from: e */
        public Number b(JsonReader jsonReader) {
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
            } else {
                jsonWriter.O(number.doubleValue());
            }
        }
    };

    /* renamed from: w  reason: collision with root package name */
    public static final TypeAdapter f31849w;

    /* renamed from: x  reason: collision with root package name */
    public static final TypeAdapterFactory f31850x;

    /* renamed from: y  reason: collision with root package name */
    public static final TypeAdapter f31851y;

    /* renamed from: z  reason: collision with root package name */
    public static final TypeAdapter f31852z = new TypeAdapter<BigDecimal>() {
        /* renamed from: e */
        public BigDecimal b(JsonReader jsonReader) {
            if (jsonReader.S() == JsonToken.NULL) {
                jsonReader.I();
                return null;
            }
            String O = jsonReader.O();
            try {
                return new BigDecimal(O);
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException("Failed parsing '" + O + "' as BigDecimal; at path " + jsonReader.r(), e2);
            }
        }

        /* renamed from: f */
        public void d(JsonWriter jsonWriter, BigDecimal bigDecimal) {
            jsonWriter.T(bigDecimal);
        }
    };

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30  reason: invalid class name */
    class AnonymousClass30 implements TypeAdapterFactory {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f31853A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ TypeToken f31854z;

        public TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.equals(this.f31854z)) {
                return this.f31853A;
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$35  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass35 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31867a;

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
                f31867a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31867a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31867a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31867a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31867a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31867a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass35.<clinit>():void");
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Map f31868a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map f31869b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public final Map f31870c = new HashMap();

        public EnumTypeAdapter(final Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new PrivilegedAction<Field[]>() {
                    /* renamed from: a */
                    public Field[] run() {
                        Field[] declaredFields = cls.getDeclaredFields();
                        ArrayList arrayList = new ArrayList(declaredFields.length);
                        for (Field field : declaredFields) {
                            if (field.isEnumConstant()) {
                                arrayList.add(field);
                            }
                        }
                        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                        AccessibleObject.setAccessible(fieldArr, true);
                        return fieldArr;
                    }
                })) {
                    Enum enumR = (Enum) field.get((Object) null);
                    String name = enumR.name();
                    String str = enumR.toString();
                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (String put : serializedName.alternate()) {
                            this.f31868a.put(put, enumR);
                        }
                    }
                    this.f31868a.put(name, enumR);
                    this.f31869b.put(str, enumR);
                    this.f31870c.put(enumR, name);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: e */
        public Enum b(JsonReader jsonReader) {
            if (jsonReader.S() == JsonToken.NULL) {
                jsonReader.I();
                return null;
            }
            String O = jsonReader.O();
            Enum enumR = (Enum) this.f31868a.get(O);
            return enumR == null ? (Enum) this.f31869b.get(O) : enumR;
        }

        /* renamed from: f */
        public void d(JsonWriter jsonWriter, Enum enumR) {
            jsonWriter.X(enumR == null ? null : (String) this.f31870c.get(enumR));
        }
    }

    static {
        TypeAdapter a2 = new TypeAdapter<Class>() {
            /* renamed from: e */
            public Class b(JsonReader jsonReader) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.a();
        f31827a = a2;
        f31828b = a(Class.class, a2);
        TypeAdapter a3 = new TypeAdapter<BitSet>() {
            /* renamed from: e */
            public BitSet b(JsonReader jsonReader) {
                BitSet bitSet = new BitSet();
                jsonReader.a();
                JsonToken S = jsonReader.S();
                int i2 = 0;
                while (S != JsonToken.END_ARRAY) {
                    int i3 = AnonymousClass35.f31867a[S.ordinal()];
                    boolean z2 = true;
                    if (i3 == 1 || i3 == 2) {
                        int E = jsonReader.E();
                        if (E == 0) {
                            z2 = false;
                        } else if (E != 1) {
                            throw new JsonSyntaxException("Invalid bitset value " + E + ", expected 0 or 1; at path " + jsonReader.r());
                        }
                    } else if (i3 == 3) {
                        z2 = jsonReader.C();
                    } else {
                        throw new JsonSyntaxException("Invalid bitset value type: " + S + "; at path " + jsonReader.l());
                    }
                    if (z2) {
                        bitSet.set(i2);
                    }
                    i2++;
                    S = jsonReader.S();
                }
                jsonReader.g();
                return bitSet;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, BitSet bitSet) {
                jsonWriter.c();
                int length = bitSet.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.Q(bitSet.get(i2) ? 1 : 0);
                }
                jsonWriter.g();
            }
        }.a();
        f31829c = a3;
        f31830d = a(BitSet.class, a3);
        AnonymousClass3 r0 = new TypeAdapter<Boolean>() {
            /* renamed from: e */
            public Boolean b(JsonReader jsonReader) {
                JsonToken S = jsonReader.S();
                if (S != JsonToken.NULL) {
                    return S == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.O())) : Boolean.valueOf(jsonReader.C());
                }
                jsonReader.I();
                return null;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Boolean bool) {
                jsonWriter.S(bool);
            }
        };
        f31831e = r0;
        f31833g = b(Boolean.TYPE, Boolean.class, r0);
        AnonymousClass5 r02 = new TypeAdapter<Number>() {
            /* renamed from: e */
            public Number b(JsonReader jsonReader) {
                if (jsonReader.S() == JsonToken.NULL) {
                    jsonReader.I();
                    return null;
                }
                try {
                    int E = jsonReader.E();
                    if (E <= 255 && E >= -128) {
                        return Byte.valueOf((byte) E);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + E + " to byte; at path " + jsonReader.r());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) {
                if (number == null) {
                    jsonWriter.y();
                } else {
                    jsonWriter.Q((long) number.byteValue());
                }
            }
        };
        f31834h = r02;
        f31835i = b(Byte.TYPE, Byte.class, r02);
        AnonymousClass6 r03 = new TypeAdapter<Number>() {
            /* renamed from: e */
            public Number b(JsonReader jsonReader) {
                if (jsonReader.S() == JsonToken.NULL) {
                    jsonReader.I();
                    return null;
                }
                try {
                    int E = jsonReader.E();
                    if (E <= 65535 && E >= -32768) {
                        return Short.valueOf((short) E);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + E + " to short; at path " + jsonReader.r());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) {
                if (number == null) {
                    jsonWriter.y();
                } else {
                    jsonWriter.Q((long) number.shortValue());
                }
            }
        };
        f31836j = r03;
        f31837k = b(Short.TYPE, Short.class, r03);
        AnonymousClass7 r04 = new TypeAdapter<Number>() {
            /* renamed from: e */
            public Number b(JsonReader jsonReader) {
                if (jsonReader.S() == JsonToken.NULL) {
                    jsonReader.I();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.E());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) {
                if (number == null) {
                    jsonWriter.y();
                } else {
                    jsonWriter.Q((long) number.intValue());
                }
            }
        };
        f31838l = r04;
        f31839m = b(Integer.TYPE, Integer.class, r04);
        TypeAdapter a4 = new TypeAdapter<AtomicInteger>() {
            /* renamed from: e */
            public AtomicInteger b(JsonReader jsonReader) {
                try {
                    return new AtomicInteger(jsonReader.E());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicInteger atomicInteger) {
                jsonWriter.Q((long) atomicInteger.get());
            }
        }.a();
        f31840n = a4;
        f31841o = a(AtomicInteger.class, a4);
        TypeAdapter a5 = new TypeAdapter<AtomicBoolean>() {
            /* renamed from: e */
            public AtomicBoolean b(JsonReader jsonReader) {
                return new AtomicBoolean(jsonReader.C());
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) {
                jsonWriter.c0(atomicBoolean.get());
            }
        }.a();
        f31842p = a5;
        f31843q = a(AtomicBoolean.class, a5);
        TypeAdapter a6 = new TypeAdapter<AtomicIntegerArray>() {
            /* renamed from: e */
            public AtomicIntegerArray b(JsonReader jsonReader) {
                ArrayList arrayList = new ArrayList();
                jsonReader.a();
                while (jsonReader.t()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.E()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException((Throwable) e2);
                    }
                }
                jsonReader.g();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) {
                jsonWriter.c();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.Q((long) atomicIntegerArray.get(i2));
                }
                jsonWriter.g();
            }
        }.a();
        f31844r = a6;
        f31845s = a(AtomicIntegerArray.class, a6);
        AnonymousClass14 r05 = new TypeAdapter<Character>() {
            /* renamed from: e */
            public Character b(JsonReader jsonReader) {
                if (jsonReader.S() == JsonToken.NULL) {
                    jsonReader.I();
                    return null;
                }
                String O = jsonReader.O();
                if (O.length() == 1) {
                    return Character.valueOf(O.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + O + "; at " + jsonReader.r());
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Character ch) {
                jsonWriter.X(ch == null ? null : String.valueOf(ch));
            }
        };
        f31849w = r05;
        f31850x = b(Character.TYPE, Character.class, r05);
        AnonymousClass15 r06 = new TypeAdapter<String>() {
            /* renamed from: e */
            public String b(JsonReader jsonReader) {
                JsonToken S = jsonReader.S();
                if (S != JsonToken.NULL) {
                    return S == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.C()) : jsonReader.O();
                }
                jsonReader.I();
                return null;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, String str) {
                jsonWriter.X(str);
            }
        };
        f31851y = r06;
        C = a(String.class, r06);
        AnonymousClass19 r07 = new TypeAdapter<StringBuilder>() {
            /* renamed from: e */
            public StringBuilder b(JsonReader jsonReader) {
                if (jsonReader.S() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.O());
                }
                jsonReader.I();
                return null;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, StringBuilder sb) {
                jsonWriter.X(sb == null ? null : sb.toString());
            }
        };
        D = r07;
        E = a(StringBuilder.class, r07);
        AnonymousClass20 r08 = new TypeAdapter<StringBuffer>() {
            /* renamed from: e */
            public StringBuffer b(JsonReader jsonReader) {
                if (jsonReader.S() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.O());
                }
                jsonReader.I();
                return null;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, StringBuffer stringBuffer) {
                jsonWriter.X(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        F = r08;
        G = a(StringBuffer.class, r08);
        AnonymousClass21 r09 = new TypeAdapter<URL>() {
            /* renamed from: e */
            public URL b(JsonReader jsonReader) {
                if (jsonReader.S() == JsonToken.NULL) {
                    jsonReader.I();
                    return null;
                }
                String O = jsonReader.O();
                if ("null".equals(O)) {
                    return null;
                }
                return new URL(O);
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, URL url) {
                jsonWriter.X(url == null ? null : url.toExternalForm());
            }
        };
        H = r09;
        I = a(URL.class, r09);
        AnonymousClass22 r010 = new TypeAdapter<URI>() {
            /* renamed from: e */
            public URI b(JsonReader jsonReader) {
                if (jsonReader.S() == JsonToken.NULL) {
                    jsonReader.I();
                    return null;
                }
                try {
                    String O = jsonReader.O();
                    if ("null".equals(O)) {
                        return null;
                    }
                    return new URI(O);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException((Throwable) e2);
                }
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, URI uri) {
                jsonWriter.X(uri == null ? null : uri.toASCIIString());
            }
        };
        J = r010;
        K = a(URI.class, r010);
        AnonymousClass23 r011 = new TypeAdapter<InetAddress>() {
            /* renamed from: e */
            public InetAddress b(JsonReader jsonReader) {
                if (jsonReader.S() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.O());
                }
                jsonReader.I();
                return null;
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, InetAddress inetAddress) {
                jsonWriter.X(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        L = r011;
        M = d(InetAddress.class, r011);
        AnonymousClass24 r012 = new TypeAdapter<UUID>() {
            /* renamed from: e */
            public UUID b(JsonReader jsonReader) {
                if (jsonReader.S() == JsonToken.NULL) {
                    jsonReader.I();
                    return null;
                }
                String O = jsonReader.O();
                try {
                    return UUID.fromString(O);
                } catch (IllegalArgumentException e2) {
                    throw new JsonSyntaxException("Failed parsing '" + O + "' as UUID; at path " + jsonReader.r(), e2);
                }
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, UUID uuid) {
                jsonWriter.X(uuid == null ? null : uuid.toString());
            }
        };
        N = r012;
        O = a(UUID.class, r012);
        TypeAdapter a7 = new TypeAdapter<Currency>() {
            /* renamed from: e */
            public Currency b(JsonReader jsonReader) {
                String O = jsonReader.O();
                try {
                    return Currency.getInstance(O);
                } catch (IllegalArgumentException e2) {
                    throw new JsonSyntaxException("Failed parsing '" + O + "' as Currency; at path " + jsonReader.r(), e2);
                }
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Currency currency) {
                jsonWriter.X(currency.getCurrencyCode());
            }
        }.a();
        P = a7;
        Q = a(Currency.class, a7);
        AnonymousClass26 r013 = new TypeAdapter<Calendar>() {
            /* renamed from: e */
            public Calendar b(JsonReader jsonReader) {
                if (jsonReader.S() == JsonToken.NULL) {
                    jsonReader.I();
                    return null;
                }
                jsonReader.b();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.S() != JsonToken.END_OBJECT) {
                    String G = jsonReader.G();
                    int E = jsonReader.E();
                    if ("year".equals(G)) {
                        i2 = E;
                    } else if ("month".equals(G)) {
                        i3 = E;
                    } else if ("dayOfMonth".equals(G)) {
                        i4 = E;
                    } else if ("hourOfDay".equals(G)) {
                        i5 = E;
                    } else if ("minute".equals(G)) {
                        i6 = E;
                    } else if ("second".equals(G)) {
                        i7 = E;
                    }
                }
                jsonReader.j();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Calendar calendar) {
                if (calendar == null) {
                    jsonWriter.y();
                    return;
                }
                jsonWriter.d();
                jsonWriter.t("year");
                jsonWriter.Q((long) calendar.get(1));
                jsonWriter.t("month");
                jsonWriter.Q((long) calendar.get(2));
                jsonWriter.t("dayOfMonth");
                jsonWriter.Q((long) calendar.get(5));
                jsonWriter.t("hourOfDay");
                jsonWriter.Q((long) calendar.get(11));
                jsonWriter.t("minute");
                jsonWriter.Q((long) calendar.get(12));
                jsonWriter.t("second");
                jsonWriter.Q((long) calendar.get(13));
                jsonWriter.j();
            }
        };
        R = r013;
        S = c(Calendar.class, GregorianCalendar.class, r013);
        AnonymousClass27 r014 = new TypeAdapter<Locale>() {
            /* renamed from: e */
            public Locale b(JsonReader jsonReader) {
                String str = null;
                if (jsonReader.S() == JsonToken.NULL) {
                    jsonReader.I();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.O(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
            }

            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Locale locale) {
                jsonWriter.X(locale == null ? null : locale.toString());
            }
        };
        T = r014;
        U = a(Locale.class, r014);
        AnonymousClass28 r015 = new TypeAdapter<JsonElement>() {
            /* renamed from: e */
            public JsonElement b(JsonReader jsonReader) {
                if (jsonReader instanceof JsonTreeReader) {
                    return ((JsonTreeReader) jsonReader).w0();
                }
                JsonToken S = jsonReader.S();
                JsonElement g2 = g(jsonReader, S);
                if (g2 == null) {
                    return f(jsonReader, S);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (jsonReader.t()) {
                        String G = g2 instanceof JsonObject ? jsonReader.G() : null;
                        JsonToken S2 = jsonReader.S();
                        JsonElement g3 = g(jsonReader, S2);
                        boolean z2 = g3 != null;
                        if (g3 == null) {
                            g3 = f(jsonReader, S2);
                        }
                        if (g2 instanceof JsonArray) {
                            ((JsonArray) g2).p(g3);
                        } else {
                            ((JsonObject) g2).p(G, g3);
                        }
                        if (z2) {
                            arrayDeque.addLast(g2);
                            g2 = g3;
                        }
                    } else {
                        if (g2 instanceof JsonArray) {
                            jsonReader.g();
                        } else {
                            jsonReader.j();
                        }
                        if (arrayDeque.isEmpty()) {
                            return g2;
                        }
                        g2 = (JsonElement) arrayDeque.removeLast();
                    }
                }
            }

            public final JsonElement f(JsonReader jsonReader, JsonToken jsonToken) {
                int i2 = AnonymousClass35.f31867a[jsonToken.ordinal()];
                if (i2 == 1) {
                    return new JsonPrimitive((Number) new LazilyParsedNumber(jsonReader.O()));
                }
                if (i2 == 2) {
                    return new JsonPrimitive(jsonReader.O());
                }
                if (i2 == 3) {
                    return new JsonPrimitive(Boolean.valueOf(jsonReader.C()));
                }
                if (i2 == 6) {
                    jsonReader.I();
                    return JsonNull.f31678z;
                }
                throw new IllegalStateException("Unexpected token: " + jsonToken);
            }

            public final JsonElement g(JsonReader jsonReader, JsonToken jsonToken) {
                int i2 = AnonymousClass35.f31867a[jsonToken.ordinal()];
                if (i2 == 4) {
                    jsonReader.a();
                    return new JsonArray();
                } else if (i2 != 5) {
                    return null;
                } else {
                    jsonReader.b();
                    return new JsonObject();
                }
            }

            /* renamed from: h */
            public void d(JsonWriter jsonWriter, JsonElement jsonElement) {
                if (jsonElement == null || jsonElement.m()) {
                    jsonWriter.y();
                } else if (jsonElement.o()) {
                    JsonPrimitive h2 = jsonElement.h();
                    if (h2.B()) {
                        jsonWriter.T(h2.v());
                    } else if (h2.z()) {
                        jsonWriter.c0(h2.p());
                    } else {
                        jsonWriter.X(h2.w());
                    }
                } else if (jsonElement.i()) {
                    jsonWriter.c();
                    Iterator it = jsonElement.e().iterator();
                    while (it.hasNext()) {
                        d(jsonWriter, (JsonElement) it.next());
                    }
                    jsonWriter.g();
                } else if (jsonElement.n()) {
                    jsonWriter.d();
                    for (Map.Entry entry : jsonElement.g().entrySet()) {
                        jsonWriter.t((String) entry.getKey());
                        d(jsonWriter, (JsonElement) entry.getValue());
                    }
                    jsonWriter.j();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
                }
            }
        };
        V = r015;
        W = d(JsonElement.class, r015);
    }

    public static TypeAdapterFactory a(final Class cls, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() {
            public TypeAdapter b(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static TypeAdapterFactory b(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() {
            public TypeAdapter b(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static TypeAdapterFactory c(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() {
            public TypeAdapter b(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static TypeAdapterFactory d(final Class cls, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() {
            public TypeAdapter b(Gson gson, TypeToken typeToken) {
                final Class rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new TypeAdapter<Object>() {
                    public Object b(JsonReader jsonReader) {
                        Object b2 = typeAdapter.b(jsonReader);
                        if (b2 == null || rawType.isInstance(b2)) {
                            return b2;
                        }
                        throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + b2.getClass().getName() + "; at path " + jsonReader.r());
                    }

                    public void d(JsonWriter jsonWriter, Object obj) {
                        typeAdapter.d(jsonWriter, obj);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
