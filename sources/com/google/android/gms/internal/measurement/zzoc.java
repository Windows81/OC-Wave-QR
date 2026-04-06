package com.google.android.gms.internal.measurement;

final class zzoc {

    /* renamed from: a  reason: collision with root package name */
    public static final zzoe f25729a = new zzod();

    static {
        if (zzny.w()) {
            boolean z2 = zzny.z();
        }
    }

    public static int a(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = str.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = str.length();
                while (i3 < length2) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) >= 65536) {
                                i3++;
                            } else {
                                throw new zzog(i3, length2);
                            }
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i4) + 4294967296L));
    }

    public static int b(String str, byte[] bArr, int i2, int i3) {
        return f25729a.b(str, bArr, i2, i3);
    }

    public static /* synthetic */ int c(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 != 0) {
            if (i4 == 1) {
                byte b3 = bArr[i2];
                if (b2 > -12 || b3 > -65) {
                    return -1;
                }
                return (b3 << 8) ^ b2;
            } else if (i4 == 2) {
                byte b4 = bArr[i2];
                byte b5 = bArr[i2 + 1];
                if (b2 > -12 || b4 > -65 || b5 > -65) {
                    return -1;
                }
                return (b5 << 16) ^ ((b4 << 8) ^ b2);
            } else {
                throw new AssertionError();
            }
        } else if (b2 > -12) {
            return -1;
        } else {
            return b2;
        }
    }

    public static String d(byte[] bArr, int i2, int i3) {
        return f25729a.c(bArr, i2, i3);
    }

    public static boolean e(byte[] bArr, int i2, int i3) {
        return f25729a.a(0, bArr, i2, i3) == 0;
    }
}
