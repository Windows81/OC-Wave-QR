package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;

@Metadata
public final class AndroidTypefaceWrapper implements AndroidTypeface {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f18980a;

    public AndroidTypefaceWrapper(Typeface typeface) {
        this.f18980a = typeface;
    }

    public Typeface a(FontWeight fontWeight, int i2, int i3) {
        return this.f18980a;
    }
}
