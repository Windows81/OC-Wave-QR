package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class SliderKt$slideOnKeyEvents$2 extends Lambda implements Function1<KeyEvent, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8413A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f8414B;
    public final /* synthetic */ State C;
    public final /* synthetic */ float D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ State F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8415z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$slideOnKeyEvents$2(boolean z2, ClosedFloatingPointRange closedFloatingPointRange, int i2, State state, float f2, boolean z3, State state2) {
        super(1);
        this.f8415z = z2;
        this.f8413A = closedFloatingPointRange;
        this.f8414B = i2;
        this.C = state;
        this.D = f2;
        this.E = z3;
        this.F = state2;
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        if (!this.f8415z) {
            return Boolean.FALSE;
        }
        int b2 = KeyEvent_androidKt.b(keyEvent);
        KeyEventType.Companion companion = KeyEventType.f16777b;
        boolean z2 = false;
        if (KeyEventType.f(b2, companion.a())) {
            float abs = Math.abs(((Number) this.f8413A.m()).floatValue() - ((Number) this.f8413A.e()).floatValue());
            int i2 = this.f8414B;
            int i3 = i2 > 0 ? i2 + 1 : 100;
            float f2 = abs / ((float) i3);
            long a2 = KeyEvent_androidKt.a(keyEvent);
            Key.Companion companion2 = Key.f16750b;
            if (Key.r(a2, companion2.f())) {
                ((Function1) this.C.getValue()).invoke(RangesKt.r(Float.valueOf(this.D + f2), this.f8413A));
            } else if (Key.r(a2, companion2.c())) {
                ((Function1) this.C.getValue()).invoke(RangesKt.r(Float.valueOf(this.D - f2), this.f8413A));
            } else {
                int i4 = -1;
                if (Key.r(a2, companion2.e())) {
                    if (!this.E) {
                        i4 = 1;
                    }
                    ((Function1) this.C.getValue()).invoke(RangesKt.r(Float.valueOf(this.D + (((float) i4) * f2)), this.f8413A));
                } else if (Key.r(a2, companion2.d())) {
                    if (!this.E) {
                        i4 = 1;
                    }
                    ((Function1) this.C.getValue()).invoke(RangesKt.r(Float.valueOf(this.D - (((float) i4) * f2)), this.f8413A));
                } else if (Key.r(a2, companion2.j())) {
                    ((Function1) this.C.getValue()).invoke(this.f8413A.e());
                } else if (Key.r(a2, companion2.i())) {
                    ((Function1) this.C.getValue()).invoke(this.f8413A.m());
                } else if (Key.r(a2, companion2.m())) {
                    ((Function1) this.C.getValue()).invoke(RangesKt.r(Float.valueOf(this.D - (((float) RangesKt.o(i3 / 10, 1, 10)) * f2)), this.f8413A));
                } else {
                    if (Key.r(a2, companion2.l())) {
                        ((Function1) this.C.getValue()).invoke(RangesKt.r(Float.valueOf(this.D + (((float) RangesKt.o(i3 / 10, 1, 10)) * f2)), this.f8413A));
                    }
                    return Boolean.valueOf(z2);
                }
            }
        } else {
            if (KeyEventType.f(b2, companion.b())) {
                long a3 = KeyEvent_androidKt.a(keyEvent);
                Key.Companion companion3 = Key.f16750b;
                if (Key.r(a3, companion3.f()) ? true : Key.r(a3, companion3.c()) ? true : Key.r(a3, companion3.e()) ? true : Key.r(a3, companion3.d()) ? true : Key.r(a3, companion3.j()) ? true : Key.r(a3, companion3.i()) ? true : Key.r(a3, companion3.m()) ? true : Key.r(a3, companion3.l())) {
                    Function0 function0 = (Function0) this.F.getValue();
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
            return Boolean.valueOf(z2);
        }
        z2 = true;
        return Boolean.valueOf(z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
