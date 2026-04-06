package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {

    /* renamed from: b  reason: collision with root package name */
    public static final RootMeasurePolicy f17147b = new RootMeasurePolicy();

    public RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        List list2 = list;
        long j3 = j2;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list2.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    Placeable c0 = ((Measurable) list2.get(i4)).c0(j3);
                    i2 = Math.max(c0.L0(), i2);
                    i3 = Math.max(c0.C0(), i3);
                    arrayList.add(c0);
                }
                return MeasureScope.R1(measureScope, ConstraintsKt.g(j3, i2), ConstraintsKt.f(j3, i3), (Map) null, new RootMeasurePolicy$measure$3(arrayList), 4, (Object) null);
            }
            Placeable c02 = ((Measurable) list2.get(0)).c0(j3);
            return MeasureScope.R1(measureScope, ConstraintsKt.g(j3, c02.L0()), ConstraintsKt.f(j3, c02.C0()), (Map) null, new RootMeasurePolicy$measure$2(c02), 4, (Object) null);
        }
        return MeasureScope.R1(measureScope, Constraints.n(j2), Constraints.m(j2), (Map) null, RootMeasurePolicy$measure$1.f17148z, 4, (Object) null);
    }
}
