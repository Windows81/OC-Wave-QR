package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
public interface MeasurePolicy {

    @Metadata
    public static final class DefaultImpls {
    }

    MeasureResult b(MeasureScope measureScope, List list, long j2);

    int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return b(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null)).b();
    }

    int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return b(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null)).a();
    }

    int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return b(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null)).b();
    }

    int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return b(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null)).a();
    }
}
