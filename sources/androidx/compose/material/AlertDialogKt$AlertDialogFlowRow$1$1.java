package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata
public final class AlertDialogKt$AlertDialogFlowRow$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f7063a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f7064b;

    public AlertDialogKt$AlertDialogFlowRow$1$1(float f2, float f3) {
        this.f7063a = f2;
        this.f7064b = f3;
    }

    public static final boolean a(List list, Ref.IntRef intRef, MeasureScope measureScope, float f2, long j2, Placeable placeable) {
        return list.isEmpty() || (intRef.f40906z + measureScope.P1(f2)) + placeable.L0() <= Constraints.l(j2);
    }

    public static final void d(List list, Ref.IntRef intRef, MeasureScope measureScope, float f2, List list2, List list3, Ref.IntRef intRef2, List list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
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
        ArrayList arrayList;
        Ref.IntRef intRef;
        ArrayList arrayList2;
        Ref.IntRef intRef2;
        Ref.IntRef intRef3;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Ref.IntRef intRef4 = new Ref.IntRef();
        Ref.IntRef intRef5 = new Ref.IntRef();
        ArrayList arrayList6 = new ArrayList();
        Ref.IntRef intRef6 = new Ref.IntRef();
        Ref.IntRef intRef7 = new Ref.IntRef();
        long b2 = ConstraintsKt.b(0, Constraints.l(j2), 0, 0, 13, (Object) null);
        float f2 = this.f7063a;
        float f3 = this.f7064b;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Placeable c0 = ((Measurable) list.get(i2)).c0(b2);
            int i3 = i2;
            int i4 = size;
            float f4 = f3;
            long j3 = b2;
            float f5 = f2;
            if (!a(arrayList6, intRef6, measureScope, f2, j2, c0)) {
                arrayList2 = arrayList4;
                intRef2 = intRef7;
                intRef = intRef6;
                arrayList = arrayList6;
                d(arrayList3, intRef5, measureScope, f4, arrayList6, arrayList4, intRef7, arrayList5, intRef4, intRef);
            } else {
                intRef = intRef6;
                arrayList = arrayList6;
                arrayList2 = arrayList4;
                intRef2 = intRef7;
            }
            if (!arrayList.isEmpty()) {
                intRef3 = intRef;
                intRef3.f40906z += measureScope.P1(f5);
            } else {
                MeasureScope measureScope2 = measureScope;
                intRef3 = intRef;
            }
            Placeable placeable = c0;
            ArrayList arrayList7 = arrayList;
            arrayList7.add(placeable);
            intRef3.f40906z += placeable.L0();
            intRef2.f40906z = Math.max(intRef2.f40906z, placeable.C0());
            i2 = i3 + 1;
            f2 = f5;
            intRef6 = intRef3;
            intRef7 = intRef2;
            size = i4;
            f3 = f4;
            arrayList4 = arrayList2;
            arrayList6 = arrayList7;
            b2 = j3;
        }
        ArrayList arrayList8 = arrayList6;
        ArrayList arrayList9 = arrayList4;
        Ref.IntRef intRef8 = intRef7;
        Ref.IntRef intRef9 = intRef6;
        MeasureScope measureScope3 = measureScope;
        if (!arrayList8.isEmpty()) {
            alertDialogKt$AlertDialogFlowRow$1$1 = this;
            d(arrayList3, intRef5, measureScope, alertDialogKt$AlertDialogFlowRow$1$1.f7064b, arrayList8, arrayList9, intRef8, arrayList5, intRef4, intRef9);
        } else {
            alertDialogKt$AlertDialogFlowRow$1$1 = this;
        }
        int l2 = Constraints.l(j2) != Integer.MAX_VALUE ? Constraints.l(j2) : Math.max(intRef4.f40906z, Constraints.n(j2));
        int max = Math.max(intRef5.f40906z, Constraints.m(j2));
        final float f6 = alertDialogKt$AlertDialogFlowRow$1$1.f7063a;
        final ArrayList arrayList10 = arrayList3;
        final MeasureScope measureScope4 = measureScope;
        final int i5 = l2;
        final ArrayList arrayList11 = arrayList5;
        return MeasureScope.R1(measureScope, l2, max, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                List list = arrayList10;
                MeasureScope measureScope = measureScope4;
                float f2 = f6;
                int i2 = i5;
                List list2 = arrayList11;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    List list3 = (List) list.get(i3);
                    int size2 = list3.size();
                    int[] iArr = new int[size2];
                    int i4 = 0;
                    while (i4 < size2) {
                        iArr[i4] = ((Placeable) list3.get(i4)).L0() + (i4 < CollectionsKt.o(list3) ? measureScope.P1(f2) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size2];
                    Arrangement.f3739a.a().b(measureScope, i2, iArr, iArr2);
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        Placeable.PlacementScope.j(placementScope, (Placeable) list3.get(i5), iArr2[i5], ((Number) list2.get(i3)).intValue(), 0.0f, 4, (Object) null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }
}
