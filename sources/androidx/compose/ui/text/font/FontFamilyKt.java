package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class FontFamilyKt {
    public static final FontFamily a(Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }

    public static final FontFamily b(Font... fontArr) {
        return new FontListFontFamily(ArraysKt.d(fontArr));
    }
}
