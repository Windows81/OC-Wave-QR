package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", l = {999, 1019, 1020}, m = "invokeSuspend")
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ CoroutineContext H;
    public final /* synthetic */ Recomposer I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, Continuation continuation) {
        super(3, continuation);
        this.H = coroutineContext;
        this.I = recomposer;
    }

    /* renamed from: A */
    public final Object d(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.H, this.I, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.F = coroutineScope;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.G = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.x(Unit.f40552a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0150, code lost:
        r16 = r14;
        androidx.compose.runtime.Recomposer.I(r16).l();
        r6 = androidx.compose.runtime.Recomposer.T(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015d, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0162, code lost:
        if (androidx.compose.runtime.Recomposer.F(r16) != null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0164, code lost:
        r9 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0166, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0167, code lost:
        r6 = androidx.compose.runtime.Recomposer.T(r1.I);
        r9 = r1.I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016f, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0174, code lost:
        if (androidx.compose.runtime.Recomposer.M(r9) == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0176, code lost:
        r9 = r8.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017d, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017e, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017f, code lost:
        if (r9 == null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0181, code lost:
        r6 = kotlin.Result.f40519A;
        r9.q(kotlin.Result.b(kotlin.Unit.f40552a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018c, code lost:
        r9 = r15;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019b, code lost:
        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges");
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = 1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r1.E
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x003d
            if (r3 == r0) goto L_0x002b
            if (r3 == r5) goto L_0x0022
            if (r3 != r4) goto L_0x001a
            kotlin.ResultKt.b(r21)
            goto L_0x01c3
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0022:
            java.lang.Object r0 = r1.F
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlin.ResultKt.b(r21)
            goto L_0x01b8
        L_0x002b:
            java.lang.Object r3 = r1.D
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            java.lang.Object r8 = r1.G
            androidx.compose.runtime.ProduceFrameSignal r8 = (androidx.compose.runtime.ProduceFrameSignal) r8
            java.lang.Object r9 = r1.F
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            kotlin.ResultKt.b(r21)
        L_0x003a:
            r15 = r9
            goto L_0x00bf
        L_0x003d:
            kotlin.ResultKt.b(r21)
            java.lang.Object r3 = r1.F
            r8 = r3
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            java.lang.Object r3 = r1.G
            androidx.compose.runtime.MonotonicFrameClock r3 = (androidx.compose.runtime.MonotonicFrameClock) r3
            kotlin.coroutines.CoroutineContext r9 = r1.H
            kotlinx.coroutines.Job$Key r10 = kotlinx.coroutines.Job.f41415x
            kotlin.coroutines.CoroutineContext$Element r9 = r9.d(r10)
            if (r9 != 0) goto L_0x0055
            r9 = r0
            goto L_0x0056
        L_0x0055:
            r9 = r6
        L_0x0056:
            kotlin.coroutines.CoroutineContext r11 = r1.H
            if (r9 != 0) goto L_0x0072
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "recomposeCoroutineContext may not contain a Job; found "
            r9.append(r12)
            kotlin.coroutines.CoroutineContext$Element r10 = r11.d(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            androidx.compose.runtime.PreconditionsKt.a(r9)
        L_0x0072:
            kotlin.coroutines.CoroutineContext r9 = r8.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r10 = r1.H
            kotlin.coroutines.CoroutineContext r9 = r9.y(r10)
            kotlin.coroutines.CoroutineContext r10 = r8.getCoroutineContext()
            kotlinx.coroutines.Job r10 = kotlinx.coroutines.JobKt.k(r10)
            kotlinx.coroutines.CompletableJob r10 = kotlinx.coroutines.JobKt.a(r10)
            kotlin.coroutines.CoroutineContext r9 = r9.y(r10)
            kotlinx.coroutines.CoroutineScope r14 = kotlinx.coroutines.CoroutineScopeKt.a(r9)
            androidx.compose.runtime.ProduceFrameSignal r15 = new androidx.compose.runtime.ProduceFrameSignal
            r15.<init>()
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 r11 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1
            androidx.compose.runtime.Recomposer r9 = r1.I
            r11.<init>(r9, r3, r15, r7)
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            kotlinx.coroutines.Job r3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r8, r9, r10, r11, r12, r13)
            r9 = r14
            r8 = r15
        L_0x00a6:
            androidx.compose.runtime.Recomposer r10 = r1.I
            boolean r10 = r10.D0()
            if (r10 == 0) goto L_0x01a0
            androidx.compose.runtime.Recomposer r10 = r1.I
            r1.F = r9
            r1.G = r8
            r1.D = r3
            r1.E = r0
            java.lang.Object r10 = r10.m0(r1)
            if (r10 != r2) goto L_0x003a
            return r2
        L_0x00bf:
            androidx.compose.runtime.Recomposer r14 = r1.I
            java.lang.Object r9 = r14.f14792c
            monitor-enter(r9)
            androidx.collection.MutableScatterSet r10 = r14.f14797h     // Catch:{ all -> 0x00d9 }
            boolean r11 = r10.e()     // Catch:{ all -> 0x00d9 }
            if (r11 == 0) goto L_0x00dc
            androidx.collection.MutableScatterSet r11 = new androidx.collection.MutableScatterSet     // Catch:{ all -> 0x00d9 }
            r11.<init>(r6, r0, r7)     // Catch:{ all -> 0x00d9 }
            r14.f14797h = r11     // Catch:{ all -> 0x00d9 }
            goto L_0x00dc
        L_0x00d9:
            r0 = move-exception
            goto L_0x019e
        L_0x00dc:
            monitor-exit(r9)
            java.util.Set r9 = androidx.compose.runtime.collection.ScatterSetWrapperKt.a(r10)
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0103
            java.util.List r10 = r14.G0()
            r11 = r10
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            r12 = r6
        L_0x00f6:
            if (r12 >= r11) goto L_0x0103
            java.lang.Object r13 = r10.get(r12)
            androidx.compose.runtime.ControlledComposition r13 = (androidx.compose.runtime.ControlledComposition) r13
            r13.n(r9)
            int r12 = r12 + r0
            goto L_0x00f6
        L_0x0103:
            androidx.compose.runtime.collection.MutableVector r9 = r14.f14798i
            java.lang.Object[] r13 = r9.f15005z
            int r12 = r9.p()
            r11 = r6
        L_0x010e:
            if (r11 >= r12) goto L_0x0150
            r9 = r13[r11]
            androidx.compose.runtime.ControlledComposition r9 = (androidx.compose.runtime.ControlledComposition) r9
            java.lang.Object r10 = r14.f14792c
            monitor-enter(r10)
            int r16 = r14.f14808s     // Catch:{ all -> 0x014d }
            int r6 = r16 + 1
            r14.f14808s = r6     // Catch:{ all -> 0x014d }
            monitor-exit(r10)
            kotlin.coroutines.CoroutineContext r10 = androidx.compose.runtime.CompositionKt.d(r9)
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 r6 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2
            r6.<init>(r14, r9, r7)
            r16 = 2
            r17 = 0
            r18 = 0
            r9 = r15
            r19 = r11
            r11 = r18
            r18 = r12
            r12 = r6
            r6 = r13
            r13 = r16
            r16 = r14
            r14 = r17
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r9, r10, r11, r12, r13, r14)
            int r11 = r19 + 1
            r13 = r6
            r14 = r16
            r12 = r18
            r6 = 0
            goto L_0x010e
        L_0x014d:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0150:
            r16 = r14
            androidx.compose.runtime.collection.MutableVector r6 = r16.f14798i
            r6.l()
            java.lang.Object r6 = r16.f14792c
            monitor-enter(r6)
            kotlinx.coroutines.CancellableContinuation r9 = r16.s0()     // Catch:{ all -> 0x0192 }
            if (r9 != 0) goto L_0x0194
            kotlin.Unit r9 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0192 }
            monitor-exit(r6)
            androidx.compose.runtime.Recomposer r6 = r1.I
            java.lang.Object r6 = r6.f14792c
            androidx.compose.runtime.Recomposer r9 = r1.I
            monitor-enter(r6)
            boolean r9 = r9.A0()     // Catch:{ all -> 0x017b }
            if (r9 == 0) goto L_0x017d
            kotlin.coroutines.Continuation r9 = r8.d()     // Catch:{ all -> 0x017b }
            goto L_0x017e
        L_0x017b:
            r0 = move-exception
            goto L_0x0190
        L_0x017d:
            r9 = r7
        L_0x017e:
            monitor-exit(r6)
            if (r9 == 0) goto L_0x018c
            kotlin.Result$Companion r6 = kotlin.Result.f40519A
            kotlin.Unit r6 = kotlin.Unit.f40552a
            java.lang.Object r6 = kotlin.Result.b(r6)
            r9.q(r6)
        L_0x018c:
            r9 = r15
            r6 = 0
            goto L_0x00a6
        L_0x0190:
            monitor-exit(r6)
            throw r0
        L_0x0192:
            r0 = move-exception
            goto L_0x019c
        L_0x0194:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = "called outside of runRecomposeAndApplyChanges"
            r0.<init>(r2)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x019c:
            monitor-exit(r6)
            throw r0
        L_0x019e:
            monitor-exit(r9)
            throw r0
        L_0x01a0:
            kotlin.coroutines.CoroutineContext r0 = r9.getCoroutineContext()
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.JobKt.k(r0)
            r1.F = r3
            r1.G = r7
            r1.D = r7
            r1.E = r5
            java.lang.Object r0 = kotlinx.coroutines.JobKt.g(r0, r1)
            if (r0 != r2) goto L_0x01b7
            return r2
        L_0x01b7:
            r0 = r3
        L_0x01b8:
            r1.F = r7
            r1.E = r4
            java.lang.Object r0 = kotlinx.coroutines.JobKt.g(r0, r1)
            if (r0 != r2) goto L_0x01c3
            return r2
        L_0x01c3:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2.x(java.lang.Object):java.lang.Object");
    }
}
