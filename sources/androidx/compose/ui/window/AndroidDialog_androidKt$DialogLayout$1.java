package androidx.compose.ui.window;

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
public final class AndroidDialog_androidKt$DialogLayout$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidDialog_androidKt$DialogLayout$1 f19272a = new AndroidDialog_androidKt$DialogLayout$1();

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable c0 = ((Measurable) list.get(i4)).c0(j2);
            i2 = Math.max(i2, c0.L0());
            i3 = Math.max(i3, c0.C0());
            arrayList.add(c0);
        }
        long j3 = j2;
        if (list.isEmpty()) {
            i2 = Constraints.n(j2);
            i3 = Constraints.m(j2);
        }
        return MeasureScope.R1(measureScope, i2, i3, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                List list = arrayList;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Placeable.PlacementScope.n(placementScope, (Placeable) list.get(i2), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }
}
