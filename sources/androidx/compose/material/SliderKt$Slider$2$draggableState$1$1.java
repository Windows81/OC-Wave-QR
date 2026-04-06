package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class SliderKt$Slider$2$draggableState$1$1 extends Lambda implements Function1<Float, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8384A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8385B;
    public final /* synthetic */ Ref.FloatRef C;
    public final /* synthetic */ State D;
    public final /* synthetic */ ClosedFloatingPointRange E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8386z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$2$draggableState$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State state, ClosedFloatingPointRange closedFloatingPointRange) {
        super(1);
        this.f8386z = mutableFloatState;
        this.f8384A = mutableFloatState2;
        this.f8385B = floatRef;
        this.C = floatRef2;
        this.D = state;
        this.E = closedFloatingPointRange;
    }

    public final void b(float f2) {
        MutableFloatState mutableFloatState = this.f8386z;
        mutableFloatState.j(mutableFloatState.c() + f2 + this.f8384A.c());
        this.f8384A.j(0.0f);
        ((Function1) this.D.getValue()).invoke(Float.valueOf(SliderKt$Slider$2.g(this.f8385B, this.C, this.E, RangesKt.n(this.f8386z.c(), this.f8385B.f40905z, this.C.f40905z))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).floatValue());
        return Unit.f40552a;
    }
}
