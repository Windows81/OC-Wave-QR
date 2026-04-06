package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;

@Metadata
public final class InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition f2599a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition.TransitionAnimationState f2600b;

    public InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1(InfiniteTransition infiniteTransition, InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        this.f2599a = infiniteTransition;
        this.f2600b = transitionAnimationState;
    }

    public void d() {
        this.f2599a.j(this.f2600b);
    }
}
