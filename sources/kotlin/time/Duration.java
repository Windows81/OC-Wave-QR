package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@JvmInline
@Metadata
public final class Duration implements Comparable<Duration> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f41206A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final long f41207B = o(0);
    public static final long C = DurationKt.j(4611686018427387903L);
    public static final long D = DurationKt.j(-4611686018427387903L);

    /* renamed from: z  reason: collision with root package name */
    public final long f41208z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return Duration.C;
        }

        public final long b() {
            return Duration.D;
        }

        public final long c() {
            return Duration.f41207B;
        }

        public final long d(String str) {
            Intrinsics.i(str, "value");
            try {
                return DurationKt.p(str, true);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e2);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ Duration(long j2) {
        this.f41208z = j2;
    }

    public static final long A(long j2) {
        return (!O(j2) || !N(j2)) ? X(j2, DurationUnit.MILLISECONDS) : I(j2);
    }

    public static final long B(long j2) {
        return X(j2, DurationUnit.MINUTES);
    }

    public static final long C(long j2) {
        long I = I(j2);
        if (Q(j2)) {
            return I;
        }
        if (I > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (I < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.n(I);
    }

    public static final long D(long j2) {
        return X(j2, DurationUnit.SECONDS);
    }

    public static final int E(long j2) {
        if (R(j2)) {
            return 0;
        }
        return (int) (B(j2) % ((long) 60));
    }

    public static final int F(long j2) {
        if (R(j2)) {
            return 0;
        }
        return (int) (O(j2) ? DurationKt.n(I(j2) % ((long) 1000)) : I(j2) % ((long) 1000000000));
    }

    public static final int G(long j2) {
        if (R(j2)) {
            return 0;
        }
        return (int) (D(j2) % ((long) 60));
    }

    public static final DurationUnit H(long j2) {
        return Q(j2) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static final long I(long j2) {
        return j2 >> 1;
    }

    public static int M(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean N(long j2) {
        return !R(j2);
    }

    public static final boolean O(long j2) {
        return (((int) j2) & 1) == 1;
    }

    public static final boolean Q(long j2) {
        return (((int) j2) & 1) == 0;
    }

    public static final boolean R(long j2) {
        return j2 == C || j2 == D;
    }

    public static final boolean S(long j2) {
        return j2 < 0;
    }

    public static final boolean T(long j2) {
        return j2 > 0;
    }

    public static final long U(long j2, long j3) {
        return V(j2, Z(j3));
    }

    public static final long V(long j2, long j3) {
        if (R(j2)) {
            if (N(j3) || (j3 ^ j2) >= 0) {
                return j2;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (R(j3)) {
            return j3;
        } else {
            if ((((int) j2) & 1) == (((int) j3) & 1)) {
                long I = I(j2) + I(j3);
                return Q(j2) ? DurationKt.m(I) : DurationKt.k(I);
            } else if (O(j2)) {
                return j(j2, I(j2), I(j3));
            } else {
                return j(j2, I(j3), I(j2));
            }
        }
    }

    public static final String W(long j2) {
        StringBuilder sb = new StringBuilder();
        if (S(j2)) {
            sb.append('-');
        }
        sb.append("PT");
        long t2 = t(j2);
        long z2 = z(t2);
        int E = E(t2);
        int G = G(t2);
        int F = F(t2);
        if (R(j2)) {
            z2 = 9999999999999L;
        }
        boolean z3 = false;
        boolean z4 = z2 != 0;
        boolean z5 = (G == 0 && F == 0) ? false : true;
        if (E != 0 || (z5 && z4)) {
            z3 = true;
        }
        if (z4) {
            sb.append(z2);
            sb.append('H');
        }
        if (z3) {
            sb.append(E);
            sb.append('M');
        }
        if (z5 || (!z4 && !z3)) {
            k(j2, sb, G, F, 9, "S", true);
        }
        return sb.toString();
    }

    public static final long X(long j2, DurationUnit durationUnit) {
        Intrinsics.i(durationUnit, "unit");
        if (j2 == C) {
            return Long.MAX_VALUE;
        }
        if (j2 == D) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.b(I(j2), H(j2), durationUnit);
    }

    public static String Y(long j2) {
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == C) {
            return "Infinity";
        }
        if (j2 == D) {
            return "-Infinity";
        }
        boolean S = S(j2);
        StringBuilder sb = new StringBuilder();
        if (S) {
            sb.append('-');
        }
        long t2 = t(j2);
        long y2 = y(t2);
        int x2 = x(t2);
        int E = E(t2);
        int G = G(t2);
        int F = F(t2);
        int i2 = 0;
        boolean z2 = y2 != 0;
        boolean z3 = x2 != 0;
        boolean z4 = E != 0;
        boolean z5 = (G == 0 && F == 0) ? false : true;
        if (z2) {
            sb.append(y2);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(x2);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(E);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (G != 0 || z2 || z3 || z4) {
                k(j2, sb, G, F, 9, "s", false);
            } else if (F >= 1000000) {
                k(j2, sb, F / 1000000, F % 1000000, 6, "ms", false);
            } else if (F >= 1000) {
                k(j2, sb, F / 1000, F % 1000, 3, "us", false);
            } else {
                sb.append(F);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (S && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long Z(long j2) {
        return DurationKt.i(-I(j2), ((int) j2) & 1);
    }

    public static final long j(long j2, long j3, long j4) {
        long g2 = DurationKt.o(j4);
        long j5 = j3 + g2;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return DurationKt.j(RangesKt.q(j5, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.l(DurationKt.n(j5) + (j4 - DurationKt.n(g2)));
    }

    public static final void k(long j2, StringBuilder sb, int i2, int i3, int i4, String str, boolean z2) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String v0 = StringsKt.v0(String.valueOf(i3), i4, '0');
            int i5 = -1;
            int length = v0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (v0.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z2 || i7 >= 3) {
                sb.append(v0, 0, ((i5 + 3) / 3) * 3);
                Intrinsics.h(sb, "append(...)");
            } else {
                sb.append(v0, 0, i7);
                Intrinsics.h(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ Duration l(long j2) {
        return new Duration(j2);
    }

    public static int n(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return Intrinsics.l(j2, j3);
        }
        int i2 = (((int) j2) & 1) - (((int) j3) & 1);
        return S(j2) ? -i2 : i2;
    }

    public static long o(long j2) {
        if (DurationJvmKt.a()) {
            if (Q(j2)) {
                long I = I(j2);
                if (-4611686018426999999L > I || I >= 4611686018427000000L) {
                    throw new AssertionError(I(j2) + " ns is out of nanoseconds range");
                }
            } else {
                long I2 = I(j2);
                if (-4611686018427387903L > I2 || I2 >= 4611686018427387904L) {
                    throw new AssertionError(I(j2) + " ms is out of milliseconds range");
                }
                long I3 = I(j2);
                if (-4611686018426L <= I3 && I3 < 4611686018427L) {
                    throw new AssertionError(I(j2) + " ms is denormalized");
                }
            }
        }
        return j2;
    }

    public static boolean p(long j2, Object obj) {
        return (obj instanceof Duration) && j2 == ((Duration) obj).a0();
    }

    public static final boolean r(long j2, long j3) {
        return j2 == j3;
    }

    public static final long t(long j2) {
        return S(j2) ? Z(j2) : j2;
    }

    public static final int x(long j2) {
        if (R(j2)) {
            return 0;
        }
        return (int) (z(j2) % ((long) 24));
    }

    public static final long y(long j2) {
        return X(j2, DurationUnit.DAYS);
    }

    public static final long z(long j2) {
        return X(j2, DurationUnit.HOURS);
    }

    public final /* synthetic */ long a0() {
        return this.f41208z;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m(((Duration) obj).a0());
    }

    public boolean equals(Object obj) {
        return p(this.f41208z, obj);
    }

    public int hashCode() {
        return M(this.f41208z);
    }

    public int m(long j2) {
        return n(this.f41208z, j2);
    }

    public String toString() {
        return Y(this.f41208z);
    }
}
