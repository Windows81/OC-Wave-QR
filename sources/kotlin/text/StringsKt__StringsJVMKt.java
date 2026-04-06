package kotlin.text;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

@Metadata
class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    public static /* synthetic */ boolean A(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.z(str, str2, z2);
    }

    public static boolean B(String str, String str2, boolean z2) {
        return str == null ? str2 == null : !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean C(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.B(str, str2, z2);
    }

    public static Comparator D(StringCompanionObject stringCompanionObject) {
        Intrinsics.i(stringCompanionObject, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.h(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean E(String str, int i2, String str2, int i3, int i4, boolean z2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "other");
        return !z2 ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z2, i2, str2, i3, i4);
    }

    public static /* synthetic */ boolean F(String str, int i2, String str2, int i3, int i4, boolean z2, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            z2 = false;
        }
        return StringsKt.E(str, i2, str2, i3, i4, z2);
    }

    public static String G(CharSequence charSequence, int i2) {
        Intrinsics.i(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        } else if (i2 == 0) {
            return "";
        } else {
            int i3 = 1;
            if (i2 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i2);
                if (1 <= i2) {
                    while (true) {
                        sb.append(charSequence);
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                    }
                }
                String sb2 = sb.toString();
                Intrinsics.f(sb2);
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = charAt;
            }
            return new String(cArr);
        }
    }

    public static final String H(String str, char c2, char c3, boolean z2) {
        Intrinsics.i(str, "<this>");
        if (!z2) {
            String replace = str.replace(c2, c3);
            Intrinsics.h(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (CharsKt__CharKt.h(charAt, c2, z2)) {
                charAt = c3;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static final String I(String str, String str2, String str3, boolean z2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "oldValue");
        Intrinsics.i(str3, "newValue");
        int i2 = 0;
        int f0 = StringsKt__StringsKt.f0(str, str2, 0, z2);
        if (f0 < 0) {
            return str;
        }
        int length = str2.length();
        int e2 = RangesKt.e(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i2, f0);
                sb.append(str3);
                i2 = f0 + length;
                if (f0 >= str.length() || (f0 = StringsKt__StringsKt.f0(str, str2, f0 + e2, z2)) <= 0) {
                    sb.append(str, i2, str.length());
                    String sb2 = sb.toString();
                    Intrinsics.h(sb2, "toString(...)");
                }
                sb.append(str, i2, f0);
                sb.append(str3);
                i2 = f0 + length;
                break;
            } while ((f0 = StringsKt__StringsKt.f0(str, str2, f0 + e2, z2)) <= 0);
            sb.append(str, i2, str.length());
            String sb22 = sb.toString();
            Intrinsics.h(sb22, "toString(...)");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String J(String str, char c2, char c3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return H(str, c2, c3, z2);
    }

    public static /* synthetic */ String K(String str, String str2, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return I(str, str2, str3, z2);
    }

    public static final String L(String str, String str2, String str3, boolean z2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "oldValue");
        Intrinsics.i(str3, "newValue");
        int j0 = StringsKt.j0(str, str2, 0, z2, 2, (Object) null);
        return j0 < 0 ? str : StringsKt.H0(str, j0, str2.length() + j0, str3).toString();
    }

    public static /* synthetic */ String M(String str, String str2, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return L(str, str2, str3, z2);
    }

    public static boolean N(String str, String str2, int i2, boolean z2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "prefix");
        if (!z2) {
            return str.startsWith(str2, i2);
        }
        return StringsKt.E(str, i2, str2, 0, str2.length(), z2);
    }

    public static boolean O(String str, String str2, boolean z2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "prefix");
        if (!z2) {
            return str.startsWith(str2);
        }
        return StringsKt.E(str, 0, str2, 0, str2.length(), z2);
    }

    public static /* synthetic */ boolean P(String str, String str2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.N(str, str2, i2, z2);
    }

    public static /* synthetic */ boolean Q(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.O(str, str2, z2);
    }

    public static String u(char[] cArr) {
        Intrinsics.i(cArr, "<this>");
        return new String(cArr);
    }

    public static String v(char[] cArr, int i2, int i3) {
        Intrinsics.i(cArr, "<this>");
        AbstractList.f40564z.a(i2, i3, cArr.length);
        return new String(cArr, i2, i3 - i2);
    }

    public static boolean w(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? StringsKt__StringsKt.X(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    public static String x(byte[] bArr) {
        Intrinsics.i(bArr, "<this>");
        return new String(bArr, Charsets.f41118b);
    }

    public static byte[] y(String str) {
        Intrinsics.i(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.f41118b);
        Intrinsics.h(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean z(String str, String str2, boolean z2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "suffix");
        if (!z2) {
            return str.endsWith(str2);
        }
        return StringsKt.E(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }
}
