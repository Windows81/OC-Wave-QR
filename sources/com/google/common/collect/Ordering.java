package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@ElementTypesAreNonnullByDefault
public abstract class Ordering<T> implements Comparator<T> {

    public static class ArbitraryOrdering extends Ordering<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final ConcurrentMap f28492A = Platform.g(new MapMaker()).f();

        /* renamed from: z  reason: collision with root package name */
        public final AtomicInteger f28493z = new AtomicInteger(0);

        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int l2 = l(obj);
            int l3 = l(obj2);
            if (l2 != l3) {
                return l2 < l3 ? -1 : 1;
            }
            int compareTo = k(obj).compareTo(k(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        public final Integer k(Object obj) {
            Integer num = (Integer) this.f28492A.get(obj);
            if (num != null) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.f28493z.getAndIncrement());
            Integer num2 = (Integer) this.f28492A.putIfAbsent(obj, valueOf);
            return num2 != null ? num2 : valueOf;
        }

        public int l(Object obj) {
            return System.identityHashCode(obj);
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    public static class ArbitraryOrderingHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final Ordering f28494a = new ArbitraryOrdering();
    }

    public static class IncomparableValueException extends ClassCastException {

        /* renamed from: z  reason: collision with root package name */
        public final Object f28495z;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public IncomparableValueException(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r1 = r0.length()
                int r1 = r1 + 22
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Cannot compare value: "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r3.<init>(r0)
                r3.f28495z = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Ordering.IncomparableValueException.<init>(java.lang.Object):void");
        }
    }

    public static Ordering a(Comparator comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    public static Ordering e() {
        return NaturalOrdering.f28473B;
    }

    public ImmutableList b(Iterable iterable) {
        return ImmutableList.L(this, iterable);
    }

    public Object c(Object obj, Object obj2) {
        return compare(obj, obj2) >= 0 ? obj : obj2;
    }

    public abstract int compare(Object obj, Object obj2);

    public Object d(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    public Ordering f() {
        return new NullsFirstOrdering(this);
    }

    public Ordering g() {
        return new NullsLastOrdering(this);
    }

    public Ordering h() {
        return i(Maps.v());
    }

    public Ordering i(Function function) {
        return new ByFunctionOrdering(function, this);
    }

    public Ordering j() {
        return new ReverseOrdering(this);
    }
}
