package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;

@Metadata
public final class AndroidFontUtils_androidKt {
    public static final FontWeight a(FontWeight.Companion companion) {
        return companion.l();
    }

    public static final int b(boolean z2, boolean z3) {
        if (z3 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z3 ? 2 : 0;
    }

    public static final int c(FontWeight fontWeight, int i2) {
        return b(fontWeight.compareTo(a(FontWeight.f18746A)) >= 0, FontStyle.f(i2, FontStyle.f18724b.a()));
    }
}
