package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
abstract class SnapshotMapSet<K, V, E> implements Set<E>, KMutableSet {

    /* renamed from: z  reason: collision with root package name */
    public final SnapshotStateMap f15289z;

    public SnapshotMapSet(SnapshotStateMap snapshotStateMap) {
        this.f15289z = snapshotStateMap;
    }

    public void clear() {
        this.f15289z.clear();
    }

    public final SnapshotStateMap e() {
        return this.f15289z;
    }

    public int g() {
        return this.f15289z.size();
    }

    public boolean isEmpty() {
        return this.f15289z.isEmpty();
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
