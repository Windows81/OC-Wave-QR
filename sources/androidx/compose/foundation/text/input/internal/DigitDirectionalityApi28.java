package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;

@Metadata
final class DigitDirectionalityApi28 {

    /* renamed from: a  reason: collision with root package name */
    public static final DigitDirectionalityApi28 f6184a = new DigitDirectionalityApi28();

    public final byte a(Locale locale) {
        return Character.getDirectionality(CodepointHelpers_jvmKt.b(DecimalFormatSymbols.getInstance(locale).getDigitStrings()[0], 0));
    }
}
