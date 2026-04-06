package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
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
import kotlin.jvm.functions.Function1;

@Metadata
public final class SnackbarKt$TextOnlySnackbar$2 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final SnackbarKt$TextOnlySnackbar$2 f8499a = new SnackbarKt$TextOnlySnackbar$2();

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z2 = false;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Placeable c0 = ((Measurable) list.get(i5)).c0(j2);
            arrayList.add(c0);
            if (c0.f0(AlignmentLineKt.a()) != Integer.MIN_VALUE && (i2 == Integer.MIN_VALUE || c0.f0(AlignmentLineKt.a()) < i2)) {
                i2 = c0.f0(AlignmentLineKt.a());
            }
            if (c0.f0(AlignmentLineKt.b()) != Integer.MIN_VALUE && (i3 == Integer.MIN_VALUE || c0.f0(AlignmentLineKt.b()) > i3)) {
                i3 = c0.f0(AlignmentLineKt.b());
            }
            i4 = Math.max(i4, c0.C0());
        }
        long j3 = j2;
        if (!(i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE)) {
            z2 = true;
        }
        final int max = Math.max(measureScope.P1((i2 == i3 || !z2) ? SnackbarKt.f8465h : SnackbarKt.f8466i), i4);
        return MeasureScope.R1(measureScope, Constraints.l(j2), max, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                ArrayList arrayList = arrayList;
                int i2 = max;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Placeable placeable = (Placeable) arrayList.get(i3);
                    Placeable.PlacementScope.n(placementScope, placeable, 0, (i2 - placeable.C0()) / 2, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }
}
