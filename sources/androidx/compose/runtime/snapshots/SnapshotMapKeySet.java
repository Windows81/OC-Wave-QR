package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SnapshotMapKeySet<K, V> extends SnapshotMapSet<K, V, K> {
    public SnapshotMapKeySet(SnapshotStateMap snapshotStateMap) {
        super(snapshotStateMap);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) h(obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) i(collection)).booleanValue();
    }

    public boolean contains(Object obj) {
        return e().containsKey(obj);
    }

    public boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object containsKey : iterable) {
            if (!e().containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public Void h(Object obj) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    public Void i(Collection collection) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: m */
    public StateMapMutableKeysIterator iterator() {
        return new StateMapMutableKeysIterator(e(), ((ImmutableSet) e().k().j().entrySet()).iterator());
    }

    public boolean remove(Object obj) {
        return e().remove(obj) != null;
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z2;
                }
                if (e().remove(it.next()) != null || z2) {
                    z2 = true;
                }
            }
        }
    }

    public boolean retainAll(Collection collection) {
        PersistentMap j2;
        int k2;
        Snapshot c2;
        boolean a2;
        Set R0 = CollectionsKt.R0(collection);
        SnapshotStateMap e2 = e();
        boolean z2 = false;
        do {
            synchronized (SnapshotStateMapKt.f15298a) {
                StateRecord h2 = e2.h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.K((SnapshotStateMap.StateMapStateRecord) h2);
                j2 = stateMapStateRecord.j();
                k2 = stateMapStateRecord.k();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentMap.Builder l2 = j2.l();
            for (Map.Entry entry : e2.entrySet()) {
                if (!R0.contains(entry.getKey())) {
                    l2.remove(entry.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.f40552a;
            PersistentMap d2 = l2.d();
            if (Intrinsics.d(d2, j2)) {
                break;
            }
            StateRecord h3 = e2.h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                a2 = e2.b((SnapshotStateMap.StateMapStateRecord) SnapshotKt.p0(stateMapStateRecord2, e2, c2), k2, d2);
            }
            SnapshotKt.X(c2, e2);
        } while (!a2);
        return z2;
    }
}
