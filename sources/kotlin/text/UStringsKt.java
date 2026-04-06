package kotlin.text;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UStringsKt {
    public static final byte a(String str) {
        Intrinsics.i(str, "<this>");
        UByte b2 = b(str);
        if (b2 != null) {
            return b2.l();
        }
        StringsKt__StringNumberConversionsKt.p(str);
        throw new KotlinNothingValueException();
    }

    public static final UByte b(String str) {
        Intrinsics.i(str, "<this>");
        return c(str, 10);
    }

    public static final UByte c(String str, int i2) {
        Intrinsics.i(str, "<this>");
        UInt f2 = f(str, i2);
        if (f2 == null) {
            return null;
        }
        int l2 = f2.l();
        if (Integer.compareUnsigned(l2, UInt.f(255)) > 0) {
            return null;
        }
        return UByte.d(UByte.f((byte) l2));
    }

    public static final int d(String str) {
        Intrinsics.i(str, "<this>");
        UInt e2 = e(str);
        if (e2 != null) {
            return e2.l();
        }
        StringsKt__StringNumberConversionsKt.p(str);
        throw new KotlinNothingValueException();
    }

    public static final UInt e(String str) {
        Intrinsics.i(str, "<this>");
        return f(str, 10);
    }

    public static final UInt f(String str, int i2) {
        int i3;
        Intrinsics.i(str, "<this>");
        CharsKt.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.k(charAt, 48) < 0) {
            i3 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i3 = 0;
        }
        int f2 = UInt.f(i2);
        int i5 = 119304647;
        while (i3 < length) {
            int b2 = CharsKt__CharJVMKt.b(str.charAt(i3), i2);
            if (b2 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i4, i5) > 0) {
                if (i5 == 119304647) {
                    i5 = Integer.divideUnsigned(-1, f2);
                    if (Integer.compareUnsigned(i4, i5) > 0) {
                    }
                }
                return null;
            }
            int f3 = UInt.f(i4 * f2);
            int f4 = UInt.f(UInt.f(b2) + f3);
            if (Integer.compareUnsigned(f4, f3) < 0) {
                return null;
            }
            i3++;
            i4 = f4;
        }
        return UInt.d(i4);
    }

    public static final long g(String str) {
        Intrinsics.i(str, "<this>");
        ULong h2 = h(str);
        if (h2 != null) {
            return h2.m();
        }
        StringsKt__StringNumberConversionsKt.p(str);
        throw new KotlinNothingValueException();
    }

    public static final ULong h(String str) {
        Intrinsics.i(str, "<this>");
        return i(str, 10);
    }

    public static final ULong i(String str, int i2) {
        String str2 = str;
        int i3 = i2;
        Intrinsics.i(str2, "<this>");
        CharsKt.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str2.charAt(0);
        if (Intrinsics.k(charAt, 48) < 0) {
            i4 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long f2 = ULong.f((long) i3);
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i4 < length) {
            int b2 = CharsKt__CharJVMKt.b(str2.charAt(i4), i3);
            if (b2 < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, j3) > 0) {
                if (j3 == 512409557603043100L) {
                    j3 = Long.divideUnsigned(-1, f2);
                    if (Long.compareUnsigned(j2, j3) > 0) {
                    }
                }
                return null;
            }
            long f3 = ULong.f(j2 * f2);
            long f4 = ULong.f(ULong.f(((long) UInt.f(b2)) & 4294967295L) + f3);
            if (Long.compareUnsigned(f4, f3) < 0) {
                return null;
            }
            i4++;
            j2 = f4;
        }
        return ULong.d(j2);
    }

    public static final short j(String str) {
        Intrinsics.i(str, "<this>");
        UShort k2 = k(str);
        if (k2 != null) {
            return k2.l();
        }
        StringsKt__StringNumberConversionsKt.p(str);
        throw new KotlinNothingValueException();
    }

    public static final UShort k(String str) {
        Intrinsics.i(str, "<this>");
        return l(str, 10);
    }

    public static final UShort l(String str, int i2) {
        Intrinsics.i(str, "<this>");
        UInt f2 = f(str, i2);
        if (f2 == null) {
            return null;
        }
        int l2 = f2.l();
        if (Integer.compareUnsigned(l2, UInt.f(65535)) > 0) {
            return null;
        }
        return UShort.d(UShort.f((short) l2));
    }
}
