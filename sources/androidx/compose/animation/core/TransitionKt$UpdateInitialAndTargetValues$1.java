package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$UpdateInitialAndTargetValues$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Transition.TransitionAnimationState f2757A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f2758B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ FiniteAnimationSpec D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2759z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$UpdateInitialAndTargetValues$1(Transition transition, Transition.TransitionAnimationState transitionAnimationState, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, int i2) {
        super(2);
        this.f2759z = transition;
        this.f2757A = transitionAnimationState;
        this.f2758B = obj;
        this.C = obj2;
        this.D = finiteAnimationSpec;
        this.E = i2;
    }

    public final void b(Composer composer, int i2) {
        TransitionKt.a(this.f2759z, this.f2757A, this.f2758B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
