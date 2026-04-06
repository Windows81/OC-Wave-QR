package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
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

@Metadata
final class NavigationDrawerKt$ModalNavigationDrawer$2$6$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DrawerState f10447a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MutableState f10448b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f10449c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f10450d;

    public static final Unit e(DrawerState drawerState, int i2, List list, MutableState mutableState, MutableFloatState mutableFloatState, float f2, Placeable.PlacementScope placementScope) {
        float c2 = drawerState.d().l().c(DrawerValue.Closed);
        float f3 = -((float) i2);
        if (!NavigationDrawerKt.l(mutableState) || c2 != f3) {
            if (!NavigationDrawerKt.l(mutableState)) {
                NavigationDrawerKt.m(mutableState, true);
            }
            NavigationDrawerKt.o(mutableFloatState, f3);
            AnchoredDraggableState.O(drawerState.d(), AnchoredDraggableKt.c(new C0257u4(f2, mutableFloatState)), (Object) null, 2, (Object) null);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable.PlacementScope.n(placementScope, (Placeable) list.get(i3), 0, 0, 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public static final Unit g(float f2, MutableFloatState mutableFloatState, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.a(DrawerValue.Closed, NavigationDrawerKt.n(mutableFloatState));
        draggableAnchorsConfig.a(DrawerValue.Open, f2);
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Integer num;
        long d2 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Measurable) list.get(i3)).c0(d2));
        }
        Integer num2 = null;
        int i4 = 1;
        if (arrayList.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((Placeable) arrayList.get(0)).L0());
            int o2 = CollectionsKt.o(arrayList);
            if (1 <= o2) {
                int i5 = 1;
                while (true) {
                    Integer valueOf = Integer.valueOf(((Placeable) arrayList.get(i5)).L0());
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i5 == o2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        int intValue = num != null ? num.intValue() : 0;
        if (!arrayList.isEmpty()) {
            num2 = Integer.valueOf(((Placeable) arrayList.get(0)).C0());
            int o3 = CollectionsKt.o(arrayList);
            if (1 <= o3) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((Placeable) arrayList.get(i4)).C0());
                    if (valueOf2.compareTo(num2) > 0) {
                        num2 = valueOf2;
                    }
                    if (i4 == o3) {
                        break;
                    }
                    i4++;
                }
            }
        }
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return MeasureScope.R1(measureScope, intValue, i2, (Map) null, new C0248t4(this.f10447a, intValue, arrayList, this.f10448b, this.f10449c, this.f10450d), 4, (Object) null);
    }
}
