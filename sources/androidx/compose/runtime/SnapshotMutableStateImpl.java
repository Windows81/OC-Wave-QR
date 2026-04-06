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
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {

    /* renamed from: A  reason: collision with root package name */
    public final SnapshotMutationPolicy f14900A;

    /* renamed from: B  reason: collision with root package name */
    public StateStateRecord f14901B;

    @Metadata
    public static final class StateStateRecord<T> extends StateRecord {

        /* renamed from: c  reason: collision with root package name */
        public Object f14902c;

        public StateStateRecord(long j2, Object obj) {
            super(j2);
            this.f14902c = obj;
        }

        public void c(StateRecord stateRecord) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f14902c = ((StateStateRecord) stateRecord).f14902c;
        }

        /* renamed from: j */
        public StateStateRecord d() {
            return new StateStateRecord(SnapshotKt.M().i(), this.f14902c);
        }

        /* renamed from: k */
        public StateStateRecord e(long j2) {
            return new StateStateRecord(SnapshotKt.M().i(), this.f14902c);
        }

        public final Object l() {
            return this.f14902c;
        }

        public final void m(Object obj) {
            this.f14902c = obj;
        }
    }

    public SnapshotMutableStateImpl(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        this.f14900A = snapshotMutationPolicy;
        Snapshot M = SnapshotKt.M();
        StateStateRecord stateStateRecord = new StateStateRecord(M.i(), obj);
        if (!(M instanceof GlobalSnapshot)) {
            stateStateRecord.h(new StateStateRecord(SnapshotId_jvmKt.c(1), obj));
        }
        this.f14901B = stateStateRecord;
    }

    public SnapshotMutationPolicy d() {
        return this.f14900A;
    }

    public void g(StateRecord stateRecord) {
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f14901B = (StateStateRecord) stateRecord;
    }

    public Object getValue() {
        return ((StateStateRecord) SnapshotKt.e0(this.f14901B, this)).l();
    }

    public StateRecord h() {
        return this.f14901B;
    }

    public StateRecord i(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord = (StateStateRecord) stateRecord;
        Intrinsics.g(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord2 = (StateStateRecord) stateRecord2;
        Intrinsics.g(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord3 = (StateStateRecord) stateRecord3;
        if (d().a(stateStateRecord2.l(), stateStateRecord3.l())) {
            return stateRecord2;
        }
        Object b2 = d().b(stateStateRecord.l(), stateStateRecord2.l(), stateStateRecord3.l());
        if (b2 == null) {
            return null;
        }
        StateStateRecord k2 = stateStateRecord3.e(stateStateRecord3.g());
        k2.m(b2);
        return k2;
    }

    public void setValue(Object obj) {
        Snapshot c2;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.K(this.f14901B);
        if (!d().a(stateStateRecord.l(), obj)) {
            StateStateRecord stateStateRecord2 = this.f14901B;
            synchronized (SnapshotKt.O()) {
                c2 = Snapshot.f15255e.c();
                ((StateStateRecord) SnapshotKt.Z(stateStateRecord2, this, c2, stateStateRecord)).m(obj);
                Unit unit = Unit.f40552a;
            }
            SnapshotKt.X(c2, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.K(this.f14901B)).l() + ")@" + hashCode();
    }
}
