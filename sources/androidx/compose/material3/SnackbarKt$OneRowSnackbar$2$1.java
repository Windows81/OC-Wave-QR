package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class SnackbarKt$OneRowSnackbar$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11184a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11185b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11186c;

    public SnackbarKt$OneRowSnackbar$2$1(String str, String str2, String str3) {
        this.f11184a = str;
        this.f11185b = str2;
        this.f11186c = str3;
    }

    public static final Unit d(Placeable placeable, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.n(placementScope, placeable, 0, i2, 0.0f, 4, (Object) null);
        if (placeable2 != null) {
            Placeable.PlacementScope.n(placementScope, placeable2, i3, i4, 0.0f, 4, (Object) null);
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.n(placementScope, placeable3, i5, i6, 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Placeable placeable;
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Placeable placeable2;
        int i4;
        int i5;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        long j3 = j2;
        int min = Math.min(Constraints.l(j2), measureScope2.P1(SnackbarKt.f11176a));
        String str = this.f11184a;
        Collection collection = list2;
        int size = collection.size();
        int i6 = 0;
        while (true) {
            placeable = null;
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i6);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj), str)) {
                break;
            }
            i6++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable c0 = measurable != null ? measurable.c0(j3) : null;
        String str2 = this.f11185b;
        int size2 = collection.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i7);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj2), str2)) {
                break;
            }
            i7++;
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            placeable = measurable2.c0(j3);
        }
        Placeable placeable3 = placeable;
        int L0 = c0 != null ? c0.L0() : 0;
        int C0 = c0 != null ? c0.C0() : 0;
        int L02 = placeable3 != null ? placeable3.L0() : 0;
        int C02 = placeable3 != null ? placeable3.C0() : 0;
        int e2 = RangesKt.e(((min - L0) - L02) - (L02 == 0 ? measureScope2.P1(SnackbarKt.f11182g) : 0), Constraints.n(j2));
        String str3 = this.f11186c;
        int size3 = collection.size();
        int i8 = 0;
        while (i8 < size3) {
            Measurable measurable3 = (Measurable) list2.get(i8);
            if (Intrinsics.d(LayoutIdKt.a(measurable3), str3)) {
                Placeable placeable4 = c0;
                int i9 = C02;
                Placeable c02 = measurable3.c0(Constraints.d(j2, 0, e2, 0, 0, 9, (Object) null));
                int f0 = c02.f0(AlignmentLineKt.a());
                int f02 = c02.f0(AlignmentLineKt.b());
                boolean z2 = true;
                boolean z3 = (f0 == Integer.MIN_VALUE || f02 == Integer.MIN_VALUE) ? false : true;
                if (f0 != f02 && z3) {
                    z2 = false;
                }
                int i10 = min - L02;
                int i11 = i10 - L0;
                if (z2) {
                    i4 = Math.max(measureScope2.P1(SnackbarTokens.f14050a.g()), Math.max(C0, i9));
                    int C03 = (i4 - c02.C0()) / 2;
                    if (placeable4 != null) {
                        placeable2 = placeable4;
                        int f03 = placeable2.f0(AlignmentLineKt.a());
                        if (f03 != Integer.MIN_VALUE) {
                            i5 = (f0 + C03) - f03;
                            i2 = i5;
                            i3 = C03;
                        }
                    } else {
                        placeable2 = placeable4;
                    }
                    i5 = 0;
                    i2 = i5;
                    i3 = C03;
                } else {
                    placeable2 = placeable4;
                    int P1 = measureScope2.P1(SnackbarKt.f11177b) - f0;
                    int max = Math.max(measureScope2.P1(SnackbarTokens.f14050a.j()), c02.C0() + P1);
                    i3 = P1;
                    i2 = placeable2 != null ? (max - placeable2.C0()) / 2 : 0;
                    i4 = max;
                }
                return MeasureScope.R1(measureScope, min, i4, (Map) null, new G6(c02, i3, placeable3, i10, placeable3 != null ? (i4 - placeable3.C0()) / 2 : 0, placeable2, i11, i2), 4, (Object) null);
            }
            Placeable placeable5 = c0;
            int i12 = C02;
            Placeable placeable6 = placeable5;
            i8++;
            int i13 = i12;
            c0 = placeable6;
            C02 = i13;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
