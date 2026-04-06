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
public final class AndroidDefaultTypeface implements AndroidTypeface {
    public Typeface a(FontWeight fontWeight, int i2, int i3) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.defaultFromStyle(AndroidFontUtils_androidKt.c(fontWeight, i2)) : TypefaceHelperMethodsApi28.f18765a.a(Typeface.DEFAULT, fontWeight.y(), FontStyle.f(i2, FontStyle.f18724b.a()));
    }
}
