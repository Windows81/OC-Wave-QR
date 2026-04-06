package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;

@Metadata
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {
    public static final Companion M = new Companion((DefaultConstructorMarker) null);
    public static final MapBuilder N;

    /* renamed from: A  reason: collision with root package name */
    public Object[] f40659A;

    /* renamed from: B  reason: collision with root package name */
    public int[] f40660B;
    public int[] C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public MapBuilderKeys I;
    public MapBuilderValues J;
    public MapBuilderEntries K;
    public boolean L;

    /* renamed from: z  reason: collision with root package name */
    public Object[] f40661z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int c(int i2) {
            return Integer.highestOneBit(RangesKt.e(i2, 1) * 3);
        }

        public final int d(int i2) {
            return Integer.numberOfLeadingZeros(i2) + 1;
        }

        public final MapBuilder e() {
            return MapBuilder.N;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EntriesItr(MapBuilder mapBuilder) {
            super(mapBuilder);
            Intrinsics.i(mapBuilder, "map");
        }

        /* renamed from: j */
        public EntryRef next() {
            b();
            if (c() < f().E) {
                int c2 = c();
                h(c2 + 1);
                i(c2);
                EntryRef entryRef = new EntryRef(f(), e());
                g();
                return entryRef;
            }
            throw new NoSuchElementException();
        }

        public final void k(StringBuilder sb) {
            Intrinsics.i(sb, "sb");
            if (c() < f().E) {
                int c2 = c();
                h(c2 + 1);
                i(c2);
                Object obj = f().f40661z[e()];
                if (obj == f()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] h2 = f().f40659A;
                Intrinsics.f(h2);
                Object obj2 = h2[e()];
                if (obj2 == f()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                g();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int m() {
            if (c() < f().E) {
                int c2 = c();
                h(c2 + 1);
                i(c2);
                Object obj = f().f40661z[e()];
                int i2 = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] h2 = f().f40659A;
                Intrinsics.f(h2);
                Object obj2 = h2[e()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = hashCode ^ i2;
                g();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* renamed from: A  reason: collision with root package name */
        public final int f40662A;

        /* renamed from: B  reason: collision with root package name */
        public final int f40663B;

        /* renamed from: z  reason: collision with root package name */
        public final MapBuilder f40664z;

        public EntryRef(MapBuilder mapBuilder, int i2) {
            Intrinsics.i(mapBuilder, "map");
            this.f40664z = mapBuilder;
            this.f40662A = i2;
            this.f40663B = mapBuilder.G;
        }

        private final void a() {
            if (this.f40664z.G != this.f40663B) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return Intrinsics.d(entry.getKey(), getKey()) && Intrinsics.d(entry.getValue(), getValue());
            }
        }

        public Object getKey() {
            a();
            return this.f40664z.f40661z[this.f40662A];
        }

        public Object getValue() {
            a();
            Object[] h2 = this.f40664z.f40659A;
            Intrinsics.f(h2);
            return h2[this.f40662A];
        }

        public int hashCode() {
            Object key = getKey();
            int i2 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return hashCode ^ i2;
        }

        public Object setValue(Object obj) {
            a();
            this.f40664z.n();
            Object[] a2 = this.f40664z.k();
            int i2 = this.f40662A;
            Object obj2 = a2[i2];
            a2[i2] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @Metadata
    public static class Itr<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public int f40665A;

        /* renamed from: B  reason: collision with root package name */
        public int f40666B = -1;
        public int C;

        /* renamed from: z  reason: collision with root package name */
        public final MapBuilder f40667z;

        public Itr(MapBuilder mapBuilder) {
            Intrinsics.i(mapBuilder, "map");
            this.f40667z = mapBuilder;
            this.C = mapBuilder.G;
            g();
        }

        public final void b() {
            if (this.f40667z.G != this.C) {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.f40665A;
        }

        public final int e() {
            return this.f40666B;
        }

        public final MapBuilder f() {
            return this.f40667z;
        }

        public final void g() {
            while (this.f40665A < this.f40667z.E) {
                int[] g2 = this.f40667z.f40660B;
                int i2 = this.f40665A;
                if (g2[i2] < 0) {
                    this.f40665A = i2 + 1;
                } else {
                    return;
                }
            }
        }

        public final void h(int i2) {
            this.f40665A = i2;
        }

        public final boolean hasNext() {
            return this.f40665A < this.f40667z.E;
        }

        public final void i(int i2) {
            this.f40666B = i2;
        }

        public final void remove() {
            b();
            if (this.f40666B != -1) {
                this.f40667z.n();
                this.f40667z.M(this.f40666B);
                this.f40666B = -1;
                this.C = this.f40667z.G;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
    }

    @Metadata
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public KeysItr(MapBuilder mapBuilder) {
            super(mapBuilder);
            Intrinsics.i(mapBuilder, "map");
        }

        public Object next() {
            b();
            if (c() < f().E) {
                int c2 = c();
                h(c2 + 1);
                i(c2);
                Object obj = f().f40661z[e()];
                g();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ValuesItr(MapBuilder mapBuilder) {
            super(mapBuilder);
            Intrinsics.i(mapBuilder, "map");
        }

        public Object next() {
            b();
            if (c() < f().E) {
                int c2 = c();
                h(c2 + 1);
                i(c2);
                Object[] h2 = f().f40659A;
                Intrinsics.f(h2);
                Object obj = h2[e()];
                g();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.L = true;
        N = mapBuilder;
    }

    public MapBuilder(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i2, int i3) {
        this.f40661z = objArr;
        this.f40659A = objArr2;
        this.f40660B = iArr;
        this.C = iArr2;
        this.D = i2;
        this.E = i3;
        this.F = M.d(z());
    }

    private final void J() {
        this.G++;
    }

    private final void s(int i2) {
        if (i2 < 0) {
            throw new OutOfMemoryError();
        } else if (i2 > x()) {
            int e2 = AbstractList.f40564z.e(x(), i2);
            this.f40661z = ListBuilderKt.e(this.f40661z, e2);
            Object[] objArr = this.f40659A;
            this.f40659A = objArr != null ? ListBuilderKt.e(objArr, e2) : null;
            int[] copyOf = Arrays.copyOf(this.f40660B, e2);
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f40660B = copyOf;
            int a2 = M.c(e2);
            if (a2 > z()) {
                K(a2);
            }
        }
    }

    private final void t(int i2) {
        if (R(i2)) {
            o(true);
        } else {
            s(this.E + i2);
        }
    }

    public Set A() {
        MapBuilderKeys mapBuilderKeys = this.I;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys mapBuilderKeys2 = new MapBuilderKeys(this);
        this.I = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    public int B() {
        return this.H;
    }

    public Collection C() {
        MapBuilderValues mapBuilderValues = this.J;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues mapBuilderValues2 = new MapBuilderValues(this);
        this.J = mapBuilderValues2;
        return mapBuilderValues2;
    }

    public final int D(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * -1640531527) >>> this.F;
    }

    public final KeysItr E() {
        return new KeysItr(this);
    }

    public final boolean F(Collection collection) {
        boolean z2 = false;
        if (collection.isEmpty()) {
            return false;
        }
        t(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (G((Map.Entry) it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    public final boolean G(Map.Entry entry) {
        int j2 = j(entry.getKey());
        Object[] k2 = k();
        if (j2 >= 0) {
            k2[j2] = entry.getValue();
            return true;
        }
        int i2 = (-j2) - 1;
        if (Intrinsics.d(entry.getValue(), k2[i2])) {
            return false;
        }
        k2[i2] = entry.getValue();
        return true;
    }

    public final boolean I(int i2) {
        int D2 = D(this.f40661z[i2]);
        int i3 = this.D;
        while (true) {
            int[] iArr = this.C;
            if (iArr[D2] == 0) {
                iArr[D2] = i2 + 1;
                this.f40660B[i2] = D2;
                return true;
            }
            i3--;
            if (i3 < 0) {
                return false;
            }
            D2 = D2 == 0 ? z() - 1 : D2 - 1;
        }
    }

    public final void K(int i2) {
        J();
        int i3 = 0;
        if (this.E > size()) {
            o(false);
        }
        this.C = new int[i2];
        this.F = M.d(i2);
        while (i3 < this.E) {
            int i4 = i3 + 1;
            if (I(i3)) {
                i3 = i4;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final boolean L(Map.Entry entry) {
        Intrinsics.i(entry, "entry");
        n();
        int v2 = v(entry.getKey());
        if (v2 < 0) {
            return false;
        }
        Object[] objArr = this.f40659A;
        Intrinsics.f(objArr);
        if (!Intrinsics.d(objArr[v2], entry.getValue())) {
            return false;
        }
        M(v2);
        return true;
    }

    public final void M(int i2) {
        ListBuilderKt.f(this.f40661z, i2);
        Object[] objArr = this.f40659A;
        if (objArr != null) {
            ListBuilderKt.f(objArr, i2);
        }
        N(this.f40660B[i2]);
        this.f40660B[i2] = -1;
        this.H = size() - 1;
        J();
    }

    public final void N(int i2) {
        int j2 = RangesKt.j(this.D * 2, z() / 2);
        int i3 = 0;
        int i4 = i2;
        do {
            i2 = i2 == 0 ? z() - 1 : i2 - 1;
            i3++;
            if (i3 > this.D) {
                this.C[i4] = 0;
                return;
            }
            int[] iArr = this.C;
            int i5 = iArr[i2];
            if (i5 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i4] = -1;
            } else {
                int i6 = i5 - 1;
                if (((D(this.f40661z[i6]) - i2) & (z() - 1)) >= i3) {
                    this.C[i4] = i5;
                    this.f40660B[i6] = i4;
                }
                j2--;
            }
            i4 = i2;
            i3 = 0;
            j2--;
        } while (j2 >= 0);
        this.C[i4] = -1;
    }

    public final boolean P(Object obj) {
        n();
        int v2 = v(obj);
        if (v2 < 0) {
            return false;
        }
        M(v2);
        return true;
    }

    public final boolean Q(Object obj) {
        n();
        int w2 = w(obj);
        if (w2 < 0) {
            return false;
        }
        M(w2);
        return true;
    }

    public final boolean R(int i2) {
        int x2 = x();
        int i3 = this.E;
        int i4 = x2 - i3;
        int size = i3 - size();
        return i4 < i2 && i4 + size >= i2 && size >= x() / 4;
    }

    public final ValuesItr S() {
        return new ValuesItr(this);
    }

    public void clear() {
        n();
        int i2 = this.E - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.f40660B;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.C[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        ListBuilderKt.g(this.f40661z, 0, this.E);
        Object[] objArr = this.f40659A;
        if (objArr != null) {
            ListBuilderKt.g(objArr, 0, this.E);
        }
        this.H = 0;
        this.E = 0;
        J();
    }

    public boolean containsKey(Object obj) {
        return v(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return w(obj) >= 0;
    }

    public final /* bridge */ Set entrySet() {
        return y();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && r((Map) obj));
    }

    public Object get(Object obj) {
        int v2 = v(obj);
        if (v2 < 0) {
            return null;
        }
        Object[] objArr = this.f40659A;
        Intrinsics.f(objArr);
        return objArr[v2];
    }

    public int hashCode() {
        EntriesItr u2 = u();
        int i2 = 0;
        while (u2.hasNext()) {
            i2 += u2.m();
        }
        return i2;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        n();
        while (true) {
            int D2 = D(obj);
            int j2 = RangesKt.j(this.D * 2, z() / 2);
            int i2 = 0;
            while (true) {
                int i3 = this.C[D2];
                if (i3 <= 0) {
                    if (this.E >= x()) {
                        t(1);
                    } else {
                        int i4 = this.E;
                        int i5 = i4 + 1;
                        this.E = i5;
                        this.f40661z[i4] = obj;
                        this.f40660B[i4] = D2;
                        this.C[D2] = i5;
                        this.H = size() + 1;
                        J();
                        if (i2 > this.D) {
                            this.D = i2;
                        }
                        return i4;
                    }
                } else if (Intrinsics.d(this.f40661z[i3 - 1], obj)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > j2) {
                        K(z() * 2);
                        break;
                    }
                    D2 = D2 == 0 ? z() - 1 : D2 - 1;
                }
            }
        }
    }

    public final Object[] k() {
        Object[] objArr = this.f40659A;
        if (objArr != null) {
            return objArr;
        }
        Object[] d2 = ListBuilderKt.d(x());
        this.f40659A = d2;
        return d2;
    }

    public final /* bridge */ Set keySet() {
        return A();
    }

    public final Map m() {
        n();
        this.L = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = N;
        Intrinsics.g(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void n() {
        if (this.L) {
            throw new UnsupportedOperationException();
        }
    }

    public final void o(boolean z2) {
        int i2;
        Object[] objArr = this.f40659A;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.E;
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.f40660B;
            int i5 = iArr[i3];
            if (i5 >= 0) {
                Object[] objArr2 = this.f40661z;
                objArr2[i4] = objArr2[i3];
                if (objArr != null) {
                    objArr[i4] = objArr[i3];
                }
                if (z2) {
                    iArr[i4] = i5;
                    this.C[i5] = i4 + 1;
                }
                i4++;
            }
            i3++;
        }
        ListBuilderKt.g(this.f40661z, i4, i2);
        if (objArr != null) {
            ListBuilderKt.g(objArr, i4, this.E);
        }
        this.E = i4;
    }

    public final boolean p(Collection collection) {
        Intrinsics.i(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!q((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public Object put(Object obj, Object obj2) {
        n();
        int j2 = j(obj);
        Object[] k2 = k();
        if (j2 < 0) {
            int i2 = (-j2) - 1;
            Object obj3 = k2[i2];
            k2[i2] = obj2;
            return obj3;
        }
        k2[j2] = obj2;
        return null;
    }

    public void putAll(Map map) {
        Intrinsics.i(map, "from");
        n();
        F(map.entrySet());
    }

    public final boolean q(Map.Entry entry) {
        Intrinsics.i(entry, "entry");
        int v2 = v(entry.getKey());
        if (v2 < 0) {
            return false;
        }
        Object[] objArr = this.f40659A;
        Intrinsics.f(objArr);
        return Intrinsics.d(objArr[v2], entry.getValue());
    }

    public final boolean r(Map map) {
        return size() == map.size() && p(map.entrySet());
    }

    public Object remove(Object obj) {
        n();
        int v2 = v(obj);
        if (v2 < 0) {
            return null;
        }
        Object[] objArr = this.f40659A;
        Intrinsics.f(objArr);
        Object obj2 = objArr[v2];
        M(v2);
        return obj2;
    }

    public final /* bridge */ int size() {
        return B();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        EntriesItr u2 = u();
        int i2 = 0;
        while (u2.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            u2.k(sb);
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public final EntriesItr u() {
        return new EntriesItr(this);
    }

    public final int v(Object obj) {
        int D2 = D(obj);
        int i2 = this.D;
        while (true) {
            int i3 = this.C[D2];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (Intrinsics.d(this.f40661z[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            D2 = D2 == 0 ? z() - 1 : D2 - 1;
        }
    }

    public final /* bridge */ Collection values() {
        return C();
    }

    public final int w(Object obj) {
        int i2 = this.E;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f40660B[i2] >= 0) {
                Object[] objArr = this.f40659A;
                Intrinsics.f(objArr);
                if (Intrinsics.d(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    public final int x() {
        return this.f40661z.length;
    }

    public Set y() {
        MapBuilderEntries mapBuilderEntries = this.K;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries mapBuilderEntries2 = new MapBuilderEntries(this);
        this.K = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    public final int z() {
        return this.C.length;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i2) {
        this(ListBuilderKt.d(i2), (Object[]) null, new int[i2], new int[M.c(i2)], 2, 0);
    }
}
