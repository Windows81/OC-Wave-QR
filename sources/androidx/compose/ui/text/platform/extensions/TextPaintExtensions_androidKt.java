package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle a(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z2) {
        long g2 = TextUnit.g(spanStyle.k());
        TextUnitType.Companion companion = TextUnitType.f19181b;
        if (TextUnitType.g(g2, companion.b())) {
            androidTextPaint.setTextSize(density.f2(spanStyle.k()));
        } else if (TextUnitType.g(g2, companion.a())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.h(spanStyle.k()));
        }
        if (d(spanStyle)) {
            FontFamily i2 = spanStyle.i();
            FontWeight n2 = spanStyle.n();
            if (n2 == null) {
                n2 = FontWeight.f18746A.g();
            }
            FontStyle l2 = spanStyle.l();
            FontStyle c2 = FontStyle.c(l2 != null ? l2.i() : FontStyle.f18724b.b());
            FontSynthesis m2 = spanStyle.m();
            androidTextPaint.setTypeface((Typeface) function4.j(i2, n2, c2, FontSynthesis.e(m2 != null ? m2.m() : FontSynthesis.f18728b.a())));
        }
        if (spanStyle.p() != null && !Intrinsics.d(spanStyle.p(), LocaleList.f18941B.a())) {
            LocaleListHelperMethods.f18998a.b(androidTextPaint, spanStyle.p());
        }
        if (spanStyle.j() != null && !Intrinsics.d(spanStyle.j(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.j());
        }
        if (spanStyle.u() != null && !Intrinsics.d(spanStyle.u(), TextGeometricTransform.f19107c.a())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.u().b());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.u().c());
        }
        androidTextPaint.f(spanStyle.g());
        androidTextPaint.e(spanStyle.f(), Size.f15876b.a(), spanStyle.c());
        androidTextPaint.h(spanStyle.r());
        androidTextPaint.i(spanStyle.s());
        androidTextPaint.g(spanStyle.h());
        if (TextUnitType.g(TextUnit.g(spanStyle.o()), companion.b()) && TextUnit.h(spanStyle.o()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float f2 = density.f2(spanStyle.o());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(f2 / textSize);
            }
        } else if (TextUnitType.g(TextUnit.g(spanStyle.o()), companion.a())) {
            androidTextPaint.setLetterSpacing(TextUnit.h(spanStyle.o()));
        }
        return c(spanStyle.o(), z2, spanStyle.d(), spanStyle.e());
    }

    public static final float b(float f2) {
        if (f2 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f2;
    }

    public static final SpanStyle c(long j2, boolean z2, long j3, BaselineShift baselineShift) {
        long j4 = j3;
        boolean z3 = false;
        boolean z4 = z2 && TextUnitType.g(TextUnit.g(j2), TextUnitType.f19181b.b()) && TextUnit.h(j2) != 0.0f;
        Color.Companion companion = Color.f15975b;
        boolean z5 = !Color.n(j4, companion.f()) && !Color.n(j4, companion.e());
        if (baselineShift != null) {
            if (!BaselineShift.g(baselineShift.j(), BaselineShift.f19019b.a())) {
                z3 = true;
            }
        }
        if (!z4 && !z5 && !z3) {
            return null;
        }
        long a2 = z4 ? j2 : TextUnit.f19177b.a();
        if (!z5) {
            j4 = companion.f();
        }
        return new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, a2, z3 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, j4, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean d(SpanStyle spanStyle) {
        return (spanStyle.i() == null && spanStyle.l() == null && spanStyle.n() == null) ? false : true;
    }

    public static final void e(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.f19115c.a();
        }
        androidTextPaint.setFlags(textMotion.c() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & -129);
        int b2 = textMotion.b();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.f19120b;
        if (TextMotion.Linearity.g(b2, companion.b())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.g(b2, companion.a())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.g(b2, companion.c())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }
}
