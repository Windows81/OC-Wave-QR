package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

@ElementTypesAreNonnullByDefault
public abstract class DiscreteDomain<C extends Comparable> {

    /* renamed from: z  reason: collision with root package name */
    public final boolean f28077z;

    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public static final BigIntegerDomain f28078A = new BigIntegerDomain();

        /* renamed from: B  reason: collision with root package name */
        public static final BigInteger f28079B = BigInteger.valueOf(Long.MIN_VALUE);
        public static final BigInteger C = BigInteger.valueOf(Long.MAX_VALUE);

        public BigIntegerDomain() {
            super(true);
        }

        /* renamed from: g */
        public long a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f28079B).min(C).longValue();
        }

        /* renamed from: h */
        public BigInteger d(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        /* renamed from: i */
        public BigInteger e(BigInteger bigInteger, long j2) {
            CollectPreconditions.c(j2, "distance");
            return bigInteger.add(BigInteger.valueOf(j2));
        }

        /* renamed from: j */
        public BigInteger f(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public static final IntegerDomain f28080A = new IntegerDomain();

        public IntegerDomain() {
            super(true);
        }

        /* renamed from: g */
        public long a(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        /* renamed from: h */
        public Integer b() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: i */
        public Integer c() {
            return Integer.MIN_VALUE;
        }

        /* renamed from: j */
        public Integer d(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        /* renamed from: k */
        public Integer e(Integer num, long j2) {
            CollectPreconditions.c(j2, "distance");
            return Integer.valueOf(Ints.c(num.longValue() + j2));
        }

        /* renamed from: l */
        public Integer f(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public static final LongDomain f28081A = new LongDomain();

        public LongDomain() {
            super(true);
        }

        /* renamed from: g */
        public long a(Long l2, Long l3) {
            long longValue = l3.longValue() - l2.longValue();
            if (l3.longValue() > l2.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l3.longValue() >= l2.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        /* renamed from: h */
        public Long b() {
            return Long.MAX_VALUE;
        }

        /* renamed from: i */
        public Long c() {
            return Long.MIN_VALUE;
        }

        /* renamed from: j */
        public Long d(Long l2) {
            long longValue = l2.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        /* renamed from: k */
        public Long e(Long l2, long j2) {
            CollectPreconditions.c(j2, "distance");
            long longValue = l2.longValue() + j2;
            if (longValue < 0) {
                Preconditions.e(l2.longValue() < 0, "overflow");
            }
            return Long.valueOf(longValue);
        }

        /* renamed from: l */
        public Long f(Long l2) {
            long longValue = l2.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public abstract long a(Comparable comparable, Comparable comparable2);

    public Comparable b() {
        throw new NoSuchElementException();
    }

    public Comparable c() {
        throw new NoSuchElementException();
    }

    public abstract Comparable d(Comparable comparable);

    public Comparable e(Comparable comparable, long j2) {
        CollectPreconditions.c(j2, "distance");
        long j3 = 0;
        Comparable comparable2 = comparable;
        while (j3 < j2) {
            comparable2 = d(comparable2);
            if (comparable2 != null) {
                j3++;
            } else {
                String valueOf = String.valueOf(comparable);
                StringBuilder sb = new StringBuilder(valueOf.length() + 51);
                sb.append("overflowed computing offset(");
                sb.append(valueOf);
                sb.append(", ");
                sb.append(j2);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return comparable2;
    }

    public abstract Comparable f(Comparable comparable);

    public DiscreteDomain() {
        this(false);
    }

    public DiscreteDomain(boolean z2) {
        this.f28077z = z2;
    }
}
