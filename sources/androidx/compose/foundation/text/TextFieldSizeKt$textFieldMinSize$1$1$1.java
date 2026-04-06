package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldSizeKt$textFieldMinSize$1$1$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSize f5976z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1$1$1(TextFieldSize textFieldSize) {
        super(3);
        this.f5976z = textFieldSize;
    }

    public final MeasureResult b(MeasureScope measureScope, Measurable measurable, long j2) {
        long b2 = this.f5976z.b();
        Measurable measurable2 = measurable;
        final Placeable c0 = measurable2.c0(Constraints.d(j2, RangesKt.o((int) (b2 >> 32), Constraints.n(j2), Constraints.l(j2)), 0, RangesKt.o((int) (b2 & 4294967295L), Constraints.m(j2), Constraints.k(j2)), 0, 10, (Object) null));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.n(placementScope, c0, 0, 0, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).r());
    }
}
