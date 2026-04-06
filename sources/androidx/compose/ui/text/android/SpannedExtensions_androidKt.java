package androidx.compose.ui.text.android;

import android.text.Spanned;
import kotlin.Metadata;

@Metadata
public final class SpannedExtensions_androidKt {
    public static final boolean a(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean b(Spanned spanned, Class cls, int i2, int i3) {
        return spanned.nextSpanTransition(i2 - 1, i3, cls) != i3;
    }
}
