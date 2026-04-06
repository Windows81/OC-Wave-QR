package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

@Metadata
public final class SpannableExtensions_androidKt {
    public static final void A(Spannable spannable, TextIndent textIndent, float f2, Density density) {
        if (textIndent == null) {
            return;
        }
        if ((!TextUnit.e(textIndent.b(), TextUnitKt.i(0)) || !TextUnit.e(textIndent.c(), TextUnitKt.i(0))) && TextUnit.f(textIndent.b()) != 0 && TextUnit.f(textIndent.c()) != 0) {
            long g2 = TextUnit.g(textIndent.b());
            TextUnitType.Companion companion = TextUnitType.f19181b;
            float f3 = 0.0f;
            float f22 = TextUnitType.g(g2, companion.b()) ? density.f2(textIndent.b()) : TextUnitType.g(g2, companion.a()) ? TextUnit.h(textIndent.b()) * f2 : 0.0f;
            long g3 = TextUnit.g(textIndent.c());
            if (TextUnitType.g(g3, companion.b())) {
                f3 = density.f2(textIndent.c());
            } else if (TextUnitType.g(g3, companion.a())) {
                f3 = TextUnit.h(textIndent.c()) * f2;
            }
            w(spannable, new LeadingMarginSpan.Standard((int) ((float) Math.ceil((double) f22)), (int) ((float) Math.ceil((double) f3))), 0, spannable.length());
        }
    }

    public static final MetricAffectingSpan a(long j2, Density density) {
        long g2 = TextUnit.g(j2);
        TextUnitType.Companion companion = TextUnitType.f19181b;
        if (TextUnitType.g(g2, companion.b())) {
            return new LetterSpacingSpanPx(density.f2(j2));
        }
        if (TextUnitType.g(g2, companion.a())) {
            return new LetterSpacingSpanEm(TextUnit.h(j2));
        }
        return null;
    }

    public static final void b(SpanStyle spanStyle, List list, Function3 function3) {
        if (list.size() > 1) {
            int size = list.size();
            int i2 = size * 2;
            int[] iArr = new int[i2];
            Collection collection = list;
            int size2 = collection.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
                iArr[i3] = range.h();
                iArr[i3 + size] = range.f();
            }
            ArraysKt.I(iArr);
            int d0 = ArraysKt.d0(iArr);
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = iArr[i4];
                if (i5 != d0) {
                    int size3 = collection.size();
                    SpanStyle spanStyle2 = spanStyle;
                    for (int i6 = 0; i6 < size3; i6++) {
                        AnnotatedString.Range range2 = (AnnotatedString.Range) list.get(i6);
                        if (range2.h() != range2.f() && AnnotatedStringKt.i(d0, i5, range2.h(), range2.f())) {
                            spanStyle2 = f(spanStyle2, (SpanStyle) range2.g());
                        }
                    }
                    if (spanStyle2 != null) {
                        function3.d(spanStyle2, Integer.valueOf(d0), Integer.valueOf(i5));
                    }
                    d0 = i5;
                }
            }
        } else if (!list.isEmpty()) {
            function3.d(f(spanStyle, (SpanStyle) ((AnnotatedString.Range) list.get(0)).g()), Integer.valueOf(((AnnotatedString.Range) list.get(0)).h()), Integer.valueOf(((AnnotatedString.Range) list.get(0)).f()));
        }
    }

    public static final boolean c(SpanStyle spanStyle) {
        long g2 = TextUnit.g(spanStyle.o());
        TextUnitType.Companion companion = TextUnitType.f19181b;
        return TextUnitType.g(g2, companion.b()) || TextUnitType.g(TextUnit.g(spanStyle.o()), companion.a());
    }

    public static final boolean d(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.d(textStyle.N()) || textStyle.n() != null;
    }

    public static final boolean e(Density density) {
        return ((double) density.u1()) > 1.05d;
    }

    public static final SpanStyle f(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.y(spanStyle2);
    }

    public static final float g(long j2, float f2, Density density) {
        if (TextUnit.e(j2, TextUnit.f19177b.a())) {
            return f2;
        }
        long g2 = TextUnit.g(j2);
        TextUnitType.Companion companion = TextUnitType.f19181b;
        if (TextUnitType.g(g2, companion.b())) {
            return density.f2(j2);
        }
        if (TextUnitType.g(g2, companion.a())) {
            return TextUnit.h(j2) * f2;
        }
        return Float.NaN;
    }

    public static final float h(long j2, float f2, Density density) {
        float h2;
        long g2 = TextUnit.g(j2);
        TextUnitType.Companion companion = TextUnitType.f19181b;
        if (TextUnitType.g(g2, companion.b())) {
            if (!e(density)) {
                return density.f2(j2);
            }
            h2 = TextUnit.h(j2) / TextUnit.h(density.A(f2));
        } else if (!TextUnitType.g(g2, companion.a())) {
            return Float.NaN;
        } else {
            h2 = TextUnit.h(j2);
        }
        return h2 * f2;
    }

    public static final void i(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            w(spannable, new BackgroundColorSpan(ColorKt.j(j2)), i2, i3);
        }
    }

    public static final void j(Spannable spannable, BaselineShift baselineShift, int i2, int i3) {
        if (baselineShift != null) {
            w(spannable, new BaselineShiftSpan(baselineShift.j()), i2, i3);
        }
    }

    public static final void k(Spannable spannable, Brush brush, float f2, int i2, int i3) {
        if (brush == null) {
            return;
        }
        if (brush instanceof SolidColor) {
            m(spannable, ((SolidColor) brush).c(), i2, i3);
        } else if (brush instanceof ShaderBrush) {
            w(spannable, new ShaderBrushSpan((ShaderBrush) brush, f2), i2, i3);
        }
    }

    public static final void l(Spannable spannable, List list, float f2, Density density, TextIndent textIndent) {
        List list2 = list;
        float f3 = f2;
        Density density2 = density;
        float f4 = 0.0f;
        if (textIndent != null) {
            long g2 = TextUnit.g(textIndent.b());
            TextUnitType.Companion companion = TextUnitType.f19181b;
            if (TextUnitType.g(g2, companion.b())) {
                f4 = density2.f2(textIndent.b());
            } else if (TextUnitType.g(g2, companion.a())) {
                f4 = TextUnit.h(textIndent.b()) * f3;
            }
        }
        float f5 = f4;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            AnnotatedString.Range range = (AnnotatedString.Range) list2.get(i2);
            Object g3 = range.g();
            Bullet bullet = g3 instanceof Bullet ? (Bullet) g3 : null;
            if (bullet != null) {
                float g4 = g(bullet.f(), f3, density2);
                float g5 = g(bullet.d(), f3, density2);
                if (!Float.isNaN(g4) && !Float.isNaN(g5)) {
                    CustomBulletSpan customBulletSpan = r2;
                    CustomBulletSpan customBulletSpan2 = new CustomBulletSpan(bullet.e(), g4, g4, g5, bullet.b(), bullet.a(), bullet.c(), density, f5);
                    w(spannable, customBulletSpan, range.h(), range.f());
                    i2++;
                    list2 = list;
                }
            }
            Spannable spannable2 = spannable;
            i2++;
            list2 = list;
        }
    }

    public static final void m(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            w(spannable, new ForegroundColorSpan(ColorKt.j(j2)), i2, i3);
        }
    }

    public static final void n(Spannable spannable, DrawStyle drawStyle, int i2, int i3) {
        if (drawStyle != null) {
            w(spannable, new DrawStyleSpan(drawStyle), i2, i3);
        }
    }

    public static final void o(Spannable spannable, TextStyle textStyle, List list, Function4 function4) {
        SpanStyle spanStyle;
        List list2 = list;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list2.get(i2);
            if ((range.g() instanceof SpanStyle) && (TextPaintExtensions_androidKt.d((SpanStyle) range.g()) || ((SpanStyle) range.g()).m() != null)) {
                Intrinsics.g(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        if (d(textStyle)) {
            spanStyle = new SpanStyle(0, 0, textStyle.o(), textStyle.m(), textStyle.n(), textStyle.j(), (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (DefaultConstructorMarker) null);
        } else {
            spanStyle = null;
        }
        b(spanStyle, arrayList, new SpannableExtensions_androidKt$setFontAttributes$1(spannable, function4));
    }

    public static final void p(Spannable spannable, String str, int i2, int i3) {
        if (str != null) {
            w(spannable, new FontFeatureSpan(str), i2, i3);
        }
    }

    public static final void q(Spannable spannable, long j2, Density density, int i2, int i3) {
        long g2 = TextUnit.g(j2);
        TextUnitType.Companion companion = TextUnitType.f19181b;
        if (TextUnitType.g(g2, companion.b())) {
            w(spannable, new AbsoluteSizeSpan(MathKt.d(density.f2(j2)), false), i2, i3);
        } else if (TextUnitType.g(g2, companion.a())) {
            w(spannable, new RelativeSizeSpan(TextUnit.h(j2)), i2, i3);
        }
    }

    public static final void r(Spannable spannable, TextGeometricTransform textGeometricTransform, int i2, int i3) {
        if (textGeometricTransform != null) {
            w(spannable, new ScaleXSpan(textGeometricTransform.b()), i2, i3);
            w(spannable, new SkewXSpan(textGeometricTransform.c()), i2, i3);
        }
    }

    public static final void s(Spannable spannable, long j2, float f2, Density density, LineHeightStyle lineHeightStyle) {
        float h2 = h(j2, f2, density);
        if (!Float.isNaN(h2)) {
            w(spannable, new LineHeightStyleSpan(h2, 0, (spannable.length() == 0 || StringsKt.l1(spannable) == 10) ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.h(lineHeightStyle.d()), LineHeightStyle.Trim.i(lineHeightStyle.d()), lineHeightStyle.b(), LineHeightStyle.Mode.f(lineHeightStyle.c(), LineHeightStyle.Mode.f19067b.b())), 0, spannable.length());
        }
    }

    public static final void t(Spannable spannable, long j2, float f2, Density density) {
        float h2 = h(j2, f2, density);
        if (!Float.isNaN(h2)) {
            w(spannable, new LineHeightSpan(h2), 0, spannable.length());
        }
    }

    public static final void u(Spannable spannable, LocaleList localeList, int i2, int i3) {
        if (localeList != null) {
            w(spannable, LocaleListHelperMethods.f18998a.a(localeList), i2, i3);
        }
    }

    public static final void v(Spannable spannable, Shadow shadow, int i2, int i3) {
        if (shadow != null) {
            w(spannable, new ShadowSpan(ColorKt.j(shadow.c()), Float.intBitsToFloat((int) (shadow.d() >> 32)), Float.intBitsToFloat((int) (shadow.d() & 4294967295L)), TextPaintExtensions_androidKt.b(shadow.b())), i2, i3);
        }
    }

    public static final void w(Spannable spannable, Object obj, int i2, int i3) {
        spannable.setSpan(obj, i2, i3, 33);
    }

    public static final void x(Spannable spannable, SpanStyle spanStyle, int i2, int i3, Density density) {
        j(spannable, spanStyle.e(), i2, i3);
        m(spannable, spanStyle.g(), i2, i3);
        k(spannable, spanStyle.f(), spanStyle.c(), i2, i3);
        z(spannable, spanStyle.s(), i2, i3);
        q(spannable, spanStyle.k(), density, i2, i3);
        p(spannable, spanStyle.j(), i2, i3);
        r(spannable, spanStyle.u(), i2, i3);
        u(spannable, spanStyle.p(), i2, i3);
        i(spannable, spanStyle.d(), i2, i3);
        v(spannable, spanStyle.r(), i2, i3);
        n(spannable, spanStyle.h(), i2, i3);
    }

    public static final void y(Spannable spannable, TextStyle textStyle, List list, Density density, Function4 function4) {
        MetricAffectingSpan a2;
        o(spannable, textStyle, list, function4);
        Collection collection = list;
        int size = collection.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i2);
            if (range.g() instanceof SpanStyle) {
                int h2 = range.h();
                int f2 = range.f();
                if (h2 >= 0 && h2 < spannable.length() && f2 > h2 && f2 <= spannable.length()) {
                    x(spannable, (SpanStyle) range.g(), h2, f2, density);
                    if (c((SpanStyle) range.g())) {
                        z2 = true;
                    }
                }
            }
        }
        if (z2) {
            int size2 = collection.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) list.get(i3);
                AnnotatedString.Annotation annotation = (AnnotatedString.Annotation) range2.g();
                if (annotation instanceof SpanStyle) {
                    int h3 = range2.h();
                    int f3 = range2.f();
                    if (h3 >= 0 && h3 < spannable.length() && f3 > h3 && f3 <= spannable.length() && (a2 = a(((SpanStyle) annotation).o(), density)) != null) {
                        w(spannable, a2, h3, f3);
                    }
                }
            }
        }
    }

    public static final void z(Spannable spannable, TextDecoration textDecoration, int i2, int i3) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.f19089b;
            w(spannable, new TextDecorationSpan(textDecoration.d(companion.d()), textDecoration.d(companion.b())), i2, i3);
        }
    }
}
