package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.ChunkedDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder, ChunkedDecoder {

    /* renamed from: a  reason: collision with root package name */
    public final Json f42434a;

    /* renamed from: b  reason: collision with root package name */
    public final WriteMode f42435b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractJsonLexer f42436c;

    /* renamed from: d  reason: collision with root package name */
    public final SerializersModule f42437d;

    /* renamed from: e  reason: collision with root package name */
    public int f42438e = -1;

    /* renamed from: f  reason: collision with root package name */
    public DiscriminatorHolder f42439f;

    /* renamed from: g  reason: collision with root package name */
    public final JsonConfiguration f42440g;

    /* renamed from: h  reason: collision with root package name */
    public final JsonElementMarker f42441h;

    @Metadata
    public static final class DiscriminatorHolder {

        /* renamed from: a  reason: collision with root package name */
        public String f42442a;

        public DiscriminatorHolder(String str) {
            this.f42442a = str;
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42443a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                kotlinx.serialization.json.internal.WriteMode[] r0 = kotlinx.serialization.json.internal.WriteMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.serialization.json.internal.WriteMode r1 = kotlinx.serialization.json.internal.WriteMode.LIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlinx.serialization.json.internal.WriteMode r1 = kotlinx.serialization.json.internal.WriteMode.MAP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlinx.serialization.json.internal.WriteMode r1 = kotlinx.serialization.json.internal.WriteMode.POLY_OBJ     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kotlinx.serialization.json.internal.WriteMode r1 = kotlinx.serialization.json.internal.WriteMode.OBJ     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f42443a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonDecoder.WhenMappings.<clinit>():void");
        }
    }

    public StreamingJsonDecoder(Json json, WriteMode writeMode, AbstractJsonLexer abstractJsonLexer, SerialDescriptor serialDescriptor, DiscriminatorHolder discriminatorHolder) {
        Intrinsics.i(json, "json");
        Intrinsics.i(writeMode, "mode");
        Intrinsics.i(abstractJsonLexer, "lexer");
        Intrinsics.i(serialDescriptor, "descriptor");
        this.f42434a = json;
        this.f42435b = writeMode;
        this.f42436c = abstractJsonLexer;
        this.f42437d = json.a();
        this.f42439f = discriminatorHolder;
        JsonConfiguration g2 = json.g();
        this.f42440g = g2;
        this.f42441h = g2.j() ? null : new JsonElementMarker(serialDescriptor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        r4 = kotlinx.serialization.json.JsonElementKt.j(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object C(kotlinx.serialization.DeserializationStrategy r12) {
        /*
            r11 = this;
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 2
            r1 = 0
            boolean r2 = r12 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer     // Catch:{ MissingFieldException -> 0x0080 }
            if (r2 == 0) goto L_0x0144
            kotlinx.serialization.json.Json r2 = r11.f42434a     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.JsonConfiguration r2 = r2.g()     // Catch:{ MissingFieldException -> 0x0080 }
            boolean r2 = r2.p()     // Catch:{ MissingFieldException -> 0x0080 }
            if (r2 == 0) goto L_0x0019
            goto L_0x0144
        L_0x0019:
            r2 = r12
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r2 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r2     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.a()     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.Json r3 = r11.f42434a     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = kotlinx.serialization.json.internal.PolymorphicKt.c(r2, r3)     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.internal.AbstractJsonLexer r3 = r11.f42436c     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.JsonConfiguration r4 = r11.f42440g     // Catch:{ MissingFieldException -> 0x0080 }
            boolean r4 = r4.q()     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r3 = r3.G(r2, r4)     // Catch:{ MissingFieldException -> 0x0080 }
            if (r3 != 0) goto L_0x00fe
            boolean r2 = r12 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer     // Catch:{ MissingFieldException -> 0x0080 }
            if (r2 == 0) goto L_0x00f9
            kotlinx.serialization.json.Json r2 = r11.d()     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.JsonConfiguration r2 = r2.g()     // Catch:{ MissingFieldException -> 0x0080 }
            boolean r2 = r2.p()     // Catch:{ MissingFieldException -> 0x0080 }
            if (r2 == 0) goto L_0x0048
            goto L_0x00f9
        L_0x0048:
            r2 = r12
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r2 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r2     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.a()     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.Json r3 = r11.d()     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = kotlinx.serialization.json.internal.PolymorphicKt.c(r2, r3)     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.JsonElement r3 = r11.i()     // Catch:{ MissingFieldException -> 0x0080 }
            r4 = r12
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r4 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r4     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r4.a()     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r4 = r4.a()     // Catch:{ MissingFieldException -> 0x0080 }
            boolean r5 = r3 instanceof kotlinx.serialization.json.JsonObject     // Catch:{ MissingFieldException -> 0x0080 }
            r6 = -1
            if (r5 == 0) goto L_0x00a9
            kotlinx.serialization.json.JsonObject r3 = (kotlinx.serialization.json.JsonObject) r3     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.Object r4 = r3.get(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.JsonElement r4 = (kotlinx.serialization.json.JsonElement) r4     // Catch:{ MissingFieldException -> 0x0080 }
            if (r4 == 0) goto L_0x0083
            kotlinx.serialization.json.JsonPrimitive r4 = kotlinx.serialization.json.JsonElementKt.j(r4)     // Catch:{ MissingFieldException -> 0x0080 }
            if (r4 == 0) goto L_0x0083
            java.lang.String r4 = kotlinx.serialization.json.JsonElementKt.f(r4)     // Catch:{ MissingFieldException -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r12 = move-exception
            goto L_0x0149
        L_0x0083:
            r4 = r1
        L_0x0084:
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r12 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r12     // Catch:{ SerializationException -> 0x0098 }
            kotlinx.serialization.DeserializationStrategy r12 = kotlinx.serialization.PolymorphicSerializerKt.a(r12, r11, r4)     // Catch:{ SerializationException -> 0x0098 }
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>"
            kotlin.jvm.internal.Intrinsics.g(r12, r4)     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.Json r4 = r11.d()     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.Object r12 = kotlinx.serialization.json.internal.TreeJsonDecoderKt.b(r4, r2, r3, r12)     // Catch:{ MissingFieldException -> 0x0080 }
            goto L_0x00fd
        L_0x0098:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()     // Catch:{ MissingFieldException -> 0x0080 }
            kotlin.jvm.internal.Intrinsics.f(r12)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = r3.toString()     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.internal.JsonDecodingException r12 = kotlinx.serialization.json.internal.JsonExceptionsKt.f(r6, r12, r2)     // Catch:{ MissingFieldException -> 0x0080 }
            throw r12     // Catch:{ MissingFieldException -> 0x0080 }
        L_0x00a9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ MissingFieldException -> 0x0080 }
            r12.<init>()     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = "Expected "
            r12.append(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.Class<kotlinx.serialization.json.JsonObject> r2 = kotlinx.serialization.json.JsonObject.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.b(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = r2.e()     // Catch:{ MissingFieldException -> 0x0080 }
            r12.append(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = ", but had "
            r12.append(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.Class r2 = r3.getClass()     // Catch:{ MissingFieldException -> 0x0080 }
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.b(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = r2.e()     // Catch:{ MissingFieldException -> 0x0080 }
            r12.append(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = " as the serialized body of "
            r12.append(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            r12.append(r4)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = " at element: "
            r12.append(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.internal.AbstractJsonLexer r2 = r11.f42436c     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.internal.JsonPath r2 = r2.f42335b     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = r2.a()     // Catch:{ MissingFieldException -> 0x0080 }
            r12.append(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r12 = r12.toString()     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = r3.toString()     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.internal.JsonDecodingException r12 = kotlinx.serialization.json.internal.JsonExceptionsKt.f(r6, r12, r2)     // Catch:{ MissingFieldException -> 0x0080 }
            throw r12     // Catch:{ MissingFieldException -> 0x0080 }
        L_0x00f9:
            java.lang.Object r12 = r12.c(r11)     // Catch:{ MissingFieldException -> 0x0080 }
        L_0x00fd:
            return r12
        L_0x00fe:
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r12 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r12     // Catch:{ SerializationException -> 0x0115 }
            kotlinx.serialization.DeserializationStrategy r12 = kotlinx.serialization.PolymorphicSerializerKt.a(r12, r11, r3)     // Catch:{ SerializationException -> 0x0115 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>"
            kotlin.jvm.internal.Intrinsics.g(r12, r3)     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.internal.StreamingJsonDecoder$DiscriminatorHolder r3 = new kotlinx.serialization.json.internal.StreamingJsonDecoder$DiscriminatorHolder     // Catch:{ MissingFieldException -> 0x0080 }
            r3.<init>(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            r11.f42439f = r3     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.Object r12 = r12.c(r11)     // Catch:{ MissingFieldException -> 0x0080 }
            return r12
        L_0x0115:
            r12 = move-exception
            java.lang.String r2 = r12.getMessage()     // Catch:{ MissingFieldException -> 0x0080 }
            kotlin.jvm.internal.Intrinsics.f(r2)     // Catch:{ MissingFieldException -> 0x0080 }
            r3 = 10
            java.lang.String r2 = kotlin.text.StringsKt.b1(r2, r3, r1, r0, r1)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r4 = "."
            java.lang.String r6 = kotlin.text.StringsKt.E0(r2, r4)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ MissingFieldException -> 0x0080 }
            kotlin.jvm.internal.Intrinsics.f(r12)     // Catch:{ MissingFieldException -> 0x0080 }
            java.lang.String r2 = ""
            java.lang.String r8 = kotlin.text.StringsKt.U0(r12, r3, r2)     // Catch:{ MissingFieldException -> 0x0080 }
            kotlinx.serialization.json.internal.AbstractJsonLexer r5 = r11.f42436c     // Catch:{ MissingFieldException -> 0x0080 }
            r9 = 2
            r10 = 0
            r7 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.x(r5, r6, r7, r8, r9, r10)     // Catch:{ MissingFieldException -> 0x0080 }
            kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException     // Catch:{ MissingFieldException -> 0x0080 }
            r12.<init>()     // Catch:{ MissingFieldException -> 0x0080 }
            throw r12     // Catch:{ MissingFieldException -> 0x0080 }
        L_0x0144:
            java.lang.Object r12 = r12.c(r11)     // Catch:{ MissingFieldException -> 0x0080 }
            return r12
        L_0x0149:
            java.lang.String r2 = r12.getMessage()
            kotlin.jvm.internal.Intrinsics.f(r2)
            java.lang.String r3 = "at path"
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.W(r2, r3, r4, r0, r1)
            if (r0 == 0) goto L_0x015a
            throw r12
        L_0x015a:
            kotlinx.serialization.MissingFieldException r0 = new kotlinx.serialization.MissingFieldException
            java.util.List r1 = r12.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.getMessage()
            r2.append(r3)
            java.lang.String r3 = " at path: "
            r2.append(r3)
            kotlinx.serialization.json.internal.AbstractJsonLexer r3 = r11.f42436c
            kotlinx.serialization.json.internal.JsonPath r3 = r3.f42335b
            java.lang.String r3 = r3.a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonDecoder.C(kotlinx.serialization.DeserializationStrategy):java.lang.Object");
    }

    public byte D() {
        long m2 = this.f42436c.m();
        byte b2 = (byte) ((int) m2);
        if (m2 == ((long) b2)) {
            return b2;
        }
        AbstractJsonLexer abstractJsonLexer = this.f42436c;
        AbstractJsonLexer.x(abstractJsonLexer, "Failed to parse byte for input '" + m2 + '\'', 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public short E() {
        long m2 = this.f42436c.m();
        short s2 = (short) ((int) m2);
        if (m2 == ((long) s2)) {
            return s2;
        }
        AbstractJsonLexer abstractJsonLexer = this.f42436c;
        AbstractJsonLexer.x(abstractJsonLexer, "Failed to parse short for input '" + m2 + '\'', 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public float F() {
        AbstractJsonLexer abstractJsonLexer = this.f42436c;
        String q2 = abstractJsonLexer.q();
        try {
            float parseFloat = Float.parseFloat(q2);
            if (this.f42434a.g().b() || (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            JsonExceptionsKt.l(this.f42436c, Float.valueOf(parseFloat));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.x(abstractJsonLexer, "Failed to parse type '" + "float" + "' for input '" + q2 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public double H() {
        AbstractJsonLexer abstractJsonLexer = this.f42436c;
        String q2 = abstractJsonLexer.q();
        try {
            double parseDouble = Double.parseDouble(q2);
            if (this.f42434a.g().b() || (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            JsonExceptionsKt.l(this.f42436c, Double.valueOf(parseDouble));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.x(abstractJsonLexer, "Failed to parse type '" + "double" + "' for input '" + q2 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public final void K() {
        if (this.f42436c.H() == 4) {
            AbstractJsonLexer.x(this.f42436c, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public final boolean L(SerialDescriptor serialDescriptor, int i2) {
        String I;
        Json json = this.f42434a;
        boolean k2 = serialDescriptor.k(i2);
        SerialDescriptor j2 = serialDescriptor.j(i2);
        if (k2 && !j2.c() && this.f42436c.P(true)) {
            return true;
        }
        if (Intrinsics.d(j2.e(), SerialKind.ENUM.f42057a) && ((!j2.c() || !this.f42436c.P(false)) && (I = this.f42436c.I(this.f42440g.q())) != null)) {
            int j3 = JsonNamesMapKt.j(j2, json, I);
            boolean z2 = !json.g().j() && j2.c();
            if (j3 == -3 && (k2 || z2)) {
                this.f42436c.o();
                return true;
            }
        }
        return false;
    }

    public final int M() {
        boolean O = this.f42436c.O();
        if (this.f42436c.e()) {
            int i2 = this.f42438e;
            if (i2 == -1 || O) {
                int i3 = i2 + 1;
                this.f42438e = i3;
                return i3;
            }
            AbstractJsonLexer.x(this.f42436c, "Expected end of the array or comma", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        } else if (!O || this.f42434a.g().d()) {
            return -1;
        } else {
            JsonExceptionsKt.h(this.f42436c, "array");
            throw new KotlinNothingValueException();
        }
    }

    public final int N() {
        int i2 = this.f42438e;
        boolean z2 = false;
        boolean z3 = i2 % 2 != 0;
        if (!z3) {
            this.f42436c.l(':');
        } else if (i2 != -1) {
            z2 = this.f42436c.O();
        }
        if (this.f42436c.e()) {
            if (z3) {
                if (this.f42438e == -1) {
                    AbstractJsonLexer abstractJsonLexer = this.f42436c;
                    int i3 = abstractJsonLexer.f42334a;
                    if (z2) {
                        AbstractJsonLexer.x(abstractJsonLexer, "Unexpected leading comma", i3, (String) null, 4, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    AbstractJsonLexer abstractJsonLexer2 = this.f42436c;
                    int i4 = abstractJsonLexer2.f42334a;
                    if (!z2) {
                        AbstractJsonLexer.x(abstractJsonLexer2, "Expected comma after the key-value pair", i4, (String) null, 4, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            int i5 = this.f42438e + 1;
            this.f42438e = i5;
            return i5;
        } else if (!z2 || this.f42434a.g().d()) {
            return -1;
        } else {
            JsonExceptionsKt.i(this.f42436c, (String) null, 1, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public final int O(SerialDescriptor serialDescriptor) {
        int j2;
        boolean z2;
        boolean O = this.f42436c.O();
        while (true) {
            boolean z3 = true;
            if (this.f42436c.e()) {
                String P = P();
                this.f42436c.l(':');
                j2 = JsonNamesMapKt.j(serialDescriptor, this.f42434a, P);
                if (j2 == -3) {
                    z2 = false;
                } else if (!this.f42440g.g() || !L(serialDescriptor, j2)) {
                    JsonElementMarker jsonElementMarker = this.f42441h;
                } else {
                    z2 = this.f42436c.O();
                    z3 = false;
                }
                O = z3 ? Q(P) : z2;
            } else if (!O || this.f42434a.g().d()) {
                JsonElementMarker jsonElementMarker2 = this.f42441h;
                if (jsonElementMarker2 != null) {
                    return jsonElementMarker2.d();
                }
                return -1;
            } else {
                JsonExceptionsKt.i(this.f42436c, (String) null, 1, (Object) null);
                throw new KotlinNothingValueException();
            }
        }
        JsonElementMarker jsonElementMarker3 = this.f42441h;
        if (jsonElementMarker3 != null) {
            jsonElementMarker3.c(j2);
        }
        return j2;
    }

    public final String P() {
        return this.f42440g.q() ? this.f42436c.r() : this.f42436c.i();
    }

    public final boolean Q(String str) {
        if (this.f42440g.k() || S(this.f42439f, str)) {
            this.f42436c.K(this.f42440g.q());
        } else {
            this.f42436c.A(str);
        }
        return this.f42436c.O();
    }

    public final void R(SerialDescriptor serialDescriptor) {
        do {
        } while (x(serialDescriptor) != -1);
    }

    public final boolean S(DiscriminatorHolder discriminatorHolder, String str) {
        if (discriminatorHolder == null || !Intrinsics.d(discriminatorHolder.f42442a, str)) {
            return false;
        }
        discriminatorHolder.f42442a = null;
        return true;
    }

    public SerializersModule a() {
        return this.f42437d;
    }

    public void b(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (this.f42434a.g().k() && serialDescriptor.f() == 0) {
            R(serialDescriptor);
        }
        if (!this.f42436c.O() || this.f42434a.g().d()) {
            this.f42436c.l(this.f42435b.f42459A);
            this.f42436c.f42335b.b();
            return;
        }
        JsonExceptionsKt.h(this.f42436c, "");
        throw new KotlinNothingValueException();
    }

    public CompositeDecoder c(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        WriteMode b2 = WriteModeKt.b(this.f42434a, serialDescriptor);
        this.f42436c.f42335b.c(serialDescriptor);
        this.f42436c.l(b2.f42460z);
        K();
        int i2 = WhenMappings.f42443a[b2.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return new StreamingJsonDecoder(this.f42434a, b2, this.f42436c, serialDescriptor, this.f42439f);
        } else if (this.f42435b == b2 && this.f42434a.g().j()) {
            return this;
        } else {
            return new StreamingJsonDecoder(this.f42434a, b2, this.f42436c, serialDescriptor, this.f42439f);
        }
    }

    public final Json d() {
        return this.f42434a;
    }

    public boolean e() {
        return this.f42436c.g();
    }

    public char f() {
        String q2 = this.f42436c.q();
        if (q2.length() == 1) {
            return q2.charAt(0);
        }
        AbstractJsonLexer abstractJsonLexer = this.f42436c;
        AbstractJsonLexer.x(abstractJsonLexer, "Expected single char, but got '" + q2 + '\'', 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public int g(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        Json json = this.f42434a;
        String n2 = n();
        return JsonNamesMapKt.k(serialDescriptor, json, n2, " at path " + this.f42436c.f42335b.a());
    }

    public JsonElement i() {
        return new JsonTreeReader(this.f42434a.g(), this.f42436c).e();
    }

    public int j() {
        long m2 = this.f42436c.m();
        int i2 = (int) m2;
        if (m2 == ((long) i2)) {
            return i2;
        }
        AbstractJsonLexer abstractJsonLexer = this.f42436c;
        AbstractJsonLexer.x(abstractJsonLexer, "Failed to parse int for input '" + m2 + '\'', 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public Void l() {
        return null;
    }

    public Object m(SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(deserializationStrategy, "deserializer");
        boolean z2 = this.f42435b == WriteMode.MAP && (i2 & 1) == 0;
        if (z2) {
            this.f42436c.f42335b.d();
        }
        Object m2 = super.m(serialDescriptor, i2, deserializationStrategy, obj);
        if (z2) {
            this.f42436c.f42335b.f(m2);
        }
        return m2;
    }

    public String n() {
        return this.f42440g.q() ? this.f42436c.r() : this.f42436c.o();
    }

    public long r() {
        return this.f42436c.m();
    }

    public boolean u() {
        JsonElementMarker jsonElementMarker = this.f42441h;
        return !(jsonElementMarker != null ? jsonElementMarker.b() : false) && !AbstractJsonLexer.Q(this.f42436c, false, 1, (Object) null);
    }

    public int x(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        int i2 = WhenMappings.f42443a[this.f42435b.ordinal()];
        int M = i2 != 2 ? i2 != 4 ? M() : O(serialDescriptor) : N();
        if (this.f42435b != WriteMode.MAP) {
            this.f42436c.f42335b.g(M);
        }
        return M;
    }

    public Decoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return StreamingJsonEncoderKt.b(serialDescriptor) ? new JsonDecoderForUnsignedTypes(this.f42436c, this.f42434a) : super.z(serialDescriptor);
    }
}
