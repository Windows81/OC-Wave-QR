package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.AndroidFont;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
final class AndroidPreloadedFontTypefaceLoader implements AndroidFont.TypefaceLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidPreloadedFontTypefaceLoader f18673a = new AndroidPreloadedFontTypefaceLoader();

    public Typeface a(Context context, AndroidFont androidFont) {
        AndroidPreloadedFont androidPreloadedFont = androidFont instanceof AndroidPreloadedFont ? (AndroidPreloadedFont) androidFont : null;
        if (androidPreloadedFont != null) {
            return androidPreloadedFont.g(context);
        }
        return null;
    }

    public Object b(Context context, AndroidFont androidFont, Continuation continuation) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }
}
