package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class ArrayAsCollection<T> implements Collection<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f40578A;

    /* renamed from: z  reason: collision with root package name */
    public final Object[] f40579z;

    public ArrayAsCollection(Object[] objArr, boolean z2) {
        Intrinsics.i(objArr, "values");
        this.f40579z = objArr;
        this.f40578A = z2;
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
        return ArraysKt.Y(this.f40579z, obj);
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

    public int e() {
        return this.f40579z.length;
    }

    public boolean isEmpty() {
        return this.f40579z.length == 0;
    }

    public Iterator iterator() {
        return ArrayIteratorKt.a(this.f40579z);
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
        return e();
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }

    public final Object[] toArray() {
        return CollectionsKt__CollectionsJVMKt.b(this.f40579z, this.f40578A);
    }
}
