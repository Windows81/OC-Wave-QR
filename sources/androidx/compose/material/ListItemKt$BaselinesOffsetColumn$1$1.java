package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ListItemKt$BaselinesOffsetColumn$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f7913a;

    public ListItemKt$BaselinesOffsetColumn$1$1(List list) {
        this.f7913a = list;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        int i2;
        long d2 = Constraints.d(j2, 0, 0, 0, Integer.MAX_VALUE, 3, (Object) null);
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Measurable) list.get(i3)).c0(d2));
        }
        Integer num = 0;
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((Placeable) arrayList.get(i4)).L0()));
        }
        int intValue = num.intValue();
        final int[] iArr = new int[arrayList.size()];
        List list2 = this.f7913a;
        int size3 = arrayList.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size3; i6++) {
            Placeable placeable = (Placeable) arrayList.get(i6);
            if (i6 > 0) {
                int i7 = i6 - 1;
                i2 = ((Placeable) arrayList.get(i7)).C0() - ((Placeable) arrayList.get(i7)).f0(AlignmentLineKt.b());
            } else {
                i2 = 0;
            }
            int max = Math.max(0, (measureScope.P1(((Dp) list2.get(i6)).t()) - placeable.f0(AlignmentLineKt.a())) - i2);
            iArr[i6] = max + i5;
            i5 += max + placeable.C0();
        }
        return MeasureScope.R1(measureScope, intValue, i5, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                List list = arrayList;
                int[] iArr = iArr;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Placeable.PlacementScope.n(placementScope, (Placeable) list.get(i2), 0, iArr[i2], 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }
}
