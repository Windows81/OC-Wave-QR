package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionModifierNode$sizeTransitionSpec$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnterExitTransitionModifierNode f2272z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$sizeTransitionSpec$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        super(1);
        this.f2272z = enterExitTransitionModifierNode;
    }

    /* renamed from: b */
    public final FiniteAnimationSpec invoke(Transition.Segment segment) {
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        FiniteAnimationSpec finiteAnimationSpec = null;
        if (segment.c(enterExitState, enterExitState2)) {
            ChangeSize a2 = this.f2272z.a3().b().a();
            if (a2 != null) {
                finiteAnimationSpec = a2.b();
            }
        } else if (segment.c(enterExitState2, EnterExitState.PostExit)) {
            ChangeSize a3 = this.f2272z.b3().b().a();
            if (a3 != null) {
                finiteAnimationSpec = a3.b();
            }
        } else {
            finiteAnimationSpec = EnterExitTransitionKt.f2217d;
        }
        return finiteAnimationSpec == null ? EnterExitTransitionKt.f2217d : finiteAnimationSpec;
    }
}
