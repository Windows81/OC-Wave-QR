package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

@Metadata
final class Entries<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final ScatterMap f1731z;

    public Entries(ScatterMap scatterMap) {
        Intrinsics.i(scatterMap, "parent");
        this.f1731z = scatterMap;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return g((Map.Entry) obj);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        Iterable<Map.Entry> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Map.Entry entry : iterable) {
            if (!Intrinsics.d(this.f1731z.e(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public boolean g(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        return Intrinsics.d(this.f1731z.e(entry.getKey()), entry.getValue());
    }

    public int h() {
        return this.f1731z.f1963e;
    }

    public boolean isEmpty() {
        return this.f1731z.h();
    }

    public Iterator iterator() {
        return SequencesKt.a(new Entries$iterator$1(this, (Continuation) null));
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
        return h();
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
