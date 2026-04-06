package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<TransformOrigin>> {

    /* renamed from: z  reason: collision with root package name */
    public static final EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 f2233z = new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1();

    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1() {
        super(1);
    }

    /* renamed from: b */
    public final FiniteAnimationSpec invoke(Transition.Segment segment) {
        return AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);
    }
}
