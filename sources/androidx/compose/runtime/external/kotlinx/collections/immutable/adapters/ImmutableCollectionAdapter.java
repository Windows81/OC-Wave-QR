package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class ImmutableCollectionAdapter<E> implements ImmutableCollection<E>, Collection<E>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final Collection f15020z;

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
        return this.f15020z.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f15020z.containsAll(collection);
    }

    public int e() {
        return this.f15020z.size();
    }

    public boolean equals(Object obj) {
        return this.f15020z.equals(obj);
    }

    public int hashCode() {
        return this.f15020z.hashCode();
    }

    public boolean isEmpty() {
        return this.f15020z.isEmpty();
    }

    public Iterator iterator() {
        return this.f15020z.iterator();
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
        return this.f15020z.toString();
    }

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }
}
