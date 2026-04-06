package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;

@Metadata
public interface OpenEndRange<T extends Comparable<? super T>> {

    @Metadata
    public static final class DefaultImpls {
        public static boolean a(OpenEndRange openEndRange) {
            return openEndRange.e().compareTo(openEndRange.h()) >= 0;
        }
    }

    Comparable e();

    Comparable h();
}
