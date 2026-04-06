package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
final class SliderKt$RangeSliderImpl$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11100a;

    public static final Unit d(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, int i5, Placeable placeable3, int i6, int i7, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.n(placementScope2, placeable, i2, i3, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable2, i4, i5, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope2, placeable3, i6, i7, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        List list2 = list;
        long j3 = j2;
        int size = list2.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Measurable measurable = (Measurable) list2.get(i3);
            if (LayoutIdKt.a(measurable) == RangeSliderComponents.STARTTHUMB) {
                Placeable c0 = measurable.c0(j3);
                Collection collection = list2;
                int size2 = collection.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Measurable measurable2 = (Measurable) list2.get(i4);
                    if (LayoutIdKt.a(measurable2) == RangeSliderComponents.ENDTHUMB) {
                        Placeable c02 = measurable2.c0(j3);
                        int size3 = collection.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            Measurable measurable3 = (Measurable) list2.get(i5);
                            if (LayoutIdKt.a(measurable3) == RangeSliderComponents.TRACK) {
                                Placeable c03 = measurable3.c0(Constraints.d(ConstraintsKt.j(j2, (-(c0.L0() + c02.L0())) / 2, 0, 2, (Object) null), 0, 0, 0, 0, 11, (Object) null));
                                int L0 = c03.L0() + ((c0.L0() + c02.L0()) / 2);
                                int max = Math.max(c03.C0(), Math.max(c0.C0(), c02.C0()));
                                this.f11100a.G(L0);
                                this.f11100a.H();
                                float f2 = this.f11100a.f();
                                boolean z2 = true;
                                boolean z3 = Intrinsics.a(f2, ArraysKt.f0(this.f11100a.q())) || Intrinsics.a(f2, ArraysKt.L0(this.f11100a.q()));
                                float e2 = this.f11100a.e();
                                if (!Intrinsics.a(e2, ArraysKt.f0(this.f11100a.q())) && !Intrinsics.a(e2, ArraysKt.L0(this.f11100a.q()))) {
                                    z2 = false;
                                }
                                int L02 = c0.L0() / 2;
                                int f0 = c03.f0(SliderKt.o());
                                if (f0 != Integer.MIN_VALUE) {
                                    i2 = f0;
                                }
                                int d2 = (this.f11100a.p() <= 0 || z3) ? MathKt.d(((float) c03.L0()) * f2) : MathKt.d(((float) (c03.L0() - (i2 * 2))) * f2) + i2;
                                int L03 = (c0.L0() - c02.L0()) / 2;
                                return MeasureScope.R1(measureScope, L0, max, (Map) null, new C0232r6(c03, L02, (max - c03.C0()) / 2, c0, d2, (max - c0.C0()) / 2, c02, (this.f11100a.p() <= 0 || z2) ? MathKt.d((((float) c03.L0()) * e2) + ((float) L03)) : MathKt.d((((float) (c03.L0() - (i2 * 2))) * e2) + ((float) L03)) + i2, (max - c02.C0()) / 2), 4, (Object) null);
                            }
                        }
                        ListUtilsKt.f("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                }
                ListUtilsKt.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
