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
public final class AppBarKt$TopAppBar$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7169A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7170B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7171z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$2(Function2 function2, WindowInsets windowInsets, Modifier modifier, Function2 function22, Function3 function3, long j2, long j3, float f2, int i2, int i3) {
        super(2);
        this.f7171z = function2;
        this.f7169A = windowInsets;
        this.f7170B = modifier;
        this.C = function22;
        this.D = function3;
        this.E = j2;
        this.F = j3;
        this.G = f2;
        this.H = i2;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        AppBarKt.e(this.f7171z, this.f7169A, this.f7170B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
