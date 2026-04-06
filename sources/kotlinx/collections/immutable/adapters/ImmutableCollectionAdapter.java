package kotlinx.collections.immutable.adapters;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.ImmutableCollection;

@Metadata
public class ImmutableCollectionAdapter<E> implements ImmutableCollection<E>, Collection<E>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final Collection f41236z;

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
        return this.f41236z.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f41236z.containsAll(collection);
    }

    public int e() {
        return this.f41236z.size();
    }

    public boolean equals(Object obj) {
        return this.f41236z.equals(obj);
    }

    public int hashCode() {
        return this.f41236z.hashCode();
    }

    public boolean isEmpty() {
        return this.f41236z.isEmpty();
    }

    public Iterator iterator() {
        return this.f41236z.iterator();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        return this.f41236z.toString();
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
