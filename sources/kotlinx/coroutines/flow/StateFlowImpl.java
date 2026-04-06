package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

@Metadata
final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    public int D;
    private volatile /* synthetic */ Object _state$volatile;

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlinx.coroutines.flow.StateFlowSlot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.flow.StateFlowImpl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9 A[Catch:{ all -> 0x0043 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00da A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.J = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.J
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0077
            if (r2 == r6) goto L_0x0065
            if (r2 == r5) goto L_0x004e
            if (r2 != r4) goto L_0x0046
            java.lang.Object r11 = r0.G
            java.lang.Object r2 = r0.F
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r6 = r0.E
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r7 = r0.D
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r8 = r0.C
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x0043 }
            goto L_0x00ab
        L_0x0043:
            r11 = move-exception
            goto L_0x00f4
        L_0x0046:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004e:
            java.lang.Object r11 = r0.G
            java.lang.Object r2 = r0.F
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r6 = r0.E
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r7 = r0.D
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r8 = r0.C
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x0043 }
            goto L_0x00db
        L_0x0065:
            java.lang.Object r11 = r0.E
            r6 = r11
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r11 = r0.D
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.lang.Object r2 = r0.C
            r8 = r2
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x0043 }
            goto L_0x009c
        L_0x0077:
            kotlin.ResultKt.b(r12)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r12 = r10.f()
            kotlinx.coroutines.flow.StateFlowSlot r12 = (kotlinx.coroutines.flow.StateFlowSlot) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x009a
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch:{ all -> 0x0096 }
            r0.C = r10     // Catch:{ all -> 0x0096 }
            r0.D = r11     // Catch:{ all -> 0x0096 }
            r0.E = r12     // Catch:{ all -> 0x0096 }
            r0.J = r6     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x0096 }
            if (r2 != r1) goto L_0x009a
            return r1
        L_0x0096:
            r11 = move-exception
            r8 = r10
            r6 = r12
            goto L_0x00f4
        L_0x009a:
            r8 = r10
            r6 = r12
        L_0x009c:
            kotlin.coroutines.CoroutineContext r12 = r0.f()     // Catch:{ all -> 0x0043 }
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.f41415x     // Catch:{ all -> 0x0043 }
            kotlin.coroutines.CoroutineContext$Element r12 = r12.d(r2)     // Catch:{ all -> 0x0043 }
            kotlinx.coroutines.Job r12 = (kotlinx.coroutines.Job) r12     // Catch:{ all -> 0x0043 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00ab:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = E     // Catch:{ all -> 0x0043 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x00b8
            kotlinx.coroutines.JobKt.j(r2)     // Catch:{ all -> 0x0043 }
        L_0x00b8:
            if (r11 == 0) goto L_0x00c0
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r11, r12)     // Catch:{ all -> 0x0043 }
            if (r9 != 0) goto L_0x00db
        L_0x00c0:
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f41808a     // Catch:{ all -> 0x0043 }
            if (r12 != r11) goto L_0x00c6
            r11 = r3
            goto L_0x00c7
        L_0x00c6:
            r11 = r12
        L_0x00c7:
            r0.C = r8     // Catch:{ all -> 0x0043 }
            r0.D = r7     // Catch:{ all -> 0x0043 }
            r0.E = r6     // Catch:{ all -> 0x0043 }
            r0.F = r2     // Catch:{ all -> 0x0043 }
            r0.G = r12     // Catch:{ all -> 0x0043 }
            r0.J = r5     // Catch:{ all -> 0x0043 }
            java.lang.Object r11 = r7.c(r11, r0)     // Catch:{ all -> 0x0043 }
            if (r11 != r1) goto L_0x00da
            return r1
        L_0x00da:
            r11 = r12
        L_0x00db:
            boolean r12 = r6.h()     // Catch:{ all -> 0x0043 }
            if (r12 != 0) goto L_0x00ab
            r0.C = r8     // Catch:{ all -> 0x0043 }
            r0.D = r7     // Catch:{ all -> 0x0043 }
            r0.E = r6     // Catch:{ all -> 0x0043 }
            r0.F = r2     // Catch:{ all -> 0x0043 }
            r0.G = r11     // Catch:{ all -> 0x0043 }
            r0.J = r4     // Catch:{ all -> 0x0043 }
            java.lang.Object r12 = r6.e(r0)     // Catch:{ all -> 0x0043 }
            if (r12 != r1) goto L_0x00ab
            return r1
        L_0x00f4:
            r8.m(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return StateFlowKt.d(this, coroutineContext, i2, bufferOverflow);
    }

    public Object c(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.f40552a;
    }

    public boolean g(Object obj, Object obj2) {
        if (obj == null) {
            obj = NullSurrogateKt.f41808a;
        }
        if (obj2 == null) {
            obj2 = NullSurrogateKt.f41808a;
        }
        return s(obj, obj2);
    }

    public Object getValue() {
        Symbol symbol = NullSurrogateKt.f41808a;
        Object obj = E.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    public void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public boolean i(Object obj) {
        setValue(obj);
        return true;
    }

    /* renamed from: p */
    public StateFlowSlot j() {
        return new StateFlowSlot();
    }

    /* renamed from: q */
    public StateFlowSlot[] l(int i2) {
        return new StateFlowSlot[i2];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r8 = (kotlinx.coroutines.flow.StateFlowSlot[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r8 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r1 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r3 >= r1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r4 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r4.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r8 != r7) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004c, code lost:
        r6.D = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7 = o();
        r1 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0059, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005a, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean s(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 1
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = E     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0015 }
            r2 = 0
            if (r7 == 0) goto L_0x0017
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r1, r7)     // Catch:{ all -> 0x0015 }
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r2
        L_0x0015:
            r7 = move-exception
            goto L_0x0066
        L_0x0017:
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r1, r8)     // Catch:{ all -> 0x0015 }
            if (r7 == 0) goto L_0x001f
            monitor-exit(r6)
            return r0
        L_0x001f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = E     // Catch:{ all -> 0x0015 }
            r7.set(r6, r8)     // Catch:{ all -> 0x0015 }
            int r7 = r6.D     // Catch:{ all -> 0x0015 }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0060
            int r7 = r7 + r0
            r6.D = r7     // Catch:{ all -> 0x0015 }
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r8 = r6.o()     // Catch:{ all -> 0x0015 }
            kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0015 }
            monitor-exit(r6)
        L_0x0036:
            kotlinx.coroutines.flow.StateFlowSlot[] r8 = (kotlinx.coroutines.flow.StateFlowSlot[]) r8
            if (r8 == 0) goto L_0x0047
            int r1 = r8.length
            r3 = r2
        L_0x003c:
            if (r3 >= r1) goto L_0x0047
            r4 = r8[r3]
            if (r4 == 0) goto L_0x0045
            r4.g()
        L_0x0045:
            int r3 = r3 + r0
            goto L_0x003c
        L_0x0047:
            monitor-enter(r6)
            int r8 = r6.D     // Catch:{ all -> 0x0051 }
            if (r8 != r7) goto L_0x0053
            int r7 = r7 + r0
            r6.D = r7     // Catch:{ all -> 0x0051 }
            monitor-exit(r6)
            return r0
        L_0x0051:
            r7 = move-exception
            goto L_0x005e
        L_0x0053:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r7 = r6.o()     // Catch:{ all -> 0x0051 }
            kotlin.Unit r1 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0051 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0036
        L_0x005e:
            monitor-exit(r6)
            throw r7
        L_0x0060:
            int r7 = r7 + 2
            r6.D = r7     // Catch:{ all -> 0x0015 }
            monitor-exit(r6)
            return r0
        L_0x0066:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.s(java.lang.Object, java.lang.Object):boolean");
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.f41808a;
        }
        s((Object) null, obj);
    }
}
