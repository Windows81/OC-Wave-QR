package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SurfaceKt$Surface$8 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f8539A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f8540B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ BorderStroke G;
    public final /* synthetic */ float H;
    public final /* synthetic */ MutableInteractionSource I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8541z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$8(boolean z2, Function1 function1, Modifier modifier, boolean z3, Shape shape, long j2, long j3, BorderStroke borderStroke, float f2, MutableInteractionSource mutableInteractionSource, Function2 function2, int i2, int i3, int i4) {
        super(2);
        this.f8541z = z2;
        this.f8539A = function1;
        this.f8540B = modifier;
        this.C = z3;
        this.D = shape;
        this.E = j2;
        this.F = j3;
        this.G = borderStroke;
        this.H = f2;
        this.I = mutableInteractionSource;
        this.J = function2;
        this.K = i2;
        this.L = i3;
        this.M = i4;
    }

    public final void b(Composer composer, int i2) {
        boolean z2 = this.f8541z;
        Function1 function1 = this.f8539A;
        Modifier modifier = this.f8540B;
        boolean z3 = this.C;
        Shape shape = this.D;
        long j2 = this.E;
        long j3 = this.F;
        BorderStroke borderStroke = this.G;
        float f2 = this.H;
        MutableInteractionSource mutableInteractionSource = this.I;
        Function2 function2 = this.J;
        boolean z4 = z2;
        SurfaceKt.d(z4, function1, modifier, z3, shape, j2, j3, borderStroke, f2, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.a(this.K | 1), RecomposeScopeImplKt.a(this.L), this.M);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
