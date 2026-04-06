package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.Font;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class DelegatingFontLoaderForDeprecatedUsage implements PlatformFontLoader {

    /* renamed from: a  reason: collision with root package name */
    public final Font.ResourceLoader f18687a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18688b;

    public Object a() {
        return this.f18688b;
    }

    public Object b(Font font) {
        return this.f18687a.a(font);
    }

    public Object c(Font font, Continuation continuation) {
        return this.f18687a.a(font);
    }
}
