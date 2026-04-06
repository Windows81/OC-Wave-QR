package androidx.compose.material;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function2 f7338a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f7339b;

    public BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1(Function2 function2, float f2) {
        this.f7338a = function2;
        this.f7339b = f2;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Placeable placeable;
        List list2 = list;
        long j3 = j2;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Measurable measurable = (Measurable) list.get(i3);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "icon")) {
                Placeable c0 = measurable.c0(j3);
                if (this.f7338a != null) {
                    int size2 = list.size();
                    while (i2 < size2) {
                        Measurable measurable2 = (Measurable) list.get(i2);
                        if (Intrinsics.d(LayoutIdKt.a(measurable2), "label")) {
                            placeable = measurable2.c0(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null));
                        } else {
                            i2++;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                placeable = null;
                Placeable placeable2 = placeable;
                if (this.f7338a == null) {
                    MeasureScope measureScope2 = measureScope;
                    return BottomNavigationKt.m(measureScope, c0, j3);
                }
                MeasureScope measureScope3 = measureScope;
                Intrinsics.f(placeable2);
                return BottomNavigationKt.n(measureScope, placeable2, c0, j2, this.f7339b);
            }
            MeasureScope measureScope4 = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
