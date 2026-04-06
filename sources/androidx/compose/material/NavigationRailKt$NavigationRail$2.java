package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavigationRailKt$NavigationRail$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8053A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8054B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f8055z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRail$2(WindowInsets windowInsets, Modifier modifier, long j2, long j3, float f2, Function3 function3, Function3 function32, int i2, int i3) {
        super(2);
        this.f8055z = windowInsets;
        this.f8053A = modifier;
        this.f8054B = j2;
        this.C = j3;
        this.D = f2;
        this.E = function3;
        this.F = function32;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        NavigationRailKt.b(this.f8055z, this.f8053A, this.f8054B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
