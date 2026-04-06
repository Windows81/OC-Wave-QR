package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;

public final class ConfigurationCompat {

    public static class Api24Impl {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static LocaleListCompat a(Configuration configuration) {
        return LocaleListCompat.i(Api24Impl.a(configuration));
    }
}
