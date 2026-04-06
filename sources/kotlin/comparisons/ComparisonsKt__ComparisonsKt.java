package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class ComparisonsKt__ComparisonsKt {
    public static Comparator b(Function1... function1Arr) {
        Intrinsics.i(function1Arr, "selectors");
        if (function1Arr.length > 0) {
            return new a(function1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int c(Function1[] function1Arr, Object obj, Object obj2) {
        return f(obj, obj2, function1Arr);
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int e(Object obj, Object obj2, Function1... function1Arr) {
        Intrinsics.i(function1Arr, "selectors");
        if (function1Arr.length > 0) {
            return f(obj, obj2, function1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int f(Object obj, Object obj2, Function1[] function1Arr) {
        for (Function1 function1 : function1Arr) {
            int d2 = ComparisonsKt.d((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
            if (d2 != 0) {
                return d2;
            }
        }
        return 0;
    }

    public static Comparator g() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.f40702z;
        Intrinsics.g(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return naturalOrderComparator;
    }
}
