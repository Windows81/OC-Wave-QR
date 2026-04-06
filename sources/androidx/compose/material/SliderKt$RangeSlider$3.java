package androidx.compose.material;

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
public final class SliderKt$RangeSlider$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f8373A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f8374B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ ClosedFloatingPointRange D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ SliderColors G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8375z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$3(ClosedFloatingPointRange closedFloatingPointRange, Function1 function1, Modifier modifier, boolean z2, ClosedFloatingPointRange closedFloatingPointRange2, int i2, Function0 function0, SliderColors sliderColors, int i3, int i4) {
        super(2);
        this.f8375z = closedFloatingPointRange;
        this.f8373A = function1;
        this.f8374B = modifier;
        this.C = z2;
        this.D = closedFloatingPointRange2;
        this.E = i2;
        this.F = function0;
        this.G = sliderColors;
        this.H = i3;
        this.I = i4;
    }

    public final void b(Composer composer, int i2) {
        SliderKt.b(this.f8375z, this.f8373A, this.f8374B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
