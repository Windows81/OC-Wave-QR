package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class GlobalSnapshot$takeNestedMutableSnapshot$1$1 implements Function1<SnapshotIdSet, MutableSnapshot> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f15232A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15233z;

    public GlobalSnapshot$takeNestedMutableSnapshot$1$1(Function1 function1, Function1 function12) {
        this.f15233z = function1;
        this.f15232A = function12;
    }

    /* renamed from: b */
    public final MutableSnapshot invoke(SnapshotIdSet snapshotIdSet) {
        long n2;
        synchronized (SnapshotKt.O()) {
            n2 = SnapshotKt.f15281f;
            SnapshotKt.f15281f = SnapshotKt.f15281f + ((long) 1);
        }
        return new MutableSnapshot(n2, snapshotIdSet, this.f15233z, this.f15232A);
    }
}
