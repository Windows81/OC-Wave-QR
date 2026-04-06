package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionModifierNode$measure$offsetDelta$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> {

    /* renamed from: z  reason: collision with root package name */
    public static final EnterExitTransitionModifierNode$measure$offsetDelta$1 f2267z = new EnterExitTransitionModifierNode$measure$offsetDelta$1();

    public EnterExitTransitionModifierNode$measure$offsetDelta$1() {
        super(1);
    }

    /* renamed from: b */
    public final FiniteAnimationSpec invoke(Transition.Segment segment) {
        return EnterExitTransitionKt.f2216c;
    }
}
