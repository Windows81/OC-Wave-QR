package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.AndroidFont;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
final class NamedFontLoader implements AndroidFont.TypefaceLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final NamedFontLoader f18751a = new NamedFontLoader();

    public Typeface a(Context context, AndroidFont androidFont) {
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = androidFont instanceof DeviceFontFamilyNameFont ? (DeviceFontFamilyNameFont) androidFont : null;
        if (deviceFontFamilyNameFont != null) {
            return deviceFontFamilyNameFont.f(context);
        }
        return null;
    }

    public Object b(Context context, AndroidFont androidFont, Continuation continuation) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }
}
