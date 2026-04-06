package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SurfaceKt$Surface$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f8521A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8522B;
    public final /* synthetic */ long C;
    public final /* synthetic */ BorderStroke D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8523z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$2(Modifier modifier, Shape shape, long j2, long j3, BorderStroke borderStroke, float f2, Function2 function2, int i2, int i3) {
        super(2);
        this.f8523z = modifier;
        this.f8521A = shape;
        this.f8522B = j2;
        this.C = j3;
        this.D = borderStroke;
        this.E = f2;
        this.F = function2;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        SurfaceKt.a(this.f8523z, this.f8521A, this.f8522B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
