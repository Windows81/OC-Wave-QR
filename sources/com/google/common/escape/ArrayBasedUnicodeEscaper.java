package com.google.common.escape;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {

    /* renamed from: b  reason: collision with root package name */
    public final char[][] f28690b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28691c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28692d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28693e;

    /* renamed from: f  reason: collision with root package name */
    public final char f28694f;

    /* renamed from: g  reason: collision with root package name */
    public final char f28695g;

    public final String a(String str) {
        Preconditions.q(str);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < this.f28691c && this.f28690b[charAt] != null) || charAt > this.f28695g || charAt < this.f28694f) {
                return d(str, i2);
            }
        }
        return str;
    }

    public final char[] c(int i2) {
        char[] cArr;
        if (i2 < this.f28691c && (cArr = this.f28690b[i2]) != null) {
            return cArr;
        }
        if (i2 < this.f28692d || i2 > this.f28693e) {
            return g(i2);
        }
        return null;
    }

    public final int f(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            char charAt = charSequence.charAt(i2);
            if ((charAt < this.f28691c && this.f28690b[charAt] != null) || charAt > this.f28695g || charAt < this.f28694f) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public abstract char[] g(int i2);
}
