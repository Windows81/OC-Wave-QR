package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class SuspendAnimationKt {
    public static final Object b(float f2, float f3, float f4, AnimationSpec animationSpec, Function2 function2, Continuation continuation) {
        Object d2 = d(VectorConvertersKt.i(FloatCompanionObject.f40896a), Boxing.b(f2), Boxing.b(f3), Boxing.b(f4), animationSpec, function2, continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3 A[Catch:{ CancellationException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(androidx.compose.animation.core.AnimationState r25, androidx.compose.animation.core.Animation r26, long r27, kotlin.jvm.functions.Function1 r29, kotlin.coroutines.Continuation r30) {
        /*
            r9 = r25
            r0 = r26
            r1 = r30
            boolean r2 = r1 instanceof androidx.compose.animation.core.SuspendAnimationKt$animate$4
            if (r2 == 0) goto L_0x001a
            r2 = r1
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = (androidx.compose.animation.core.SuspendAnimationKt$animate$4) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.H = r3
        L_0x0018:
            r10 = r2
            goto L_0x0020
        L_0x001a:
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = new androidx.compose.animation.core.SuspendAnimationKt$animate$4
            r2.<init>(r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r10.G
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r10.H
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L_0x0067
            if (r2 == r13) goto L_0x0051
            if (r2 != r12) goto L_0x0049
            java.lang.Object r0 = r10.F
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r0 = r10.E
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r3 = r10.D
            androidx.compose.animation.core.Animation r3 = (androidx.compose.animation.core.Animation) r3
            java.lang.Object r4 = r10.C
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
        L_0x0041:
            kotlin.ResultKt.b(r1)     // Catch:{ CancellationException -> 0x0045 }
            goto L_0x0063
        L_0x0045:
            r0 = move-exception
            r9 = r4
            goto L_0x0123
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0051:
            java.lang.Object r0 = r10.F
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r0 = r10.E
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r3 = r10.D
            androidx.compose.animation.core.Animation r3 = (androidx.compose.animation.core.Animation) r3
            java.lang.Object r4 = r10.C
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
            goto L_0x0041
        L_0x0063:
            r8 = r0
            r0 = r3
            goto L_0x00e6
        L_0x0067:
            kotlin.ResultKt.b(r1)
            r1 = 0
            java.lang.Object r15 = r0.f(r1)
            androidx.compose.animation.core.AnimationVector r17 = r0.d(r1)
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            r1 = -9223372036854775808
            int r1 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00af
            kotlin.coroutines.CoroutineContext r1 = r10.f()     // Catch:{ CancellationException -> 0x00ab }
            float r7 = o(r1)     // Catch:{ CancellationException -> 0x00ab }
            androidx.compose.animation.core.SuspendAnimationKt$animate$6 r8 = new androidx.compose.animation.core.SuspendAnimationKt$animate$6     // Catch:{ CancellationException -> 0x00ab }
            r1 = r8
            r2 = r14
            r3 = r15
            r4 = r26
            r5 = r17
            r6 = r25
            r15 = r8
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x00ab }
            r10.C = r9     // Catch:{ CancellationException -> 0x00ab }
            r10.D = r0     // Catch:{ CancellationException -> 0x00ab }
            r8 = r29
            r10.E = r8     // Catch:{ CancellationException -> 0x00ab }
            r10.F = r14     // Catch:{ CancellationException -> 0x00ab }
            r10.H = r13     // Catch:{ CancellationException -> 0x00ab }
            java.lang.Object r1 = l(r0, r15, r10)     // Catch:{ CancellationException -> 0x00ab }
            if (r1 != r11) goto L_0x00e4
            return r11
        L_0x00ab:
            r0 = move-exception
        L_0x00ac:
            r2 = r14
            goto L_0x0123
        L_0x00af:
            r8 = r29
            androidx.compose.animation.core.AnimationScope r13 = new androidx.compose.animation.core.AnimationScope     // Catch:{ CancellationException -> 0x00ab }
            androidx.compose.animation.core.TwoWayConverter r16 = r26.c()     // Catch:{ CancellationException -> 0x00ab }
            java.lang.Object r20 = r26.g()     // Catch:{ CancellationException -> 0x00ab }
            androidx.compose.animation.core.SuspendAnimationKt$animate$7 r1 = new androidx.compose.animation.core.SuspendAnimationKt$animate$7     // Catch:{ CancellationException -> 0x00ab }
            r1.<init>(r9)     // Catch:{ CancellationException -> 0x00ab }
            r23 = 1
            r7 = r14
            r14 = r13
            r18 = r27
            r21 = r27
            r24 = r1
            r14.<init>(r15, r16, r17, r18, r20, r21, r23, r24)     // Catch:{ CancellationException -> 0x0120 }
            kotlin.coroutines.CoroutineContext r1 = r10.f()     // Catch:{ CancellationException -> 0x0120 }
            float r4 = o(r1)     // Catch:{ CancellationException -> 0x0120 }
            r1 = r13
            r2 = r27
            r5 = r26
            r6 = r25
            r14 = r7
            r7 = r29
            n(r1, r2, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x00ab }
            r14.f40908z = r13     // Catch:{ CancellationException -> 0x00ab }
        L_0x00e4:
            r4 = r9
            r2 = r14
        L_0x00e6:
            java.lang.Object r1 = r2.f40908z     // Catch:{ CancellationException -> 0x0045 }
            kotlin.jvm.internal.Intrinsics.f(r1)     // Catch:{ CancellationException -> 0x0045 }
            androidx.compose.animation.core.AnimationScope r1 = (androidx.compose.animation.core.AnimationScope) r1     // Catch:{ CancellationException -> 0x0045 }
            boolean r1 = r1.h()     // Catch:{ CancellationException -> 0x0045 }
            if (r1 == 0) goto L_0x011d
            kotlin.coroutines.CoroutineContext r1 = r10.f()     // Catch:{ CancellationException -> 0x0045 }
            float r1 = o(r1)     // Catch:{ CancellationException -> 0x0045 }
            androidx.compose.animation.core.SuspendAnimationKt$animate$9 r3 = new androidx.compose.animation.core.SuspendAnimationKt$animate$9     // Catch:{ CancellationException -> 0x0045 }
            r25 = r3
            r26 = r2
            r27 = r1
            r28 = r0
            r29 = r4
            r30 = r8
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ CancellationException -> 0x0045 }
            r10.C = r4     // Catch:{ CancellationException -> 0x0045 }
            r10.D = r0     // Catch:{ CancellationException -> 0x0045 }
            r10.E = r8     // Catch:{ CancellationException -> 0x0045 }
            r10.F = r2     // Catch:{ CancellationException -> 0x0045 }
            r10.H = r12     // Catch:{ CancellationException -> 0x0045 }
            java.lang.Object r1 = l(r0, r3, r10)     // Catch:{ CancellationException -> 0x0045 }
            if (r1 != r11) goto L_0x00e6
            return r11
        L_0x011d:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        L_0x0120:
            r0 = move-exception
            r14 = r7
            goto L_0x00ac
        L_0x0123:
            java.lang.Object r1 = r2.f40908z
            androidx.compose.animation.core.AnimationScope r1 = (androidx.compose.animation.core.AnimationScope) r1
            r3 = 0
            if (r1 != 0) goto L_0x012b
            goto L_0x012e
        L_0x012b:
            r1.k(r3)
        L_0x012e:
            java.lang.Object r1 = r2.f40908z
            androidx.compose.animation.core.AnimationScope r1 = (androidx.compose.animation.core.AnimationScope) r1
            if (r1 == 0) goto L_0x0143
            long r1 = r1.c()
            long r4 = r9.h()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0143
            r9.x(r3)
        L_0x0143:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.c(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object d(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, Function2 function2, Continuation continuation) {
        AnimationVector animationVector;
        Object obj4 = obj3;
        if (obj4 == null || (animationVector = (AnimationVector) twoWayConverter.a().invoke(obj4)) == null) {
            animationVector = AnimationVectorsKt.g((AnimationVector) twoWayConverter.a().invoke(obj));
        } else {
            Object obj5 = obj;
        }
        TargetBasedAnimation targetBasedAnimation = new TargetBasedAnimation(animationSpec, twoWayConverter, obj, obj2, animationVector);
        AnimationState animationState = new AnimationState(twoWayConverter, obj, animationVector, 0, 0, false, 56, (DefaultConstructorMarker) null);
        TwoWayConverter twoWayConverter2 = twoWayConverter;
        Object f2 = f(animationState, targetBasedAnimation, 0, new SuspendAnimationKt$animate$3(function2, twoWayConverter), continuation, 2, (Object) null);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public static /* synthetic */ Object e(float f2, float f3, float f4, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i2, Object obj) {
        float f5 = (i2 & 4) != 0 ? 0.0f : f4;
        if ((i2 & 8) != 0) {
            animationSpec = AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return b(f2, f3, f5, animationSpec, function2, continuation);
    }

    public static /* synthetic */ Object f(AnimationState animationState, Animation animation, long j2, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = Long.MIN_VALUE;
        }
        long j3 = j2;
        if ((i2 & 4) != 0) {
            function1 = SuspendAnimationKt$animate$5.f2689z;
        }
        return c(animationState, animation, j3, function1, continuation);
    }

    public static final Object g(float f2, float f3, FloatDecayAnimationSpec floatDecayAnimationSpec, Function2 function2, Continuation continuation) {
        Object f4 = f(AnimationStateKt.c(f2, f3, 0, 0, false, 28, (Object) null), AnimationKt.a(floatDecayAnimationSpec, f2, f3), 0, new SuspendAnimationKt$animateDecay$2(function2), continuation, 2, (Object) null);
        return f4 == IntrinsicsKt.f() ? f4 : Unit.f40552a;
    }

    public static final Object h(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z2, Function1 function1, Continuation continuation) {
        Object c2 = c(animationState, new DecayAnimation(decayAnimationSpec, animationState.i(), animationState.getValue(), animationState.t()), z2 ? animationState.h() : Long.MIN_VALUE, function1, continuation);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public static /* synthetic */ Object i(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z2, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            function1 = SuspendAnimationKt$animateDecay$4.f2699z;
        }
        return h(animationState, decayAnimationSpec, z2, function1, continuation);
    }

    public static final Object j(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z2, Function1 function1, Continuation continuation) {
        Object c2 = c(animationState, new TargetBasedAnimation(animationSpec, animationState.i(), animationState.getValue(), obj, animationState.t()), z2 ? animationState.h() : Long.MIN_VALUE, function1, continuation);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public static /* synthetic */ Object k(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z2, Function1 function1, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            function1 = SuspendAnimationKt$animateTo$2.f2700z;
        }
        return j(animationState, obj, animationSpec2, z3, function1, continuation);
    }

    public static final Object l(Animation animation, Function1 function1, Continuation continuation) {
        return animation.a() ? InfiniteAnimationPolicyKt.a(function1, continuation) : MonotonicFrameClockKt.c(new SuspendAnimationKt$callWithFrameNanos$2(function1), continuation);
    }

    public static final void m(AnimationScope animationScope, long j2, long j3, Animation animation, AnimationState animationState, Function1 function1) {
        animationScope.j(j2);
        animationScope.l(animation.f(j3));
        animationScope.m(animation.d(j3));
        if (animation.e(j3)) {
            animationScope.i(animationScope.c());
            animationScope.k(false);
        }
        p(animationScope, animationState);
        function1.invoke(animationScope);
    }

    public static final void n(AnimationScope animationScope, long j2, float f2, Animation animation, AnimationState animationState, Function1 function1) {
        m(animationScope, j2, f2 == 0.0f ? animation.b() : (long) (((float) (j2 - animationScope.d())) / f2), animation, animationState, function1);
    }

    public static final float o(CoroutineContext coroutineContext) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.d(MotionDurationScale.f15495e);
        float H = motionDurationScale != null ? motionDurationScale.H() : 1.0f;
        if (!(H >= 0.0f)) {
            PreconditionsKt.b("negative scale factor");
        }
        return H;
    }

    public static final void p(AnimationScope animationScope, AnimationState animationState) {
        animationState.y(animationScope.e());
        AnimationVectorsKt.f(animationState.t(), animationScope.g());
        animationState.v(animationScope.b());
        animationState.w(animationScope.c());
        animationState.x(animationScope.h());
    }
}
