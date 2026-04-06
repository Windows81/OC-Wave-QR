package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidAccessibilitySpannableString_androidKt {
    public static final void a(SpannableString spannableString, SpanStyle spanStyle, int i2, int i3, Density density, FontFamily.Resolver resolver) {
        SpannableExtensions_androidKt.m(spannableString, spanStyle.g(), i2, i3);
        SpannableExtensions_androidKt.q(spannableString, spanStyle.k(), density, i2, i3);
        if (!(spanStyle.n() == null && spanStyle.l() == null)) {
            FontWeight n2 = spanStyle.n();
            if (n2 == null) {
                n2 = FontWeight.f18746A.g();
            }
            FontStyle l2 = spanStyle.l();
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.c(n2, l2 != null ? l2.i() : FontStyle.f18724b.b())), i2, i3, 33);
        }
        if (spanStyle.i() != null) {
            if (spanStyle.i() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.i()).n()), i2, i3, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily i4 = spanStyle.i();
                FontSynthesis m2 = spanStyle.m();
                Object value = FontFamily.Resolver.b(resolver, i4, (FontWeight) null, 0, m2 != null ? m2.m() : FontSynthesis.f18728b.a(), 6, (Object) null).getValue();
                Intrinsics.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(Api28Impl.f18981a.a((Typeface) value), i2, i3, 33);
            }
        }
        if (spanStyle.s() != null) {
            TextDecoration s2 = spanStyle.s();
            TextDecoration.Companion companion = TextDecoration.f19089b;
            if (s2.d(companion.d())) {
                spannableString.setSpan(new UnderlineSpan(), i2, i3, 33);
            }
            if (spanStyle.s().d(companion.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i2, i3, 33);
            }
        }
        if (spanStyle.u() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.u().b()), i2, i3, 33);
        }
        SpannableExtensions_androidKt.u(spannableString, spanStyle.p(), i2, i3);
        SpannableExtensions_androidKt.i(spannableString, spanStyle.d(), i2, i3);
    }

    public static final SpannableString b(AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver, URLSpanCache uRLSpanCache) {
        AnnotatedString annotatedString2 = annotatedString;
        URLSpanCache uRLSpanCache2 = uRLSpanCache;
        SpannableString spannableString = new SpannableString(annotatedString.k());
        List i2 = annotatedString.i();
        if (i2 != null) {
            int size = i2.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range range = (AnnotatedString.Range) i2.get(i3);
                a(spannableString, SpanStyle.b((SpanStyle) range.a(), 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (Object) null), range.b(), range.c(), density, resolver);
            }
        }
        List l2 = annotatedString2.l(0, annotatedString.length());
        int size2 = l2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range2 = (AnnotatedString.Range) l2.get(i4);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.a((TtsAnnotation) range2.a()), range2.b(), range2.c(), 33);
        }
        List m2 = annotatedString2.m(0, annotatedString.length());
        int size3 = m2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) m2.get(i5);
            spannableString.setSpan(uRLSpanCache2.c((UrlAnnotation) range3.a()), range3.b(), range3.c(), 33);
        }
        List e2 = annotatedString2.e(0, annotatedString.length());
        int size4 = e2.size();
        for (int i6 = 0; i6 < size4; i6++) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) e2.get(i6);
            if (range4.h() != range4.f()) {
                LinkAnnotation linkAnnotation = (LinkAnnotation) range4.g();
                if (!(linkAnnotation instanceof LinkAnnotation.Url) || linkAnnotation.a() != null) {
                    spannableString.setSpan(uRLSpanCache2.a(range4), range4.h(), range4.f(), 33);
                } else {
                    spannableString.setSpan(uRLSpanCache2.b(c(range4)), range4.h(), range4.f(), 33);
                }
            }
        }
        return spannableString;
    }

    public static final AnnotatedString.Range c(AnnotatedString.Range range) {
        Object g2 = range.g();
        Intrinsics.g(g2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new AnnotatedString.Range((LinkAnnotation.Url) g2, range.h(), range.f());
    }
}
