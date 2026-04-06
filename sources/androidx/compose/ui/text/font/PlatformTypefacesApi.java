package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PlatformTypefacesApi implements PlatformTypefaces {
    private final Typeface e(String str, FontWeight fontWeight, int i2) {
        if (str.length() == 0) {
            return null;
        }
        Typeface d2 = d(str, fontWeight, i2);
        if (Intrinsics.d(d2, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.c(fontWeight, i2))) || Intrinsics.d(d2, d((String) null, fontWeight, i2))) {
            return null;
        }
        return d2;
    }

    public Typeface a(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i2) {
        Typeface e2 = e(PlatformTypefaces_androidKt.b(genericFontFamily.n(), fontWeight), fontWeight, i2);
        return e2 == null ? d(genericFontFamily.n(), fontWeight, i2) : e2;
    }

    public Typeface b(FontWeight fontWeight, int i2) {
        return d((String) null, fontWeight, i2);
    }

    public Typeface c(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings, Context context) {
        FontFamily.Companion companion = FontFamily.f18695A;
        return PlatformTypefaces_androidKt.c(Intrinsics.d(str, companion.d().n()) ? a(companion.d(), fontWeight, i2) : Intrinsics.d(str, companion.e().n()) ? a(companion.e(), fontWeight, i2) : Intrinsics.d(str, companion.c().n()) ? a(companion.c(), fontWeight, i2) : Intrinsics.d(str, companion.a().n()) ? a(companion.a(), fontWeight, i2) : e(str, fontWeight, i2), settings, context);
    }

    public final Typeface d(String str, FontWeight fontWeight, int i2) {
        if (FontStyle.f(i2, FontStyle.f18724b.b()) && Intrinsics.d(fontWeight, FontWeight.f18746A.g()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int c2 = AndroidFontUtils_androidKt.c(fontWeight, i2);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(c2) : Typeface.create(str, c2);
    }
}
