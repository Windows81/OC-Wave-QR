package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
class CharsKt__CharJVMKt {
    public static int a(int i2) {
        if (2 <= i2 && i2 < 37) {
            return i2;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new IntRange(2, 36));
    }

    public static final int b(char c2, int i2) {
        return Character.digit(c2, i2);
    }

    public static boolean c(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static String d(char c2, Locale locale) {
        Intrinsics.i(locale, "locale");
        String valueOf = String.valueOf(c2);
        Intrinsics.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static String e(char c2, Locale locale) {
        Intrinsics.i(locale, "locale");
        String f2 = f(c2, locale);
        if (f2.length() <= 1) {
            String valueOf = String.valueOf(c2);
            Intrinsics.g(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            return !Intrinsics.d(f2, upperCase) ? f2 : String.valueOf(Character.toTitleCase(c2));
        } else if (c2 == 329) {
            return f2;
        } else {
            char charAt = f2.charAt(0);
            Intrinsics.g(f2, "null cannot be cast to non-null type java.lang.String");
            String substring = f2.substring(1);
            Intrinsics.h(substring, "substring(...)");
            Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            return charAt + lowerCase;
        }
    }

    public static final String f(char c2, Locale locale) {
        Intrinsics.i(locale, "locale");
        String valueOf = String.valueOf(c2);
        Intrinsics.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
