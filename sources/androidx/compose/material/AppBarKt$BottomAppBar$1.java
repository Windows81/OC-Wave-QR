package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AppBarKt$BottomAppBar$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7158A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f7159B;
    public final /* synthetic */ long C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ float E;
    public final /* synthetic */ PaddingValues F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7160z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$1(WindowInsets windowInsets, Modifier modifier, long j2, long j3, Shape shape, float f2, PaddingValues paddingValues, Function3 function3, int i2, int i3) {
        super(2);
        this.f7160z = windowInsets;
        this.f7158A = modifier;
        this.f7159B = j2;
        this.C = j3;
        this.D = shape;
        this.E = f2;
        this.F = paddingValues;
        this.G = function3;
        this.H = i2;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        AppBarKt.b(this.f7160z, this.f7158A, this.f7159B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
