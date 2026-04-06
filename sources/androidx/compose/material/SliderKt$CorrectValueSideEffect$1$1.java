package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata
public final class SliderKt$CorrectValueSideEffect$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f8351A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f8352B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ ClosedFloatingPointRange D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8353z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$1$1(ClosedFloatingPointRange closedFloatingPointRange, Function1 function1, float f2, MutableState mutableState, ClosedFloatingPointRange closedFloatingPointRange2) {
        super(0);
        this.f8353z = closedFloatingPointRange;
        this.f8351A = function1;
        this.f8352B = f2;
        this.C = mutableState;
        this.D = closedFloatingPointRange2;
    }

    public final void invoke() {
        float floatValue = (((Number) this.f8353z.m()).floatValue() - ((Number) this.f8353z.e()).floatValue()) / ((float) 1000);
        float floatValue2 = ((Number) this.f8351A.invoke(Float.valueOf(this.f8352B))).floatValue();
        if (Math.abs(floatValue2 - ((Number) this.C.getValue()).floatValue()) > floatValue && this.D.i((Comparable) this.C.getValue())) {
            this.C.setValue(Float.valueOf(floatValue2));
        }
    }
}
