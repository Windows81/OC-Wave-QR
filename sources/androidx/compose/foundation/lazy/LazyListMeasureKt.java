package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyListMeasureKt {
    public static final List a(List list, List list2, List list3, int i2, int i3, int i4, int i5, int i6, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density) {
        List list4 = list;
        List list5 = list2;
        List list6 = list3;
        int i7 = i2;
        int i8 = i3;
        Arrangement.Vertical vertical2 = vertical;
        boolean z4 = z3;
        int i9 = i5;
        int i10 = z2 ? i8 : i7;
        int i11 = 0;
        boolean z5 = true;
        boolean z6 = i4 < Math.min(i10, i9);
        if (z6) {
            if (!(i6 == 0)) {
                InlineClassHelperKt.c("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z6) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z5 = false;
            }
            if (!z5) {
                InlineClassHelperKt.a("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i11 < size) {
                iArr[i11] = ((LazyListMeasuredItem) list.get(b(i11, z4, size))).e();
                i11++;
            }
            int[] iArr2 = new int[size];
            if (!z2) {
                Density density2 = density;
                if (horizontal != null) {
                    horizontal.c(density, i10, iArr, LayoutDirection.Ltr, iArr2);
                } else {
                    InlineClassHelperKt.b("null horizontalArrangement when isVertical == false");
                    throw new KotlinNothingValueException();
                }
            } else if (vertical2 != null) {
                vertical2.b(density, i10, iArr, iArr2);
            } else {
                InlineClassHelperKt.b("null verticalArrangement when isVertical == true");
                throw new KotlinNothingValueException();
            }
            IntProgression h0 = ArraysKt.h0(iArr2);
            if (z4) {
                h0 = RangesKt.t(h0);
            }
            int n2 = h0.n();
            int o2 = h0.o();
            int p2 = h0.p();
            if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
                while (true) {
                    int i12 = iArr2[n2];
                    LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) list.get(b(n2, z4, size));
                    if (z4) {
                        i12 = (i10 - i12) - lazyListMeasuredItem.e();
                    }
                    lazyListMeasuredItem.s(i12, i7, i8);
                    arrayList.add(lazyListMeasuredItem);
                    if (n2 == o2) {
                        break;
                    }
                    n2 += p2;
                }
            }
        } else {
            int size2 = list5.size();
            int i13 = i6;
            for (int i14 = 0; i14 < size2; i14++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) list2.get(i14);
                i13 -= lazyListMeasuredItem2.h();
                lazyListMeasuredItem2.s(i13, i7, i8);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list4.size();
            int i15 = i6;
            for (int i16 = 0; i16 < size3; i16++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) list.get(i16);
                lazyListMeasuredItem3.s(i15, i7, i8);
                arrayList.add(lazyListMeasuredItem3);
                i15 += lazyListMeasuredItem3.h();
            }
            int size4 = list6.size();
            while (i11 < size4) {
                LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) list6.get(i11);
                lazyListMeasuredItem4.s(i15, i7, i8);
                arrayList.add(lazyListMeasuredItem4);
                i15 += lazyListMeasuredItem4.h();
                i11++;
            }
        }
        return arrayList;
    }

    public static final int b(int i2, boolean z2, int i3) {
        return !z2 ? i2 : (i3 - i2) - 1;
    }

    public static final List c(List list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, List list2, float f2, boolean z2, LazyListLayoutInfo lazyListLayoutInfo) {
        ArrayList arrayList;
        LazyListItemInfo lazyListItemInfo;
        LazyListMeasuredItem lazyListMeasuredItem;
        int h2;
        Object obj;
        Object obj2;
        int index;
        int min;
        LazyListMeasuredItem lazyListMeasuredItem2;
        Object obj3;
        List list3 = list;
        int i4 = i2;
        List list4 = list2;
        int i5 = i4 - 1;
        int min2 = Math.min(((LazyListMeasuredItem) CollectionsKt.p0(list)).getIndex() + i3, i5);
        int index2 = ((LazyListMeasuredItem) CollectionsKt.p0(list)).getIndex() + 1;
        if (index2 <= min2) {
            ArrayList arrayList2 = null;
            while (true) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList = arrayList2;
                arrayList.add(LazyListMeasuredItemProvider.e(lazyListMeasuredItemProvider, index2, 0, 2, (Object) null));
                if (index2 == min2) {
                    break;
                }
                index2++;
                arrayList2 = arrayList;
            }
        } else {
            arrayList = null;
        }
        if (z2 && lazyListLayoutInfo != null && !lazyListLayoutInfo.k().isEmpty()) {
            List k2 = lazyListLayoutInfo.k();
            int size = k2.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyListItemInfo = null;
                    break;
                } else if (((LazyListItemInfo) k2.get(size)).getIndex() <= min2 || (size != 0 && ((LazyListItemInfo) k2.get(size - 1)).getIndex() > min2)) {
                }
            }
            lazyListItemInfo = (LazyListItemInfo) k2.get(size);
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.p0(lazyListLayoutInfo.k());
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (min = Math.min(lazyListItemInfo2.getIndex(), i5))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList.get(i6);
                            if (((LazyListMeasuredItem) obj3).getIndex() == index) {
                                break;
                            }
                            i6++;
                        }
                        lazyListMeasuredItem2 = (LazyListMeasuredItem) obj3;
                    } else {
                        lazyListMeasuredItem2 = null;
                    }
                    if (lazyListMeasuredItem2 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.e(lazyListMeasuredItemProvider, index, 0, 2, (Object) null));
                    }
                    if (index == min) {
                        break;
                    }
                    index++;
                }
            }
            float g2 = ((float) ((lazyListLayoutInfo.g() - lazyListItemInfo2.f()) - lazyListItemInfo2.e())) - f2;
            if (g2 > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i7 = 0;
                while (index3 < i4 && ((float) i7) < g2) {
                    if (index3 <= min2) {
                        int size3 = list3.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size3) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list3.get(i8);
                            if (((LazyListMeasuredItem) obj2).getIndex() == index3) {
                                break;
                            }
                            i8++;
                        }
                        lazyListMeasuredItem = (LazyListMeasuredItem) obj2;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                obj = null;
                                break;
                            }
                            obj = arrayList.get(i9);
                            if (((LazyListMeasuredItem) obj).getIndex() == index3) {
                                break;
                            }
                            i9++;
                        }
                        lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                    } else {
                        lazyListMeasuredItem = null;
                    }
                    if (lazyListMeasuredItem != null) {
                        index3++;
                        h2 = lazyListMeasuredItem.h();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.e(lazyListMeasuredItemProvider, index3, 0, 2, (Object) null));
                        index3++;
                        h2 = ((LazyListMeasuredItem) CollectionsKt.p0(arrayList)).h();
                    }
                    i7 += h2;
                }
            }
        }
        if (arrayList != null && ((LazyListMeasuredItem) CollectionsKt.p0(arrayList)).getIndex() > min2) {
            min2 = ((LazyListMeasuredItem) CollectionsKt.p0(arrayList)).getIndex();
        }
        int size5 = list4.size();
        for (int i10 = 0; i10 < size5; i10++) {
            int intValue = ((Number) list4.get(i10)).intValue();
            if (intValue > min2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.e(lazyListMeasuredItemProvider, intValue, 0, 2, (Object) null));
            }
        }
        return arrayList == null ? CollectionsKt.m() : arrayList;
    }

    public static final List d(int i2, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i3, List list) {
        int max = Math.max(0, i2 - i3);
        int i4 = i2 - 1;
        ArrayList arrayList = null;
        if (max <= i4) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.e(lazyListMeasuredItemProvider, i4, 0, 2, (Object) null));
                if (i4 == max) {
                    break;
                }
                i4--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = size - 1;
                int intValue = ((Number) list.get(size)).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.e(lazyListMeasuredItemProvider, intValue, 0, 2, (Object) null));
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        return arrayList == null ? CollectionsKt.m() : arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult e(int r35, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r36, int r37, int r38, int r39, int r40, int r41, int r42, float r43, long r44, boolean r46, androidx.compose.foundation.layout.Arrangement.Vertical r47, androidx.compose.foundation.layout.Arrangement.Horizontal r48, boolean r49, androidx.compose.ui.unit.Density r50, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r51, int r52, java.util.List r53, boolean r54, boolean r55, androidx.compose.foundation.lazy.LazyListLayoutInfo r56, kotlinx.coroutines.CoroutineScope r57, androidx.compose.runtime.MutableState r58, androidx.compose.ui.graphics.GraphicsContext r59, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r60, kotlin.jvm.functions.Function3 r61) {
        /*
            r15 = r35
            r16 = 1
            r14 = 0
            if (r38 < 0) goto L_0x000a
            r0 = r16
            goto L_0x000b
        L_0x000a:
            r0 = r14
        L_0x000b:
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "invalid beforeContentPadding"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r0)
        L_0x0012:
            if (r39 < 0) goto L_0x0017
            r0 = r16
            goto L_0x0018
        L_0x0017:
            r0 = r14
        L_0x0018:
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "invalid afterContentPadding"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r0)
        L_0x001f:
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r19 = 32
            if (r15 > 0) goto L_0x00bf
            int r15 = androidx.compose.ui.unit.Constraints.n(r44)
            int r16 = androidx.compose.ui.unit.Constraints.m(r44)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r5 = r36.h()
            r11 = 0
            r12 = 0
            r1 = 0
            r9 = 1
            r0 = r51
            r2 = r15
            r3 = r16
            r6 = r36
            r7 = r46
            r8 = r55
            r10 = r54
            r13 = r57
            r35 = r15
            r15 = r55
            r14 = r59
            r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r15 != 0) goto L_0x0078
            long r0 = r51.i()
            androidx.compose.ui.unit.IntSize$Companion r2 = androidx.compose.ui.unit.IntSize.f19170b
            long r2 = r2.a()
            boolean r2 = androidx.compose.ui.unit.IntSize.e(r0, r2)
            if (r2 != 0) goto L_0x0078
            long r2 = r0 >> r19
            int r2 = (int) r2
            r12 = r44
            int r15 = androidx.compose.ui.unit.ConstraintsKt.g(r12, r2)
            long r0 = r0 & r17
            int r0 = (int) r0
            int r16 = androidx.compose.ui.unit.ConstraintsKt.f(r12, r0)
            goto L_0x007a
        L_0x0078:
            r15 = r35
        L_0x007a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3 r2 = androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3.f4397z
            r11 = r61
            java.lang.Object r0 = r11.d(r0, r1, r2)
            r6 = r0
            androidx.compose.ui.layout.MeasureResult r6 = (androidx.compose.ui.layout.MeasureResult) r6
            java.util.List r13 = kotlin.collections.CollectionsKt.m()
            r0 = r38
            int r14 = -r0
            int r15 = r37 + r39
            if (r46 == 0) goto L_0x009d
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x009a:
            r18 = r0
            goto L_0x00a0
        L_0x009d:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x009a
        L_0x00a0:
            long r11 = r36.f()
            androidx.compose.foundation.lazy.LazyListMeasureResult r0 = new androidx.compose.foundation.lazy.LazyListMeasureResult
            r1 = r0
            r16 = 0
            r21 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = r57
            r10 = r50
            r17 = r49
            r19 = r39
            r20 = r40
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x00bf:
            r10 = r37
            r9 = r38
            r0 = r41
            r12 = r44
            r11 = r61
            if (r0 < r15) goto L_0x00cf
            int r0 = r15 + -1
            r1 = r14
            goto L_0x00d1
        L_0x00cf:
            r1 = r42
        L_0x00d1:
            int r2 = java.lang.Math.round(r43)
            int r1 = r1 - r2
            if (r0 != 0) goto L_0x00de
            if (r1 >= 0) goto L_0x00de
            int r2 = r2 + r1
            r6 = r2
            r1 = r14
            goto L_0x00df
        L_0x00de:
            r6 = r2
        L_0x00df:
            kotlin.collections.ArrayDeque r8 = new kotlin.collections.ArrayDeque
            r8.<init>()
            int r7 = -r9
            if (r40 >= 0) goto L_0x00ea
            r2 = r40
            goto L_0x00eb
        L_0x00ea:
            r2 = r14
        L_0x00eb:
            int r5 = r7 + r2
            int r1 = r1 + r5
            r4 = r1
            r2 = r14
        L_0x00f0:
            if (r4 >= 0) goto L_0x012a
            if (r0 <= 0) goto L_0x012a
            int r20 = r0 + -1
            r21 = 2
            r22 = 0
            r23 = 0
            r0 = r36
            r1 = r20
            r25 = r2
            r2 = r23
            r26 = r4
            r4 = r21
            r27 = r5
            r5 = r22
            androidx.compose.foundation.lazy.LazyListMeasuredItem r0 = androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.e(r0, r1, r2, r4, r5)
            r8.add(r14, r0)
            int r1 = r0.n()
            r2 = r25
            int r2 = java.lang.Math.max(r2, r1)
            int r0 = r0.h()
            r1 = r26
            int r4 = r1 + r0
            r0 = r20
            r5 = r27
            goto L_0x00f0
        L_0x012a:
            r1 = r4
            if (r1 >= r5) goto L_0x0131
            int r1 = r5 - r1
            int r6 = r6 - r1
            r1 = r5
        L_0x0131:
            int r1 = r1 - r5
            int r4 = r10 + r39
            int r3 = kotlin.ranges.RangesKt.e(r4, r14)
            int r14 = -r1
            r41 = r0
            r21 = r41
            r42 = r1
            r0 = 0
            r22 = 0
        L_0x0142:
            int r1 = r8.size()
            if (r0 >= r1) goto L_0x0160
            if (r14 < r3) goto L_0x0150
            r8.remove(r0)
            r22 = r16
            goto L_0x0142
        L_0x0150:
            int r21 = r21 + 1
            java.lang.Object r1 = r8.get(r0)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r1 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r1
            int r1 = r1.h()
            int r14 = r14 + r1
            int r0 = r0 + 1
            goto L_0x0142
        L_0x0160:
            r1 = r14
            r0 = r21
            r14 = r41
            r21 = r42
        L_0x0167:
            if (r0 >= r15) goto L_0x0174
            if (r1 < r3) goto L_0x017c
            if (r1 <= 0) goto L_0x017c
            boolean r23 = r8.isEmpty()
            if (r23 == 0) goto L_0x0174
            goto L_0x017c
        L_0x0174:
            r5 = r0
            r3 = r2
            r25 = r4
            r23 = r7
            r2 = r1
            goto L_0x01d3
        L_0x017c:
            r23 = 2
            r24 = 0
            r25 = 0
            r41 = r0
            r0 = r36
            r28 = r1
            r1 = r41
            r29 = r2
            r27 = r3
            r2 = r25
            r25 = r4
            r4 = r23
            r23 = r7
            r7 = r5
            r5 = r24
            androidx.compose.foundation.lazy.LazyListMeasuredItem r0 = androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.e(r0, r1, r2, r4, r5)
            int r1 = r0.h()
            r2 = r28
            int r1 = r1 + r2
            if (r1 > r7) goto L_0x01ba
            int r2 = r15 + -1
            r5 = r41
            if (r5 == r2) goto L_0x01bc
            int r2 = r5 + 1
            int r0 = r0.h()
            int r21 = r21 - r0
            r14 = r2
            r22 = r16
            r2 = r29
            goto L_0x01c9
        L_0x01ba:
            r5 = r41
        L_0x01bc:
            int r2 = r0.n()
            r3 = r29
            int r2 = java.lang.Math.max(r3, r2)
            r8.add(r0)
        L_0x01c9:
            int r0 = r5 + 1
            r5 = r7
            r7 = r23
            r4 = r25
            r3 = r27
            goto L_0x0167
        L_0x01d3:
            if (r2 >= r10) goto L_0x0229
            int r7 = r10 - r2
            int r21 = r21 - r7
            int r24 = r2 + r7
            r0 = r14
            r4 = r21
            r14 = r3
        L_0x01df:
            if (r4 >= r9) goto L_0x0212
            if (r0 <= 0) goto L_0x0212
            int r21 = r0 + -1
            r26 = 2
            r27 = 0
            r2 = 0
            r0 = r36
            r1 = r21
            r28 = r4
            r4 = r26
            r30 = r5
            r5 = r27
            androidx.compose.foundation.lazy.LazyListMeasuredItem r0 = androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.e(r0, r1, r2, r4, r5)
            r5 = 0
            r8.add(r5, r0)
            int r1 = r0.n()
            int r14 = java.lang.Math.max(r14, r1)
            int r0 = r0.h()
            int r4 = r28 + r0
            r0 = r21
            r5 = r30
            goto L_0x01df
        L_0x0212:
            r28 = r4
            r30 = r5
            r5 = 0
            int r7 = r7 + r6
            if (r28 >= 0) goto L_0x0224
            int r7 = r7 + r28
            int r1 = r24 + r28
            r24 = r1
            r2 = r14
            r14 = r0
            r0 = r5
            goto L_0x0232
        L_0x0224:
            r2 = r14
            r14 = r0
            r0 = r28
            goto L_0x0232
        L_0x0229:
            r30 = r5
            r5 = 0
            r24 = r2
            r2 = r3
            r7 = r6
            r0 = r21
        L_0x0232:
            int r1 = java.lang.Math.round(r43)
            int r1 = kotlin.math.MathKt.a(r1)
            int r3 = kotlin.math.MathKt.a(r7)
            if (r1 != r3) goto L_0x0251
            int r1 = java.lang.Math.round(r43)
            int r1 = java.lang.Math.abs(r1)
            int r3 = java.lang.Math.abs(r7)
            if (r1 < r3) goto L_0x0251
            float r1 = (float) r7
            r4 = r1
            goto L_0x0253
        L_0x0251:
            r4 = r43
        L_0x0253:
            float r1 = r43 - r4
            r3 = 0
            if (r55 == 0) goto L_0x0261
            if (r7 <= r6) goto L_0x0261
            int r20 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r20 > 0) goto L_0x0261
            int r7 = r7 - r6
            float r3 = (float) r7
            float r3 = r3 + r1
        L_0x0261:
            r21 = r3
            if (r0 < 0) goto L_0x0268
            r1 = r16
            goto L_0x0269
        L_0x0268:
            r1 = r5
        L_0x0269:
            if (r1 != 0) goto L_0x0270
            java.lang.String r1 = "negative currentFirstItemScrollOffset"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r1)
        L_0x0270:
            int r7 = -r0
            java.lang.Object r1 = r8.first()
            androidx.compose.foundation.lazy.LazyListMeasuredItem r1 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r1
            if (r9 > 0) goto L_0x0286
            if (r40 >= 0) goto L_0x027c
            goto L_0x0286
        L_0x027c:
            r5 = r36
            r3 = r52
            r27 = r0
            r6 = r1
            r1 = r53
            goto L_0x02ba
        L_0x0286:
            int r3 = r8.size()
            r6 = r5
        L_0x028b:
            if (r6 >= r3) goto L_0x02ae
            java.lang.Object r20 = r8.get(r6)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r20 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r20
            int r5 = r20.h()
            if (r0 == 0) goto L_0x02ae
            if (r5 > r0) goto L_0x02ae
            r41 = r1
            int r1 = kotlin.collections.CollectionsKt.o(r8)
            if (r6 == r1) goto L_0x02b0
            int r0 = r0 - r5
            int r6 = r6 + 1
            java.lang.Object r1 = r8.get(r6)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r1 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r1
            r5 = 0
            goto L_0x028b
        L_0x02ae:
            r41 = r1
        L_0x02b0:
            r5 = r36
            r6 = r41
            r3 = r52
            r1 = r53
            r27 = r0
        L_0x02ba:
            java.util.List r14 = d(r14, r5, r3, r1)
            r0 = r14
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 0
        L_0x02c6:
            if (r1 >= r0) goto L_0x02dd
            java.lang.Object r20 = r14.get(r1)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r20 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r20
            r41 = r0
            int r0 = r20.n()
            int r2 = java.lang.Math.max(r2, r0)
            int r1 = r1 + 1
            r0 = r41
            goto L_0x02c6
        L_0x02dd:
            r0 = r8
            r1 = r36
            r20 = r2
            r2 = r35
            r3 = r52
            r41 = r4
            r4 = r53
            r15 = r5
            r26 = 0
            r5 = r41
            r15 = r6
            r6 = r55
            r28 = r7
            r7 = r56
            java.util.List r2 = c(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = r20
            r5 = r26
        L_0x0305:
            if (r5 >= r0) goto L_0x0318
            java.lang.Object r3 = r2.get(r5)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r3 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r3
            int r3 = r3.n()
            int r1 = java.lang.Math.max(r1, r3)
            int r5 = r5 + 1
            goto L_0x0305
        L_0x0318:
            java.lang.Object r0 = r8.first()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r15, r0)
            if (r0 == 0) goto L_0x0331
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0331
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0331
            r20 = r16
            goto L_0x0333
        L_0x0331:
            r20 = r26
        L_0x0333:
            if (r46 == 0) goto L_0x0337
            r0 = r1
            goto L_0x0339
        L_0x0337:
            r0 = r24
        L_0x0339:
            int r7 = androidx.compose.ui.unit.ConstraintsKt.g(r12, r0)
            if (r46 == 0) goto L_0x0341
            r1 = r24
        L_0x0341:
            int r6 = androidx.compose.ui.unit.ConstraintsKt.f(r12, r1)
            r0 = r8
            r1 = r14
            r3 = r7
            r4 = r6
            r5 = r24
            r14 = r6
            r6 = r37
            r42 = r7
            r7 = r28
            r29 = r8
            r28 = r15
            r15 = r55
            r8 = r46
            r9 = r47
            r10 = r48
            r11 = r49
            r12 = r50
            java.util.List r13 = a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r12 = r41
            int r1 = (int) r12
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r5 = r36.h()
            r9 = 1
            r0 = r51
            r2 = r42
            r3 = r14
            r4 = r13
            r6 = r36
            r7 = r46
            r8 = r55
            r10 = r54
            r11 = r27
            r31 = r12
            r12 = r24
            r32 = r13
            r13 = r57
            r34 = r14
            r33 = r24
            r24 = r26
            r14 = r59
            r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r15 != 0) goto L_0x03e9
            long r0 = r51.i()
            androidx.compose.ui.unit.IntSize$Companion r2 = androidx.compose.ui.unit.IntSize.f19170b
            long r2 = r2.a()
            boolean r2 = androidx.compose.ui.unit.IntSize.e(r0, r2)
            if (r2 != 0) goto L_0x03e9
            if (r46 == 0) goto L_0x03a8
            r7 = r34
            goto L_0x03aa
        L_0x03a8:
            r7 = r42
        L_0x03aa:
            long r2 = r0 >> r19
            int r2 = (int) r2
            r3 = r42
            int r2 = java.lang.Math.max(r3, r2)
            r3 = r44
            int r2 = androidx.compose.ui.unit.ConstraintsKt.g(r3, r2)
            long r0 = r0 & r17
            int r0 = (int) r0
            r1 = r34
            int r0 = java.lang.Math.max(r1, r0)
            int r6 = androidx.compose.ui.unit.ConstraintsKt.f(r3, r0)
            if (r46 == 0) goto L_0x03ca
            r0 = r6
            goto L_0x03cb
        L_0x03ca:
            r0 = r2
        L_0x03cb:
            r8 = r32
            if (r0 == r7) goto L_0x03e6
            r13 = r8
            java.util.Collection r13 = (java.util.Collection) r13
            int r1 = r13.size()
            r14 = r24
        L_0x03d8:
            if (r14 >= r1) goto L_0x03e6
            java.lang.Object r3 = r8.get(r14)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r3 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r3
            r3.t(r0)
            int r14 = r14 + 1
            goto L_0x03d8
        L_0x03e6:
            r10 = r2
            r9 = r6
            goto L_0x03f1
        L_0x03e9:
            r3 = r42
            r8 = r32
            r1 = r34
            r9 = r1
            r10 = r3
        L_0x03f1:
            androidx.collection.IntList r2 = r36.g()
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1 r7 = new androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
            r11 = r36
            r12 = r28
            r7.<init>(r11)
            r0 = r60
            r1 = r8
            r3 = r38
            r4 = r39
            r5 = r10
            r6 = r9
            java.util.List r0 = androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt.b(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = 0
            if (r20 == 0) goto L_0x0421
            java.lang.Object r2 = kotlin.collections.CollectionsKt.g0(r8)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r2
            if (r2 == 0) goto L_0x041f
            int r2 = r2.getIndex()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0431
        L_0x041f:
            r2 = r1
            goto L_0x0431
        L_0x0421:
            java.lang.Object r2 = r29.o()
            androidx.compose.foundation.lazy.LazyListMeasuredItem r2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r2
            if (r2 == 0) goto L_0x041f
            int r2 = r2.getIndex()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0431:
            if (r20 == 0) goto L_0x0448
            java.lang.Object r3 = kotlin.collections.CollectionsKt.q0(r8)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r3 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r3
            if (r3 == 0) goto L_0x0443
            int r1 = r3.getIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0443:
            r14 = r35
            r3 = r30
            goto L_0x0459
        L_0x0448:
            java.lang.Object r3 = r29.q()
            androidx.compose.foundation.lazy.LazyListMeasuredItem r3 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r3
            if (r3 == 0) goto L_0x0443
            int r1 = r3.getIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0443
        L_0x0459:
            if (r3 < r14) goto L_0x0465
            r3 = r37
            r4 = r33
            if (r4 <= r3) goto L_0x0462
            goto L_0x0465
        L_0x0462:
            r3 = r24
            goto L_0x0467
        L_0x0465:
            r3 = r16
        L_0x0467:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8 r6 = new androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
            r7 = r58
            r6.<init>(r7, r8, r0, r15)
            r7 = r61
            java.lang.Object r4 = r7.d(r4, r5, r6)
            r5 = r4
            androidx.compose.ui.layout.MeasureResult r5 = (androidx.compose.ui.layout.MeasureResult) r5
            if (r2 == 0) goto L_0x0486
            int r2 = r2.intValue()
            goto L_0x0488
        L_0x0486:
            r2 = r24
        L_0x0488:
            if (r1 == 0) goto L_0x048f
            int r1 = r1.intValue()
            goto L_0x0491
        L_0x048f:
            r1 = r24
        L_0x0491:
            java.util.List r13 = androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt.c(r2, r1, r8, r0)
            if (r46 == 0) goto L_0x049c
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x0499:
            r17 = r0
            goto L_0x049f
        L_0x049c:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x0499
        L_0x049f:
            long r10 = r36.f()
            androidx.compose.foundation.lazy.LazyListMeasureResult r24 = new androidx.compose.foundation.lazy.LazyListMeasureResult
            r0 = r24
            r20 = 0
            r1 = r12
            r2 = r27
            r4 = r31
            r6 = r21
            r7 = r22
            r8 = r57
            r9 = r50
            r12 = r13
            r13 = r23
            r14 = r25
            r15 = r35
            r16 = r49
            r18 = r39
            r19 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.e(int, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.LazyListLayoutInfo, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, kotlin.jvm.functions.Function3):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }
}
