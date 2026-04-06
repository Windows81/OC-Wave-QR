package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, KMutableMap {

    /* renamed from: A  reason: collision with root package name */
    public final Set f15293A;

    /* renamed from: B  reason: collision with root package name */
    public final Set f15294B;
    public final Collection C;

    /* renamed from: z  reason: collision with root package name */
    public StateRecord f15295z;

    @Metadata
    public static final class StateMapStateRecord<K, V> extends StateRecord {

        /* renamed from: c  reason: collision with root package name */
        public PersistentMap f15296c;

        /* renamed from: d  reason: collision with root package name */
        public int f15297d;

        public StateMapStateRecord(long j2, PersistentMap persistentMap) {
            super(j2);
            this.f15296c = persistentMap;
        }

        public void c(StateRecord stateRecord) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            synchronized (SnapshotStateMapKt.f15298a) {
                this.f15296c = stateMapStateRecord.f15296c;
                this.f15297d = stateMapStateRecord.f15297d;
                Unit unit = Unit.f40552a;
            }
        }

        public StateRecord d() {
            return new StateMapStateRecord(SnapshotKt.M().i(), this.f15296c);
        }

        public StateRecord e(long j2) {
            return new StateMapStateRecord(j2, this.f15296c);
        }

        public final PersistentMap j() {
            return this.f15296c;
        }

        public final int k() {
            return this.f15297d;
        }

        public final void l(PersistentMap persistentMap) {
            this.f15296c = persistentMap;
        }

        public final void m(int i2) {
            this.f15297d = i2;
        }
    }

    public SnapshotStateMap() {
        PersistentMap a2 = ExtensionsKt.a();
        Snapshot M = SnapshotKt.M();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(M.i(), a2);
        if (!(M instanceof GlobalSnapshot)) {
            stateMapStateRecord.h(new StateMapStateRecord(SnapshotId_jvmKt.c(1), a2));
        }
        this.f15295z = stateMapStateRecord;
        this.f15293A = new SnapshotMapEntrySet(this);
        this.f15294B = new SnapshotMapKeySet(this);
        this.C = new SnapshotMapValueSet(this);
    }

    public final boolean b(StateMapStateRecord stateMapStateRecord, int i2, PersistentMap persistentMap) {
        boolean z2;
        synchronized (SnapshotStateMapKt.f15298a) {
            if (stateMapStateRecord.k() == i2) {
                stateMapStateRecord.l(persistentMap);
                z2 = true;
                stateMapStateRecord.m(stateMapStateRecord.k() + 1);
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final int c(StateMapStateRecord stateMapStateRecord, PersistentMap persistentMap) {
        int k2;
        synchronized (SnapshotStateMapKt.f15298a) {
            stateMapStateRecord.l(persistentMap);
            k2 = stateMapStateRecord.k();
            stateMapStateRecord.m(k2 + 1);
        }
        return k2;
    }

    public void clear() {
        Snapshot c2;
        StateRecord h2 = h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.K((StateMapStateRecord) h2);
        stateMapStateRecord.j();
        PersistentMap a2 = ExtensionsKt.a();
        if (a2 != stateMapStateRecord.j()) {
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                c((StateMapStateRecord) SnapshotKt.p0(stateMapStateRecord2, this, c2), a2);
            }
            SnapshotKt.X(c2, this);
        }
    }

    public boolean containsKey(Object obj) {
        return k().j().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return k().j().containsValue(obj);
    }

    public Set e() {
        return this.f15293A;
    }

    public final /* bridge */ Set entrySet() {
        return e();
    }

    public Set f() {
        return this.f15294B;
    }

    public void g(StateRecord stateRecord) {
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f15295z = (StateMapStateRecord) stateRecord;
    }

    public Object get(Object obj) {
        return k().j().get(obj);
    }

    public StateRecord h() {
        return this.f15295z;
    }

    public boolean isEmpty() {
        return k().j().isEmpty();
    }

    public final int j() {
        return k().k();
    }

    public final StateMapStateRecord k() {
        StateRecord h2 = h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.e0((StateMapStateRecord) h2, this);
    }

    public final /* bridge */ Set keySet() {
        return f();
    }

    public int m() {
        return k().j().size();
    }

    public Collection n() {
        return this.C;
    }

    public final boolean o(Object obj) {
        Object obj2;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    public Object put(Object obj, Object obj2) {
        PersistentMap j2;
        int k2;
        Object put;
        Snapshot c2;
        boolean a2;
        do {
            synchronized (SnapshotStateMapKt.f15298a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.K((StateMapStateRecord) h2);
                j2 = stateMapStateRecord.j();
                k2 = stateMapStateRecord.k();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentMap.Builder l2 = j2.l();
            put = l2.put(obj, obj2);
            PersistentMap d2 = l2.d();
            if (Intrinsics.d(d2, j2)) {
                break;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                a2 = b((StateMapStateRecord) SnapshotKt.p0(stateMapStateRecord2, this, c2), k2, d2);
            }
            SnapshotKt.X(c2, this);
        } while (!a2);
        return put;
    }

    public void putAll(Map map) {
        PersistentMap j2;
        int k2;
        Snapshot c2;
        boolean a2;
        do {
            synchronized (SnapshotStateMapKt.f15298a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.K((StateMapStateRecord) h2);
                j2 = stateMapStateRecord.j();
                k2 = stateMapStateRecord.k();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentMap.Builder l2 = j2.l();
            l2.putAll(map);
            PersistentMap d2 = l2.d();
            if (!Intrinsics.d(d2, j2)) {
                StateRecord h3 = h();
                Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) h3;
                synchronized (SnapshotKt.O()) {
                    c2 = Snapshot.f15255e.c();
                    a2 = b((StateMapStateRecord) SnapshotKt.p0(stateMapStateRecord2, this, c2), k2, d2);
                }
                SnapshotKt.X(c2, this);
            } else {
                return;
            }
        } while (!a2);
    }

    public Object remove(Object obj) {
        PersistentMap j2;
        int k2;
        Object remove;
        Snapshot c2;
        boolean a2;
        do {
            synchronized (SnapshotStateMapKt.f15298a) {
                StateRecord h2 = h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.K((StateMapStateRecord) h2);
                j2 = stateMapStateRecord.j();
                k2 = stateMapStateRecord.k();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentMap.Builder l2 = j2.l();
            remove = l2.remove(obj);
            PersistentMap d2 = l2.d();
            if (Intrinsics.d(d2, j2)) {
                break;
            }
            StateRecord h3 = h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                a2 = b((StateMapStateRecord) SnapshotKt.p0(stateMapStateRecord2, this, c2), k2, d2);
            }
            SnapshotKt.X(c2, this);
        } while (!a2);
        return remove;
    }

    public final /* bridge */ int size() {
        return m();
    }

    public String toString() {
        StateRecord h2 = h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.K((StateMapStateRecord) h2)).j() + ")@" + hashCode();
    }

    public final /* bridge */ Collection values() {
        return n();
    }
}
