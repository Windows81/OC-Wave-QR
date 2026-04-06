package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.ranges.RangesKt;

@Metadata
public final class SubList<T> implements List<T>, KMutableList {

    /* renamed from: A  reason: collision with root package name */
    public final int f15350A;

    /* renamed from: B  reason: collision with root package name */
    public int f15351B;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public final SnapshotStateList f15352z;

    public SubList(SnapshotStateList snapshotStateList, int i2, int i3) {
        this.f15352z = snapshotStateList;
        this.f15350A = i2;
        this.f15351B = SnapshotStateListKt.h(snapshotStateList);
        this.C = i3 - i2;
    }

    public boolean add(Object obj) {
        h();
        this.f15352z.add(this.f15350A + size(), obj);
        this.C = size() + 1;
        this.f15351B = SnapshotStateListKt.h(this.f15352z);
        return true;
    }

    public boolean addAll(int i2, Collection collection) {
        h();
        boolean addAll = this.f15352z.addAll(i2 + this.f15350A, collection);
        if (addAll) {
            this.C = size() + collection.size();
            this.f15351B = SnapshotStateListKt.h(this.f15352z);
        }
        return addAll;
    }

    public void clear() {
        if (size() > 0) {
            h();
            SnapshotStateList snapshotStateList = this.f15352z;
            int i2 = this.f15350A;
            snapshotStateList.s(i2, size() + i2);
            this.C = 0;
            this.f15351B = SnapshotStateListKt.h(this.f15352z);
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.C;
    }

    public Object g(int i2) {
        h();
        Object remove = this.f15352z.remove(this.f15350A + i2);
        this.C = size() - 1;
        this.f15351B = SnapshotStateListKt.h(this.f15352z);
        return remove;
    }

    public Object get(int i2) {
        h();
        SnapshotStateListKt.m(i2, size());
        return this.f15352z.get(this.f15350A + i2);
    }

    public final void h() {
        if (SnapshotStateListKt.h(this.f15352z) != this.f15351B) {
            throw new ConcurrentModificationException();
        }
    }

    public int indexOf(Object obj) {
        h();
        int i2 = this.f15350A;
        Iterator it = RangesKt.v(i2, size() + i2).iterator();
        while (it.hasNext()) {
            int b2 = ((IntIterator) it).b();
            if (Intrinsics.d(obj, this.f15352z.get(b2))) {
                return b2 - this.f15350A;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        h();
        int size = this.f15350A + size();
        while (true) {
            size--;
            if (size < this.f15350A) {
                return -1;
            }
            if (Intrinsics.d(obj, this.f15352z.get(size))) {
                return size - this.f15350A;
            }
        }
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final /* bridge */ Object remove(int i2) {
        return g(i2);
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z2;
                }
                if (remove(it.next()) || z2) {
                    z2 = true;
                }
            }
        }
    }

    public boolean retainAll(Collection collection) {
        h();
        SnapshotStateList snapshotStateList = this.f15352z;
        int i2 = this.f15350A;
        int v2 = snapshotStateList.v(collection, i2, size() + i2);
        if (v2 > 0) {
            this.f15351B = SnapshotStateListKt.h(this.f15352z);
            this.C = size() - v2;
        }
        return v2 > 0;
    }

    public Object set(int i2, Object obj) {
        SnapshotStateListKt.m(i2, size());
        h();
        Object obj2 = this.f15352z.set(i2 + this.f15350A, obj);
        this.f15351B = SnapshotStateListKt.h(this.f15352z);
        return obj2;
    }

    public final /* bridge */ int size() {
        return e();
    }

    public List subList(int i2, int i3) {
        if (!(i2 >= 0 && i2 <= i3 && i3 <= size())) {
            PreconditionsKt.a("fromIndex or toIndex are out of bounds");
        }
        h();
        SnapshotStateList snapshotStateList = this.f15352z;
        int i4 = this.f15350A;
        return new SubList(snapshotStateList, i2 + i4, i3 + i4);
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public ListIterator listIterator(int i2) {
        h();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f40906z = i2 - 1;
        return new SubList$listIterator$1(intRef, this);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }

    public void add(int i2, Object obj) {
        h();
        this.f15352z.add(this.f15350A + i2, obj);
        this.C = size() + 1;
        this.f15351B = SnapshotStateListKt.h(this.f15352z);
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
