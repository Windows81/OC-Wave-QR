package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class GlobalSnapshot extends MutableSnapshot {
    public GlobalSnapshot(long j2, SnapshotIdSet snapshotIdSet) {
        super(j2, snapshotIdSet, (Function1) null, new a());
    }

    public static final Unit X(Object obj) {
        synchronized (SnapshotKt.O()) {
            List l2 = SnapshotKt.f15285j;
            int size = l2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Function1) l2.get(i2)).invoke(obj);
            }
        }
        return Unit.f40552a;
    }

    public SnapshotApplyResult E() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    public MutableSnapshot T(Function1 function1, Function1 function12) {
        Map map;
        Function1 function13;
        PersistentList b2 = SnapshotObserverKt.f15386a;
        if (b2 != null) {
            Pair f2 = SnapshotObserverKt.f(b2, (Snapshot) null, false, function1, function12);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) f2.e();
            Function1 a2 = snapshotInstanceObservers.a();
            Function1 b3 = snapshotInstanceObservers.b();
            map = (Map) f2.f();
            function1 = a2;
            function13 = b3;
        } else {
            function13 = function12;
            map = null;
        }
        MutableSnapshot mutableSnapshot = (MutableSnapshot) SnapshotKt.i0(new GlobalSnapshot$takeNestedMutableSnapshot$1$1(function1, function13));
        if (b2 != null) {
            SnapshotObserverKt.c(b2, (Snapshot) null, mutableSnapshot, map);
        }
        return mutableSnapshot;
    }

    /* renamed from: Y */
    public Void m(Snapshot snapshot) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: Z */
    public Void n(Snapshot snapshot) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    public void d() {
        synchronized (SnapshotKt.O()) {
            q();
            Unit unit = Unit.f40552a;
        }
    }

    public void o() {
        SnapshotKt.G();
    }

    public Snapshot x(Function1 function1) {
        Map map;
        PersistentList b2 = SnapshotObserverKt.f15386a;
        if (b2 != null) {
            Pair f2 = SnapshotObserverKt.f(b2, (Snapshot) null, true, function1, (Function1) null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) f2.e();
            Function1 a2 = snapshotInstanceObservers.a();
            snapshotInstanceObservers.b();
            map = (Map) f2.f();
            function1 = a2;
        } else {
            map = null;
        }
        ReadonlySnapshot readonlySnapshot = (ReadonlySnapshot) SnapshotKt.i0(new GlobalSnapshot$takeNestedSnapshot$1$1(function1));
        if (b2 != null) {
            SnapshotObserverKt.c(b2, (Snapshot) null, readonlySnapshot, map);
        }
        return readonlySnapshot;
    }
}
