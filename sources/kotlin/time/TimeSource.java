package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;

@Metadata
public interface TimeSource {

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f41218a = new Companion();
    }

    @Metadata
    public static final class Monotonic implements WithComparableMarks {

        /* renamed from: a  reason: collision with root package name */
        public static final Monotonic f41219a = new Monotonic();

        @JvmInline
        @Metadata
        public static final class ValueTimeMark implements ComparableTimeMark {

            /* renamed from: z  reason: collision with root package name */
            public final long f41220z;

            public static long f(long j2) {
                return j2;
            }

            public static boolean h(long j2, Object obj) {
                return (obj instanceof ValueTimeMark) && j2 == ((ValueTimeMark) obj).n();
            }

            public static int j(long j2) {
                return Long.hashCode(j2);
            }

            public static final long k(long j2, long j3) {
                return MonotonicTimeSource.f41216a.a(j2, j3);
            }

            public static long l(long j2, ComparableTimeMark comparableTimeMark) {
                Intrinsics.i(comparableTimeMark, "other");
                if (comparableTimeMark instanceof ValueTimeMark) {
                    return k(j2, ((ValueTimeMark) comparableTimeMark).n());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + m(j2) + " and " + comparableTimeMark);
            }

            public static String m(long j2) {
                return "ValueTimeMark(reading=" + j2 + ')';
            }

            public long K(ComparableTimeMark comparableTimeMark) {
                Intrinsics.i(comparableTimeMark, "other");
                return l(this.f41220z, comparableTimeMark);
            }

            /* renamed from: d */
            public int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.a(this, comparableTimeMark);
            }

            public boolean equals(Object obj) {
                return h(this.f41220z, obj);
            }

            public int hashCode() {
                return j(this.f41220z);
            }

            public final /* synthetic */ long n() {
                return this.f41220z;
            }

            public String toString() {
                return m(this.f41220z);
            }
        }

        public long a() {
            return MonotonicTimeSource.f41216a.b();
        }

        public String toString() {
            return MonotonicTimeSource.f41216a.toString();
        }
    }

    @Metadata
    public interface WithComparableMarks extends TimeSource {
    }
}
