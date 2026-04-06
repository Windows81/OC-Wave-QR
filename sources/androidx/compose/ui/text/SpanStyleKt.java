package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SpanStyleKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f18447a = TextUnitKt.i(14);

    /* renamed from: b  reason: collision with root package name */
    public static final long f18448b = TextUnitKt.i(0);

    /* renamed from: c  reason: collision with root package name */
    public static final long f18449c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f18450d;

    /* renamed from: e  reason: collision with root package name */
    public static final TextForegroundStyle f18451e;

    static {
        Color.Companion companion = Color.f15975b;
        f18449c = companion.e();
        long a2 = companion.a();
        f18450d = a2;
        f18451e = TextForegroundStyle.f19102a.b(a2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00f9: MOVE  (r14v2 androidx.compose.ui.text.intl.LocaleList) = (r39v0 androidx.compose.ui.text.intl.LocaleList)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0196  */
    public static final androidx.compose.ui.text.SpanStyle b(androidx.compose.ui.text.SpanStyle r23, long r24, androidx.compose.ui.graphics.Brush r26, float r27, long r28, androidx.compose.ui.text.font.FontWeight r30, androidx.compose.ui.text.font.FontStyle r31, androidx.compose.ui.text.font.FontSynthesis r32, androidx.compose.ui.text.font.FontFamily r33, java.lang.String r34, long r35, androidx.compose.ui.text.style.BaselineShift r37, androidx.compose.ui.text.style.TextGeometricTransform r38, androidx.compose.ui.text.intl.LocaleList r39, long r40, androidx.compose.ui.text.style.TextDecoration r42, androidx.compose.ui.graphics.Shadow r43, androidx.compose.ui.text.PlatformSpanStyle r44, androidx.compose.ui.graphics.drawscope.DrawStyle r45) {
        /*
            r0 = r23
            r1 = r24
            r3 = r26
            r4 = r27
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r15 = r42
            r0 = r43
            long r16 = androidx.compose.ui.unit.TextUnit.f(r28)
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            r17 = 0
            r20 = 1
            if (r16 != 0) goto L_0x002f
            r16 = r20
            goto L_0x0031
        L_0x002f:
            r16 = r17
        L_0x0031:
            r21 = 16
            if (r16 != 0) goto L_0x004e
            long r13 = r23.k()
            r11 = r28
            boolean r13 = androidx.compose.ui.unit.TextUnit.e(r11, r13)
            if (r13 == 0) goto L_0x0042
            goto L_0x0050
        L_0x0042:
            r0 = r23
            r13 = r38
        L_0x0046:
            r11 = r40
        L_0x0048:
            r14 = r44
        L_0x004a:
            r15 = r45
            goto L_0x0154
        L_0x004e:
            r11 = r28
        L_0x0050:
            if (r3 != 0) goto L_0x0064
            int r13 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r13 == 0) goto L_0x0064
            androidx.compose.ui.text.style.TextForegroundStyle r13 = r23.t()
            long r13 = r13.g()
            boolean r13 = androidx.compose.ui.graphics.Color.n(r1, r13)
            if (r13 == 0) goto L_0x0042
        L_0x0064:
            if (r6 == 0) goto L_0x0070
            androidx.compose.ui.text.font.FontStyle r13 = r23.l()
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r6, r13)
            if (r13 == 0) goto L_0x0042
        L_0x0070:
            if (r5 == 0) goto L_0x007c
            androidx.compose.ui.text.font.FontWeight r13 = r23.n()
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r5, r13)
            if (r13 == 0) goto L_0x0042
        L_0x007c:
            if (r8 == 0) goto L_0x0084
            androidx.compose.ui.text.font.FontFamily r13 = r23.i()
            if (r8 != r13) goto L_0x0042
        L_0x0084:
            long r13 = androidx.compose.ui.unit.TextUnit.f(r35)
            int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x008e
            r17 = r20
        L_0x008e:
            if (r17 != 0) goto L_0x009d
            long r13 = r23.o()
            r11 = r35
            boolean r13 = androidx.compose.ui.unit.TextUnit.e(r11, r13)
            if (r13 == 0) goto L_0x0042
            goto L_0x009f
        L_0x009d:
            r11 = r35
        L_0x009f:
            if (r15 == 0) goto L_0x00ab
            androidx.compose.ui.text.style.TextDecoration r13 = r23.s()
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r15, r13)
            if (r13 == 0) goto L_0x0042
        L_0x00ab:
            androidx.compose.ui.text.style.TextForegroundStyle r13 = r23.t()
            androidx.compose.ui.graphics.Brush r13 = r13.d()
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r3, r13)
            if (r13 == 0) goto L_0x0042
            if (r3 == 0) goto L_0x00c7
            androidx.compose.ui.text.style.TextForegroundStyle r13 = r23.t()
            float r13 = r13.c()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x0042
        L_0x00c7:
            if (r7 == 0) goto L_0x00d3
            androidx.compose.ui.text.font.FontSynthesis r13 = r23.m()
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r7, r13)
            if (r13 == 0) goto L_0x0042
        L_0x00d3:
            if (r9 == 0) goto L_0x00df
            java.lang.String r13 = r23.j()
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r9, r13)
            if (r13 == 0) goto L_0x0042
        L_0x00df:
            if (r10 == 0) goto L_0x00eb
            androidx.compose.ui.text.style.BaselineShift r13 = r23.e()
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r10, r13)
            if (r13 == 0) goto L_0x0042
        L_0x00eb:
            r13 = r38
            if (r13 == 0) goto L_0x00f9
            androidx.compose.ui.text.style.TextGeometricTransform r14 = r23.u()
            boolean r14 = kotlin.jvm.internal.Intrinsics.d(r13, r14)
            if (r14 == 0) goto L_0x00fc
        L_0x00f9:
            r14 = r39
            goto L_0x0100
        L_0x00fc:
            r0 = r23
            goto L_0x0046
        L_0x0100:
            if (r14 == 0) goto L_0x010c
            androidx.compose.ui.text.intl.LocaleList r11 = r23.p()
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r14, r11)
            if (r11 == 0) goto L_0x00fc
        L_0x010c:
            r11 = r40
            int r16 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r16 == 0) goto L_0x0121
            long r14 = r23.d()
            boolean r14 = androidx.compose.ui.graphics.Color.n(r11, r14)
            if (r14 == 0) goto L_0x011d
            goto L_0x0121
        L_0x011d:
            r0 = r23
            goto L_0x0048
        L_0x0121:
            if (r0 == 0) goto L_0x012d
            androidx.compose.ui.graphics.Shadow r14 = r23.r()
            boolean r14 = kotlin.jvm.internal.Intrinsics.d(r0, r14)
            if (r14 == 0) goto L_0x011d
        L_0x012d:
            r14 = r44
            if (r14 == 0) goto L_0x013b
            androidx.compose.ui.text.PlatformSpanStyle r15 = r23.q()
            boolean r15 = kotlin.jvm.internal.Intrinsics.d(r14, r15)
            if (r15 == 0) goto L_0x013e
        L_0x013b:
            r15 = r45
            goto L_0x0142
        L_0x013e:
            r0 = r23
            goto L_0x004a
        L_0x0142:
            if (r15 == 0) goto L_0x0151
            androidx.compose.ui.graphics.drawscope.DrawStyle r0 = r23.h()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r15, r0)
            if (r0 != 0) goto L_0x0151
            r0 = r23
            goto L_0x0154
        L_0x0151:
            r0 = r23
            return r0
        L_0x0154:
            if (r3 == 0) goto L_0x015d
            androidx.compose.ui.text.style.TextForegroundStyle$Companion r1 = androidx.compose.ui.text.style.TextForegroundStyle.f19102a
            androidx.compose.ui.text.style.TextForegroundStyle r1 = r1.a(r3, r4)
            goto L_0x0163
        L_0x015d:
            androidx.compose.ui.text.style.TextForegroundStyle$Companion r3 = androidx.compose.ui.text.style.TextForegroundStyle.f19102a
            androidx.compose.ui.text.style.TextForegroundStyle r1 = r3.b(r1)
        L_0x0163:
            androidx.compose.ui.text.style.TextForegroundStyle r2 = r23.t()
            androidx.compose.ui.text.style.TextForegroundStyle r1 = r2.b(r1)
            if (r8 != 0) goto L_0x0172
            androidx.compose.ui.text.font.FontFamily r2 = r23.i()
            goto L_0x0173
        L_0x0172:
            r2 = r8
        L_0x0173:
            long r3 = androidx.compose.ui.unit.TextUnit.f(r28)
            int r3 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x0180
            long r3 = r23.k()
            goto L_0x0182
        L_0x0180:
            r3 = r28
        L_0x0182:
            if (r5 != 0) goto L_0x0188
            androidx.compose.ui.text.font.FontWeight r5 = r23.n()
        L_0x0188:
            if (r6 != 0) goto L_0x018e
            androidx.compose.ui.text.font.FontStyle r6 = r23.l()
        L_0x018e:
            if (r7 != 0) goto L_0x0194
            androidx.compose.ui.text.font.FontSynthesis r7 = r23.m()
        L_0x0194:
            if (r9 != 0) goto L_0x019b
            java.lang.String r8 = r23.j()
            r9 = r8
        L_0x019b:
            long r16 = androidx.compose.ui.unit.TextUnit.f(r35)
            int r8 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r8 != 0) goto L_0x01a8
            long r16 = r23.o()
            goto L_0x01aa
        L_0x01a8:
            r16 = r35
        L_0x01aa:
            if (r10 != 0) goto L_0x01b1
            androidx.compose.ui.text.style.BaselineShift r8 = r23.e()
            r10 = r8
        L_0x01b1:
            if (r13 != 0) goto L_0x01b8
            androidx.compose.ui.text.style.TextGeometricTransform r8 = r23.u()
            r13 = r8
        L_0x01b8:
            if (r39 != 0) goto L_0x01bf
            androidx.compose.ui.text.intl.LocaleList r8 = r23.p()
            goto L_0x01c1
        L_0x01bf:
            r8 = r39
        L_0x01c1:
            int r18 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r18 == 0) goto L_0x01c6
            goto L_0x01ca
        L_0x01c6:
            long r11 = r23.d()
        L_0x01ca:
            if (r42 != 0) goto L_0x01d1
            androidx.compose.ui.text.style.TextDecoration r18 = r23.s()
            goto L_0x01d3
        L_0x01d1:
            r18 = r42
        L_0x01d3:
            if (r43 != 0) goto L_0x01da
            androidx.compose.ui.graphics.Shadow r19 = r23.r()
            goto L_0x01dc
        L_0x01da:
            r19 = r43
        L_0x01dc:
            androidx.compose.ui.text.PlatformSpanStyle r14 = g(r0, r14)
            if (r15 != 0) goto L_0x01e7
            androidx.compose.ui.graphics.drawscope.DrawStyle r0 = r23.h()
            r15 = r0
        L_0x01e7:
            androidx.compose.ui.text.SpanStyle r0 = new androidx.compose.ui.text.SpanStyle
            r23 = r0
            r20 = 0
            r43 = r20
            r24 = r1
            r25 = r3
            r27 = r5
            r28 = r6
            r29 = r7
            r30 = r2
            r31 = r9
            r32 = r16
            r34 = r10
            r35 = r13
            r36 = r8
            r37 = r11
            r39 = r18
            r40 = r19
            r41 = r14
            r42 = r15
            r23.<init>((androidx.compose.ui.text.style.TextForegroundStyle) r24, (long) r25, (androidx.compose.ui.text.font.FontWeight) r27, (androidx.compose.ui.text.font.FontStyle) r28, (androidx.compose.ui.text.font.FontSynthesis) r29, (androidx.compose.ui.text.font.FontFamily) r30, (java.lang.String) r31, (long) r32, (androidx.compose.ui.text.style.BaselineShift) r34, (androidx.compose.ui.text.style.TextGeometricTransform) r35, (androidx.compose.ui.text.intl.LocaleList) r36, (long) r37, (androidx.compose.ui.text.style.TextDecoration) r39, (androidx.compose.ui.graphics.Shadow) r40, (androidx.compose.ui.text.PlatformSpanStyle) r41, (androidx.compose.ui.graphics.drawscope.DrawStyle) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyleKt.b(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    public static final SpanStyle c(SpanStyle spanStyle, SpanStyle spanStyle2, float f2) {
        float f3 = f2;
        TextForegroundStyle b2 = TextDrawStyleKt.b(spanStyle.t(), spanStyle2.t(), f3);
        FontFamily fontFamily = (FontFamily) d(spanStyle.i(), spanStyle2.i(), f3);
        long f4 = f(spanStyle.k(), spanStyle2.k(), f3);
        FontWeight n2 = spanStyle.n();
        if (n2 == null) {
            n2 = FontWeight.f18746A.g();
        }
        FontWeight n3 = spanStyle2.n();
        if (n3 == null) {
            n3 = FontWeight.f18746A.g();
        }
        FontWeight a2 = FontWeightKt.a(n2, n3, f3);
        FontStyle fontStyle = (FontStyle) d(spanStyle.l(), spanStyle2.l(), f3);
        FontSynthesis fontSynthesis = (FontSynthesis) d(spanStyle.m(), spanStyle2.m(), f3);
        String str = (String) d(spanStyle.j(), spanStyle2.j(), f3);
        long f5 = f(spanStyle.o(), spanStyle2.o(), f3);
        BaselineShift e2 = spanStyle.e();
        float j2 = e2 != null ? e2.j() : BaselineShift.e(0.0f);
        BaselineShift e3 = spanStyle2.e();
        float a3 = BaselineShiftKt.a(j2, e3 != null ? e3.j() : BaselineShift.e(0.0f), f3);
        TextGeometricTransform u2 = spanStyle.u();
        if (u2 == null) {
            u2 = TextGeometricTransform.f19107c.a();
        }
        TextGeometricTransform u3 = spanStyle2.u();
        if (u3 == null) {
            u3 = TextGeometricTransform.f19107c.a();
        }
        TextGeometricTransform a4 = TextGeometricTransformKt.a(u2, u3, f3);
        LocaleList localeList = (LocaleList) d(spanStyle.p(), spanStyle2.p(), f3);
        TextGeometricTransform textGeometricTransform = a4;
        long h2 = ColorKt.h(spanStyle.d(), spanStyle2.d(), f3);
        TextDecoration textDecoration = (TextDecoration) d(spanStyle.s(), spanStyle2.s(), f3);
        Shadow r2 = spanStyle.r();
        if (r2 == null) {
            r2 = new Shadow(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        Shadow r3 = spanStyle2.r();
        if (r3 == null) {
            r3 = new Shadow(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        return new SpanStyle(b2, f4, a2, fontStyle, fontSynthesis, fontFamily, str, f5, BaselineShift.d(a3), textGeometricTransform, localeList, h2, textDecoration, ShadowKt.a(r2, r3, f3), e(spanStyle.q(), spanStyle2.q(), f3), (DrawStyle) d(spanStyle.h(), spanStyle2.h(), f3), (DefaultConstructorMarker) null);
    }

    public static final Object d(Object obj, Object obj2, float f2) {
        return ((double) f2) < 0.5d ? obj : obj2;
    }

    public static final PlatformSpanStyle e(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f2) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.f18345a.a();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.f18345a.a();
        }
        return AndroidTextStyle_androidKt.c(platformSpanStyle, platformSpanStyle2, f2);
    }

    public static final long f(long j2, long j3, float f2) {
        return (TextUnit.f(j2) == 0 || TextUnit.f(j3) == 0) ? ((TextUnit) d(TextUnit.b(j2), TextUnit.b(j3), f2)).m() : TextUnitKt.j(j2, j3, f2);
    }

    public static final PlatformSpanStyle g(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        return spanStyle.q() == null ? platformSpanStyle : platformSpanStyle == null ? spanStyle.q() : spanStyle.q().b(platformSpanStyle);
    }

    public static final SpanStyle h(SpanStyle spanStyle) {
        TextForegroundStyle a2 = spanStyle.t().a(SpanStyleKt$resolveSpanStyleDefaults$1.f18452z);
        long k2 = TextUnit.f(spanStyle.k()) == 0 ? f18447a : spanStyle.k();
        FontWeight n2 = spanStyle.n();
        if (n2 == null) {
            n2 = FontWeight.f18746A.g();
        }
        FontWeight fontWeight = n2;
        FontStyle l2 = spanStyle.l();
        FontStyle c2 = FontStyle.c(l2 != null ? l2.i() : FontStyle.f18724b.b());
        FontSynthesis m2 = spanStyle.m();
        FontSynthesis e2 = FontSynthesis.e(m2 != null ? m2.m() : FontSynthesis.f18728b.a());
        FontFamily i2 = spanStyle.i();
        if (i2 == null) {
            i2 = FontFamily.f18695A.b();
        }
        FontFamily fontFamily = i2;
        String j2 = spanStyle.j();
        if (j2 == null) {
            j2 = "";
        }
        String str = j2;
        long o2 = TextUnit.f(spanStyle.o()) == 0 ? f18448b : spanStyle.o();
        BaselineShift e3 = spanStyle.e();
        BaselineShift d2 = BaselineShift.d(e3 != null ? e3.j() : BaselineShift.f19019b.a());
        TextGeometricTransform u2 = spanStyle.u();
        if (u2 == null) {
            u2 = TextGeometricTransform.f19107c.a();
        }
        TextGeometricTransform textGeometricTransform = u2;
        LocaleList p2 = spanStyle.p();
        if (p2 == null) {
            p2 = LocaleList.f18941B.a();
        }
        LocaleList localeList = p2;
        long d3 = spanStyle.d();
        if (d3 == 16) {
            d3 = f18449c;
        }
        long j3 = d3;
        TextDecoration s2 = spanStyle.s();
        if (s2 == null) {
            s2 = TextDecoration.f19089b.c();
        }
        TextDecoration textDecoration = s2;
        Shadow r2 = spanStyle.r();
        if (r2 == null) {
            r2 = Shadow.f16116d.a();
        }
        Shadow shadow = r2;
        PlatformSpanStyle q2 = spanStyle.q();
        DrawStyle h2 = spanStyle.h();
        if (h2 == null) {
            h2 = Fill.f16295a;
        }
        return new SpanStyle(a2, k2, fontWeight, c2, e2, fontFamily, str, o2, d2, textGeometricTransform, localeList, j3, textDecoration, shadow, q2, h2, (DefaultConstructorMarker) null);
    }
}
