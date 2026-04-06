package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedVisibilityKt$AnimatedVisibility$12 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f2113A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f2114B;
    public final /* synthetic */ EnterTransition C;
    public final /* synthetic */ ExitTransition D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ColumnScope f2115z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$12(ColumnScope columnScope, MutableTransitionState mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3 function3, int i2, int i3) {
        super(2);
        this.f2115z = columnScope;
        this.f2113A = mutableTransitionState;
        this.f2114B = modifier;
        this.C = enterTransition;
        this.D = exitTransition;
        this.E = str;
        this.F = function3;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        AnimatedVisibilityKt.f(this.f2115z, this.f2113A, this.f2114B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
