package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$updateTransition$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2776z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$updateTransition$1$1(Transition transition) {
        super(1);
        this.f2776z = transition;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        return new TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1(this.f2776z);
    }
}
