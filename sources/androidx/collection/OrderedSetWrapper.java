package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

@Metadata
class OrderedSetWrapper<E> implements Set<E>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final OrderedScatterSet f1957z;

    public OrderedSetWrapper(OrderedScatterSet orderedScatterSet) {
        Intrinsics.i(orderedScatterSet, "parent");
        this.f1957z = orderedScatterSet;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f1957z.a(obj);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        for (Object a2 : collection) {
            if (!this.f1957z.a(a2)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Intrinsics.d(this.f1957z, ((OrderedSetWrapper) obj).f1957z);
    }

    public int g() {
        return this.f1957z.f1954g;
    }

    public int hashCode() {
        return this.f1957z.hashCode();
    }

    public boolean isEmpty() {
        return this.f1957z.d();
    }

    public Iterator iterator() {
        return SequencesKt.a(new OrderedSetWrapper$iterator$1(this, (Continuation) null));
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return g();
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        return this.f1957z.toString();
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
