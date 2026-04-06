package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedTransitionScopeKt$SharedTransitionScope$1$3$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f2381z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$1$3$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(1);
        this.f2381z = sharedTransitionScopeImpl;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        return new SharedTransitionScopeKt$SharedTransitionScope$1$3$1$invoke$$inlined$onDispose$1(this.f2381z);
    }
}
