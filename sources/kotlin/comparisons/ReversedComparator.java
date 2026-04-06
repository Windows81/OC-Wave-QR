package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata
final class ReversedComparator<T> implements Comparator<T> {

    /* renamed from: z  reason: collision with root package name */
    public final Comparator f40704z;

    public int compare(Object obj, Object obj2) {
        return this.f40704z.compare(obj2, obj);
    }

    public final Comparator reversed() {
        return this.f40704z;
    }
}
