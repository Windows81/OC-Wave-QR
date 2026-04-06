package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1 extends Lambda implements Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f2076A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode f2077z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1(AnimatedContentTransitionScopeImpl.SizeModifierNode sizeModifierNode, long j2) {
        super(1);
        this.f2077z = sizeModifierNode;
        this.f2076A = j2;
    }

    /* renamed from: b */
    public final FiniteAnimationSpec invoke(Transition.Segment segment) {
        long j2;
        FiniteAnimationSpec b2;
        if (Intrinsics.d(segment.b(), this.f2077z.a3().b())) {
            j2 = this.f2077z.c3(this.f2076A);
        } else {
            State state = (State) this.f2077z.a3().n().e(segment.b());
            j2 = state != null ? ((IntSize) state.getValue()).j() : IntSize.f19170b.a();
        }
        State state2 = (State) this.f2077z.a3().n().e(segment.d());
        long j3 = state2 != null ? ((IntSize) state2.getValue()).j() : IntSize.f19170b.a();
        SizeTransform sizeTransform = (SizeTransform) this.f2077z.b3().getValue();
        return (sizeTransform == null || (b2 = sizeTransform.b(j2, j3)) == null) ? AnimationSpecKt.l(0.0f, 400.0f, (Object) null, 5, (Object) null) : b2;
    }
}
