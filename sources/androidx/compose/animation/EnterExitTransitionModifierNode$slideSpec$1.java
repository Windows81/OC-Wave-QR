package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionModifierNode$slideSpec$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnterExitTransitionModifierNode f2273z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$slideSpec$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        super(1);
        this.f2273z = enterExitTransitionModifierNode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r3.a();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.animation.core.FiniteAnimationSpec invoke(androidx.compose.animation.core.Transition.Segment r3) {
        /*
            r2 = this;
            androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.PreEnter
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.Visible
            boolean r0 = r3.c(r0, r1)
            if (r0 == 0) goto L_0x0025
            androidx.compose.animation.EnterExitTransitionModifierNode r3 = r2.f2273z
            androidx.compose.animation.EnterTransition r3 = r3.a3()
            androidx.compose.animation.TransitionData r3 = r3.b()
            androidx.compose.animation.Slide r3 = r3.f()
            if (r3 == 0) goto L_0x0020
            androidx.compose.animation.core.FiniteAnimationSpec r3 = r3.a()
            if (r3 != 0) goto L_0x004c
        L_0x0020:
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.EnterExitTransitionKt.f2216c
            goto L_0x004c
        L_0x0025:
            androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.PostExit
            boolean r3 = r3.c(r1, r0)
            if (r3 == 0) goto L_0x0048
            androidx.compose.animation.EnterExitTransitionModifierNode r3 = r2.f2273z
            androidx.compose.animation.ExitTransition r3 = r3.b3()
            androidx.compose.animation.TransitionData r3 = r3.b()
            androidx.compose.animation.Slide r3 = r3.f()
            if (r3 == 0) goto L_0x0043
            androidx.compose.animation.core.FiniteAnimationSpec r3 = r3.a()
            if (r3 != 0) goto L_0x004c
        L_0x0043:
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.EnterExitTransitionKt.f2216c
            goto L_0x004c
        L_0x0048:
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.EnterExitTransitionKt.f2216c
        L_0x004c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1.invoke(androidx.compose.animation.core.Transition$Segment):androidx.compose.animation.core.FiniteAnimationSpec");
    }
}
