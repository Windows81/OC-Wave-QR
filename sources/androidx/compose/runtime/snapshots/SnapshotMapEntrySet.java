package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;

@Metadata
final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
    public SnapshotMapEntrySet(SnapshotStateMap snapshotStateMap) {
        super(snapshotStateMap);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) h((Map.Entry) obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) i(collection)).booleanValue();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!TypeIntrinsics.m(obj)) {
            return false;
        }
        return m((Map.Entry) obj);
    }

    public boolean containsAll(Collection collection) {
        Iterable<Map.Entry> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Map.Entry contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Void h(Map.Entry entry) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    public Void i(Collection collection) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    public Iterator iterator() {
        return new StateMapMutableEntriesIterator(e(), ((ImmutableSet) e().k().j().entrySet()).iterator());
    }

    public boolean m(Map.Entry entry) {
        return Intrinsics.d(e().get(entry.getKey()), entry.getValue());
    }

    public boolean n(Map.Entry entry) {
        return e().remove(entry.getKey()) != null;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!TypeIntrinsics.m(obj)) {
            return false;
        }
        return n((Map.Entry) obj);
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z2;
                }
                if (e().remove(((Map.Entry) it.next()).getKey()) != null || z2) {
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
        Iterable<Map.Entry> iterable = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.e(MapsKt.e(CollectionsKt.x(iterable, 10)), 16));
        for (Map.Entry entry : iterable) {
            Pair a3 = TuplesKt.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a3.e(), a3.f());
        }
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
            for (Map.Entry entry2 : e2.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.d(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    l2.remove(entry2.getKey());
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
