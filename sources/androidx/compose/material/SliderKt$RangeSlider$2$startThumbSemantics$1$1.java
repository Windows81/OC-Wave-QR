package androidx.compose.material;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class SliderKt$RangeSlider$2$startThumbSemantics$1$1 extends Lambda implements Function1<Float, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f8371A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f8372z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$startThumbSemantics$1$1(State state, float f2) {
        super(1);
        this.f8372z = state;
        this.f8371A = f2;
    }

    public final void b(float f2) {
        ((Function1) this.f8372z.getValue()).invoke(RangesKt.b(f2, this.f8371A));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).floatValue());
        return Unit.f40552a;
    }
}
