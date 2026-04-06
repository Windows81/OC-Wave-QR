package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class StringsKt__IndentKt extends StringsKt__AppendableKt {
    public static final Function1 d(String str) {
        return str.length() == 0 ? new c() : new d(str);
    }

    public static final String e(String str) {
        Intrinsics.i(str, "line");
        return str;
    }

    public static final String f(String str, String str2) {
        Intrinsics.i(str2, "line");
        return str + str2;
    }

    public static final int g(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (!CharsKt.c(str.charAt(i2))) {
                break;
            } else {
                i2++;
            }
        }
        return i2 == -1 ? str.length() : i2;
    }

    public static final String h(String str, String str2) {
        String str3;
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "newIndent");
        List t0 = StringsKt__StringsKt.t0(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : t0) {
            if (!StringsKt.l0((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        for (String g2 : arrayList) {
            arrayList2.add(Integer.valueOf(g(g2)));
        }
        Integer num = (Integer) CollectionsKt.t0(arrayList2);
        int i2 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * t0.size());
        Function1 d2 = d(str2);
        int o2 = CollectionsKt.o(t0);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : t0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.w();
            }
            String str4 = (String) next2;
            if ((i2 == 0 || i2 == o2) && StringsKt.l0(str4)) {
                str4 = null;
            } else {
                String i1 = StringsKt.i1(str4, intValue);
                if (!(i1 == null || (str3 = (String) d2.invoke(i1)) == null)) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i2 = i3;
        }
        return ((StringBuilder) CollectionsKt.l0(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 124, (Object) null)).toString();
    }

    public static final String i(String str, String str2, String str3) {
        int i2;
        String str4;
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "newIndent");
        Intrinsics.i(str3, "marginPrefix");
        if (!StringsKt.l0(str3)) {
            List t0 = StringsKt__StringsKt.t0(str);
            int length = str.length() + (str2.length() * t0.size());
            Function1 d2 = d(str2);
            int o2 = CollectionsKt.o(t0);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Object next : t0) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.w();
                }
                String str5 = (String) next;
                String str6 = null;
                if ((i3 == 0 || i3 == o2) && StringsKt.l0(str5)) {
                    str5 = null;
                } else {
                    int length2 = str5.length();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            i2 = -1;
                            break;
                        } else if (!CharsKt.c(str5.charAt(i5))) {
                            i2 = i5;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i2 != -1) {
                        int i6 = i2;
                        if (StringsKt.P(str5, str3, i2, false, 4, (Object) null)) {
                            Intrinsics.g(str5, "null cannot be cast to non-null type java.lang.String");
                            str6 = str5.substring(i6 + str3.length());
                            Intrinsics.h(str6, "substring(...)");
                        }
                    }
                    if (!(str6 == null || (str4 = (String) d2.invoke(str6)) == null)) {
                        str5 = str4;
                    }
                }
                if (str5 != null) {
                    arrayList.add(str5);
                }
                i3 = i4;
            }
            return ((StringBuilder) CollectionsKt.l0(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 124, (Object) null)).toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    public static String j(String str) {
        Intrinsics.i(str, "<this>");
        return h(str, "");
    }

    public static final String k(String str, String str2) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "marginPrefix");
        return i(str, "", str2);
    }

    public static /* synthetic */ String l(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return k(str, str2);
    }
}
