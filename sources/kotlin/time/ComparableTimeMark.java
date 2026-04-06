package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    @Metadata
    public static final class DefaultImpls {
        public static int a(ComparableTimeMark comparableTimeMark, ComparableTimeMark comparableTimeMark2) {
            Intrinsics.i(comparableTimeMark2, "other");
            return Duration.n(comparableTimeMark.K(comparableTimeMark2), Duration.f41206A.c());
        }
    }

    long K(ComparableTimeMark comparableTimeMark);
}
