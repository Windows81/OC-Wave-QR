package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.SlidingWindowKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
    public static List h1(CharSequence charSequence, int i2) {
        Intrinsics.i(charSequence, "<this>");
        return o1(charSequence, i2, i2, true);
    }

    public static String i1(String str, int i2) {
        Intrinsics.i(str, "<this>");
        if (i2 >= 0) {
            String substring = str.substring(RangesKt.j(i2, str.length()));
            Intrinsics.h(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static String j1(String str, int i2) {
        Intrinsics.i(str, "<this>");
        if (i2 >= 0) {
            return StringsKt.n1(str, RangesKt.e(str.length() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static Character k1(CharSequence charSequence, int i2) {
        Intrinsics.i(charSequence, "<this>");
        if (i2 < 0 || i2 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i2));
    }

    public static char l1(CharSequence charSequence) {
        Intrinsics.i(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt.d0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char m1(CharSequence charSequence) {
        Intrinsics.i(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    public static String n1(String str, int i2) {
        Intrinsics.i(str, "<this>");
        if (i2 >= 0) {
            String substring = str.substring(0, RangesKt.j(i2, str.length()));
            Intrinsics.h(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final List o1(CharSequence charSequence, int i2, int i3, boolean z2) {
        Intrinsics.i(charSequence, "<this>");
        return p1(charSequence, i2, i3, z2, new g());
    }

    public static final List p1(CharSequence charSequence, int i2, int i3, boolean z2, Function1 function1) {
        Intrinsics.i(charSequence, "<this>");
        Intrinsics.i(function1, "transform");
        SlidingWindowKt.a(i2, i3);
        int length = charSequence.length();
        int i4 = 0;
        ArrayList arrayList = new ArrayList((length / i3) + (length % i3 == 0 ? 0 : 1));
        while (i4 >= 0 && i4 < length) {
            int i5 = i4 + i2;
            if (i5 < 0 || i5 > length) {
                if (!z2) {
                    break;
                }
                i5 = length;
            }
            arrayList.add(function1.invoke(charSequence.subSequence(i4, i5)));
            i4 += i3;
        }
        return arrayList;
    }

    public static final String q1(CharSequence charSequence) {
        Intrinsics.i(charSequence, "it");
        return charSequence.toString();
    }
}
