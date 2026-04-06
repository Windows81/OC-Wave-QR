package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata
class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    public static final Pair A0(char[] cArr, boolean z2, CharSequence charSequence, int i2) {
        Intrinsics.i(charSequence, "$this$DelimitedRangesSequence");
        int k0 = k0(charSequence, cArr, i2, z2);
        if (k0 < 0) {
            return null;
        }
        return TuplesKt.a(Integer.valueOf(k0), 1);
    }

    public static final Pair B0(List list, boolean z2, CharSequence charSequence, int i2) {
        Intrinsics.i(charSequence, "$this$DelimitedRangesSequence");
        Pair c0 = c0(charSequence, list, i2, z2, false);
        if (c0 != null) {
            return TuplesKt.a(c0.e(), Integer.valueOf(((String) c0.f()).length()));
        }
        return null;
    }

    public static final boolean C0(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!CharsKt__CharKt.h(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String D0(String str, CharSequence charSequence) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(charSequence, "prefix");
        if (!R0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public static String E0(String str, CharSequence charSequence) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(charSequence, "suffix");
        if (!StringsKt.b0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public static String F0(String str, CharSequence charSequence) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(charSequence, "delimiter");
        return G0(str, charSequence, charSequence);
    }

    public static final String G0(String str, CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(charSequence, "prefix");
        Intrinsics.i(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !R0(str, charSequence, false, 2, (Object) null) || !StringsKt.b0(str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public static CharSequence H0(CharSequence charSequence, int i2, int i3, CharSequence charSequence2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(charSequence2, "replacement");
        if (i3 >= i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i2);
            Intrinsics.h(sb, "append(...)");
            sb.append(charSequence2);
            sb.append(charSequence, i3, charSequence.length());
            Intrinsics.h(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
    }

    public static final void I0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
        }
    }

    public static final List J0(CharSequence charSequence, char[] cArr, boolean z2, int i2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(cArr, "delimiters");
        if (cArr.length == 1) {
            return L0(charSequence, String.valueOf(cArr[0]), z2, i2);
        }
        Iterable<IntRange> n2 = SequencesKt.n(y0(charSequence, cArr, 0, z2, i2, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.x(n2, 10));
        for (IntRange S0 : n2) {
            arrayList.add(S0(charSequence, S0));
        }
        return arrayList;
    }

    public static final List K0(CharSequence charSequence, String[] strArr, boolean z2, int i2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return L0(charSequence, str, z2, i2);
            }
        }
        Iterable<IntRange> n2 = SequencesKt.n(z0(charSequence, strArr, 0, z2, i2, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.x(n2, 10));
        for (IntRange S0 : n2) {
            arrayList.add(S0(charSequence, S0));
        }
        return arrayList;
    }

    public static final List L0(CharSequence charSequence, String str, boolean z2, int i2) {
        I0(i2);
        int i3 = 0;
        int f0 = f0(charSequence, str, 0, z2);
        if (f0 == -1 || i2 == 1) {
            return CollectionsKt.e(charSequence.toString());
        }
        boolean z3 = i2 > 0;
        int i4 = 10;
        if (z3) {
            i4 = RangesKt.j(i2, 10);
        }
        ArrayList arrayList = new ArrayList(i4);
        do {
            arrayList.add(charSequence.subSequence(i3, f0).toString());
            i3 = str.length() + f0;
            if ((z3 && arrayList.size() == i2 - 1) || (f0 = f0(charSequence, str, i3, z2)) == -1) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, f0).toString());
            i3 = str.length() + f0;
            break;
        } while ((f0 = f0(charSequence, str, i3, z2)) == -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List M0(CharSequence charSequence, char[] cArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return J0(charSequence, cArr, z2, i2);
    }

    public static /* synthetic */ List N0(CharSequence charSequence, String[] strArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return K0(charSequence, strArr, z2, i2);
    }

    public static final boolean O0(CharSequence charSequence, char c2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        return charSequence.length() > 0 && CharsKt__CharKt.h(charSequence.charAt(0), c2, z2);
    }

    public static final boolean P0(CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(charSequence2, "prefix");
        if (!z2 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt.Q((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return C0(charSequence, 0, charSequence2, 0, charSequence2.length(), z2);
    }

    public static /* synthetic */ boolean Q0(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return O0(charSequence, c2, z2);
    }

    public static /* synthetic */ boolean R0(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return P0(charSequence, charSequence2, z2);
    }

    public static final String S0(CharSequence charSequence, IntRange intRange) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(intRange, "range");
        return charSequence.subSequence(intRange.e().intValue(), intRange.m().intValue() + 1).toString();
    }

    public static final boolean T(CharSequence charSequence, char c2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        return StringsKt.i0(charSequence, c2, 0, z2, 2, (Object) null) >= 0;
    }

    public static String T0(String str, IntRange intRange) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(intRange, "range");
        String substring = str.substring(intRange.e().intValue(), intRange.m().intValue() + 1);
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public static boolean U(CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (StringsKt.j0(charSequence, (String) charSequence2, 0, z2, 2, (Object) null) < 0) {
                return false;
            }
        } else {
            if (h0(charSequence, charSequence2, 0, charSequence.length(), z2, false, 16, (Object) null) < 0) {
                return false;
            }
        }
        return true;
    }

    public static String U0(String str, char c2, String str2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "missingDelimiterValue");
        int i0 = StringsKt.i0(str, c2, 0, false, 6, (Object) null);
        if (i0 == -1) {
            return str2;
        }
        String substring = str.substring(i0 + 1, str.length());
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean V(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return T(charSequence, c2, z2);
    }

    public static final String V0(String str, String str2, String str3) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "delimiter");
        Intrinsics.i(str3, "missingDelimiterValue");
        int j0 = StringsKt.j0(str, str2, 0, false, 6, (Object) null);
        if (j0 == -1) {
            return str3;
        }
        String substring = str.substring(j0 + str2.length(), str.length());
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean W(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.U(charSequence, charSequence2, z2);
    }

    public static /* synthetic */ String W0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return StringsKt.U0(str, c2, str2);
    }

    public static final boolean X(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.d(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String X0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return V0(str, str2, str3);
    }

    public static final boolean Y(CharSequence charSequence, char c2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        return charSequence.length() > 0 && CharsKt__CharKt.h(charSequence.charAt(StringsKt.d0(charSequence)), c2, z2);
    }

    public static String Y0(String str, char c2, String str2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "missingDelimiterValue");
        int p0 = StringsKt.p0(str, c2, 0, false, 6, (Object) null);
        if (p0 == -1) {
            return str2;
        }
        String substring = str.substring(p0 + 1, str.length());
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public static final boolean Z(CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(charSequence2, "suffix");
        if (!z2 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt.A((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return C0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z2);
    }

    public static /* synthetic */ String Z0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return StringsKt.Y0(str, c2, str2);
    }

    public static /* synthetic */ boolean a0(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return Y(charSequence, c2, z2);
    }

    public static final String a1(String str, char c2, String str2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "missingDelimiterValue");
        int i0 = StringsKt.i0(str, c2, 0, false, 6, (Object) null);
        if (i0 == -1) {
            return str2;
        }
        String substring = str.substring(0, i0);
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean b0(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return Z(charSequence, charSequence2, z2);
    }

    public static /* synthetic */ String b1(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return a1(str, c2, str2);
    }

    public static final Pair c0(CharSequence charSequence, Collection collection, int i2, boolean z2, boolean z3) {
        Object obj;
        Object obj2;
        if (z2 || collection.size() != 1) {
            IntProgression intRange = !z3 ? new IntRange(RangesKt.e(i2, 0), charSequence.length()) : RangesKt.s(RangesKt.j(i2, StringsKt.d0(charSequence)), 0);
            if (charSequence instanceof String) {
                int n2 = intRange.n();
                int o2 = intRange.o();
                int p2 = intRange.p();
                if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (StringsKt.E(str, 0, (String) charSequence, n2, str.length(), z2)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (n2 == o2) {
                                break;
                            }
                            n2 += p2;
                        } else {
                            return TuplesKt.a(Integer.valueOf(n2), str2);
                        }
                    }
                }
            } else {
                int n3 = intRange.n();
                int o3 = intRange.o();
                int p3 = intRange.p();
                if ((p3 > 0 && n3 <= o3) || (p3 < 0 && o3 <= n3)) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (C0(str3, 0, charSequence, n3, str3.length(), z2)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (n3 == o3) {
                                break;
                            }
                            n3 += p3;
                        } else {
                            return TuplesKt.a(Integer.valueOf(n3), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) CollectionsKt.A0(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i3 = i2;
        int j0 = !z3 ? StringsKt.j0(charSequence2, str6, i3, false, 4, (Object) null) : StringsKt.q0(charSequence2, str6, i3, false, 4, (Object) null);
        if (j0 < 0) {
            return null;
        }
        return TuplesKt.a(Integer.valueOf(j0), str5);
    }

    public static final String c1(String str, char c2, String str2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "missingDelimiterValue");
        int p0 = StringsKt.p0(str, c2, 0, false, 6, (Object) null);
        if (p0 == -1) {
            return str2;
        }
        String substring = str.substring(0, p0);
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public static int d0(CharSequence charSequence) {
        Intrinsics.i(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String d1(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return c1(str, c2, str2);
    }

    public static final int e0(CharSequence charSequence, char c2, int i2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i2);
        }
        return k0(charSequence, new char[]{c2}, i2, z2);
    }

    public static Boolean e1(String str) {
        Intrinsics.i(str, "<this>");
        if (Intrinsics.d(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.d(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int f0(CharSequence charSequence, String str, int i2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        return h0(charSequence, str, i2, charSequence.length(), z2, false, 16, (Object) null);
    }

    public static CharSequence f1(CharSequence charSequence) {
        Intrinsics.i(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean c2 = CharsKt.c(charSequence.charAt(!z2 ? i2 : length));
            if (!z2) {
                if (!c2) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!c2) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final int g0(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3) {
        IntProgression intRange = !z3 ? new IntRange(RangesKt.e(i2, 0), RangesKt.j(i3, charSequence.length())) : RangesKt.s(RangesKt.j(i2, StringsKt.d0(charSequence)), RangesKt.e(i3, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int n2 = intRange.n();
            int o2 = intRange.o();
            int p2 = intRange.p();
            if ((p2 <= 0 || n2 > o2) && (p2 >= 0 || o2 > n2)) {
                return -1;
            }
            while (true) {
                if (C0(charSequence2, 0, charSequence, n2, charSequence2.length(), z2)) {
                    return n2;
                }
                if (n2 == o2) {
                    return -1;
                }
                n2 += p2;
            }
        } else {
            int n3 = intRange.n();
            int o3 = intRange.o();
            int p3 = intRange.p();
            if ((p3 <= 0 || n3 > o3) && (p3 >= 0 || o3 > n3)) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence2;
                if (StringsKt.E(str, 0, (String) charSequence, n3, str.length(), z2)) {
                    return n3;
                }
                if (n3 == o3) {
                    return -1;
                }
                n3 += p3;
            }
        }
    }

    public static /* synthetic */ int h0(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z3 = false;
        }
        return g0(charSequence, charSequence2, i2, i3, z2, z3);
    }

    public static /* synthetic */ int i0(CharSequence charSequence, char c2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return e0(charSequence, c2, i2, z2);
    }

    public static /* synthetic */ int j0(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return f0(charSequence, str, i2, z2);
    }

    public static final int k0(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(cArr, "chars");
        if (z2 || cArr.length != 1 || !(charSequence instanceof String)) {
            int e2 = RangesKt.e(i2, 0);
            int d0 = StringsKt.d0(charSequence);
            if (e2 > d0) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(e2);
                for (char h2 : cArr) {
                    if (CharsKt__CharKt.h(h2, charAt, z2)) {
                        return e2;
                    }
                }
                if (e2 == d0) {
                    return -1;
                }
                e2++;
            }
        } else {
            return ((String) charSequence).indexOf(ArraysKt.S0(cArr), i2);
        }
    }

    public static boolean l0(CharSequence charSequence) {
        Intrinsics.i(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!CharsKt.c(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static final CharIterator m0(CharSequence charSequence) {
        Intrinsics.i(charSequence, "<this>");
        return new StringsKt__StringsKt$iterator$1(charSequence);
    }

    public static final int n0(CharSequence charSequence, char c2, int i2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        return r0(charSequence, new char[]{c2}, i2, z2);
    }

    public static final int o0(CharSequence charSequence, String str, int i2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(str, "string");
        return (z2 || !(charSequence instanceof String)) ? g0(charSequence, str, i2, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i2);
    }

    public static /* synthetic */ int p0(CharSequence charSequence, char c2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StringsKt.d0(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return n0(charSequence, c2, i2, z2);
    }

    public static /* synthetic */ int q0(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StringsKt.d0(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return o0(charSequence, str, i2, z2);
    }

    public static final int r0(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(cArr, "chars");
        if (z2 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int j2 = RangesKt.j(i2, StringsKt.d0(charSequence)); -1 < j2; j2--) {
                char charAt = charSequence.charAt(j2);
                for (char h2 : cArr) {
                    if (CharsKt__CharKt.h(h2, charAt, z2)) {
                        return j2;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(ArraysKt.S0(cArr), i2);
    }

    public static final Sequence s0(CharSequence charSequence) {
        Intrinsics.i(charSequence, "<this>");
        return new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(charSequence);
    }

    public static final List t0(CharSequence charSequence) {
        Intrinsics.i(charSequence, "<this>");
        return SequencesKt.D(s0(charSequence));
    }

    public static final CharSequence u0(CharSequence charSequence, int i2, char c2) {
        Intrinsics.i(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        } else if (i2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            int length = i2 - charSequence.length();
            int i3 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c2);
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
    }

    public static String v0(String str, int i2, char c2) {
        Intrinsics.i(str, "<this>");
        return u0(str, i2, c2).toString();
    }

    public static final Sequence w0(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3) {
        I0(i3);
        return new DelimitedRangesSequence(charSequence, i2, i3, new e(cArr, z2));
    }

    public static final Sequence x0(CharSequence charSequence, String[] strArr, int i2, boolean z2, int i3) {
        I0(i3);
        return new DelimitedRangesSequence(charSequence, i2, i3, new f(ArraysKt.d(strArr), z2));
    }

    public static /* synthetic */ Sequence y0(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return w0(charSequence, cArr, i2, z2, i3);
    }

    public static /* synthetic */ Sequence z0(CharSequence charSequence, String[] strArr, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return x0(charSequence, strArr, i2, z2, i3);
    }
}
