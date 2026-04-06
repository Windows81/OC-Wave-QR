package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry[] C = new Map.Entry[0];

    /* renamed from: A  reason: collision with root package name */
    public transient ImmutableSet f28147A;

    /* renamed from: B  reason: collision with root package name */
    public transient ImmutableCollection f28148B;

    /* renamed from: z  reason: collision with root package name */
    public transient ImmutableSet f28149z;

    @DoNotMock
    public static class Builder<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Comparator f28151a;

        /* renamed from: b  reason: collision with root package name */
        public Object[] f28152b;

        /* renamed from: c  reason: collision with root package name */
        public int f28153c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28154d;

        /* renamed from: e  reason: collision with root package name */
        public DuplicateKey f28155e;

        public static final class DuplicateKey {

            /* renamed from: a  reason: collision with root package name */
            public final Object f28156a;

            /* renamed from: b  reason: collision with root package name */
            public final Object f28157b;

            /* renamed from: c  reason: collision with root package name */
            public final Object f28158c;

            public DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.f28156a = obj;
                this.f28157b = obj2;
                this.f28158c = obj3;
            }

            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f28156a);
                String valueOf2 = String.valueOf(this.f28157b);
                String valueOf3 = String.valueOf(this.f28156a);
                String valueOf4 = String.valueOf(this.f28158c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public Builder() {
            this(4);
        }

        private void e(int i2) {
            int i3 = i2 * 2;
            Object[] objArr = this.f28152b;
            if (i3 > objArr.length) {
                this.f28152b = Arrays.copyOf(objArr, ImmutableCollection.Builder.d(objArr.length, i3));
                this.f28154d = false;
            }
        }

        public static void k(Object[] objArr, int i2, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 2;
                Object obj = objArr[i4];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i4 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i3] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i2, Ordering.a(comparator).i(Maps.W()));
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i5 * 2;
                objArr[i6] = entryArr[i5].getKey();
                objArr[i6 + 1] = entryArr[i5].getValue();
            }
        }

        public ImmutableMap a() {
            return d();
        }

        public final ImmutableMap b(boolean z2) {
            Object[] objArr;
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (!z2 || (duplicateKey2 = this.f28155e) == null) {
                int i2 = this.f28153c;
                if (this.f28151a == null) {
                    objArr = this.f28152b;
                } else {
                    if (this.f28154d) {
                        this.f28152b = Arrays.copyOf(this.f28152b, i2 * 2);
                    }
                    objArr = this.f28152b;
                    if (!z2) {
                        objArr = f(objArr, this.f28153c);
                        if (objArr.length < this.f28152b.length) {
                            i2 = objArr.length >>> 1;
                        }
                    }
                    k(objArr, i2, this.f28151a);
                }
                this.f28154d = true;
                RegularImmutableMap s2 = RegularImmutableMap.s(i2, objArr, this);
                if (!z2 || (duplicateKey = this.f28155e) == null) {
                    return s2;
                }
                throw duplicateKey.a();
            }
            throw duplicateKey2.a();
        }

        public ImmutableMap c() {
            return b(false);
        }

        public ImmutableMap d() {
            return b(true);
        }

        public final Object[] f(Object[] objArr, int i2) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                Object obj = objArr[i3 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i3);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[((i2 - bitSet.cardinality()) * 2)];
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2 * 2) {
                if (bitSet.get(i4 >>> 1)) {
                    i4 += 2;
                } else {
                    int i6 = i5 + 1;
                    int i7 = i4 + 1;
                    Object obj2 = objArr[i4];
                    Objects.requireNonNull(obj2);
                    objArr2[i5] = obj2;
                    i5 += 2;
                    i4 += 2;
                    Object obj3 = objArr[i7];
                    Objects.requireNonNull(obj3);
                    objArr2[i6] = obj3;
                }
            }
            return objArr2;
        }

        public Builder g(Object obj, Object obj2) {
            e(this.f28153c + 1);
            CollectPreconditions.a(obj, obj2);
            Object[] objArr = this.f28152b;
            int i2 = this.f28153c;
            objArr[i2 * 2] = obj;
            objArr[(i2 * 2) + 1] = obj2;
            this.f28153c = i2 + 1;
            return this;
        }

        public Builder h(Map.Entry entry) {
            return g(entry.getKey(), entry.getValue());
        }

        public Builder i(Iterable iterable) {
            if (iterable instanceof Collection) {
                e(this.f28153c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                h((Map.Entry) it.next());
            }
            return this;
        }

        public Builder j(Map map) {
            return i(map.entrySet());
        }

        public Builder(int i2) {
            this.f28152b = new Object[(i2 * 2)];
            this.f28153c = 0;
            this.f28154d = false;
        }
    }

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        public /* bridge */ /* synthetic */ Set entrySet() {
            return ImmutableMap.super.entrySet();
        }

        public ImmutableSet f() {
            return new ImmutableMapEntrySet<K, V>() {
                public ImmutableMap K() {
                    return IteratorBasedImmutableMap.this;
                }

                /* renamed from: o */
                public UnmodifiableIterator iterator() {
                    return IteratorBasedImmutableMap.this.r();
                }
            };
        }

        public ImmutableSet g() {
            return new ImmutableMapKeySet(this);
        }

        public ImmutableCollection h() {
            return new ImmutableMapValues(this);
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return ImmutableMap.super.keySet();
        }

        public abstract UnmodifiableIterator r();

        public /* bridge */ /* synthetic */ Collection values() {
            return ImmutableMap.super.values();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        public final /* synthetic */ ImmutableMap D;

        public boolean containsKey(Object obj) {
            return this.D.containsKey(obj);
        }

        public ImmutableSet g() {
            return this.D.keySet();
        }

        public int hashCode() {
            return this.D.hashCode();
        }

        public boolean j() {
            return this.D.j();
        }

        public boolean k() {
            return this.D.k();
        }

        public UnmodifiableIterator r() {
            final UnmodifiableIterator o2 = this.D.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>>(this) {
                /* renamed from: b */
                public Map.Entry next() {
                    final Map.Entry entry = (Map.Entry) o2.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>(this) {
                        /* renamed from: a */
                        public ImmutableSet getValue() {
                            return ImmutableSet.E(entry.getValue());
                        }

                        public Object getKey() {
                            return entry.getKey();
                        }
                    };
                }

                public boolean hasNext() {
                    return o2.hasNext();
                }
            };
        }

        /* renamed from: s */
        public ImmutableSet get(Object obj) {
            Object obj2 = this.D.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.E(obj2);
        }

        public int size() {
            return this.D.size();
        }
    }

    public static class SerializedForm<K, V> implements Serializable {
    }

    public static Builder a() {
        return new Builder();
    }

    public static Builder b(int i2) {
        CollectPreconditions.b(i2, "expectedSize");
        return new Builder(i2);
    }

    public static ImmutableMap c(Iterable iterable) {
        Builder builder = new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        builder.i(iterable);
        return builder.a();
    }

    public static ImmutableMap e(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.k()) {
                return immutableMap;
            }
        }
        return c(map.entrySet());
    }

    public static ImmutableMap o() {
        return RegularImmutableMap.G;
    }

    public static ImmutableMap p(Object obj, Object obj2) {
        CollectPreconditions.a(obj, obj2);
        return RegularImmutableMap.r(1, new Object[]{obj, obj2});
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean equals(Object obj) {
        return Maps.o(this, obj);
    }

    public abstract ImmutableSet f();

    public abstract ImmutableSet g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract ImmutableCollection h();

    public int hashCode() {
        return Sets.f(entrySet());
    }

    /* renamed from: i */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.f28149z;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet f2 = f();
        this.f28149z = f2;
        return f2;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean j() {
        return false;
    }

    public abstract boolean k();

    public UnmodifiableIterator m() {
        final UnmodifiableIterator o2 = entrySet().iterator();
        return new UnmodifiableIterator<K>(this) {
            public boolean hasNext() {
                return o2.hasNext();
            }

            public Object next() {
                return ((Map.Entry) o2.next()).getKey();
            }
        };
    }

    /* renamed from: n */
    public ImmutableSet keySet() {
        ImmutableSet immutableSet = this.f28147A;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet g2 = g();
        this.f28147A = g2;
        return g2;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.f28148B;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection h2 = h();
        this.f28148B = h2;
        return h2;
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.K(this);
    }
}
