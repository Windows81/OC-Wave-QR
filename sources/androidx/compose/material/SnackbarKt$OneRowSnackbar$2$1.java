package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class SnackbarKt$OneRowSnackbar$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f8470a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8471b;

    public SnackbarKt$OneRowSnackbar$2$1(String str, String str2) {
        this.f8470a = str;
        this.f8471b = str2;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        final int i2;
        final int i3;
        int i4;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        String str = this.f8470a;
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Measurable measurable = (Measurable) list2.get(i6);
            if (Intrinsics.d(LayoutIdKt.a(measurable), str)) {
                Placeable c0 = measurable.c0(j2);
                int e2 = RangesKt.e((Constraints.l(j2) - c0.L0()) - measureScope2.P1(SnackbarKt.f8463f), Constraints.n(j2));
                String str2 = this.f8471b;
                int size2 = list.size();
                int i7 = 0;
                while (i7 < size2) {
                    Measurable measurable2 = (Measurable) list2.get(i7);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), str2)) {
                        final Placeable c02 = measurable2.c0(Constraints.d(j2, 0, e2, 0, 0, 9, (Object) null));
                        int f0 = c02.f0(AlignmentLineKt.a());
                        int f02 = c02.f0(AlignmentLineKt.b());
                        boolean z2 = true;
                        boolean z3 = (f0 == Integer.MIN_VALUE || f02 == Integer.MIN_VALUE) ? false : true;
                        if (f0 != f02 && z3) {
                            z2 = false;
                        }
                        final int l2 = Constraints.l(j2) - c0.L0();
                        if (z2) {
                            i4 = Math.max(measureScope2.P1(SnackbarKt.f8465h), c0.C0());
                            int C0 = (i4 - c02.C0()) / 2;
                            int f03 = c0.f0(AlignmentLineKt.a());
                            if (f03 != Integer.MIN_VALUE) {
                                i5 = (f0 + C0) - f03;
                            }
                            i2 = i5;
                            i3 = C0;
                        } else {
                            int P1 = measureScope2.P1(SnackbarKt.f8458a) - f0;
                            int max = Math.max(measureScope2.P1(SnackbarKt.f8466i), c02.C0() + P1);
                            i3 = P1;
                            i2 = (max - c0.C0()) / 2;
                            i4 = max;
                        }
                        final Placeable placeable = c0;
                        return MeasureScope.R1(measureScope, Constraints.l(j2), i4, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
                            public final void b(Placeable.PlacementScope placementScope) {
                                Placeable.PlacementScope.n(placementScope, c02, 0, i3, 0.0f, 4, (Object) null);
                                Placeable.PlacementScope.n(placementScope, placeable, l2, i2, 0.0f, 4, (Object) null);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((Placeable.PlacementScope) obj);
                                return Unit.f40552a;
                            }
                        }, 4, (Object) null);
                    }
                    i7++;
                    long j3 = j2;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
