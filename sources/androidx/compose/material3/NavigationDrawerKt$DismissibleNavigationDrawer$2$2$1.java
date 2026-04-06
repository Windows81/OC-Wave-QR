package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.math.MathKt;

@Metadata
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DrawerState f10436a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MutableState f10437b;

    public static final Unit e(DrawerState drawerState, Placeable placeable, Placeable placeable2, MutableState mutableState, Placeable.PlacementScope placementScope) {
        float c2 = drawerState.d().l().c(DrawerValue.Closed);
        float f2 = -((float) placeable.L0());
        if (!NavigationDrawerKt.g(mutableState) || c2 != f2) {
            if (!NavigationDrawerKt.g(mutableState)) {
                NavigationDrawerKt.h(mutableState, true);
            }
            AnchoredDraggableState.O(drawerState.d(), AnchoredDraggableKt.c(new C0221q4(f2)), (Object) null, 2, (Object) null);
        }
        Placeable.PlacementScope.n(placementScope, placeable2, placeable.L0() + MathKt.d(drawerState.h()), 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable, MathKt.d(drawerState.h()), 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit g(float f2, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.a(DrawerValue.Closed, f2);
        draggableAnchorsConfig.a(DrawerValue.Open, 0.0f);
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Placeable c0 = ((Measurable) list.get(0)).c0(j2);
        Placeable c02 = ((Measurable) list.get(1)).c0(j2);
        return MeasureScope.R1(measureScope, c02.L0(), c02.C0(), (Map) null, new C0212p4(this.f10436a, c0, c02, this.f10437b), 4, (Object) null);
    }
}
