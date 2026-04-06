package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StateSetStateRecord<T> extends StateRecord {

    /* renamed from: c  reason: collision with root package name */
    public PersistentSet f15348c;

    /* renamed from: d  reason: collision with root package name */
    public int f15349d;

    public StateSetStateRecord(long j2, PersistentSet persistentSet) {
        super(j2);
        this.f15348c = persistentSet;
    }

    public void c(StateRecord stateRecord) {
        synchronized (SnapshotStateSetKt.f15326a) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.f15348c = ((StateSetStateRecord) stateRecord).f15348c;
            this.f15349d = ((StateSetStateRecord) stateRecord).f15349d;
            Unit unit = Unit.f40552a;
        }
    }

    public StateRecord d() {
        return new StateSetStateRecord(SnapshotKt.M().i(), this.f15348c);
    }

    public StateRecord e(long j2) {
        return new StateSetStateRecord(j2, this.f15348c);
    }

    public final int j() {
        return this.f15349d;
    }

    public final PersistentSet k() {
        return this.f15348c;
    }

    public final void l(int i2) {
        this.f15349d = i2;
    }

    public final void m(PersistentSet persistentSet) {
        this.f15348c = persistentSet;
    }
}
