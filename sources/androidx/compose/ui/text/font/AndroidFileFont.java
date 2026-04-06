package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;
import kotlin.Metadata;

@Metadata
public final class AndroidFileFont extends AndroidPreloadedFont {

    /* renamed from: i  reason: collision with root package name */
    public final File f18660i;

    public Typeface f(Context context) {
        return TypefaceBuilderCompat.f18761a.b(this.f18660i, context, e());
    }

    public String toString() {
        return "Font(file=" + this.f18660i + ", weight=" + a() + ", style=" + FontStyle.h(c()) + ')';
    }
}
