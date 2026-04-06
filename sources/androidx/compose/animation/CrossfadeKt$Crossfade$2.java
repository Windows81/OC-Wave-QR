package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CrossfadeKt$Crossfade$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f2195A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f2196B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f2197z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$2(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 function3, int i2, int i3) {
        super(2);
        this.f2197z = obj;
        this.f2195A = modifier;
        this.f2196B = finiteAnimationSpec;
        this.C = function3;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        CrossfadeKt.c(this.f2197z, this.f2195A, this.f2196B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
