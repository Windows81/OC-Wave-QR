package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
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
public final class CrossfadeKt$Crossfade$7 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f2205A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f2206B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2207z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$7(Transition transition, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, Function3 function3, int i2, int i3) {
        super(2);
        this.f2207z = transition;
        this.f2205A = modifier;
        this.f2206B = finiteAnimationSpec;
        this.C = function1;
        this.D = function3;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        CrossfadeKt.a(this.f2207z, this.f2205A, this.f2206B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
