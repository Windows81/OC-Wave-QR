package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata
public final class StringHelpersKt {
    public static final int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        while (i2 < length) {
            if (charSequence.charAt(i2) == 10) {
                return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i2) {
        while (i2 > 0) {
            if (charSequence.charAt(i2 - 1) == 10) {
                return i2;
            }
            i2--;
        }
        return 0;
    }

    public static final long c(CharSequence charSequence, int i2) {
        return TextRangeKt.b(b(charSequence, i2), a(charSequence, i2));
    }
}
