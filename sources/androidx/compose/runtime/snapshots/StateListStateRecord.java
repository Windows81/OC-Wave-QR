package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StateListStateRecord<T> extends StateRecord {

    /* renamed from: c  reason: collision with root package name */
    public PersistentList f15333c;

    /* renamed from: d  reason: collision with root package name */
    public int f15334d;

    /* renamed from: e  reason: collision with root package name */
    public int f15335e;

    public StateListStateRecord(long j2, PersistentList persistentList) {
        super(j2);
        this.f15333c = persistentList;
    }

    public void c(StateRecord stateRecord) {
        synchronized (SnapshotStateListKt.f15292a) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f15333c = ((StateListStateRecord) stateRecord).f15333c;
            this.f15334d = ((StateListStateRecord) stateRecord).f15334d;
            this.f15335e = ((StateListStateRecord) stateRecord).f15335e;
            Unit unit = Unit.f40552a;
        }
    }

    public StateRecord d() {
        return e(SnapshotKt.M().i());
    }

    public StateRecord e(long j2) {
        return new StateListStateRecord(j2, this.f15333c);
    }

    public final PersistentList j() {
        return this.f15333c;
    }

    public final int k() {
        return this.f15334d;
    }

    public final int l() {
        return this.f15335e;
    }

    public final void m(PersistentList persistentList) {
        this.f15333c = persistentList;
    }

    public final void n(int i2) {
        this.f15334d = i2;
    }

    public final void o(int i2) {
        this.f15335e = i2;
    }
}
