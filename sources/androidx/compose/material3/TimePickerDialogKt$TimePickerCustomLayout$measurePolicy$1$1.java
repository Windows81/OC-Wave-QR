package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
public final class TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1 f11454a = new TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1();

    public static final Unit d(boolean z2, int i2, Placeable placeable, int i3, Placeable placeable2, int i4, int i5, int i6, MeasureScope measureScope, Placeable placeable3, int i7, int i8, int i9, int i10, Placeable.PlacementScope placementScope) {
        int i11;
        int i12 = i5;
        if (z2) {
            int C0 = i12 - ((((i2 + placeable.C0()) + i3) + placeable2.C0()) + i4);
            if (i12 >= i6) {
                i11 = measureScope.P1(Dp.m((float) 16));
            } else {
                i11 = 0;
            }
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable.PlacementScope.j(placementScope2, placeable3, i7, i7, 0.0f, 4, (Object) null);
            int i13 = C0 / 2;
            int i14 = i2 + i13;
            int i15 = i8;
            Placeable.PlacementScope.j(placementScope2, placeable, i15, i14, 0.0f, 4, (Object) null);
            Placeable.PlacementScope.j(placementScope, placeable2, i15, (((i14 + placeable.C0()) + i3) - i11) + i13, 0.0f, 4, (Object) null);
        } else {
            Placeable.PlacementScope.j(placementScope, placeable3, i7, i9, 0.0f, 4, (Object) null);
            int C02 = i9 + placeable3.C0();
            Placeable.PlacementScope placementScope3 = placementScope;
            Placeable.PlacementScope.j(placementScope3, placeable, (i10 - placeable.L0()) / 2, C02, 0.0f, 4, (Object) null);
            Placeable.PlacementScope.j(placementScope3, placeable2, (i10 - placeable2.L0()) / 2, C02 + placeable.C0(), 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        int i2;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            Measurable measurable = (Measurable) list2.get(i3);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "title")) {
                Collection collection = list2;
                int size2 = collection.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = (Measurable) list2.get(i4);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), "timePickerContent")) {
                        int size3 = collection.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Measurable measurable3 = (Measurable) list2.get(i5);
                            if (Intrinsics.d(LayoutIdKt.a(measurable3), "actions")) {
                                float f2 = (float) 24;
                                int P1 = measureScope2.P1(Dp.m(f2));
                                int P12 = measureScope2.P1(Dp.m((float) 384));
                                int P13 = measureScope2.P1(Dp.m(f2));
                                int P14 = measureScope2.P1(Dp.m((float) 16));
                                int P15 = measureScope2.P1(Dp.m((float) 4));
                                int P16 = measureScope2.P1(Dp.m((float) 8));
                                int P17 = measureScope2.P1(Dp.m(f2));
                                int P18 = measureScope2.P1(Dp.m(f2));
                                int i6 = P14;
                                Placeable c0 = measurable2.c0(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null));
                                boolean z2 = c0.L0() > c0.C0() && ((float) c0.C0()) >= MathKt.g(measureScope2.B1(TimePickerKt.x0()));
                                int L0 = (z2 ? c0.L0() : c0.L0()) + (P1 * 2);
                                long j3 = j2;
                                Placeable c02 = measurable3.c0(Constraints.d(j3, 0, c0.L0(), 0, 0, 8, (Object) null));
                                Placeable c03 = measurable.c0(Constraints.d(j3, 0, c0.L0(), 0, 0, 8, (Object) null));
                                if (z2) {
                                    int C0 = c0.C0() + c02.C0() + P16 + i6 + P15;
                                    if (Constraints.g(j2)) {
                                        C0 = Constraints.k(j2);
                                    }
                                    i2 = C0;
                                } else {
                                    i2 = c03.C0() + P17 + c0.C0() + c02.C0() + P18;
                                }
                                return MeasureScope.R1(measureScope, L0, i2, (Map) null, new C0260u7(z2, i6, c0, P15, c02, P16, i2, P12, measureScope, c03, P13, P1, P17, L0), 4, (Object) null);
                            }
                            i5++;
                            measureScope2 = measureScope;
                        }
                        ListUtilsKt.f("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                    i4++;
                    measureScope2 = measureScope;
                }
                ListUtilsKt.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i3++;
            measureScope2 = measureScope;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
