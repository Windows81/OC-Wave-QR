package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
    public static ArrayList g(Object... objArr) {
        Intrinsics.i(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    public static final Collection h(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return new ArrayAsCollection(objArr, false);
    }

    public static int i(List list, int i2, int i3, Function1 function1) {
        Intrinsics.i(list, "<this>");
        Intrinsics.i(function1, "comparison");
        u(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int intValue = ((Number) function1.invoke(list.get(i5))).intValue();
            if (intValue < 0) {
                i2 = i5 + 1;
            } else if (intValue <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int j(List list, Comparable comparable, int i2, int i3) {
        Intrinsics.i(list, "<this>");
        u(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int d2 = ComparisonsKt.d((Comparable) list.get(i5), comparable);
            if (d2 < 0) {
                i2 = i5 + 1;
            } else if (d2 <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static /* synthetic */ int k(List list, int i2, int i3, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = list.size();
        }
        return CollectionsKt.i(list, i2, i3, function1);
    }

    public static /* synthetic */ int l(List list, Comparable comparable, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = list.size();
        }
        return j(list, comparable, i2, i3);
    }

    public static List m() {
        return EmptyList.f40615z;
    }

    public static IntRange n(Collection collection) {
        Intrinsics.i(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    public static int o(List list) {
        Intrinsics.i(list, "<this>");
        return list.size() - 1;
    }

    public static List p(Object... objArr) {
        Intrinsics.i(objArr, "elements");
        return objArr.length > 0 ? ArraysKt.d(objArr) : CollectionsKt.m();
    }

    public static List q(Object obj) {
        return obj != null ? CollectionsKt.e(obj) : CollectionsKt.m();
    }

    public static List r(Object... objArr) {
        Intrinsics.i(objArr, "elements");
        return ArraysKt.b0(objArr);
    }

    public static List s(Object... objArr) {
        Intrinsics.i(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    public static final List t(List list) {
        Intrinsics.i(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : CollectionsKt.e(list.get(0)) : CollectionsKt.m();
    }

    public static final void u(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException("fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        } else if (i3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i3 + ") is less than zero.");
        } else if (i4 > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i2 + ").");
        }
    }

    public static void v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
