package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f2139A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f2140B;
    public final /* synthetic */ EnterTransition C;
    public final /* synthetic */ ExitTransition D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2141z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibilityImpl$3(Transition transition, Function1 function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3 function3, int i2) {
        super(2);
        this.f2141z = transition;
        this.f2139A = function1;
        this.f2140B = modifier;
        this.C = enterTransition;
        this.D = exitTransition;
        this.E = function3;
        this.F = i2;
    }

    public final void b(Composer composer, int i2) {
        AnimatedVisibilityKt.k(this.f2141z, this.f2139A, this.f2140B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
