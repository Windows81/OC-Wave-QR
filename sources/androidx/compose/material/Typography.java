package androidx.compose.material;

import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Typography {

    /* renamed from: a  reason: collision with root package name */
    public final TextStyle f8926a;

    /* renamed from: b  reason: collision with root package name */
    public final TextStyle f8927b;

    /* renamed from: c  reason: collision with root package name */
    public final TextStyle f8928c;

    /* renamed from: d  reason: collision with root package name */
    public final TextStyle f8929d;

    /* renamed from: e  reason: collision with root package name */
    public final TextStyle f8930e;

    /* renamed from: f  reason: collision with root package name */
    public final TextStyle f8931f;

    /* renamed from: g  reason: collision with root package name */
    public final TextStyle f8932g;

    /* renamed from: h  reason: collision with root package name */
    public final TextStyle f8933h;

    /* renamed from: i  reason: collision with root package name */
    public final TextStyle f8934i;

    /* renamed from: j  reason: collision with root package name */
    public final TextStyle f8935j;

    /* renamed from: k  reason: collision with root package name */
    public final TextStyle f8936k;

    /* renamed from: l  reason: collision with root package name */
    public final TextStyle f8937l;

    /* renamed from: m  reason: collision with root package name */
    public final TextStyle f8938m;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.f8926a = textStyle;
        this.f8927b = textStyle2;
        this.f8928c = textStyle3;
        this.f8929d = textStyle4;
        this.f8930e = textStyle5;
        this.f8931f = textStyle6;
        this.f8932g = textStyle7;
        this.f8933h = textStyle8;
        this.f8934i = textStyle9;
        this.f8935j = textStyle10;
        this.f8936k = textStyle11;
        this.f8937l = textStyle12;
        this.f8938m = textStyle13;
    }

    public final TextStyle a() {
        return this.f8934i;
    }

    public final TextStyle b() {
        return this.f8935j;
    }

    public final TextStyle c() {
        return this.f8936k;
    }

    public final TextStyle d() {
        return this.f8937l;
    }

    public final TextStyle e() {
        return this.f8931f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return Intrinsics.d(this.f8926a, typography.f8926a) && Intrinsics.d(this.f8927b, typography.f8927b) && Intrinsics.d(this.f8928c, typography.f8928c) && Intrinsics.d(this.f8929d, typography.f8929d) && Intrinsics.d(this.f8930e, typography.f8930e) && Intrinsics.d(this.f8931f, typography.f8931f) && Intrinsics.d(this.f8932g, typography.f8932g) && Intrinsics.d(this.f8933h, typography.f8933h) && Intrinsics.d(this.f8934i, typography.f8934i) && Intrinsics.d(this.f8935j, typography.f8935j) && Intrinsics.d(this.f8936k, typography.f8936k) && Intrinsics.d(this.f8937l, typography.f8937l) && Intrinsics.d(this.f8938m, typography.f8938m);
    }

    public final TextStyle f() {
        return this.f8938m;
    }

    public final TextStyle g() {
        return this.f8932g;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f8926a.hashCode() * 31) + this.f8927b.hashCode()) * 31) + this.f8928c.hashCode()) * 31) + this.f8929d.hashCode()) * 31) + this.f8930e.hashCode()) * 31) + this.f8931f.hashCode()) * 31) + this.f8932g.hashCode()) * 31) + this.f8933h.hashCode()) * 31) + this.f8934i.hashCode()) * 31) + this.f8935j.hashCode()) * 31) + this.f8936k.hashCode()) * 31) + this.f8937l.hashCode()) * 31) + this.f8938m.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.f8926a + ", h2=" + this.f8927b + ", h3=" + this.f8928c + ", h4=" + this.f8929d + ", h5=" + this.f8930e + ", h6=" + this.f8931f + ", subtitle1=" + this.f8932g + ", subtitle2=" + this.f8933h + ", body1=" + this.f8934i + ", body2=" + this.f8935j + ", button=" + this.f8936k + ", caption=" + this.f8937l + ", overline=" + this.f8938m + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Typography(androidx.compose.ui.text.font.FontFamily r49, androidx.compose.ui.text.TextStyle r50, androidx.compose.ui.text.TextStyle r51, androidx.compose.ui.text.TextStyle r52, androidx.compose.ui.text.TextStyle r53, androidx.compose.ui.text.TextStyle r54, androidx.compose.ui.text.TextStyle r55, androidx.compose.ui.text.TextStyle r56, androidx.compose.ui.text.TextStyle r57, androidx.compose.ui.text.TextStyle r58, androidx.compose.ui.text.TextStyle r59, androidx.compose.ui.text.TextStyle r60, androidx.compose.ui.text.TextStyle r61, androidx.compose.ui.text.TextStyle r62, int r63, kotlin.jvm.internal.DefaultConstructorMarker r64) {
        /*
            r48 = this;
            r0 = r63
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.text.font.FontFamily$Companion r1 = androidx.compose.ui.text.font.FontFamily.f18695A
            androidx.compose.ui.text.font.SystemFontFamily r1 = r1.b()
            goto L_0x000f
        L_0x000d:
            r1 = r49
        L_0x000f:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x005c
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r2 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r8 = r2.e()
            r2 = 96
            long r6 = androidx.compose.ui.unit.TextUnitKt.i(r2)
            r2 = 112(0x70, float:1.57E-43)
            long r25 = androidx.compose.ui.unit.TextUnitKt.i(r2)
            r4 = -4613937818241073152(0xbff8000000000000, double:-1.5)
            long r13 = androidx.compose.ui.unit.TextUnitKt.g(r4)
            r33 = 16646009(0xfdff79, float:2.3326027E-38)
            r34 = 0
            r4 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            androidx.compose.ui.text.TextStyle r2 = androidx.compose.ui.text.TextStyle.c(r3, r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x005e
        L_0x005c:
            r2 = r50
        L_0x005e:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x00ac
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r3 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r9 = r3.e()
            r3 = 60
            long r7 = androidx.compose.ui.unit.TextUnitKt.i(r3)
            r3 = 72
            long r26 = androidx.compose.ui.unit.TextUnitKt.i(r3)
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            long r14 = androidx.compose.ui.unit.TextUnitKt.g(r5)
            r34 = 16646009(0xfdff79, float:2.3326027E-38)
            r35 = 0
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.ui.text.TextStyle.c(r4, r5, r7, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x00ae
        L_0x00ac:
            r3 = r51
        L_0x00ae:
            r4 = r0 & 8
            r5 = 0
            if (r4 == 0) goto L_0x00fb
            androidx.compose.ui.text.TextStyle r6 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r4 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r11 = r4.g()
            r4 = 48
            long r9 = androidx.compose.ui.unit.TextUnitKt.i(r4)
            r4 = 56
            long r28 = androidx.compose.ui.unit.TextUnitKt.i(r4)
            long r16 = androidx.compose.ui.unit.TextUnitKt.i(r5)
            r36 = 16646009(0xfdff79, float:2.3326027E-38)
            r37 = 0
            r7 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.ui.text.TextStyle.c(r6, r7, r9, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x00fd
        L_0x00fb:
            r4 = r52
        L_0x00fd:
            r6 = r0 & 16
            r7 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            if (r6 == 0) goto L_0x014e
            androidx.compose.ui.text.TextStyle r9 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r6 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r14 = r6.g()
            r6 = 34
            long r12 = androidx.compose.ui.unit.TextUnitKt.i(r6)
            r6 = 36
            long r31 = androidx.compose.ui.unit.TextUnitKt.i(r6)
            long r19 = androidx.compose.ui.unit.TextUnitKt.g(r7)
            r39 = 16646009(0xfdff79, float:2.3326027E-38)
            r40 = 0
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            androidx.compose.ui.text.TextStyle r6 = androidx.compose.ui.text.TextStyle.c(r9, r10, r12, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x0150
        L_0x014e:
            r6 = r53
        L_0x0150:
            r9 = r0 & 32
            r10 = 24
            if (r9 == 0) goto L_0x019e
            androidx.compose.ui.text.TextStyle r11 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r16 = r9.g()
            long r14 = androidx.compose.ui.unit.TextUnitKt.i(r10)
            long r33 = androidx.compose.ui.unit.TextUnitKt.i(r10)
            long r21 = androidx.compose.ui.unit.TextUnitKt.i(r5)
            r41 = 16646009(0xfdff79, float:2.3326027E-38)
            r42 = 0
            r12 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.ui.text.TextStyle.c(r11, r12, r14, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r42)
            goto L_0x01a0
        L_0x019e:
            r5 = r54
        L_0x01a0:
            r9 = r0 & 64
            r11 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            r13 = 20
            if (r9 == 0) goto L_0x01f3
            androidx.compose.ui.text.TextStyle r14 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r19 = r9.f()
            long r17 = androidx.compose.ui.unit.TextUnitKt.i(r13)
            long r36 = androidx.compose.ui.unit.TextUnitKt.i(r10)
            long r24 = androidx.compose.ui.unit.TextUnitKt.g(r11)
            r44 = 16646009(0xfdff79, float:2.3326027E-38)
            r45 = 0
            r15 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            androidx.compose.ui.text.TextStyle r9 = androidx.compose.ui.text.TextStyle.c(r14, r15, r17, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r44, r45)
            goto L_0x01f5
        L_0x01f3:
            r9 = r55
        L_0x01f5:
            r14 = r0 & 128(0x80, float:1.794E-43)
            r15 = 16
            if (r14 == 0) goto L_0x0243
            androidx.compose.ui.text.TextStyle r16 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r14 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r21 = r14.g()
            long r19 = androidx.compose.ui.unit.TextUnitKt.i(r15)
            long r38 = androidx.compose.ui.unit.TextUnitKt.i(r10)
            long r26 = androidx.compose.ui.unit.TextUnitKt.g(r11)
            r46 = 16646009(0xfdff79, float:2.3326027E-38)
            r47 = 0
            r17 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            androidx.compose.ui.text.TextStyle r11 = androidx.compose.ui.text.TextStyle.c(r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x0245
        L_0x0243:
            r11 = r56
        L_0x0245:
            r12 = r0 & 256(0x100, float:3.59E-43)
            r14 = 14
            if (r12 == 0) goto L_0x0298
            androidx.compose.ui.text.TextStyle r16 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r12 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r21 = r12.f()
            long r19 = androidx.compose.ui.unit.TextUnitKt.i(r14)
            long r38 = androidx.compose.ui.unit.TextUnitKt.i(r10)
            r17 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            long r26 = androidx.compose.ui.unit.TextUnitKt.g(r17)
            r46 = 16646009(0xfdff79, float:2.3326027E-38)
            r47 = 0
            r17 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            androidx.compose.ui.text.TextStyle r12 = androidx.compose.ui.text.TextStyle.c(r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x029a
        L_0x0298:
            r12 = r57
        L_0x029a:
            r7 = r0 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x02e8
            androidx.compose.ui.text.TextStyle r16 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r7 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r21 = r7.g()
            long r19 = androidx.compose.ui.unit.TextUnitKt.i(r15)
            long r38 = androidx.compose.ui.unit.TextUnitKt.i(r10)
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            long r26 = androidx.compose.ui.unit.TextUnitKt.g(r7)
            r46 = 16646009(0xfdff79, float:2.3326027E-38)
            r47 = 0
            r17 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            androidx.compose.ui.text.TextStyle r7 = androidx.compose.ui.text.TextStyle.c(r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x02ea
        L_0x02e8:
            r7 = r58
        L_0x02ea:
            r8 = r0 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0338
            androidx.compose.ui.text.TextStyle r16 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r8 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r21 = r8.g()
            long r19 = androidx.compose.ui.unit.TextUnitKt.i(r14)
            long r38 = androidx.compose.ui.unit.TextUnitKt.i(r13)
            r17 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            long r26 = androidx.compose.ui.unit.TextUnitKt.g(r17)
            r46 = 16646009(0xfdff79, float:2.3326027E-38)
            r47 = 0
            r17 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            androidx.compose.ui.text.TextStyle r8 = androidx.compose.ui.text.TextStyle.c(r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x033a
        L_0x0338:
            r8 = r59
        L_0x033a:
            r10 = r0 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0388
            androidx.compose.ui.text.TextStyle r16 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r10 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r21 = r10.f()
            long r19 = androidx.compose.ui.unit.TextUnitKt.i(r14)
            long r38 = androidx.compose.ui.unit.TextUnitKt.i(r15)
            r13 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            long r26 = androidx.compose.ui.unit.TextUnitKt.g(r13)
            r46 = 16646009(0xfdff79, float:2.3326027E-38)
            r47 = 0
            r17 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            androidx.compose.ui.text.TextStyle r10 = androidx.compose.ui.text.TextStyle.c(r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x038a
        L_0x0388:
            r10 = r60
        L_0x038a:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x03dd
            androidx.compose.ui.text.TextStyle r16 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r13 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r21 = r13.g()
            r13 = 12
            long r19 = androidx.compose.ui.unit.TextUnitKt.i(r13)
            long r38 = androidx.compose.ui.unit.TextUnitKt.i(r15)
            r13 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            long r26 = androidx.compose.ui.unit.TextUnitKt.g(r13)
            r46 = 16646009(0xfdff79, float:2.3326027E-38)
            r47 = 0
            r17 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            androidx.compose.ui.text.TextStyle r13 = androidx.compose.ui.text.TextStyle.c(r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x03df
        L_0x03dd:
            r13 = r61
        L_0x03df:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x042f
            androidx.compose.ui.text.TextStyle r16 = androidx.compose.material.TypographyKt.b()
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r21 = r0.g()
            r0 = 10
            long r19 = androidx.compose.ui.unit.TextUnitKt.i(r0)
            long r38 = androidx.compose.ui.unit.TextUnitKt.i(r15)
            r14 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            long r26 = androidx.compose.ui.unit.TextUnitKt.g(r14)
            r46 = 16646009(0xfdff79, float:2.3326027E-38)
            r47 = 0
            r17 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            androidx.compose.ui.text.TextStyle r0 = androidx.compose.ui.text.TextStyle.c(r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x0431
        L_0x042f:
            r0 = r62
        L_0x0431:
            r49 = r48
            r50 = r1
            r51 = r2
            r52 = r3
            r53 = r4
            r54 = r6
            r55 = r5
            r56 = r9
            r57 = r11
            r58 = r12
            r59 = r7
            r60 = r8
            r61 = r10
            r62 = r13
            r63 = r0
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Typography(androidx.compose.ui.text.font.FontFamily r1, androidx.compose.ui.text.TextStyle r2, androidx.compose.ui.text.TextStyle r3, androidx.compose.ui.text.TextStyle r4, androidx.compose.ui.text.TextStyle r5, androidx.compose.ui.text.TextStyle r6, androidx.compose.ui.text.TextStyle r7, androidx.compose.ui.text.TextStyle r8, androidx.compose.ui.text.TextStyle r9, androidx.compose.ui.text.TextStyle r10, androidx.compose.ui.text.TextStyle r11, androidx.compose.ui.text.TextStyle r12, androidx.compose.ui.text.TextStyle r13, androidx.compose.ui.text.TextStyle r14) {
        /*
            r0 = this;
            androidx.compose.ui.text.TextStyle r2 = androidx.compose.material.TypographyKt.d(r2, r1)
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.material.TypographyKt.d(r3, r1)
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material.TypographyKt.d(r4, r1)
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material.TypographyKt.d(r5, r1)
            androidx.compose.ui.text.TextStyle r6 = androidx.compose.material.TypographyKt.d(r6, r1)
            androidx.compose.ui.text.TextStyle r7 = androidx.compose.material.TypographyKt.d(r7, r1)
            androidx.compose.ui.text.TextStyle r8 = androidx.compose.material.TypographyKt.d(r8, r1)
            androidx.compose.ui.text.TextStyle r9 = androidx.compose.material.TypographyKt.d(r9, r1)
            androidx.compose.ui.text.TextStyle r10 = androidx.compose.material.TypographyKt.d(r10, r1)
            androidx.compose.ui.text.TextStyle r11 = androidx.compose.material.TypographyKt.d(r11, r1)
            androidx.compose.ui.text.TextStyle r12 = androidx.compose.material.TypographyKt.d(r12, r1)
            androidx.compose.ui.text.TextStyle r13 = androidx.compose.material.TypographyKt.d(r13, r1)
            androidx.compose.ui.text.TextStyle r14 = androidx.compose.material.TypographyKt.d(r14, r1)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle):void");
    }
}
