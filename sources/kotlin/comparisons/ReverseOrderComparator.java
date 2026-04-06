package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ReverseOrderComparator implements Comparator<Comparable<? super Object>> {

    /* renamed from: z  reason: collision with root package name */
    public static final ReverseOrderComparator f40703z = new ReverseOrderComparator();

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Intrinsics.i(comparable, "a");
        Intrinsics.i(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator reversed() {
        return NaturalOrderComparator.f40702z;
    }
}
