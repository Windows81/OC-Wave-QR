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
public final class NavHostKt$NavHost$10 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f22513A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f22514B;
    public final /* synthetic */ Alignment C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ Function1 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f22515z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$10(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i2, int i3, int i4) {
        super(2);
        this.f22515z = navHostController;
        this.f22513A = str;
        this.f22514B = modifier;
        this.C = alignment;
        this.D = str2;
        this.E = function1;
        this.F = function12;
        this.G = function13;
        this.H = function14;
        this.I = function15;
        this.J = function16;
        this.K = i2;
        this.L = i3;
        this.M = i4;
    }

    public final void b(Composer composer, int i2) {
        NavHostKt.f(this.f22515z, this.f22513A, this.f22514B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, composer, RecomposeScopeImplKt.a(this.K | 1), RecomposeScopeImplKt.a(this.L), this.M);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
