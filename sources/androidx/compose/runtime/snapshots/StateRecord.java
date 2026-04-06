package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

@Metadata
public abstract class StateRecord {

    /* renamed from: a  reason: collision with root package name */
    public long f15343a;

    /* renamed from: b  reason: collision with root package name */
    public StateRecord f15344b;

    public StateRecord(long j2) {
        this.f15343a = j2;
    }

    public abstract void c(StateRecord stateRecord);

    public abstract StateRecord d();

    public StateRecord e(long j2) {
        StateRecord d2 = d();
        d2.f15343a = j2;
        return d2;
    }

    public final StateRecord f() {
        return this.f15344b;
    }

    public final long g() {
        return this.f15343a;
    }

    public final void h(StateRecord stateRecord) {
        this.f15344b = stateRecord;
    }

    public final void i(long j2) {
        this.f15343a = j2;
    }

    public StateRecord() {
        this(SnapshotKt.M().i());
    }
}
