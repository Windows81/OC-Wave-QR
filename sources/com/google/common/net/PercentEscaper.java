package com.google.common.net;

import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;

@ElementTypesAreNonnullByDefault
public final class PercentEscaper extends UnicodeEscaper {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f29114d = {'+'};

    /* renamed from: e  reason: collision with root package name */
    public static final char[] f29115e = "0123456789ABCDEF".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29116b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f29117c;

    public PercentEscaper(String str, boolean z2) {
        Preconditions.q(str);
        if (!str.matches(".*[0-9A-Za-z].*")) {
            String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            if (!z2 || !concat.contains(" ")) {
                this.f29116b = z2;
                this.f29117c = g(concat);
                return;
            }
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    public static boolean[] g(String str) {
        char[] charArray = str.toCharArray();
        int i2 = -1;
        for (char max : charArray) {
            i2 = Math.max(max, i2);
        }
        boolean[] zArr = new boolean[(i2 + 1)];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    public String a(String str) {
        Preconditions.q(str);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            boolean[] zArr = this.f29117c;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return d(str, i2);
            }
        }
        return str;
    }

    public char[] c(int i2) {
        boolean[] zArr = this.f29117c;
        if (i2 < zArr.length && zArr[i2]) {
            return null;
        }
        if (i2 == 32 && this.f29116b) {
            return f29114d;
        }
        if (i2 <= 127) {
            char[] cArr = new char[3];
            cArr[0] = '%';
            char[] cArr2 = f29115e;
            cArr[2] = cArr2[i2 & 15];
            cArr[1] = cArr2[i2 >>> 4];
            return cArr;
        } else if (i2 <= 2047) {
            char[] cArr3 = new char[6];
            cArr3[0] = '%';
            cArr3[3] = '%';
            char[] cArr4 = f29115e;
            cArr3[5] = cArr4[i2 & 15];
            cArr3[4] = cArr4[((i2 >>> 4) & 3) | 8];
            cArr3[2] = cArr4[(i2 >>> 6) & 15];
            cArr3[1] = cArr4[(i2 >>> 10) | 12];
            return cArr3;
        } else if (i2 <= 65535) {
            char[] cArr5 = new char[9];
            cArr5[0] = '%';
            cArr5[1] = 'E';
            cArr5[3] = '%';
            cArr5[6] = '%';
            char[] cArr6 = f29115e;
            cArr5[8] = cArr6[i2 & 15];
            cArr5[7] = cArr6[((i2 >>> 4) & 3) | 8];
            cArr5[5] = cArr6[(i2 >>> 6) & 15];
            cArr5[4] = cArr6[((i2 >>> 10) & 3) | 8];
            cArr5[2] = cArr6[i2 >>> 12];
            return cArr5;
        } else if (i2 <= 1114111) {
            char[] cArr7 = new char[12];
            cArr7[0] = '%';
            cArr7[1] = 'F';
            cArr7[3] = '%';
            cArr7[6] = '%';
            cArr7[9] = '%';
            char[] cArr8 = f29115e;
            cArr7[11] = cArr8[i2 & 15];
            cArr7[10] = cArr8[((i2 >>> 4) & 3) | 8];
            cArr7[8] = cArr8[(i2 >>> 6) & 15];
            cArr7[7] = cArr8[((i2 >>> 10) & 3) | 8];
            cArr7[5] = cArr8[(i2 >>> 12) & 15];
            cArr7[4] = cArr8[((i2 >>> 16) & 3) | 8];
            cArr7[2] = cArr8[(i2 >>> 18) & 7];
            return cArr7;
        } else {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Invalid unicode character value ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public int f(CharSequence charSequence, int i2, int i3) {
        Preconditions.q(charSequence);
        while (i2 < i3) {
            char charAt = charSequence.charAt(i2);
            boolean[] zArr = this.f29117c;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i2++;
        }
        return i2;
    }
}
