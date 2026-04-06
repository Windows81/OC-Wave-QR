package androidx.compose.runtime.snapshots.tooling;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.Snapshot;
import d.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SnapshotObserverKt {

    /* renamed from: a  reason: collision with root package name */
    public static PersistentList f15386a;

    public static final void c(PersistentList persistentList, Snapshot snapshot, Snapshot snapshot2, Map map) {
        int size = persistentList.size();
        for (int i2 = 0; i2 < size; i2++) {
            SnapshotObserver snapshotObserver = (SnapshotObserver) persistentList.get(i2);
            snapshotObserver.b(snapshot2, snapshot, map != null ? (SnapshotInstanceObservers) map.get(snapshotObserver) : null);
        }
    }

    public static final void d(Snapshot snapshot, ScatterSet scatterSet) {
        Set set;
        PersistentList persistentList = f15386a;
        if (persistentList != null && !persistentList.isEmpty()) {
            if (scatterSet == null || (set = ScatterSetWrapperKt.a(scatterSet)) == null) {
                set = SetsKt.d();
            }
            int size = persistentList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((SnapshotObserver) persistentList.get(i2)).d(snapshot, set);
            }
        }
    }

    public static final void e(Snapshot snapshot) {
        PersistentList persistentList = f15386a;
        if (persistentList != null) {
            int size = persistentList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((SnapshotObserver) persistentList.get(i2)).c(snapshot);
            }
        }
    }

    public static final Pair f(PersistentList persistentList, Snapshot snapshot, boolean z2, Function1 function1, Function1 function12) {
        int size = persistentList.size();
        LinkedHashMap linkedHashMap = null;
        for (int i2 = 0; i2 < size; i2++) {
            SnapshotObserver snapshotObserver = (SnapshotObserver) persistentList.get(i2);
            SnapshotInstanceObservers a2 = snapshotObserver.a(snapshot, z2);
            if (a2 != null) {
                function1 = g(a2.a(), function1);
                function12 = g(a2.b(), function12);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, a2);
            }
        }
        return TuplesKt.a(new SnapshotInstanceObservers(function1, function12), linkedHashMap);
    }

    public static final Function1 g(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null) ? function1 == null ? function12 : function1 : new a(function1, function12);
    }

    public static final Unit h(Function1 function1, Function1 function12, Object obj) {
        function1.invoke(obj);
        function12.invoke(obj);
        return Unit.f40552a;
    }
}
