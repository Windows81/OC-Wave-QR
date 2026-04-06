package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$createChildTransitionInternal$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Transition f2769A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2770z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$createChildTransitionInternal$1$1(Transition transition, Transition transition2) {
        super(1);
        this.f2770z = transition;
        this.f2769A = transition2;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f2770z.d(this.f2769A);
        return new TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1(this.f2770z, this.f2769A);
    }
}
