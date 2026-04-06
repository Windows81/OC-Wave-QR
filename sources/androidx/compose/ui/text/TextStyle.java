package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextStyle {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f18499d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final TextStyle f18500e = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777215, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final SpanStyle f18501a;

    /* renamed from: b  reason: collision with root package name */
    public final ParagraphStyle f18502b;

    /* renamed from: c  reason: collision with root package name */
    public final PlatformTextStyle f18503c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextStyle a() {
            return TextStyle.f18500e;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, i2, i3, j6, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion);
    }

    public static /* synthetic */ TextStyle L(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i4, int i5, PlatformTextStyle platformTextStyle, TextMotion textMotion, int i6, Object obj) {
        int i7 = i6;
        return textStyle.K((i7 & 1) != 0 ? Color.f15975b.f() : j2, (i7 & 2) != 0 ? TextUnit.f19177b.a() : j3, (i7 & 4) != 0 ? null : fontWeight, (i7 & 8) != 0 ? null : fontStyle, (i7 & 16) != 0 ? null : fontSynthesis, (i7 & 32) != 0 ? null : fontFamily, (i7 & 64) != 0 ? null : str, (i7 & 128) != 0 ? TextUnit.f19177b.a() : j4, (i7 & 256) != 0 ? null : baselineShift, (i7 & 512) != 0 ? null : textGeometricTransform, (i7 & 1024) != 0 ? null : localeList, (i7 & 2048) != 0 ? Color.f15975b.f() : j5, (i7 & 4096) != 0 ? null : textDecoration, (i7 & 8192) != 0 ? null : shadow, (i7 & 16384) != 0 ? null : drawStyle, (i7 & 32768) != 0 ? TextAlign.f19080b.g() : i2, (i7 & 65536) != 0 ? TextDirection.f19094b.f() : i3, (i7 & 131072) != 0 ? TextUnit.f19177b.a() : j6, (i7 & 262144) != 0 ? null : textIndent, (i7 & 524288) != 0 ? null : lineHeightStyle, (i7 & 1048576) != 0 ? LineBreak.f19032b.b() : i4, (i7 & 2097152) != 0 ? Hyphens.f19027b.c() : i5, (i7 & 4194304) != 0 ? null : platformTextStyle, (i7 & 8388608) != 0 ? null : textMotion);
    }

    public static /* synthetic */ TextStyle c(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, Object obj) {
        TextStyle textStyle2 = textStyle;
        int i7 = i6;
        return textStyle.b((i7 & 1) != 0 ? textStyle2.f18501a.g() : j2, (i7 & 2) != 0 ? textStyle2.f18501a.k() : j3, (i7 & 4) != 0 ? textStyle2.f18501a.n() : fontWeight, (i7 & 8) != 0 ? textStyle2.f18501a.l() : fontStyle, (i7 & 16) != 0 ? textStyle2.f18501a.m() : fontSynthesis, (i7 & 32) != 0 ? textStyle2.f18501a.i() : fontFamily, (i7 & 64) != 0 ? textStyle2.f18501a.j() : str, (i7 & 128) != 0 ? textStyle2.f18501a.o() : j4, (i7 & 256) != 0 ? textStyle2.f18501a.e() : baselineShift, (i7 & 512) != 0 ? textStyle2.f18501a.u() : textGeometricTransform, (i7 & 1024) != 0 ? textStyle2.f18501a.p() : localeList, (i7 & 2048) != 0 ? textStyle2.f18501a.d() : j5, (i7 & 4096) != 0 ? textStyle2.f18501a.s() : textDecoration, (i7 & 8192) != 0 ? textStyle2.f18501a.r() : shadow, (i7 & 16384) != 0 ? textStyle2.f18501a.h() : drawStyle, (i7 & 32768) != 0 ? textStyle2.f18502b.h() : i2, (i7 & 65536) != 0 ? textStyle2.f18502b.i() : i3, (i7 & 131072) != 0 ? textStyle2.f18502b.e() : j6, (i7 & 262144) != 0 ? textStyle2.f18502b.j() : textIndent, (i7 & 524288) != 0 ? textStyle2.f18503c : platformTextStyle, (i7 & 1048576) != 0 ? textStyle2.f18502b.f() : lineHeightStyle, (i7 & 2097152) != 0 ? textStyle2.f18502b.d() : i4, (i7 & 4194304) != 0 ? textStyle2.f18502b.c() : i5, (i7 & 8388608) != 0 ? textStyle2.f18502b.k() : textMotion);
    }

    public final TextDecoration A() {
        return this.f18501a.s();
    }

    public final int B() {
        return this.f18502b.i();
    }

    public final TextGeometricTransform C() {
        return this.f18501a.u();
    }

    public final TextIndent D() {
        return this.f18502b.j();
    }

    public final TextMotion E() {
        return this.f18502b.k();
    }

    public final boolean F(TextStyle textStyle) {
        return this == textStyle || this.f18501a.w(textStyle.f18501a);
    }

    public final boolean G(TextStyle textStyle) {
        return this == textStyle || (Intrinsics.d(this.f18502b, textStyle.f18502b) && this.f18501a.v(textStyle.f18501a));
    }

    public final int H() {
        int x2 = ((this.f18501a.x() * 31) + this.f18502b.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.f18503c;
        return x2 + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final TextStyle I(ParagraphStyle paragraphStyle) {
        return new TextStyle(N(), M().l(paragraphStyle));
    }

    public final TextStyle J(TextStyle textStyle) {
        return (textStyle == null || Intrinsics.d(textStyle, f18500e)) ? this : new TextStyle(N().y(textStyle.N()), M().l(textStyle.M()));
    }

    public final TextStyle K(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i4, int i5, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        PlatformParagraphStyle platformParagraphStyle = null;
        SpanStyle b2 = SpanStyleKt.b(this.f18501a, j2, (Brush) null, Float.NaN, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.b() : null, drawStyle);
        ParagraphStyle paragraphStyle = this.f18502b;
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.a();
        }
        ParagraphStyle a2 = ParagraphStyleKt.a(paragraphStyle, i2, i3, j6, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion);
        return (this.f18501a == b2 && this.f18502b == a2) ? this : new TextStyle(b2, a2);
    }

    public final ParagraphStyle M() {
        return this.f18502b;
    }

    public final SpanStyle N() {
        return this.f18501a;
    }

    public final TextStyle b(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        long j7 = j2;
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        TextForegroundStyle t2 = Color.n(j7, this.f18501a.g()) ? this.f18501a.t() : TextForegroundStyle.f19102a.b(j7);
        PlatformParagraphStyle platformParagraphStyle = null;
        SpanStyle spanStyle = r5;
        SpanStyle spanStyle2 = new SpanStyle(t2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle2 != null ? platformTextStyle.b() : null, drawStyle, (DefaultConstructorMarker) null);
        if (platformTextStyle2 != null) {
            platformParagraphStyle = platformTextStyle.a();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(i2, i3, j6, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion, (DefaultConstructorMarker) null), platformTextStyle2);
    }

    public final float d() {
        return this.f18501a.c();
    }

    public final long e() {
        return this.f18501a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return Intrinsics.d(this.f18501a, textStyle.f18501a) && Intrinsics.d(this.f18502b, textStyle.f18502b) && Intrinsics.d(this.f18503c, textStyle.f18503c);
    }

    public final BaselineShift f() {
        return this.f18501a.e();
    }

    public final Brush g() {
        return this.f18501a.f();
    }

    public final long h() {
        return this.f18501a.g();
    }

    public int hashCode() {
        int hashCode = ((this.f18501a.hashCode() * 31) + this.f18502b.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.f18503c;
        return hashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final DrawStyle i() {
        return this.f18501a.h();
    }

    public final FontFamily j() {
        return this.f18501a.i();
    }

    public final String k() {
        return this.f18501a.j();
    }

    public final long l() {
        return this.f18501a.k();
    }

    public final FontStyle m() {
        return this.f18501a.l();
    }

    public final FontSynthesis n() {
        return this.f18501a.m();
    }

    public final FontWeight o() {
        return this.f18501a.n();
    }

    public final int p() {
        return this.f18502b.c();
    }

    public final long q() {
        return this.f18501a.o();
    }

    public final int r() {
        return this.f18502b.d();
    }

    public final long s() {
        return this.f18502b.e();
    }

    public final LineHeightStyle t() {
        return this.f18502b.f();
    }

    public String toString() {
        return "TextStyle(color=" + Color.u(h()) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + TextUnit.l(l()) + ", fontWeight=" + o() + ", fontStyle=" + m() + ", fontSynthesis=" + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + TextUnit.l(q()) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + Color.u(e()) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + TextAlign.m(z()) + ", textDirection=" + TextDirection.l(B()) + ", lineHeight=" + TextUnit.l(s()) + ", textIndent=" + D() + ", platformStyle=" + this.f18503c + ", lineHeightStyle=" + t() + ", lineBreak=" + LineBreak.k(r()) + ", hyphens=" + Hyphens.i(p()) + ", textMotion=" + E() + ')';
    }

    public final LocaleList u() {
        return this.f18501a.p();
    }

    public final ParagraphStyle v() {
        return this.f18502b;
    }

    public final PlatformTextStyle w() {
        return this.f18503c;
    }

    public final Shadow x() {
        return this.f18501a.r();
    }

    public final SpanStyle y() {
        return this.f18501a;
    }

    public final int z() {
        return this.f18502b.h();
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.f18501a = spanStyle;
        this.f18502b = paragraphStyle;
        this.f18503c = platformTextStyle;
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.b(spanStyle.q(), paragraphStyle.g()));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextStyle(long r31, long r33, androidx.compose.ui.text.font.FontWeight r35, androidx.compose.ui.text.font.FontStyle r36, androidx.compose.ui.text.font.FontSynthesis r37, androidx.compose.ui.text.font.FontFamily r38, java.lang.String r39, long r40, androidx.compose.ui.text.style.BaselineShift r42, androidx.compose.ui.text.style.TextGeometricTransform r43, androidx.compose.ui.text.intl.LocaleList r44, long r45, androidx.compose.ui.text.style.TextDecoration r47, androidx.compose.ui.graphics.Shadow r48, androidx.compose.ui.graphics.drawscope.DrawStyle r49, int r50, int r51, long r52, androidx.compose.ui.text.style.TextIndent r54, androidx.compose.ui.text.PlatformTextStyle r55, androidx.compose.ui.text.style.LineHeightStyle r56, int r57, int r58, androidx.compose.ui.text.style.TextMotion r59, int r60, kotlin.jvm.internal.DefaultConstructorMarker r61) {
        /*
            r30 = this;
            r0 = r60
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.f15975b
            long r1 = r1.f()
            goto L_0x000f
        L_0x000d:
            r1 = r31
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.ui.unit.TextUnit.f19177b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r33
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r35
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r36
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r37
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r38
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r39
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.ui.unit.TextUnit.f19177b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r40
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r42
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r43
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r44
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.ui.graphics.Color.f15975b
            long r16 = r6.f()
            goto L_0x0076
        L_0x0074:
            r16 = r45
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r47
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r48
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r49
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00a0
            androidx.compose.ui.text.style.TextAlign$Companion r20 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r20 = r20.g()
            goto L_0x00a2
        L_0x00a0:
            r20 = r50
        L_0x00a2:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00af
            androidx.compose.ui.text.style.TextDirection$Companion r21 = androidx.compose.ui.text.style.TextDirection.f19094b
            int r21 = r21.f()
            goto L_0x00b1
        L_0x00af:
            r21 = r51
        L_0x00b1:
            r22 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00be
            androidx.compose.ui.unit.TextUnit$Companion r22 = androidx.compose.ui.unit.TextUnit.f19177b
            long r22 = r22.a()
            goto L_0x00c0
        L_0x00be:
            r22 = r52
        L_0x00c0:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00c9
            r24 = 0
            goto L_0x00cb
        L_0x00c9:
            r24 = r54
        L_0x00cb:
            r25 = 524288(0x80000, float:7.34684E-40)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00d4
            r25 = 0
            goto L_0x00d6
        L_0x00d4:
            r25 = r55
        L_0x00d6:
            r26 = 1048576(0x100000, float:1.469368E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00df
            r26 = 0
            goto L_0x00e1
        L_0x00df:
            r26 = r56
        L_0x00e1:
            r27 = 2097152(0x200000, float:2.938736E-39)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00ee
            androidx.compose.ui.text.style.LineBreak$Companion r27 = androidx.compose.ui.text.style.LineBreak.f19032b
            int r27 = r27.b()
            goto L_0x00f0
        L_0x00ee:
            r27 = r57
        L_0x00f0:
            r28 = 4194304(0x400000, float:5.877472E-39)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00fd
            androidx.compose.ui.text.style.Hyphens$Companion r28 = androidx.compose.ui.text.style.Hyphens.f19027b
            int r28 = r28.c()
            goto L_0x00ff
        L_0x00fd:
            r28 = r58
        L_0x00ff:
            r29 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r29
            if (r0 == 0) goto L_0x0107
            r0 = 0
            goto L_0x0109
        L_0x0107:
            r0 = r59
        L_0x0109:
            r29 = 0
            r61 = r29
            r31 = r30
            r32 = r1
            r34 = r3
            r36 = r5
            r37 = r7
            r38 = r8
            r39 = r9
            r40 = r10
            r41 = r11
            r43 = r13
            r44 = r14
            r45 = r15
            r46 = r16
            r48 = r18
            r49 = r19
            r50 = r6
            r51 = r20
            r52 = r21
            r53 = r22
            r55 = r24
            r56 = r25
            r57 = r26
            r58 = r27
            r59 = r28
            r60 = r0
            r31.<init>(r32, r34, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r55, r56, r57, r58, r59, r60, r61)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextStyle(long r26, long r28, androidx.compose.ui.text.font.FontWeight r30, androidx.compose.ui.text.font.FontStyle r31, androidx.compose.ui.text.font.FontSynthesis r32, androidx.compose.ui.text.font.FontFamily r33, java.lang.String r34, long r35, androidx.compose.ui.text.style.BaselineShift r37, androidx.compose.ui.text.style.TextGeometricTransform r38, androidx.compose.ui.text.intl.LocaleList r39, long r40, androidx.compose.ui.text.style.TextDecoration r42, androidx.compose.ui.graphics.Shadow r43, androidx.compose.ui.graphics.drawscope.DrawStyle r44, int r45, int r46, long r47, androidx.compose.ui.text.style.TextIndent r49, androidx.compose.ui.text.PlatformTextStyle r50, androidx.compose.ui.text.style.LineHeightStyle r51, int r52, int r53, androidx.compose.ui.text.style.TextMotion r54) {
        /*
            r25 = this;
            r0 = r50
            androidx.compose.ui.text.SpanStyle r15 = new androidx.compose.ui.text.SpanStyle
            r23 = 0
            if (r0 == 0) goto L_0x000f
            androidx.compose.ui.text.PlatformSpanStyle r1 = r50.b()
            r20 = r1
            goto L_0x0011
        L_0x000f:
            r20 = r23
        L_0x0011:
            r22 = 0
            r1 = r15
            r2 = r26
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r24 = r15
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r21 = r44
            r1.<init>((long) r2, (long) r4, (androidx.compose.ui.text.font.FontWeight) r6, (androidx.compose.ui.text.font.FontStyle) r7, (androidx.compose.ui.text.font.FontSynthesis) r8, (androidx.compose.ui.text.font.FontFamily) r9, (java.lang.String) r10, (long) r11, (androidx.compose.ui.text.style.BaselineShift) r13, (androidx.compose.ui.text.style.TextGeometricTransform) r14, (androidx.compose.ui.text.intl.LocaleList) r15, (long) r16, (androidx.compose.ui.text.style.TextDecoration) r18, (androidx.compose.ui.graphics.Shadow) r19, (androidx.compose.ui.text.PlatformSpanStyle) r20, (androidx.compose.ui.graphics.drawscope.DrawStyle) r21, (kotlin.jvm.internal.DefaultConstructorMarker) r22)
            androidx.compose.ui.text.ParagraphStyle r1 = new androidx.compose.ui.text.ParagraphStyle
            if (r0 == 0) goto L_0x003f
            androidx.compose.ui.text.PlatformParagraphStyle r23 = r50.a()
        L_0x003f:
            r2 = 0
            r26 = r1
            r27 = r45
            r28 = r46
            r29 = r47
            r31 = r49
            r32 = r23
            r33 = r51
            r34 = r52
            r35 = r53
            r36 = r54
            r37 = r2
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36, r37)
            r2 = r25
            r3 = r24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion):void");
    }
}
