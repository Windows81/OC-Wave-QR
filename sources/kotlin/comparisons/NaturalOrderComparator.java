package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class NaturalOrderComparator implements Comparator<Comparable<? super Object>> {

    /* renamed from: z  reason: collision with root package name */
    public static final NaturalOrderComparator f40702z = new NaturalOrderComparator();

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Intrinsics.i(comparable, "a");
        Intrinsics.i(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator reversed() {
        return ReverseOrderComparator.f40703z;
    }
}
