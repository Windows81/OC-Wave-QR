package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedTransitionScopeImpl$updateTransitionActiveness$1 extends Lambda implements Function1<SharedTransitionScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f2362z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$updateTransitionActiveness$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(1);
        this.f2362z = sharedTransitionScopeImpl;
    }

    public final void b(SharedTransitionScope sharedTransitionScope) {
        this.f2362z.A();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SharedTransitionScope) obj);
        return Unit.f40552a;
    }
}
