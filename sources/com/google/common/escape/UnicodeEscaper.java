package com.google.common.escape;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
public abstract class UnicodeEscaper extends Escaper {
    public static int b(CharSequence charSequence, int i2, int i3) {
        Preconditions.q(charSequence);
        if (i2 < i3) {
            int i4 = i2 + 1;
            char charAt = charSequence.charAt(i2);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                String valueOf = String.valueOf(charSequence);
                StringBuilder sb = new StringBuilder(valueOf.length() + 88);
                sb.append("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append("' with value ");
                sb.append(charAt);
                sb.append(" at index ");
                sb.append(i2);
                sb.append(" in '");
                sb.append(valueOf);
                sb.append("'");
                throw new IllegalArgumentException(sb.toString());
            } else if (i4 == i3) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i4);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                String valueOf2 = String.valueOf(charSequence);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 89);
                sb2.append("Expected low surrogate but got char '");
                sb2.append(charAt2);
                sb2.append("' with value ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i4);
                sb2.append(" in '");
                sb2.append(valueOf2);
                sb2.append("'");
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    private static char[] e(char[] cArr, int i2, int i3) {
        if (i3 >= 0) {
            char[] cArr2 = new char[i3];
            if (i2 > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i2);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    public String a(String str) {
        Preconditions.q(str);
        int length = str.length();
        int f2 = f(str, 0, length);
        return f2 == length ? str : d(str, f2);
    }

    public abstract char[] c(int i2);

    public final String d(String str, int i2) {
        int length = str.length();
        char[] a2 = Platform.a();
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int b2 = b(str, i2, length);
            if (b2 >= 0) {
                char[] c2 = c(b2);
                int i5 = (Character.isSupplementaryCodePoint(b2) ? 2 : 1) + i2;
                if (c2 != null) {
                    int i6 = i2 - i3;
                    int i7 = i4 + i6;
                    int length2 = c2.length + i7;
                    if (a2.length < length2) {
                        a2 = e(a2, i4, length2 + (length - i2) + 32);
                    }
                    if (i6 > 0) {
                        str.getChars(i3, i2, a2, i4);
                        i4 = i7;
                    }
                    if (c2.length > 0) {
                        System.arraycopy(c2, 0, a2, i4, c2.length);
                        i4 += c2.length;
                    }
                    i3 = i5;
                }
                i2 = f(str, i5, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i8 = length - i3;
        if (i8 > 0) {
            int i9 = i8 + i4;
            if (a2.length < i9) {
                a2 = e(a2, i4, i9);
            }
            str.getChars(i3, length, a2, i4);
            i4 = i9;
        }
        return new String(a2, 0, i4);
    }

    public int f(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            int b2 = b(charSequence, i2, i3);
            if (b2 < 0 || c(b2) != null) {
                break;
            }
            i2 += Character.isSupplementaryCodePoint(b2) ? 2 : 1;
        }
        return i2;
    }
}
