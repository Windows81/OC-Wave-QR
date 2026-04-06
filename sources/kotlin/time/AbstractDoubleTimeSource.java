package kotlin.time;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;

@Metadata
@Deprecated
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a  reason: collision with root package name */
    public final DurationUnit f41198a;

    @Metadata
    public static final class DoubleTimeMark implements ComparableTimeMark {

        /* renamed from: A  reason: collision with root package name */
        public final AbstractDoubleTimeSource f41199A;

        /* renamed from: B  reason: collision with root package name */
        public final long f41200B;

        /* renamed from: z  reason: collision with root package name */
        public final double f41201z;

        public long K(ComparableTimeMark comparableTimeMark) {
            Intrinsics.i(comparableTimeMark, "other");
            if (comparableTimeMark instanceof DoubleTimeMark) {
                DoubleTimeMark doubleTimeMark = (DoubleTimeMark) comparableTimeMark;
                if (Intrinsics.d(this.f41199A, doubleTimeMark.f41199A)) {
                    if (Duration.r(this.f41200B, doubleTimeMark.f41200B) && Duration.R(this.f41200B)) {
                        return Duration.f41206A.c();
                    }
                    long U = Duration.U(this.f41200B, doubleTimeMark.f41200B);
                    long r2 = DurationKt.r(this.f41201z - doubleTimeMark.f41201z, this.f41199A.a());
                    return Duration.r(r2, Duration.Z(U)) ? Duration.f41206A.c() : Duration.V(r2, U);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + comparableTimeMark);
        }

        /* renamed from: d */
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.a(this, comparableTimeMark);
        }

        public boolean equals(Object obj) {
            return (obj instanceof DoubleTimeMark) && Intrinsics.d(this.f41199A, ((DoubleTimeMark) obj).f41199A) && Duration.r(K((ComparableTimeMark) obj), Duration.f41206A.c());
        }

        public int hashCode() {
            return Duration.M(Duration.V(DurationKt.r(this.f41201z, this.f41199A.a()), this.f41200B));
        }

        public String toString() {
            return "DoubleTimeMark(" + this.f41201z + DurationUnitKt__DurationUnitKt.f(this.f41199A.a()) + " + " + Duration.Y(this.f41200B) + ", " + this.f41199A + ')';
        }
    }

    public final DurationUnit a() {
        return this.f41198a;
    }
}
