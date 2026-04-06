package kotlinx.collections.immutable.adapters;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class ImmutableListAdapter<E> implements ImmutableList<E>, List<E>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final List f41237z;

    public ImmutableListAdapter(List list) {
        Intrinsics.i(list, "impl");
        this.f41237z = list;
    }

    public void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f41237z.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f41237z.containsAll(collection);
    }

    public int e() {
        return this.f41237z.size();
    }

    public boolean equals(Object obj) {
        return this.f41237z.equals(obj);
    }

    /* renamed from: g */
    public ImmutableList subList(int i2, int i3) {
        return new ImmutableListAdapter(this.f41237z.subList(i2, i3));
    }

    public Object get(int i2) {
        return this.f41237z.get(i2);
    }

    public int hashCode() {
        return this.f41237z.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f41237z.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f41237z.isEmpty();
    }

    public Iterator iterator() {
        return this.f41237z.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f41237z.lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return this.f41237z.listIterator();
    }

    public Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        return this.f41237z.toString();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i2) {
        return this.f41237z.listIterator(i2);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
