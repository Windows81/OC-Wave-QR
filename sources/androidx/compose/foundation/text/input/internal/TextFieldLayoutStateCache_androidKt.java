package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import androidx.compose.ui.text.style.TextDirection;
import java.util.Locale;
import kotlin.Metadata;

@Metadata
public final class TextFieldLayoutStateCache_androidKt {
    public static final int a(Locale locale) {
        byte a2 = Build.VERSION.SDK_INT >= 28 ? DigitDirectionalityApi28.f6184a.a(locale) : DigitDirectionalityApi24.f6183a.a(locale);
        return (a2 == 1 || a2 == 2) ? TextDirection.f19094b.e() : TextDirection.f19094b.d();
    }
}
