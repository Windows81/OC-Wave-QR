package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ParagraphStyleKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f18328a = TextUnit.f19177b.a();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (androidx.compose.ui.unit.TextUnit.e(r11, r24.e()) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.text.ParagraphStyle a(androidx.compose.ui.text.ParagraphStyle r24, int r25, int r26, long r27, androidx.compose.ui.text.style.TextIndent r29, androidx.compose.ui.text.PlatformParagraphStyle r30, androidx.compose.ui.text.style.LineHeightStyle r31, int r32, int r33, androidx.compose.ui.text.style.TextMotion r34) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            androidx.compose.ui.text.style.TextAlign$Companion r9 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r10 = r9.g()
            boolean r10 = androidx.compose.ui.text.style.TextAlign.k(r1, r10)
            r11 = 0
            if (r10 != 0) goto L_0x002f
            int r10 = r24.h()
            boolean r10 = androidx.compose.ui.text.style.TextAlign.k(r1, r10)
            if (r10 == 0) goto L_0x002b
            goto L_0x002f
        L_0x002b:
            r11 = r27
            goto L_0x00bd
        L_0x002f:
            long r13 = androidx.compose.ui.unit.TextUnit.f(r27)
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0039
            r10 = 1
            goto L_0x003a
        L_0x0039:
            r10 = 0
        L_0x003a:
            if (r10 != 0) goto L_0x0049
            long r13 = r24.e()
            r11 = r27
            boolean r10 = androidx.compose.ui.unit.TextUnit.e(r11, r13)
            if (r10 == 0) goto L_0x00bd
            goto L_0x004b
        L_0x0049:
            r11 = r27
        L_0x004b:
            if (r3 == 0) goto L_0x0057
            androidx.compose.ui.text.style.TextIndent r10 = r24.j()
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r3, r10)
            if (r10 == 0) goto L_0x00bd
        L_0x0057:
            androidx.compose.ui.text.style.TextDirection$Companion r10 = androidx.compose.ui.text.style.TextDirection.f19094b
            int r10 = r10.f()
            boolean r10 = androidx.compose.ui.text.style.TextDirection.j(r2, r10)
            if (r10 != 0) goto L_0x006d
            int r10 = r24.i()
            boolean r10 = androidx.compose.ui.text.style.TextDirection.j(r2, r10)
            if (r10 == 0) goto L_0x00bd
        L_0x006d:
            if (r4 == 0) goto L_0x0079
            androidx.compose.ui.text.PlatformParagraphStyle r10 = r24.g()
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r4, r10)
            if (r10 == 0) goto L_0x00bd
        L_0x0079:
            if (r5 == 0) goto L_0x0085
            androidx.compose.ui.text.style.LineHeightStyle r10 = r24.f()
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r5, r10)
            if (r10 == 0) goto L_0x00bd
        L_0x0085:
            androidx.compose.ui.text.style.LineBreak$Companion r10 = androidx.compose.ui.text.style.LineBreak.f19032b
            int r10 = r10.b()
            boolean r10 = androidx.compose.ui.text.style.LineBreak.f(r6, r10)
            if (r10 != 0) goto L_0x009b
            int r10 = r24.d()
            boolean r10 = androidx.compose.ui.text.style.LineBreak.f(r6, r10)
            if (r10 == 0) goto L_0x00bd
        L_0x009b:
            androidx.compose.ui.text.style.Hyphens$Companion r10 = androidx.compose.ui.text.style.Hyphens.f19027b
            int r10 = r10.c()
            boolean r10 = androidx.compose.ui.text.style.Hyphens.g(r7, r10)
            if (r10 != 0) goto L_0x00b1
            int r10 = r24.c()
            boolean r10 = androidx.compose.ui.text.style.Hyphens.g(r7, r10)
            if (r10 == 0) goto L_0x00bd
        L_0x00b1:
            if (r8 == 0) goto L_0x0146
            androidx.compose.ui.text.style.TextMotion r10 = r24.k()
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r8, r10)
            if (r10 != 0) goto L_0x0146
        L_0x00bd:
            long r13 = androidx.compose.ui.unit.TextUnit.f(r27)
            r15 = 0
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 != 0) goto L_0x00cd
            long r10 = r24.e()
            r15 = r10
            goto L_0x00ce
        L_0x00cd:
            r15 = r11
        L_0x00ce:
            if (r3 != 0) goto L_0x00d4
            androidx.compose.ui.text.style.TextIndent r3 = r24.j()
        L_0x00d4:
            r17 = r3
            int r3 = r9.g()
            boolean r3 = androidx.compose.ui.text.style.TextAlign.k(r1, r3)
            if (r3 != 0) goto L_0x00e2
        L_0x00e0:
            r13 = r1
            goto L_0x00e7
        L_0x00e2:
            int r1 = r24.h()
            goto L_0x00e0
        L_0x00e7:
            androidx.compose.ui.text.style.TextDirection$Companion r1 = androidx.compose.ui.text.style.TextDirection.f19094b
            int r1 = r1.f()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.j(r2, r1)
            if (r1 != 0) goto L_0x00f5
            r14 = r2
            goto L_0x00fa
        L_0x00f5:
            int r1 = r24.i()
            r14 = r1
        L_0x00fa:
            androidx.compose.ui.text.PlatformParagraphStyle r18 = d(r0, r4)
            if (r5 != 0) goto L_0x0107
            androidx.compose.ui.text.style.LineHeightStyle r1 = r24.f()
            r19 = r1
            goto L_0x0109
        L_0x0107:
            r19 = r5
        L_0x0109:
            androidx.compose.ui.text.style.LineBreak$Companion r1 = androidx.compose.ui.text.style.LineBreak.f19032b
            int r1 = r1.b()
            boolean r1 = androidx.compose.ui.text.style.LineBreak.f(r6, r1)
            if (r1 != 0) goto L_0x0118
            r20 = r6
            goto L_0x011e
        L_0x0118:
            int r1 = r24.d()
            r20 = r1
        L_0x011e:
            androidx.compose.ui.text.style.Hyphens$Companion r1 = androidx.compose.ui.text.style.Hyphens.f19027b
            int r1 = r1.c()
            boolean r1 = androidx.compose.ui.text.style.Hyphens.g(r7, r1)
            if (r1 != 0) goto L_0x012d
            r21 = r7
            goto L_0x0133
        L_0x012d:
            int r1 = r24.c()
            r21 = r1
        L_0x0133:
            if (r8 != 0) goto L_0x013c
            androidx.compose.ui.text.style.TextMotion r0 = r24.k()
            r22 = r0
            goto L_0x013e
        L_0x013c:
            r22 = r8
        L_0x013e:
            androidx.compose.ui.text.ParagraphStyle r0 = new androidx.compose.ui.text.ParagraphStyle
            r23 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23)
        L_0x0146:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyleKt.a(androidx.compose.ui.text.ParagraphStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion):androidx.compose.ui.text.ParagraphStyle");
    }

    public static final ParagraphStyle b(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f2) {
        int n2 = ((TextAlign) SpanStyleKt.d(TextAlign.h(paragraphStyle.h()), TextAlign.h(paragraphStyle2.h()), f2)).n();
        int m2 = ((TextDirection) SpanStyleKt.d(TextDirection.g(paragraphStyle.i()), TextDirection.g(paragraphStyle2.i()), f2)).m();
        long f3 = SpanStyleKt.f(paragraphStyle.e(), paragraphStyle2.e(), f2);
        TextIndent j2 = paragraphStyle.j();
        if (j2 == null) {
            j2 = TextIndent.f19111c.a();
        }
        TextIndent j3 = paragraphStyle2.j();
        if (j3 == null) {
            j3 = TextIndent.f19111c.a();
        }
        return new ParagraphStyle(n2, m2, f3, TextIndentKt.a(j2, j3, f2), c(paragraphStyle.g(), paragraphStyle2.g(), f2), (LineHeightStyle) SpanStyleKt.d(paragraphStyle.f(), paragraphStyle2.f(), f2), ((LineBreak) SpanStyleKt.d(LineBreak.c(paragraphStyle.d()), LineBreak.c(paragraphStyle2.d()), f2)).l(), ((Hyphens) SpanStyleKt.d(Hyphens.d(paragraphStyle.c()), Hyphens.d(paragraphStyle2.c()), f2)).j(), (TextMotion) SpanStyleKt.d(paragraphStyle.k(), paragraphStyle2.k(), f2), (DefaultConstructorMarker) null);
    }

    public static final PlatformParagraphStyle c(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f2) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.f18341c.a();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.f18341c.a();
        }
        return AndroidTextStyle_androidKt.b(platformParagraphStyle, platformParagraphStyle2, f2);
    }

    public static final PlatformParagraphStyle d(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        return paragraphStyle.g() == null ? platformParagraphStyle : platformParagraphStyle == null ? paragraphStyle.g() : paragraphStyle.g().d(platformParagraphStyle);
    }

    public static final ParagraphStyle e(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        int h2 = paragraphStyle.h();
        TextAlign.Companion companion = TextAlign.f19080b;
        int f2 = TextAlign.k(h2, companion.g()) ? companion.f() : paragraphStyle.h();
        int e2 = TextStyleKt.e(layoutDirection, paragraphStyle.i());
        long e3 = TextUnit.f(paragraphStyle.e()) == 0 ? f18328a : paragraphStyle.e();
        TextIndent j2 = paragraphStyle.j();
        if (j2 == null) {
            j2 = TextIndent.f19111c.a();
        }
        TextIndent textIndent = j2;
        PlatformParagraphStyle g2 = paragraphStyle.g();
        LineHeightStyle f3 = paragraphStyle.f();
        int d2 = paragraphStyle.d();
        LineBreak.Companion companion2 = LineBreak.f19032b;
        int a2 = LineBreak.f(d2, companion2.b()) ? companion2.a() : paragraphStyle.d();
        int c2 = paragraphStyle.c();
        Hyphens.Companion companion3 = Hyphens.f19027b;
        int b2 = Hyphens.g(c2, companion3.c()) ? companion3.b() : paragraphStyle.c();
        TextMotion k2 = paragraphStyle.k();
        if (k2 == null) {
            k2 = TextMotion.f19115c.a();
        }
        return new ParagraphStyle(f2, e2, e3, textIndent, g2, f3, a2, b2, k2, (DefaultConstructorMarker) null);
    }
}
