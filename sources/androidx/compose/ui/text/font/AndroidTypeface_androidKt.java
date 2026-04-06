package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import kotlin.Metadata;

@Metadata
public final class AndroidTypeface_androidKt {
    public static final FontFamily a(Typeface typeface) {
        return FontFamilyKt.a(b(typeface));
    }

    public static final Typeface b(Typeface typeface) {
        return new AndroidTypefaceWrapper(typeface);
    }
}
