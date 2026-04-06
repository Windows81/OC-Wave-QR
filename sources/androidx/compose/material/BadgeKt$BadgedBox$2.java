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
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BadgeKt$BadgedBox$2 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final BadgeKt$BadgedBox$2 f7293a = new BadgeKt$BadgedBox$2();

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        final MeasureScope measureScope2 = measureScope;
        List list2 = list;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list2.get(i2);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "badge")) {
                final Placeable c0 = measurable.c0(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null));
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = (Measurable) list2.get(i3);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), "anchor")) {
                        final Placeable c02 = measurable2.c0(j2);
                        return measureScope2.y0(c02.L0(), c02.C0(), MapsKt.k(TuplesKt.a(AlignmentLineKt.a(), Integer.valueOf(c02.f0(AlignmentLineKt.a()))), TuplesKt.a(AlignmentLineKt.b(), Integer.valueOf(c02.f0(AlignmentLineKt.b())))), new Function1<Placeable.PlacementScope, Unit>() {
                            public final void b(Placeable.PlacementScope placementScope) {
                                float f2 = c0.L0() > measureScope2.P1(BadgeKt.e()) * 2 ? BadgeKt.f() : BadgeKt.d();
                                Placeable.PlacementScope.n(placementScope, c02, 0, 0, 0.0f, 4, (Object) null);
                                Placeable.PlacementScope.n(placementScope, c0, c02.L0() + measureScope2.P1(f2), (-c0.C0()) / 2, 0.0f, 4, (Object) null);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((Placeable.PlacementScope) obj);
                                return Unit.f40552a;
                            }
                        });
                    }
                    long j3 = j2;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            long j4 = j2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
