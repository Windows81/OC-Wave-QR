package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$19 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavGraph f22526A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f22527B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f22528z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$19(NavHostController navHostController, NavGraph navGraph, Modifier modifier, int i2, int i3) {
        super(2);
        this.f22528z = navHostController;
        this.f22526A = navGraph;
        this.f22527B = modifier;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        NavHostKt.a(this.f22528z, this.f22526A, this.f22527B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
