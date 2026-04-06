package kotlin.time;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;

@Metadata
public final class DurationKt {
    public static final long i(long j2, int i2) {
        return Duration.o((j2 << 1) + ((long) i2));
    }

    public static final long j(long j2) {
        return Duration.o((j2 << 1) + 1);
    }

    public static final long k(long j2) {
        return (-4611686018426L > j2 || j2 >= 4611686018427L) ? j(RangesKt.q(j2, -4611686018427387903L, 4611686018427387903L)) : l(n(j2));
    }

    public static final long l(long j2) {
        return Duration.o(j2 << 1);
    }

    public static final long m(long j2) {
        return (-4611686018426999999L > j2 || j2 >= 4611686018427000000L) ? j(o(j2)) : l(j2);
    }

    public static final long n(long j2) {
        return j2 * ((long) 1000000);
    }

    public static final long o(long j2) {
        return j2 / ((long) 1000000);
    }

    public static final long p(String str, boolean z2) {
        long j2;
        long j3;
        int i2;
        String str2 = str;
        int length = str.length();
        if (length != 0) {
            Duration.Companion companion = Duration.f41206A;
            long c2 = companion.c();
            char charAt = str2.charAt(0);
            boolean z3 = true;
            int i3 = (charAt == '+' || charAt == '-') ? 1 : 0;
            boolean z4 = i3 > 0;
            boolean z5 = z4 && StringsKt.Q0(str2, '-', false, 2, (Object) null);
            if (length > i3) {
                char c3 = ':';
                String str3 = "No components";
                char c4 = '0';
                if (str2.charAt(i3) == 'P') {
                    int i4 = i3 + 1;
                    if (i4 != length) {
                        DurationUnit durationUnit = null;
                        boolean z6 = false;
                        while (i4 < length) {
                            if (str2.charAt(i4) != 'T') {
                                int i5 = i4;
                                while (true) {
                                    if (i5 >= str.length()) {
                                        break;
                                    }
                                    char charAt2 = str2.charAt(i5);
                                    if (c4 > charAt2 || charAt2 >= c3) {
                                        if (!StringsKt.V("+-.", charAt2, false, 2, (Object) null)) {
                                            break;
                                        }
                                    }
                                    i5++;
                                    c3 = ':';
                                    c4 = '0';
                                }
                                Intrinsics.g(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring = str2.substring(i4, i5);
                                Intrinsics.h(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = i4 + substring.length();
                                    if (length2 < 0 || length2 >= str.length()) {
                                        throw new IllegalArgumentException("Missing unit for value " + substring);
                                    }
                                    char charAt3 = str2.charAt(length2);
                                    int i6 = length2 + 1;
                                    DurationUnit d2 = DurationUnitKt__DurationUnitKt.d(charAt3, z6);
                                    if (durationUnit == null || durationUnit.compareTo(d2) > 0) {
                                        int i0 = StringsKt.i0(substring, '.', 0, false, 6, (Object) null);
                                        if (d2 != DurationUnit.SECONDS || i0 <= 0) {
                                            i2 = i6;
                                            c2 = Duration.V(c2, t(q(substring), d2));
                                        } else {
                                            Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring2 = substring.substring(0, i0);
                                            Intrinsics.h(substring2, "substring(...)");
                                            i2 = i6;
                                            long V = Duration.V(c2, t(q(substring2), d2));
                                            Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring3 = substring.substring(i0);
                                            Intrinsics.h(substring3, "substring(...)");
                                            c2 = Duration.V(V, r(Double.parseDouble(substring3), d2));
                                        }
                                        i4 = i2;
                                        durationUnit = d2;
                                        c3 = ':';
                                        c4 = '0';
                                        z3 = true;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected order of duration components");
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else if (z6 || (i4 = i4 + 1) == length) {
                                throw new IllegalArgumentException();
                            } else {
                                z6 = z3;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (!z2) {
                    String str4 = "substring(...)";
                    String str5 = "Unexpected order of duration components";
                    long j4 = c2;
                    String str6 = str3;
                    if (StringsKt.E(str, i3, "Infinity", 0, Math.max(length - i3, 8), true)) {
                        c2 = companion.a();
                    } else {
                        boolean z7 = !z4;
                        if (z4 && str2.charAt(i3) == '(' && StringsKt.l1(str) == ')') {
                            i3++;
                            length--;
                            if (i3 != length) {
                                j2 = j4;
                                z7 = true;
                            } else {
                                throw new IllegalArgumentException(str6);
                            }
                        } else {
                            j2 = j4;
                        }
                        DurationUnit durationUnit2 = null;
                        boolean z8 = false;
                        while (i3 < length) {
                            if (z8 && z7) {
                                while (i3 < str.length() && str2.charAt(i3) == ' ') {
                                    i3++;
                                }
                            }
                            int i7 = i3;
                            while (true) {
                                if (i7 >= str.length()) {
                                    break;
                                }
                                char charAt4 = str2.charAt(i7);
                                if (('0' > charAt4 || charAt4 >= ':') && charAt4 != '.') {
                                    break;
                                }
                                i7++;
                            }
                            Intrinsics.g(str2, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str2.substring(i3, i7);
                            Intrinsics.h(substring4, str4);
                            if (substring4.length() != 0) {
                                int length3 = i3 + substring4.length();
                                int i8 = length3;
                                while (i8 < str.length() && 'a' <= (r9 = str2.charAt(i8)) && r9 < '{') {
                                    i8++;
                                }
                                Intrinsics.g(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str2.substring(length3, i8);
                                Intrinsics.h(substring5, str4);
                                int length4 = length3 + substring5.length();
                                DurationUnit e2 = DurationUnitKt__DurationUnitKt.e(substring5);
                                if (durationUnit2 == null || durationUnit2.compareTo(e2) > 0) {
                                    String str7 = str5;
                                    int i02 = StringsKt.i0(substring4, '.', 0, false, 6, (Object) null);
                                    if (i02 > 0) {
                                        Intrinsics.g(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring6 = substring4.substring(0, i02);
                                        Intrinsics.h(substring6, str4);
                                        long V2 = Duration.V(j3, t(Long.parseLong(substring6), e2));
                                        Intrinsics.g(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring7 = substring4.substring(i02);
                                        Intrinsics.h(substring7, str4);
                                        j3 = Duration.V(V2, r(Double.parseDouble(substring7), e2));
                                        length4 = length4;
                                        if (length4 < length) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                    } else {
                                        j3 = Duration.V(j3, t(Long.parseLong(substring4), e2));
                                    }
                                    str5 = str7;
                                    durationUnit2 = e2;
                                    z8 = true;
                                } else {
                                    throw new IllegalArgumentException(str5);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        c2 = j3;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                return z5 ? Duration.Z(c2) : c2;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    public static final long q(String str) {
        int length = str.length();
        int i2 = (length <= 0 || !StringsKt.V("+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i2 > 16) {
            IntRange intRange = new IntRange(i2, StringsKt.d0(str));
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (it.hasNext()) {
                    char charAt = str.charAt(((IntIterator) it).b());
                    if ('0' <= charAt) {
                        if (charAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (StringsKt.Q(str, "+", false, 2, (Object) null)) {
            str = StringsKt.i1(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d2, DurationUnit durationUnit) {
        Intrinsics.i(durationUnit, "unit");
        double a2 = DurationUnitKt__DurationUnitJvmKt.a(d2, durationUnit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(a2)) {
            long e2 = MathKt.e(a2);
            return (-4611686018426999999L > e2 || e2 >= 4611686018427000000L) ? k(MathKt.e(DurationUnitKt__DurationUnitJvmKt.a(d2, durationUnit, DurationUnit.MILLISECONDS))) : l(e2);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }

    public static final long s(int i2, DurationUnit durationUnit) {
        Intrinsics.i(durationUnit, "unit");
        return durationUnit.compareTo(DurationUnit.SECONDS) <= 0 ? l(DurationUnitKt__DurationUnitJvmKt.c((long) i2, durationUnit, DurationUnit.NANOSECONDS)) : t((long) i2, durationUnit);
    }

    public static final long t(long j2, DurationUnit durationUnit) {
        Intrinsics.i(durationUnit, "unit");
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long c2 = DurationUnitKt__DurationUnitJvmKt.c(4611686018426999999L, durationUnit2, durationUnit);
        return ((-c2) > j2 || j2 > c2) ? j(RangesKt.q(DurationUnitKt__DurationUnitJvmKt.b(j2, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(DurationUnitKt__DurationUnitJvmKt.c(j2, durationUnit, durationUnit2));
    }
}
