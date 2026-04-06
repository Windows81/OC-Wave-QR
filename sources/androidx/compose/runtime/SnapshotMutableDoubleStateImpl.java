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
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {

    /* renamed from: A  reason: collision with root package name */
    public DoubleStateStateRecord f14892A;

    @Metadata
    public static final class DoubleStateStateRecord extends StateRecord {

        /* renamed from: c  reason: collision with root package name */
        public double f14893c;

        public DoubleStateStateRecord(long j2, double d2) {
            super(j2);
            this.f14893c = d2;
        }

        public void c(StateRecord stateRecord) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.f14893c = ((DoubleStateStateRecord) stateRecord).f14893c;
        }

        public StateRecord d() {
            return e(g());
        }

        public StateRecord e(long j2) {
            return new DoubleStateStateRecord(j2, this.f14893c);
        }

        public final double j() {
            return this.f14893c;
        }

        public final void k(double d2) {
            this.f14893c = d2;
        }
    }

    public SnapshotMutableDoubleStateImpl(double d2) {
        Snapshot M = SnapshotKt.M();
        DoubleStateStateRecord doubleStateStateRecord = new DoubleStateStateRecord(M.i(), d2);
        if (!(M instanceof GlobalSnapshot)) {
            doubleStateStateRecord.h(new DoubleStateStateRecord(SnapshotId_jvmKt.c(1), d2));
        }
        this.f14892A = doubleStateStateRecord;
    }

    public double b() {
        return ((DoubleStateStateRecord) SnapshotKt.e0(this.f14892A, this)).j();
    }

    public SnapshotMutationPolicy d() {
        return SnapshotStateKt.r();
    }

    public void g(StateRecord stateRecord) {
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.f14892A = (DoubleStateStateRecord) stateRecord;
    }

    public StateRecord h() {
        return this.f14892A;
    }

    public StateRecord i(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        Intrinsics.g(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        Intrinsics.g(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((DoubleStateStateRecord) stateRecord2).j() == ((DoubleStateStateRecord) stateRecord3).j()) {
            return stateRecord2;
        }
        return null;
    }

    public void r(double d2) {
        Snapshot c2;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.K(this.f14892A);
        if (doubleStateStateRecord.j() != d2) {
            DoubleStateStateRecord doubleStateStateRecord2 = this.f14892A;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                ((DoubleStateStateRecord) SnapshotKt.Z(doubleStateStateRecord2, this, c2, doubleStateStateRecord)).k(d2);
                Unit unit = Unit.f40552a;
            }
            SnapshotKt.X(c2, this);
        }
    }

    public String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.K(this.f14892A)).j() + ")@" + hashCode();
    }
}
