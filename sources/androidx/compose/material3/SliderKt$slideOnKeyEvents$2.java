package androidx.compose.material3;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
final class SliderKt$slideOnKeyEvents$2 implements Function1<KeyEvent, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f11126A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f11127B;
    public final /* synthetic */ int C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Function0 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11128z;

    public final Boolean b(android.view.KeyEvent keyEvent) {
        if (!this.f11128z) {
            return Boolean.FALSE;
        }
        if (this.f11126A == null) {
            return Boolean.FALSE;
        }
        int b2 = KeyEvent_androidKt.b(keyEvent);
        KeyEventType.Companion companion = KeyEventType.f16777b;
        boolean z2 = false;
        if (KeyEventType.f(b2, companion.a())) {
            float abs = Math.abs(((Number) this.f11127B.m()).floatValue() - ((Number) this.f11127B.e()).floatValue());
            int i2 = this.C;
            int i3 = i2 > 0 ? i2 + 1 : 100;
            float f2 = abs / ((float) i3);
            int i4 = this.D ? -1 : 1;
            long a2 = KeyEvent_androidKt.a(keyEvent);
            Key.Companion companion2 = Key.f16750b;
            if (Key.r(a2, companion2.f())) {
                this.f11126A.invoke(RangesKt.r(Float.valueOf(this.E + (((float) i4) * f2)), this.f11127B));
            } else if (Key.r(a2, companion2.c())) {
                this.f11126A.invoke(RangesKt.r(Float.valueOf(this.E - (((float) i4) * f2)), this.f11127B));
            } else if (Key.r(a2, companion2.e())) {
                this.f11126A.invoke(RangesKt.r(Float.valueOf(this.E + (((float) i4) * f2)), this.f11127B));
            } else if (Key.r(a2, companion2.d())) {
                this.f11126A.invoke(RangesKt.r(Float.valueOf(this.E - (((float) i4) * f2)), this.f11127B));
            } else if (Key.r(a2, companion2.j())) {
                this.f11126A.invoke(this.f11127B.e());
            } else if (Key.r(a2, companion2.i())) {
                this.f11126A.invoke(this.f11127B.m());
            } else if (Key.r(a2, companion2.m())) {
                this.f11126A.invoke(RangesKt.r(Float.valueOf(this.E - (((float) RangesKt.o(i3 / 10, 1, 10)) * f2)), this.f11127B));
            } else {
                if (Key.r(a2, companion2.l())) {
                    this.f11126A.invoke(RangesKt.r(Float.valueOf(this.E + (((float) RangesKt.o(i3 / 10, 1, 10)) * f2)), this.f11127B));
                }
                return Boolean.valueOf(z2);
            }
        } else {
            if (KeyEventType.f(b2, companion.b())) {
                long a3 = KeyEvent_androidKt.a(keyEvent);
                Key.Companion companion3 = Key.f16750b;
                if (Key.r(a3, companion3.f()) || Key.r(a3, companion3.c()) || Key.r(a3, companion3.e()) || Key.r(a3, companion3.d()) || Key.r(a3, companion3.j()) || Key.r(a3, companion3.i()) || Key.r(a3, companion3.m()) || Key.r(a3, companion3.l())) {
                    Function0 function0 = this.F;
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
