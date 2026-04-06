package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;

@Metadata
public interface ClosedFloatingPointRange<T extends Comparable<? super T>> extends ClosedRange<T> {

    @Metadata
    public static final class DefaultImpls {
    }

    boolean g(Comparable comparable, Comparable comparable2);

    boolean i(Comparable comparable);

    boolean isEmpty();
}
