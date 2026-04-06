package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f22529A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f22530B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f22531z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$2(NavHostController navHostController, String str, Modifier modifier, String str2, Function1 function1, int i2, int i3) {
        super(2);
        this.f22531z = navHostController;
        this.f22529A = str;
        this.f22530B = modifier;
        this.C = str2;
        this.D = function1;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        NavHostKt.g(this.f22531z, this.f22529A, this.f22530B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
