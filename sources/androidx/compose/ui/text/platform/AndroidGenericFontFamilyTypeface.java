package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f18950a;

    public Typeface a(FontWeight fontWeight, int i2, int i3) {
        return b(fontWeight, i2);
    }

    public final Typeface b(FontWeight fontWeight, int i2) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(this.f18950a, AndroidFontUtils_androidKt.c(fontWeight, i2)) : TypefaceHelperMethodsApi28.f18765a.a(this.f18950a, fontWeight.y(), FontStyle.f(i2, FontStyle.f18724b.a()));
    }
}
