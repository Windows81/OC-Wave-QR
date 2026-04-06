package androidx.compose.material3;

import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BadgeKt$BadgedBox$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final BadgeKt$BadgedBox$1$1 f9245a = new BadgeKt$BadgedBox$1$1();

    public static final Unit d(Placeable placeable, MeasureScope measureScope, Placeable placeable2, Placeable.PlacementScope placementScope) {
        boolean z2 = placeable.L0() > measureScope.P1(BadgeTokens.f12788a.a());
        float d2 = z2 ? BadgeKt.d() : BadgeKt.b();
        float e2 = z2 ? BadgeKt.e() : BadgeKt.b();
        Placeable.PlacementScope.n(placementScope, placeable2, 0, 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable, Math.min(placeable2.L0() - measureScope.P1(d2), ((int) placementScope.d(BadgeKt.a(), Float.POSITIVE_INFINITY)) - placeable.L0()), Math.max((-placeable.C0()) + measureScope.P1(e2), (int) placementScope.d(BadgeKt.c(), Float.NEGATIVE_INFINITY)), 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list2.get(i2);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "badge")) {
                Placeable c0 = measurable.c0(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null));
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = (Measurable) list2.get(i3);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), "anchor")) {
                        Placeable c02 = measurable2.c0(j2);
                        return measureScope2.y0(c02.L0(), c02.C0(), MapsKt.k(TuplesKt.a(AlignmentLineKt.a(), Integer.valueOf(c02.f0(AlignmentLineKt.a()))), TuplesKt.a(AlignmentLineKt.b(), Integer.valueOf(c02.f0(AlignmentLineKt.b())))), new D(c0, measureScope2, c02));
                    }
                    long j3 = j2;
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
