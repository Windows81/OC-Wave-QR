package androidx.compose.material3;

import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
final class StartIconMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f11202a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11203b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11204c;

    /* renamed from: d  reason: collision with root package name */
    public final float f11205d;

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        float floatValue = ((Number) this.f11202a.invoke()).floatValue();
        long d2 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = (Measurable) list2.get(i2);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "icon")) {
                Placeable c0 = measurable.c0(d2);
                Collection collection = list2;
                int size2 = collection.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = (Measurable) list2.get(i3);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), "label")) {
                        Placeable c02 = measurable2.c0(ConstraintsKt.j(d2, -(c0.L0() + measureScope2.P1(this.f11205d)), 0, 2, (Object) null));
                        float f2 = (float) 2;
                        int L0 = c0.L0() + c02.L0() + measureScope2.P1(Dp.m(this.f11205d + Dp.m(this.f11203b * f2)));
                        int max = Math.max(c0.C0(), c02.C0()) + measureScope2.P1(Dp.m(this.f11204c * f2));
                        int d3 = MathKt.d(((float) L0) * floatValue);
                        int size3 = collection.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Measurable measurable3 = (Measurable) list2.get(i4);
                            if (Intrinsics.d(LayoutIdKt.a(measurable3), "indicatorRipple")) {
                                Placeable c03 = measurable3.c0(ConstraintsKt.e(d2, Constraints.f19137b.c(L0, max)));
                                int size4 = collection.size();
                                for (int i5 = 0; i5 < size4; i5++) {
                                    Measurable measurable4 = (Measurable) list2.get(i5);
                                    if (Intrinsics.d(LayoutIdKt.a(measurable4), "indicator")) {
                                        return NavigationItemKt.u(measureScope, c02, c0, c03, measurable4.c0(ConstraintsKt.e(d2, Constraints.f19137b.c(d3, max))), j2, this.f11205d);
                                    }
                                }
                                ListUtilsKt.f("Collection contains no element matching the predicate.");
                                throw new KotlinNothingValueException();
                            }
                            i4++;
                            MeasureScope measureScope3 = measureScope;
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
            i2++;
            measureScope2 = measureScope;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            if (Intrinsics.d(LayoutUtilKt.b(intrinsicMeasurable), "icon")) {
                int a0 = intrinsicMeasurable.a0(i2);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
                    if (Intrinsics.d(LayoutUtilKt.b(intrinsicMeasurable2), "label")) {
                        return a0 + intrinsicMeasurable2.a0(i2) + intrinsicMeasureScope.P1(Dp.m(Dp.m(this.f11203b * ((float) 2)) + this.f11205d));
                    }
                }
                ListUtilsKt.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            if (Intrinsics.d(LayoutUtilKt.b(intrinsicMeasurable), "icon")) {
                int C = intrinsicMeasurable.C(i2);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
                    if (Intrinsics.d(LayoutUtilKt.b(intrinsicMeasurable2), "label")) {
                        return Math.max(C, intrinsicMeasurable2.C(i2)) + intrinsicMeasureScope.P1(Dp.m(this.f11204c * ((float) 2)));
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
