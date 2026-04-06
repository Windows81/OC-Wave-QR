package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata
public final class AnchoredDraggableKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function1 f3328a = AnchoredDraggableKt$AlwaysDrag$1.f3332z;

    /* renamed from: b  reason: collision with root package name */
    public static final Function1 f3329b = AnchoredDraggableKt$GetOrNan$1.f3338z;

    /* renamed from: c  reason: collision with root package name */
    public static final float f3330c = Dp.m((float) 125);

    /* renamed from: d  reason: collision with root package name */
    public static final DecayAnimationSpec f3331d = DecayAnimationSpecKt.d(new AnchoredDraggableKt$NoOpDecayAnimationSpec$1());

    public static final SnapLayoutInfoProvider a(AnchoredDraggableState anchoredDraggableState, Function1 function1, Function0 function0) {
        return new AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1(anchoredDraggableState, function1, function0);
    }

    public static final AnchoredDraggableState b(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function12) {
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(obj, function12);
        anchoredDraggableState.H(function1);
        anchoredDraggableState.K(function0);
        anchoredDraggableState.J(animationSpec);
        anchoredDraggableState.D(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static final DraggableAnchors c(Function1 function1) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        return new DefaultDraggableAnchors(draggableAnchorsConfig.b(), draggableAnchorsConfig.c());
    }

    public static final TargetedFlingBehavior k(AnchoredDraggableState anchoredDraggableState, Density density, Function1 function1, AnimationSpec animationSpec) {
        return SnapFlingBehaviorKt.n(a(anchoredDraggableState, function1, new AnchoredDraggableKt$anchoredDraggableFlingBehavior$1(density)), f3331d, animationSpec);
    }

    public static final Object l(AnchoredDraggableState anchoredDraggableState, float f2, AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, AnimationSpec animationSpec, Continuation continuation) {
        Object b2;
        float c2 = draggableAnchors.c(obj);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.f40905z = Float.isNaN(anchoredDraggableState.r()) ? 0.0f : anchoredDraggableState.r();
        if (!Float.isNaN(c2)) {
            float f3 = floatRef.f40905z;
            if (f3 != c2 && (b2 = SuspendAnimationKt.b(f3, c2, f2, animationSpec, new AnchoredDraggableKt$animateTo$2$2(anchoredDragScope, floatRef), continuation)) == IntrinsicsKt.f()) {
                return b2;
            }
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m(androidx.compose.foundation.gestures.AnchoredDraggableState r16, java.lang.Object r17, float r18, androidx.compose.animation.core.AnimationSpec r19, androidx.compose.animation.core.DecayAnimationSpec r20, kotlin.coroutines.Continuation r21) {
        /*
            r7 = r18
            r0 = r21
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            if (r1 == 0) goto L_0x0018
            r1 = r0
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1) r1
            int r2 = r1.F
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.F = r2
        L_0x0016:
            r12 = r1
            goto L_0x001e
        L_0x0018:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r1.<init>(r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r12.E
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.F
            r8 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 != r8) goto L_0x0035
            float r1 = r12.C
            java.lang.Object r2 = r12.D
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref.FloatRef) r2
            kotlin.ResultKt.b(r0)
            goto L_0x006f
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            kotlin.ResultKt.b(r0)
            kotlin.jvm.internal.Ref$FloatRef r14 = new kotlin.jvm.internal.Ref$FloatRef
            r14.<init>()
            r14.f40905z = r7
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r11 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r6 = 0
            r0 = r11
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r14
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.D = r14
            r12.C = r7
            r12.F = r8
            r10 = 0
            r13 = 2
            r0 = 0
            r8 = r16
            r9 = r17
            r1 = r14
            r14 = r0
            java.lang.Object r0 = androidx.compose.foundation.gestures.AnchoredDraggableState.k(r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r15) goto L_0x006d
            return r15
        L_0x006d:
            r2 = r1
            r1 = r7
        L_0x006f:
            float r0 = r2.f40905z
            float r1 = r1 - r0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.m(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.DecayAnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object n(AnchoredDraggableState anchoredDraggableState, Object obj, float f2, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            animationSpec = anchoredDraggableState.w() ? anchoredDraggableState.u() : AnchoredDraggableDefaults.f3319a.c();
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 8) != 0) {
            decayAnimationSpec = anchoredDraggableState.w() ? anchoredDraggableState.o() : AnchoredDraggableDefaults.f3319a.a();
        }
        return m(anchoredDraggableState, obj, f2, animationSpec2, decayAnimationSpec, continuation);
    }

    public static final float o(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f3 > 0.0f ? RangesKt.i(f2, f3) : RangesKt.d(f2, f3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r1 != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r1 != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object p(androidx.compose.foundation.gestures.DraggableAnchors r5, float r6, float r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function0 r9) {
        /*
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 != 0) goto L_0x0095
            float r0 = java.lang.Math.abs(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L_0x0013
            r0 = r3
            goto L_0x0014
        L_0x0013:
            r0 = r2
        L_0x0014:
            if (r0 == 0) goto L_0x001c
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x001c
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            if (r0 != 0) goto L_0x0028
            java.lang.Object r5 = r5.b(r6)
            kotlin.jvm.internal.Intrinsics.f(r5)
            goto L_0x008e
        L_0x0028:
            float r7 = java.lang.Math.abs(r7)
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L_0x0046
            java.lang.Object r5 = r5.a(r6, r1)
            kotlin.jvm.internal.Intrinsics.f(r5)
            goto L_0x008e
        L_0x0046:
            java.lang.Object r7 = r5.a(r6, r2)
            kotlin.jvm.internal.Intrinsics.f(r7)
            float r9 = r5.c(r7)
            java.lang.Object r0 = r5.a(r6, r3)
            kotlin.jvm.internal.Intrinsics.f(r0)
            float r5 = r5.c(r0)
            float r4 = r9 - r5
            float r4 = java.lang.Math.abs(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r8 = r8.invoke(r4)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = java.lang.Math.abs(r8)
            if (r1 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r9 = r5
        L_0x0078:
            float r9 = r9 - r6
            float r5 = java.lang.Math.abs(r9)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0082
            r2 = r3
        L_0x0082:
            if (r2 != r3) goto L_0x0087
            if (r1 == 0) goto L_0x008b
            goto L_0x008d
        L_0x0087:
            if (r2 != 0) goto L_0x008f
            if (r1 == 0) goto L_0x008d
        L_0x008b:
            r5 = r7
            goto L_0x008e
        L_0x008d:
            r5 = r0
        L_0x008e:
            return r5
        L_0x008f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0095:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The offset provided to computeTarget must not be NaN."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.p(androidx.compose.foundation.gestures.DraggableAnchors, float, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public static final DefaultDraggableAnchors q() {
        return new DefaultDraggableAnchors(CollectionsKt.m(), new float[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(kotlin.jvm.functions.Function0 r4, kotlin.jvm.functions.Function2 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.D = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r6)     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.b(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            r0.D = r3     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.f(r6, r0)     // Catch:{ AnchoredDragFinishedSignal -> 0x0043 }
            if (r4 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlin.Unit r4 = kotlin.Unit.f40552a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.r(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
