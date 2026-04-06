package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public transient Object[] f28116A;

    /* renamed from: B  reason: collision with root package name */
    public transient int f28117B;
    public transient int C;
    public transient int[] D;
    public transient int[] E;
    public transient int[] F;
    public transient int[] G;
    public transient int H;
    public transient int I;
    public transient int[] J;
    public transient int[] K;
    public transient Set L;
    public transient Set M;
    public transient Set N;
    public transient BiMap O;

    /* renamed from: z  reason: collision with root package name */
    public transient Object[] f28118z;

    public final class EntryForKey extends AbstractMapEntry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public int f28119A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28121z;

        public EntryForKey(int i2) {
            this.f28121z = NullnessCasts.a(HashBiMap.this.f28118z[i2]);
            this.f28119A = i2;
        }

        public void a() {
            int i2 = this.f28119A;
            if (i2 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i2 <= hashBiMap.f28117B && Objects.a(hashBiMap.f28118z[i2], this.f28121z)) {
                    return;
                }
            }
            this.f28119A = HashBiMap.this.n(this.f28121z);
        }

        public Object getKey() {
            return this.f28121z;
        }

        public Object getValue() {
            a();
            int i2 = this.f28119A;
            return i2 == -1 ? NullnessCasts.b() : NullnessCasts.a(HashBiMap.this.f28116A[i2]);
        }

        public Object setValue(Object obj) {
            a();
            int i2 = this.f28119A;
            if (i2 == -1) {
                HashBiMap.this.put(this.f28121z, obj);
                return NullnessCasts.b();
            }
            Object a2 = NullnessCasts.a(HashBiMap.this.f28116A[i2]);
            if (Objects.a(a2, obj)) {
                return obj;
            }
            HashBiMap.this.D(this.f28119A, obj, false);
            return a2;
        }
    }

    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {

        /* renamed from: A  reason: collision with root package name */
        public final Object f28122A;

        /* renamed from: B  reason: collision with root package name */
        public int f28123B;

        /* renamed from: z  reason: collision with root package name */
        public final HashBiMap f28124z;

        public EntryForValue(HashBiMap hashBiMap, int i2) {
            this.f28124z = hashBiMap;
            this.f28122A = NullnessCasts.a(hashBiMap.f28116A[i2]);
            this.f28123B = i2;
        }

        private void a() {
            int i2 = this.f28123B;
            if (i2 != -1) {
                HashBiMap hashBiMap = this.f28124z;
                if (i2 <= hashBiMap.f28117B && Objects.a(this.f28122A, hashBiMap.f28116A[i2])) {
                    return;
                }
            }
            this.f28123B = this.f28124z.p(this.f28122A);
        }

        public Object getKey() {
            return this.f28122A;
        }

        public Object getValue() {
            a();
            int i2 = this.f28123B;
            return i2 == -1 ? NullnessCasts.b() : NullnessCasts.a(this.f28124z.f28118z[i2]);
        }

        public Object setValue(Object obj) {
            a();
            int i2 = this.f28123B;
            if (i2 == -1) {
                this.f28124z.w(this.f28122A, obj, false);
                return NullnessCasts.b();
            }
            Object a2 = NullnessCasts.a(this.f28124z.f28118z[i2]);
            if (Objects.a(a2, obj)) {
                return obj;
            }
            this.f28124z.C(this.f28123B, obj, false);
            return a2;
        }
    }

    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        public EntrySet() {
            super(HashBiMap.this);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int n2 = HashBiMap.this.n(key);
            return n2 != -1 && Objects.a(value, HashBiMap.this.f28116A[n2]);
        }

        /* renamed from: g */
        public Map.Entry e(int i2) {
            return new EntryForKey(i2);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d2 = Hashing.d(key);
            int o2 = HashBiMap.this.o(key, d2);
            if (o2 == -1 || !Objects.a(value, HashBiMap.this.f28116A[o2])) {
                return false;
            }
            HashBiMap.this.z(o2, d2);
            return true;
        }
    }

    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public transient Set f28126A;

        /* renamed from: z  reason: collision with root package name */
        public final HashBiMap f28127z;

        public Inverse(HashBiMap hashBiMap) {
            this.f28127z = hashBiMap;
        }

        public void clear() {
            this.f28127z.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f28127z.containsValue(obj);
        }

        public boolean containsValue(Object obj) {
            return this.f28127z.containsKey(obj);
        }

        public Set entrySet() {
            Set set = this.f28126A;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.f28127z);
            this.f28126A = inverseEntrySet;
            return inverseEntrySet;
        }

        public Object get(Object obj) {
            return this.f28127z.r(obj);
        }

        public Set keySet() {
            return this.f28127z.values();
        }

        public Object put(Object obj, Object obj2) {
            return this.f28127z.w(obj, obj2, false);
        }

        public BiMap q1() {
            return this.f28127z;
        }

        public Object remove(Object obj) {
            return this.f28127z.B(obj);
        }

        public int size() {
            return this.f28127z.f28117B;
        }

        public Set values() {
            return this.f28127z.keySet();
        }
    }

    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        public InverseEntrySet(HashBiMap hashBiMap) {
            super(hashBiMap);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int p2 = this.f28130z.p(key);
            return p2 != -1 && Objects.a(this.f28130z.f28118z[p2], value);
        }

        /* renamed from: g */
        public Map.Entry e(int i2) {
            return new EntryForValue(this.f28130z, i2);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d2 = Hashing.d(key);
            int q2 = this.f28130z.q(key, d2);
            if (q2 == -1 || !Objects.a(this.f28130z.f28118z[q2], value)) {
                return false;
            }
            this.f28130z.A(q2, d2);
            return true;
        }
    }

    public final class KeySet extends View<K, V, K> {
        public KeySet() {
            super(HashBiMap.this);
        }

        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        public Object e(int i2) {
            return NullnessCasts.a(HashBiMap.this.f28118z[i2]);
        }

        public boolean remove(Object obj) {
            int d2 = Hashing.d(obj);
            int o2 = HashBiMap.this.o(obj, d2);
            if (o2 == -1) {
                return false;
            }
            HashBiMap.this.z(o2, d2);
            return true;
        }
    }

    public final class ValueSet extends View<K, V, V> {
        public ValueSet() {
            super(HashBiMap.this);
        }

        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        public Object e(int i2) {
            return NullnessCasts.a(HashBiMap.this.f28116A[i2]);
        }

        public boolean remove(Object obj) {
            int d2 = Hashing.d(obj);
            int q2 = HashBiMap.this.q(obj, d2);
            if (q2 == -1) {
                return false;
            }
            HashBiMap.this.A(q2, d2);
            return true;
        }
    }

    public static abstract class View<K, V, T> extends AbstractSet<T> {

        /* renamed from: z  reason: collision with root package name */
        public final HashBiMap f28130z;

        public View(HashBiMap hashBiMap) {
            this.f28130z = hashBiMap;
        }

        public void clear() {
            this.f28130z.clear();
        }

        public abstract Object e(int i2);

        public Iterator iterator() {
            return new Iterator<T>() {

                /* renamed from: A  reason: collision with root package name */
                public int f28131A = -1;

                /* renamed from: B  reason: collision with root package name */
                public int f28132B;
                public int C;

                /* renamed from: z  reason: collision with root package name */
                public int f28133z;

                {
                    this.f28133z = View.this.f28130z.H;
                    HashBiMap hashBiMap = View.this.f28130z;
                    this.f28132B = hashBiMap.C;
                    this.C = hashBiMap.f28117B;
                }

                public final void b() {
                    if (View.this.f28130z.C != this.f28132B) {
                        throw new ConcurrentModificationException();
                    }
                }

                public boolean hasNext() {
                    b();
                    return this.f28133z != -2 && this.C > 0;
                }

                public Object next() {
                    if (hasNext()) {
                        Object e2 = View.this.e(this.f28133z);
                        this.f28131A = this.f28133z;
                        this.f28133z = View.this.f28130z.K[this.f28133z];
                        this.C--;
                        return e2;
                    }
                    throw new NoSuchElementException();
                }

                public void remove() {
                    b();
                    CollectPreconditions.e(this.f28131A != -1);
                    View.this.f28130z.x(this.f28131A);
                    int i2 = this.f28133z;
                    HashBiMap hashBiMap = View.this.f28130z;
                    if (i2 == hashBiMap.f28117B) {
                        this.f28133z = this.f28131A;
                    }
                    this.f28131A = -1;
                    this.f28132B = hashBiMap.C;
                }
            };
        }

        public int size() {
            return this.f28130z.f28117B;
        }
    }

    public static int[] g(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static int[] k(int[] iArr, int i2) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i2);
        Arrays.fill(copyOf, length, i2, -1);
        return copyOf;
    }

    public void A(int i2, int i3) {
        y(i2, Hashing.d(this.f28118z[i2]), i3);
    }

    public Object B(Object obj) {
        int d2 = Hashing.d(obj);
        int q2 = q(obj, d2);
        if (q2 == -1) {
            return null;
        }
        Object obj2 = this.f28118z[q2];
        A(q2, d2);
        return obj2;
    }

    public final void C(int i2, Object obj, boolean z2) {
        int i3;
        Preconditions.d(i2 != -1);
        int d2 = Hashing.d(obj);
        int o2 = o(obj, d2);
        int i4 = this.I;
        if (o2 == -1) {
            i3 = -2;
        } else if (z2) {
            i4 = this.J[o2];
            i3 = this.K[o2];
            z(o2, d2);
            if (i2 == this.f28117B) {
                i2 = o2;
            }
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 28);
            sb.append("Key already present in map: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i4 == i2) {
            i4 = this.J[i2];
        } else if (i4 == this.f28117B) {
            i4 = o2;
        }
        if (i3 == i2) {
            o2 = this.K[i2];
        } else if (i3 != this.f28117B) {
            o2 = i3;
        }
        E(this.J[i2], this.K[i2]);
        h(i2, Hashing.d(this.f28118z[i2]));
        this.f28118z[i2] = obj;
        s(i2, Hashing.d(obj));
        E(i4, i2);
        E(i2, o2);
    }

    public final void D(int i2, Object obj, boolean z2) {
        Preconditions.d(i2 != -1);
        int d2 = Hashing.d(obj);
        int q2 = q(obj, d2);
        if (q2 != -1) {
            if (z2) {
                A(q2, d2);
                if (i2 == this.f28117B) {
                    i2 = q2;
                }
            } else {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                sb.append("Value already present in map: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        i(i2, Hashing.d(this.f28116A[i2]));
        this.f28116A[i2] = obj;
        t(i2, d2);
    }

    public final void E(int i2, int i3) {
        if (i2 == -2) {
            this.H = i3;
        } else {
            this.K[i2] = i3;
        }
        if (i3 == -2) {
            this.I = i2;
        } else {
            this.J[i3] = i2;
        }
    }

    public void clear() {
        Arrays.fill(this.f28118z, 0, this.f28117B, (Object) null);
        Arrays.fill(this.f28116A, 0, this.f28117B, (Object) null);
        Arrays.fill(this.D, -1);
        Arrays.fill(this.E, -1);
        Arrays.fill(this.F, 0, this.f28117B, -1);
        Arrays.fill(this.G, 0, this.f28117B, -1);
        Arrays.fill(this.J, 0, this.f28117B, -1);
        Arrays.fill(this.K, 0, this.f28117B, -1);
        this.f28117B = 0;
        this.H = -2;
        this.I = -2;
        this.C++;
    }

    public boolean containsKey(Object obj) {
        return n(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        return p(obj) != -1;
    }

    public Set entrySet() {
        Set set = this.N;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.N = entrySet;
        return entrySet;
    }

    public final int f(int i2) {
        return i2 & (this.D.length - 1);
    }

    public Object get(Object obj) {
        int n2 = n(obj);
        if (n2 == -1) {
            return null;
        }
        return this.f28116A[n2];
    }

    public final void h(int i2, int i3) {
        Preconditions.d(i2 != -1);
        int f2 = f(i3);
        int[] iArr = this.D;
        int i4 = iArr[f2];
        if (i4 == i2) {
            int[] iArr2 = this.F;
            iArr[f2] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.F[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            int i7 = i6;
            if (i4 == -1) {
                String valueOf = String.valueOf(this.f28118z[i2]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            } else if (i4 == i2) {
                int[] iArr3 = this.F;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            } else {
                i5 = this.F[i4];
            }
        }
    }

    public final void i(int i2, int i3) {
        Preconditions.d(i2 != -1);
        int f2 = f(i3);
        int[] iArr = this.E;
        int i4 = iArr[f2];
        if (i4 == i2) {
            int[] iArr2 = this.G;
            iArr[f2] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.G[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            int i7 = i6;
            if (i4 == -1) {
                String valueOf = String.valueOf(this.f28116A[i2]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            } else if (i4 == i2) {
                int[] iArr3 = this.G;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            } else {
                i5 = this.G[i4];
            }
        }
    }

    public final void j(int i2) {
        int[] iArr = this.F;
        if (iArr.length < i2) {
            int d2 = ImmutableCollection.Builder.d(iArr.length, i2);
            this.f28118z = Arrays.copyOf(this.f28118z, d2);
            this.f28116A = Arrays.copyOf(this.f28116A, d2);
            this.F = k(this.F, d2);
            this.G = k(this.G, d2);
            this.J = k(this.J, d2);
            this.K = k(this.K, d2);
        }
        if (this.D.length < i2) {
            int a2 = Hashing.a(i2, 1.0d);
            this.D = g(a2);
            this.E = g(a2);
            for (int i3 = 0; i3 < this.f28117B; i3++) {
                int f2 = f(Hashing.d(this.f28118z[i3]));
                int[] iArr2 = this.F;
                int[] iArr3 = this.D;
                iArr2[i3] = iArr3[f2];
                iArr3[f2] = i3;
                int f3 = f(Hashing.d(this.f28116A[i3]));
                int[] iArr4 = this.G;
                int[] iArr5 = this.E;
                iArr4[i3] = iArr5[f3];
                iArr5[f3] = i3;
            }
        }
    }

    public Set keySet() {
        Set set = this.L;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.L = keySet;
        return keySet;
    }

    public int m(Object obj, int i2, int[] iArr, int[] iArr2, Object[] objArr) {
        int i3 = iArr[f(i2)];
        while (i3 != -1) {
            if (Objects.a(objArr[i3], obj)) {
                return i3;
            }
            i3 = iArr2[i3];
        }
        return -1;
    }

    public int n(Object obj) {
        return o(obj, Hashing.d(obj));
    }

    public int o(Object obj, int i2) {
        return m(obj, i2, this.D, this.F, this.f28118z);
    }

    public int p(Object obj) {
        return q(obj, Hashing.d(obj));
    }

    public Object put(Object obj, Object obj2) {
        return v(obj, obj2, false);
    }

    public int q(Object obj, int i2) {
        return m(obj, i2, this.E, this.G, this.f28116A);
    }

    public BiMap q1() {
        BiMap biMap = this.O;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.O = inverse;
        return inverse;
    }

    public Object r(Object obj) {
        int p2 = p(obj);
        if (p2 == -1) {
            return null;
        }
        return this.f28118z[p2];
    }

    public Object remove(Object obj) {
        int d2 = Hashing.d(obj);
        int o2 = o(obj, d2);
        if (o2 == -1) {
            return null;
        }
        Object obj2 = this.f28116A[o2];
        z(o2, d2);
        return obj2;
    }

    public final void s(int i2, int i3) {
        Preconditions.d(i2 != -1);
        int f2 = f(i3);
        int[] iArr = this.F;
        int[] iArr2 = this.D;
        iArr[i2] = iArr2[f2];
        iArr2[f2] = i2;
    }

    public int size() {
        return this.f28117B;
    }

    public final void t(int i2, int i3) {
        Preconditions.d(i2 != -1);
        int f2 = f(i3);
        int[] iArr = this.G;
        int[] iArr2 = this.E;
        iArr[i2] = iArr2[f2];
        iArr2[f2] = i2;
    }

    public final void u(int i2, int i3) {
        int i4;
        int i5;
        if (i2 != i3) {
            int i6 = this.J[i2];
            int i7 = this.K[i2];
            E(i6, i3);
            E(i3, i7);
            Object[] objArr = this.f28118z;
            Object obj = objArr[i2];
            Object[] objArr2 = this.f28116A;
            Object obj2 = objArr2[i2];
            objArr[i3] = obj;
            objArr2[i3] = obj2;
            int f2 = f(Hashing.d(obj));
            int[] iArr = this.D;
            int i8 = iArr[f2];
            if (i8 == i2) {
                iArr[f2] = i3;
            } else {
                int i9 = this.F[i8];
                while (true) {
                    int i10 = i8;
                    i8 = i9;
                    i5 = i10;
                    if (i8 == i2) {
                        break;
                    }
                    i9 = this.F[i8];
                }
                this.F[i5] = i3;
            }
            int[] iArr2 = this.F;
            iArr2[i3] = iArr2[i2];
            iArr2[i2] = -1;
            int f3 = f(Hashing.d(obj2));
            int[] iArr3 = this.E;
            int i11 = iArr3[f3];
            if (i11 == i2) {
                iArr3[f3] = i3;
            } else {
                int i12 = this.G[i11];
                while (true) {
                    int i13 = i11;
                    i11 = i12;
                    i4 = i13;
                    if (i11 == i2) {
                        break;
                    }
                    i12 = this.G[i11];
                }
                this.G[i4] = i3;
            }
            int[] iArr4 = this.G;
            iArr4[i3] = iArr4[i2];
            iArr4[i2] = -1;
        }
    }

    public Object v(Object obj, Object obj2, boolean z2) {
        int d2 = Hashing.d(obj);
        int o2 = o(obj, d2);
        if (o2 != -1) {
            Object obj3 = this.f28116A[o2];
            if (Objects.a(obj3, obj2)) {
                return obj2;
            }
            D(o2, obj2, z2);
            return obj3;
        }
        int d3 = Hashing.d(obj2);
        int q2 = q(obj2, d3);
        if (!z2) {
            Preconditions.j(q2 == -1, "Value already present: %s", obj2);
        } else if (q2 != -1) {
            A(q2, d3);
        }
        j(this.f28117B + 1);
        Object[] objArr = this.f28118z;
        int i2 = this.f28117B;
        objArr[i2] = obj;
        this.f28116A[i2] = obj2;
        s(i2, d2);
        t(this.f28117B, d3);
        E(this.I, this.f28117B);
        E(this.f28117B, -2);
        this.f28117B++;
        this.C++;
        return null;
    }

    public Object w(Object obj, Object obj2, boolean z2) {
        int d2 = Hashing.d(obj);
        int q2 = q(obj, d2);
        if (q2 != -1) {
            Object obj3 = this.f28118z[q2];
            if (Objects.a(obj3, obj2)) {
                return obj2;
            }
            C(q2, obj2, z2);
            return obj3;
        }
        int i2 = this.I;
        int d3 = Hashing.d(obj2);
        int o2 = o(obj2, d3);
        if (!z2) {
            Preconditions.j(o2 == -1, "Key already present: %s", obj2);
        } else if (o2 != -1) {
            i2 = this.J[o2];
            z(o2, d3);
        }
        j(this.f28117B + 1);
        Object[] objArr = this.f28118z;
        int i3 = this.f28117B;
        objArr[i3] = obj2;
        this.f28116A[i3] = obj;
        s(i3, d3);
        t(this.f28117B, d2);
        int i4 = i2 == -2 ? this.H : this.K[i2];
        E(i2, this.f28117B);
        E(this.f28117B, i4);
        this.f28117B++;
        this.C++;
        return null;
    }

    public void x(int i2) {
        z(i2, Hashing.d(this.f28118z[i2]));
    }

    public final void y(int i2, int i3, int i4) {
        Preconditions.d(i2 != -1);
        h(i2, i3);
        i(i2, i4);
        E(this.J[i2], this.K[i2]);
        u(this.f28117B - 1, i2);
        Object[] objArr = this.f28118z;
        int i5 = this.f28117B;
        objArr[i5 - 1] = null;
        this.f28116A[i5 - 1] = null;
        this.f28117B = i5 - 1;
        this.C++;
    }

    public void z(int i2, int i3) {
        y(i2, i3, Hashing.d(this.f28116A[i2]));
    }

    public Set values() {
        Set set = this.M;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.M = valueSet;
        return valueSet;
    }
}
