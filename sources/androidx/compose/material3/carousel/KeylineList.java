package androidx.compose.material3.carousel;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class KeylineList implements List<Keyline>, KMappedMarker {
    public static final Companion G = new Companion((DefaultConstructorMarker) null);
    public static final int H = 8;
    public static final KeylineList I = new KeylineList(CollectionsKt.m());

    /* renamed from: A  reason: collision with root package name */
    public final int f11937A;

    /* renamed from: B  reason: collision with root package name */
    public final int f11938B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f11939z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeylineList a() {
            return KeylineList.I;
        }

        public Companion() {
        }
    }

    public KeylineList(List list) {
        int i2;
        int i3;
        this.f11939z = list;
        Iterator it = iterator();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i5 = -1;
                break;
            } else if (((Keyline) it.next()).i()) {
                break;
            } else {
                i5++;
            }
        }
        this.f11937A = i5;
        Iterator it2 = iterator();
        int i6 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i6 = -1;
                break;
            } else if (!((Keyline) it2.next()).g()) {
                break;
            } else {
                i6++;
            }
        }
        this.f11938B = i6;
        ListIterator listIterator = listIterator(size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (!((Keyline) listIterator.previous()).g()) {
                    i3 = listIterator.nextIndex();
                    break;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        this.C = i3;
        Iterator it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                i4 = -1;
                break;
            } else if (((Keyline) it3.next()).h()) {
                break;
            } else {
                i4++;
            }
        }
        this.D = i4;
        ListIterator listIterator2 = listIterator(size());
        while (true) {
            if (listIterator2.hasPrevious()) {
                if (((Keyline) listIterator2.previous()).h()) {
                    i2 = listIterator2.nextIndex();
                    break;
                }
            } else {
                break;
            }
        }
        this.E = i2;
        this.F = (i2 - this.D) + 1;
    }

    public final int A() {
        return this.C;
    }

    public final Keyline B() {
        return get(this.f11937A);
    }

    public final int C() {
        return this.f11937A;
    }

    public int D() {
        return this.f11939z.size();
    }

    public int E(Keyline keyline) {
        return this.f11939z.indexOf(keyline);
    }

    public final boolean F() {
        return m().d() - (m().e() / ((float) 2)) >= 0.0f && Intrinsics.d(m(), o());
    }

    public final boolean J(float f2) {
        return v().d() + (v().e() / ((float) 2)) <= f2 && Intrinsics.d(v(), z());
    }

    public final int K(float f2) {
        Object obj;
        Iterator it = RangesKt.s(this.D - 1, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (get(((Number) obj).intValue()).e() == f2) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int L(Keyline keyline) {
        return this.f11939z.lastIndexOf(keyline);
    }

    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Keyline)) {
            return false;
        }
        return g((Keyline) obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f11939z.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeylineList)) {
            return false;
        }
        KeylineList keylineList = (KeylineList) obj;
        if (size() != keylineList.size()) {
            return false;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!Intrinsics.d((Keyline) get(i2), keylineList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public boolean g(Keyline keyline) {
        return this.f11939z.contains(keyline);
    }

    public final int h(float f2) {
        Object obj;
        Iterator it = new IntRange(this.E, CollectionsKt.o(this)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (get(((Number) obj).intValue()).e() == f2) {
                break;
            }
        }
        Integer num = (Integer) obj;
        return num != null ? num.intValue() : CollectionsKt.o(this);
    }

    public int hashCode() {
        int size = size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((Keyline) get(i3)).hashCode() * 31;
        }
        return i2;
    }

    /* renamed from: i */
    public Keyline get(int i2) {
        return (Keyline) this.f11939z.get(i2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Keyline)) {
            return -1;
        }
        return E((Keyline) obj);
    }

    public boolean isEmpty() {
        return this.f11939z.isEmpty();
    }

    public Iterator iterator() {
        return this.f11939z.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Keyline)) {
            return -1;
        }
        return L((Keyline) obj);
    }

    public ListIterator listIterator() {
        return this.f11939z.listIterator();
    }

    public final Keyline m() {
        Keyline keyline = (Keyline) CollectionsKt.h0(this, this.D);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int n() {
        return this.D;
    }

    public final Keyline o() {
        return get(this.f11938B);
    }

    public final int p() {
        return this.f11938B;
    }

    public final int q() {
        return this.F;
    }

    public /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Keyline s(float f2) {
        Object obj;
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = get(i2);
            if (((Keyline) obj).f() >= f2) {
                break;
            }
            i2++;
        }
        Keyline keyline = (Keyline) obj;
        return keyline == null ? (Keyline) CollectionsKt.p0(this) : keyline;
    }

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return D();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i2, int i3) {
        return this.f11939z.subList(i2, i3);
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public final Keyline u(float f2) {
        int size = size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                Keyline i3 = get(size);
                if (i3.f() < f2) {
                    return i3;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        return (Keyline) CollectionsKt.e0(this);
    }

    public final Keyline v() {
        Keyline keyline = (Keyline) CollectionsKt.h0(this, this.E);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int w() {
        return this.E;
    }

    public final Keyline z() {
        return get(this.C);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i2) {
        return this.f11939z.listIterator(i2);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }
}
