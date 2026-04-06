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
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f2101A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f2102B;
    public final /* synthetic */ EnterTransition C;
    public final /* synthetic */ ExitTransition D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ OnLookaheadMeasured F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2103z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$4(Transition transition, Function1 function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function2 function2, OnLookaheadMeasured onLookaheadMeasured, Function3 function3, int i2, int i3) {
        super(2);
        this.f2103z = transition;
        this.f2101A = function1;
        this.f2102B = modifier;
        this.C = enterTransition;
        this.D = exitTransition;
        this.E = function2;
        this.F = onLookaheadMeasured;
        this.G = function3;
        this.H = i2;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        AnimatedVisibilityKt.a(this.f2103z, this.f2101A, this.f2102B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
