package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class NestedMutableSnapshot extends MutableSnapshot {

    /* renamed from: s  reason: collision with root package name */
    public final MutableSnapshot f15247s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15248t;

    public NestedMutableSnapshot(long j2, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12, MutableSnapshot mutableSnapshot) {
        super(j2, snapshotIdSet, function1, function12);
        this.f15247s = mutableSnapshot;
        mutableSnapshot.m(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085 A[Catch:{ all -> 0x0069 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult E() {
        /*
            r11 = this;
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r11.f15247s
            boolean r0 = r0.F()
            if (r0 != 0) goto L_0x00d1
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r11.f15247s
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0012
            goto L_0x00d1
        L_0x0012:
            androidx.collection.MutableScatterSet r0 = r11.G()
            long r7 = r11.i()
            r9 = 0
            if (r0 == 0) goto L_0x002f
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s
            long r1 = r1.i()
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r11.f15247s
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r3.f()
            java.util.Map r1 = androidx.compose.runtime.snapshots.SnapshotKt.Y(r1, r11, r3)
            r5 = r1
            goto L_0x0030
        L_0x002f:
            r5 = r9
        L_0x0030:
            java.lang.Object r10 = androidx.compose.runtime.snapshots.SnapshotKt.O()
            monitor-enter(r10)
            androidx.compose.runtime.snapshots.SnapshotKt.o0(r11)     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0074
            int r1 = r0.c()     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x0041
            goto L_0x0074
        L_0x0041:
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            long r2 = r1.i()     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r1.f()     // Catch:{ all -> 0x0069 }
            r1 = r11
            r4 = r0
            androidx.compose.runtime.snapshots.SnapshotApplyResult r1 = r1.L(r2, r4, r5, r6)     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r2 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.f15262a     // Catch:{ all -> 0x0069 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r2)     // Catch:{ all -> 0x0069 }
            if (r2 != 0) goto L_0x005d
            monitor-exit(r10)
            return r1
        L_0x005d:
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            androidx.collection.MutableScatterSet r1 = r1.G()     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x006b
            r1.i(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0079
        L_0x0069:
            r0 = move-exception
            goto L_0x00cf
        L_0x006b:
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            r1.S(r0)     // Catch:{ all -> 0x0069 }
            r11.S(r9)     // Catch:{ all -> 0x0069 }
            goto L_0x0079
        L_0x0074:
            r11.b()     // Catch:{ all -> 0x0069 }
            kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0069 }
        L_0x0079:
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            long r1 = r1.i()     // Catch:{ all -> 0x0069 }
            int r1 = kotlin.jvm.internal.Intrinsics.l(r1, r7)     // Catch:{ all -> 0x0069 }
            if (r1 >= 0) goto L_0x008a
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            r1.D()     // Catch:{ all -> 0x0069 }
        L_0x008a:
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r1.f()     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.o(r7)     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r11.H()     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.n(r3)     // Catch:{ all -> 0x0069 }
            r1.u(r2)     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            r1.M(r7)     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            int r2 = r11.y()     // Catch:{ all -> 0x0069 }
            r1.O(r2)     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r11.H()     // Catch:{ all -> 0x0069 }
            r1.N(r2)     // Catch:{ all -> 0x0069 }
            androidx.compose.runtime.snapshots.MutableSnapshot r1 = r11.f15247s     // Catch:{ all -> 0x0069 }
            int[] r2 = r11.I()     // Catch:{ all -> 0x0069 }
            r1.P(r2)     // Catch:{ all -> 0x0069 }
            kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0069 }
            monitor-exit(r10)
            r1 = 1
            r11.R(r1)
            r11.W()
            androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.d(r11, r0)
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r0 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.f15262a
            return r0
        L_0x00cf:
            monitor-exit(r10)
            throw r0
        L_0x00d1:
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure r0 = new androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure
            r0.<init>(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.NestedMutableSnapshot.E():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    public final void W() {
        if (!this.f15248t) {
            this.f15248t = true;
            this.f15247s.n(this);
        }
    }

    public void d() {
        if (!e()) {
            super.d();
            W();
        }
    }
}
