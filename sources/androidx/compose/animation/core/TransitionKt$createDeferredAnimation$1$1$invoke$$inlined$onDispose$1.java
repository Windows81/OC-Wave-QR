package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;

@Metadata
public final class TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Transition f2748a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transition.DeferredAnimation f2749b;

    public TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1(Transition transition, Transition.DeferredAnimation deferredAnimation) {
        this.f2748a = transition;
        this.f2749b = deferredAnimation;
    }

    public void d() {
        this.f2748a.C(this.f2749b);
    }
}
