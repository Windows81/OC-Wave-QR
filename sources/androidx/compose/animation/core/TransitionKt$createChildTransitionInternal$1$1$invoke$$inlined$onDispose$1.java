package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;

@Metadata
public final class TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Transition f2746a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transition f2747b;

    public TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1(Transition transition, Transition transition2) {
        this.f2746a = transition;
        this.f2747b = transition2;
    }

    public void d() {
        this.f2746a.E(this.f2747b);
    }
}
