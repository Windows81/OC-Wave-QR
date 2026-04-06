package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

@Metadata
public final class AndroidParagraph_androidKt {
    public static final CharSequence j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable == null) {
            spannable = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.a(spannable, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.w(spannable, new IndentationFixSpan(), spannable.length() - 1, spannable.length() - 1);
        }
        return spannable;
    }

    public static final int k(TextLayout textLayout, int i2) {
        int m2 = textLayout.m();
        for (int i3 = 0; i3 < m2; i3++) {
            if (textLayout.l(i3) > ((float) i2)) {
                return i3;
            }
        }
        return textLayout.m();
    }

    public static final boolean l(TextStyle textStyle, boolean z2) {
        if (!z2 || TextUnit.e(textStyle.q(), TextUnitKt.i(0)) || TextUnit.e(textStyle.q(), TextUnit.f19177b.a())) {
            return false;
        }
        int z3 = textStyle.z();
        TextAlign.Companion companion = TextAlign.f19080b;
        return !TextAlign.k(z3, companion.g()) && !TextAlign.k(textStyle.z(), companion.f()) && !TextAlign.k(textStyle.z(), companion.c());
    }

    public static final int m(int i2) {
        TextAlign.Companion companion = TextAlign.f19080b;
        if (TextAlign.k(i2, companion.d())) {
            return 3;
        }
        if (TextAlign.k(i2, companion.e())) {
            return 4;
        }
        if (TextAlign.k(i2, companion.a())) {
            return 2;
        }
        return (!TextAlign.k(i2, companion.f()) && TextAlign.k(i2, companion.b())) ? 1 : 0;
    }

    public static final int n(int i2) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.f19038b;
        if (LineBreak.Strategy.f(i2, companion.c())) {
            return 0;
        }
        if (LineBreak.Strategy.f(i2, companion.b())) {
            return 1;
        }
        return LineBreak.Strategy.f(i2, companion.a()) ? 2 : 0;
    }

    public static final int o(int i2) {
        Hyphens.Companion companion = Hyphens.f19027b;
        if (Hyphens.g(i2, companion.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.g(i2, companion.b());
        return 0;
    }

    public static final int p(int i2) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.f19044b;
        if (LineBreak.Strictness.g(i2, companion.a())) {
            return 0;
        }
        if (LineBreak.Strictness.g(i2, companion.b())) {
            return 1;
        }
        if (LineBreak.Strictness.g(i2, companion.c())) {
            return 2;
        }
        return LineBreak.Strictness.g(i2, companion.d()) ? 3 : 0;
    }

    public static final int q(int i2) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.f19051b;
        return (!LineBreak.WordBreak.e(i2, companion.a()) && LineBreak.WordBreak.e(i2, companion.b())) ? 1 : 0;
    }

    public static final int r(int i2) {
        TextGranularity.Companion companion = TextGranularity.f18455b;
        return (!TextGranularity.e(i2, companion.a()) && TextGranularity.e(i2, companion.b())) ? 1 : 0;
    }
}
