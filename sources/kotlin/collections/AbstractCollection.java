package kotlin.collections;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class AbstractCollection<E> implements Collection<E>, KMappedMarker {
    public static final CharSequence h(AbstractCollection abstractCollection, Object obj) {
        return obj == abstractCollection ? "(this Collection)" : String.valueOf(obj);
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
        if (isEmpty()) {
            return false;
        }
        for (Object d2 : this) {
            if (Intrinsics.d(d2, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public abstract int g();

    public boolean isEmpty() {
        return size() == 0;
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
        return CollectionsKt.n0(this, ", ", "[", "]", 0, (CharSequence) null, new a(this), 24, (Object) null);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
