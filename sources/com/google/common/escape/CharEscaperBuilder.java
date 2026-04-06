package com.google.common.escape;

@ElementTypesAreNonnullByDefault
public final class CharEscaperBuilder {

    public static class CharArrayDecorator extends CharEscaper {

        /* renamed from: b  reason: collision with root package name */
        public final char[][] f28696b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28697c;

        public String a(String str) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                char[][] cArr = this.f28696b;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return c(str, i2);
                }
            }
            return str;
        }

        public char[] b(char c2) {
            if (c2 < this.f28697c) {
                return this.f28696b[c2];
            }
            return null;
        }
    }
}
