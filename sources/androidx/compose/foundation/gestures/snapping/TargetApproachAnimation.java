package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

@Metadata
final class TargetApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {

    /* renamed from: a  reason: collision with root package name */
    public final AnimationSpec f3678a;

    public TargetApproachAnimation(AnimationSpec animationSpec) {
        this.f3678a = animationSpec;
    }

    public /* bridge */ /* synthetic */ Object a(ScrollScope scrollScope, Object obj, Object obj2, Function1 function1, Continuation continuation) {
        return b(scrollScope, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), function1, continuation);
    }

    public Object b(ScrollScope scrollScope, float f2, float f3, Function1 function1, Continuation continuation) {
        Object c2 = SnapFlingBehaviorKt.h(scrollScope, Math.abs(f2) * Math.signum(f3), f2, AnimationStateKt.c(0.0f, f3, 0, 0, false, 28, (Object) null), this.f3678a, function1, continuation);
        return c2 == IntrinsicsKt.f() ? c2 : (AnimationResult) c2;
    }
}
