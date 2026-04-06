package androidx.compose.material3;

import java.util.Locale;
import kotlin.Metadata;

@Metadata
public interface DatePickerFormatter {
    static /* synthetic */ String b(DatePickerFormatter datePickerFormatter, Long l2, Locale locale, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return datePickerFormatter.a(l2, locale, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatDate");
    }

    String a(Long l2, Locale locale, boolean z2);

    String c(Long l2, Locale locale);
}
