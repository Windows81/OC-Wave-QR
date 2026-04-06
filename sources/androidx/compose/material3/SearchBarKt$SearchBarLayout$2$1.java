package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
final class SearchBarKt$SearchBarLayout$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animatable f10877a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MutableWindowInsets f10878b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MutableState f10879c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f10880d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MutableState f10881e;

    public static final Unit d(MeasureScope measureScope, long j2, MutableState mutableState, float f2, float f3, MutableState mutableState2, int i2, Placeable placeable, int i3, Placeable placeable2, int i4, Placeable placeable3, int i5, Placeable.PlacementScope placementScope) {
        MeasureScope measureScope2 = measureScope;
        int P1 = measureScope.P1(SearchBarKt.f10821i);
        int s2 = SearchBarKt.H(j2, P1, (BackEventCompat) mutableState.getValue(), measureScope.getLayoutDirection(), f2, f3);
        long j3 = j2;
        int t2 = SearchBarKt.I(j3, P1, (BackEventCompat) mutableState.getValue(), (BackEventCompat) mutableState2.getValue(), i2, measureScope.P1(SearchBarKt.f10822j), f3);
        Placeable.PlacementScope placementScope2 = placementScope;
        int i6 = s2;
        Placeable.PlacementScope.n(placementScope2, placeable, i6, t2 + i3, 0.0f, 4, (Object) null);
        int i7 = t2 + i4;
        Placeable.PlacementScope.n(placementScope2, placeable2, i6, i7, 0.0f, 4, (Object) null);
        if (placeable3 != null) {
            Placeable.PlacementScope.n(placementScope, placeable3, s2, i7 + placeable2.C0() + i5, 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Placeable placeable;
        int i2;
        int i3;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        long j3 = j2;
        float floatValue = ((Number) this.f10877a.m()).floatValue();
        int size = list2.size();
        int i4 = 0;
        while (i4 < size) {
            Measurable measurable = (Measurable) list2.get(i4);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "InputField")) {
                Collection collection = list2;
                int size2 = collection.size();
                int i5 = 0;
                while (i5 < size2) {
                    Measurable measurable2 = (Measurable) list2.get(i5);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), "Surface")) {
                        int size3 = collection.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list2.get(i6);
                            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj), "Content")) {
                                break;
                            }
                            i6++;
                        }
                        Measurable measurable3 = (Measurable) obj;
                        int a2 = this.f10878b.a(measureScope2) + measureScope2.P1(SearchBarKt.M());
                        int P1 = measureScope2.P1(SearchBarKt.M());
                        int g2 = ConstraintsKt.g(j3, measurable.a0(Constraints.k(j2)));
                        int f2 = ConstraintsKt.f(j3, measurable.q0(Constraints.l(j2)));
                        int d2 = MathKt.d(((float) Constraints.l(j2)) * 0.9f);
                        int d3 = MathKt.d(((float) Constraints.k(j2)) * 0.9f);
                        float r2 = SearchBarKt.G((BackEventCompat) this.f10879c.getValue(), floatValue, this.f10880d.c());
                        int c2 = MathHelpersKt.c(g2, d2, r2);
                        int i7 = a2 + f2;
                        int c3 = MathHelpersKt.c(i7, d3, r2);
                        int l2 = Constraints.l(j2);
                        int k2 = Constraints.k(j2);
                        int c4 = MathHelpersKt.c(c2, l2, floatValue);
                        int c5 = MathHelpersKt.c(c3, k2, floatValue);
                        int c6 = MathHelpersKt.c(a2, 0, floatValue);
                        int c7 = MathHelpersKt.c(0, P1, floatValue);
                        Placeable c0 = measurable.c0(ConstraintsKt.a(c4, l2, f2, f2));
                        int L0 = c0.L0();
                        Placeable c02 = measurable2.c0(Constraints.f19137b.c(L0, c5 - c6));
                        if (measurable3 != null) {
                            if (Constraints.g(j2)) {
                                i2 = 0;
                                i3 = RangesKt.e(Constraints.k(j2) - (i7 + P1), 0);
                            } else {
                                i2 = 0;
                                i3 = Constraints.k(j2);
                            }
                            placeable = measurable3.c0(ConstraintsKt.a(L0, L0, i2, i3));
                        } else {
                            placeable = null;
                        }
                        return MeasureScope.R1(measureScope, L0, c5, (Map) null, new H5(measureScope, j2, this.f10879c, floatValue, r2, this.f10881e, c5, c02, c6, c0, a2, placeable, c7), 4, (Object) null);
                    }
                    i5++;
                    measureScope2 = measureScope;
                    j3 = j2;
                }
                ListUtilsKt.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i4++;
            measureScope2 = measureScope;
            j3 = j2;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
