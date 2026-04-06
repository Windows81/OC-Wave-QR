package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata
public /* synthetic */ class SliderKt$Slider$2$2$1 extends FunctionReferenceImpl implements Function1<Float, Float> {
    public final /* synthetic */ ClosedFloatingPointRange I;
    public final /* synthetic */ Ref.FloatRef J;
    public final /* synthetic */ Ref.FloatRef K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$2$2$1(ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.I = closedFloatingPointRange;
        this.J = floatRef;
        this.K = floatRef2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return v(((Number) obj).floatValue());
    }

    public final Float v(float f2) {
        return Float.valueOf(SliderKt$Slider$2.f(this.I, this.J, this.K, f2));
    }
}
