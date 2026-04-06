package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;

@Metadata
public final class PlatformTypefaces_androidKt {
    public static final PlatformTypefaces a() {
        return Build.VERSION.SDK_INT >= 28 ? new PlatformTypefacesApi28() : new PlatformTypefacesApi();
    }

    public static final String b(String str, FontWeight fontWeight) {
        int y2 = fontWeight.y() / 100;
        if (y2 >= 0 && y2 < 2) {
            return str + "-thin";
        } else if (2 <= y2 && y2 < 4) {
            return str + "-light";
        } else if (y2 == 4) {
            return str;
        } else {
            if (y2 == 5) {
                return str + "-medium";
            } else if ((6 <= y2 && y2 < 8) || 8 > y2 || y2 >= 11) {
                return str;
            } else {
                return str + "-black";
            }
        }
    }

    public static final Typeface c(Typeface typeface, FontVariation.Settings settings, Context context) {
        return TypefaceCompatApi26.f18762a.a(typeface, settings, context);
    }
}
