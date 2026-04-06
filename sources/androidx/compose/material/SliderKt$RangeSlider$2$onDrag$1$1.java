package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class SliderKt$RangeSlider$2$onDrag$1$1 extends Lambda implements Function2<Boolean, Float, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8368A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8369B;
    public final /* synthetic */ Ref.FloatRef C;
    public final /* synthetic */ Ref.FloatRef D;
    public final /* synthetic */ State E;
    public final /* synthetic */ ClosedFloatingPointRange F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8370z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$onDrag$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State state, ClosedFloatingPointRange closedFloatingPointRange2) {
        super(2);
        this.f8370z = mutableFloatState;
        this.f8368A = mutableFloatState2;
        this.f8369B = closedFloatingPointRange;
        this.C = floatRef;
        this.D = floatRef2;
        this.E = state;
        this.F = closedFloatingPointRange2;
    }

    public final void b(boolean z2, float f2) {
        ClosedFloatingPointRange closedFloatingPointRange;
        if (z2) {
            MutableFloatState mutableFloatState = this.f8370z;
            mutableFloatState.j(mutableFloatState.c() + f2);
            this.f8368A.j(SliderKt$RangeSlider$2.f(this.F, this.C, this.D, ((Number) this.f8369B.m()).floatValue()));
            float c2 = this.f8368A.c();
            closedFloatingPointRange = RangesKt.b(RangesKt.n(this.f8370z.c(), this.C.f40905z, c2), c2);
        } else {
            MutableFloatState mutableFloatState2 = this.f8368A;
            mutableFloatState2.j(mutableFloatState2.c() + f2);
            this.f8370z.j(SliderKt$RangeSlider$2.f(this.F, this.C, this.D, ((Number) this.f8369B.e()).floatValue()));
            float c3 = this.f8370z.c();
            closedFloatingPointRange = RangesKt.b(c3, RangesKt.n(this.f8368A.c(), c3, this.D.f40905z));
        }
        ((Function1) this.E.getValue()).invoke(SliderKt$RangeSlider$2.g(this.C, this.D, this.F, closedFloatingPointRange));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
        return Unit.f40552a;
    }
}
