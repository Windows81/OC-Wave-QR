package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SpanStyle implements AnnotatedString.Annotation {

    /* renamed from: a  reason: collision with root package name */
    public final TextForegroundStyle f18431a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18432b;

    /* renamed from: c  reason: collision with root package name */
    public final FontWeight f18433c;

    /* renamed from: d  reason: collision with root package name */
    public final FontStyle f18434d;

    /* renamed from: e  reason: collision with root package name */
    public final FontSynthesis f18435e;

    /* renamed from: f  reason: collision with root package name */
    public final FontFamily f18436f;

    /* renamed from: g  reason: collision with root package name */
    public final String f18437g;

    /* renamed from: h  reason: collision with root package name */
    public final long f18438h;

    /* renamed from: i  reason: collision with root package name */
    public final BaselineShift f18439i;

    /* renamed from: j  reason: collision with root package name */
    public final TextGeometricTransform f18440j;

    /* renamed from: k  reason: collision with root package name */
    public final LocaleList f18441k;

    /* renamed from: l  reason: collision with root package name */
    public final long f18442l;

    /* renamed from: m  reason: collision with root package name */
    public final TextDecoration f18443m;

    /* renamed from: n  reason: collision with root package name */
    public final Shadow f18444n;

    /* renamed from: o  reason: collision with root package name */
    public final PlatformSpanStyle f18445o;

    /* renamed from: p  reason: collision with root package name */
    public final DrawStyle f18446p;

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public static /* synthetic */ SpanStyle b(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, Object obj) {
        SpanStyle spanStyle2 = spanStyle;
        int i3 = i2;
        return spanStyle.a((i3 & 1) != 0 ? spanStyle.g() : j2, (i3 & 2) != 0 ? spanStyle2.f18432b : j3, (i3 & 4) != 0 ? spanStyle2.f18433c : fontWeight, (i3 & 8) != 0 ? spanStyle2.f18434d : fontStyle, (i3 & 16) != 0 ? spanStyle2.f18435e : fontSynthesis, (i3 & 32) != 0 ? spanStyle2.f18436f : fontFamily, (i3 & 64) != 0 ? spanStyle2.f18437g : str, (i3 & 128) != 0 ? spanStyle2.f18438h : j4, (i3 & 256) != 0 ? spanStyle2.f18439i : baselineShift, (i3 & 512) != 0 ? spanStyle2.f18440j : textGeometricTransform, (i3 & 1024) != 0 ? spanStyle2.f18441k : localeList, (i3 & 2048) != 0 ? spanStyle2.f18442l : j5, (i3 & 4096) != 0 ? spanStyle2.f18443m : textDecoration, (i3 & 8192) != 0 ? spanStyle2.f18444n : shadow, (i3 & 16384) != 0 ? spanStyle2.f18445o : platformSpanStyle, (i3 & 32768) != 0 ? spanStyle2.f18446p : drawStyle);
    }

    public final SpanStyle a(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        TextForegroundStyle b2;
        long j6 = j2;
        if (Color.n(j6, g())) {
            b2 = this.f18431a;
        } else {
            b2 = TextForegroundStyle.f19102a.b(j6);
        }
        return new SpanStyle(b2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.f18431a.c();
    }

    public final long d() {
        return this.f18442l;
    }

    public final BaselineShift e() {
        return this.f18439i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return v(spanStyle) && w(spanStyle);
    }

    public final Brush f() {
        return this.f18431a.d();
    }

    public final long g() {
        return this.f18431a.g();
    }

    public final DrawStyle h() {
        return this.f18446p;
    }

    public int hashCode() {
        int t2 = Color.t(g()) * 31;
        Brush f2 = f();
        int i2 = 0;
        int hashCode = (((((t2 + (f2 != null ? f2.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + TextUnit.i(this.f18432b)) * 31;
        FontWeight fontWeight = this.f18433c;
        int hashCode2 = (hashCode + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.f18434d;
        int g2 = (hashCode2 + (fontStyle != null ? FontStyle.g(fontStyle.i()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.f18435e;
        int i3 = (g2 + (fontSynthesis != null ? FontSynthesis.i(fontSynthesis.m()) : 0)) * 31;
        FontFamily fontFamily = this.f18436f;
        int hashCode3 = (i3 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.f18437g;
        int hashCode4 = (((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.i(this.f18438h)) * 31;
        BaselineShift baselineShift = this.f18439i;
        int h2 = (hashCode4 + (baselineShift != null ? BaselineShift.h(baselineShift.j()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.f18440j;
        int hashCode5 = (h2 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.f18441k;
        int hashCode6 = (((hashCode5 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.t(this.f18442l)) * 31;
        TextDecoration textDecoration = this.f18443m;
        int hashCode7 = (hashCode6 + (textDecoration != null ? textDecoration.hashCode() : 0)) * 31;
        Shadow shadow = this.f18444n;
        int hashCode8 = (hashCode7 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.f18445o;
        int hashCode9 = (hashCode8 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.f18446p;
        if (drawStyle != null) {
            i2 = drawStyle.hashCode();
        }
        return hashCode9 + i2;
    }

    public final FontFamily i() {
        return this.f18436f;
    }

    public final String j() {
        return this.f18437g;
    }

    public final long k() {
        return this.f18432b;
    }

    public final FontStyle l() {
        return this.f18434d;
    }

    public final FontSynthesis m() {
        return this.f18435e;
    }

    public final FontWeight n() {
        return this.f18433c;
    }

    public final long o() {
        return this.f18438h;
    }

    public final LocaleList p() {
        return this.f18441k;
    }

    public final PlatformSpanStyle q() {
        return this.f18445o;
    }

    public final Shadow r() {
        return this.f18444n;
    }

    public final TextDecoration s() {
        return this.f18443m;
    }

    public final TextForegroundStyle t() {
        return this.f18431a;
    }

    public String toString() {
        return "SpanStyle(color=" + Color.u(g()) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + TextUnit.l(this.f18432b) + ", fontWeight=" + this.f18433c + ", fontStyle=" + this.f18434d + ", fontSynthesis=" + this.f18435e + ", fontFamily=" + this.f18436f + ", fontFeatureSettings=" + this.f18437g + ", letterSpacing=" + TextUnit.l(this.f18438h) + ", baselineShift=" + this.f18439i + ", textGeometricTransform=" + this.f18440j + ", localeList=" + this.f18441k + ", background=" + Color.u(this.f18442l) + ", textDecoration=" + this.f18443m + ", shadow=" + this.f18444n + ", platformStyle=" + this.f18445o + ", drawStyle=" + this.f18446p + ')';
    }

    public final TextGeometricTransform u() {
        return this.f18440j;
    }

    public final boolean v(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        return TextUnit.e(this.f18432b, spanStyle.f18432b) && Intrinsics.d(this.f18433c, spanStyle.f18433c) && Intrinsics.d(this.f18434d, spanStyle.f18434d) && Intrinsics.d(this.f18435e, spanStyle.f18435e) && Intrinsics.d(this.f18436f, spanStyle.f18436f) && Intrinsics.d(this.f18437g, spanStyle.f18437g) && TextUnit.e(this.f18438h, spanStyle.f18438h) && Intrinsics.d(this.f18439i, spanStyle.f18439i) && Intrinsics.d(this.f18440j, spanStyle.f18440j) && Intrinsics.d(this.f18441k, spanStyle.f18441k) && Color.n(this.f18442l, spanStyle.f18442l) && Intrinsics.d(this.f18445o, spanStyle.f18445o);
    }

    public final boolean w(SpanStyle spanStyle) {
        return Intrinsics.d(this.f18431a, spanStyle.f18431a) && Intrinsics.d(this.f18443m, spanStyle.f18443m) && Intrinsics.d(this.f18444n, spanStyle.f18444n) && Intrinsics.d(this.f18446p, spanStyle.f18446p);
    }

    public final int x() {
        int i2 = TextUnit.i(this.f18432b) * 31;
        FontWeight fontWeight = this.f18433c;
        int i3 = 0;
        int hashCode = (i2 + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.f18434d;
        int g2 = (hashCode + (fontStyle != null ? FontStyle.g(fontStyle.i()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.f18435e;
        int i4 = (g2 + (fontSynthesis != null ? FontSynthesis.i(fontSynthesis.m()) : 0)) * 31;
        FontFamily fontFamily = this.f18436f;
        int hashCode2 = (i4 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.f18437g;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.i(this.f18438h)) * 31;
        BaselineShift baselineShift = this.f18439i;
        int h2 = (hashCode3 + (baselineShift != null ? BaselineShift.h(baselineShift.j()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.f18440j;
        int hashCode4 = (h2 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.f18441k;
        int hashCode5 = (((hashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.t(this.f18442l)) * 31;
        PlatformSpanStyle platformSpanStyle = this.f18445o;
        if (platformSpanStyle != null) {
            i3 = platformSpanStyle.hashCode();
        }
        return hashCode5 + i3;
    }

    public final SpanStyle y(SpanStyle spanStyle) {
        SpanStyle spanStyle2 = spanStyle;
        if (spanStyle2 == null) {
            return this;
        }
        return SpanStyleKt.b(this, spanStyle2.f18431a.g(), spanStyle2.f18431a.d(), spanStyle2.f18431a.c(), spanStyle2.f18432b, spanStyle2.f18433c, spanStyle2.f18434d, spanStyle2.f18435e, spanStyle2.f18436f, spanStyle2.f18437g, spanStyle2.f18438h, spanStyle2.f18439i, spanStyle2.f18440j, spanStyle2.f18441k, spanStyle2.f18442l, spanStyle2.f18443m, spanStyle2.f18444n, spanStyle2.f18445o, spanStyle2.f18446p);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.f18431a = textForegroundStyle;
        this.f18432b = j2;
        this.f18433c = fontWeight;
        this.f18434d = fontStyle;
        this.f18435e = fontSynthesis;
        this.f18436f = fontFamily;
        this.f18437g = str;
        this.f18438h = j3;
        this.f18439i = baselineShift;
        this.f18440j = textGeometricTransform;
        this.f18441k = localeList;
        this.f18442l = j4;
        this.f18443m = textDecoration;
        this.f18444n = shadow;
        this.f18445o = platformSpanStyle;
        this.f18446p = drawStyle;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SpanStyle(long r22, long r24, androidx.compose.ui.text.font.FontWeight r26, androidx.compose.ui.text.font.FontStyle r27, androidx.compose.ui.text.font.FontSynthesis r28, androidx.compose.ui.text.font.FontFamily r29, java.lang.String r30, long r31, androidx.compose.ui.text.style.BaselineShift r33, androidx.compose.ui.text.style.TextGeometricTransform r34, androidx.compose.ui.text.intl.LocaleList r35, long r36, androidx.compose.ui.text.style.TextDecoration r38, androidx.compose.ui.graphics.Shadow r39, androidx.compose.ui.text.PlatformSpanStyle r40, androidx.compose.ui.graphics.drawscope.DrawStyle r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.f15975b
            long r1 = r1.f()
            goto L_0x000f
        L_0x000d:
            r1 = r22
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.ui.unit.TextUnit.f19177b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r24
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r26
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r27
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r28
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r29
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r30
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.ui.unit.TextUnit.f19177b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r31
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r33
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r34
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r35
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.ui.graphics.Color.f15975b
            long r16 = r6.f()
            goto L_0x0076
        L_0x0074:
            r16 = r36
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r38
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r39
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r40
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x009b
            r0 = 0
            goto L_0x009d
        L_0x009b:
            r0 = r41
        L_0x009d:
            r20 = 0
            r43 = r20
            r22 = r21
            r23 = r1
            r25 = r3
            r27 = r5
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r34 = r13
            r35 = r14
            r36 = r15
            r37 = r16
            r39 = r18
            r40 = r19
            r41 = r6
            r42 = r0
            r22.<init>((long) r23, (long) r25, (androidx.compose.ui.text.font.FontWeight) r27, (androidx.compose.ui.text.font.FontStyle) r28, (androidx.compose.ui.text.font.FontSynthesis) r29, (androidx.compose.ui.text.font.FontFamily) r30, (java.lang.String) r31, (long) r32, (androidx.compose.ui.text.style.BaselineShift) r34, (androidx.compose.ui.text.style.TextGeometricTransform) r35, (androidx.compose.ui.text.intl.LocaleList) r36, (long) r37, (androidx.compose.ui.text.style.TextDecoration) r39, (androidx.compose.ui.graphics.Shadow) r40, (androidx.compose.ui.text.PlatformSpanStyle) r41, (androidx.compose.ui.graphics.drawscope.DrawStyle) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.f19102a.b(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
        long j6 = j3;
    }
}
