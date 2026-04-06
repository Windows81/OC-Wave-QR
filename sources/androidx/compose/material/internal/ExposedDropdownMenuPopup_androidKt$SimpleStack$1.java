package androidx.compose.material.internal;

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
public final class ExposedDropdownMenuPopup_androidKt$SimpleStack$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final ExposedDropdownMenuPopup_androidKt$SimpleStack$1 f8988a = new ExposedDropdownMenuPopup_androidKt$SimpleStack$1();

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        int i2;
        int i3;
        int size = list.size();
        if (size != 0) {
            int i4 = 0;
            if (size != 1) {
                final ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList.add(((Measurable) list.get(i5)).c0(j2));
                }
                int o2 = CollectionsKt.o(arrayList);
                if (o2 >= 0) {
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        Placeable placeable = (Placeable) arrayList.get(i4);
                        i6 = Math.max(i6, placeable.L0());
                        i7 = Math.max(i7, placeable.C0());
                        if (i4 == o2) {
                            break;
                        }
                        i4++;
                    }
                    i3 = i6;
                    i2 = i7;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                return MeasureScope.R1(measureScope, i3, i2, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
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
            final Placeable c0 = ((Measurable) list.get(0)).c0(j2);
            return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
                public final void b(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.n(placementScope, c0, 0, 0, 0.0f, 4, (Object) null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Placeable.PlacementScope) obj);
                    return Unit.f40552a;
                }
            }, 4, (Object) null);
        }
        return MeasureScope.R1(measureScope, 0, 0, (Map) null, AnonymousClass1.f8989z, 4, (Object) null);
    }
}
