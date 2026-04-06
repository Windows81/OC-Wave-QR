package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ParagraphStyle implements AnnotatedString.Annotation {

    /* renamed from: a  reason: collision with root package name */
    public final int f18319a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18320b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18321c;

    /* renamed from: d  reason: collision with root package name */
    public final TextIndent f18322d;

    /* renamed from: e  reason: collision with root package name */
    public final PlatformParagraphStyle f18323e;

    /* renamed from: f  reason: collision with root package name */
    public final LineHeightStyle f18324f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18325g;

    /* renamed from: h  reason: collision with root package name */
    public final int f18326h;

    /* renamed from: i  reason: collision with root package name */
    public final TextMotion f18327i;

    public /* synthetic */ ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion);
    }

    public static /* synthetic */ ParagraphStyle b(ParagraphStyle paragraphStyle, int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, Object obj) {
        ParagraphStyle paragraphStyle2 = paragraphStyle;
        int i7 = i6;
        return paragraphStyle.a((i7 & 1) != 0 ? paragraphStyle2.f18319a : i2, (i7 & 2) != 0 ? paragraphStyle2.f18320b : i3, (i7 & 4) != 0 ? paragraphStyle2.f18321c : j2, (i7 & 8) != 0 ? paragraphStyle2.f18322d : textIndent, (i7 & 16) != 0 ? paragraphStyle2.f18323e : platformParagraphStyle, (i7 & 32) != 0 ? paragraphStyle2.f18324f : lineHeightStyle, (i7 & 64) != 0 ? paragraphStyle2.f18325g : i4, (i7 & 128) != 0 ? paragraphStyle2.f18326h : i5, (i7 & 256) != 0 ? paragraphStyle2.f18327i : textMotion);
    }

    public final ParagraphStyle a(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        return new ParagraphStyle(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion, (DefaultConstructorMarker) null);
    }

    public final int c() {
        return this.f18326h;
    }

    public final int d() {
        return this.f18325g;
    }

    public final long e() {
        return this.f18321c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        return TextAlign.k(this.f18319a, paragraphStyle.f18319a) && TextDirection.j(this.f18320b, paragraphStyle.f18320b) && TextUnit.e(this.f18321c, paragraphStyle.f18321c) && Intrinsics.d(this.f18322d, paragraphStyle.f18322d) && Intrinsics.d(this.f18323e, paragraphStyle.f18323e) && Intrinsics.d(this.f18324f, paragraphStyle.f18324f) && LineBreak.f(this.f18325g, paragraphStyle.f18325g) && Hyphens.g(this.f18326h, paragraphStyle.f18326h) && Intrinsics.d(this.f18327i, paragraphStyle.f18327i);
    }

    public final LineHeightStyle f() {
        return this.f18324f;
    }

    public final PlatformParagraphStyle g() {
        return this.f18323e;
    }

    public final int h() {
        return this.f18319a;
    }

    public int hashCode() {
        int l2 = ((((TextAlign.l(this.f18319a) * 31) + TextDirection.k(this.f18320b)) * 31) + TextUnit.i(this.f18321c)) * 31;
        TextIndent textIndent = this.f18322d;
        int i2 = 0;
        int hashCode = (l2 + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.f18323e;
        int hashCode2 = (hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.f18324f;
        int hashCode3 = (((((hashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + LineBreak.j(this.f18325g)) * 31) + Hyphens.h(this.f18326h)) * 31;
        TextMotion textMotion = this.f18327i;
        if (textMotion != null) {
            i2 = textMotion.hashCode();
        }
        return hashCode3 + i2;
    }

    public final int i() {
        return this.f18320b;
    }

    public final TextIndent j() {
        return this.f18322d;
    }

    public final TextMotion k() {
        return this.f18327i;
    }

    public final ParagraphStyle l(ParagraphStyle paragraphStyle) {
        if (paragraphStyle == null) {
            return this;
        }
        return ParagraphStyleKt.a(this, paragraphStyle.f18319a, paragraphStyle.f18320b, paragraphStyle.f18321c, paragraphStyle.f18322d, paragraphStyle.f18323e, paragraphStyle.f18324f, paragraphStyle.f18325g, paragraphStyle.f18326h, paragraphStyle.f18327i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + TextAlign.m(this.f18319a) + ", textDirection=" + TextDirection.l(this.f18320b) + ", lineHeight=" + TextUnit.l(this.f18321c) + ", textIndent=" + this.f18322d + ", platformStyle=" + this.f18323e + ", lineHeightStyle=" + this.f18324f + ", lineBreak=" + LineBreak.k(this.f18325g) + ", hyphens=" + Hyphens.i(this.f18326h) + ", textMotion=" + this.f18327i + ')';
    }

    public ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        this.f18319a = i2;
        this.f18320b = i3;
        this.f18321c = j2;
        this.f18322d = textIndent;
        this.f18323e = platformParagraphStyle;
        this.f18324f = lineHeightStyle;
        this.f18325g = i4;
        this.f18326h = i5;
        this.f18327i = textMotion;
        if (!TextUnit.e(j2, TextUnit.f19177b.a())) {
            if (!(TextUnit.h(j2) >= 0.0f)) {
                InlineClassHelperKt.c("lineHeight can't be negative (" + TextUnit.h(j2) + ')');
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ParagraphStyle(int r12, int r13, long r14, androidx.compose.ui.text.style.TextIndent r16, androidx.compose.ui.text.PlatformParagraphStyle r17, androidx.compose.ui.text.style.LineHeightStyle r18, int r19, int r20, androidx.compose.ui.text.style.TextMotion r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.text.style.TextAlign$Companion r1 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r1 = r1.g()
            goto L_0x000e
        L_0x000d:
            r1 = r12
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0019
            androidx.compose.ui.text.style.TextDirection$Companion r2 = androidx.compose.ui.text.style.TextDirection.f19094b
            int r2 = r2.f()
            goto L_0x001a
        L_0x0019:
            r2 = r13
        L_0x001a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0025
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.ui.unit.TextUnit.f19177b
            long r3 = r3.a()
            goto L_0x0026
        L_0x0025:
            r3 = r14
        L_0x0026:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x002d
            r5 = r6
            goto L_0x002f
        L_0x002d:
            r5 = r16
        L_0x002f:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0035
            r7 = r6
            goto L_0x0037
        L_0x0035:
            r7 = r17
        L_0x0037:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x003d
            r8 = r6
            goto L_0x003f
        L_0x003d:
            r8 = r18
        L_0x003f:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x004a
            androidx.compose.ui.text.style.LineBreak$Companion r9 = androidx.compose.ui.text.style.LineBreak.f19032b
            int r9 = r9.b()
            goto L_0x004c
        L_0x004a:
            r9 = r19
        L_0x004c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0057
            androidx.compose.ui.text.style.Hyphens$Companion r10 = androidx.compose.ui.text.style.Hyphens.f19027b
            int r10 = r10.c()
            goto L_0x0059
        L_0x0057:
            r10 = r20
        L_0x0059:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r6 = r21
        L_0x0060:
            r0 = 0
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r17 = r5
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r6
            r23 = r0
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyle.<init>(int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
