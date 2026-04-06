package androidx.appcompat.app;

import androidx.core.os.LocaleListCompat;
import java.util.LinkedHashSet;
import java.util.Locale;

final class LocaleOverlayHelper {
    public static LocaleListCompat a(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = 0;
        while (i2 < localeListCompat.g() + localeListCompat2.g()) {
            Locale d2 = i2 < localeListCompat.g() ? localeListCompat.d(i2) : localeListCompat2.d(i2 - localeListCompat.g());
            if (d2 != null) {
                linkedHashSet.add(d2);
            }
            i2++;
        }
        return LocaleListCompat.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static LocaleListCompat b(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        return (localeListCompat == null || localeListCompat.f()) ? LocaleListCompat.e() : a(localeListCompat, localeListCompat2);
    }
}
