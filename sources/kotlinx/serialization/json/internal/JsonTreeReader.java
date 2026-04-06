package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata
public final class JsonTreeReader {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractJsonLexer f42423a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f42424b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f42425c;

    /* renamed from: d  reason: collision with root package name */
    public int f42426d;

    public JsonTreeReader(JsonConfiguration jsonConfiguration, AbstractJsonLexer abstractJsonLexer) {
        Intrinsics.i(jsonConfiguration, "configuration");
        Intrinsics.i(abstractJsonLexer, "lexer");
        this.f42423a = abstractJsonLexer;
        this.f42424b = jsonConfiguration.q();
        this.f42425c = jsonConfiguration.d();
    }

    public final JsonElement e() {
        byte H = this.f42423a.H();
        if (H == 1) {
            return j(true);
        }
        if (H == 0) {
            return j(false);
        }
        if (H == 6) {
            int i2 = this.f42426d + 1;
            this.f42426d = i2;
            this.f42426d--;
            return i2 == 200 ? g() : i();
        } else if (H == 8) {
            return f();
        } else {
            AbstractJsonLexer.x(this.f42423a, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.c(H), 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public final JsonElement f() {
        byte j2 = this.f42423a.j();
        if (this.f42423a.H() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f42423a.e()) {
                arrayList.add(e());
                j2 = this.f42423a.j();
                if (j2 != 4) {
                    AbstractJsonLexer abstractJsonLexer = this.f42423a;
                    boolean z2 = j2 == 9;
                    int i2 = abstractJsonLexer.f42334a;
                    if (!z2) {
                        AbstractJsonLexer.x(abstractJsonLexer, "Expected end of the array or comma", i2, (String) null, 4, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (j2 == 8) {
                this.f42423a.k((byte) 9);
            } else if (j2 == 4) {
                if (this.f42425c) {
                    this.f42423a.k((byte) 9);
                } else {
                    JsonExceptionsKt.h(this.f42423a, "array");
                    throw new KotlinNothingValueException();
                }
            }
            return new JsonArray(arrayList);
        }
        AbstractJsonLexer.x(this.f42423a, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final JsonElement g() {
        return (JsonElement) DeepRecursiveKt.b(new DeepRecursiveFunction(new JsonTreeReader$readDeepRecursive$1(this, (Continuation) null)), Unit.f40552a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(kotlin.DeepRecursiveScope r21, kotlin.coroutines.Continuation r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            if (r2 == 0) goto L_0x0017
            r2 = r1
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r2 = (kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.I = r3
            goto L_0x001c
        L_0x0017:
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r2 = new kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.G
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.I
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r4 == 0) goto L_0x0048
            if (r4 != r8) goto L_0x0040
            java.lang.Object r4 = r2.F
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r2.E
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            java.lang.Object r10 = r2.D
            kotlinx.serialization.json.internal.JsonTreeReader r10 = (kotlinx.serialization.json.internal.JsonTreeReader) r10
            java.lang.Object r11 = r2.C
            kotlin.DeepRecursiveScope r11 = (kotlin.DeepRecursiveScope) r11
            kotlin.ResultKt.b(r1)
            goto L_0x00a0
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            kotlin.ResultKt.b(r1)
            kotlinx.serialization.json.internal.AbstractJsonLexer r1 = r0.f42423a
            byte r1 = r1.k(r5)
            kotlinx.serialization.json.internal.AbstractJsonLexer r4 = r0.f42423a
            byte r4 = r4.H()
            if (r4 == r7) goto L_0x00ee
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r10 = r0
            r9 = r4
            r4 = r2
            r2 = r1
            r1 = r21
        L_0x0064:
            kotlinx.serialization.json.internal.AbstractJsonLexer r11 = r10.f42423a
            boolean r11 = r11.e()
            if (r11 == 0) goto L_0x00c8
            boolean r2 = r10.f42424b
            if (r2 == 0) goto L_0x0077
            kotlinx.serialization.json.internal.AbstractJsonLexer r2 = r10.f42423a
            java.lang.String r2 = r2.q()
            goto L_0x007d
        L_0x0077:
            kotlinx.serialization.json.internal.AbstractJsonLexer r2 = r10.f42423a
            java.lang.String r2 = r2.o()
        L_0x007d:
            kotlinx.serialization.json.internal.AbstractJsonLexer r11 = r10.f42423a
            r12 = 5
            r11.k(r12)
            kotlin.Unit r11 = kotlin.Unit.f40552a
            r4.C = r1
            r4.D = r10
            r4.E = r9
            r4.F = r2
            r4.I = r8
            java.lang.Object r11 = r1.a(r11, r4)
            if (r11 != r3) goto L_0x0096
            return r3
        L_0x0096:
            r18 = r11
            r11 = r1
            r1 = r18
            r19 = r4
            r4 = r2
            r2 = r19
        L_0x00a0:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            r9.put(r4, r1)
            kotlinx.serialization.json.internal.AbstractJsonLexer r1 = r10.f42423a
            byte r1 = r1.j()
            if (r1 == r7) goto L_0x00c4
            if (r1 != r6) goto L_0x00b1
            r2 = r1
            goto L_0x00c8
        L_0x00b1:
            kotlinx.serialization.json.internal.AbstractJsonLexer r12 = r10.f42423a
            r16 = 6
            r17 = 0
            java.lang.String r13 = "Expected end of the object or comma"
            r14 = 0
            r15 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.x(r12, r13, r14, r15, r16, r17)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        L_0x00c4:
            r4 = r2
            r2 = r1
            r1 = r11
            goto L_0x0064
        L_0x00c8:
            if (r2 != r5) goto L_0x00d0
            kotlinx.serialization.json.internal.AbstractJsonLexer r1 = r10.f42423a
            r1.k(r6)
            goto L_0x00e8
        L_0x00d0:
            if (r2 != r7) goto L_0x00e8
            boolean r1 = r10.f42425c
            if (r1 == 0) goto L_0x00dc
            kotlinx.serialization.json.internal.AbstractJsonLexer r1 = r10.f42423a
            r1.k(r6)
            goto L_0x00e8
        L_0x00dc:
            kotlinx.serialization.json.internal.AbstractJsonLexer r1 = r10.f42423a
            r2 = 0
            kotlinx.serialization.json.internal.JsonExceptionsKt.i(r1, r2, r8, r2)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        L_0x00e8:
            kotlinx.serialization.json.JsonObject r1 = new kotlinx.serialization.json.JsonObject
            r1.<init>(r9)
            return r1
        L_0x00ee:
            kotlinx.serialization.json.internal.AbstractJsonLexer r2 = r0.f42423a
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Unexpected leading comma"
            r4 = 0
            r5 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.x(r2, r3, r4, r5, r6, r7)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.h(kotlin.DeepRecursiveScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final JsonElement i() {
        byte k2 = this.f42423a.k((byte) 6);
        if (this.f42423a.H() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f42423a.e()) {
                    break;
                }
                String q2 = this.f42424b ? this.f42423a.q() : this.f42423a.o();
                this.f42423a.k((byte) 5);
                linkedHashMap.put(q2, e());
                k2 = this.f42423a.j();
                if (k2 != 4) {
                    if (k2 != 7) {
                        AbstractJsonLexer.x(this.f42423a, "Expected end of the object or comma", 0, (String) null, 6, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (k2 == 6) {
                this.f42423a.k((byte) 7);
            } else if (k2 == 4) {
                if (this.f42425c) {
                    this.f42423a.k((byte) 7);
                } else {
                    JsonExceptionsKt.i(this.f42423a, (String) null, 1, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractJsonLexer.x(this.f42423a, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final JsonPrimitive j(boolean z2) {
        String q2 = (this.f42424b || !z2) ? this.f42423a.q() : this.f42423a.o();
        return (z2 || !Intrinsics.d(q2, "null")) ? new JsonLiteral(q2, z2, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null) : JsonNull.INSTANCE;
    }
}
