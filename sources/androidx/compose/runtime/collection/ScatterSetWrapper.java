package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

@Metadata
public final class ScatterSetWrapper<T> implements Set<T>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final ScatterSet f15012z;

    public ScatterSetWrapper(ScatterSet scatterSet) {
        this.f15012z = scatterSet;
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
        return this.f15012z.a(obj);
    }

    public boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object a2 : iterable) {
            if (!this.f15012z.a(a2)) {
                return false;
            }
        }
        return true;
    }

    public final ScatterSet e() {
        return this.f15012z;
    }

    public int g() {
        return this.f15012z.c();
    }

    public boolean isEmpty() {
        return this.f15012z.d();
    }

    public Iterator iterator() {
        return SequencesKt.a(new ScatterSetWrapper$iterator$1(this, (Continuation) null));
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

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }
}
