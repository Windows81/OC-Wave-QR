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
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState<Long> {

    /* renamed from: A  reason: collision with root package name */
    public LongStateStateRecord f14898A;

    @Metadata
    public static final class LongStateStateRecord extends StateRecord {

        /* renamed from: c  reason: collision with root package name */
        public long f14899c;

        public LongStateStateRecord(long j2, long j3) {
            super(j2);
            this.f14899c = j3;
        }

        public void c(StateRecord stateRecord) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f14899c = ((LongStateStateRecord) stateRecord).f14899c;
        }

        public StateRecord d() {
            return e(SnapshotKt.M().i());
        }

        public StateRecord e(long j2) {
            return new LongStateStateRecord(j2, this.f14899c);
        }

        public final long j() {
            return this.f14899c;
        }

        public final void k(long j2) {
            this.f14899c = j2;
        }
    }

    public SnapshotMutableLongStateImpl(long j2) {
        Snapshot M = SnapshotKt.M();
        LongStateStateRecord longStateStateRecord = new LongStateStateRecord(M.i(), j2);
        if (!(M instanceof GlobalSnapshot)) {
            longStateStateRecord.h(new LongStateStateRecord(SnapshotId_jvmKt.c(1), j2));
        }
        this.f14898A = longStateStateRecord;
    }

    public long a() {
        return ((LongStateStateRecord) SnapshotKt.e0(this.f14898A, this)).j();
    }

    public SnapshotMutationPolicy d() {
        return SnapshotStateKt.r();
    }

    public void g(StateRecord stateRecord) {
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f14898A = (LongStateStateRecord) stateRecord;
    }

    public StateRecord h() {
        return this.f14898A;
    }

    public StateRecord i(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        Intrinsics.g(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        Intrinsics.g(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((LongStateStateRecord) stateRecord2).j() == ((LongStateStateRecord) stateRecord3).j()) {
            return stateRecord2;
        }
        return null;
    }

    public void l(long j2) {
        Snapshot c2;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.K(this.f14898A);
        if (longStateStateRecord.j() != j2) {
            LongStateStateRecord longStateStateRecord2 = this.f14898A;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                ((LongStateStateRecord) SnapshotKt.Z(longStateStateRecord2, this, c2, longStateStateRecord)).k(j2);
                Unit unit = Unit.f40552a;
            }
            SnapshotKt.X(c2, this);
        }
    }

    public String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.K(this.f14898A)).j() + ")@" + hashCode();
    }
}
