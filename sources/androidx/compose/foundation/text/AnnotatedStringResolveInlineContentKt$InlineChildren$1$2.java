package androidx.compose.foundation.text;

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
public final class AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 f5477a = new AnnotatedStringResolveInlineContentKt$InlineChildren$1$2();

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Measurable) list.get(i2)).c0(j2));
        }
        return MeasureScope.R1(measureScope, Constraints.l(j2), Constraints.k(j2), (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
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
