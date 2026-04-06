package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public final class AndroidFontResourceLoader implements Font.ResourceLoader {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17624a;

    public AndroidFontResourceLoader(Context context) {
        this.f17624a = context;
    }

    /* renamed from: b */
    public Typeface a(Font font) {
        if (font instanceof ResourceFont) {
            return AndroidFontResourceLoaderHelper.f17625a.a(this.f17624a, ((ResourceFont) font).d());
        }
        throw new IllegalArgumentException("Unknown font type: " + font);
    }
}
