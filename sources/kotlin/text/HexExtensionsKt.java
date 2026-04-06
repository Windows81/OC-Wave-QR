package kotlin.text;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;

@Metadata
public final class HexExtensionsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f41133a;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f41134b;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f41135c;

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f41136d;

    static {
        int[] iArr = new int[256];
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            iArr[i3] = "0123456789abcdef".charAt(i3 & 15) | ("0123456789abcdef".charAt(i3 >> 4) << 8);
        }
        f41133a = iArr;
        int[] iArr2 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr2[i4] = "0123456789ABCDEF".charAt(i4 & 15) | ("0123456789ABCDEF".charAt(i4 >> 4) << 8);
        }
        f41134b = iArr2;
        int[] iArr3 = new int[256];
        for (int i5 = 0; i5 < 256; i5++) {
            iArr3[i5] = -1;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i6)] = i7;
            i6++;
            i7++;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i8)] = i9;
            i8++;
            i9++;
        }
        f41135c = iArr3;
        long[] jArr = new long[256];
        for (int i10 = 0; i10 < 256; i10++) {
            jArr[i10] = -1;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i11)] = (long) i12;
            i11++;
            i12++;
        }
        int i13 = 0;
        while (i2 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i2)] = (long) i13;
            i2++;
            i13++;
        }
        f41136d = jArr;
    }

    public static final void a(String str, int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if (i5 < 1) {
            j(str, i2, i3, "at least", 1);
        } else if (i5 > i4) {
            c(str, i2, (i5 + i2) - i4);
        }
    }

    public static final void b(String str, int i2, int i3, String str2, String str3, boolean z2, int i4) {
        if ((i3 - i2) - str2.length() <= str3.length()) {
            k(str, i2, i3, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i5 = 0; i5 < length; i5++) {
                if (!CharsKt__CharKt.h(str2.charAt(i5), str.charAt(i2 + i5), z2)) {
                    l(str, i2, i3, str2, "prefix");
                }
            }
            i2 += str2.length();
        }
        int length2 = i3 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i6 = 0; i6 < length3; i6++) {
                if (!CharsKt__CharKt.h(str3.charAt(i6), str.charAt(length2 + i6), z2)) {
                    l(str, length2, i3, str3, "suffix");
                }
            }
        }
        a(str, i2, length2, i4);
    }

    public static final void c(String str, int i2, int i3) {
        while (i2 < i3) {
            if (str.charAt(i2) == '0') {
                i2++;
            } else {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i2 + ", but was '" + str.charAt(i2) + "'.\nThe result won't fit the type being parsed.");
            }
        }
    }

    public static final int[] d() {
        return f41133a;
    }

    public static final long e(String str, int i2, int i3, HexFormat hexFormat) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(hexFormat, "format");
        return g(str, i2, i3, hexFormat, 16);
    }

    public static /* synthetic */ long f(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.f41137d.a();
        }
        return e(str, i2, i3, hexFormat);
    }

    public static final long g(String str, int i2, int i3, HexFormat hexFormat, int i4) {
        AbstractList.f40564z.a(i2, i3, str.length());
        HexFormat.NumberHexFormat b2 = hexFormat.b();
        if (b2.f()) {
            a(str, i2, i3, i4);
            return h(str, i2, i3);
        }
        String d2 = b2.d();
        String e2 = b2.e();
        b(str, i2, i3, d2, e2, b2.c(), i4);
        return h(str, i2 + d2.length(), i3 - e2.length());
    }

    public static final long h(String str, int i2, int i3) {
        long j2 = 0;
        while (i2 < i3) {
            long j3 = j2 << 4;
            char charAt = str.charAt(i2);
            if ((charAt >>> 8) == 0) {
                long j4 = f41136d[charAt];
                if (j4 >= 0) {
                    j2 = j3 | j4;
                    i2++;
                }
            }
            i(str, i2);
            throw new KotlinNothingValueException();
        }
        return j2;
    }

    public static final Void i(String str, int i2) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i2 + ", but was " + str.charAt(i2));
    }

    public static final void j(String str, int i2, int i3, String str2, int i4) {
        Intrinsics.g(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i2, i3);
        Intrinsics.h(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i4 + " hexadecimal digits at index " + i2 + ", but was \"" + substring + "\" of length " + (i3 - i2));
    }

    public static final void k(String str, int i2, int i3, String str2, String str3) {
        Intrinsics.g(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i2, i3);
        Intrinsics.h(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + substring);
    }

    public static final void l(String str, int i2, int i3, String str2, String str3) {
        int j2 = RangesKt.j(str2.length() + i2, i3);
        Intrinsics.g(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i2, j2);
        Intrinsics.h(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i2 + ", but was " + substring);
    }
}
