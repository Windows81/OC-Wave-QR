package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TabRowKt$TabRowImpl$1$2$1 implements MultiContentMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TabRowKt$TabRowImpl$1$scope$1$1 f11328a;

    public TabRowKt$TabRowImpl$1$2$1(TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1) {
        this.f11328a = tabRowKt$TabRowImpl$1$scope$1$1;
    }

    public static final Unit d(List list, List list2, List list3, Ref.IntRef intRef, int i2, Placeable.PlacementScope placementScope) {
        List list4 = list2;
        List list5 = list3;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable.PlacementScope.n(placementScope, (Placeable) list.get(i3), i3 * intRef.f40906z, 0, 0.0f, 4, (Object) null);
        }
        int size2 = list4.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable placeable = (Placeable) list2.get(i4);
            Placeable.PlacementScope.n(placementScope, placeable, 0, i2 - placeable.C0(), 0.0f, 4, (Object) null);
        }
        int size3 = list5.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Placeable placeable2 = (Placeable) list5.get(i5);
            Placeable.PlacementScope.n(placementScope, placeable2, 0, i2 - placeable2.C0(), 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        List list3 = (List) list2.get(0);
        List list4 = (List) list2.get(1);
        int i2 = 2;
        List list5 = (List) list2.get(2);
        int l2 = Constraints.l(j2);
        int size = list3.size();
        Ref.IntRef intRef = new Ref.IntRef();
        if (size > 0) {
            intRef.f40906z = l2 / size;
        }
        Integer num = 0;
        Collection collection = list3;
        int size2 = collection.size();
        for (int i3 = 0; i3 < size2; i3++) {
            num = Integer.valueOf(Math.max(((Measurable) list3.get(i3)).C(intRef.f40906z), num.intValue()));
        }
        int intValue = num.intValue();
        TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = this.f11328a;
        ArrayList arrayList = new ArrayList(size);
        int i4 = 0;
        while (i4 < size) {
            arrayList.add(new TabPosition(Dp.m(measureScope2.D(intRef.f40906z) * ((float) i4)), measureScope2.D(intRef.f40906z), ((Dp) ComparisonsKt.j(Dp.j(Dp.m(measureScope2.D(Math.min(((Measurable) list3.get(i4)).a0(intValue), intRef.f40906z)) - Dp.m(TabKt.k() * ((float) i2)))), Dp.j(Dp.m((float) 24)))).t(), (DefaultConstructorMarker) null));
            i4++;
            measureScope2 = measureScope;
            size = size;
            i2 = 2;
        }
        tabRowKt$TabRowImpl$1$scope$1$1.b(arrayList);
        ArrayList arrayList2 = new ArrayList(list3.size());
        int size3 = collection.size();
        for (int i5 = 0; i5 < size3; i5++) {
            int i6 = intRef.f40906z;
            arrayList2.add(((Measurable) list3.get(i5)).c0(Constraints.c(j2, i6, i6, intValue, intValue)));
        }
        ArrayList arrayList3 = new ArrayList(list4.size());
        int size4 = list4.size();
        for (int i7 = 0; i7 < size4; i7++) {
            arrayList3.add(((Measurable) list4.get(i7)).c0(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null)));
        }
        ArrayList arrayList4 = new ArrayList(list5.size());
        int size5 = list5.size();
        for (int i8 = 0; i8 < size5; i8++) {
            int i9 = intRef.f40906z;
            arrayList4.add(((Measurable) list5.get(i8)).c0(Constraints.c(j2, i9, i9, 0, intValue)));
        }
        ArrayList arrayList5 = arrayList3;
        int i10 = intValue;
        return MeasureScope.R1(measureScope, l2, i10, (Map) null, new X6(arrayList2, arrayList5, arrayList4, intRef, i10), 4, (Object) null);
    }
}
