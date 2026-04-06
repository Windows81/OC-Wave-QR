package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedTransitionScopeKt$SharedTransitionScope$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f2382A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f2383z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$2(Function4 function4, int i2) {
        super(2);
        this.f2383z = function4;
        this.f2382A = i2;
    }

    public final void b(Composer composer, int i2) {
        SharedTransitionScopeKt.d(this.f2383z, composer, RecomposeScopeImplKt.a(this.f2382A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
