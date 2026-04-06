package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SurfaceKt$Surface$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8527A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8528B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ BorderStroke F;
    public final /* synthetic */ float G;
    public final /* synthetic */ MutableInteractionSource H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f8529z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$4(Function0 function0, Modifier modifier, boolean z2, Shape shape, long j2, long j3, BorderStroke borderStroke, float f2, MutableInteractionSource mutableInteractionSource, Function2 function2, int i2, int i3) {
        super(2);
        this.f8529z = function0;
        this.f8527A = modifier;
        this.f8528B = z2;
        this.C = shape;
        this.D = j2;
        this.E = j3;
        this.F = borderStroke;
        this.G = f2;
        this.H = mutableInteractionSource;
        this.I = function2;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        SurfaceKt.b(this.f8529z, this.f8527A, this.f8528B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
