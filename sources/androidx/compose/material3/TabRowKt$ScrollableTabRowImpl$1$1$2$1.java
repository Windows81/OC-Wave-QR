package androidx.compose.material3;

import androidx.collection.MutableIntList;
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
public final class TabRowKt$ScrollableTabRowImpl$1$1$2$1 implements MultiContentMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f11307a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f11308b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TabRowKt$ScrollableTabRowImpl$1$scope$1$1 f11309c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f11310d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ScrollableTabData f11311e;

    public TabRowKt$ScrollableTabRowImpl$1$1$2$1(float f2, float f3, TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1, int i2, ScrollableTabData scrollableTabData) {
        this.f11307a = f2;
        this.f11308b = f3;
        this.f11309c = tabRowKt$ScrollableTabRowImpl$1$scope$1$1;
        this.f11310d = i2;
        this.f11311e = scrollableTabData;
    }

    public static final Unit d(Ref.FloatRef floatRef, float f2, List list, List list2, ScrollableTabData scrollableTabData, MeasureScope measureScope, int i2, List list3, int i3, int i4, Placeable.PlacementScope placementScope) {
        Ref.FloatRef floatRef2 = floatRef;
        List list4 = list;
        List list5 = list2;
        MeasureScope measureScope2 = measureScope;
        floatRef2.f40905z = f2;
        int size = list4.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable.PlacementScope.n(placementScope, (Placeable) list4.get(i5), measureScope2.P1(floatRef2.f40905z), 0, 0.0f, 4, (Object) null);
            floatRef2.f40905z = Dp.m(floatRef2.f40905z + ((TabPosition) list3.get(i5)).d());
        }
        List list6 = list3;
        int size2 = list5.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Placeable placeable = (Placeable) list5.get(i6);
            Placeable.PlacementScope.n(placementScope, placeable, Math.max(0, (measureScope2.P1(((TabPosition) list3.get(i3)).d()) - placeable.L0()) / 2), i4 - placeable.C0(), 0.0f, 4, (Object) null);
        }
        scrollableTabData.d(measureScope, i2, list3, i3);
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        List list3 = (List) list2.get(0);
        List list4 = (List) list2.get(1);
        int P1 = measureScope2.P1(this.f11307a);
        int size = list3.size();
        Integer num = 0;
        Collection collection = list3;
        int size2 = collection.size();
        for (int i2 = 0; i2 < size2; i2++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((Measurable) list3.get(i2)).C(Integer.MAX_VALUE)));
        }
        int intValue = num.intValue();
        int i3 = P1 * 2;
        long d2 = Constraints.d(j2, measureScope2.P1(this.f11308b), 0, intValue, intValue, 2, (Object) null);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.f40905z = this.f11307a;
        ArrayList arrayList = new ArrayList(list3.size());
        int size3 = collection.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList.add(((Measurable) list3.get(i4)).c0(d2));
        }
        MutableIntList mutableIntList = new MutableIntList(0, 1, (DefaultConstructorMarker) null);
        int size4 = collection.size();
        for (int i5 = 0; i5 < size4; i5++) {
            mutableIntList.k(((Measurable) list3.get(i5)).a0(Integer.MAX_VALUE));
        }
        float f2 = this.f11308b;
        ArrayList arrayList2 = new ArrayList(size);
        int i6 = i3;
        for (int i7 = 0; i7 < size; i7++) {
            float t2 = ((Dp) ComparisonsKt.j(Dp.j(f2), Dp.j(measureScope2.D(((Placeable) arrayList.get(i7)).L0())))).t();
            i6 += measureScope2.P1(t2);
            TabPosition tabPosition = new TabPosition(floatRef.f40905z, t2, ((Dp) ComparisonsKt.j(Dp.j(Dp.m(measureScope2.D(mutableIntList.e(i7)) - Dp.m(TabKt.k() * ((float) 2)))), Dp.j(Dp.m((float) 24)))).t(), (DefaultConstructorMarker) null);
            floatRef.f40905z = Dp.m(floatRef.f40905z + t2);
            arrayList2.add(tabPosition);
        }
        this.f11309c.b(arrayList2);
        int i8 = this.f11310d;
        ArrayList arrayList3 = new ArrayList(list4.size());
        int size5 = list4.size();
        int i9 = 0;
        while (i9 < size5) {
            arrayList3.add(((Measurable) list4.get(i9)).c0(Constraints.c(j2, 0, measureScope2.P1(((TabPosition) arrayList2.get(i8)).a()), 0, intValue)));
            i9++;
            arrayList = arrayList;
            floatRef = floatRef;
        }
        return MeasureScope.R1(measureScope, i6, intValue, (Map) null, new U6(floatRef, this.f11307a, arrayList, arrayList3, this.f11311e, measureScope, P1, arrayList2, this.f11310d, intValue), 4, (Object) null);
    }
}
