package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object I = new Object();

    /* renamed from: A  reason: collision with root package name */
    public transient int[] f28033A;

    /* renamed from: B  reason: collision with root package name */
    public transient Object[] f28034B;
    public transient Object[] C;
    public transient int D;
    public transient int E;
    public transient Set F;
    public transient Set G;
    public transient Collection H;

    /* renamed from: z  reason: collision with root package name */
    public transient Object f28035z;

    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        public EntrySetView() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            Map y2 = CompactHashMap.this.y();
            if (y2 != null) {
                return y2.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int j2 = CompactHashMap.this.F(entry.getKey());
            return j2 != -1 && Objects.a(CompactHashMap.this.b0(j2), entry.getValue());
        }

        public Iterator iterator() {
            return CompactHashMap.this.A();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            r0 = com.google.common.collect.CompactHashMap.m(r9.f28036z);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r10) {
            /*
                r9 = this;
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.this
                java.util.Map r0 = r0.y()
                if (r0 == 0) goto L_0x0011
                java.util.Set r0 = r0.entrySet()
                boolean r10 = r0.remove(r10)
                return r10
            L_0x0011:
                boolean r0 = r10 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0061
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.this
                boolean r0 = r0.M()
                if (r0 == 0) goto L_0x0021
                return r1
            L_0x0021:
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.this
                int r0 = r0.D()
                java.lang.Object r2 = r10.getKey()
                java.lang.Object r3 = r10.getValue()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                java.lang.Object r5 = r10.R()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                int[] r6 = r10.P()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                java.lang.Object[] r7 = r10.Q()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                java.lang.Object[] r8 = r10.S()
                r4 = r0
                int r10 = com.google.common.collect.CompactHashing.f(r2, r3, r4, r5, r6, r7, r8)
                r2 = -1
                if (r10 != r2) goto L_0x0050
                return r1
            L_0x0050:
                com.google.common.collect.CompactHashMap r1 = com.google.common.collect.CompactHashMap.this
                r1.L(r10, r0)
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                com.google.common.collect.CompactHashMap.f(r10)
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                r10.E()
                r10 = 1
                return r10
            L_0x0061:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.EntrySetView.remove(java.lang.Object):boolean");
        }

        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public int f28037A;

        /* renamed from: B  reason: collision with root package name */
        public int f28038B;

        /* renamed from: z  reason: collision with root package name */
        public int f28039z;

        public Itr() {
            this.f28039z = CompactHashMap.this.D;
            this.f28037A = CompactHashMap.this.B();
            this.f28038B = -1;
        }

        public final void b() {
            if (CompactHashMap.this.D != this.f28039z) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object c(int i2);

        public void d() {
            this.f28039z += 32;
        }

        public boolean hasNext() {
            return this.f28037A >= 0;
        }

        public Object next() {
            b();
            if (hasNext()) {
                int i2 = this.f28037A;
                this.f28038B = i2;
                Object c2 = c(i2);
                this.f28037A = CompactHashMap.this.C(this.f28037A);
                return c2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            b();
            CollectPreconditions.e(this.f28038B >= 0);
            d();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.J(this.f28038B));
            this.f28037A = CompactHashMap.this.q(this.f28037A, this.f28038B);
            this.f28038B = -1;
        }
    }

    public class KeySetView extends AbstractSet<K> {
        public KeySetView() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        public Iterator iterator() {
            return CompactHashMap.this.K();
        }

        public boolean remove(Object obj) {
            Map y2 = CompactHashMap.this.y();
            return y2 != null ? y2.keySet().remove(obj) : CompactHashMap.this.N(obj) != CompactHashMap.I;
        }

        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class MapEntry extends AbstractMapEntry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public int f28041A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28043z;

        public MapEntry(int i2) {
            this.f28043z = CompactHashMap.this.J(i2);
            this.f28041A = i2;
        }

        public final void a() {
            int i2 = this.f28041A;
            if (i2 == -1 || i2 >= CompactHashMap.this.size() || !Objects.a(this.f28043z, CompactHashMap.this.J(this.f28041A))) {
                this.f28041A = CompactHashMap.this.F(this.f28043z);
            }
        }

        public Object getKey() {
            return this.f28043z;
        }

        public Object getValue() {
            Map y2 = CompactHashMap.this.y();
            if (y2 != null) {
                return NullnessCasts.a(y2.get(this.f28043z));
            }
            a();
            int i2 = this.f28041A;
            return i2 == -1 ? NullnessCasts.b() : CompactHashMap.this.b0(i2);
        }

        public Object setValue(Object obj) {
            Map y2 = CompactHashMap.this.y();
            if (y2 != null) {
                return NullnessCasts.a(y2.put(this.f28043z, obj));
            }
            a();
            int i2 = this.f28041A;
            if (i2 == -1) {
                CompactHashMap.this.put(this.f28043z, obj);
                return NullnessCasts.b();
            }
            Object k2 = CompactHashMap.this.b0(i2);
            CompactHashMap.this.a0(this.f28041A, obj);
            return k2;
        }
    }

    public class ValuesView extends AbstractCollection<V> {
        public ValuesView() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public Iterator iterator() {
            return CompactHashMap.this.c0();
        }

        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        G(3);
    }

    public static /* synthetic */ int f(CompactHashMap compactHashMap) {
        int i2 = compactHashMap.E;
        compactHashMap.E = i2 - 1;
        return i2;
    }

    public static CompactHashMap t() {
        return new CompactHashMap();
    }

    public Iterator A() {
        Map y2 = y();
        return y2 != null ? y2.entrySet().iterator() : new CompactHashMap<K, V>.Itr<Map.Entry<K, V>>() {
            /* renamed from: e */
            public Map.Entry c(int i2) {
                return new MapEntry(i2);
            }
        };
    }

    public int B() {
        return isEmpty() ? -1 : 0;
    }

    public int C(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.E) {
            return i3;
        }
        return -1;
    }

    public final int D() {
        return (1 << (this.D & 31)) - 1;
    }

    public void E() {
        this.D += 32;
    }

    public final int F(Object obj) {
        if (M()) {
            return -1;
        }
        int d2 = Hashing.d(obj);
        int D2 = D();
        int h2 = CompactHashing.h(R(), d2 & D2);
        if (h2 == 0) {
            return -1;
        }
        int b2 = CompactHashing.b(d2, D2);
        do {
            int i2 = h2 - 1;
            int z2 = z(i2);
            if (CompactHashing.b(z2, D2) == b2 && Objects.a(obj, J(i2))) {
                return i2;
            }
            h2 = CompactHashing.c(z2, D2);
        } while (h2 != 0);
        return -1;
    }

    public void G(int i2) {
        Preconditions.e(i2 >= 0, "Expected size must be >= 0");
        this.D = Ints.e(i2, 1, 1073741823);
    }

    public void I(int i2, Object obj, Object obj2, int i3, int i4) {
        W(i2, CompactHashing.d(i3, 0, i4));
        Z(i2, obj);
        a0(i2, obj2);
    }

    public final Object J(int i2) {
        return Q()[i2];
    }

    public Iterator K() {
        Map y2 = y();
        return y2 != null ? y2.keySet().iterator() : new CompactHashMap<K, V>.Itr<K>() {
            public Object c(int i2) {
                return CompactHashMap.this.J(i2);
            }
        };
    }

    public void L(int i2, int i3) {
        Object R = R();
        int[] P = P();
        Object[] Q = Q();
        Object[] S = S();
        int size = size();
        int i4 = size - 1;
        if (i2 < i4) {
            Object obj = Q[i4];
            Q[i2] = obj;
            S[i2] = S[i4];
            Q[i4] = null;
            S[i4] = null;
            P[i2] = P[i4];
            P[i4] = 0;
            int d2 = Hashing.d(obj) & i3;
            int h2 = CompactHashing.h(R, d2);
            if (h2 == size) {
                CompactHashing.i(R, d2, i2 + 1);
                return;
            }
            while (true) {
                int i5 = h2 - 1;
                int i6 = P[i5];
                int c2 = CompactHashing.c(i6, i3);
                if (c2 == size) {
                    P[i5] = CompactHashing.d(i6, i2 + 1, i3);
                    return;
                }
                h2 = c2;
            }
        } else {
            Q[i2] = null;
            S[i2] = null;
            P[i2] = 0;
        }
    }

    public boolean M() {
        return this.f28035z == null;
    }

    public final Object N(Object obj) {
        if (M()) {
            return I;
        }
        int D2 = D();
        int f2 = CompactHashing.f(obj, (Object) null, D2, R(), P(), Q(), (Object[]) null);
        if (f2 == -1) {
            return I;
        }
        Object b0 = b0(f2);
        L(f2, D2);
        this.E--;
        E();
        return b0;
    }

    public final int[] P() {
        int[] iArr = this.f28033A;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] Q() {
        Object[] objArr = this.f28034B;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object R() {
        Object obj = this.f28035z;
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] S() {
        Object[] objArr = this.C;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    public void T(int i2) {
        this.f28033A = Arrays.copyOf(P(), i2);
        this.f28034B = Arrays.copyOf(Q(), i2);
        this.C = Arrays.copyOf(S(), i2);
    }

    public final void U(int i2) {
        int min;
        int length = P().length;
        if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            T(min);
        }
    }

    public final int V(int i2, int i3, int i4, int i5) {
        Object a2 = CompactHashing.a(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            CompactHashing.i(a2, i4 & i6, i5 + 1);
        }
        Object R = R();
        int[] P = P();
        for (int i7 = 0; i7 <= i2; i7++) {
            int h2 = CompactHashing.h(R, i7);
            while (h2 != 0) {
                int i8 = h2 - 1;
                int i9 = P[i8];
                int b2 = CompactHashing.b(i9, i2) | i7;
                int i10 = b2 & i6;
                int h3 = CompactHashing.h(a2, i10);
                CompactHashing.i(a2, i10, h2);
                P[i8] = CompactHashing.d(b2, h3, i6);
                h2 = CompactHashing.c(i9, i2);
            }
        }
        this.f28035z = a2;
        Y(i6);
        return i6;
    }

    public final void W(int i2, int i3) {
        P()[i2] = i3;
    }

    public final void Y(int i2) {
        this.D = CompactHashing.d(this.D, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    public final void Z(int i2, Object obj) {
        Q()[i2] = obj;
    }

    public final void a0(int i2, Object obj) {
        S()[i2] = obj;
    }

    public final Object b0(int i2) {
        return S()[i2];
    }

    public Iterator c0() {
        Map y2 = y();
        return y2 != null ? y2.values().iterator() : new CompactHashMap<K, V>.Itr<V>() {
            public Object c(int i2) {
                return CompactHashMap.this.b0(i2);
            }
        };
    }

    public void clear() {
        if (!M()) {
            E();
            Map y2 = y();
            if (y2 != null) {
                this.D = Ints.e(size(), 3, 1073741823);
                y2.clear();
                this.f28035z = null;
                this.E = 0;
                return;
            }
            Arrays.fill(Q(), 0, this.E, (Object) null);
            Arrays.fill(S(), 0, this.E, (Object) null);
            CompactHashing.g(R());
            Arrays.fill(P(), 0, this.E, 0);
            this.E = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map y2 = y();
        return y2 != null ? y2.containsKey(obj) : F(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        Map y2 = y();
        if (y2 != null) {
            return y2.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.E; i2++) {
            if (Objects.a(obj, b0(i2))) {
                return true;
            }
        }
        return false;
    }

    public Set entrySet() {
        Set set = this.G;
        if (set != null) {
            return set;
        }
        Set u2 = u();
        this.G = u2;
        return u2;
    }

    public Object get(Object obj) {
        Map y2 = y();
        if (y2 != null) {
            return y2.get(obj);
        }
        int F2 = F(obj);
        if (F2 == -1) {
            return null;
        }
        p(F2);
        return b0(F2);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set keySet() {
        Set set = this.F;
        if (set != null) {
            return set;
        }
        Set w2 = w();
        this.F = w2;
        return w2;
    }

    public void p(int i2) {
    }

    public Object put(Object obj, Object obj2) {
        int i2;
        int V;
        if (M()) {
            r();
        }
        Map y2 = y();
        if (y2 != null) {
            return y2.put(obj, obj2);
        }
        int[] P = P();
        Object[] Q = Q();
        Object[] S = S();
        int i3 = this.E;
        int i4 = i3 + 1;
        int d2 = Hashing.d(obj);
        int D2 = D();
        int i5 = d2 & D2;
        int h2 = CompactHashing.h(R(), i5);
        if (h2 != 0) {
            int b2 = CompactHashing.b(d2, D2);
            int i6 = 0;
            while (true) {
                int i7 = h2 - 1;
                int i8 = P[i7];
                if (CompactHashing.b(i8, D2) != b2 || !Objects.a(obj, Q[i7])) {
                    int c2 = CompactHashing.c(i8, D2);
                    i6++;
                    if (c2 != 0) {
                        h2 = c2;
                    } else if (i6 >= 9) {
                        return s().put(obj, obj2);
                    } else {
                        if (i4 > D2) {
                            V = V(D2, CompactHashing.e(D2), d2, i3);
                        } else {
                            P[i7] = CompactHashing.d(i8, i4, D2);
                        }
                    }
                } else {
                    Object obj3 = S[i7];
                    S[i7] = obj2;
                    p(i7);
                    return obj3;
                }
            }
            i2 = D2;
            U(i4);
            I(i3, obj, obj2, d2, i2);
            this.E = i4;
            E();
            return null;
        } else if (i4 > D2) {
            V = V(D2, CompactHashing.e(D2), d2, i3);
        } else {
            CompactHashing.i(R(), i5, i4);
            i2 = D2;
            U(i4);
            I(i3, obj, obj2, d2, i2);
            this.E = i4;
            E();
            return null;
        }
        i2 = V;
        U(i4);
        I(i3, obj, obj2, d2, i2);
        this.E = i4;
        E();
        return null;
    }

    public int q(int i2, int i3) {
        return i2 - 1;
    }

    public int r() {
        Preconditions.x(M(), "Arrays already allocated");
        int i2 = this.D;
        int j2 = CompactHashing.j(i2);
        this.f28035z = CompactHashing.a(j2);
        Y(j2 - 1);
        this.f28033A = new int[i2];
        this.f28034B = new Object[i2];
        this.C = new Object[i2];
        return i2;
    }

    public Object remove(Object obj) {
        Map y2 = y();
        if (y2 != null) {
            return y2.remove(obj);
        }
        Object N = N(obj);
        if (N == I) {
            return null;
        }
        return N;
    }

    public Map s() {
        Map v2 = v(D() + 1);
        int B2 = B();
        while (B2 >= 0) {
            v2.put(J(B2), b0(B2));
            B2 = C(B2);
        }
        this.f28035z = v2;
        this.f28033A = null;
        this.f28034B = null;
        this.C = null;
        E();
        return v2;
    }

    public int size() {
        Map y2 = y();
        return y2 != null ? y2.size() : this.E;
    }

    public Set u() {
        return new EntrySetView();
    }

    public Map v(int i2) {
        return new LinkedHashMap(i2, 1.0f);
    }

    public Collection values() {
        Collection collection = this.H;
        if (collection != null) {
            return collection;
        }
        Collection x2 = x();
        this.H = x2;
        return x2;
    }

    public Set w() {
        return new KeySetView();
    }

    public Collection x() {
        return new ValuesView();
    }

    public Map y() {
        Object obj = this.f28035z;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int z(int i2) {
        return P()[i2];
    }
}
