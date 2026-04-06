package com.google.android.gms.internal.measurement;

final class zzod extends zzoe {
    public final int a(int i2, byte[] bArr, int i3, int i4) {
        while (r10 < i4 && bArr[r10] >= 0) {
            i3 = r10 + 1;
        }
        if (r10 >= i4) {
            return 0;
        }
        while (r10 < i4) {
            int i5 = r10 + 1;
            byte b2 = bArr[r10];
            if (b2 >= 0) {
                r10 = i5;
            } else if (b2 < -32) {
                if (i5 >= i4) {
                    return b2;
                }
                if (b2 >= -62) {
                    r10 += 2;
                    if (bArr[i5] > -65) {
                    }
                }
                return -1;
            } else if (b2 < -16) {
                if (i5 >= i4 - 1) {
                    return zzoc.c(bArr, i5, i4);
                }
                int i6 = r10 + 2;
                byte b3 = bArr[i5];
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    r10 += 3;
                    if (bArr[i6] > -65) {
                    }
                }
                return -1;
            } else if (i5 >= i4 - 2) {
                return zzoc.c(bArr, i5, i4);
            } else {
                int i7 = r10 + 2;
                byte b4 = bArr[i5];
                if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                    int i8 = r10 + 3;
                    if (bArr[i7] <= -65) {
                        r10 += 4;
                        if (bArr[i8] > -65) {
                        }
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    public final int b(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char charAt;
        int length = str.length();
        int i6 = i3 + i2;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i2) < i6 && (charAt = str.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i2 + length;
        }
        int i8 = i2 + i7;
        while (i7 < length) {
            char charAt2 = str.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                bArr[i8] = (byte) charAt2;
                i8++;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 += 2;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                int i10 = i8 + 2;
                bArr[i8 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i8 += 3;
                bArr[i10] = (byte) ((charAt2 & '?') | 128);
            } else if (i8 <= i6 - 4) {
                int i11 = i7 + 1;
                if (i11 != str.length()) {
                    char charAt3 = str.charAt(i11);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                        bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i12 = i8 + 3;
                        bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 += 4;
                        bArr[i12] = (byte) ((codePoint & 63) | 128);
                        i7 = i11;
                    } else {
                        i7 = i11;
                    }
                }
                throw new zzog(i7 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i4 = i7 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i4)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
            } else {
                throw new zzog(i7, length);
            }
            i7++;
        }
        return i8;
    }

    public final String c(byte[] bArr, int i2, int i3) {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (r11 < i4) {
                byte b2 = bArr[r11];
                if (b2 < 0) {
                    break;
                }
                i2 = r11 + 1;
                zzob.d(b2, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (r11 < i4) {
                int i7 = r11 + 1;
                byte b3 = bArr[r11];
                if (b3 >= 0) {
                    int i8 = i6 + 1;
                    zzob.d(b3, cArr, i6);
                    while (i7 < i4) {
                        byte b4 = bArr[i7];
                        if (b4 < 0) {
                            break;
                        }
                        i7++;
                        zzob.d(b4, cArr, i8);
                        i8++;
                    }
                    i6 = i8;
                    r11 = i7;
                } else if (b3 < -32) {
                    if (i7 < i4) {
                        r11 += 2;
                        zzob.c(b3, bArr[i7], cArr, i6);
                        i6++;
                    } else {
                        throw zzlk.d();
                    }
                } else if (b3 < -16) {
                    if (i7 < i4 - 1) {
                        int i9 = r11 + 2;
                        r11 += 3;
                        zzob.b(b3, bArr[i7], bArr[i9], cArr, i6);
                        i6++;
                    } else {
                        throw zzlk.d();
                    }
                } else if (i7 < i4 - 2) {
                    byte b5 = bArr[i7];
                    int i10 = r11 + 3;
                    byte b6 = bArr[r11 + 2];
                    r11 += 4;
                    zzob.a(b3, b5, b6, bArr[i10], cArr, i6);
                    i6 += 2;
                } else {
                    throw zzlk.d();
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }
}
