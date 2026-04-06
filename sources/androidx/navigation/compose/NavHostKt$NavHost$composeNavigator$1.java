package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$composeNavigator$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavGraph f22568A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f22569B;
    public final /* synthetic */ Alignment C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f22570z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$composeNavigator$1(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i2, int i3) {
        super(2);
        this.f22570z = navHostController;
        this.f22568A = navGraph;
        this.f22569B = modifier;
        this.C = alignment;
        this.D = function1;
        this.E = function12;
        this.F = function13;
        this.G = function14;
        this.H = function15;
        this.I = i2;
        this.J = i3;
    }

    public final void b(Composer composer, int i2) {
        NavHostKt.c(this.f22570z, this.f22568A, this.f22569B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
