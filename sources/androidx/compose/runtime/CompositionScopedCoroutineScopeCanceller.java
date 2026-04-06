package androidx.compose.runtime;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineScope f14634z;

    public CompositionScopedCoroutineScopeCanceller(CoroutineScope coroutineScope) {
        this.f14634z = coroutineScope;
    }

    public final CoroutineScope a() {
        return this.f14634z;
    }

    public void e() {
        CoroutineScope coroutineScope = this.f14634z;
        if (coroutineScope instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) coroutineScope).c();
        } else {
            CoroutineScopeKt.d(coroutineScope, new LeftCompositionCancellationException());
        }
    }

    public void f() {
        CoroutineScope coroutineScope = this.f14634z;
        if (coroutineScope instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) coroutineScope).c();
        } else {
            CoroutineScopeKt.d(coroutineScope, new LeftCompositionCancellationException());
        }
    }

    public void h() {
    }
}
