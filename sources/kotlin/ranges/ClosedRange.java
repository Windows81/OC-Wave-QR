package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;

@Metadata
public interface ClosedRange<T extends Comparable<? super T>> {

    @Metadata
    public static final class DefaultImpls {
        public static boolean a(ClosedRange closedRange) {
            return closedRange.e().compareTo(closedRange.m()) > 0;
        }
    }

    Comparable e();

    boolean isEmpty();

    Comparable m();
}
