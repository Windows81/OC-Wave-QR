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
public final class BottomNavigationKt$BottomNavigation$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7325A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f7326B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7327z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigation$2(WindowInsets windowInsets, Modifier modifier, long j2, long j3, float f2, Function3 function3, int i2, int i3) {
        super(2);
        this.f7327z = windowInsets;
        this.f7325A = modifier;
        this.f7326B = j2;
        this.C = j3;
        this.D = f2;
        this.E = function3;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        BottomNavigationKt.b(this.f7327z, this.f7325A, this.f7326B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
