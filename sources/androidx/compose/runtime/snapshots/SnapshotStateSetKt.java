package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SnapshotStateSetKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15326a = new Object();

    public static final boolean b(StateSetStateRecord stateSetStateRecord, int i2, PersistentSet persistentSet) {
        boolean z2;
        synchronized (f15326a) {
            if (stateSetStateRecord.j() == i2) {
                stateSetStateRecord.m(persistentSet);
                z2 = true;
                stateSetStateRecord.l(stateSetStateRecord.j() + 1);
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static final int c(SnapshotStateSet snapshotStateSet) {
        StateRecord h2 = snapshotStateSet.h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((StateSetStateRecord) SnapshotKt.K((StateSetStateRecord) h2)).j();
    }

    public static final StateSetStateRecord d(SnapshotStateSet snapshotStateSet) {
        StateRecord h2 = snapshotStateSet.h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (StateSetStateRecord) SnapshotKt.e0((StateSetStateRecord) h2, snapshotStateSet);
    }

    public static final boolean e(SnapshotStateSet snapshotStateSet, Function1 function1) {
        int j2;
        PersistentSet k2;
        PersistentSet.Builder l2;
        Object invoke;
        Snapshot c2;
        boolean b2;
        do {
            synchronized (f15326a) {
                StateRecord h2 = snapshotStateSet.h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.K((StateSetStateRecord) h2);
                j2 = stateSetStateRecord.j();
                k2 = stateSetStateRecord.k();
                Unit unit = Unit.f40552a;
            }
            if (k2 != null && (l2 = k2.l()) != null) {
                invoke = function1.invoke(l2);
                PersistentSet d2 = l2.d();
                if (Intrinsics.d(d2, k2)) {
                    break;
                }
                StateRecord h3 = snapshotStateSet.h();
                Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) h3;
                synchronized (SnapshotKt.O()) {
                    c2 = Snapshot.f15255e.c();
                    b2 = b((StateSetStateRecord) SnapshotKt.p0(stateSetStateRecord2, snapshotStateSet, c2), j2, d2);
                }
                SnapshotKt.X(c2, snapshotStateSet);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!b2);
        return ((Boolean) invoke).booleanValue();
    }

    public static final StateRecord f(SnapshotStateSet snapshotStateSet, PersistentSet persistentSet) {
        StateSetStateRecord stateSetStateRecord = new StateSetStateRecord(SnapshotKt.M().i(), persistentSet);
        if (Snapshot.f15255e.e()) {
            stateSetStateRecord.h(new StateSetStateRecord(SnapshotId_jvmKt.c(1), persistentSet));
        }
        return stateSetStateRecord;
    }
}
