package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
public final class RowColumnMeasurePolicyKt {
    public static final MeasureResult a(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i2, int i3, int i4, int i5, int i6, MeasureScope measureScope, List list, Placeable[] placeableArr, int i7, int i8, int[] iArr, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f2;
        int i15;
        FlowLayoutData c2;
        int i16;
        int i17;
        int[] iArr2;
        int i18;
        FlowLayoutData c3;
        RowColumnMeasurePolicy rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
        int i19 = i4;
        int i20 = i5;
        int i21 = i6;
        List list2 = list;
        int i22 = i8;
        long j2 = (long) i21;
        int i23 = i22 - i7;
        int[] iArr3 = new int[i23];
        int i24 = i7;
        float f3 = 0.0f;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z2 = false;
        int i28 = 0;
        while (true) {
            Integer num = null;
            if (i24 >= i22) {
                break;
            }
            Measurable measurable = (Measurable) list2.get(i24);
            RowColumnParentData c4 = RowColumnImplKt.c(measurable);
            float e2 = RowColumnImplKt.e(c4);
            z2 = z2 || RowColumnImplKt.f(c4);
            if (e2 > 0.0f) {
                f3 += e2;
                i27++;
                i17 = i24;
                i16 = i23;
            } else {
                if (!(i20 == Integer.MAX_VALUE || c4 == null || (c3 = c4.c()) == null)) {
                    num = Integer.valueOf(Math.round(c3.a() * ((float) i20)));
                }
                int i29 = i19 - i28;
                Placeable placeable = placeableArr[i24];
                if (placeable == null) {
                    i17 = i24;
                    i18 = i26;
                    iArr2 = iArr3;
                    i16 = i23;
                    placeable = measurable.c0(RowColumnMeasurePolicy.l(rowColumnMeasurePolicy, 0, num != null ? num.intValue() : 0, i19 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i29 < 0 ? 0 : i29, num != null ? num.intValue() : i20, false, 16, (Object) null));
                } else {
                    i18 = i26;
                    i17 = i24;
                    iArr2 = iArr3;
                    i16 = i23;
                }
                int g2 = rowColumnMeasurePolicy2.g(placeable);
                int j3 = rowColumnMeasurePolicy2.j(placeable);
                iArr3 = iArr2;
                iArr3[i17 - i7] = g2;
                int i30 = i29 - g2;
                if (i30 < 0) {
                    i30 = 0;
                }
                int min = Math.min(i21, i30);
                i28 += g2 + min;
                int max = Math.max(i18, j3);
                placeableArr[i17] = placeable;
                i25 = min;
                i26 = max;
            }
            i24 = i17 + 1;
            i23 = i16;
        }
        int i31 = i26;
        int i32 = i23;
        if (i27 == 0) {
            i28 -= i25;
            i12 = i31;
            i11 = 0;
            i10 = 0;
        } else {
            long j4 = j2 * ((long) (i27 - 1));
            long j5 = ((long) ((i19 != Integer.MAX_VALUE ? i19 : i2) - i28)) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f4 = ((float) j5) / f3;
            for (int i33 = i7; i33 < i22; i33++) {
                j5 -= (long) Math.round(RowColumnImplKt.e(RowColumnImplKt.c((Measurable) list2.get(i33))) * f4);
            }
            int i34 = i7;
            int i35 = 0;
            while (i34 < i22) {
                if (placeableArr[i34] == null) {
                    Measurable measurable2 = (Measurable) list2.get(i34);
                    RowColumnParentData c5 = RowColumnImplKt.c(measurable2);
                    float e3 = RowColumnImplKt.e(c5);
                    Integer valueOf = (i20 == Integer.MAX_VALUE || c5 == null || (c2 = c5.c()) == null) ? null : Integer.valueOf(Math.round(c2.a() * ((float) i20)));
                    if (!(e3 > 0.0f)) {
                        InlineClassHelperKt.b("All weights <= 0 should have placeables");
                    }
                    Measurable measurable3 = measurable2;
                    int b2 = MathKt.b(j5);
                    int i36 = i34;
                    int i37 = i35;
                    long j6 = j5 - ((long) b2);
                    int max2 = Math.max(0, Math.round(e3 * f4) + b2);
                    int i38 = (!RowColumnImplKt.b(c5) || max2 == Integer.MAX_VALUE) ? 0 : max2;
                    i15 = i36;
                    f2 = f4;
                    Placeable c0 = measurable3.c0(rowColumnMeasurePolicy.e(i38, valueOf != null ? valueOf.intValue() : 0, max2, valueOf != null ? valueOf.intValue() : i20, true));
                    int g3 = rowColumnMeasurePolicy2.g(c0);
                    int j7 = rowColumnMeasurePolicy2.j(c0);
                    iArr3[i15 - i7] = g3;
                    i35 = i37 + g3;
                    int max3 = Math.max(i31, j7);
                    placeableArr[i15] = c0;
                    i31 = max3;
                    j5 = j6;
                } else {
                    i15 = i34;
                    int i39 = i31;
                    f2 = f4;
                    int i40 = i35;
                }
                i34 = i15 + 1;
                f4 = f2;
            }
            int i41 = i31;
            i10 = 0;
            i11 = (int) (((long) i35) + j4);
            int i42 = i19 - i28;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 > i42) {
                i11 = i42;
            }
            i12 = i41;
        }
        if (z2) {
            int i43 = i10;
            i14 = i43;
            for (int i44 = i7; i44 < i22; i44++) {
                Placeable placeable2 = placeableArr[i44];
                Intrinsics.f(placeable2);
                CrossAxisAlignment a2 = RowColumnImplKt.a(RowColumnImplKt.d(placeable2));
                Integer b3 = a2 != null ? a2.b(placeable2) : null;
                if (b3 != null) {
                    int intValue = b3.intValue();
                    int j8 = rowColumnMeasurePolicy2.j(placeable2);
                    i43 = Math.max(i43, intValue != Integer.MIN_VALUE ? b3.intValue() : i10);
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = j8;
                    }
                    i14 = Math.max(i14, j8 - intValue);
                }
            }
            i13 = i43;
        } else {
            i14 = i10;
            i13 = i14;
        }
        int i45 = i28 + i11;
        int i46 = i2;
        if (i45 < 0) {
            i45 = i10;
        }
        int max4 = Math.max(i45, i46);
        int max5 = Math.max(i12, Math.max(i3, i14 + i13));
        int[] iArr4 = new int[i32];
        MeasureScope measureScope2 = measureScope;
        rowColumnMeasurePolicy2.a(max4, iArr3, iArr4, measureScope2);
        return rowColumnMeasurePolicy.d(placeableArr, measureScope2, i13, iArr4, max4, max5, iArr, i9, i7, i8);
    }

    public static /* synthetic */ MeasureResult b(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i2, int i3, int i4, int i5, int i6, MeasureScope measureScope, List list, Placeable[] placeableArr, int i7, int i8, int[] iArr, int i9, int i10, Object obj) {
        int i11 = i10;
        return a(rowColumnMeasurePolicy, i2, i3, i4, i5, i6, measureScope, list, placeableArr, i7, i8, (i11 & 1024) != 0 ? null : iArr, (i11 & 2048) != 0 ? 0 : i9);
    }
}
