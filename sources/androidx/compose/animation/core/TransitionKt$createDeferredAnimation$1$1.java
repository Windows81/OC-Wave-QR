package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$createDeferredAnimation$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Transition.DeferredAnimation f2771A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2772z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$createDeferredAnimation$1$1(Transition transition, Transition.DeferredAnimation deferredAnimation) {
        super(1);
        this.f2772z = transition;
        this.f2771A = deferredAnimation;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        return new TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1(this.f2772z, this.f2771A);
    }
}
