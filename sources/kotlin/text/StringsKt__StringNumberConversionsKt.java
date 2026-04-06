package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static final Void p(String str) {
        Intrinsics.i(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static Integer q(String str) {
        Intrinsics.i(str, "<this>");
        return r(str, 10);
    }

    public static final Integer r(String str, int i2) {
        int i3;
        boolean z2;
        int i4;
        Intrinsics.i(str, "<this>");
        CharsKt.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        int i6 = -2147483647;
        if (Intrinsics.k(charAt, 48) < 0) {
            i3 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z2 = false;
            } else if (charAt != '-') {
                return null;
            } else {
                i6 = Integer.MIN_VALUE;
                z2 = true;
            }
        } else {
            z2 = false;
            i3 = 0;
        }
        int i7 = -59652323;
        while (i3 < length) {
            int b2 = CharsKt__CharJVMKt.b(str.charAt(i3), i2);
            if (b2 < 0) {
                return null;
            }
            if ((i5 < i7 && (i7 != -59652323 || i5 < (i7 = i6 / i2))) || (i4 = i5 * i2) < i6 + b2) {
                return null;
            }
            i5 = i4 - b2;
            i3++;
        }
        return z2 ? Integer.valueOf(i5) : Integer.valueOf(-i5);
    }

    public static Long s(String str) {
        Intrinsics.i(str, "<this>");
        return t(str, 10);
    }

    public static final Long t(String str, int i2) {
        boolean z2;
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
        long j2 = -9223372036854775807L;
        if (Intrinsics.k(charAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z2 = false;
                i4 = 1;
            } else if (charAt != '-') {
                return null;
            } else {
                j2 = Long.MIN_VALUE;
                i4 = 1;
            }
        } else {
            z2 = false;
        }
        long j3 = -256204778801521550L;
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i4 < length) {
            int b2 = CharsKt__CharJVMKt.b(str2.charAt(i4), i3);
            if (b2 < 0) {
                return null;
            }
            if (j4 < j5) {
                if (j5 == j3) {
                    j5 = j2 / ((long) i3);
                    if (j4 < j5) {
                    }
                }
                return null;
            }
            long j6 = j4 * ((long) i3);
            long j7 = (long) b2;
            if (j6 < j2 + j7) {
                return null;
            }
            j4 = j6 - j7;
            i4++;
            j3 = -256204778801521550L;
        }
        return z2 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }
}
