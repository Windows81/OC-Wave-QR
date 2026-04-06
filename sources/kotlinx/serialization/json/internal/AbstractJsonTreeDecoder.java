package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {

    /* renamed from: c  reason: collision with root package name */
    public final Json f42338c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonElement f42339d;

    /* renamed from: e  reason: collision with root package name */
    public final String f42340e;

    /* renamed from: f  reason: collision with root package name */
    public final JsonConfiguration f42341f;

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, str);
    }

    /* renamed from: A0 */
    public String Y(String str) {
        Intrinsics.i(str, "tag");
        JsonElement n0 = n0(str);
        if (n0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) n0;
            if (jsonPrimitive instanceof JsonLiteral) {
                JsonLiteral jsonLiteral = (JsonLiteral) jsonPrimitive;
                if (jsonLiteral.h() || d().g().q()) {
                    return jsonLiteral.e();
                }
                throw JsonExceptionsKt.f(-1, "String literal for key '" + str + "' should be quoted at element: " + D0(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", o0().toString());
            }
            throw JsonExceptionsKt.f(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + D0(str), o0().toString());
        }
        throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(n0.getClass()).e() + " as the serialized body of " + "string" + " at element: " + D0(str), n0.toString());
    }

    public final String B0() {
        return this.f42340e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
        r0 = kotlinx.serialization.json.JsonElementKt.j(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object C(kotlinx.serialization.DeserializationStrategy r6) {
        /*
            r5 = this;
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            boolean r0 = r6 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer
            if (r0 == 0) goto L_0x00c0
            kotlinx.serialization.json.Json r0 = r5.d()
            kotlinx.serialization.json.JsonConfiguration r0 = r0.g()
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x0019
            goto L_0x00c0
        L_0x0019:
            r0 = r6
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r0 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r0
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r0.a()
            kotlinx.serialization.json.Json r2 = r5.d()
            java.lang.String r1 = kotlinx.serialization.json.internal.PolymorphicKt.c(r1, r2)
            kotlinx.serialization.json.JsonElement r2 = r5.i()
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r0.a()
            java.lang.String r0 = r0.a()
            boolean r3 = r2 instanceof kotlinx.serialization.json.JsonObject
            r4 = -1
            if (r3 == 0) goto L_0x0074
            kotlinx.serialization.json.JsonObject r2 = (kotlinx.serialization.json.JsonObject) r2
            java.lang.Object r0 = r2.get(r1)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x004e
            kotlinx.serialization.json.JsonPrimitive r0 = kotlinx.serialization.json.JsonElementKt.j(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = kotlinx.serialization.json.JsonElementKt.f(r0)
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r6 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r6     // Catch:{ SerializationException -> 0x0063 }
            kotlinx.serialization.DeserializationStrategy r6 = kotlinx.serialization.PolymorphicSerializerKt.a(r6, r5, r0)     // Catch:{ SerializationException -> 0x0063 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>"
            kotlin.jvm.internal.Intrinsics.g(r6, r0)
            kotlinx.serialization.json.Json r0 = r5.d()
            java.lang.Object r6 = kotlinx.serialization.json.internal.TreeJsonDecoderKt.b(r0, r1, r2, r6)
            goto L_0x00c4
        L_0x0063:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            kotlin.jvm.internal.Intrinsics.f(r6)
            java.lang.String r0 = r2.toString()
            kotlinx.serialization.json.internal.JsonDecodingException r6 = kotlinx.serialization.json.internal.JsonExceptionsKt.f(r4, r6, r0)
            throw r6
        L_0x0074:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Expected "
            r6.append(r1)
            java.lang.Class<kotlinx.serialization.json.JsonObject> r1 = kotlinx.serialization.json.JsonObject.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.b(r1)
            java.lang.String r1 = r1.e()
            r6.append(r1)
            java.lang.String r1 = ", but had "
            r6.append(r1)
            java.lang.Class r1 = r2.getClass()
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.b(r1)
            java.lang.String r1 = r1.e()
            r6.append(r1)
            java.lang.String r1 = " as the serialized body of "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = " at element: "
            r6.append(r0)
            java.lang.String r0 = r5.k0()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = r2.toString()
            kotlinx.serialization.json.internal.JsonDecodingException r6 = kotlinx.serialization.json.internal.JsonExceptionsKt.f(r4, r6, r0)
            throw r6
        L_0x00c0:
            java.lang.Object r6 = r6.c(r5)
        L_0x00c4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonTreeDecoder.C(kotlinx.serialization.DeserializationStrategy):java.lang.Object");
    }

    public JsonElement C0() {
        return this.f42339d;
    }

    public final String D0(String str) {
        Intrinsics.i(str, "currentTag");
        return k0() + '.' + str;
    }

    public final Void E0(JsonPrimitive jsonPrimitive, String str, String str2) {
        StringBuilder sb;
        String str3;
        if (StringsKt.Q(str, "i", false, 2, (Object) null)) {
            sb = new StringBuilder();
            str3 = "an ";
        } else {
            sb = new StringBuilder();
            str3 = "a ";
        }
        sb.append(str3);
        sb.append(str);
        String sb2 = sb.toString();
        throw JsonExceptionsKt.f(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + sb2 + " value at element: " + D0(str2), o0().toString());
    }

    public SerializersModule a() {
        return d().a();
    }

    public void b(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
    }

    public CompositeDecoder c(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        JsonElement o0 = o0();
        SerialKind e2 = serialDescriptor.e();
        Class<JsonArray> cls = JsonArray.class;
        if (Intrinsics.d(e2, StructureKind.LIST.f42059a) || (e2 instanceof PolymorphicKind)) {
            Json d2 = d();
            String a2 = serialDescriptor.a();
            if (o0 instanceof JsonArray) {
                return new JsonTreeListDecoder(d2, (JsonArray) o0);
            }
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(cls).e() + ", but had " + Reflection.b(o0.getClass()).e() + " as the serialized body of " + a2 + " at element: " + k0(), o0.toString());
        }
        Class<JsonObject> cls2 = JsonObject.class;
        if (Intrinsics.d(e2, StructureKind.MAP.f42060a)) {
            Json d3 = d();
            SerialDescriptor a3 = WriteModeKt.a(serialDescriptor.j(0), d3.a());
            SerialKind e3 = a3.e();
            if ((e3 instanceof PrimitiveKind) || Intrinsics.d(e3, SerialKind.ENUM.f42057a)) {
                Json d4 = d();
                String a4 = serialDescriptor.a();
                if (o0 instanceof JsonObject) {
                    return new JsonTreeMapDecoder(d4, (JsonObject) o0);
                }
                throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(cls2).e() + ", but had " + Reflection.b(o0.getClass()).e() + " as the serialized body of " + a4 + " at element: " + k0(), o0.toString());
            } else if (d3.g().c()) {
                Json d5 = d();
                String a5 = serialDescriptor.a();
                if (o0 instanceof JsonArray) {
                    return new JsonTreeListDecoder(d5, (JsonArray) o0);
                }
                throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(cls).e() + ", but had " + Reflection.b(o0.getClass()).e() + " as the serialized body of " + a5 + " at element: " + k0(), o0.toString());
            } else {
                throw JsonExceptionsKt.d(a3);
            }
        } else {
            Json d6 = d();
            String a6 = serialDescriptor.a();
            if (o0 instanceof JsonObject) {
                return new JsonTreeDecoder(d6, (JsonObject) o0, this.f42340e, (SerialDescriptor) null, 8, (DefaultConstructorMarker) null);
            }
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(cls2).e() + ", but had " + Reflection.b(o0.getClass()).e() + " as the serialized body of " + a6 + " at element: " + k0(), o0.toString());
        }
    }

    public Json d() {
        return this.f42338c;
    }

    public String g0(String str, String str2) {
        Intrinsics.i(str, "parentName");
        Intrinsics.i(str2, "childName");
        return str2;
    }

    public JsonElement i() {
        return o0();
    }

    public abstract JsonElement n0(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = n0(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.json.JsonElement o0() {
        /*
            r1 = this;
            java.lang.Object r0 = r1.a0()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000e
            kotlinx.serialization.json.JsonElement r0 = r1.n0(r0)
            if (r0 != 0) goto L_0x0012
        L_0x000e:
            kotlinx.serialization.json.JsonElement r0 = r1.C0()
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonTreeDecoder.o0():kotlinx.serialization.json.JsonElement");
    }

    /* renamed from: p0 */
    public boolean N(String str) {
        Intrinsics.i(str, "tag");
        JsonElement n0 = n0(str);
        if (n0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) n0;
            try {
                Boolean e2 = JsonElementKt.e(jsonPrimitive);
                if (e2 != null) {
                    return e2.booleanValue();
                }
                E0(jsonPrimitive, "boolean", str);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                E0(jsonPrimitive, "boolean", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(n0.getClass()).e() + " as the serialized body of " + "boolean" + " at element: " + D0(str), n0.toString());
        }
    }

    /* renamed from: q0 */
    public byte O(String str) {
        Intrinsics.i(str, "tag");
        JsonElement n0 = n0(str);
        if (n0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) n0;
            try {
                int i2 = JsonElementKt.i(jsonPrimitive);
                Byte valueOf = (-128 > i2 || i2 > 127) ? null : Byte.valueOf((byte) i2);
                if (valueOf != null) {
                    return valueOf.byteValue();
                }
                E0(jsonPrimitive, "byte", str);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                E0(jsonPrimitive, "byte", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(n0.getClass()).e() + " as the serialized body of " + "byte" + " at element: " + D0(str), n0.toString());
        }
    }

    /* renamed from: r0 */
    public char P(String str) {
        Intrinsics.i(str, "tag");
        JsonElement n0 = n0(str);
        if (n0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) n0;
            try {
                return StringsKt.m1(jsonPrimitive.e());
            } catch (IllegalArgumentException unused) {
                E0(jsonPrimitive, "char", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(n0.getClass()).e() + " as the serialized body of " + "char" + " at element: " + D0(str), n0.toString());
        }
    }

    /* renamed from: s0 */
    public double Q(String str) {
        Intrinsics.i(str, "tag");
        JsonElement n0 = n0(str);
        if (n0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) n0;
            try {
                double g2 = JsonElementKt.g(jsonPrimitive);
                if (d().g().b() || (!Double.isInfinite(g2) && !Double.isNaN(g2))) {
                    return g2;
                }
                throw JsonExceptionsKt.a(Double.valueOf(g2), str, o0().toString());
            } catch (IllegalArgumentException unused) {
                E0(jsonPrimitive, "double", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(n0.getClass()).e() + " as the serialized body of " + "double" + " at element: " + D0(str), n0.toString());
        }
    }

    /* renamed from: t0 */
    public int R(String str, SerialDescriptor serialDescriptor) {
        Intrinsics.i(str, "tag");
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        Json d2 = d();
        JsonElement l0 = n0(str);
        String a2 = serialDescriptor.a();
        if (l0 instanceof JsonPrimitive) {
            return JsonNamesMapKt.l(serialDescriptor, d2, ((JsonPrimitive) l0).e(), (String) null, 4, (Object) null);
        }
        throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(l0.getClass()).e() + " as the serialized body of " + a2 + " at element: " + D0(str), l0.toString());
    }

    public boolean u() {
        return !(o0() instanceof JsonNull);
    }

    /* renamed from: u0 */
    public float S(String str) {
        Intrinsics.i(str, "tag");
        JsonElement n0 = n0(str);
        if (n0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) n0;
            try {
                float h2 = JsonElementKt.h(jsonPrimitive);
                if (d().g().b() || (!Float.isInfinite(h2) && !Float.isNaN(h2))) {
                    return h2;
                }
                throw JsonExceptionsKt.a(Float.valueOf(h2), str, o0().toString());
            } catch (IllegalArgumentException unused) {
                E0(jsonPrimitive, "float", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(n0.getClass()).e() + " as the serialized body of " + "float" + " at element: " + D0(str), n0.toString());
        }
    }

    /* renamed from: v0 */
    public Decoder T(String str, SerialDescriptor serialDescriptor) {
        Intrinsics.i(str, "tag");
        Intrinsics.i(serialDescriptor, "inlineDescriptor");
        if (!StreamingJsonEncoderKt.b(serialDescriptor)) {
            return super.T(str, serialDescriptor);
        }
        Json d2 = d();
        JsonElement l0 = n0(str);
        String a2 = serialDescriptor.a();
        if (l0 instanceof JsonPrimitive) {
            return new JsonDecoderForUnsignedTypes(StringJsonLexerKt.a(d2, ((JsonPrimitive) l0).e()), d());
        }
        throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(l0.getClass()).e() + " as the serialized body of " + a2 + " at element: " + D0(str), l0.toString());
    }

    /* renamed from: w0 */
    public int U(String str) {
        Intrinsics.i(str, "tag");
        JsonElement n0 = n0(str);
        if (n0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) n0;
            try {
                return JsonElementKt.i(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                E0(jsonPrimitive, "int", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(n0.getClass()).e() + " as the serialized body of " + "int" + " at element: " + D0(str), n0.toString());
        }
    }

    /* renamed from: x0 */
    public long V(String str) {
        Intrinsics.i(str, "tag");
        JsonElement n0 = n0(str);
        if (n0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) n0;
            try {
                return JsonElementKt.l(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                E0(jsonPrimitive, "long", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(n0.getClass()).e() + " as the serialized body of " + "long" + " at element: " + D0(str), n0.toString());
        }
    }

    /* renamed from: y0 */
    public boolean W(String str) {
        Intrinsics.i(str, "tag");
        return n0(str) != JsonNull.INSTANCE;
    }

    public Decoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return a0() != null ? super.z(serialDescriptor) : new JsonPrimitiveDecoder(d(), C0(), this.f42340e).z(serialDescriptor);
    }

    /* renamed from: z0 */
    public short X(String str) {
        Intrinsics.i(str, "tag");
        JsonElement n0 = n0(str);
        if (n0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) n0;
            try {
                int i2 = JsonElementKt.i(jsonPrimitive);
                Short valueOf = (-32768 > i2 || i2 > 32767) ? null : Short.valueOf((short) i2);
                if (valueOf != null) {
                    return valueOf.shortValue();
                }
                E0(jsonPrimitive, "short", str);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                E0(jsonPrimitive, "short", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonPrimitive.class).e() + ", but had " + Reflection.b(n0.getClass()).e() + " as the serialized body of " + "short" + " at element: " + D0(str), n0.toString());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, (i2 & 4) != 0 ? null : str, (DefaultConstructorMarker) null);
    }

    public AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str) {
        this.f42338c = json;
        this.f42339d = jsonElement;
        this.f42340e = str;
        this.f42341f = d().g();
    }
}
