package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$6 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f22563A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f22564B;
    public final /* synthetic */ Alignment C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f22565z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$6(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i2, int i3) {
        super(2);
        this.f22565z = navHostController;
        this.f22563A = str;
        this.f22564B = modifier;
        this.C = alignment;
        this.D = str2;
        this.E = function1;
        this.F = function12;
        this.G = function13;
        this.H = function14;
        this.I = function15;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        NavHostKt.e(this.f22565z, this.f22563A, this.f22564B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
