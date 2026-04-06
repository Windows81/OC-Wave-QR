package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class SliderKt$sliderSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8416A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f8417B;
    public final /* synthetic */ float C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function0 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8418z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderSemantics$1(boolean z2, ClosedFloatingPointRange closedFloatingPointRange, int i2, float f2, Function1 function1, Function0 function0) {
        super(1);
        this.f8418z = z2;
        this.f8416A = closedFloatingPointRange;
        this.f8417B = i2;
        this.C = f2;
        this.D = function1;
        this.E = function0;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!this.f8418z) {
            SemanticsPropertiesKt.l(semanticsPropertyReceiver);
        }
        final ClosedFloatingPointRange closedFloatingPointRange = this.f8416A;
        final int i2 = this.f8417B;
        final float f2 = this.C;
        final Function1 function1 = this.D;
        final Function0 function0 = this.E;
        SemanticsPropertiesKt.q0(semanticsPropertyReceiver, (String) null, new Function1<Float, Boolean>() {
            public final Boolean b(float f2) {
                int i2;
                float n2 = RangesKt.n(f2, ((Number) closedFloatingPointRange.e()).floatValue(), ((Number) closedFloatingPointRange.m()).floatValue());
                int i3 = i2;
                boolean z2 = false;
                if (i3 > 0 && (i2 = i3 + 1) >= 0) {
                    float f3 = n2;
                    float f4 = f3;
                    int i4 = 0;
                    while (true) {
                        float b2 = MathHelpersKt.b(((Number) closedFloatingPointRange.e()).floatValue(), ((Number) closedFloatingPointRange.m()).floatValue(), ((float) i4) / ((float) (i2 + 1)));
                        float f5 = b2 - n2;
                        if (Math.abs(f5) <= f3) {
                            f3 = Math.abs(f5);
                            f4 = b2;
                        }
                        if (i4 == i2) {
                            break;
                        }
                        i4++;
                    }
                    n2 = f4;
                }
                if (n2 != f2) {
                    function1.invoke(Float.valueOf(n2));
                    Function0 function0 = function0;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).floatValue());
            }
        }, 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
