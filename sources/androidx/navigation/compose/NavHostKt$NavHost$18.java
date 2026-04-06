package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

@Metadata
public final class NavHostKt$NavHost$18 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f22523A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f22524B;
    public final /* synthetic */ Alignment C;
    public final /* synthetic */ KClass D;
    public final /* synthetic */ Map E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ Function1 J;
    public final /* synthetic */ Function1 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f22525z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$18(NavHostController navHostController, Object obj, Modifier modifier, Alignment alignment, KClass kClass, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i2, int i3, int i4) {
        super(2);
        this.f22525z = navHostController;
        this.f22523A = obj;
        this.f22524B = modifier;
        this.C = alignment;
        this.D = kClass;
        this.E = map;
        this.F = function1;
        this.G = function12;
        this.H = function13;
        this.I = function14;
        this.J = function15;
        this.K = function16;
        this.L = i2;
        this.M = i3;
        this.N = i4;
    }

    public final void b(Composer composer, int i2) {
        NavHostKt.d(this.f22525z, this.f22523A, this.f22524B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, composer, RecomposeScopeImplKt.a(this.L | 1), RecomposeScopeImplKt.a(this.M), this.N);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
