package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentKt$AnimatedContent$1 extends Lambda implements Function1<AnimatedContentTransitionScope<Object>, ContentTransform> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnimatedContentKt$AnimatedContent$1 f2023z = new AnimatedContentKt$AnimatedContent$1();

    public AnimatedContentKt$AnimatedContent$1() {
        super(1);
    }

    /* renamed from: b */
    public final ContentTransform invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return AnimatedContentKt.f(EnterExitTransitionKt.o(AnimationSpecKt.n(220, 90, (Easing) null, 4, (Object) null), 0.0f, 2, (Object) null).c(EnterExitTransitionKt.s(AnimationSpecKt.n(220, 90, (Easing) null, 4, (Object) null), 0.92f, 0, 4, (Object) null)), EnterExitTransitionKt.q(AnimationSpecKt.n(90, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null));
    }
}
