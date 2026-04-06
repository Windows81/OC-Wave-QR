package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

@Metadata
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 implements MultiContentMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SheetState f9284a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function0 f9285b;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9286a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.SheetValue[] r0 = androidx.compose.material3.SheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f9286a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.WhenMappings.<clinit>():void");
        }
    }

    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(SheetState sheetState, Function0 function0) {
        this.f9284a = sheetState;
        this.f9285b = function0;
    }

    public static final Unit d(List list, int i2, List list2, SheetState sheetState, Function0 function0, int i3, List list3, List list4, int i4, Placeable.PlacementScope placementScope) {
        Integer num;
        Integer num2;
        int i5;
        List list5 = list;
        List list6 = list2;
        List list7 = list3;
        List list8 = list4;
        Integer num3 = null;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((Placeable) list5.get(0)).L0());
            int o2 = CollectionsKt.o(list);
            if (1 <= o2) {
                int i6 = 1;
                while (true) {
                    Integer valueOf = Integer.valueOf(((Placeable) list5.get(i6)).L0());
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i6 == o2) {
                        break;
                    }
                    i6++;
                }
            }
        }
        int max = Math.max(0, (i2 - (num != null ? num.intValue() : 0)) / 2);
        if (list2.isEmpty()) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(((Placeable) list6.get(0)).L0());
            int o3 = CollectionsKt.o(list2);
            if (1 <= o3) {
                int i7 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((Placeable) list6.get(i7)).L0());
                    if (valueOf2.compareTo(num2) > 0) {
                        num2 = valueOf2;
                    }
                    if (i7 == o3) {
                        break;
                    }
                    i7++;
                }
            }
        }
        int intValue = num2 != null ? num2.intValue() : 0;
        if (!list2.isEmpty()) {
            num3 = Integer.valueOf(((Placeable) list6.get(0)).C0());
            int o4 = CollectionsKt.o(list2);
            if (1 <= o4) {
                int i8 = 1;
                while (true) {
                    Integer valueOf3 = Integer.valueOf(((Placeable) list6.get(i8)).C0());
                    if (valueOf3.compareTo(num3) > 0) {
                        num3 = valueOf3;
                    }
                    if (i8 == o4) {
                        break;
                    }
                    i8++;
                }
            }
        }
        int intValue2 = num3 != null ? num3.intValue() : 0;
        int i9 = (i2 - intValue) / 2;
        int i10 = WhenMappings.f9286a[sheetState.k().ordinal()];
        if (i10 == 1) {
            i5 = MathKt.d(((Number) function0.invoke()).floatValue()) - intValue2;
        } else if (i10 == 2 || i10 == 3) {
            i5 = i3 - intValue2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int size = list7.size();
        for (int i11 = 0; i11 < size; i11++) {
            Placeable.PlacementScope.n(placementScope, (Placeable) list7.get(i11), 0, i4, 0.0f, 4, (Object) null);
        }
        int size2 = list8.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Placeable.PlacementScope.n(placementScope, (Placeable) list8.get(i12), 0, 0, 0.0f, 4, (Object) null);
        }
        int size3 = list5.size();
        for (int i13 = 0; i13 < size3; i13++) {
            Placeable.PlacementScope.n(placementScope, (Placeable) list5.get(i13), max, 0, 0.0f, 4, (Object) null);
        }
        int size4 = list6.size();
        for (int i14 = 0; i14 < size4; i14++) {
            Placeable.PlacementScope.n(placementScope, (Placeable) list6.get(i14), i9, i5, 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Integer num;
        List list2 = list;
        List list3 = (List) list2.get(0);
        int i2 = 1;
        List list4 = (List) list2.get(1);
        List list5 = (List) list2.get(2);
        List list6 = (List) list2.get(3);
        int l2 = Constraints.l(j2);
        int k2 = Constraints.k(j2);
        long d2 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        ArrayList arrayList = new ArrayList(list5.size());
        int size = list5.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Measurable) list5.get(i3)).c0(d2));
        }
        ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList2.add(((Measurable) list3.get(i4)).c0(d2));
        }
        if (arrayList2.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((Placeable) arrayList2.get(0)).C0());
            int o2 = CollectionsKt.o(arrayList2);
            if (1 <= o2) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((Placeable) arrayList2.get(i2)).C0());
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i2 == o2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        int intValue = num != null ? num.intValue() : 0;
        long d3 = Constraints.d(d2, 0, 0, 0, k2 - intValue, 7, (Object) null);
        ArrayList arrayList3 = new ArrayList(list4.size());
        int size3 = list4.size();
        for (int i5 = 0; i5 < size3; i5++) {
            arrayList3.add(((Measurable) list4.get(i5)).c0(d3));
        }
        ArrayList arrayList4 = new ArrayList(list6.size());
        int size4 = list6.size();
        for (int i6 = 0; i6 < size4; i6++) {
            arrayList4.add(((Measurable) list6.get(i6)).c0(d2));
        }
        return MeasureScope.R1(measureScope, l2, k2, (Map) null, new S(arrayList, l2, arrayList4, this.f9284a, this.f9285b, k2, arrayList3, arrayList2, intValue), 4, (Object) null);
    }
}
