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
public class SnapshotMutableFloatStateImpl extends StateObjectImpl implements MutableFloatState, SnapshotMutableState<Float> {

    /* renamed from: A  reason: collision with root package name */
    public FloatStateStateRecord f14894A;

    @Metadata
    public static final class FloatStateStateRecord extends StateRecord {

        /* renamed from: c  reason: collision with root package name */
        public float f14895c;

        public FloatStateStateRecord(long j2, float f2) {
            super(j2);
            this.f14895c = f2;
        }

        public void c(StateRecord stateRecord) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f14895c = ((FloatStateStateRecord) stateRecord).f14895c;
        }

        public StateRecord d() {
            return e(SnapshotKt.M().i());
        }

        public StateRecord e(long j2) {
            return new FloatStateStateRecord(j2, this.f14895c);
        }

        public final float j() {
            return this.f14895c;
        }

        public final void k(float f2) {
            this.f14895c = f2;
        }
    }

    public SnapshotMutableFloatStateImpl(float f2) {
        Snapshot M = SnapshotKt.M();
        FloatStateStateRecord floatStateStateRecord = new FloatStateStateRecord(M.i(), f2);
        if (!(M instanceof GlobalSnapshot)) {
            floatStateStateRecord.h(new FloatStateStateRecord(SnapshotId_jvmKt.c(1), f2));
        }
        this.f14894A = floatStateStateRecord;
    }

    public float c() {
        return ((FloatStateStateRecord) SnapshotKt.e0(this.f14894A, this)).j();
    }

    public SnapshotMutationPolicy d() {
        return SnapshotStateKt.r();
    }

    public void g(StateRecord stateRecord) {
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f14894A = (FloatStateStateRecord) stateRecord;
    }

    public StateRecord h() {
        return this.f14894A;
    }

    public StateRecord i(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        Intrinsics.g(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        Intrinsics.g(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((FloatStateStateRecord) stateRecord2).j() == ((FloatStateStateRecord) stateRecord3).j()) {
            return stateRecord2;
        }
        return null;
    }

    public void j(float f2) {
        Snapshot c2;
        FloatStateStateRecord floatStateStateRecord = (FloatStateStateRecord) SnapshotKt.K(this.f14894A);
        if (floatStateStateRecord.j() != f2) {
            FloatStateStateRecord floatStateStateRecord2 = this.f14894A;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                ((FloatStateStateRecord) SnapshotKt.Z(floatStateStateRecord2, this, c2, floatStateStateRecord)).k(f2);
                Unit unit = Unit.f40552a;
            }
            SnapshotKt.X(c2, this);
        }
    }

    public String toString() {
        return "MutableFloatState(value=" + ((FloatStateStateRecord) SnapshotKt.K(this.f14894A)).j() + ")@" + hashCode();
    }
}
