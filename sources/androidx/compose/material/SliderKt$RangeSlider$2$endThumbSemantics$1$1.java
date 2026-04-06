package androidx.compose.material;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class SliderKt$RangeSlider$2$endThumbSemantics$1$1 extends Lambda implements Function1<Float, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f8360A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f8361z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$endThumbSemantics$1$1(State state, float f2) {
        super(1);
        this.f8361z = state;
        this.f8360A = f2;
    }

    public final void b(float f2) {
        ((Function1) this.f8361z.getValue()).invoke(RangesKt.b(this.f8360A, f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).floatValue());
        return Unit.f40552a;
    }
}
