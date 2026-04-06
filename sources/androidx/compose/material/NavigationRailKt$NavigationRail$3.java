package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavigationRailKt$NavigationRail$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f8056A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8057B;
    public final /* synthetic */ float C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8058z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRail$3(Modifier modifier, long j2, long j3, float f2, Function3 function3, Function3 function32, int i2, int i3) {
        super(2);
        this.f8058z = modifier;
        this.f8056A = j2;
        this.f8057B = j3;
        this.C = f2;
        this.D = function3;
        this.E = function32;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        NavigationRailKt.a(this.f8058z, this.f8056A, this.f8057B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
