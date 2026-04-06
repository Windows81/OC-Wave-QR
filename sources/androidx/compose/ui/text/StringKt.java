package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.Metadata;

@Metadata
public final class StringKt {

    /* renamed from: a  reason: collision with root package name */
    public static final PlatformStringDelegate f18454a = AndroidStringDelegate_androidKt.a();

    public static final String a(String str, Locale locale) {
        return f18454a.c(str, locale.a());
    }

    public static final String b(String str, LocaleList localeList) {
        return a(str, localeList.isEmpty() ? Locale.f18939b.a() : localeList.h(0));
    }

    public static final String c(String str, Locale locale) {
        return f18454a.a(str, locale.a());
    }

    public static final String d(String str, LocaleList localeList) {
        return c(str, localeList.isEmpty() ? Locale.f18939b.a() : localeList.h(0));
    }

    public static final String e(String str, Locale locale) {
        return f18454a.b(str, locale.a());
    }

    public static final String f(String str, LocaleList localeList) {
        return e(str, localeList.isEmpty() ? Locale.f18939b.a() : localeList.h(0));
    }

    public static final String g(String str, Locale locale) {
        return f18454a.d(str, locale.a());
    }

    public static final String h(String str, LocaleList localeList) {
        return g(str, localeList.isEmpty() ? Locale.f18939b.a() : localeList.h(0));
    }
}
