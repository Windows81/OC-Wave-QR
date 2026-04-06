package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

@Metadata
final class SliderKt$SliderImpl$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SliderState f11116a;

    public static final Unit d(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, Ref.IntRef intRef, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.n(placementScope2, placeable, i2, i3, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope2, placeable2, i4, intRef.f40906z, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        int max;
        int L0;
        int C0;
        int i2;
        int i3;
        List list2 = list;
        int size = list2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Measurable measurable = (Measurable) list2.get(i5);
            if (LayoutIdKt.a(measurable) == SliderComponents.THUMB) {
                Placeable c0 = measurable.c0(j2);
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    Measurable measurable2 = (Measurable) list2.get(i6);
                    if (LayoutIdKt.a(measurable2) == SliderComponents.TRACK) {
                        Orientation j3 = this.f11116a.j();
                        Orientation orientation = Orientation.Vertical;
                        Placeable c02 = j3 == orientation ? measurable2.c0(Constraints.d(ConstraintsKt.j(j2, 0, -c0.C0(), 1, (Object) null), 0, 0, 0, 0, 14, (Object) null)) : measurable2.c0(Constraints.d(ConstraintsKt.j(j2, -c0.L0(), 0, 2, (Object) null), 0, 0, 0, 0, 11, (Object) null));
                        Ref.IntRef intRef = new Ref.IntRef();
                        float h2 = this.f11116a.h();
                        boolean z2 = Intrinsics.a(h2, ArraysKt.f0(this.f11116a.q())) || Intrinsics.a(h2, ArraysKt.L0(this.f11116a.q()));
                        int f0 = c02.f0(SliderKt.o());
                        if (f0 != Integer.MIN_VALUE) {
                            i4 = f0;
                        }
                        if (this.f11116a.j() == orientation) {
                            int max2 = Math.max(c02.L0(), c0.L0());
                            max = c0.C0() + c02.C0();
                            L0 = (max2 - c02.L0()) / 2;
                            C0 = c0.C0() / 2;
                            int L02 = (max2 - c0.L0()) / 2;
                            intRef.f40906z = (this.f11116a.n() <= 0 || z2) ? MathKt.d(((float) c02.C0()) * h2) : MathKt.d(((float) (c02.C0() - (i4 * 2))) * h2) + i4;
                            if (this.f11116a.m()) {
                                intRef.f40906z = c02.C0() - intRef.f40906z;
                            }
                            i3 = max2;
                            i2 = L02;
                        } else {
                            int L03 = c0.L0() + c02.L0();
                            max = Math.max(c02.C0(), c0.C0());
                            L0 = c0.L0() / 2;
                            C0 = (max - c02.C0()) / 2;
                            int d2 = (this.f11116a.n() <= 0 || z2) ? MathKt.d(((float) c02.L0()) * h2) : MathKt.d(((float) (c02.L0() - (i4 * 2))) * h2) + i4;
                            intRef.f40906z = (max - c0.C0()) / 2;
                            i2 = d2;
                            i3 = L03;
                        }
                        int i7 = C0;
                        int i8 = L0;
                        this.f11116a.E(i3, max);
                        return MeasureScope.R1(measureScope, i3, max, (Map) null, new C0241s6(c02, i8, i7, c0, i2, intRef), 4, (Object) null);
                    }
                }
                ListUtilsKt.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            long j4 = j2;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
