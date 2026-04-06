package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public String a(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(CharsKt.d(str.charAt(0), locale));
        String substring = str.substring(1);
        Intrinsics.h(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    public String b(String str, Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public String c(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append(Character.isLowerCase(charAt) ? CharsKt.e(charAt, locale) : String.valueOf(charAt));
        String substring = str.substring(1);
        Intrinsics.h(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    public String d(String str, Locale locale) {
        String upperCase = str.toUpperCase(locale);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
