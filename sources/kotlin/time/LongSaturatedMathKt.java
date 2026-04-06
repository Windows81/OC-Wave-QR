package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

@Metadata
public final class LongSaturatedMathKt {
    public static final long a(long j2) {
        return j2 < 0 ? Duration.f41206A.b() : Duration.f41206A.a();
    }

    public static final long b(long j2, long j3, DurationUnit durationUnit) {
        long j4 = j2 - j3;
        if (((j4 ^ j2) & (~(j4 ^ j3))) >= 0) {
            return DurationKt.t(j4, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.Z(a(j4));
        }
        long b2 = DurationUnitKt__DurationUnitJvmKt.b(1, durationUnit2, durationUnit);
        long j5 = (j2 % b2) - (j3 % b2);
        Duration.Companion companion = Duration.f41206A;
        return Duration.V(DurationKt.t((j2 / b2) - (j3 / b2), durationUnit2), DurationKt.t(j5, durationUnit));
    }

    public static final long c(long j2, long j3, DurationUnit durationUnit) {
        Intrinsics.i(durationUnit, "unit");
        return ((j3 - 1) | 1) == Long.MAX_VALUE ? j2 == j3 ? Duration.f41206A.c() : Duration.Z(a(j3)) : (1 | (j2 - 1)) == Long.MAX_VALUE ? a(j2) : b(j2, j3, durationUnit);
    }
}
