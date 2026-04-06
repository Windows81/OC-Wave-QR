package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
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
public final class AppBarKt$BottomAppBar$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f7161A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f7162B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ float D;
    public final /* synthetic */ PaddingValues E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f7163z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$2(Modifier modifier, long j2, long j3, Shape shape, float f2, PaddingValues paddingValues, Function3 function3, int i2, int i3) {
        super(2);
        this.f7163z = modifier;
        this.f7161A = j2;
        this.f7162B = j3;
        this.C = shape;
        this.D = f2;
        this.E = paddingValues;
        this.F = function3;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        AppBarKt.c(this.f7163z, this.f7161A, this.f7162B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
