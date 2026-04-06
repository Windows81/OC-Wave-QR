package com.google.android.gms.internal.measurement;

import io.realm.internal.OsSharedRealm;

final class zzob {
    public static /* synthetic */ void a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (e(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || e(b4) || e(b5)) {
            throw zzlk.d();
        }
        byte b6 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i2] = (char) ((b6 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((b6 & 1023) + OsSharedRealm.FILE_EXCEPTION_KIND_ACCESS_ERROR);
    }

    public static /* synthetic */ void b(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (e(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || e(b4)))) {
            throw zzlk.d();
        }
        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    public static /* synthetic */ void c(byte b2, byte b3, char[] cArr, int i2) {
        if (b2 < -62 || e(b3)) {
            throw zzlk.d();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static /* synthetic */ void d(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    public static boolean e(byte b2) {
        return b2 > -65;
    }
}
