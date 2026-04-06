package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SnapshotStateListKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15292a = new Object();

    public static final SnapshotStateList a(int i2, Function1 function1) {
        if (i2 == 0) {
            return new SnapshotStateList();
        }
        PersistentList.Builder l2 = ExtensionsKt.b().l();
        for (int i3 = 0; i3 < i2; i3++) {
            l2.add(function1.invoke(Integer.valueOf(i3)));
        }
        return new SnapshotStateList(l2.d());
    }

    public static final boolean f(StateListStateRecord stateListStateRecord, int i2, PersistentList persistentList, boolean z2) {
        boolean z3;
        synchronized (f15292a) {
            try {
                if (stateListStateRecord.k() == i2) {
                    stateListStateRecord.m(persistentList);
                    z3 = true;
                    if (z2) {
                        stateListStateRecord.o(stateListStateRecord.l() + 1);
                    }
                    stateListStateRecord.n(stateListStateRecord.k() + 1);
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public static final StateListStateRecord g(SnapshotStateList snapshotStateList) {
        StateRecord h2 = snapshotStateList.h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (StateListStateRecord) SnapshotKt.e0((StateListStateRecord) h2, snapshotStateList);
    }

    public static final int h(SnapshotStateList snapshotStateList) {
        StateRecord h2 = snapshotStateList.h();
        Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2)).l();
    }

    public static final Void i() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    public static final Void j() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final boolean k(SnapshotStateList snapshotStateList, Function1 function1) {
        int k2;
        PersistentList j2;
        Object invoke;
        Snapshot c2;
        boolean f2;
        do {
            synchronized (f15292a) {
                StateRecord h2 = snapshotStateList.h();
                Intrinsics.g(h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.K((StateListStateRecord) h2);
                k2 = stateListStateRecord.k();
                j2 = stateListStateRecord.j();
                Unit unit = Unit.f40552a;
            }
            Intrinsics.f(j2);
            PersistentList.Builder l2 = j2.l();
            invoke = function1.invoke(l2);
            PersistentList d2 = l2.d();
            if (Intrinsics.d(d2, j2)) {
                break;
            }
            StateRecord h3 = snapshotStateList.h();
            Intrinsics.g(h3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) h3;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                f2 = f((StateListStateRecord) SnapshotKt.p0(stateListStateRecord2, snapshotStateList, c2), k2, d2, true);
            }
            SnapshotKt.X(c2, snapshotStateList);
        } while (!f2);
        return ((Boolean) invoke).booleanValue();
    }

    public static final StateRecord l(SnapshotStateList snapshotStateList, PersistentList persistentList) {
        Snapshot M = SnapshotKt.M();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(M.i(), persistentList);
        if (!(M instanceof GlobalSnapshot)) {
            stateListStateRecord.h(new StateListStateRecord(SnapshotId_jvmKt.c(1), persistentList));
        }
        return stateListStateRecord;
    }

    public static final void m(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }
}
