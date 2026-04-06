package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class JsonConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f42290a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f42291b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f42292c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f42293d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f42294e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f42295f;

    /* renamed from: g  reason: collision with root package name */
    public final String f42296g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f42297h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f42298i;

    /* renamed from: j  reason: collision with root package name */
    public final String f42299j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f42300k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f42301l;

    /* renamed from: m  reason: collision with root package name */
    public final JsonNamingStrategy f42302m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f42303n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f42304o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f42305p;

    /* renamed from: q  reason: collision with root package name */
    public ClassDiscriminatorMode f42306q;

    public JsonConfiguration(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, boolean z8, boolean z9, String str2, boolean z10, boolean z11, JsonNamingStrategy jsonNamingStrategy, boolean z12, boolean z13, boolean z14, ClassDiscriminatorMode classDiscriminatorMode) {
        ClassDiscriminatorMode classDiscriminatorMode2 = classDiscriminatorMode;
        Intrinsics.i(str, "prettyPrintIndent");
        Intrinsics.i(str2, "classDiscriminator");
        Intrinsics.i(classDiscriminatorMode2, "classDiscriminatorMode");
        this.f42290a = z2;
        this.f42291b = z3;
        this.f42292c = z4;
        this.f42293d = z5;
        this.f42294e = z6;
        this.f42295f = z7;
        this.f42296g = str;
        this.f42297h = z8;
        this.f42298i = z9;
        this.f42299j = str2;
        this.f42300k = z10;
        this.f42301l = z11;
        this.f42302m = jsonNamingStrategy;
        this.f42303n = z12;
        this.f42304o = z13;
        this.f42305p = z14;
        this.f42306q = classDiscriminatorMode2;
    }

    public final boolean a() {
        return this.f42305p;
    }

    public final boolean b() {
        return this.f42300k;
    }

    public final boolean c() {
        return this.f42293d;
    }

    public final boolean d() {
        return this.f42304o;
    }

    public final String e() {
        return this.f42299j;
    }

    public final ClassDiscriminatorMode f() {
        return this.f42306q;
    }

    public final boolean g() {
        return this.f42297h;
    }

    public final boolean h() {
        return this.f42303n;
    }

    public final boolean i() {
        return this.f42290a;
    }

    public final boolean j() {
        return this.f42295f;
    }

    public final boolean k() {
        return this.f42291b;
    }

    public final JsonNamingStrategy l() {
        return this.f42302m;
    }

    public final boolean m() {
        return this.f42294e;
    }

    public final String n() {
        return this.f42296g;
    }

    public final boolean o() {
        return this.f42301l;
    }

    public final boolean p() {
        return this.f42298i;
    }

    public final boolean q() {
        return this.f42292c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f42290a + ", ignoreUnknownKeys=" + this.f42291b + ", isLenient=" + this.f42292c + ", allowStructuredMapKeys=" + this.f42293d + ", prettyPrint=" + this.f42294e + ", explicitNulls=" + this.f42295f + ", prettyPrintIndent='" + this.f42296g + "', coerceInputValues=" + this.f42297h + ", useArrayPolymorphism=" + this.f42298i + ", classDiscriminator='" + this.f42299j + "', allowSpecialFloatingPointValues=" + this.f42300k + ", useAlternativeNames=" + this.f42301l + ", namingStrategy=" + this.f42302m + ", decodeEnumsCaseInsensitive=" + this.f42303n + ", allowTrailingComma=" + this.f42304o + ", allowComments=" + this.f42305p + ", classDiscriminatorMode=" + this.f42306q + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ JsonConfiguration(boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, java.lang.String r25, boolean r26, boolean r27, java.lang.String r28, boolean r29, boolean r30, kotlinx.serialization.json.JsonNamingStrategy r31, boolean r32, boolean r33, boolean r34, kotlinx.serialization.json.ClassDiscriminatorMode r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r22
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r23
        L_0x002a:
            r7 = r0 & 32
            r8 = 1
            if (r7 == 0) goto L_0x0031
            r7 = r8
            goto L_0x0033
        L_0x0031:
            r7 = r24
        L_0x0033:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            java.lang.String r9 = "    "
            goto L_0x003c
        L_0x003a:
            r9 = r25
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r26
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r27
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0053
            java.lang.String r12 = "type"
            goto L_0x0055
        L_0x0053:
            r12 = r28
        L_0x0055:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005b
            r13 = 0
            goto L_0x005d
        L_0x005b:
            r13 = r29
        L_0x005d:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r8 = r30
        L_0x0064:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006a
            r14 = 0
            goto L_0x006c
        L_0x006a:
            r14 = r31
        L_0x006c:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0072
            r15 = 0
            goto L_0x0074
        L_0x0072:
            r15 = r32
        L_0x0074:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x007a
            r2 = 0
            goto L_0x007c
        L_0x007a:
            r2 = r33
        L_0x007c:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0086
            r16 = 0
            goto L_0x0088
        L_0x0086:
            r16 = r34
        L_0x0088:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x0091
            kotlinx.serialization.json.ClassDiscriminatorMode r0 = kotlinx.serialization.json.ClassDiscriminatorMode.POLYMORPHIC
            goto L_0x0093
        L_0x0091:
            r0 = r35
        L_0x0093:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r8
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.JsonConfiguration.<init>(boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, kotlinx.serialization.json.JsonNamingStrategy, boolean, boolean, boolean, kotlinx.serialization.json.ClassDiscriminatorMode, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
