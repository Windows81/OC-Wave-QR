package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class PlaceholderExtensions_androidKt {
    public static final int a(long j2) {
        long g2 = TextUnit.g(j2);
        TextUnitType.Companion companion = TextUnitType.f19181b;
        if (TextUnitType.g(g2, companion.b())) {
            return 0;
        }
        return TextUnitType.g(g2, companion.a()) ? 1 : 2;
    }

    public static final int b(int i2) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.f18332b;
        if (PlaceholderVerticalAlign.j(i2, companion.a())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.j(i2, companion.g())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.j(i2, companion.b())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.j(i2, companion.c())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.j(i2, companion.f())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.j(i2, companion.d())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.j(i2, companion.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    public static final void c(Spannable spannable, Placeholder placeholder, int i2, int i3, Density density) {
        for (Object obj : spannable.getSpans(i2, i3, EmojiSpan.class)) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.w(spannable, new PlaceholderSpan(TextUnit.h(placeholder.c()), a(placeholder.c()), TextUnit.h(placeholder.a()), a(placeholder.a()), density.u1() * density.getDensity(), b(placeholder.b())), i2, i3);
    }

    public static final void d(Spannable spannable, List list, Density density) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i2);
            c(spannable, (Placeholder) range.a(), range.b(), range.c(), density);
        }
    }
}
