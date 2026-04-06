package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;

@Metadata
public final class TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Transition f2750a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transition.TransitionAnimationState f2751b;

    public TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1(Transition transition, Transition.TransitionAnimationState transitionAnimationState) {
        this.f2750a = transition;
        this.f2751b = transitionAnimationState;
    }

    public void d() {
        this.f2750a.D(this.f2751b);
    }
}
