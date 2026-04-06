package androidx.compose.animation;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedTransitionScopeKt$SharedTransitionScope$1$2$1 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f2380z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$1$2$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(1);
        this.f2380z = sharedTransitionScopeImpl;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        this.f2380z.i(contentDrawScope);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
