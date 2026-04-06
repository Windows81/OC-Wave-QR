package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import kotlin.Metadata;

@Metadata
public final class AndroidFileDescriptorFont extends AndroidPreloadedFont {

    /* renamed from: i  reason: collision with root package name */
    public final ParcelFileDescriptor f18659i;

    public Typeface f(Context context) {
        return TypefaceBuilderCompat.f18761a.c(this.f18659i, context, e());
    }

    public String toString() {
        return "Font(fileDescriptor=" + this.f18659i + ", weight=" + a() + ", style=" + FontStyle.h(c()) + ')';
    }
}
