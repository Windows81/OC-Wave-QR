package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {

    /* renamed from: a  reason: collision with root package name */
    public final Composer f42444a;

    /* renamed from: b  reason: collision with root package name */
    public final Json f42445b;

    /* renamed from: c  reason: collision with root package name */
    public final WriteMode f42446c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonEncoder[] f42447d;

    /* renamed from: e  reason: collision with root package name */
    public final SerializersModule f42448e;

    /* renamed from: f  reason: collision with root package name */
    public final JsonConfiguration f42449f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f42450g;

    /* renamed from: h  reason: collision with root package name */
    public String f42451h;

    /* renamed from: i  reason: collision with root package name */
    public String f42452i;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42453a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
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
                f42453a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonEncoder.WhenMappings.<clinit>():void");
        }
    }

    public StreamingJsonEncoder(Composer composer, Json json, WriteMode writeMode, JsonEncoder[] jsonEncoderArr) {
        Intrinsics.i(composer, "composer");
        Intrinsics.i(json, "json");
        Intrinsics.i(writeMode, "mode");
        this.f42444a = composer;
        this.f42445b = json;
        this.f42446c = writeMode;
        this.f42447d = jsonEncoderArr;
        this.f42448e = d().a();
        this.f42449f = d().g();
        int ordinal = writeMode.ordinal();
        if (jsonEncoderArr != null) {
            JsonEncoder jsonEncoder = jsonEncoderArr[ordinal];
            if (jsonEncoder != null || jsonEncoder != this) {
                jsonEncoderArr[ordinal] = this;
            }
        }
    }

    public void D(long j2) {
        if (this.f42450g) {
            G(String.valueOf(j2));
        } else {
            this.f42444a.j(j2);
        }
    }

    public void G(String str) {
        Intrinsics.i(str, "value");
        this.f42444a.n(str);
    }

    public boolean H(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        int i3 = WhenMappings.f42453a[this.f42446c.ordinal()];
        if (i3 != 1) {
            boolean z2 = false;
            if (i3 != 2) {
                if (i3 != 3) {
                    if (!this.f42444a.a()) {
                        this.f42444a.f(',');
                    }
                    this.f42444a.c();
                    G(JsonNamesMapKt.i(serialDescriptor, d(), i2));
                    this.f42444a.f(':');
                    this.f42444a.p();
                } else {
                    if (i2 == 0) {
                        this.f42450g = true;
                    }
                    if (i2 == 1) {
                        this.f42444a.f(',');
                        this.f42444a.p();
                        this.f42450g = false;
                    }
                }
            } else if (!this.f42444a.a()) {
                if (i2 % 2 == 0) {
                    this.f42444a.f(',');
                    this.f42444a.c();
                    z2 = true;
                } else {
                    this.f42444a.f(':');
                    this.f42444a.p();
                }
                this.f42450g = z2;
            } else {
                this.f42450g = true;
                this.f42444a.c();
            }
        } else {
            if (!this.f42444a.a()) {
                this.f42444a.f(',');
            }
            this.f42444a.c();
        }
        return true;
    }

    public final void K(String str, String str2) {
        this.f42444a.c();
        G(str);
        this.f42444a.f(':');
        this.f42444a.p();
        G(str2);
    }

    public SerializersModule a() {
        return this.f42448e;
    }

    public void b(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (this.f42446c.f42459A != 0) {
            this.f42444a.q();
            this.f42444a.d();
            this.f42444a.f(this.f42446c.f42459A);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r5 = r5[r0.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlinx.serialization.encoding.CompositeEncoder c(kotlinx.serialization.descriptors.SerialDescriptor r5) {
        /*
            r4 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            kotlinx.serialization.json.Json r0 = r4.d()
            kotlinx.serialization.json.internal.WriteMode r0 = kotlinx.serialization.json.internal.WriteModeKt.b(r0, r5)
            char r1 = r0.f42460z
            if (r1 == 0) goto L_0x001b
            kotlinx.serialization.json.internal.Composer r2 = r4.f42444a
            r2.f(r1)
            kotlinx.serialization.json.internal.Composer r1 = r4.f42444a
            r1.b()
        L_0x001b:
            java.lang.String r1 = r4.f42451h
            if (r1 == 0) goto L_0x002f
            java.lang.String r2 = r4.f42452i
            if (r2 != 0) goto L_0x0027
            java.lang.String r2 = r5.a()
        L_0x0027:
            r4.K(r1, r2)
            r5 = 0
            r4.f42451h = r5
            r4.f42452i = r5
        L_0x002f:
            kotlinx.serialization.json.internal.WriteMode r5 = r4.f42446c
            if (r5 != r0) goto L_0x0034
            return r4
        L_0x0034:
            kotlinx.serialization.json.JsonEncoder[] r5 = r4.f42447d
            if (r5 == 0) goto L_0x0041
            int r1 = r0.ordinal()
            r5 = r5[r1]
            if (r5 == 0) goto L_0x0041
            goto L_0x004e
        L_0x0041:
            kotlinx.serialization.json.internal.StreamingJsonEncoder r5 = new kotlinx.serialization.json.internal.StreamingJsonEncoder
            kotlinx.serialization.json.internal.Composer r1 = r4.f42444a
            kotlinx.serialization.json.Json r2 = r4.d()
            kotlinx.serialization.json.JsonEncoder[] r3 = r4.f42447d
            r5.<init>((kotlinx.serialization.json.internal.Composer) r1, (kotlinx.serialization.json.Json) r2, (kotlinx.serialization.json.internal.WriteMode) r0, (kotlinx.serialization.json.JsonEncoder[]) r3)
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonEncoder.c(kotlinx.serialization.descriptors.SerialDescriptor):kotlinx.serialization.encoding.CompositeEncoder");
    }

    public Json d() {
        return this.f42445b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (kotlin.jvm.internal.Intrinsics.d(r1, kotlinx.serialization.descriptors.StructureKind.OBJECT.f42061a) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (d().g().f() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(kotlinx.serialization.SerializationStrategy r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            kotlinx.serialization.json.Json r0 = r3.d()
            kotlinx.serialization.json.JsonConfiguration r0 = r0.g()
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x0018
            r4.d(r3, r5)
            goto L_0x00cd
        L_0x0018:
            boolean r0 = r4 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer
            if (r0 == 0) goto L_0x002d
            kotlinx.serialization.json.Json r1 = r3.d()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.g()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L_0x0075
            goto L_0x0062
        L_0x002d:
            kotlinx.serialization.json.Json r1 = r3.d()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.g()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f()
            int[] r2 = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.f42428a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x0075
            r2 = 2
            if (r1 == r2) goto L_0x0075
            r2 = 3
            if (r1 != r2) goto L_0x006f
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.a()
            kotlinx.serialization.descriptors.SerialKind r1 = r1.e()
            kotlinx.serialization.descriptors.StructureKind$CLASS r2 = kotlinx.serialization.descriptors.StructureKind.CLASS.f42058a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r2 != 0) goto L_0x0062
            kotlinx.serialization.descriptors.StructureKind$OBJECT r2 = kotlinx.serialization.descriptors.StructureKind.OBJECT.f42061a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto L_0x0075
        L_0x0062:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.a()
            kotlinx.serialization.json.Json r2 = r3.d()
            java.lang.String r1 = kotlinx.serialization.json.internal.PolymorphicKt.c(r1, r2)
            goto L_0x0076
        L_0x006f:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0075:
            r1 = 0
        L_0x0076:
            if (r0 == 0) goto L_0x00bc
            r0 = r4
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r0 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r0
            if (r5 == 0) goto L_0x0098
            kotlinx.serialization.SerializationStrategy r0 = kotlinx.serialization.PolymorphicSerializerKt.b(r0, r3, r5)
            if (r1 == 0) goto L_0x0086
            kotlinx.serialization.json.internal.PolymorphicKt.e(r4, r0, r1)
        L_0x0086:
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r0.a()
            kotlinx.serialization.descriptors.SerialKind r4 = r4.e()
            kotlinx.serialization.json.internal.PolymorphicKt.b(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.Intrinsics.g(r0, r4)
            r4 = r0
            goto L_0x00bc
        L_0x0098:
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
        L_0x00bc:
            if (r1 == 0) goto L_0x00ca
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.a()
            java.lang.String r0 = r0.a()
            r3.f42451h = r1
            r3.f42452i = r0
        L_0x00ca:
            r4.d(r3, r5)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonEncoder.e(kotlinx.serialization.SerializationStrategy, java.lang.Object):void");
    }

    public void f() {
        this.f42444a.k("null");
    }

    public void i(double d2) {
        if (this.f42450g) {
            G(String.valueOf(d2));
        } else {
            this.f42444a.g(d2);
        }
        if (this.f42449f.b()) {
            return;
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw JsonExceptionsKt.b(Double.valueOf(d2), this.f42444a.f42371a.toString());
        }
    }

    public void j(short s2) {
        if (this.f42450g) {
            G(String.valueOf(s2));
        } else {
            this.f42444a.l(s2);
        }
    }

    public void k(byte b2) {
        if (this.f42450g) {
            G(String.valueOf(b2));
        } else {
            this.f42444a.e(b2);
        }
    }

    public void l(boolean z2) {
        if (this.f42450g) {
            G(String.valueOf(z2));
        } else {
            this.f42444a.m(z2);
        }
    }

    public void m(SerialDescriptor serialDescriptor, int i2, SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(serializationStrategy, "serializer");
        if (obj != null || this.f42449f.j()) {
            super.m(serialDescriptor, i2, serializationStrategy, obj);
        }
    }

    public void o(float f2) {
        if (this.f42450g) {
            G(String.valueOf(f2));
        } else {
            this.f42444a.h(f2);
        }
        if (this.f42449f.b()) {
            return;
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw JsonExceptionsKt.b(Float.valueOf(f2), this.f42444a.f42371a.toString());
        }
    }

    public void p(char c2) {
        G(String.valueOf(c2));
    }

    public void v(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "enumDescriptor");
        G(serialDescriptor.g(i2));
    }

    public boolean w(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return this.f42449f.i();
    }

    public void x(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "element");
        if (this.f42451h == null || (jsonElement instanceof JsonObject)) {
            e(JsonElementSerializer.f42310a, jsonElement);
        } else {
            PolymorphicKt.d(this.f42452i, jsonElement);
            throw new KotlinNothingValueException();
        }
    }

    public void y(int i2) {
        if (this.f42450g) {
            G(String.valueOf(i2));
        } else {
            this.f42444a.i(i2);
        }
    }

    public Encoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (StreamingJsonEncoderKt.b(serialDescriptor)) {
            Composer composer = this.f42444a;
            if (!(composer instanceof ComposerForUnsignedNumbers)) {
                composer = new ComposerForUnsignedNumbers(composer.f42371a, this.f42450g);
            }
            return new StreamingJsonEncoder(composer, d(), this.f42446c, (JsonEncoder[]) null);
        } else if (StreamingJsonEncoderKt.a(serialDescriptor)) {
            Composer composer2 = this.f42444a;
            if (!(composer2 instanceof ComposerForUnquotedLiterals)) {
                composer2 = new ComposerForUnquotedLiterals(composer2.f42371a, this.f42450g);
            }
            return new StreamingJsonEncoder(composer2, d(), this.f42446c, (JsonEncoder[]) null);
        } else if (this.f42451h == null) {
            return super.z(serialDescriptor);
        } else {
            this.f42452i = serialDescriptor.a();
            return this;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StreamingJsonEncoder(InternalJsonWriter internalJsonWriter, Json json, WriteMode writeMode, JsonEncoder[] jsonEncoderArr) {
        this(ComposersKt.a(internalJsonWriter, json), json, writeMode, jsonEncoderArr);
        Intrinsics.i(internalJsonWriter, "output");
        Intrinsics.i(json, "json");
        Intrinsics.i(writeMode, "mode");
        Intrinsics.i(jsonEncoderArr, "modeReuseCache");
    }
}
