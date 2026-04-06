package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;

@Metadata
public interface PlatformTypefaces {
    Typeface a(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i2);

    Typeface b(FontWeight fontWeight, int i2);

    Typeface c(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings, Context context);
}
