package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class GlobalSnapshot$takeNestedSnapshot$1$1 implements Function1<SnapshotIdSet, ReadonlySnapshot> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15234z;

    public GlobalSnapshot$takeNestedSnapshot$1$1(Function1 function1) {
        this.f15234z = function1;
    }

    /* renamed from: b */
    public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet) {
        long n2;
        synchronized (SnapshotKt.O()) {
            n2 = SnapshotKt.f15281f;
            SnapshotKt.f15281f = SnapshotKt.f15281f + ((long) 1);
        }
        return new ReadonlySnapshot(n2, snapshotIdSet, this.f15234z);
    }
}
