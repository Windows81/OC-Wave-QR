package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.Font;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {

    /* renamed from: a  reason: collision with root package name */
    public final Font.ResourceLoader f18684a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f18685b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f18686c;

    public Object a() {
        return this.f18686c;
    }

    public Object b(Font font) {
        if (!(font instanceof AndroidFont)) {
            return this.f18684a.a(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.d().a(this.f18685b, androidFont);
    }

    public Object c(Font font, Continuation continuation) {
        if (!(font instanceof AndroidFont)) {
            return this.f18684a.a(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.d().b(this.f18685b, androidFont, continuation);
    }
}
