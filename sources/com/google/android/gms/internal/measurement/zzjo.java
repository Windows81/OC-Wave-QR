package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;

final class zzjo {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f25562a = 100;

    public static double a(byte[] bArr, int i2) {
        return Double.longBitsToDouble(u(bArr, i2));
    }

    public static int b(int i2, byte[] bArr, int i3, int i4, zzjn zzjn) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                return t(bArr, i3, zzjn);
            }
            if (i5 == 1) {
                return i3 + 8;
            }
            if (i5 == 2) {
                return s(bArr, i3, zzjn) + zzjn.f25557a;
            }
            if (i5 == 3) {
                int i6 = (i2 & -8) | 4;
                int i7 = 0;
                while (i3 < i4) {
                    i3 = s(bArr, i3, zzjn);
                    i7 = zzjn.f25557a;
                    if (i7 == i6) {
                        break;
                    }
                    i3 = b(i7, bArr, i3, i4, zzjn);
                }
                if (i3 <= i4 && i7 == i6) {
                    return i3;
                }
                throw zzlk.g();
            } else if (i5 == 5) {
                return i3 + 4;
            } else {
                throw zzlk.c();
            }
        } else {
            throw zzlk.c();
        }
    }

    public static int c(int i2, byte[] bArr, int i3, int i4, zzll zzll, zzjn zzjn) {
        zzlf zzlf = (zzlf) zzll;
        int s2 = s(bArr, i3, zzjn);
        zzlf.i(zzjn.f25557a);
        while (s2 < i4) {
            int s3 = s(bArr, s2, zzjn);
            if (i2 != zzjn.f25557a) {
                break;
            }
            s2 = s(bArr, s3, zzjn);
            zzlf.i(zzjn.f25557a);
        }
        return s2;
    }

    public static int d(int i2, byte[] bArr, int i3, int i4, zznw zznw, zzjn zzjn) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int t2 = t(bArr, i3, zzjn);
                zznw.e(i2, Long.valueOf(zzjn.f25558b));
                return t2;
            } else if (i5 == 1) {
                zznw.e(i2, Long.valueOf(u(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int s2 = s(bArr, i3, zzjn);
                int i6 = zzjn.f25557a;
                if (i6 < 0) {
                    throw zzlk.f();
                } else if (i6 <= bArr.length - s2) {
                    if (i6 == 0) {
                        zznw.e(i2, zzjs.f25568A);
                    } else {
                        zznw.e(i2, zzjs.p(bArr, s2, i6));
                    }
                    return s2 + i6;
                } else {
                    throw zzlk.i();
                }
            } else if (i5 == 3) {
                zznw l2 = zznw.l();
                int i7 = (i2 & -8) | 4;
                int i8 = zzjn.f25561e + 1;
                zzjn.f25561e = i8;
                n(i8);
                int i9 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int s3 = s(bArr, i3, zzjn);
                    int i10 = zzjn.f25557a;
                    i9 = i10;
                    if (i10 == i7) {
                        i3 = s3;
                        break;
                    }
                    int d2 = d(i9, bArr, s3, i4, l2, zzjn);
                    i9 = i10;
                    i3 = d2;
                }
                zzjn.f25561e--;
                if (i3 > i4 || i9 != i7) {
                    throw zzlk.g();
                }
                zznw.e(i2, l2);
                return i3;
            } else if (i5 == 5) {
                zznw.e(i2, Integer.valueOf(r(bArr, i3)));
                return i3 + 4;
            } else {
                throw zzlk.c();
            }
        } else {
            throw zzlk.c();
        }
    }

    public static int e(int i2, byte[] bArr, int i3, int i4, Object obj, zzml zzml, zznx zznx, zzjn zzjn) {
        if (zzjn.f25560d.b(zzml, i2 >>> 3) == null) {
            return d(i2, bArr, i3, i4, zzmp.L(obj), zzjn);
        }
        zzlc.zzd zzd = (zzlc.zzd) obj;
        zzd.J();
        zzkv<zzlc.zzc> zzkv = zzd.zzc;
        throw new NoSuchMethodError();
    }

    public static int f(int i2, byte[] bArr, int i3, zzjn zzjn) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzjn.f25557a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            zzjn.f25557a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzjn.f25557a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzjn.f25557a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzjn.f25557a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int g(zznd zznd, int i2, byte[] bArr, int i3, int i4, zzll zzll, zzjn zzjn) {
        int i5 = (i2 & -8) | 4;
        int h2 = h(zznd, bArr, i3, i4, i5, zzjn);
        zzll.add(zzjn.f25559c);
        while (h2 < i4) {
            int s2 = s(bArr, h2, zzjn);
            if (i2 != zzjn.f25557a) {
                break;
            }
            h2 = h(zznd, bArr, s2, i4, i5, zzjn);
            zzll.add(zzjn.f25559c);
        }
        return h2;
    }

    public static int h(zznd zznd, byte[] bArr, int i2, int i3, int i4, zzjn zzjn) {
        Object a2 = zznd.a();
        int j2 = j(a2, zznd, bArr, i2, i3, i4, zzjn);
        zznd.d(a2);
        zzjn.f25559c = a2;
        return j2;
    }

    public static int i(zznd zznd, byte[] bArr, int i2, int i3, zzjn zzjn) {
        Object a2 = zznd.a();
        int k2 = k(a2, zznd, bArr, i2, i3, zzjn);
        zznd.d(a2);
        zzjn.f25559c = a2;
        return k2;
    }

    public static int j(Object obj, zznd zznd, byte[] bArr, int i2, int i3, int i4, zzjn zzjn) {
        int i5 = zzjn.f25561e + 1;
        zzjn.f25561e = i5;
        n(i5);
        int n2 = ((zzmp) zznd).n(obj, bArr, i2, i3, i4, zzjn);
        zzjn.f25561e--;
        zzjn.f25559c = obj;
        return n2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int k(java.lang.Object r6, com.google.android.gms.internal.measurement.zznd r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.zzjn r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = f(r9, r8, r0, r11)
            int r9 = r11.f25557a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x002d
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x002d
            int r10 = r11.f25561e
            int r10 = r10 + 1
            r11.f25561e = r10
            n(r10)
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.h(r1, r2, r3, r4, r5)
            int r7 = r11.f25561e
            int r7 = r7 + -1
            r11.f25561e = r7
            r11.f25559c = r6
            return r9
        L_0x002d:
            com.google.android.gms.internal.measurement.zzlk r6 = com.google.android.gms.internal.measurement.zzlk.i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjo.k(java.lang.Object, com.google.android.gms.internal.measurement.zznd, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    public static int l(byte[] bArr, int i2, zzjn zzjn) {
        int s2 = s(bArr, i2, zzjn);
        int i3 = zzjn.f25557a;
        if (i3 < 0) {
            throw zzlk.f();
        } else if (i3 > bArr.length - s2) {
            throw zzlk.i();
        } else if (i3 == 0) {
            zzjn.f25559c = zzjs.f25568A;
            return s2;
        } else {
            zzjn.f25559c = zzjs.p(bArr, s2, i3);
            return s2 + i3;
        }
    }

    public static int m(byte[] bArr, int i2, zzll zzll, zzjn zzjn) {
        zzlf zzlf = (zzlf) zzll;
        int s2 = s(bArr, i2, zzjn);
        int i3 = zzjn.f25557a + s2;
        while (s2 < i3) {
            s2 = s(bArr, s2, zzjn);
            zzlf.i(zzjn.f25557a);
        }
        if (s2 == i3) {
            return s2;
        }
        throw zzlk.i();
    }

    public static void n(int i2) {
        if (i2 >= f25562a) {
            throw zzlk.h();
        }
    }

    public static float o(byte[] bArr, int i2) {
        return Float.intBitsToFloat(r(bArr, i2));
    }

    public static int p(zznd zznd, int i2, byte[] bArr, int i3, int i4, zzll zzll, zzjn zzjn) {
        int i5 = i(zznd, bArr, i3, i4, zzjn);
        zzll.add(zzjn.f25559c);
        while (i5 < i4) {
            int s2 = s(bArr, i5, zzjn);
            if (i2 != zzjn.f25557a) {
                break;
            }
            i5 = i(zznd, bArr, s2, i4, zzjn);
            zzll.add(zzjn.f25559c);
        }
        return i5;
    }

    public static int q(byte[] bArr, int i2, zzjn zzjn) {
        int s2 = s(bArr, i2, zzjn);
        int i3 = zzjn.f25557a;
        if (i3 < 0) {
            throw zzlk.f();
        } else if (i3 == 0) {
            zzjn.f25559c = "";
            return s2;
        } else {
            zzjn.f25559c = zzoc.d(bArr, s2, i3);
            return s2 + i3;
        }
    }

    public static int r(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int s(byte[] bArr, int i2, zzjn zzjn) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return f(b2, bArr, i3, zzjn);
        }
        zzjn.f25557a = b2;
        return i3;
    }

    public static int t(byte[] bArr, int i2, zzjn zzjn) {
        int i3 = i2 + 1;
        long j2 = (long) bArr[i2];
        if (j2 >= 0) {
            zzjn.f25558b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & Byte.MAX_VALUE)) << i5;
            int i7 = i6;
            b2 = b3;
            i4 = i7;
        }
        zzjn.f25558b = j3;
        return i4;
    }

    public static long u(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }
}
