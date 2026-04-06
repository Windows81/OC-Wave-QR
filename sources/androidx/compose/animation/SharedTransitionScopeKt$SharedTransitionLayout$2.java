package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedTransitionScopeKt$SharedTransitionLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f2372A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f2373B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f2374z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionLayout$2(Modifier modifier, Function3 function3, int i2, int i3) {
        super(2);
        this.f2374z = modifier;
        this.f2372A = function3;
        this.f2373B = i2;
        this.C = i3;
    }

    public final void b(Composer composer, int i2) {
        SharedTransitionScopeKt.c(this.f2374z, this.f2372A, composer, RecomposeScopeImplKt.a(this.f2373B | 1), this.C);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
