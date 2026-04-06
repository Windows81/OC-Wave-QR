package kotlin.time;

import kotlin.Metadata;
import kotlin.time.TimeSource;

@Metadata
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a  reason: collision with root package name */
    public static final MonotonicTimeSource f41216a = new MonotonicTimeSource();

    /* renamed from: b  reason: collision with root package name */
    public static final long f41217b = System.nanoTime();

    public final long a(long j2, long j3) {
        return LongSaturatedMathKt.c(j2, j3, DurationUnit.NANOSECONDS);
    }

    public long b() {
        return TimeSource.Monotonic.ValueTimeMark.f(c());
    }

    public final long c() {
        return System.nanoTime() - f41217b;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
