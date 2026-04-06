package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata
public final class CalendarLocale_jvmKt {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap f9351a = new WeakHashMap();

    public static final NumberFormat a(int i2, int i3, boolean z2, Locale locale) {
        String str = i2 + '.' + i3 + '.' + z2 + '.' + locale.toLanguageTag();
        WeakHashMap weakHashMap = f9351a;
        Object obj = weakHashMap.get(str);
        NumberFormat numberFormat = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(z2);
            integerInstance.setMinimumIntegerDigits(i2);
            integerInstance.setMaximumIntegerDigits(i3);
            weakHashMap.put(str, integerInstance);
            numberFormat = integerInstance;
        }
        return (NumberFormat) numberFormat;
    }

    public static final String b(int i2, int i3, int i4, boolean z2, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return a(i3, i4, z2, locale).format(Integer.valueOf(i2));
    }

    public static /* synthetic */ String c(int i2, int i3, int i4, boolean z2, Locale locale, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i3 = 1;
        }
        if ((i5 & 2) != 0) {
            i4 = 40;
        }
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        if ((i5 & 8) != 0) {
            locale = null;
        }
        return b(i2, i3, i4, z2, locale);
    }
}
