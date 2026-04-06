package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazySaveableStateHolder$SaveableStateProvider$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f4943A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazySaveableStateHolder f4944z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$SaveableStateProvider$1$1(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
        super(1);
        this.f4944z = lazySaveableStateHolder;
        this.f4943A = obj;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f4944z.f4935B.u(this.f4943A);
        return new LazySaveableStateHolder$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1(this.f4944z, this.f4943A);
    }
}
