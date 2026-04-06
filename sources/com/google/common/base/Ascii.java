package com.google.common.base;

@ElementTypesAreNonnullByDefault
public final class Ascii {
    public static boolean a(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean b(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static String c(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (b(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (b(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static char d(char c2) {
        return a(c2) ? (char) (c2 ^ ' ') : c2;
    }

    public static String e(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (a(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (a(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String f(CharSequence charSequence, int i2, String str) {
        Preconditions.q(charSequence);
        int length = i2 - str.length();
        Preconditions.h(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i2, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i2) {
            String charSequence2 = charSequence.toString();
            int length3 = charSequence2.length();
            str2 = charSequence2;
            if (length3 <= i2) {
                return charSequence2;
            }
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str2, 0, length);
        sb.append(str);
        return sb.toString();
    }
}
