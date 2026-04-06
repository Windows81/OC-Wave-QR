package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InfiniteTransitionKt$animateValue$2$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition.TransitionAnimationState f2604A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition f2605z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$2$1(InfiniteTransition infiniteTransition, InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        super(1);
        this.f2605z = infiniteTransition;
        this.f2604A = transitionAnimationState;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f2605z.f(this.f2604A);
        return new InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1(this.f2605z, this.f2604A);
    }
}
