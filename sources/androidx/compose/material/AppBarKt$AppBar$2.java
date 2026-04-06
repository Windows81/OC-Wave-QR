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
public final class AppBarKt$AppBar$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f7155A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f7156B;
    public final /* synthetic */ PaddingValues C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ WindowInsets E;
    public final /* synthetic */ Modifier F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f7157z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$AppBar$2(long j2, long j3, float f2, PaddingValues paddingValues, Shape shape, WindowInsets windowInsets, Modifier modifier, Function3 function3, int i2, int i3) {
        super(2);
        this.f7157z = j2;
        this.f7155A = j3;
        this.f7156B = f2;
        this.C = paddingValues;
        this.D = shape;
        this.E = windowInsets;
        this.F = modifier;
        this.G = function3;
        this.H = i2;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        AppBarKt.a(this.f7157z, this.f7155A, this.f7156B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
