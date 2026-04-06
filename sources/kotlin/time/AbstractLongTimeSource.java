package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;

@Metadata
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a  reason: collision with root package name */
    public final DurationUnit f41202a;

    @Metadata
    public static final class LongTimeMark implements ComparableTimeMark {

        /* renamed from: A  reason: collision with root package name */
        public final AbstractLongTimeSource f41203A;

        /* renamed from: B  reason: collision with root package name */
        public final long f41204B;

        /* renamed from: z  reason: collision with root package name */
        public final long f41205z;

        public long K(ComparableTimeMark comparableTimeMark) {
            Intrinsics.i(comparableTimeMark, "other");
            if (comparableTimeMark instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) comparableTimeMark;
                if (Intrinsics.d(this.f41203A, longTimeMark.f41203A)) {
                    return Duration.V(LongSaturatedMathKt.c(this.f41205z, longTimeMark.f41205z, this.f41203A.a()), Duration.U(this.f41204B, longTimeMark.f41204B));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + comparableTimeMark);
        }

        /* renamed from: d */
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.a(this, comparableTimeMark);
        }

        public boolean equals(Object obj) {
            return (obj instanceof LongTimeMark) && Intrinsics.d(this.f41203A, ((LongTimeMark) obj).f41203A) && Duration.r(K((ComparableTimeMark) obj), Duration.f41206A.c());
        }

        public int hashCode() {
            return (Duration.M(this.f41204B) * 37) + Long.hashCode(this.f41205z);
        }

        public String toString() {
            return "LongTimeMark(" + this.f41205z + DurationUnitKt__DurationUnitKt.f(this.f41203A.a()) + " + " + Duration.Y(this.f41204B) + ", " + this.f41203A + ')';
        }
    }

    public final DurationUnit a() {
        return this.f41202a;
    }
}
