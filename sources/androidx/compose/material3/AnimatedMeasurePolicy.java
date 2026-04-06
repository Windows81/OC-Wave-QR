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
import androidx.compose.ui.util.MathHelpersKt;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
final class AnimatedMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final int f9164a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f9165b;

    /* renamed from: c  reason: collision with root package name */
    public final Function0 f9166c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9167d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9168e;

    /* renamed from: f  reason: collision with root package name */
    public final float f9169f;

    /* renamed from: g  reason: collision with root package name */
    public final float f9170g;

    /* renamed from: h  reason: collision with root package name */
    public final float f9171h;

    /* renamed from: i  reason: collision with root package name */
    public final float f9172i;

    /* renamed from: j  reason: collision with root package name */
    public final float f9173j;

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        float floatValue = ((Number) this.f9166c.invoke()).floatValue();
        float floatValue2 = ((Number) this.f9165b.invoke()).floatValue();
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
                        Placeable c02 = measurable2.c0(d2);
                        float f2 = (float) 2;
                        int L0 = c0.L0() + measureScope2.P1(Dp.m(this.f9167d * f2));
                        int C0 = c0.C0() + measureScope2.P1(Dp.m(this.f9168e * f2));
                        int L02 = c0.L0() + c02.L0() + measureScope2.P1(Dp.m(this.f9172i + Dp.m(this.f9170g * f2)));
                        int max = Math.max(c0.C0(), c02.C0()) + measureScope2.P1(Dp.m(this.f9171h * f2));
                        int c2 = MathHelpersKt.c(L0, L02, floatValue2);
                        int d3 = MathKt.d(((float) c2) * floatValue);
                        int c3 = MathHelpersKt.c(C0, max, floatValue2);
                        int size3 = collection.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Measurable measurable3 = (Measurable) list2.get(i4);
                            if (Intrinsics.d(LayoutIdKt.a(measurable3), "indicatorRipple")) {
                                Placeable c03 = measurable3.c0(ConstraintsKt.e(d2, Constraints.f19137b.c(c2, c3)));
                                int size4 = collection.size();
                                for (int i5 = 0; i5 < size4; i5++) {
                                    Measurable measurable4 = (Measurable) list2.get(i5);
                                    if (Intrinsics.d(LayoutIdKt.a(measurable4), "indicator")) {
                                        Placeable c04 = measurable4.c0(ConstraintsKt.e(d2, Constraints.f19137b.c(d3, c3)));
                                        return NavigationItemKt.p(measureScope, this.f9164a, this.f9165b, c02, c0, c03, c04, L0, d2, this.f9169f, this.f9168e, this.f9167d, this.f9170g, this.f9171h, this.f9172i, this.f9173j);
                                    }
                                    int i6 = L0;
                                }
                                ListUtilsKt.f("Collection contains no element matching the predicate.");
                                throw new KotlinNothingValueException();
                            }
                            int i7 = L0;
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
                        int a02 = intrinsicMeasurable2.a0(i2);
                        if (NavigationItemIconPosition.d(this.f9164a, NavigationItemIconPosition.f10462b.a())) {
                            float f2 = (float) 2;
                            return Math.max(a02, a0 + intrinsicMeasureScope.P1(Dp.m(Dp.m(this.f9167d * f2) + Dp.m(this.f9173j * f2))));
                        }
                        return a0 + a02 + intrinsicMeasureScope.P1(Dp.m(Dp.m(Dp.m(this.f9170g * ((float) 2)) + this.f9172i) + this.f9173j));
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
