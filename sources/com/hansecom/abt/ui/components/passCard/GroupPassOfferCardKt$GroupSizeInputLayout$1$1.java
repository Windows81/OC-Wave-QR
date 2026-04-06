package com.hansecom.abt.ui.components.passCard;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class GroupPassOfferCardKt$GroupSizeInputLayout$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final GroupPassOfferCardKt$GroupSizeInputLayout$1$1 f38618a = new GroupPassOfferCardKt$GroupSizeInputLayout$1$1();

    public static final Unit d(Placeable placeable, int i2, Placeable placeable2, Placeable placeable3, Placeable.PlacementScope placementScope) {
        Intrinsics.i(placementScope, "$this$layout");
        Placeable.PlacementScope.j(placementScope, placeable, i2 - placeable.L0(), 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.j(placementScope, placeable2, 0, (placeable.C0() / 2) - (placeable2.C0() / 2), 0.0f, 4, (Object) null);
        Placeable.PlacementScope.j(placementScope, placeable3, (i2 - (placeable.L0() / 2)) - (placeable3.L0() / 2), placeable.C0(), 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Intrinsics.i(measureScope, "$this$Layout");
        Intrinsics.i(list, "measurables");
        if (list.size() == 3) {
            Iterable<Measurable> iterable = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
            for (Measurable c0 : iterable) {
                arrayList.add(c0.c0(j2));
            }
            Placeable placeable = (Placeable) arrayList.get(1);
            Placeable placeable2 = (Placeable) arrayList.get(2);
            int l2 = Constraints.l(j2);
            return MeasureScope.R1(measureScope, l2, RangesKt.j(placeable.C0() + placeable2.C0(), Constraints.k(j2)), (Map) null, new y(placeable, l2, (Placeable) arrayList.get(0), placeable2), 4, (Object) null);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
