package androidx.compose.foundation.internal;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class MutableSpanStyle {

    /* renamed from: a  reason: collision with root package name */
    public long f3698a;

    /* renamed from: b  reason: collision with root package name */
    public long f3699b;

    /* renamed from: c  reason: collision with root package name */
    public FontWeight f3700c;

    /* renamed from: d  reason: collision with root package name */
    public FontStyle f3701d;

    /* renamed from: e  reason: collision with root package name */
    public FontSynthesis f3702e;

    /* renamed from: f  reason: collision with root package name */
    public FontFamily f3703f;

    /* renamed from: g  reason: collision with root package name */
    public String f3704g;

    /* renamed from: h  reason: collision with root package name */
    public long f3705h;

    /* renamed from: i  reason: collision with root package name */
    public BaselineShift f3706i;

    /* renamed from: j  reason: collision with root package name */
    public TextGeometricTransform f3707j;

    /* renamed from: k  reason: collision with root package name */
    public LocaleList f3708k;

    /* renamed from: l  reason: collision with root package name */
    public long f3709l;

    /* renamed from: m  reason: collision with root package name */
    public TextDecoration f3710m;

    /* renamed from: n  reason: collision with root package name */
    public Shadow f3711n;

    public /* synthetic */ MutableSpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow);
    }

    public final void a(long j2) {
        this.f3709l = j2;
    }

    public final void b(BaselineShift baselineShift) {
        this.f3706i = baselineShift;
    }

    public final void c(long j2) {
        this.f3698a = j2;
    }

    public final void d(String str) {
        this.f3704g = str;
    }

    public final void e(long j2) {
        this.f3699b = j2;
    }

    public final void f(FontStyle fontStyle) {
        this.f3701d = fontStyle;
    }

    public final void g(FontSynthesis fontSynthesis) {
        this.f3702e = fontSynthesis;
    }

    public final void h(FontWeight fontWeight) {
        this.f3700c = fontWeight;
    }

    public final void i(long j2) {
        this.f3705h = j2;
    }

    public final void j(Shadow shadow) {
        this.f3711n = shadow;
    }

    public final void k(TextDecoration textDecoration) {
        this.f3710m = textDecoration;
    }

    public final void l(TextGeometricTransform textGeometricTransform) {
        this.f3707j = textGeometricTransform;
    }

    public final SpanStyle m() {
        return new SpanStyle(this.f3698a, this.f3699b, this.f3700c, this.f3701d, this.f3702e, this.f3703f, this.f3704g, this.f3705h, this.f3706i, this.f3707j, this.f3708k, this.f3709l, this.f3710m, this.f3711n, (PlatformSpanStyle) null, (DrawStyle) null, 49152, (DefaultConstructorMarker) null);
    }

    public MutableSpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow) {
        this.f3698a = j2;
        this.f3699b = j3;
        this.f3700c = fontWeight;
        this.f3701d = fontStyle;
        this.f3702e = fontSynthesis;
        this.f3703f = fontFamily;
        this.f3704g = str;
        this.f3705h = j4;
        this.f3706i = baselineShift;
        this.f3707j = textGeometricTransform;
        this.f3708k = localeList;
        this.f3709l = j5;
        this.f3710m = textDecoration;
        this.f3711n = shadow;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MutableSpanStyle(long r20, long r22, androidx.compose.ui.text.font.FontWeight r24, androidx.compose.ui.text.font.FontStyle r25, androidx.compose.ui.text.font.FontSynthesis r26, androidx.compose.ui.text.font.FontFamily r27, java.lang.String r28, long r29, androidx.compose.ui.text.style.BaselineShift r31, androidx.compose.ui.text.style.TextGeometricTransform r32, androidx.compose.ui.text.intl.LocaleList r33, long r34, androidx.compose.ui.text.style.TextDecoration r36, androidx.compose.ui.graphics.Shadow r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.f15975b
            long r1 = r1.f()
            goto L_0x000f
        L_0x000d:
            r1 = r20
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.ui.unit.TextUnit.f19177b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r22
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r24
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r25
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r26
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r27
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r28
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.ui.unit.TextUnit.f19177b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r29
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r31
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r32
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r33
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.ui.graphics.Color.f15975b
            long r16 = r6.f()
            goto L_0x0076
        L_0x0074:
            r16 = r34
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r36
        L_0x007e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0086
        L_0x0084:
            r0 = r37
        L_0x0086:
            r18 = 0
            r39 = r18
            r20 = r19
            r21 = r1
            r23 = r3
            r25 = r5
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r16
            r37 = r6
            r38 = r0
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.internal.MutableSpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
