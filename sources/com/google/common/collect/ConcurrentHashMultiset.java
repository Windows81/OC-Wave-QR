package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {

    /* renamed from: B  reason: collision with root package name */
    public final transient ConcurrentMap f28057B;

    public class EntrySet extends AbstractMultiset<E>.EntrySet {
        public EntrySet() {
            super();
        }

        /* renamed from: n */
        public ConcurrentHashMultiset m() {
            return ConcurrentHashMultiset.this;
        }

        public final List o() {
            ArrayList l2 = Lists.l(size());
            Iterators.a(l2, iterator());
            return l2;
        }

        public Object[] toArray() {
            return o().toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return o().toArray(objArr);
        }
    }

    public static class FieldSettersHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final Serialization.FieldSetter f28064a = Serialization.a(ConcurrentHashMultiset.class, "countMap");
    }

    public int L0(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.I(this.f28057B, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    public int N(Object obj, int i2) {
        int i3;
        int max;
        if (i2 == 0) {
            return L0(obj);
        }
        CollectPreconditions.d(i2, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.I(this.f28057B, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i3 = atomicInteger.get();
            if (i3 == 0) {
                return 0;
            }
            max = Math.max(0, i3 - i2);
        } while (!atomicInteger.compareAndSet(i3, max));
        if (max == 0) {
            this.f28057B.remove(obj, atomicInteger);
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r4.f28057B.putIfAbsent(r5, r2) == null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int T(java.lang.Object r5, int r6) {
        /*
            r4 = this;
            com.google.common.base.Preconditions.q(r5)
            if (r6 != 0) goto L_0x000a
            int r5 = r4.L0(r5)
            return r5
        L_0x000a:
            java.lang.String r0 = "occurrences"
            com.google.common.collect.CollectPreconditions.d(r6, r0)
        L_0x000f:
            java.util.concurrent.ConcurrentMap r0 = r4.f28057B
            java.lang.Object r0 = com.google.common.collect.Maps.I(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.ConcurrentMap r0 = r4.f28057B
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            int r2 = r0.get()
            if (r2 == 0) goto L_0x005c
            int r3 = com.google.common.math.IntMath.b(r2, r6)     // Catch:{ ArithmeticException -> 0x003b }
            boolean r3 = r0.compareAndSet(r2, r3)     // Catch:{ ArithmeticException -> 0x003b }
            if (r3 == 0) goto L_0x002a
            return r2
        L_0x003b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 65
            r0.<init>(r1)
            java.lang.String r1 = "Overflow adding "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " occurrences to a count of "
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x005c:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap r3 = r4.f28057B
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x0071
            java.util.concurrent.ConcurrentMap r3 = r4.f28057B
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x000f
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.T(java.lang.Object, int):int");
    }

    public void clear() {
        this.f28057B.clear();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public Set e() {
        final Set keySet = this.f28057B.keySet();
        return new ForwardingSet<E>(this) {
            /* renamed from: Z */
            public Set Q() {
                return keySet;
            }

            public boolean contains(Object obj) {
                return obj != null && Collections2.g(keySet, obj);
            }

            public boolean containsAll(Collection collection) {
                return S(collection);
            }

            public boolean remove(Object obj) {
                return obj != null && Collections2.h(keySet, obj);
            }

            public boolean removeAll(Collection collection) {
                return a0(collection);
            }
        };
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public Set g() {
        return new EntrySet();
    }

    public int h() {
        return this.f28057B.size();
    }

    public Iterator i() {
        throw new AssertionError("should never be called");
    }

    public boolean isEmpty() {
        return this.f28057B.isEmpty();
    }

    public Iterator iterator() {
        return Multisets.i(this);
    }

    public /* bridge */ /* synthetic */ Set k() {
        return super.k();
    }

    public Iterator m() {
        final AnonymousClass2 r0 = new AbstractIterator<Multiset.Entry<E>>() {

            /* renamed from: B  reason: collision with root package name */
            public final Iterator f28059B;

            {
                this.f28059B = ConcurrentHashMultiset.this.f28057B.entrySet().iterator();
            }

            /* renamed from: e */
            public Multiset.Entry b() {
                while (this.f28059B.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f28059B.next();
                    int i2 = ((AtomicInteger) entry.getValue()).get();
                    if (i2 != 0) {
                        return Multisets.g(entry.getKey(), i2);
                    }
                }
                return (Multiset.Entry) c();
            }
        };
        return new ForwardingIterator<Multiset.Entry<E>>() {

            /* renamed from: z  reason: collision with root package name */
            public Multiset.Entry f28062z;

            /* renamed from: Q */
            public Iterator M() {
                return r0;
            }

            /* renamed from: R */
            public Multiset.Entry next() {
                Multiset.Entry entry = (Multiset.Entry) super.next();
                this.f28062z = entry;
                return entry;
            }

            public void remove() {
                Preconditions.x(this.f28062z != null, "no calls to next() since the last call to remove()");
                ConcurrentHashMultiset.this.n0(this.f28062z.a(), 0);
                this.f28062z = null;
            }
        };
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r6 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r4.f28057B.putIfAbsent(r5, r2) == null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int n0(java.lang.Object r5, int r6) {
        /*
            r4 = this;
            com.google.common.base.Preconditions.q(r5)
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.b(r6, r0)
        L_0x0008:
            java.util.concurrent.ConcurrentMap r0 = r4.f28057B
            java.lang.Object r0 = com.google.common.collect.Maps.I(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x0026
            if (r6 != 0) goto L_0x0016
            return r1
        L_0x0016:
            java.util.concurrent.ConcurrentMap r0 = r4.f28057B
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0026:
            int r2 = r0.get()
            if (r2 != 0) goto L_0x0045
            if (r6 != 0) goto L_0x002f
            return r1
        L_0x002f:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap r3 = r4.f28057B
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x0044
            java.util.concurrent.ConcurrentMap r3 = r4.f28057B
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x0008
        L_0x0044:
            return r1
        L_0x0045:
            boolean r3 = r0.compareAndSet(r2, r6)
            if (r3 == 0) goto L_0x0026
            if (r6 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentMap r6 = r4.f28057B
            r6.remove(r5, r0)
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.n0(java.lang.Object, int):int");
    }

    public final List o() {
        ArrayList l2 = Lists.l(size());
        for (Multiset.Entry entry : entrySet()) {
            Object a2 = entry.a();
            for (int count = entry.getCount(); count > 0; count--) {
                l2.add(a2);
            }
        }
        return l2;
    }

    public int size() {
        long j2 = 0;
        for (AtomicInteger atomicInteger : this.f28057B.values()) {
            j2 += (long) atomicInteger.get();
        }
        return Ints.k(j2);
    }

    public boolean t0(Object obj, int i2, int i3) {
        Preconditions.q(obj);
        CollectPreconditions.b(i2, "oldCount");
        CollectPreconditions.b(i3, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.I(this.f28057B, obj);
        if (atomicInteger != null) {
            int i4 = atomicInteger.get();
            if (i4 == i2) {
                if (i4 == 0) {
                    if (i3 == 0) {
                        this.f28057B.remove(obj, atomicInteger);
                        return true;
                    }
                    AtomicInteger atomicInteger2 = new AtomicInteger(i3);
                    return this.f28057B.putIfAbsent(obj, atomicInteger2) == null || this.f28057B.replace(obj, atomicInteger, atomicInteger2);
                } else if (atomicInteger.compareAndSet(i4, i3)) {
                    if (i3 == 0) {
                        this.f28057B.remove(obj, atomicInteger);
                    }
                    return true;
                }
            }
            return false;
        } else if (i2 != 0) {
            return false;
        } else {
            if (i3 == 0) {
                return true;
            }
            return this.f28057B.putIfAbsent(obj, new AtomicInteger(i3)) == null;
        }
    }

    public Object[] toArray() {
        return o().toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return o().toArray(objArr);
    }
}
