package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {143, 147, 170}, m = "invokeSuspend")
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public int I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Function0 L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.L = function0;
    }

    public static final Unit D(MutableScatterSet mutableScatterSet, Object obj) {
        if (obj instanceof StateObjectImpl) {
            ((StateObjectImpl) obj).u(ReaderKind.a(4));
        }
        mutableScatterSet.h(obj);
        return Unit.f40552a;
    }

    public static final Unit E(Channel channel, Set set, Snapshot snapshot) {
        Set set2 = set;
        if (set2 instanceof ScatterSetWrapper) {
            ScatterSet e2 = ((ScatterSetWrapper) set2).e();
            Object[] objArr = e2.f1967b;
            long[] jArr = e2.f1966a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                loop0:
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= i3) {
                                if (i3 != 8) {
                                    break;
                                }
                            } else {
                                if ((255 & j2) < 128) {
                                    Object obj = objArr[(i2 << 3) + i4];
                                    if (!(obj instanceof StateObjectImpl) || ((StateObjectImpl) obj).t(ReaderKind.a(4))) {
                                        break loop0;
                                    }
                                }
                                j2 >>= 8;
                                i4++;
                            }
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return Unit.f40552a;
        }
        Iterable iterable = set2;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof StateObjectImpl) {
                    if (((StateObjectImpl) next).t(ReaderKind.a(4))) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Unit.f40552a;
        channel.L(set);
        return Unit.f40552a;
    }

    /* renamed from: C */
    public final Object m(FlowCollector flowCollector, Continuation continuation) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) s(flowCollector, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.L, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.K = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: kotlinx.coroutines.flow.FlowCollector} */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r14.s(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0145, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r14.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0149, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r14 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0028, B:20:0x009c, B:22:0x00a0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1 A[Catch:{ all -> 0x012f, all -> 0x012d, all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9 A[Catch:{ all -> 0x012f, all -> 0x012d, all -> 0x0055 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r13.J
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0070
            if (r1 == r5) goto L_0x0059
            if (r1 == r3) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            java.lang.Object r1 = r13.H
            java.lang.Object r6 = r13.G
            androidx.compose.runtime.snapshots.ObserverHandle r6 = (androidx.compose.runtime.snapshots.ObserverHandle) r6
            java.lang.Object r7 = r13.F
            kotlinx.coroutines.channels.Channel r7 = (kotlinx.coroutines.channels.Channel) r7
            java.lang.Object r8 = r13.E
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r13.D
            androidx.collection.MutableScatterSet r9 = (androidx.collection.MutableScatterSet) r9
            java.lang.Object r10 = r13.K
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
        L_0x0028:
            kotlin.ResultKt.b(r14)     // Catch:{ all -> 0x002d }
            goto L_0x00bf
        L_0x002d:
            r14 = move-exception
            goto L_0x014a
        L_0x0030:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0038:
            int r1 = r13.I
            java.lang.Object r6 = r13.H
            java.lang.Object r7 = r13.G
            androidx.compose.runtime.snapshots.ObserverHandle r7 = (androidx.compose.runtime.snapshots.ObserverHandle) r7
            java.lang.Object r8 = r13.F
            kotlinx.coroutines.channels.Channel r8 = (kotlinx.coroutines.channels.Channel) r8
            java.lang.Object r9 = r13.E
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r13.D
            androidx.collection.MutableScatterSet r10 = (androidx.collection.MutableScatterSet) r10
            java.lang.Object r11 = r13.K
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            kotlin.ResultKt.b(r14)     // Catch:{ all -> 0x0055 }
            goto L_0x00dd
        L_0x0055:
            r14 = move-exception
            r6 = r7
            goto L_0x014a
        L_0x0059:
            java.lang.Object r1 = r13.H
            java.lang.Object r6 = r13.G
            androidx.compose.runtime.snapshots.ObserverHandle r6 = (androidx.compose.runtime.snapshots.ObserverHandle) r6
            java.lang.Object r7 = r13.F
            kotlinx.coroutines.channels.Channel r7 = (kotlinx.coroutines.channels.Channel) r7
            java.lang.Object r8 = r13.E
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r13.D
            androidx.collection.MutableScatterSet r9 = (androidx.collection.MutableScatterSet) r9
            java.lang.Object r10 = r13.K
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            goto L_0x0028
        L_0x0070:
            kotlin.ResultKt.b(r14)
            java.lang.Object r14 = r13.K
            r10 = r14
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            androidx.collection.MutableScatterSet r9 = new androidx.collection.MutableScatterSet
            r14 = 0
            r9.<init>(r4, r5, r14)
            androidx.compose.runtime.z r8 = new androidx.compose.runtime.z
            r8.<init>(r9)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r6 = 6
            kotlinx.coroutines.channels.Channel r7 = kotlinx.coroutines.channels.ChannelKt.b(r1, r14, r14, r6, r14)
            androidx.compose.runtime.snapshots.Snapshot$Companion r14 = androidx.compose.runtime.snapshots.Snapshot.f15255e
            androidx.compose.runtime.A r1 = new androidx.compose.runtime.A
            r1.<init>(r7)
            androidx.compose.runtime.snapshots.ObserverHandle r6 = r14.i(r1)
            androidx.compose.runtime.snapshots.Snapshot r14 = r14.p(r8)     // Catch:{ all -> 0x002d }
            kotlin.jvm.functions.Function0 r1 = r13.L     // Catch:{ all -> 0x002d }
            androidx.compose.runtime.snapshots.Snapshot r11 = r14.l()     // Catch:{ all -> 0x013f }
            java.lang.Object r1 = r1.invoke()     // Catch:{ all -> 0x0141 }
            r14.s(r11)     // Catch:{ all -> 0x013f }
            r14.d()     // Catch:{ all -> 0x002d }
            r13.K = r10     // Catch:{ all -> 0x002d }
            r13.D = r9     // Catch:{ all -> 0x002d }
            r13.E = r8     // Catch:{ all -> 0x002d }
            r13.F = r7     // Catch:{ all -> 0x002d }
            r13.G = r6     // Catch:{ all -> 0x002d }
            r13.H = r1     // Catch:{ all -> 0x002d }
            r13.J = r5     // Catch:{ all -> 0x002d }
            java.lang.Object r14 = r10.c(r1, r13)     // Catch:{ all -> 0x002d }
            if (r14 != r0) goto L_0x00bf
            return r0
        L_0x00bf:
            r13.K = r10     // Catch:{ all -> 0x002d }
            r13.D = r9     // Catch:{ all -> 0x002d }
            r13.E = r8     // Catch:{ all -> 0x002d }
            r13.F = r7     // Catch:{ all -> 0x002d }
            r13.G = r6     // Catch:{ all -> 0x002d }
            r13.H = r1     // Catch:{ all -> 0x002d }
            r13.I = r4     // Catch:{ all -> 0x002d }
            r13.J = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r14 = r7.v(r13)     // Catch:{ all -> 0x002d }
            if (r14 != r0) goto L_0x00d6
            return r0
        L_0x00d6:
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r4
        L_0x00dd:
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0055 }
        L_0x00df:
            if (r1 != 0) goto L_0x00ea
            boolean r14 = androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.d(r10, r14)     // Catch:{ all -> 0x0055 }
            if (r14 == 0) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            r1 = r4
            goto L_0x00eb
        L_0x00ea:
            r1 = r5
        L_0x00eb:
            java.lang.Object r14 = r8.n()     // Catch:{ all -> 0x0055 }
            java.lang.Object r14 = kotlinx.coroutines.channels.ChannelResult.f(r14)     // Catch:{ all -> 0x0055 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0055 }
            if (r14 != 0) goto L_0x00df
            if (r1 == 0) goto L_0x0138
            r10.m()     // Catch:{ all -> 0x0055 }
            androidx.compose.runtime.snapshots.Snapshot$Companion r14 = androidx.compose.runtime.snapshots.Snapshot.f15255e     // Catch:{ all -> 0x0055 }
            androidx.compose.runtime.snapshots.Snapshot r14 = r14.p(r9)     // Catch:{ all -> 0x0055 }
            kotlin.jvm.functions.Function0 r1 = r13.L     // Catch:{ all -> 0x0055 }
            androidx.compose.runtime.snapshots.Snapshot r12 = r14.l()     // Catch:{ all -> 0x012d }
            java.lang.Object r1 = r1.invoke()     // Catch:{ all -> 0x012f }
            r14.s(r12)     // Catch:{ all -> 0x012d }
            r14.d()     // Catch:{ all -> 0x0055 }
            boolean r14 = kotlin.jvm.internal.Intrinsics.d(r1, r6)     // Catch:{ all -> 0x0055 }
            if (r14 != 0) goto L_0x0138
            r13.K = r11     // Catch:{ all -> 0x0055 }
            r13.D = r10     // Catch:{ all -> 0x0055 }
            r13.E = r9     // Catch:{ all -> 0x0055 }
            r13.F = r8     // Catch:{ all -> 0x0055 }
            r13.G = r7     // Catch:{ all -> 0x0055 }
            r13.H = r1     // Catch:{ all -> 0x0055 }
            r13.J = r2     // Catch:{ all -> 0x0055 }
            java.lang.Object r14 = r11.c(r1, r13)     // Catch:{ all -> 0x0055 }
            if (r14 != r0) goto L_0x0139
            return r0
        L_0x012d:
            r0 = move-exception
            goto L_0x0134
        L_0x012f:
            r0 = move-exception
            r14.s(r12)     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x0134:
            r14.d()     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0138:
            r1 = r6
        L_0x0139:
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            goto L_0x00bf
        L_0x013f:
            r0 = move-exception
            goto L_0x0146
        L_0x0141:
            r0 = move-exception
            r14.s(r11)     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ all -> 0x013f }
        L_0x0146:
            r14.d()     // Catch:{ all -> 0x002d }
            throw r0     // Catch:{ all -> 0x002d }
        L_0x014a:
            r6.d()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.x(java.lang.Object):java.lang.Object");
    }
}
