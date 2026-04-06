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
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11651a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f11652b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11653c;

    /* renamed from: d  reason: collision with root package name */
    public final float f11654d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11655e;

    /* renamed from: f  reason: collision with root package name */
    public final float f11656f;

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        float floatValue = ((Number) this.f11652b.invoke()).floatValue();
        long d2 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list2.get(i2);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "icon")) {
                float f2 = (float) 2;
                Placeable c0 = measurable.c0(ConstraintsKt.i(d2, -measureScope2.P1(Dp.m(this.f11653c * f2)), -measureScope2.P1(Dp.m(this.f11654d * f2))));
                int L0 = c0.L0() + measureScope2.P1(Dp.m(this.f11653c * f2));
                int C0 = c0.C0() + measureScope2.P1(Dp.m(this.f11654d * f2));
                int d3 = MathKt.d(((float) L0) * floatValue);
                Collection collection = list2;
                int size2 = collection.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = (Measurable) list2.get(i3);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), "indicatorRipple")) {
                        Placeable c02 = measurable2.c0(ConstraintsKt.e(d2, Constraints.f19137b.c(L0, C0)));
                        int size3 = collection.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Measurable measurable3 = (Measurable) list2.get(i4);
                            if (Intrinsics.d(LayoutIdKt.a(measurable3), "indicator")) {
                                Placeable c03 = measurable3.c0(ConstraintsKt.e(d2, Constraints.f19137b.c(d3, C0)));
                                if (!this.f11651a) {
                                    return NavigationItemKt.s(measureScope, c0, c02, c03, j2);
                                }
                                int size4 = collection.size();
                                for (int i5 = 0; i5 < size4; i5++) {
                                    Measurable measurable4 = (Measurable) list2.get(i5);
                                    if (Intrinsics.d(LayoutIdKt.a(measurable4), "label")) {
                                        return NavigationItemKt.w(measureScope, measurable4.c0(ConstraintsKt.j(d2, 0, -(c03.C0() + measureScope2.P1(this.f11655e)), 1, (Object) null)), c0, c02, c03, j2, this.f11655e, this.f11654d, this.f11656f);
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
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Object obj;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            if (Intrinsics.d(LayoutUtilKt.b(intrinsicMeasurable), "icon")) {
                int C = intrinsicMeasurable.C(i2);
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i5);
                    if (Intrinsics.d(LayoutUtilKt.b((IntrinsicMeasurable) obj), "label")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable2 != null) {
                    i3 = intrinsicMeasurable2.C(i2);
                }
                float f2 = (float) 2;
                return C + i3 + intrinsicMeasureScope.P1(Dp.m(Dp.m(Dp.m(this.f11656f * f2) + Dp.m(this.f11654d * f2)) + this.f11655e));
            }
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
