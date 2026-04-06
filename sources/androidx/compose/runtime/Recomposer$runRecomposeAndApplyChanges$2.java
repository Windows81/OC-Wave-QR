package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {587, 598}, m = "invokeSuspend")
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ Recomposer N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation continuation) {
        super(3, continuation);
        this.N = recomposer;
    }

    public static final void C(Recomposer recomposer, List list, List list2, List list3, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, MutableScatterSet mutableScatterSet3, MutableScatterSet mutableScatterSet4) {
        Recomposer recomposer2 = recomposer;
        List list4 = list3;
        MutableScatterSet mutableScatterSet5 = mutableScatterSet;
        MutableScatterSet mutableScatterSet6 = mutableScatterSet2;
        MutableScatterSet mutableScatterSet7 = mutableScatterSet4;
        synchronized (recomposer.f14792c) {
            try {
                list.clear();
                list2.clear();
                int size = list4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ControlledComposition controlledComposition = (ControlledComposition) list4.get(i2);
                    controlledComposition.w();
                    recomposer2.T0(controlledComposition);
                }
                list3.clear();
                Object[] objArr = mutableScatterSet5.f1967b;
                long[] jArr = mutableScatterSet5.f1966a;
                int length = jArr.length - 2;
                long j2 = -9187201950435737472L;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j3 = jArr[i3];
                        int i4 = length;
                        if ((((~j3) << 7) & j3 & j2) != j2) {
                            int i5 = 8 - ((~(i3 - i4)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j3 & 255) < 128) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i3 << 3) + i6];
                                    controlledComposition2.w();
                                    recomposer2.T0(controlledComposition2);
                                }
                                j3 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        length = i4;
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        j2 = -9187201950435737472L;
                    }
                }
                mutableScatterSet.m();
                Object[] objArr2 = mutableScatterSet6.f1967b;
                long[] jArr2 = mutableScatterSet6.f1966a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j4 = jArr2[i7];
                        if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((j4 & 255) < 128) {
                                    ((ControlledComposition) objArr2[(i7 << 3) + i9]).x();
                                }
                                j4 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i7 == length2) {
                            break;
                        }
                        i7++;
                    }
                }
                mutableScatterSet2.m();
                mutableScatterSet3.m();
                Object[] objArr3 = mutableScatterSet7.f1967b;
                long[] jArr3 = mutableScatterSet7.f1966a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j5 = jArr3[i10];
                        if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length3)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j5 & 255) < 128) {
                                    ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i10 << 3) + i12];
                                    controlledComposition3.w();
                                    recomposer2.T0(controlledComposition3);
                                }
                                j5 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length3) {
                            break;
                        }
                        i10++;
                    }
                }
                mutableScatterSet4.m();
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void D(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f14792c) {
            try {
                List O = recomposer.f14800k;
                int size = O.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.add((MovableContentStateReference) O.get(i2));
                }
                recomposer.f14800k.clear();
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: androidx.compose.runtime.snapshots.TransparentObserverSnapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: androidx.compose.runtime.snapshots.Snapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: androidx.compose.runtime.snapshots.TransparentObserverSnapshot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: androidx.compose.runtime.snapshots.TransparentObserverSnapshot} */
    /* JADX WARNING: type inference failed for: r11v26 */
    /* JADX WARNING: type inference failed for: r11v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01b2, code lost:
        if (r12 == 8) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0249, code lost:
        if (r13 == 8) goto L_0x0252;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03d8 A[Catch:{ all -> 0x0338, all -> 0x02b0, all -> 0x0063, all -> 0x00ab }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:71:0x0134=Splitter:B:71:0x0134, B:190:0x02be=Splitter:B:190:0x02be} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Unit E(androidx.compose.runtime.Recomposer r26, androidx.collection.MutableScatterSet r27, androidx.collection.MutableScatterSet r28, java.util.List r29, java.util.List r30, androidx.collection.MutableScatterSet r31, java.util.List r32, androidx.collection.MutableScatterSet r33, java.util.Set r34, long r35) {
        /*
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r0 = 1
            boolean r1 = r26.y0()
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = "Recomposer:animation"
            androidx.compose.runtime.internal.Trace r2 = androidx.compose.runtime.internal.Trace.f15156a
            java.lang.Object r1 = r2.a(r1)
            androidx.compose.runtime.BroadcastFrameClock r3 = r26.f14791b     // Catch:{ all -> 0x0033 }
            r4 = r35
            r3.s(r4)     // Catch:{ all -> 0x0033 }
            androidx.compose.runtime.snapshots.Snapshot$Companion r3 = androidx.compose.runtime.snapshots.Snapshot.f15255e     // Catch:{ all -> 0x0033 }
            r3.n()     // Catch:{ all -> 0x0033 }
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0033 }
            r2.b(r1)
            goto L_0x003a
        L_0x0033:
            r0 = move-exception
            androidx.compose.runtime.internal.Trace r2 = androidx.compose.runtime.internal.Trace.f15156a
            r2.b(r1)
            throw r0
        L_0x003a:
            java.lang.String r1 = "Recomposer:recompose"
            androidx.compose.runtime.internal.Trace r2 = androidx.compose.runtime.internal.Trace.f15156a
            java.lang.Object r15 = r2.a(r1)
            boolean unused = r26.S0()     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r26.f14792c     // Catch:{ all -> 0x00ab }
            monitor-enter(r1)     // Catch:{ all -> 0x00ab }
            androidx.compose.runtime.collection.MutableVector r2 = r26.f14798i     // Catch:{ all -> 0x0063 }
            java.lang.Object[] r3 = r2.f15005z     // Catch:{ all -> 0x0063 }
            int r2 = r2.p()     // Catch:{ all -> 0x0063 }
            r5 = 0
        L_0x0055:
            if (r5 >= r2) goto L_0x0066
            r6 = r3[r5]     // Catch:{ all -> 0x0063 }
            androidx.compose.runtime.ControlledComposition r6 = (androidx.compose.runtime.ControlledComposition) r6     // Catch:{ all -> 0x0063 }
            r4 = r10
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x0063 }
            r4.add(r6)     // Catch:{ all -> 0x0063 }
            int r5 = r5 + r0
            goto L_0x0055
        L_0x0063:
            r0 = move-exception
            goto L_0x0405
        L_0x0066:
            androidx.compose.runtime.collection.MutableVector r2 = r26.f14798i     // Catch:{ all -> 0x0063 }
            r2.l()     // Catch:{ all -> 0x0063 }
            kotlin.Unit r2 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0063 }
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            r27.m()     // Catch:{ all -> 0x00ab }
            r28.m()     // Catch:{ all -> 0x00ab }
        L_0x0076:
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x00ab }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ab }
            r2 = 0
            if (r1 == 0) goto L_0x02c2
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x00ab }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x008b
            goto L_0x02c2
        L_0x008b:
            androidx.compose.runtime.snapshots.Snapshot$Companion r1 = androidx.compose.runtime.snapshots.Snapshot.f15255e     // Catch:{ all -> 0x00ab }
            androidx.compose.runtime.snapshots.Snapshot r1 = r1.c()     // Catch:{ all -> 0x00ab }
            boolean r3 = r1 instanceof androidx.compose.runtime.snapshots.MutableSnapshot     // Catch:{ all -> 0x00ab }
            if (r3 == 0) goto L_0x00ae
            androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot r3 = new androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot     // Catch:{ all -> 0x00ab }
            r17 = r1
            androidx.compose.runtime.snapshots.MutableSnapshot r17 = (androidx.compose.runtime.snapshots.MutableSnapshot) r17     // Catch:{ all -> 0x00ab }
            r20 = 1
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00ab }
            r6 = r3
            r4 = 0
            goto L_0x00b5
        L_0x00ab:
            r0 = move-exception
            goto L_0x0407
        L_0x00ae:
            androidx.compose.runtime.snapshots.TransparentObserverSnapshot r3 = new androidx.compose.runtime.snapshots.TransparentObserverSnapshot     // Catch:{ all -> 0x00ab }
            r4 = 0
            r3.<init>(r1, r2, r0, r4)     // Catch:{ all -> 0x00ab }
            r6 = r3
        L_0x00b5:
            androidx.compose.runtime.snapshots.Snapshot r5 = r6.l()     // Catch:{ all -> 0x02bc }
            r1 = r13
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x02b4 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x02b4 }
            if (r1 != 0) goto L_0x0158
            long r16 = r26.w0()     // Catch:{ all -> 0x0154 }
            r18 = 1
            r34 = r5
            long r4 = r16 + r18
            r7.f14790a = r4     // Catch:{ all -> 0x014f }
            r1 = r13
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x00e4 }
            int r1 = r1.size()     // Catch:{ all -> 0x00e4 }
            r3 = 0
        L_0x00d7:
            if (r3 >= r1) goto L_0x00e7
            java.lang.Object r4 = r13.get(r3)     // Catch:{ all -> 0x00e4 }
            androidx.compose.runtime.ControlledComposition r4 = (androidx.compose.runtime.ControlledComposition) r4     // Catch:{ all -> 0x00e4 }
            r14.h(r4)     // Catch:{ all -> 0x00e4 }
            int r3 = r3 + r0
            goto L_0x00d7
        L_0x00e4:
            r0 = move-exception
            r2 = r0
            goto L_0x010a
        L_0x00e7:
            r1 = r13
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x00e4 }
            int r1 = r1.size()     // Catch:{ all -> 0x00e4 }
            r3 = 0
        L_0x00ef:
            if (r3 >= r1) goto L_0x00fc
            java.lang.Object r4 = r13.get(r3)     // Catch:{ all -> 0x00e4 }
            androidx.compose.runtime.ControlledComposition r4 = (androidx.compose.runtime.ControlledComposition) r4     // Catch:{ all -> 0x00e4 }
            r4.o()     // Catch:{ all -> 0x00e4 }
            int r3 = r3 + r0
            goto L_0x00ef
        L_0x00fc:
            r32.clear()     // Catch:{ all -> 0x0104 }
            r11 = r6
            r6 = r34
            goto L_0x015a
        L_0x0104:
            r0 = move-exception
            r12 = r34
        L_0x0107:
            r11 = r6
            goto L_0x02b8
        L_0x010a:
            r5 = 6
            r0 = 0
            r3 = 0
            r4 = 0
            r1 = r26
            r22 = r34
            r11 = r6
            r6 = r0
            androidx.compose.runtime.Recomposer.O0(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0146 }
            r1 = r26
            r2 = r29
            r3 = r30
            r4 = r32
            r5 = r31
            r6 = r33
            r7 = r27
            r8 = r28
            C(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0146 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0146 }
            r32.clear()     // Catch:{ all -> 0x0140 }
            r6 = r22
            r11.s(r6)     // Catch:{ all -> 0x013d }
        L_0x0134:
            r11.d()     // Catch:{ all -> 0x00ab }
        L_0x0137:
            androidx.compose.runtime.internal.Trace r1 = androidx.compose.runtime.internal.Trace.f15156a
            r1.b(r15)
            return r0
        L_0x013d:
            r0 = move-exception
            goto L_0x02be
        L_0x0140:
            r0 = move-exception
            r6 = r22
        L_0x0143:
            r12 = r6
            goto L_0x02b8
        L_0x0146:
            r0 = move-exception
            r6 = r22
            r32.clear()     // Catch:{ all -> 0x014d }
            throw r0     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            goto L_0x0143
        L_0x014f:
            r0 = move-exception
            r11 = r6
            r6 = r34
            goto L_0x0143
        L_0x0154:
            r0 = move-exception
            r11 = r6
            r6 = r5
            goto L_0x0143
        L_0x0158:
            r11 = r6
            r6 = r5
        L_0x015a:
            boolean r1 = r31.e()     // Catch:{ all -> 0x014d }
            r16 = 255(0xff, double:1.26E-321)
            r5 = 7
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r1 == 0) goto L_0x01c9
            r14.v(r12)     // Catch:{ all -> 0x01a4 }
            java.lang.Object[] r1 = r12.f1967b     // Catch:{ all -> 0x01a4 }
            long[] r0 = r12.f1966a     // Catch:{ all -> 0x01a4 }
            int r3 = r0.length     // Catch:{ all -> 0x01a4 }
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x01c6
            r23 = r3
            r4 = 0
        L_0x0177:
            r2 = r0[r4]     // Catch:{ all -> 0x01a4 }
            long r12 = ~r2     // Catch:{ all -> 0x01a4 }
            long r12 = r12 << r5
            long r12 = r12 & r2
            long r12 = r12 & r18
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 == 0) goto L_0x01b7
            int r12 = r4 - r23
            int r12 = ~r12     // Catch:{ all -> 0x01a4 }
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r13 = 0
        L_0x018c:
            if (r13 >= r12) goto L_0x01ae
            long r24 = r2 & r16
            r21 = 128(0x80, double:6.32E-322)
            int r24 = (r24 > r21 ? 1 : (r24 == r21 ? 0 : -1))
            if (r24 >= 0) goto L_0x01a1
            int r24 = r4 << 3
            int r24 = r24 + r13
            r24 = r1[r24]     // Catch:{ all -> 0x01a4 }
            androidx.compose.runtime.ControlledComposition r24 = (androidx.compose.runtime.ControlledComposition) r24     // Catch:{ all -> 0x01a4 }
            r24.h()     // Catch:{ all -> 0x01a4 }
        L_0x01a1:
            r5 = 8
            goto L_0x01a7
        L_0x01a4:
            r0 = move-exception
            r2 = r0
            goto L_0x01cb
        L_0x01a7:
            long r2 = r2 >> r5
            r20 = 1
            int r13 = r13 + 1
            r5 = 7
            goto L_0x018c
        L_0x01ae:
            r5 = 8
            r20 = 1
            if (r12 != r5) goto L_0x01c6
        L_0x01b4:
            r3 = r23
            goto L_0x01ba
        L_0x01b7:
            r20 = 1
            goto L_0x01b4
        L_0x01ba:
            if (r4 == r3) goto L_0x01c6
            int r4 = r4 + 1
            r12 = r31
            r13 = r32
            r23 = r3
            r5 = 7
            goto L_0x0177
        L_0x01c6:
            r31.m()     // Catch:{ all -> 0x014d }
        L_0x01c9:
            r12 = r6
            goto L_0x01fb
        L_0x01cb:
            r5 = 6
            r0 = 0
            r3 = 0
            r4 = 0
            r1 = r26
            r12 = r6
            r6 = r0
            androidx.compose.runtime.Recomposer.O0(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01f6 }
            r1 = r26
            r2 = r29
            r3 = r30
            r4 = r32
            r5 = r31
            r6 = r33
            r7 = r27
            r8 = r28
            C(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01f6 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x01f6 }
            r31.m()     // Catch:{ all -> 0x01f3 }
            r11.s(r12)     // Catch:{ all -> 0x013d }
            goto L_0x0134
        L_0x01f3:
            r0 = move-exception
            goto L_0x02b8
        L_0x01f6:
            r0 = move-exception
            r31.m()     // Catch:{ all -> 0x01f3 }
            throw r0     // Catch:{ all -> 0x01f3 }
        L_0x01fb:
            boolean r0 = r33.e()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0288
            java.lang.Object[] r0 = r14.f1967b     // Catch:{ all -> 0x0239 }
            long[] r1 = r14.f1966a     // Catch:{ all -> 0x0239 }
            int r2 = r1.length     // Catch:{ all -> 0x0239 }
            int r2 = r2 + -2
            if (r2 < 0) goto L_0x0259
            r3 = 0
        L_0x020b:
            r4 = r1[r3]     // Catch:{ all -> 0x0239 }
            long r13 = ~r4     // Catch:{ all -> 0x0239 }
            r6 = 7
            long r13 = r13 << r6
            long r13 = r13 & r4
            long r13 = r13 & r18
            int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r13 == 0) goto L_0x024c
            int r13 = r3 - r2
            int r13 = ~r13     // Catch:{ all -> 0x0239 }
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r14 = 0
        L_0x0221:
            if (r14 >= r13) goto L_0x0243
            long r23 = r4 & r16
            r21 = 128(0x80, double:6.32E-322)
            int r23 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r23 >= 0) goto L_0x0236
            int r23 = r3 << 3
            int r23 = r23 + r14
            r23 = r0[r23]     // Catch:{ all -> 0x0239 }
            androidx.compose.runtime.ControlledComposition r23 = (androidx.compose.runtime.ControlledComposition) r23     // Catch:{ all -> 0x0239 }
            r23.x()     // Catch:{ all -> 0x0239 }
        L_0x0236:
            r6 = 8
            goto L_0x023c
        L_0x0239:
            r0 = move-exception
            r2 = r0
            goto L_0x025d
        L_0x023c:
            long r4 = r4 >> r6
            r20 = 1
            int r14 = r14 + 1
            r6 = 7
            goto L_0x0221
        L_0x0243:
            r6 = 8
            r20 = 1
            r21 = 128(0x80, double:6.32E-322)
            if (r13 != r6) goto L_0x0259
            goto L_0x0252
        L_0x024c:
            r6 = 8
            r20 = 1
            r21 = 128(0x80, double:6.32E-322)
        L_0x0252:
            if (r3 == r2) goto L_0x0259
            int r3 = r3 + 1
            r14 = r33
            goto L_0x020b
        L_0x0259:
            r33.m()     // Catch:{ all -> 0x01f3 }
            goto L_0x0288
        L_0x025d:
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r26
            androidx.compose.runtime.Recomposer.O0(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0283 }
            r1 = r26
            r2 = r29
            r3 = r30
            r4 = r32
            r5 = r31
            r6 = r33
            r7 = r27
            r8 = r28
            C(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0283 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0283 }
            r33.m()     // Catch:{ all -> 0x01f3 }
            r11.s(r12)     // Catch:{ all -> 0x013d }
            goto L_0x0134
        L_0x0283:
            r0 = move-exception
            r33.m()     // Catch:{ all -> 0x01f3 }
            throw r0     // Catch:{ all -> 0x01f3 }
        L_0x0288:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x01f3 }
            r11.s(r12)     // Catch:{ all -> 0x013d }
            r11.d()     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r26.f14792c     // Catch:{ all -> 0x00ab }
            monitor-enter(r1)     // Catch:{ all -> 0x00ab }
            kotlinx.coroutines.CancellableContinuation unused = r26.s0()     // Catch:{ all -> 0x02b0 }
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            androidx.compose.runtime.snapshots.Snapshot$Companion r0 = androidx.compose.runtime.snapshots.Snapshot.f15255e     // Catch:{ all -> 0x00ab }
            r0.g()     // Catch:{ all -> 0x00ab }
            r28.m()     // Catch:{ all -> 0x00ab }
            r27.m()     // Catch:{ all -> 0x00ab }
            r0 = 0
            r7.f14806q = r0     // Catch:{ all -> 0x00ab }
            androidx.compose.runtime.internal.Trace r0 = androidx.compose.runtime.internal.Trace.f15156a
            r0.b(r15)
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        L_0x02b0:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            throw r2     // Catch:{ all -> 0x00ab }
        L_0x02b4:
            r0 = move-exception
            r12 = r5
            goto L_0x0107
        L_0x02b8:
            r11.s(r12)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x02bc:
            r0 = move-exception
            r11 = r6
        L_0x02be:
            r11.d()     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x02c2:
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x02e2 }
            int r0 = r0.size()     // Catch:{ all -> 0x02e2 }
            r1 = 0
        L_0x02ca:
            if (r1 >= r0) goto L_0x02f0
            java.lang.Object r2 = r10.get(r1)     // Catch:{ all -> 0x02e2 }
            androidx.compose.runtime.ControlledComposition r2 = (androidx.compose.runtime.ControlledComposition) r2     // Catch:{ all -> 0x02e2 }
            androidx.compose.runtime.ControlledComposition r3 = r7.L0(r2, r8)     // Catch:{ all -> 0x02e2 }
            if (r3 == 0) goto L_0x02ea
            r4 = r32
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x02e2 }
            r4.add(r3)     // Catch:{ all -> 0x02e2 }
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x02e2 }
            goto L_0x02ea
        L_0x02e2:
            r0 = move-exception
            r11 = r30
            r12 = r31
            r2 = r0
            goto L_0x03dd
        L_0x02ea:
            r9.h(r2)     // Catch:{ all -> 0x02e2 }
            r2 = 1
            int r1 = r1 + r2
            goto L_0x02ca
        L_0x02f0:
            r29.clear()     // Catch:{ all -> 0x00ab }
            boolean r0 = r27.e()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0309
            androidx.compose.runtime.collection.MutableVector r0 = r26.f14798i     // Catch:{ all -> 0x00ab }
            int r0 = r0.p()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0304
            goto L_0x0309
        L_0x0304:
            r5 = r34
            r6 = 1
            goto L_0x0385
        L_0x0309:
            java.lang.Object r1 = r26.f14792c     // Catch:{ all -> 0x00ab }
            monitor-enter(r1)     // Catch:{ all -> 0x00ab }
            java.util.List r0 = r26.G0()     // Catch:{ all -> 0x0338 }
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0338 }
            int r2 = r2.size()     // Catch:{ all -> 0x0338 }
            r3 = 0
        L_0x031a:
            if (r3 >= r2) goto L_0x0340
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0338 }
            androidx.compose.runtime.ControlledComposition r4 = (androidx.compose.runtime.ControlledComposition) r4     // Catch:{ all -> 0x0338 }
            boolean r5 = r9.a(r4)     // Catch:{ all -> 0x0338 }
            if (r5 != 0) goto L_0x033b
            r5 = r34
            boolean r6 = r4.f(r5)     // Catch:{ all -> 0x0338 }
            if (r6 == 0) goto L_0x0336
            r6 = r10
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x0338 }
            r6.add(r4)     // Catch:{ all -> 0x0338 }
        L_0x0336:
            r4 = 1
            goto L_0x033e
        L_0x0338:
            r0 = move-exception
            goto L_0x03db
        L_0x033b:
            r5 = r34
            goto L_0x0336
        L_0x033e:
            int r3 = r3 + r4
            goto L_0x031a
        L_0x0340:
            r5 = r34
            androidx.compose.runtime.collection.MutableVector r0 = r26.f14798i     // Catch:{ all -> 0x0338 }
            int r2 = r0.p()     // Catch:{ all -> 0x0338 }
            r3 = 0
            r4 = 0
        L_0x034c:
            if (r3 >= r2) goto L_0x0376
            java.lang.Object[] r6 = r0.f15005z     // Catch:{ all -> 0x0338 }
            r6 = r6[r3]     // Catch:{ all -> 0x0338 }
            androidx.compose.runtime.ControlledComposition r6 = (androidx.compose.runtime.ControlledComposition) r6     // Catch:{ all -> 0x0338 }
            boolean r11 = r9.a(r6)     // Catch:{ all -> 0x0338 }
            if (r11 != 0) goto L_0x0369
            boolean r11 = r10.contains(r6)     // Catch:{ all -> 0x0338 }
            if (r11 != 0) goto L_0x0369
            r11 = r10
            java.util.Collection r11 = (java.util.Collection) r11     // Catch:{ all -> 0x0338 }
            r11.add(r6)     // Catch:{ all -> 0x0338 }
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0374
        L_0x0369:
            if (r4 <= 0) goto L_0x0373
            java.lang.Object[] r6 = r0.f15005z     // Catch:{ all -> 0x0338 }
            int r11 = r3 - r4
            r12 = r6[r3]     // Catch:{ all -> 0x0338 }
            r6[r11] = r12     // Catch:{ all -> 0x0338 }
        L_0x0373:
            r6 = 1
        L_0x0374:
            int r3 = r3 + r6
            goto L_0x034c
        L_0x0376:
            r6 = 1
            java.lang.Object[] r3 = r0.f15005z     // Catch:{ all -> 0x0338 }
            int r4 = r2 - r4
            r11 = 0
            kotlin.collections.ArraysKt.w(r3, r11, r4, r2)     // Catch:{ all -> 0x0338 }
            r0.D(r4)     // Catch:{ all -> 0x0338 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0338 }
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
        L_0x0385:
            boolean r0 = r29.isEmpty()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x03d8
            r11 = r30
            D(r11, r7)     // Catch:{ all -> 0x03ab }
        L_0x0390:
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x03ab }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x03ab }
            if (r0 != 0) goto L_0x03af
            java.util.List r0 = r7.K0(r11, r8)     // Catch:{ all -> 0x03ab }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x03ab }
            r12 = r31
            r12.w(r0)     // Catch:{ all -> 0x03a8 }
            D(r11, r7)     // Catch:{ all -> 0x03a8 }
            goto L_0x0390
        L_0x03a8:
            r0 = move-exception
        L_0x03a9:
            r2 = r0
            goto L_0x03b8
        L_0x03ab:
            r0 = move-exception
            r12 = r31
            goto L_0x03a9
        L_0x03af:
            r12 = r31
            r13 = r32
            r14 = r33
            r0 = r6
            goto L_0x0076
        L_0x03b8:
            r5 = 2
            r6 = 0
            r3 = 0
            r4 = 1
            r1 = r26
            androidx.compose.runtime.Recomposer.O0(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00ab }
            r1 = r26
            r2 = r29
            r3 = r30
            r4 = r32
            r5 = r31
            r6 = r33
            r7 = r27
            r8 = r28
            C(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00ab }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00ab }
            goto L_0x0137
        L_0x03d8:
            r11 = r30
            goto L_0x03af
        L_0x03db:
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x03dd:
            r5 = 2
            r6 = 0
            r3 = 0
            r4 = 1
            r1 = r26
            androidx.compose.runtime.Recomposer.O0(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0400 }
            r1 = r26
            r2 = r29
            r3 = r30
            r4 = r32
            r5 = r31
            r6 = r33
            r7 = r27
            r8 = r28
            C(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0400 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0400 }
            r29.clear()     // Catch:{ all -> 0x00ab }
            goto L_0x0137
        L_0x0400:
            r0 = move-exception
            r29.clear()     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x0405:
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x0407:
            androidx.compose.runtime.internal.Trace r1 = androidx.compose.runtime.internal.Trace.f15156a
            r1.b(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.E(androidx.compose.runtime.Recomposer, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, java.util.List, java.util.List, androidx.collection.MutableScatterSet, java.util.List, androidx.collection.MutableScatterSet, java.util.Set, long):kotlin.Unit");
    }

    /* renamed from: B */
    public final Object d(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.N, continuation);
        recomposer$runRecomposeAndApplyChanges$2.M = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.x(Unit.f40552a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.L
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0089
            if (r2 == r4) goto L_0x0058
            if (r2 != r3) goto L_0x0050
            java.lang.Object r2 = r0.K
            androidx.collection.MutableScatterSet r2 = (androidx.collection.MutableScatterSet) r2
            java.lang.Object r5 = r0.J
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.I
            androidx.collection.MutableScatterSet r6 = (androidx.collection.MutableScatterSet) r6
            java.lang.Object r7 = r0.H
            androidx.collection.MutableScatterSet r7 = (androidx.collection.MutableScatterSet) r7
            java.lang.Object r8 = r0.G
            androidx.collection.MutableScatterSet r8 = (androidx.collection.MutableScatterSet) r8
            java.lang.Object r9 = r0.F
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.E
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.D
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.M
            androidx.compose.runtime.MonotonicFrameClock r12 = (androidx.compose.runtime.MonotonicFrameClock) r12
            kotlin.ResultKt.b(r26)
            r21 = r10
            r10 = r1
            r1 = r8
            r8 = r3
            r3 = r6
            r6 = r21
            r22 = r12
            r12 = r2
            r2 = r22
            r23 = r11
            r11 = r5
            r5 = r23
            r24 = r9
            r9 = r7
            r7 = r24
            goto L_0x0142
        L_0x0050:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0058:
            java.lang.Object r2 = r0.K
            androidx.collection.MutableScatterSet r2 = (androidx.collection.MutableScatterSet) r2
            java.lang.Object r5 = r0.J
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.I
            androidx.collection.MutableScatterSet r6 = (androidx.collection.MutableScatterSet) r6
            java.lang.Object r7 = r0.H
            androidx.collection.MutableScatterSet r7 = (androidx.collection.MutableScatterSet) r7
            java.lang.Object r8 = r0.G
            androidx.collection.MutableScatterSet r8 = (androidx.collection.MutableScatterSet) r8
            java.lang.Object r9 = r0.F
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.E
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.D
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.M
            androidx.compose.runtime.MonotonicFrameClock r12 = (androidx.compose.runtime.MonotonicFrameClock) r12
            kotlin.ResultKt.b(r26)
            r13 = r9
            r14 = r10
            r15 = r11
            r9 = r5
            r10 = r6
            r11 = r7
            r7 = r2
            r2 = r12
            r12 = r8
            goto L_0x00e5
        L_0x0089:
            kotlin.ResultKt.b(r26)
            java.lang.Object r2 = r0.M
            androidx.compose.runtime.MonotonicFrameClock r2 = (androidx.compose.runtime.MonotonicFrameClock) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            androidx.collection.MutableScatterSet r8 = androidx.collection.ScatterSetKt.a()
            androidx.collection.MutableScatterSet r9 = androidx.collection.ScatterSetKt.a()
            androidx.collection.MutableScatterSet r10 = new androidx.collection.MutableScatterSet
            r11 = 0
            r12 = 0
            r10.<init>(r11, r4, r12)
            java.util.Set r11 = androidx.compose.runtime.collection.ScatterSetWrapperKt.a(r10)
            androidx.collection.MutableScatterSet r12 = androidx.collection.ScatterSetKt.a()
        L_0x00b6:
            androidx.compose.runtime.Recomposer r13 = r0.N
            boolean r13 = r13.D0()
            if (r13 == 0) goto L_0x0166
            androidx.compose.runtime.Recomposer r13 = r0.N
            r0.M = r2
            r0.D = r5
            r0.E = r6
            r0.F = r7
            r0.G = r8
            r0.H = r9
            r0.I = r10
            r0.J = r11
            r0.K = r12
            r0.L = r4
            java.lang.Object r13 = r13.m0(r0)
            if (r13 != r1) goto L_0x00db
            return r1
        L_0x00db:
            r15 = r5
            r14 = r6
            r13 = r7
            r7 = r12
            r12 = r8
            r21 = r11
            r11 = r9
            r9 = r21
        L_0x00e5:
            androidx.compose.runtime.Recomposer r5 = r0.N
            boolean r5 = r5.S0()
            if (r5 == 0) goto L_0x0151
            androidx.compose.runtime.Recomposer r6 = r0.N
            androidx.compose.runtime.y r8 = new androidx.compose.runtime.y
            r5 = r8
            r26 = r7
            r7 = r10
            r4 = r8
            r8 = r26
            r16 = r9
            r9 = r15
            r3 = r10
            r10 = r14
            r17 = r11
            r11 = r12
            r18 = r1
            r1 = r12
            r12 = r13
            r19 = r4
            r4 = r13
            r13 = r17
            r20 = r3
            r3 = r14
            r14 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.M = r2
            r0.D = r15
            r0.E = r3
            r0.F = r4
            r0.G = r1
            r7 = r17
            r0.H = r7
            r6 = r20
            r0.I = r6
            r5 = r16
            r0.J = r5
            r12 = r26
            r0.K = r12
            r8 = 2
            r0.L = r8
            r9 = r19
            java.lang.Object r9 = r2.Q(r9, r0)
            r10 = r18
            if (r9 != r10) goto L_0x0139
            return r10
        L_0x0139:
            r11 = r5
            r9 = r7
            r5 = r15
            r7 = r4
            r21 = r6
            r6 = r3
            r3 = r21
        L_0x0142:
            androidx.compose.runtime.Recomposer r4 = r0.N
            r4.t0()
            r4 = 1
            r21 = r8
            r8 = r1
            r1 = r10
            r10 = r3
        L_0x014d:
            r3 = r21
            goto L_0x00b6
        L_0x0151:
            r8 = r3
            r5 = r9
            r6 = r10
            r4 = r13
            r3 = r14
            r10 = r1
            r1 = r12
            r12 = r7
            r7 = r11
            r11 = r5
            r9 = r7
            r5 = r15
            r7 = r4
            r4 = 1
            r21 = r8
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r3
            goto L_0x014d
        L_0x0166:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.x(java.lang.Object):java.lang.Object");
    }
}
