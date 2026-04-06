package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$createTransitionAnimation$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Transition.TransitionAnimationState f2773A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2774z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$createTransitionAnimation$1$1(Transition transition, Transition.TransitionAnimationState transitionAnimationState) {
        super(1);
        this.f2774z = transition;
        this.f2773A = transitionAnimationState;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f2774z.c(this.f2773A);
        return new TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1(this.f2774z, this.f2773A);
    }
}
