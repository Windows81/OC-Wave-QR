package androidx.compose.ui.window;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AndroidPopup_androidKt$SimpleStack$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidPopup_androidKt$SimpleStack$1 f19307a = new AndroidPopup_androidKt$SimpleStack$1();

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                final ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    Placeable c0 = ((Measurable) list.get(i4)).c0(j2);
                    i2 = Math.max(i2, c0.L0());
                    i3 = Math.max(i3, c0.C0());
                    arrayList.add(c0);
                }
                return MeasureScope.R1(measureScope, i2, i3, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
                    public final void b(Placeable.PlacementScope placementScope) {
                        int o2 = CollectionsKt.o(arrayList);
                        if (o2 >= 0) {
                            int i2 = 0;
                            while (true) {
                                Placeable.PlacementScope.n(placementScope, (Placeable) arrayList.get(i2), 0, 0, 0.0f, 4, (Object) null);
                                if (i2 != o2) {
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Placeable.PlacementScope) obj);
                        return Unit.f40552a;
                    }
                }, 4, (Object) null);
            }
            final Placeable c02 = ((Measurable) list.get(0)).c0(j2);
            return MeasureScope.R1(measureScope, c02.L0(), c02.C0(), (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
                public final void b(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.n(placementScope, c02, 0, 0, 0.0f, 4, (Object) null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Placeable.PlacementScope) obj);
                    return Unit.f40552a;
                }
            }, 4, (Object) null);
        }
        return MeasureScope.R1(measureScope, 0, 0, (Map) null, AnonymousClass1.f19308z, 4, (Object) null);
    }
}
