package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ExitTransition f2220A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnterTransition f2221z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.f2221z = enterTransition;
        this.f2220A = exitTransition;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r3 = r3.b();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.animation.core.FiniteAnimationSpec invoke(androidx.compose.animation.core.Transition.Segment r3) {
        /*
            r2 = this;
            androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.PreEnter
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.Visible
            boolean r0 = r3.c(r0, r1)
            if (r0 == 0) goto L_0x0021
            androidx.compose.animation.EnterTransition r3 = r2.f2221z
            androidx.compose.animation.TransitionData r3 = r3.b()
            androidx.compose.animation.Fade r3 = r3.c()
            if (r3 == 0) goto L_0x001c
            androidx.compose.animation.core.FiniteAnimationSpec r3 = r3.b()
            if (r3 != 0) goto L_0x0044
        L_0x001c:
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.EnterExitTransitionKt.f2215b
            goto L_0x0044
        L_0x0021:
            androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.PostExit
            boolean r3 = r3.c(r1, r0)
            if (r3 == 0) goto L_0x0040
            androidx.compose.animation.ExitTransition r3 = r2.f2220A
            androidx.compose.animation.TransitionData r3 = r3.b()
            androidx.compose.animation.Fade r3 = r3.c()
            if (r3 == 0) goto L_0x003b
            androidx.compose.animation.core.FiniteAnimationSpec r3 = r3.b()
            if (r3 != 0) goto L_0x0044
        L_0x003b:
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.EnterExitTransitionKt.f2215b
            goto L_0x0044
        L_0x0040:
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.EnterExitTransitionKt.f2215b
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1.invoke(androidx.compose.animation.core.Transition$Segment):androidx.compose.animation.core.FiniteAnimationSpec");
    }
}
