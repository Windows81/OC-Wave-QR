package kotlin.text;

import kotlin.Metadata;

@Metadata
class CharsKt__CharKt extends CharsKt__CharJVMKt {
    public static int g(char c2) {
        int b2 = CharsKt__CharJVMKt.b(c2, 10);
        if (b2 >= 0) {
            return b2;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
    }

    public static final boolean h(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
