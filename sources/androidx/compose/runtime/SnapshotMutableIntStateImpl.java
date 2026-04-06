package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class SnapshotMutableIntStateImpl extends StateObjectImpl implements MutableIntState, SnapshotMutableState<Integer> {

    /* renamed from: A  reason: collision with root package name */
    public IntStateStateRecord f14896A;

    @Metadata
    public static final class IntStateStateRecord extends StateRecord {

        /* renamed from: c  reason: collision with root package name */
        public int f14897c;

        public IntStateStateRecord(long j2, int i2) {
            super(j2);
            this.f14897c = i2;
        }

        public void c(StateRecord stateRecord) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f14897c = ((IntStateStateRecord) stateRecord).f14897c;
        }

        public StateRecord d() {
            return e(SnapshotKt.M().i());
        }

        public StateRecord e(long j2) {
            return new IntStateStateRecord(j2, this.f14897c);
        }

        public final int j() {
            return this.f14897c;
        }

        public final void k(int i2) {
            this.f14897c = i2;
        }
    }

    public SnapshotMutableIntStateImpl(int i2) {
        Snapshot M = SnapshotKt.M();
        IntStateStateRecord intStateStateRecord = new IntStateStateRecord(M.i(), i2);
        if (!(M instanceof GlobalSnapshot)) {
            intStateStateRecord.h(new IntStateStateRecord(SnapshotId_jvmKt.c(1), i2));
        }
        this.f14896A = intStateStateRecord;
    }

    public SnapshotMutationPolicy d() {
        return SnapshotStateKt.r();
    }

    public int e() {
        return ((IntStateStateRecord) SnapshotKt.e0(this.f14896A, this)).j();
    }

    public void g(StateRecord stateRecord) {
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f14896A = (IntStateStateRecord) stateRecord;
    }

    public StateRecord h() {
        return this.f14896A;
    }

    public StateRecord i(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        Intrinsics.g(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        Intrinsics.g(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((IntStateStateRecord) stateRecord2).j() == ((IntStateStateRecord) stateRecord3).j()) {
            return stateRecord2;
        }
        return null;
    }

    public void k(int i2) {
        Snapshot c2;
        IntStateStateRecord intStateStateRecord = (IntStateStateRecord) SnapshotKt.K(this.f14896A);
        if (intStateStateRecord.j() != i2) {
            IntStateStateRecord intStateStateRecord2 = this.f14896A;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                ((IntStateStateRecord) SnapshotKt.Z(intStateStateRecord2, this, c2, intStateStateRecord)).k(i2);
                Unit unit = Unit.f40552a;
            }
            SnapshotKt.X(c2, this);
        }
    }

    public String toString() {
        return "MutableIntState(value=" + ((IntStateStateRecord) SnapshotKt.K(this.f14896A)).j() + ")@" + hashCode();
    }
}
