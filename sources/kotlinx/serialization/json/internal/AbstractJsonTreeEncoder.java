package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
@ExperimentalSerializationApi
abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {

    /* renamed from: b  reason: collision with root package name */
    public final Json f42342b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f42343c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonConfiguration f42344d;

    /* renamed from: e  reason: collision with root package name */
    public String f42345e;

    /* renamed from: f  reason: collision with root package name */
    public String f42346f;

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    public static final Unit i0(AbstractJsonTreeEncoder abstractJsonTreeEncoder, JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "node");
        abstractJsonTreeEncoder.A0((String) abstractJsonTreeEncoder.Y(), jsonElement);
        return Unit.f40552a;
    }

    public abstract void A0(String str, JsonElement jsonElement);

    public void X(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        this.f42343c.invoke(w0());
    }

    public final SerializersModule a() {
        return this.f42342b.a();
    }

    public CompositeEncoder c(SerialDescriptor serialDescriptor) {
        AbstractJsonTreeEncoder abstractJsonTreeEncoder;
        Intrinsics.i(serialDescriptor, "descriptor");
        Function1 aVar = Z() == null ? this.f42343c : new a(this);
        SerialKind e2 = serialDescriptor.e();
        if (Intrinsics.d(e2, StructureKind.LIST.f42059a) || (e2 instanceof PolymorphicKind)) {
            abstractJsonTreeEncoder = new JsonTreeListEncoder(this.f42342b, aVar);
        } else if (Intrinsics.d(e2, StructureKind.MAP.f42060a)) {
            Json json = this.f42342b;
            SerialDescriptor a2 = WriteModeKt.a(serialDescriptor.j(0), json.a());
            SerialKind e3 = a2.e();
            if ((e3 instanceof PrimitiveKind) || Intrinsics.d(e3, SerialKind.ENUM.f42057a)) {
                abstractJsonTreeEncoder = new JsonTreeMapEncoder(this.f42342b, aVar);
            } else if (json.g().c()) {
                abstractJsonTreeEncoder = new JsonTreeListEncoder(this.f42342b, aVar);
            } else {
                throw JsonExceptionsKt.d(a2);
            }
        } else {
            abstractJsonTreeEncoder = new JsonTreeEncoder(this.f42342b, aVar);
        }
        String str = this.f42345e;
        if (str != null) {
            if (abstractJsonTreeEncoder instanceof JsonTreeMapEncoder) {
                JsonTreeMapEncoder jsonTreeMapEncoder = (JsonTreeMapEncoder) abstractJsonTreeEncoder;
                jsonTreeMapEncoder.A0("key", JsonElementKt.c(str));
                String str2 = this.f42346f;
                if (str2 == null) {
                    str2 = serialDescriptor.a();
                }
                jsonTreeMapEncoder.A0("value", JsonElementKt.c(str2));
            } else {
                String str3 = this.f42346f;
                if (str3 == null) {
                    str3 = serialDescriptor.a();
                }
                abstractJsonTreeEncoder.A0(str, JsonElementKt.c(str3));
            }
            this.f42345e = null;
            this.f42346f = null;
        }
        return abstractJsonTreeEncoder;
    }

    public final Json d() {
        return this.f42342b;
    }

    public String d0(String str, String str2) {
        Intrinsics.i(str, "parentName");
        Intrinsics.i(str2, "childName");
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (d().g().f() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        if (kotlin.jvm.internal.Intrinsics.d(r1, kotlinx.serialization.descriptors.StructureKind.OBJECT.f42061a) == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(kotlinx.serialization.SerializationStrategy r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            java.lang.Object r0 = r3.Z()
            if (r0 != 0) goto L_0x002c
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.a()
            kotlinx.serialization.modules.SerializersModule r1 = r3.a()
            kotlinx.serialization.descriptors.SerialDescriptor r0 = kotlinx.serialization.json.internal.WriteModeKt.a(r0, r1)
            boolean r0 = kotlinx.serialization.json.internal.TreeJsonEncoderKt.c(r0)
            if (r0 != 0) goto L_0x001e
            goto L_0x002c
        L_0x001e:
            kotlinx.serialization.json.internal.JsonPrimitiveEncoder r0 = new kotlinx.serialization.json.internal.JsonPrimitiveEncoder
            kotlinx.serialization.json.Json r1 = r3.f42342b
            kotlin.jvm.functions.Function1 r2 = r3.f42343c
            r0.<init>(r1, r2)
            r0.e(r4, r5)
            goto L_0x00f4
        L_0x002c:
            kotlinx.serialization.json.Json r0 = r3.d()
            kotlinx.serialization.json.JsonConfiguration r0 = r0.g()
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x003f
            r4.d(r3, r5)
            goto L_0x00f4
        L_0x003f:
            boolean r0 = r4 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer
            if (r0 == 0) goto L_0x0054
            kotlinx.serialization.json.Json r1 = r3.d()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.g()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L_0x009c
            goto L_0x0089
        L_0x0054:
            kotlinx.serialization.json.Json r1 = r3.d()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.g()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f()
            int[] r2 = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.f42428a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x009c
            r2 = 2
            if (r1 == r2) goto L_0x009c
            r2 = 3
            if (r1 != r2) goto L_0x0096
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.a()
            kotlinx.serialization.descriptors.SerialKind r1 = r1.e()
            kotlinx.serialization.descriptors.StructureKind$CLASS r2 = kotlinx.serialization.descriptors.StructureKind.CLASS.f42058a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r2 != 0) goto L_0x0089
            kotlinx.serialization.descriptors.StructureKind$OBJECT r2 = kotlinx.serialization.descriptors.StructureKind.OBJECT.f42061a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto L_0x009c
        L_0x0089:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.a()
            kotlinx.serialization.json.Json r2 = r3.d()
            java.lang.String r1 = kotlinx.serialization.json.internal.PolymorphicKt.c(r1, r2)
            goto L_0x009d
        L_0x0096:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x009c:
            r1 = 0
        L_0x009d:
            if (r0 == 0) goto L_0x00e3
            r0 = r4
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r0 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r0
            if (r5 == 0) goto L_0x00bf
            kotlinx.serialization.SerializationStrategy r0 = kotlinx.serialization.PolymorphicSerializerKt.b(r0, r3, r5)
            if (r1 == 0) goto L_0x00ad
            kotlinx.serialization.json.internal.PolymorphicKt.e(r4, r0, r1)
        L_0x00ad:
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r0.a()
            kotlinx.serialization.descriptors.SerialKind r4 = r4.e()
            kotlinx.serialization.json.internal.PolymorphicKt.b(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.Intrinsics.g(r0, r4)
            r4 = r0
            goto L_0x00e3
        L_0x00bf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Value for serializer "
            r4.append(r5)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r0.a()
            r4.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L_0x00e3:
            if (r1 == 0) goto L_0x00f1
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.a()
            java.lang.String r0 = r0.a()
            r3.f42345e = r1
            r3.f42346f = r0
        L_0x00f1:
            r4.d(r3, r5)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.e(kotlinx.serialization.SerializationStrategy, java.lang.Object):void");
    }

    public String e0(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return JsonNamesMapKt.i(serialDescriptor, this.f42342b, i2);
    }

    public void f() {
        String str = (String) Z();
        if (str == null) {
            this.f42343c.invoke(JsonNull.INSTANCE);
        } else {
            T(str);
        }
    }

    /* renamed from: j0 */
    public void J(String str, boolean z2) {
        Intrinsics.i(str, "tag");
        A0(str, JsonElementKt.a(Boolean.valueOf(z2)));
    }

    /* renamed from: k0 */
    public void K(String str, byte b2) {
        Intrinsics.i(str, "tag");
        A0(str, JsonElementKt.b(Byte.valueOf(b2)));
    }

    /* renamed from: l0 */
    public void L(String str, char c2) {
        Intrinsics.i(str, "tag");
        A0(str, JsonElementKt.c(String.valueOf(c2)));
    }

    /* renamed from: m0 */
    public void M(String str, double d2) {
        Intrinsics.i(str, "tag");
        A0(str, JsonElementKt.b(Double.valueOf(d2)));
        if (this.f42344d.b()) {
            return;
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw JsonExceptionsKt.c(Double.valueOf(d2), str, w0().toString());
        }
    }

    /* renamed from: n0 */
    public void N(String str, SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(str, "tag");
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        A0(str, JsonElementKt.c(serialDescriptor.g(i2)));
    }

    /* renamed from: o0 */
    public void O(String str, float f2) {
        Intrinsics.i(str, "tag");
        A0(str, JsonElementKt.b(Float.valueOf(f2)));
        if (this.f42344d.b()) {
            return;
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw JsonExceptionsKt.c(Float.valueOf(f2), str, w0().toString());
        }
    }

    /* renamed from: p0 */
    public Encoder P(String str, SerialDescriptor serialDescriptor) {
        Intrinsics.i(str, "tag");
        Intrinsics.i(serialDescriptor, "inlineDescriptor");
        return StreamingJsonEncoderKt.b(serialDescriptor) ? z0(str) : StreamingJsonEncoderKt.a(serialDescriptor) ? y0(str, serialDescriptor) : super.P(str, serialDescriptor);
    }

    public void q() {
    }

    /* renamed from: q0 */
    public void Q(String str, int i2) {
        Intrinsics.i(str, "tag");
        A0(str, JsonElementKt.b(Integer.valueOf(i2)));
    }

    /* renamed from: r0 */
    public void R(String str, long j2) {
        Intrinsics.i(str, "tag");
        A0(str, JsonElementKt.b(Long.valueOf(j2)));
    }

    /* renamed from: s0 */
    public void T(String str) {
        Intrinsics.i(str, "tag");
        A0(str, JsonNull.INSTANCE);
    }

    /* renamed from: t0 */
    public void U(String str, short s2) {
        Intrinsics.i(str, "tag");
        A0(str, JsonElementKt.b(Short.valueOf(s2)));
    }

    /* renamed from: u0 */
    public void V(String str, String str2) {
        Intrinsics.i(str, "tag");
        Intrinsics.i(str2, "value");
        A0(str, JsonElementKt.c(str2));
    }

    /* renamed from: v0 */
    public void W(String str, Object obj) {
        Intrinsics.i(str, "tag");
        Intrinsics.i(obj, "value");
        A0(str, JsonElementKt.c(obj.toString()));
    }

    public boolean w(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return this.f42344d.i();
    }

    public abstract JsonElement w0();

    public void x(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "element");
        if (this.f42345e == null || (jsonElement instanceof JsonObject)) {
            e(JsonElementSerializer.f42310a, jsonElement);
        } else {
            PolymorphicKt.d(this.f42346f, jsonElement);
            throw new KotlinNothingValueException();
        }
    }

    public final Function1 x0() {
        return this.f42343c;
    }

    public final AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1 y0(String str, SerialDescriptor serialDescriptor) {
        return new AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1(this, str, serialDescriptor);
    }

    public Encoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (Z() == null) {
            return new JsonPrimitiveEncoder(this.f42342b, this.f42343c).z(serialDescriptor);
        }
        if (this.f42345e != null) {
            this.f42346f = serialDescriptor.a();
        }
        return super.z(serialDescriptor);
    }

    public final AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1 z0(String str) {
        return new AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1(this, str);
    }

    public AbstractJsonTreeEncoder(Json json, Function1 function1) {
        this.f42342b = json;
        this.f42343c = function1;
        this.f42344d = json.g();
    }
}
