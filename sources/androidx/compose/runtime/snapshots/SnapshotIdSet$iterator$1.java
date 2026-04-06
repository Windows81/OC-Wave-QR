package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend")
public final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f15275B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ SnapshotIdSet G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, Continuation continuation) {
        super(2, continuation);
        this.G = snapshotIdSet;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.G, continuation);
        snapshotIdSet$iterator$1.F = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 0
            r4 = 1
            r6 = 3
            r7 = 2
            r8 = 64
            r10 = 0
            r12 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r12) goto L_0x0039
            if (r2 == r7) goto L_0x002e
            if (r2 != r6) goto L_0x0026
            int r2 = r0.C
            java.lang.Object r7 = r0.F
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            kotlin.ResultKt.b(r19)
            r13 = r4
            goto L_0x00f0
        L_0x0026:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002e:
            int r2 = r0.C
            java.lang.Object r13 = r0.F
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            kotlin.ResultKt.b(r19)
            goto L_0x00b0
        L_0x0039:
            int r2 = r0.D
            int r13 = r0.C
            java.lang.Object r14 = r0.f15275B
            long[] r14 = (long[]) r14
            java.lang.Object r15 = r0.F
            kotlin.sequences.SequenceScope r15 = (kotlin.sequences.SequenceScope) r15
            kotlin.ResultKt.b(r19)
            goto L_0x0076
        L_0x0049:
            kotlin.ResultKt.b(r19)
            java.lang.Object r2 = r0.F
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r0.G
            long[] r13 = r13.C
            if (r13 == 0) goto L_0x0079
            int r14 = r13.length
            r15 = r2
            r2 = r14
            r14 = r13
            r13 = 0
        L_0x005d:
            if (r13 >= r2) goto L_0x0078
            r16 = r14[r13]
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.d(r16)
            r0.F = r15
            r0.f15275B = r14
            r0.C = r13
            r0.D = r2
            r0.E = r12
            java.lang.Object r9 = r15.c(r9, r0)
            if (r9 != r1) goto L_0x0076
            return r1
        L_0x0076:
            int r13 = r13 + r12
            goto L_0x005d
        L_0x0078:
            r2 = r15
        L_0x0079:
            androidx.compose.runtime.snapshots.SnapshotIdSet r9 = r0.G
            long r13 = r9.f15272A
            int r9 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x00b5
            r13 = r2
            r2 = 0
        L_0x0085:
            if (r2 >= r8) goto L_0x00b4
            androidx.compose.runtime.snapshots.SnapshotIdSet r9 = r0.G
            long r14 = r9.f15272A
            long r16 = r4 << r2
            long r14 = r14 & r16
            int r9 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x00b0
            androidx.compose.runtime.snapshots.SnapshotIdSet r9 = r0.G
            long r14 = r9.f15273B
            long r4 = (long) r2
            long r14 = r14 + r4
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.d(r14)
            r0.F = r13
            r0.f15275B = r3
            r0.C = r2
            r0.E = r7
            java.lang.Object r4 = r13.c(r4, r0)
            if (r4 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            int r2 = r2 + r12
            r4 = 1
            goto L_0x0085
        L_0x00b4:
            r2 = r13
        L_0x00b5:
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r0.G
            long r4 = r4.f15274z
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x00f5
            r7 = r2
            r9 = 0
        L_0x00c1:
            if (r9 >= r8) goto L_0x00f5
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.G
            long r4 = r2.f15274z
            r13 = 1
            long r15 = r13 << r9
            long r4 = r4 & r15
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00f1
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.G
            long r4 = r2.f15273B
            long r10 = (long) r9
            long r4 = r4 + r10
            long r10 = (long) r8
            long r4 = r4 + r10
            java.lang.Long r2 = kotlin.coroutines.jvm.internal.Boxing.d(r4)
            r0.F = r7
            r0.f15275B = r3
            r0.C = r9
            r0.E = r6
            java.lang.Object r2 = r7.c(r2, r0)
            if (r2 != r1) goto L_0x00ef
            return r1
        L_0x00ef:
            r2 = r9
        L_0x00f0:
            r9 = r2
        L_0x00f1:
            int r9 = r9 + r12
            r10 = 0
            goto L_0x00c1
        L_0x00f5:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((SnapshotIdSet$iterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
