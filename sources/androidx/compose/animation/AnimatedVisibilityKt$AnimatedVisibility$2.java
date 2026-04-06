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
public final class AnimatedVisibilityKt$AnimatedVisibility$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f2119A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ EnterTransition f2120B;
    public final /* synthetic */ ExitTransition C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f2121z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$2(boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3 function3, int i2, int i3) {
        super(2);
        this.f2121z = z2;
        this.f2119A = modifier;
        this.f2120B = enterTransition;
        this.C = exitTransition;
        this.D = str;
        this.E = function3;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        AnimatedVisibilityKt.j(this.f2121z, this.f2119A, this.f2120B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
