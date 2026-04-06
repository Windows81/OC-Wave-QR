package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
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
public final class AppBarKt$TopAppBar$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7175A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f7176B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ PaddingValues E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7177z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$4(WindowInsets windowInsets, Modifier modifier, long j2, long j3, float f2, PaddingValues paddingValues, Function3 function3, int i2, int i3) {
        super(2);
        this.f7177z = windowInsets;
        this.f7175A = modifier;
        this.f7176B = j2;
        this.C = j3;
        this.D = f2;
        this.E = paddingValues;
        this.F = function3;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        AppBarKt.f(this.f7177z, this.f7175A, this.f7176B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
