package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {599}, m = "invokeSuspend")
public final class SeekableTransitionState$animateTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Transition E;
    public final /* synthetic */ SeekableTransitionState F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ FiniteAnimationSpec H;

    @Metadata
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2147, 612, 614, 668, 670}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object D;
        public Object E;
        public int F;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(seekableTransitionState, obj2, transition, finiteAnimationSpec, continuation);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01e7 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r1.F
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                r10 = 0
                r11 = 0
                if (r2 == 0) goto L_0x0045
                if (r2 == r7) goto L_0x0039
                if (r2 == r6) goto L_0x0034
                if (r2 == r5) goto L_0x002f
                if (r2 == r4) goto L_0x002a
                if (r2 != r3) goto L_0x0022
                kotlin.ResultKt.b(r19)
                goto L_0x01e8
            L_0x0022:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x002a:
                kotlin.ResultKt.b(r19)
                goto L_0x01d6
            L_0x002f:
                kotlin.ResultKt.b(r19)
                goto L_0x00b8
            L_0x0034:
                kotlin.ResultKt.b(r19)
                goto L_0x00ad
            L_0x0039:
                java.lang.Object r2 = r1.E
                androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
                java.lang.Object r7 = r1.D
                kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
                kotlin.ResultKt.b(r19)
                goto L_0x008f
            L_0x0045:
                kotlin.ResultKt.b(r19)
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                java.lang.Object r2 = r2.b()
                java.lang.Object r12 = r5
                boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r2)
                if (r12 != 0) goto L_0x0078
                androidx.compose.animation.core.SeekableTransitionState r12 = r4
                r12.K()
                androidx.compose.animation.core.SeekableTransitionState r12 = r4
                r12.U(r10)
                androidx.compose.animation.core.Transition r12 = r6
                java.lang.Object r13 = r5
                r12.R(r13)
                androidx.compose.animation.core.Transition r12 = r6
                r12.J(r8)
                androidx.compose.animation.core.SeekableTransitionState r12 = r4
                r12.d(r2)
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                java.lang.Object r12 = r5
                r2.V(r12)
            L_0x0078:
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                kotlinx.coroutines.sync.Mutex r2 = r2.H()
                androidx.compose.animation.core.SeekableTransitionState r12 = r4
                r1.D = r2
                r1.E = r12
                r1.F = r7
                java.lang.Object r7 = r2.d(r11, r1)
                if (r7 != r0) goto L_0x008d
                return r0
            L_0x008d:
                r7 = r2
                r2 = r12
            L_0x008f:
                java.lang.Object r2 = r2.F()     // Catch:{ all -> 0x01f0 }
                r7.e(r11)
                java.lang.Object r7 = r5
                boolean r2 = kotlin.jvm.internal.Intrinsics.d(r7, r2)
                if (r2 != 0) goto L_0x00b8
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                r1.D = r11
                r1.E = r11
                r1.F = r6
                java.lang.Object r2 = r2.D(r1)
                if (r2 != r0) goto L_0x00ad
                return r0
            L_0x00ad:
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                r1.F = r5
                java.lang.Object r2 = r2.Z(r1)
                if (r2 != r0) goto L_0x00b8
                return r0
            L_0x00b8:
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                java.lang.Object r2 = r2.a()
                java.lang.Object r5 = r5
                boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r5)
                if (r2 != 0) goto L_0x01ed
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                float r2 = r2.I()
                r5 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 >= 0) goto L_0x01c7
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r2 = r2.f2655n
                androidx.compose.animation.core.FiniteAnimationSpec r6 = r7
                if (r6 == 0) goto L_0x00e7
                kotlin.jvm.internal.FloatCompanionObject r7 = kotlin.jvm.internal.FloatCompanionObject.f40896a
                androidx.compose.animation.core.TwoWayConverter r7 = androidx.compose.animation.core.VectorConvertersKt.i(r7)
                androidx.compose.animation.core.VectorizedFiniteAnimationSpec r6 = r6.a(r7)
                goto L_0x00e8
            L_0x00e7:
                r6 = r11
            L_0x00e8:
                if (r2 == 0) goto L_0x00f4
                androidx.compose.animation.core.VectorizedAnimationSpec r7 = r2.a()
                boolean r7 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
                if (r7 != 0) goto L_0x01c7
            L_0x00f4:
                if (r2 == 0) goto L_0x00fc
                androidx.compose.animation.core.VectorizedAnimationSpec r7 = r2.a()
                r12 = r7
                goto L_0x00fd
            L_0x00fc:
                r12 = r11
            L_0x00fd:
                if (r12 == 0) goto L_0x0126
                long r13 = r2.e()
                androidx.compose.animation.core.AnimationVector1D r15 = r2.f()
                androidx.compose.animation.core.SeekableTransitionState$Companion r5 = androidx.compose.animation.core.SeekableTransitionState.f2639r
                androidx.compose.animation.core.AnimationVector1D r16 = r5.a()
                androidx.compose.animation.core.AnimationVector1D r5 = r2.d()
                if (r5 != 0) goto L_0x011d
                androidx.compose.animation.core.SeekableTransitionState$Companion r5 = androidx.compose.animation.core.SeekableTransitionState.f2639r
                androidx.compose.animation.core.AnimationVector1D r5 = r5.b()
            L_0x011d:
                r17 = r5
                androidx.compose.animation.core.AnimationVector r5 = r12.c(r13, r15, r16, r17)
                androidx.compose.animation.core.AnimationVector1D r5 = (androidx.compose.animation.core.AnimationVector1D) r5
                goto L_0x0163
            L_0x0126:
                if (r2 == 0) goto L_0x015b
                long r12 = r2.e()
                int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r7 != 0) goto L_0x0131
                goto L_0x015b
            L_0x0131:
                long r12 = r2.c()
                r14 = -9223372036854775808
                int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r7 != 0) goto L_0x0141
                androidx.compose.animation.core.SeekableTransitionState r7 = r4
                long r12 = r7.J()
            L_0x0141:
                float r7 = (float) r12
                r12 = 1315859240(0x4e6e6b28, float:1.0E9)
                float r7 = r7 / r12
                int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                if (r12 > 0) goto L_0x0153
                androidx.compose.animation.core.SeekableTransitionState$Companion r5 = androidx.compose.animation.core.SeekableTransitionState.f2639r
                androidx.compose.animation.core.AnimationVector1D r5 = r5.b()
                goto L_0x0163
            L_0x0153:
                androidx.compose.animation.core.AnimationVector1D r12 = new androidx.compose.animation.core.AnimationVector1D
                float r5 = r5 / r7
                r12.<init>(r5)
                r5 = r12
                goto L_0x0163
            L_0x015b:
                androidx.compose.animation.core.SeekableTransitionState$Companion r5 = androidx.compose.animation.core.SeekableTransitionState.f2639r
                androidx.compose.animation.core.AnimationVector1D r5 = r5.b()
            L_0x0163:
                if (r2 != 0) goto L_0x016a
                androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r2 = new androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState
                r2.<init>()
            L_0x016a:
                r2.i(r6)
                r7 = 0
                r2.k(r7)
                androidx.compose.animation.core.SeekableTransitionState r12 = r4
                float r12 = r12.I()
                r2.o(r12)
                androidx.compose.animation.core.AnimationVector1D r12 = r2.f()
                androidx.compose.animation.core.SeekableTransitionState r13 = r4
                float r13 = r13.I()
                r12.e(r7, r13)
                androidx.compose.animation.core.SeekableTransitionState r7 = r4
                long r12 = r7.J()
                r2.l(r12)
                r2.n(r8)
                r2.m(r5)
                if (r6 == 0) goto L_0x01a9
                androidx.compose.animation.core.AnimationVector1D r7 = r2.f()
                androidx.compose.animation.core.SeekableTransitionState$Companion r8 = androidx.compose.animation.core.SeekableTransitionState.f2639r
                androidx.compose.animation.core.AnimationVector1D r8 = r8.a()
                long r5 = r6.b(r7, r8, r5)
                goto L_0x01bf
            L_0x01a9:
                androidx.compose.animation.core.SeekableTransitionState r5 = r4
                long r5 = r5.J()
                double r5 = (double) r5
                androidx.compose.animation.core.SeekableTransitionState r7 = r4
                float r7 = r7.I()
                double r7 = (double) r7
                r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r12 = r12 - r7
                double r5 = r5 * r12
                long r5 = kotlin.math.MathKt.e(r5)
            L_0x01bf:
                r2.j(r5)
                androidx.compose.animation.core.SeekableTransitionState r5 = r4
                r5.f2655n = r2
            L_0x01c7:
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                r1.D = r11
                r1.E = r11
                r1.F = r4
                java.lang.Object r2 = r2.O(r1)
                if (r2 != r0) goto L_0x01d6
                return r0
            L_0x01d6:
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                java.lang.Object r4 = r5
                r2.d(r4)
                androidx.compose.animation.core.SeekableTransitionState r2 = r4
                r1.F = r3
                java.lang.Object r2 = r2.Y(r1)
                if (r2 != r0) goto L_0x01e8
                return r0
            L_0x01e8:
                androidx.compose.animation.core.SeekableTransitionState r0 = r4
                r0.U(r10)
            L_0x01ed:
                kotlin.Unit r0 = kotlin.Unit.f40552a
                return r0
            L_0x01f0:
                r0 = move-exception
                r2 = r0
                r7.e(r11)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState$animateTo$2.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateTo$2(Transition transition, SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation) {
        super(1, continuation);
        this.E = transition;
        this.F = seekableTransitionState;
        this.G = obj;
        this.H = finiteAnimationSpec;
    }

    public final Continuation A(Continuation continuation) {
        return new SeekableTransitionState$animateTo$2(this.E, this.F, this.G, this.H, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((SeekableTransitionState$animateTo$2) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final SeekableTransitionState seekableTransitionState = this.F;
            final Object obj2 = this.G;
            final Transition transition = this.E;
            final FiniteAnimationSpec finiteAnimationSpec = this.H;
            AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (CoroutineScopeKt.f(r3, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.E.A();
        return Unit.f40552a;
    }
}
