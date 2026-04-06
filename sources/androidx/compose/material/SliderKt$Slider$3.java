package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata
public final class SliderKt$Slider$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f8390A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f8391B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ ClosedFloatingPointRange D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ SliderColors H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8392z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3(float f2, Function1 function1, Modifier modifier, boolean z2, ClosedFloatingPointRange closedFloatingPointRange, int i2, Function0 function0, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, int i3, int i4) {
        super(2);
        this.f8392z = f2;
        this.f8390A = function1;
        this.f8391B = modifier;
        this.C = z2;
        this.D = closedFloatingPointRange;
        this.E = i2;
        this.F = function0;
        this.G = mutableInteractionSource;
        this.H = sliderColors;
        this.I = i3;
        this.J = i4;
    }

    public final void b(Composer composer, int i2) {
        SliderKt.d(this.f8392z, this.f8390A, this.f8391B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
