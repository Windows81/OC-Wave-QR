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
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
final class NavigationBarKt$NavigationBarItemLayout$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function0 f10420a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function2 f10421b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f10422c;

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Placeable placeable;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        float d2 = RangesKt.d(((Number) this.f10420a.invoke()).floatValue(), 0.0f);
        long d3 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = (Measurable) list2.get(i2);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "icon")) {
                Placeable c0 = measurable.c0(d3);
                float f2 = (float) 2;
                int L0 = c0.L0() + measureScope2.P1(Dp.m(NavigationBarKt.f10406d * f2));
                int d4 = MathKt.d(((float) L0) * d2);
                int C0 = c0.C0() + measureScope2.P1(Dp.m(NavigationBarKt.i() * f2));
                Collection collection = list2;
                int size2 = collection.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = (Measurable) list2.get(i3);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), "indicatorRipple")) {
                        Placeable c02 = measurable2.c0(Constraints.f19137b.c(L0, C0));
                        int size3 = collection.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list2.get(i4);
                            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj), "indicator")) {
                                break;
                            }
                            i4++;
                        }
                        Measurable measurable3 = (Measurable) obj;
                        Placeable c03 = measurable3 != null ? measurable3.c0(Constraints.f19137b.c(d4, C0)) : null;
                        if (this.f10421b != null) {
                            int size4 = collection.size();
                            int i5 = 0;
                            while (i5 < size4) {
                                Measurable measurable4 = (Measurable) list2.get(i5);
                                if (Intrinsics.d(LayoutIdKt.a(measurable4), "label")) {
                                    placeable = measurable4.c0(d3);
                                } else {
                                    i5++;
                                }
                            }
                            ListUtilsKt.f("Collection contains no element matching the predicate.");
                            throw new KotlinNothingValueException();
                        }
                        placeable = null;
                        if (this.f10421b == null) {
                            return NavigationBarKt.k(measureScope, c0, c02, c03, j2);
                        }
                        Intrinsics.f(placeable);
                        return NavigationBarKt.m(measureScope, placeable, c0, c02, c03, j2, this.f10422c, d2);
                    }
                    i3++;
                    MeasureScope measureScope3 = measureScope;
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
}
