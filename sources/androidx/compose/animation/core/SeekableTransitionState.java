package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class SeekableTransitionState<S> extends TransitionState<S> {

    /* renamed from: r  reason: collision with root package name */
    public static final Companion f2639r = new Companion((DefaultConstructorMarker) null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f2640s = 8;

    /* renamed from: t  reason: collision with root package name */
    public static final AnimationVector1D f2641t = new AnimationVector1D(0.0f);

    /* renamed from: u  reason: collision with root package name */
    public static final AnimationVector1D f2642u = new AnimationVector1D(1.0f);

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f2643b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f2644c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2645d;

    /* renamed from: e  reason: collision with root package name */
    public Transition f2646e;

    /* renamed from: f  reason: collision with root package name */
    public long f2647f;

    /* renamed from: g  reason: collision with root package name */
    public final Function0 f2648g = new SeekableTransitionState$recalculateTotalDurationNanos$1(this);

    /* renamed from: h  reason: collision with root package name */
    public final MutableFloatState f2649h = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public CancellableContinuation f2650i;

    /* renamed from: j  reason: collision with root package name */
    public final Mutex f2651j = MutexKt.b(false, 1, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    public final MutatorMutex f2652k = new MutatorMutex();

    /* renamed from: l  reason: collision with root package name */
    public long f2653l = Long.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public final MutableObjectList f2654m = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public SeekingAnimationState f2655n;

    /* renamed from: o  reason: collision with root package name */
    public final Function1 f2656o = new SeekableTransitionState$firstFrameLambda$1(this);

    /* renamed from: p  reason: collision with root package name */
    public float f2657p;

    /* renamed from: q  reason: collision with root package name */
    public final Function1 f2658q = new SeekableTransitionState$animateOneFrameLambda$1(this);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnimationVector1D a() {
            return SeekableTransitionState.f2642u;
        }

        public final AnimationVector1D b() {
            return SeekableTransitionState.f2641t;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class SeekingAnimationState {

        /* renamed from: a  reason: collision with root package name */
        public long f2659a;

        /* renamed from: b  reason: collision with root package name */
        public VectorizedAnimationSpec f2660b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2661c;

        /* renamed from: d  reason: collision with root package name */
        public float f2662d;

        /* renamed from: e  reason: collision with root package name */
        public AnimationVector1D f2663e = new AnimationVector1D(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public AnimationVector1D f2664f;

        /* renamed from: g  reason: collision with root package name */
        public long f2665g;

        /* renamed from: h  reason: collision with root package name */
        public long f2666h;

        public final VectorizedAnimationSpec a() {
            return this.f2660b;
        }

        public final long b() {
            return this.f2666h;
        }

        public final long c() {
            return this.f2665g;
        }

        public final AnimationVector1D d() {
            return this.f2664f;
        }

        public final long e() {
            return this.f2659a;
        }

        public final AnimationVector1D f() {
            return this.f2663e;
        }

        public final float g() {
            return this.f2662d;
        }

        public final boolean h() {
            return this.f2661c;
        }

        public final void i(VectorizedAnimationSpec vectorizedAnimationSpec) {
            this.f2660b = vectorizedAnimationSpec;
        }

        public final void j(long j2) {
            this.f2666h = j2;
        }

        public final void k(boolean z2) {
            this.f2661c = z2;
        }

        public final void l(long j2) {
            this.f2665g = j2;
        }

        public final void m(AnimationVector1D animationVector1D) {
            this.f2664f = animationVector1D;
        }

        public final void n(long j2) {
            this.f2659a = j2;
        }

        public final void o(float f2) {
            this.f2662d = f2;
        }

        public String toString() {
            return "progress nanos: " + this.f2659a + ", animationSpec: " + this.f2660b + ", isComplete: " + this.f2661c + ", value: " + this.f2662d + ", start: " + this.f2663e + ", initialVelocity: " + this.f2664f + ", durationNanos: " + this.f2665g + ", animationSpecDuration: " + this.f2666h;
        }
    }

    public SeekableTransitionState(Object obj) {
        super((DefaultConstructorMarker) null);
        this.f2643b = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2644c = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2645d = obj;
    }

    public static /* synthetic */ Object C(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = seekableTransitionState.b();
        }
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.B(obj, finiteAnimationSpec, continuation);
    }

    public static /* synthetic */ Object Q(SeekableTransitionState seekableTransitionState, float f2, Object obj, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = seekableTransitionState.b();
        }
        return seekableTransitionState.P(f2, obj, continuation);
    }

    public final Object A(Continuation continuation) {
        float o2 = SuspendAnimationKt.o(continuation.f());
        if (o2 <= 0.0f) {
            E();
            return Unit.f40552a;
        }
        this.f2657p = o2;
        Object c2 = MonotonicFrameClockKt.c(this.f2658q, continuation);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final Object B(Object obj, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation) {
        Transition transition = this.f2646e;
        if (transition == null) {
            return Unit.f40552a;
        }
        Object e2 = MutatorMutex.e(this.f2652k, (MutatePriority) null, new SeekableTransitionState$animateTo$2(transition, this, obj, finiteAnimationSpec, (Continuation) null), continuation, 1, (Object) null);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final Object D(Continuation continuation) {
        if (this.f2653l == Long.MIN_VALUE) {
            Object c2 = MonotonicFrameClockKt.c(this.f2656o, continuation);
            return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
        }
        Object A2 = A(continuation);
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    public final void E() {
        Transition transition = this.f2646e;
        if (transition != null) {
            transition.g();
        }
        this.f2654m.t();
        if (this.f2655n != null) {
            this.f2655n = null;
            U(1.0f);
            R();
        }
    }

    public final Object F() {
        return this.f2645d;
    }

    public final CancellableContinuation G() {
        return this.f2650i;
    }

    public final Mutex H() {
        return this.f2651j;
    }

    public final float I() {
        return this.f2649h.c();
    }

    public final long J() {
        return this.f2647f;
    }

    public final void K() {
        Transition transition = this.f2646e;
        if (transition != null) {
            SeekingAnimationState seekingAnimationState = this.f2655n;
            if (seekingAnimationState == null) {
                if (this.f2647f <= 0 || I() == 1.0f || Intrinsics.d(a(), b())) {
                    seekingAnimationState = null;
                } else {
                    seekingAnimationState = new SeekingAnimationState();
                    seekingAnimationState.o(I());
                    long j2 = this.f2647f;
                    seekingAnimationState.l(j2);
                    seekingAnimationState.j(MathKt.e(((double) j2) * (1.0d - ((double) I()))));
                    seekingAnimationState.f().e(0, I());
                }
            }
            if (seekingAnimationState != null) {
                seekingAnimationState.l(this.f2647f);
                this.f2654m.n(seekingAnimationState);
                transition.I(seekingAnimationState);
            }
            this.f2655n = null;
        }
    }

    public final void L() {
        TransitionKt.g().k(this, TransitionKt.f2744a, this.f2648g);
    }

    public final void M() {
        long j2 = this.f2647f;
        L();
        long j3 = this.f2647f;
        if (j2 != j3) {
            SeekingAnimationState seekingAnimationState = this.f2655n;
            if (seekingAnimationState != null) {
                long e2 = seekingAnimationState.e();
                long j4 = this.f2647f;
                if (e2 > j4) {
                    E();
                    return;
                }
                seekingAnimationState.l(j4);
                if (seekingAnimationState.a() == null) {
                    seekingAnimationState.j(MathKt.e((1.0d - ((double) seekingAnimationState.f().a(0))) * ((double) this.f2647f)));
                }
            } else if (j3 != 0) {
                R();
            }
        }
    }

    public final void N(SeekingAnimationState seekingAnimationState, long j2) {
        long e2 = seekingAnimationState.e() + j2;
        seekingAnimationState.n(e2);
        long b2 = seekingAnimationState.b();
        if (e2 >= b2) {
            seekingAnimationState.o(1.0f);
            return;
        }
        VectorizedAnimationSpec a2 = seekingAnimationState.a();
        if (a2 != null) {
            AnimationVector1D f2 = seekingAnimationState.f();
            AnimationVector1D animationVector1D = f2642u;
            AnimationVector1D d2 = seekingAnimationState.d();
            if (d2 == null) {
                d2 = f2641t;
            }
            seekingAnimationState.o(RangesKt.n(((AnimationVector1D) a2.f(e2, f2, animationVector1D, d2)).a(0), 0.0f, 1.0f));
            return;
        }
        float f3 = ((float) e2) / ((float) b2);
        seekingAnimationState.o((seekingAnimationState.f().a(0) * (((float) 1) - f3)) + (f3 * 1.0f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$runAnimations$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0033:
            java.lang.Object r2 = r0.C
            androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
            kotlin.ResultKt.b(r10)
            goto L_0x0076
        L_0x003b:
            kotlin.ResultKt.b(r10)
            androidx.collection.MutableObjectList r10 = r9.f2654m
            boolean r10 = r10.g()
            if (r10 == 0) goto L_0x004d
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r9.f2655n
            if (r10 != 0) goto L_0x004d
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x004d:
            kotlin.coroutines.CoroutineContext r10 = r0.f()
            float r10 = androidx.compose.animation.core.SuspendAnimationKt.o(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0062
            r9.E()
            r9.f2653l = r5
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x0062:
            long r7 = r9.f2653l
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0075
            kotlin.jvm.functions.Function1 r10 = r9.f2656o
            r0.C = r9
            r0.F = r4
            java.lang.Object r10 = androidx.compose.runtime.MonotonicFrameClockKt.c(r10, r0)
            if (r10 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r2 = r9
        L_0x0076:
            androidx.collection.MutableObjectList r10 = r2.f2654m
            boolean r10 = r10.h()
            if (r10 != 0) goto L_0x0088
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r2.f2655n
            if (r10 == 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            r2.f2653l = r5
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x0088:
            r0.C = r2
            r0.F = r3
            java.lang.Object r10 = r2.A(r0)
            if (r10 != r1) goto L_0x0076
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.O(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object P(float f2, Object obj, Continuation continuation) {
        boolean z2 = false;
        if (0.0f <= f2 && f2 <= 1.0f) {
            z2 = true;
        }
        if (!z2) {
            PreconditionsKt.a("Expecting fraction between 0 and 1. Got " + f2);
        }
        Transition transition = this.f2646e;
        if (transition == null) {
            return Unit.f40552a;
        }
        Object e2 = MutatorMutex.e(this.f2652k, (MutatePriority) null, new SeekableTransitionState$seekTo$3(obj, b(), this, transition, f2, (Continuation) null), continuation, 1, (Object) null);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final void R() {
        Transition transition = this.f2646e;
        if (transition != null) {
            transition.H(MathKt.e(((double) I()) * ((double) transition.r())));
        }
    }

    public final void S(Object obj) {
        this.f2645d = obj;
    }

    public final void T(CancellableContinuation cancellableContinuation) {
        this.f2650i = cancellableContinuation;
    }

    public final void U(float f2) {
        this.f2649h.j(f2);
    }

    public void V(Object obj) {
        this.f2643b.setValue(obj);
    }

    public final void W(long j2) {
        this.f2647f = j2;
    }

    public final Object X(Object obj, Continuation continuation) {
        Transition transition = this.f2646e;
        if (transition == null) {
            return Unit.f40552a;
        }
        if (Intrinsics.d(a(), obj) && Intrinsics.d(b(), obj)) {
            return Unit.f40552a;
        }
        Object e2 = MutatorMutex.e(this.f2652k, (MutatePriority) null, new SeekableTransitionState$snapTo$2(this, obj, transition, (Continuation) null), continuation, 1, (Object) null);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r1 = r0.D
            java.lang.Object r0 = r0.C
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.ResultKt.b(r8)
            goto L_0x008c
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            java.lang.Object r2 = r0.D
            java.lang.Object r6 = r0.C
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.ResultKt.b(r8)
            r8 = r2
            goto L_0x005d
        L_0x0046:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.b()
            kotlinx.coroutines.sync.Mutex r2 = r7.f2651j
            r0.C = r7
            r0.D = r8
            r0.G = r5
            java.lang.Object r2 = kotlinx.coroutines.sync.Mutex.DefaultImpls.a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r6 = r7
        L_0x005d:
            r0.C = r6
            r0.D = r8
            r0.G = r3
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r2.<init>(r3, r5)
            r2.G()
            r6.T(r2)
            kotlinx.coroutines.sync.Mutex r3 = r6.H()
            kotlinx.coroutines.sync.Mutex.DefaultImpls.c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.A()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r2 != r3) goto L_0x0086
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L_0x0086:
            if (r2 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r1 = r8
            r8 = r2
            r0 = r6
        L_0x008c:
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r1)
            if (r8 == 0) goto L_0x0095
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        L_0x0095:
            r1 = -9223372036854775808
            r0.f2653l = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.Y(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r1 = r0.D
            java.lang.Object r0 = r0.C
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.ResultKt.b(r8)
            goto L_0x009a
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            java.lang.Object r2 = r0.D
            java.lang.Object r6 = r0.C
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.ResultKt.b(r8)
            r8 = r2
            goto L_0x005d
        L_0x0046:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.b()
            kotlinx.coroutines.sync.Mutex r2 = r7.f2651j
            r0.C = r7
            r0.D = r8
            r0.G = r5
            java.lang.Object r2 = kotlinx.coroutines.sync.Mutex.DefaultImpls.a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r6 = r7
        L_0x005d:
            java.lang.Object r2 = r6.f2645d
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r8, r2)
            if (r2 == 0) goto L_0x006b
            kotlinx.coroutines.sync.Mutex r8 = r6.f2651j
            kotlinx.coroutines.sync.Mutex.DefaultImpls.c(r8, r4, r5, r4)
            goto L_0x00a0
        L_0x006b:
            r0.C = r6
            r0.D = r8
            r0.G = r3
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r2.<init>(r3, r5)
            r2.G()
            r6.T(r2)
            kotlinx.coroutines.sync.Mutex r3 = r6.H()
            kotlinx.coroutines.sync.Mutex.DefaultImpls.c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.A()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r2 != r3) goto L_0x0094
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L_0x0094:
            if (r2 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r1 = r8
            r8 = r2
            r0 = r6
        L_0x009a:
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r8, r1)
            if (r2 == 0) goto L_0x00a3
        L_0x00a0:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        L_0x00a3:
            r2 = -9223372036854775808
            r0.f2653l = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " instead of "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.Z(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object a() {
        return this.f2644c.getValue();
    }

    public Object b() {
        return this.f2643b.getValue();
    }

    public void d(Object obj) {
        this.f2644c.setValue(obj);
    }

    public void f(Transition transition) {
        Transition transition2 = this.f2646e;
        if (!(transition2 == null || Intrinsics.d(transition, transition2))) {
            PreconditionsKt.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f2646e + ", new instance: " + transition);
        }
        this.f2646e = transition;
    }

    public void g() {
        this.f2646e = null;
        TransitionKt.g().g(this);
    }
}
