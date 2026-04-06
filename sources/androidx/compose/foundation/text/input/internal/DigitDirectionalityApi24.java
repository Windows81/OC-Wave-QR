package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;

@Metadata
final class DigitDirectionalityApi24 {

    /* renamed from: a  reason: collision with root package name */
    public static final DigitDirectionalityApi24 f6183a = new DigitDirectionalityApi24();

    public final byte a(Locale locale) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
    }
}
