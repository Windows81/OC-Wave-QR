package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata
public final class PagerMeasureKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.compose.foundation.pager.MeasuredPage} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.pager.MeasuredPage b(int r15, java.util.List r16, int r17, int r18, int r19, androidx.compose.foundation.gestures.snapping.SnapPosition r20, int r21) {
        /*
            r0 = r16
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x000a
            r0 = 0
            goto L_0x0066
        L_0x000a:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            r2 = r1
            androidx.compose.foundation.pager.MeasuredPage r2 = (androidx.compose.foundation.pager.MeasuredPage) r2
            int r7 = r2.f()
            int r8 = r2.getIndex()
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r9 = r20
            r10 = r21
            float r2 = androidx.compose.foundation.gestures.snapping.SnapPositionKt.a(r3, r4, r5, r6, r7, r8, r9, r10)
            float r2 = java.lang.Math.abs(r2)
            float r2 = -r2
            int r3 = kotlin.collections.CollectionsKt.o(r16)
            r4 = 1
            if (r4 > r3) goto L_0x0065
        L_0x0035:
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            androidx.compose.foundation.pager.MeasuredPage r6 = (androidx.compose.foundation.pager.MeasuredPage) r6
            int r11 = r6.f()
            int r12 = r6.getIndex()
            r7 = r15
            r8 = r17
            r9 = r18
            r10 = r19
            r13 = r20
            r14 = r21
            float r6 = androidx.compose.foundation.gestures.snapping.SnapPositionKt.a(r7, r8, r9, r10, r11, r12, r13, r14)
            float r6 = java.lang.Math.abs(r6)
            float r6 = -r6
            int r7 = java.lang.Float.compare(r2, r6)
            if (r7 >= 0) goto L_0x0060
            r1 = r5
            r2 = r6
        L_0x0060:
            if (r4 == r3) goto L_0x0065
            int r4 = r4 + 1
            goto L_0x0035
        L_0x0065:
            r0 = r1
        L_0x0066:
            androidx.compose.foundation.pager.MeasuredPage r0 = (androidx.compose.foundation.pager.MeasuredPage) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerMeasureKt.b(int, java.util.List, int, int, int, androidx.compose.foundation.gestures.snapping.SnapPosition, int):androidx.compose.foundation.pager.MeasuredPage");
    }

    public static final List c(LazyLayoutMeasureScope lazyLayoutMeasureScope, List list, List list2, List list3, int i2, int i3, int i4, int i5, int i6, Orientation orientation, boolean z2, Density density, int i7, int i8) {
        int i9;
        int i10;
        ArrayList arrayList;
        int i11;
        List list4 = list;
        List list5 = list2;
        List list6 = list3;
        int i12 = i2;
        int i13 = i3;
        int i14 = i6;
        Orientation orientation2 = orientation;
        boolean z3 = z2;
        int i15 = i7;
        int i16 = i8 + i15;
        if (orientation2 == Orientation.Vertical) {
            i10 = i5;
            i9 = i13;
        } else {
            i10 = i5;
            i9 = i12;
        }
        int i17 = 0;
        boolean z4 = true;
        boolean z5 = i4 < Math.min(i9, i10);
        if (z5) {
            if (!(i14 == 0)) {
                InlineClassHelperKt.c("non-zero pagesScrollOffset=" + i14);
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size() + list2.size() + list3.size());
        if (z5) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z4 = false;
            }
            if (!z4) {
                InlineClassHelperKt.a("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i17 < size) {
                iArr[i17] = i8;
                i17++;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical c2 = Arrangement.Absolute.f3748a.c(lazyLayoutMeasureScope.D(i15));
            if (orientation2 == Orientation.Vertical) {
                c2.b(density, i9, iArr, iArr2);
                arrayList = arrayList2;
                i11 = i9;
            } else {
                Density density2 = density;
                arrayList = arrayList2;
                i11 = i9;
                c2.c(density, i9, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntProgression h0 = ArraysKt.h0(iArr2);
            if (z3) {
                h0 = RangesKt.t(h0);
            }
            int n2 = h0.n();
            int o2 = h0.o();
            int p2 = h0.p();
            if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
                while (true) {
                    int i18 = iArr2[n2];
                    MeasuredPage measuredPage = (MeasuredPage) list4.get(d(n2, z3, size));
                    if (z3) {
                        i18 = (i11 - i18) - measuredPage.g();
                    }
                    measuredPage.i(i18, i12, i13);
                    arrayList.add(measuredPage);
                    if (n2 == o2) {
                        break;
                    }
                    n2 += p2;
                }
            }
        } else {
            arrayList = arrayList2;
            int size2 = list5.size();
            int i19 = i14;
            for (int i20 = 0; i20 < size2; i20++) {
                MeasuredPage measuredPage2 = (MeasuredPage) list5.get(i20);
                i19 -= i16;
                measuredPage2.i(i19, i12, i13);
                arrayList.add(measuredPage2);
            }
            int size3 = list4.size();
            for (int i21 = 0; i21 < size3; i21++) {
                MeasuredPage measuredPage3 = (MeasuredPage) list4.get(i21);
                measuredPage3.i(i14, i12, i13);
                arrayList.add(measuredPage3);
                i14 += i16;
            }
            int size4 = list6.size();
            while (i17 < size4) {
                MeasuredPage measuredPage4 = (MeasuredPage) list6.get(i17);
                measuredPage4.i(i14, i12, i13);
                arrayList.add(measuredPage4);
                i14 += i16;
                i17++;
            }
        }
        return arrayList;
    }

    public static final int d(int i2, boolean z2, int i3) {
        return !z2 ? i2 : (i3 - i2) - 1;
    }

    public static final List e(int i2, int i3, int i4, List list, Function1 function1) {
        int min = Math.min(i4 + i2, i3 - 1);
        int i5 = i2 + 1;
        ArrayList arrayList = null;
        if (i5 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i5)));
                if (i5 == min) {
                    break;
                }
                i5++;
            }
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            int intValue = ((Number) list.get(i6)).intValue();
            if (min + 1 <= intValue && intValue < i3) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? CollectionsKt.m() : arrayList;
    }

    public static final List f(int i2, int i3, List list, Function1 function1) {
        int max = Math.max(0, i2 - i3);
        int i4 = i2 - 1;
        ArrayList arrayList = null;
        if (max <= i4) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i4)));
                if (i4 == max) {
                    break;
                }
                i4--;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Number) list.get(i5)).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? CollectionsKt.m() : arrayList;
    }

    public static final MeasuredPage g(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i3) {
        return new MeasuredPage(i2, i3, lazyLayoutMeasureScope.k1(i2, j2), j3, pagerLazyLayoutItemProvider.c(i2), orientation, horizontal, vertical, layoutDirection, z2, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.pager.PagerMeasureResult h(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope r32, int r33, androidx.compose.foundation.pager.PagerLazyLayoutItemProvider r34, int r35, int r36, int r37, int r38, int r39, int r40, long r41, androidx.compose.foundation.gestures.Orientation r43, androidx.compose.ui.Alignment.Vertical r44, androidx.compose.ui.Alignment.Horizontal r45, boolean r46, long r47, int r49, int r50, java.util.List r51, androidx.compose.foundation.gestures.snapping.SnapPosition r52, androidx.compose.runtime.MutableState r53, kotlinx.coroutines.CoroutineScope r54, kotlin.jvm.functions.Function3 r55) {
        /*
            r7 = r33
            r6 = r35
            r5 = r36
            r0 = r41
            r4 = r43
            r3 = r50
            r2 = r51
            r15 = r55
            r22 = 1
            r13 = 0
            if (r5 < 0) goto L_0x0018
            r8 = r22
            goto L_0x0019
        L_0x0018:
            r8 = r13
        L_0x0019:
            if (r8 != 0) goto L_0x0020
            java.lang.String r8 = "negative beforeContentPadding"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r8)
        L_0x0020:
            if (r37 < 0) goto L_0x0025
            r8 = r22
            goto L_0x0026
        L_0x0025:
            r8 = r13
        L_0x0026:
            if (r8 != 0) goto L_0x002d
            java.lang.String r8 = "negative afterContentPadding"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r8)
        L_0x002d:
            int r8 = r49 + r38
            int r14 = kotlin.ranges.RangesKt.e(r8, r13)
            if (r7 > 0) goto L_0x0080
            java.util.List r8 = kotlin.collections.CollectionsKt.m()
            int r13 = -r5
            int r14 = r6 + r37
            int r2 = androidx.compose.ui.unit.Constraints.n(r41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = androidx.compose.ui.unit.Constraints.m(r41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4 r1 = androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4.f5307z
            java.lang.Object r0 = r15.d(r2, r0, r1)
            r23 = r0
            androidx.compose.ui.layout.MeasureResult r23 = (androidx.compose.ui.layout.MeasureResult) r23
            androidx.compose.foundation.pager.PagerMeasureResult r0 = new androidx.compose.foundation.pager.PagerMeasureResult
            r7 = r0
            r28 = 393216(0x60000, float:5.51013E-40)
            r29 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r9 = r49
            r10 = r38
            r11 = r37
            r12 = r43
            r16 = r50
            r22 = r52
            r27 = r54
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        L_0x0080:
            androidx.compose.foundation.gestures.Orientation r8 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r4 != r8) goto L_0x008b
            int r9 = androidx.compose.ui.unit.Constraints.l(r41)
            r17 = r9
            goto L_0x008d
        L_0x008b:
            r17 = r49
        L_0x008d:
            if (r4 == r8) goto L_0x0096
            int r8 = androidx.compose.ui.unit.Constraints.k(r41)
            r19 = r8
            goto L_0x0098
        L_0x0096:
            r19 = r49
        L_0x0098:
            r20 = 5
            r21 = 0
            r16 = 0
            r18 = 0
            long r23 = androidx.compose.ui.unit.ConstraintsKt.b(r16, r17, r18, r19, r20, r21)
            r8 = r39
            r9 = r40
        L_0x00a8:
            if (r8 <= 0) goto L_0x00b0
            if (r9 <= 0) goto L_0x00b0
            int r8 = r8 + -1
            int r9 = r9 - r14
            goto L_0x00a8
        L_0x00b0:
            int r9 = r9 * -1
            if (r8 < r7) goto L_0x00b7
            int r8 = r7 + -1
            r9 = r13
        L_0x00b7:
            kotlin.collections.ArrayDeque r12 = new kotlin.collections.ArrayDeque
            r12.<init>()
            int r10 = -r5
            if (r38 >= 0) goto L_0x00c2
            r11 = r38
            goto L_0x00c3
        L_0x00c2:
            r11 = r13
        L_0x00c3:
            int r11 = r11 + r10
            int r9 = r9 + r11
            r0 = r13
        L_0x00c6:
            if (r9 >= 0) goto L_0x0111
            if (r8 <= 0) goto L_0x0111
            int r1 = r8 + -1
            androidx.compose.ui.unit.LayoutDirection r18 = r32.getLayoutDirection()
            r8 = r32
            r4 = r9
            r9 = r1
            r39 = r1
            r25 = r10
            r1 = r11
            r10 = r23
            r2 = r12
            r12 = r34
            r3 = r13
            r30 = r14
            r13 = r47
            r15 = r43
            r16 = r45
            r17 = r44
            r19 = r46
            r20 = r49
            androidx.compose.foundation.pager.MeasuredPage r8 = g(r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20)
            r2.add(r3, r8)
            int r8 = r8.b()
            int r0 = java.lang.Math.max(r0, r8)
            r15 = r30
            int r9 = r4 + r15
            r8 = r39
            r4 = r43
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r15
            r10 = r25
            r3 = r50
            r2 = r51
            r15 = r55
            goto L_0x00c6
        L_0x0111:
            r4 = r9
            r25 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r15 = r14
            if (r4 >= r1) goto L_0x011c
            r11 = r1
            goto L_0x011d
        L_0x011c:
            r11 = r4
        L_0x011d:
            int r11 = r11 - r1
            int r4 = r6 + r37
            int r13 = kotlin.ranges.RangesKt.e(r4, r3)
            int r9 = -r11
            r10 = r3
            r12 = r10
            r14 = r8
        L_0x0128:
            int r3 = r2.size()
            if (r10 >= r3) goto L_0x013c
            if (r9 < r13) goto L_0x0136
            r2.remove(r10)
            r12 = r22
            goto L_0x0128
        L_0x0136:
            int r14 = r14 + 1
            int r9 = r9 + r15
            int r10 = r10 + 1
            goto L_0x0128
        L_0x013c:
            r3 = r8
            r26 = r11
            r27 = r12
            r12 = r14
            r14 = r9
        L_0x0143:
            if (r12 >= r7) goto L_0x0150
            if (r14 < r13) goto L_0x0158
            if (r14 <= 0) goto L_0x0158
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L_0x0150
            goto L_0x0158
        L_0x0150:
            r40 = r3
            r39 = r4
            r4 = r12
            r3 = r14
            r5 = r15
            goto L_0x01a8
        L_0x0158:
            androidx.compose.ui.unit.LayoutDirection r18 = r32.getLayoutDirection()
            r8 = r32
            r9 = r12
            r10 = r23
            r39 = r4
            r4 = r12
            r12 = r34
            r40 = r3
            r28 = r13
            r3 = r14
            r13 = r47
            r5 = r15
            r15 = r43
            r16 = r45
            r17 = r44
            r19 = r46
            r20 = r49
            androidx.compose.foundation.pager.MeasuredPage r8 = g(r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20)
            int r9 = r7 + -1
            if (r4 != r9) goto L_0x0183
            r14 = r49
            goto L_0x0184
        L_0x0183:
            r14 = r5
        L_0x0184:
            int r14 = r14 + r3
            if (r14 > r1) goto L_0x0191
            if (r4 == r9) goto L_0x0191
            int r12 = r4 + 1
            int r26 = r26 - r5
            r3 = r12
            r27 = r22
            goto L_0x019e
        L_0x0191:
            int r3 = r8.b()
            int r0 = java.lang.Math.max(r0, r3)
            r2.add(r8)
            r3 = r40
        L_0x019e:
            int r12 = r4 + 1
            r4 = r39
            r15 = r5
            r13 = r28
            r5 = r36
            goto L_0x0143
        L_0x01a8:
            if (r3 >= r6) goto L_0x01fb
            int r1 = r6 - r3
            int r26 = r26 - r1
            int r1 = r1 + r3
            r15 = r36
            r3 = r40
            r13 = r5
            r5 = r26
        L_0x01b6:
            if (r5 >= r15) goto L_0x01ed
            if (r3 <= 0) goto L_0x01ed
            int r3 = r3 + -1
            androidx.compose.ui.unit.LayoutDirection r18 = r32.getLayoutDirection()
            r8 = r32
            r9 = r3
            r10 = r23
            r12 = r34
            r28 = r4
            r4 = r13
            r13 = r47
            r15 = r43
            r16 = r45
            r17 = r44
            r19 = r46
            r20 = r49
            androidx.compose.foundation.pager.MeasuredPage r8 = g(r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20)
            r15 = 0
            r2.add(r15, r8)
            int r8 = r8.b()
            int r0 = java.lang.Math.max(r0, r8)
            int r5 = r5 + r4
            r15 = r36
            r13 = r4
            r4 = r28
            goto L_0x01b6
        L_0x01ed:
            r28 = r4
            r4 = r13
            r15 = 0
            if (r5 >= 0) goto L_0x01f8
            int r14 = r1 + r5
            r5 = r14
            r13 = r15
            goto L_0x0204
        L_0x01f8:
            r13 = r5
            r5 = r1
            goto L_0x0204
        L_0x01fb:
            r28 = r4
            r4 = r5
            r15 = 0
            r5 = r3
            r13 = r26
            r3 = r40
        L_0x0204:
            if (r13 < 0) goto L_0x0209
            r1 = r22
            goto L_0x020a
        L_0x0209:
            r1 = r15
        L_0x020a:
            if (r1 != 0) goto L_0x0211
            java.lang.String r1 = "invalid currentFirstPageScrollOffset"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r1)
        L_0x0211:
            int r1 = -r13
            java.lang.Object r8 = r2.first()
            androidx.compose.foundation.pager.MeasuredPage r8 = (androidx.compose.foundation.pager.MeasuredPage) r8
            if (r36 > 0) goto L_0x0221
            if (r38 >= 0) goto L_0x021d
            goto L_0x0221
        L_0x021d:
            r26 = r13
            r13 = r8
            goto L_0x0240
        L_0x0221:
            int r9 = r2.size()
            r10 = r13
            r13 = r15
        L_0x0227:
            if (r13 >= r9) goto L_0x023d
            if (r10 == 0) goto L_0x023d
            if (r4 > r10) goto L_0x023d
            int r11 = kotlin.collections.CollectionsKt.o(r2)
            if (r13 == r11) goto L_0x023d
            int r10 = r10 - r4
            int r13 = r13 + 1
            java.lang.Object r8 = r2.get(r13)
            androidx.compose.foundation.pager.MeasuredPage r8 = (androidx.compose.foundation.pager.MeasuredPage) r8
            goto L_0x0227
        L_0x023d:
            r13 = r8
            r26 = r10
        L_0x0240:
            androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1 r14 = new androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            r8 = r14
            r9 = r32
            r10 = r23
            r12 = r34
            r40 = r0
            r30 = r4
            r4 = r13
            r0 = r14
            r13 = r47
            r20 = r15
            r15 = r43
            r16 = r45
            r17 = r44
            r18 = r46
            r19 = r49
            r8.<init>(r9, r10, r12, r13, r15, r16, r17, r18, r19)
            r15 = r51
            r31 = r2
            r29 = r20
            r2 = r50
            java.util.List r0 = f(r3, r2, r15, r0)
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r13 = r40
            r8 = r29
        L_0x0277:
            if (r8 >= r3) goto L_0x028a
            java.lang.Object r9 = r0.get(r8)
            androidx.compose.foundation.pager.MeasuredPage r9 = (androidx.compose.foundation.pager.MeasuredPage) r9
            int r9 = r9.b()
            int r13 = java.lang.Math.max(r13, r9)
            int r8 = r8 + 1
            goto L_0x0277
        L_0x028a:
            java.lang.Object r3 = r31.last()
            androidx.compose.foundation.pager.MeasuredPage r3 = (androidx.compose.foundation.pager.MeasuredPage) r3
            int r3 = r3.getIndex()
            androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1 r14 = new androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            r8 = r14
            r9 = r32
            r10 = r23
            r12 = r34
            r20 = r13
            r6 = r14
            r13 = r47
            r21 = r1
            r1 = r15
            r15 = r43
            r16 = r45
            r17 = r44
            r18 = r46
            r19 = r49
            r8.<init>(r9, r10, r12, r13, r15, r16, r17, r18, r19)
            java.util.List r1 = e(r3, r7, r2, r1, r6)
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r6 = r20
            r13 = r29
        L_0x02c1:
            if (r13 >= r3) goto L_0x02d4
            java.lang.Object r8 = r1.get(r13)
            androidx.compose.foundation.pager.MeasuredPage r8 = (androidx.compose.foundation.pager.MeasuredPage) r8
            int r8 = r8.b()
            int r6 = java.lang.Math.max(r6, r8)
            int r13 = r13 + 1
            goto L_0x02c1
        L_0x02d4:
            java.lang.Object r3 = r31.first()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r4, r3)
            if (r3 == 0) goto L_0x02ed
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x02ed
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x02ed
            r3 = r22
            goto L_0x02ef
        L_0x02ed:
            r3 = r29
        L_0x02ef:
            androidx.compose.foundation.gestures.Orientation r8 = androidx.compose.foundation.gestures.Orientation.Vertical
            r15 = r43
            r9 = r41
            if (r15 != r8) goto L_0x02f9
            r11 = r6
            goto L_0x02fa
        L_0x02f9:
            r11 = r5
        L_0x02fa:
            int r23 = androidx.compose.ui.unit.ConstraintsKt.g(r9, r11)
            if (r15 != r8) goto L_0x0301
            r6 = r5
        L_0x0301:
            int r24 = androidx.compose.ui.unit.ConstraintsKt.f(r9, r6)
            r8 = r32
            r9 = r31
            r10 = r0
            r11 = r1
            r12 = r23
            r13 = r24
            r14 = r5
            r15 = r35
            r16 = r21
            r17 = r43
            r18 = r46
            r19 = r32
            r20 = r38
            r21 = r49
            java.util.List r8 = c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r3 == 0) goto L_0x0326
            r9 = r8
            goto L_0x0368
        L_0x0326:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = r8.size()
            r3.<init>(r6)
            r6 = r8
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r13 = r29
        L_0x0338:
            if (r13 >= r6) goto L_0x0367
            java.lang.Object r9 = r8.get(r13)
            r10 = r9
            androidx.compose.foundation.pager.MeasuredPage r10 = (androidx.compose.foundation.pager.MeasuredPage) r10
            int r11 = r10.getIndex()
            java.lang.Object r12 = r31.first()
            androidx.compose.foundation.pager.MeasuredPage r12 = (androidx.compose.foundation.pager.MeasuredPage) r12
            int r12 = r12.getIndex()
            if (r11 < r12) goto L_0x0364
            int r10 = r10.getIndex()
            java.lang.Object r11 = r31.last()
            androidx.compose.foundation.pager.MeasuredPage r11 = (androidx.compose.foundation.pager.MeasuredPage) r11
            int r11 = r11.getIndex()
            if (r10 > r11) goto L_0x0364
            r3.add(r9)
        L_0x0364:
            int r13 = r13 + 1
            goto L_0x0338
        L_0x0367:
            r9 = r3
        L_0x0368:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0375
            java.util.List r0 = kotlin.collections.CollectionsKt.m()
        L_0x0372:
            r18 = r0
            goto L_0x03a6
        L_0x0375:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r8.size()
            r0.<init>(r3)
            r3 = r8
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r13 = r29
        L_0x0387:
            if (r13 >= r3) goto L_0x0372
            java.lang.Object r6 = r8.get(r13)
            r10 = r6
            androidx.compose.foundation.pager.MeasuredPage r10 = (androidx.compose.foundation.pager.MeasuredPage) r10
            int r10 = r10.getIndex()
            java.lang.Object r11 = r31.first()
            androidx.compose.foundation.pager.MeasuredPage r11 = (androidx.compose.foundation.pager.MeasuredPage) r11
            int r11 = r11.getIndex()
            if (r10 >= r11) goto L_0x03a3
            r0.add(r6)
        L_0x03a3:
            int r13 = r13 + 1
            goto L_0x0387
        L_0x03a6:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x03b3
            java.util.List r0 = kotlin.collections.CollectionsKt.m()
        L_0x03b0:
            r19 = r0
            goto L_0x03e4
        L_0x03b3:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.size()
            r0.<init>(r1)
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r13 = r29
        L_0x03c5:
            if (r13 >= r1) goto L_0x03b0
            java.lang.Object r3 = r8.get(r13)
            r6 = r3
            androidx.compose.foundation.pager.MeasuredPage r6 = (androidx.compose.foundation.pager.MeasuredPage) r6
            int r6 = r6.getIndex()
            java.lang.Object r10 = r31.last()
            androidx.compose.foundation.pager.MeasuredPage r10 = (androidx.compose.foundation.pager.MeasuredPage) r10
            int r10 = r10.getIndex()
            if (r6 <= r10) goto L_0x03e1
            r0.add(r3)
        L_0x03e1:
            int r13 = r13 + 1
            goto L_0x03c5
        L_0x03e4:
            int r0 = r35 + r36
            int r10 = r0 + r37
            r0 = r10
            r1 = r9
            r2 = r36
            r3 = r37
            r12 = r39
            r13 = r4
            r14 = r28
            r11 = r30
            r4 = r11
            r15 = r5
            r5 = r52
            r32 = r13
            r13 = r35
            r6 = r33
            androidx.compose.foundation.pager.MeasuredPage r16 = b(r0, r1, r2, r3, r4, r5, r6)
            if (r16 == 0) goto L_0x040b
            int r0 = r16.getIndex()
            r5 = r0
            goto L_0x040d
        L_0x040b:
            r5 = r29
        L_0x040d:
            r0 = r52
            r1 = r10
            r2 = r49
            r3 = r36
            r4 = r37
            r6 = r33
            int r0 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r16 == 0) goto L_0x0423
            int r1 = r16.f()
            goto L_0x0425
        L_0x0423:
            r1 = r29
        L_0x0425:
            if (r11 != 0) goto L_0x042b
            r0 = 0
        L_0x0428:
            r17 = r0
            goto L_0x0438
        L_0x042b:
            int r0 = r0 - r1
            float r0 = (float) r0
            float r1 = (float) r11
            float r0 = r0 / r1
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = kotlin.ranges.RangesKt.n(r0, r1, r2)
            goto L_0x0428
        L_0x0438:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14 r2 = new androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
            r3 = r53
            r2.<init>(r3, r8)
            r3 = r55
            java.lang.Object r0 = r3.d(r0, r1, r2)
            r20 = r0
            androidx.compose.ui.layout.MeasureResult r20 = (androidx.compose.ui.layout.MeasureResult) r20
            if (r14 < r7) goto L_0x0459
            if (r15 <= r13) goto L_0x0456
            goto L_0x0459
        L_0x0456:
            r14 = r29
            goto L_0x045b
        L_0x0459:
            r14 = r22
        L_0x045b:
            androidx.compose.foundation.pager.PagerMeasureResult r21 = new androidx.compose.foundation.pager.PagerMeasureResult
            r0 = r21
            r1 = r9
            r2 = r49
            r3 = r38
            r4 = r37
            r5 = r43
            r6 = r25
            r7 = r12
            r8 = r46
            r9 = r50
            r10 = r32
            r11 = r16
            r12 = r17
            r13 = r26
            r15 = r52
            r16 = r20
            r17 = r27
            r20 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerMeasureKt.h(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, int, androidx.compose.foundation.pager.PagerLazyLayoutItemProvider, int, int, int, int, int, int, long, androidx.compose.foundation.gestures.Orientation, androidx.compose.ui.Alignment$Vertical, androidx.compose.ui.Alignment$Horizontal, boolean, long, int, int, java.util.List, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.runtime.MutableState, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function3):androidx.compose.foundation.pager.PagerMeasureResult");
    }
}
