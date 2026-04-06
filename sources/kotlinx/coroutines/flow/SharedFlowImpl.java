package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

@Metadata
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public final int D;
    public final int E;
    public final BufferOverflow F;
    public Object[] G;
    public long H;
    public long I;
    public int J;
    public int K;

    @Metadata
    public static final class Emitter implements DisposableHandle {

        /* renamed from: A  reason: collision with root package name */
        public long f41747A;

        /* renamed from: B  reason: collision with root package name */
        public final Object f41748B;
        public final Continuation C;

        /* renamed from: z  reason: collision with root package name */
        public final SharedFlowImpl f41749z;

        public Emitter(SharedFlowImpl sharedFlowImpl, long j2, Object obj, Continuation continuation) {
            this.f41749z = sharedFlowImpl;
            this.f41747A = j2;
            this.f41748B = obj;
            this.C = continuation;
        }

        public void d() {
            this.f41749z.A(this);
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41750a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f41750a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.<clinit>():void");
        }
    }

    public SharedFlowImpl(int i2, int i3, BufferOverflow bufferOverflow) {
        this.D = i2;
        this.E = i3;
        this.F = bufferOverflow;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: kotlinx.coroutines.flow.SharedFlowSlot} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1 A[Catch:{ all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[Catch:{ all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object C(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl$collect$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r5) goto L_0x005f
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r8 = r0.F
            kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
            java.lang.Object r9 = r0.E
            kotlinx.coroutines.flow.SharedFlowSlot r9 = (kotlinx.coroutines.flow.SharedFlowSlot) r9
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r5 = r0.C
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
        L_0x003b:
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x003f }
            goto L_0x005b
        L_0x003f:
            r8 = move-exception
            goto L_0x00dc
        L_0x0042:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004a:
            java.lang.Object r8 = r0.F
            kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
            java.lang.Object r9 = r0.E
            kotlinx.coroutines.flow.SharedFlowSlot r9 = (kotlinx.coroutines.flow.SharedFlowSlot) r9
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r5 = r0.C
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
            goto L_0x003b
        L_0x005b:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a9
        L_0x005f:
            java.lang.Object r8 = r0.E
            r9 = r8
            kotlinx.coroutines.flow.SharedFlowSlot r9 = (kotlinx.coroutines.flow.SharedFlowSlot) r9
            java.lang.Object r8 = r0.D
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            java.lang.Object r2 = r0.C
            kotlinx.coroutines.flow.SharedFlowImpl r2 = (kotlinx.coroutines.flow.SharedFlowImpl) r2
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x0072 }
            r10 = r8
            r8 = r2
            goto L_0x009d
        L_0x0072:
            r8 = move-exception
            r5 = r2
            goto L_0x00dc
        L_0x0076:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r10 = r8.f()
            kotlinx.coroutines.flow.SharedFlowSlot r10 = (kotlinx.coroutines.flow.SharedFlowSlot) r10
            boolean r2 = r9 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x009a
            r2 = r9
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch:{ all -> 0x0095 }
            r0.C = r8     // Catch:{ all -> 0x0095 }
            r0.D = r9     // Catch:{ all -> 0x0095 }
            r0.E = r10     // Catch:{ all -> 0x0095 }
            r0.I = r5     // Catch:{ all -> 0x0095 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x0095 }
            if (r2 != r1) goto L_0x009a
            return r1
        L_0x0095:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
            goto L_0x00dc
        L_0x009a:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x009d:
            kotlin.coroutines.CoroutineContext r2 = r0.f()     // Catch:{ all -> 0x00c2 }
            kotlinx.coroutines.Job$Key r5 = kotlinx.coroutines.Job.f41415x     // Catch:{ all -> 0x00c2 }
            kotlin.coroutines.CoroutineContext$Element r2 = r2.d(r5)     // Catch:{ all -> 0x00c2 }
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch:{ all -> 0x00c2 }
        L_0x00a9:
            java.lang.Object r5 = r8.W(r9)     // Catch:{ all -> 0x00c2 }
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.SharedFlowKt.f41751a     // Catch:{ all -> 0x00c2 }
            if (r5 != r6) goto L_0x00c6
            r0.C = r8     // Catch:{ all -> 0x00c2 }
            r0.D = r10     // Catch:{ all -> 0x00c2 }
            r0.E = r9     // Catch:{ all -> 0x00c2 }
            r0.F = r2     // Catch:{ all -> 0x00c2 }
            r0.I = r4     // Catch:{ all -> 0x00c2 }
            java.lang.Object r5 = r8.z(r9, r0)     // Catch:{ all -> 0x00c2 }
            if (r5 != r1) goto L_0x00a9
            return r1
        L_0x00c2:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00dc
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            kotlinx.coroutines.JobKt.j(r2)     // Catch:{ all -> 0x00c2 }
        L_0x00cb:
            r0.C = r8     // Catch:{ all -> 0x00c2 }
            r0.D = r10     // Catch:{ all -> 0x00c2 }
            r0.E = r9     // Catch:{ all -> 0x00c2 }
            r0.F = r2     // Catch:{ all -> 0x00c2 }
            r0.I = r3     // Catch:{ all -> 0x00c2 }
            java.lang.Object r5 = r10.c(r5, r0)     // Catch:{ all -> 0x00c2 }
            if (r5 != r1) goto L_0x00a9
            return r1
        L_0x00dc:
            r5.m(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.C(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object H(SharedFlowImpl sharedFlowImpl, Object obj, Continuation continuation) {
        if (sharedFlowImpl.i(obj)) {
            return Unit.f40552a;
        }
        Object I2 = sharedFlowImpl.I(obj, continuation);
        return I2 == IntrinsicsKt.f() ? I2 : Unit.f40552a;
    }

    public final void A(Emitter emitter) {
        synchronized (this) {
            if (emitter.f41747A >= M()) {
                Object[] objArr = this.G;
                Intrinsics.f(objArr);
                if (SharedFlowKt.f(objArr, emitter.f41747A) == emitter) {
                    SharedFlowKt.g(objArr, emitter.f41747A, SharedFlowKt.f41751a);
                    B();
                    Unit unit = Unit.f40552a;
                }
            }
        }
    }

    public final void B() {
        if (this.E != 0 || this.K > 1) {
            Object[] objArr = this.G;
            Intrinsics.f(objArr);
            while (this.K > 0 && SharedFlowKt.f(objArr, (M() + ((long) R())) - 1) == SharedFlowKt.f41751a) {
                this.K--;
                SharedFlowKt.g(objArr, M() + ((long) R()), (Object) null);
            }
        }
    }

    public final void D(long j2) {
        AbstractSharedFlowSlot[] e2;
        if (!(this.f41779A == 0 || (e2 = this.f41781z) == null)) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : e2) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j3 = sharedFlowSlot.f41752a;
                    if (j3 >= 0 && j3 < j2) {
                        sharedFlowSlot.f41752a = j2;
                    }
                }
            }
        }
        this.I = j2;
    }

    /* renamed from: E */
    public SharedFlowSlot j() {
        return new SharedFlowSlot();
    }

    /* renamed from: F */
    public SharedFlowSlot[] l(int i2) {
        return new SharedFlowSlot[i2];
    }

    public final void G() {
        Object[] objArr = this.G;
        Intrinsics.f(objArr);
        SharedFlowKt.g(objArr, M(), (Object) null);
        this.J--;
        long M = M() + 1;
        if (this.H < M) {
            this.H = M;
        }
        if (this.I < M) {
            D(M);
        }
    }

    public final Object I(Object obj, Continuation continuation) {
        Continuation[] continuationArr;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        Continuation[] continuationArr2 = AbstractSharedFlowKt.f41782a;
        synchronized (this) {
            try {
                if (T(obj)) {
                    Result.Companion companion = Result.f40519A;
                    cancellableContinuationImpl.q(Result.b(Unit.f40552a));
                    continuationArr = K(continuationArr2);
                    emitter = null;
                } else {
                    Emitter emitter2 = new Emitter(this, ((long) R()) + M(), obj, cancellableContinuationImpl);
                    J(emitter2);
                    this.K = this.K + 1;
                    if (this.E == 0) {
                        continuationArr2 = K(continuationArr2);
                    }
                    continuationArr = continuationArr2;
                    emitter = emitter2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (emitter != null) {
            CancellableContinuationKt.a(cancellableContinuationImpl, emitter);
        }
        for (Continuation continuation2 : continuationArr) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.f40519A;
                continuation2.q(Result.b(Unit.f40552a));
            }
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    public final void J(Object obj) {
        int R = R();
        Object[] objArr = this.G;
        if (objArr == null) {
            objArr = S((Object[]) null, 0, 2);
        } else if (R >= objArr.length) {
            objArr = S(objArr, R, objArr.length * 2);
        }
        SharedFlowKt.g(objArr, M() + ((long) R), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (kotlinx.coroutines.flow.SharedFlowSlot) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.Continuation[] K(kotlin.coroutines.Continuation[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f41779A
            if (r1 == 0) goto L_0x0047
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = r10.f41781z
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0047
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0044
            kotlinx.coroutines.flow.SharedFlowSlot r4 = (kotlinx.coroutines.flow.SharedFlowSlot) r4
            kotlin.coroutines.Continuation r5 = r4.f41753b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.V(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.h(r11, r6)
        L_0x0039:
            r6 = r11
            kotlin.coroutines.Continuation[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f41753b = r0
            r0 = r7
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0047:
            kotlin.coroutines.Continuation[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.K(kotlin.coroutines.Continuation[]):kotlin.coroutines.Continuation[]");
    }

    public final long L() {
        return M() + ((long) this.J);
    }

    public final long M() {
        return Math.min(this.I, this.H);
    }

    public final Object N() {
        Object[] objArr = this.G;
        Intrinsics.f(objArr);
        return SharedFlowKt.f(objArr, (this.H + ((long) Q())) - 1);
    }

    public final Object O(long j2) {
        Object[] objArr = this.G;
        Intrinsics.f(objArr);
        Object c2 = SharedFlowKt.f(objArr, j2);
        return c2 instanceof Emitter ? ((Emitter) c2).f41748B : c2;
    }

    public final long P() {
        return M() + ((long) this.J) + ((long) this.K);
    }

    public final int Q() {
        return (int) ((M() + ((long) this.J)) - this.H);
    }

    public final int R() {
        return this.J + this.K;
    }

    public final Object[] S(Object[] objArr, int i2, int i3) {
        if (i3 > 0) {
            Object[] objArr2 = new Object[i3];
            this.G = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long M = M();
            for (int i4 = 0; i4 < i2; i4++) {
                long j2 = ((long) i4) + M;
                SharedFlowKt.g(objArr2, j2, SharedFlowKt.f(objArr, j2));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    public final boolean T(Object obj) {
        if (n() == 0) {
            return U(obj);
        }
        if (this.J >= this.E && this.I <= this.H) {
            int i2 = WhenMappings.f41750a[this.F.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        J(obj);
        int i3 = this.J + 1;
        this.J = i3;
        if (i3 > this.E) {
            G();
        }
        if (Q() > this.D) {
            X(this.H + 1, this.I, L(), P());
        }
        return true;
    }

    public final boolean U(Object obj) {
        if (this.D == 0) {
            return true;
        }
        J(obj);
        int i2 = this.J + 1;
        this.J = i2;
        if (i2 > this.D) {
            G();
        }
        this.I = M() + ((long) this.J);
        return true;
    }

    public final long V(SharedFlowSlot sharedFlowSlot) {
        long j2 = sharedFlowSlot.f41752a;
        if (j2 < L()) {
            return j2;
        }
        if (this.E <= 0 && j2 <= M() && this.K != 0) {
            return j2;
        }
        return -1;
    }

    public final Object W(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation[] continuationArr = AbstractSharedFlowKt.f41782a;
        synchronized (this) {
            try {
                long V = V(sharedFlowSlot);
                if (V < 0) {
                    obj = SharedFlowKt.f41751a;
                } else {
                    long j2 = sharedFlowSlot.f41752a;
                    Object O = O(V);
                    sharedFlowSlot.f41752a = V + 1;
                    Object obj2 = O;
                    continuationArr = Y(j2);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.f40519A;
                continuation.q(Result.b(Unit.f40552a));
            }
        }
        return obj;
    }

    public final void X(long j2, long j3, long j4, long j5) {
        long min = Math.min(j3, j2);
        for (long M = M(); M < min; M++) {
            Object[] objArr = this.G;
            Intrinsics.f(objArr);
            SharedFlowKt.g(objArr, M, (Object) null);
        }
        this.H = j2;
        this.I = j3;
        this.J = (int) (j4 - min);
        this.K = (int) (j5 - j4);
    }

    public final Continuation[] Y(long j2) {
        long j3;
        long j4;
        long j5;
        AbstractSharedFlowSlot[] e2;
        if (j2 > this.I) {
            return AbstractSharedFlowKt.f41782a;
        }
        long M = M();
        long j6 = ((long) this.J) + M;
        if (this.E == 0 && this.K > 0) {
            j6++;
        }
        if (!(this.f41779A == 0 || (e2 = this.f41781z) == null)) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : e2) {
                if (abstractSharedFlowSlot != null) {
                    long j7 = ((SharedFlowSlot) abstractSharedFlowSlot).f41752a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.I) {
            return AbstractSharedFlowKt.f41782a;
        }
        long L = L();
        int min = n() > 0 ? Math.min(this.K, this.E - ((int) (L - j6))) : this.K;
        Continuation[] continuationArr = AbstractSharedFlowKt.f41782a;
        long j8 = ((long) this.K) + L;
        if (min > 0) {
            continuationArr = new Continuation[min];
            Object[] objArr = this.G;
            Intrinsics.f(objArr);
            long j9 = L;
            int i2 = 0;
            while (true) {
                if (L >= j8) {
                    j4 = j6;
                    j3 = j8;
                    break;
                }
                Object c2 = SharedFlowKt.f(objArr, L);
                j4 = j6;
                Symbol symbol = SharedFlowKt.f41751a;
                if (c2 != symbol) {
                    Intrinsics.g(c2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) c2;
                    int i3 = i2 + 1;
                    j3 = j8;
                    continuationArr[i2] = emitter.C;
                    SharedFlowKt.g(objArr, L, symbol);
                    SharedFlowKt.g(objArr, j9, emitter.f41748B);
                    j5 = 1;
                    j9++;
                    if (i3 >= min) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j3 = j8;
                    j5 = 1;
                }
                L += j5;
                j6 = j4;
                j8 = j3;
            }
            L = j9;
        } else {
            j4 = j6;
            j3 = j8;
        }
        int i4 = (int) (L - M);
        long j10 = n() == 0 ? L : j4;
        long max = Math.max(this.H, L - ((long) Math.min(this.D, i4)));
        if (this.E == 0 && max < j3) {
            Object[] objArr2 = this.G;
            Intrinsics.f(objArr2);
            if (Intrinsics.d(SharedFlowKt.f(objArr2, max), SharedFlowKt.f41751a)) {
                L++;
                max++;
            }
        }
        X(max, j10, L, j3);
        B();
        return !(continuationArr.length == 0) ? K(continuationArr) : continuationArr;
    }

    public final long Z() {
        long j2 = this.H;
        if (j2 < this.I) {
            this.I = j2;
        }
        return j2;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        return C(this, flowCollector, continuation);
    }

    public Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return SharedFlowKt.e(this, coroutineContext, i2, bufferOverflow);
    }

    public Object c(Object obj, Continuation continuation) {
        return H(this, obj, continuation);
    }

    public void h() {
        synchronized (this) {
            X(L(), this.I, L(), P());
            Unit unit = Unit.f40552a;
        }
    }

    public boolean i(Object obj) {
        int i2;
        boolean z2;
        Continuation[] continuationArr = AbstractSharedFlowKt.f41782a;
        synchronized (this) {
            if (T(obj)) {
                continuationArr = K(continuationArr);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.f40519A;
                continuation.q(Result.b(Unit.f40552a));
            }
        }
        return z2;
    }

    public final Object z(SharedFlowSlot sharedFlowSlot, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        synchronized (this) {
            try {
                if (V(sharedFlowSlot) < 0) {
                    sharedFlowSlot.f41753b = cancellableContinuationImpl;
                } else {
                    Result.Companion companion = Result.f40519A;
                    cancellableContinuationImpl.q(Result.b(Unit.f40552a));
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }
}
