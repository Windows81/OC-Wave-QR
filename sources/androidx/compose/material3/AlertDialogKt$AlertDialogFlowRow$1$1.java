package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;

@Metadata
public final class AlertDialogKt$AlertDialogFlowRow$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f9144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f9145b;

    public AlertDialogKt$AlertDialogFlowRow$1$1(float f2, float f3) {
        this.f9144a = f2;
        this.f9145b = f3;
    }

    private static final boolean d(List list, Ref.IntRef intRef, MeasureScope measureScope, float f2, long j2, Placeable placeable) {
        return list.isEmpty() || (intRef.f40906z + measureScope.P1(f2)) + placeable.L0() <= Constraints.l(j2);
    }

    public static final Unit e(List list, MeasureScope measureScope, float f2, int i2, List list2, Placeable.PlacementScope placementScope) {
        List list3 = list;
        int size = list3.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list4 = (List) list3.get(i3);
            int size2 = list4.size();
            int[] iArr = new int[size2];
            int i4 = 0;
            while (i4 < size2) {
                iArr[i4] = ((Placeable) list4.get(i4)).L0() + (i4 < CollectionsKt.o(list4) ? measureScope.P1(f2) : 0);
                i4++;
            }
            int[] iArr2 = new int[size2];
            Arrangement.f3739a.c().c(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
            int size3 = list4.size();
            for (int i5 = 0; i5 < size3; i5++) {
                Placeable.PlacementScope.j(placementScope, (Placeable) list4.get(i5), iArr2[i5], ((Number) list2.get(i3)).intValue(), 0.0f, 4, (Object) null);
            }
            List list5 = list2;
        }
        return Unit.f40552a;
    }

    private static final void g(List list, Ref.IntRef intRef, MeasureScope measureScope, float f2, List list2, List list3, Ref.IntRef intRef2, List list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
        if (!list.isEmpty()) {
            intRef.f40906z += measureScope.P1(f2);
        }
        list.add(0, CollectionsKt.M0(list2));
        list3.add(Integer.valueOf(intRef2.f40906z));
        list4.add(Integer.valueOf(intRef.f40906z));
        intRef.f40906z += intRef2.f40906z;
        intRef3.f40906z = Math.max(intRef3.f40906z, intRef4.f40906z);
        list2.clear();
        intRef4.f40906z = 0;
        intRef2.f40906z = 0;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        AlertDialogKt$AlertDialogFlowRow$1$1 alertDialogKt$AlertDialogFlowRow$1$1;
        Ref.IntRef intRef;
        ArrayList arrayList;
        Ref.IntRef intRef2;
        Ref.IntRef intRef3;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Ref.IntRef intRef4 = new Ref.IntRef();
        Ref.IntRef intRef5 = new Ref.IntRef();
        ArrayList arrayList5 = new ArrayList();
        Ref.IntRef intRef6 = new Ref.IntRef();
        Ref.IntRef intRef7 = new Ref.IntRef();
        float f2 = this.f9144a;
        float f3 = this.f9145b;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            Placeable c0 = ((Measurable) list2.get(i2)).c0(j2);
            int i3 = i2;
            int i4 = size;
            float f4 = f2;
            float f5 = f3;
            Ref.IntRef intRef8 = intRef7;
            if (!d(arrayList5, intRef6, measureScope, f2, j2, c0)) {
                intRef2 = intRef6;
                arrayList = arrayList5;
                intRef = intRef5;
                g(arrayList2, intRef5, measureScope, f5, arrayList5, arrayList3, intRef8, arrayList4, intRef4, intRef2);
            } else {
                intRef2 = intRef6;
                arrayList = arrayList5;
                intRef = intRef5;
            }
            if (!arrayList.isEmpty()) {
                intRef3 = intRef2;
                intRef3.f40906z += measureScope.P1(f4);
            } else {
                MeasureScope measureScope2 = measureScope;
                intRef3 = intRef2;
            }
            Placeable placeable = c0;
            ArrayList arrayList6 = arrayList;
            arrayList6.add(placeable);
            intRef3.f40906z += placeable.L0();
            Ref.IntRef intRef9 = intRef8;
            intRef9.f40906z = Math.max(intRef9.f40906z, placeable.C0());
            i2 = i3 + 1;
            f2 = f4;
            intRef7 = intRef9;
            intRef6 = intRef3;
            intRef5 = intRef;
            f3 = f5;
            arrayList5 = arrayList6;
            size = i4;
            list2 = list;
        }
        Ref.IntRef intRef10 = intRef7;
        ArrayList arrayList7 = arrayList5;
        Ref.IntRef intRef11 = intRef5;
        MeasureScope measureScope3 = measureScope;
        Ref.IntRef intRef12 = intRef6;
        if (!arrayList7.isEmpty()) {
            alertDialogKt$AlertDialogFlowRow$1$1 = this;
            g(arrayList2, intRef11, measureScope, alertDialogKt$AlertDialogFlowRow$1$1.f9145b, arrayList7, arrayList3, intRef10, arrayList4, intRef4, intRef12);
        } else {
            alertDialogKt$AlertDialogFlowRow$1$1 = this;
        }
        int max = Math.max(intRef4.f40906z, Constraints.n(j2));
        MeasureScope measureScope4 = measureScope;
        return MeasureScope.R1(measureScope4, max, Math.max(intRef11.f40906z, Constraints.m(j2)), (Map) null, new C0092f(arrayList2, measureScope4, alertDialogKt$AlertDialogFlowRow$1$1.f9144a, max, arrayList4), 4, (Object) null);
    }
}
