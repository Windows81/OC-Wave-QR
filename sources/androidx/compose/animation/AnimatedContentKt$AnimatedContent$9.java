package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentKt$AnimatedContent$9 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f2044A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f2045B;
    public final /* synthetic */ Alignment C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function4 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2046z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$9(Transition transition, Modifier modifier, Function1 function1, Alignment alignment, Function1 function12, Function4 function4, int i2, int i3) {
        super(2);
        this.f2046z = transition;
        this.f2044A = modifier;
        this.f2045B = function1;
        this.C = alignment;
        this.D = function12;
        this.E = function4;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        AnimatedContentKt.a(this.f2046z, this.f2044A, this.f2045B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
