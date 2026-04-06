package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyGridMeasureKt {
    public static final void a(List list, Object[] objArr) {
        for (Object add : objArr) {
            list.add(add);
        }
    }

    public static final List b(List list, List list2, List list3, int i2, int i3, int i4, int i5, int i6, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density) {
        List list4 = list;
        List list5 = list2;
        List list6 = list3;
        int i7 = i2;
        int i8 = i3;
        Arrangement.Vertical vertical2 = vertical;
        boolean z4 = z3;
        int i9 = i5;
        int i10 = z2 ? i8 : i7;
        boolean z5 = true;
        boolean z6 = i4 < Math.min(i10, i9);
        if (z6) {
            if (!(i6 == 0)) {
                InlineClassHelperKt.c("non-zero firstLineScrollOffset");
            }
        }
        Collection collection = list4;
        int size = collection.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((LazyGridMeasuredLine) list4.get(i12)).b().length;
        }
        ArrayList arrayList = new ArrayList(i11);
        if (z6) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z5 = false;
            }
            if (!z5) {
                InlineClassHelperKt.a("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i13 = 0; i13 < size2; i13++) {
                iArr[i13] = ((LazyGridMeasuredLine) list4.get(c(i13, z4, size2))).c();
            }
            int[] iArr2 = new int[size2];
            if (!z2) {
                Density density2 = density;
                if (horizontal != null) {
                    horizontal.c(density, i10, iArr, LayoutDirection.Ltr, iArr2);
                } else {
                    InlineClassHelperKt.b("null horizontalArrangement");
                    throw new KotlinNothingValueException();
                }
            } else if (vertical2 != null) {
                vertical2.b(density, i10, iArr, iArr2);
            } else {
                InlineClassHelperKt.b("null verticalArrangement");
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
                    int i14 = iArr2[n2];
                    LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) list4.get(c(n2, z4, size2));
                    if (z4) {
                        i14 = (i10 - i14) - lazyGridMeasuredLine.c();
                    }
                    a(arrayList, lazyGridMeasuredLine.f(i14, i7, i8));
                    if (n2 == o2) {
                        break;
                    }
                    n2 += p2;
                }
            }
        } else {
            int size3 = list5.size() - 1;
            if (size3 >= 0) {
                int i15 = i6;
                while (true) {
                    int i16 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) list5.get(size3);
                    i15 -= lazyGridMeasuredItem.h();
                    lazyGridMeasuredItem.o(i15, 0, i7, i8);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i16 < 0) {
                        break;
                    }
                    size3 = i16;
                }
            }
            int size4 = collection.size();
            int i17 = i6;
            for (int i18 = 0; i18 < size4; i18++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) list4.get(i18);
                a(arrayList, lazyGridMeasuredLine2.f(i17, i7, i8));
                i17 += lazyGridMeasuredLine2.d();
            }
            int size5 = list6.size();
            for (int i19 = 0; i19 < size5; i19++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) list6.get(i19);
                lazyGridMeasuredItem2.o(i17, 0, i7, i8);
                arrayList.add(lazyGridMeasuredItem2);
                i17 += lazyGridMeasuredItem2.h();
            }
        }
        return arrayList;
    }

    public static final int c(int i2, boolean z2, int i3) {
        return !z2 ? i2 : (i3 - i2) - 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r6 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r9.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List d(int r6, int r7, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r8, boolean r9, java.util.List r10, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r11) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x00b0
            if (r11 == 0) goto L_0x00b0
            java.util.List r9 = r11.k()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00b0
            java.util.List r9 = r11.k()
            int r1 = r9.size()
            int r1 = r1 + -1
        L_0x001b:
            r2 = -1
            if (r2 >= r1) goto L_0x0044
            java.lang.Object r2 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 <= r6) goto L_0x0041
            if (r1 == 0) goto L_0x003a
            int r2 = r1 + -1
            java.lang.Object r2 = r9.get(r2)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 > r6) goto L_0x0041
        L_0x003a:
            java.lang.Object r6 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r6 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r6
            goto L_0x0045
        L_0x0041:
            int r1 = r1 + -1
            goto L_0x001b
        L_0x0044:
            r6 = r0
        L_0x0045:
            java.util.List r9 = r11.k()
            java.lang.Object r9 = kotlin.collections.CollectionsKt.p0(r9)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r9 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r9
            java.lang.Object r10 = kotlin.collections.CollectionsKt.q0(r10)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r10
            r11 = 0
            if (r10 == 0) goto L_0x005f
            int r10 = r10.a()
            int r10 = r10 + 1
            goto L_0x0060
        L_0x005f:
            r10 = r11
        L_0x0060:
            if (r6 == 0) goto L_0x00b0
            int r6 = r6.getIndex()
            int r9 = r9.getIndex()
            int r7 = r7 + -1
            int r7 = java.lang.Math.min(r9, r7)
            if (r6 > r7) goto L_0x00b0
        L_0x0072:
            if (r0 == 0) goto L_0x009b
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r1 = r11
        L_0x007c:
            if (r1 >= r9) goto L_0x009b
            java.lang.Object r2 = r0.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r2
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r2 = r2.b()
            int r3 = r2.length
            r4 = r11
        L_0x008a:
            if (r4 >= r3) goto L_0x0098
            r5 = r2[r4]
            int r5 = r5.getIndex()
            if (r5 != r6) goto L_0x0095
            goto L_0x00ab
        L_0x0095:
            int r4 = r4 + 1
            goto L_0x008a
        L_0x0098:
            int r1 = r1 + 1
            goto L_0x007c
        L_0x009b:
            if (r0 != 0) goto L_0x00a2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00a2:
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r9 = r8.c(r10)
            int r10 = r10 + 1
            r0.add(r9)
        L_0x00ab:
            if (r6 == r7) goto L_0x00b0
            int r6 = r6 + 1
            goto L_0x0072
        L_0x00b0:
            if (r0 != 0) goto L_0x00b6
            java.util.List r0 = kotlin.collections.CollectionsKt.m()
        L_0x00b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.d(int, int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, boolean, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult e(int r38, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r39, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r40, int r41, int r42, int r43, int r44, int r45, int r46, float r47, long r48, boolean r50, androidx.compose.foundation.layout.Arrangement.Vertical r51, androidx.compose.foundation.layout.Arrangement.Horizontal r52, boolean r53, androidx.compose.ui.unit.Density r54, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r55, int r56, java.util.List r57, boolean r58, boolean r59, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r60, kotlinx.coroutines.CoroutineScope r61, androidx.compose.runtime.MutableState r62, androidx.compose.ui.graphics.GraphicsContext r63, kotlin.jvm.functions.Function1 r64, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r65, kotlin.jvm.functions.Function3 r66) {
        /*
            r15 = r38
            r6 = r39
            r7 = r41
            r8 = r42
            r9 = r48
            r11 = r57
            r5 = r66
            r13 = 0
            if (r8 < 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = r13
        L_0x0014:
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "negative beforeContentPadding"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r0)
        L_0x001b:
            if (r43 < 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = r13
        L_0x0020:
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "negative afterContentPadding"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r0)
        L_0x0027:
            r31 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r33 = 32
            if (r15 > 0) goto L_0x00ba
            int r0 = androidx.compose.ui.unit.Constraints.n(r48)
            int r1 = androidx.compose.ui.unit.Constraints.m(r48)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r16 = r40.f()
            r22 = 0
            r23 = 0
            r12 = 0
            r11 = r55
            r13 = r0
            r14 = r1
            r17 = r40
            r18 = r50
            r19 = r59
            r20 = r56
            r21 = r58
            r24 = r61
            r25 = r63
            r11.m(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r59 != 0) goto L_0x007b
            long r2 = r55.i()
            androidx.compose.ui.unit.IntSize$Companion r4 = androidx.compose.ui.unit.IntSize.f19170b
            long r11 = r4.a()
            boolean r4 = androidx.compose.ui.unit.IntSize.e(r2, r11)
            if (r4 != 0) goto L_0x007b
            long r0 = r2 >> r33
            int r0 = (int) r0
            int r0 = androidx.compose.ui.unit.ConstraintsKt.g(r9, r0)
            long r1 = r2 & r31
            int r1 = (int) r1
            int r1 = androidx.compose.ui.unit.ConstraintsKt.f(r9, r1)
        L_0x007b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3 r2 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3.f4624z
            java.lang.Object r0 = r5.d(r0, r1, r2)
            r6 = r0
            androidx.compose.ui.layout.MeasureResult r6 = (androidx.compose.ui.layout.MeasureResult) r6
            java.util.List r13 = kotlin.collections.CollectionsKt.m()
            int r14 = -r8
            int r15 = r7 + r43
            if (r50 == 0) goto L_0x009a
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x0097:
            r18 = r0
            goto L_0x009d
        L_0x009a:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x0097
        L_0x009d:
            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r0 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult
            r1 = r0
            r8 = 0
            r16 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = r61
            r10 = r54
            r11 = r56
            r12 = r64
            r17 = r53
            r19 = r43
            r20 = r44
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x00ba:
            int r0 = java.lang.Math.round(r47)
            int r1 = r46 - r0
            if (r45 != 0) goto L_0x00c6
            if (r1 >= 0) goto L_0x00c6
            int r0 = r0 + r1
            r1 = r13
        L_0x00c6:
            kotlin.collections.ArrayDeque r14 = new kotlin.collections.ArrayDeque
            r14.<init>()
            int r4 = -r8
            if (r44 >= 0) goto L_0x00d1
            r2 = r44
            goto L_0x00d2
        L_0x00d1:
            r2 = r13
        L_0x00d2:
            int r2 = r2 + r4
            int r1 = r1 + r2
            r3 = r1
            r1 = r45
        L_0x00d7:
            if (r3 >= 0) goto L_0x00ea
            if (r1 <= 0) goto L_0x00ea
            int r1 = r1 + -1
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r12 = r6.c(r1)
            r14.add(r13, r12)
            int r12 = r12.d()
            int r3 = r3 + r12
            goto L_0x00d7
        L_0x00ea:
            if (r3 >= r2) goto L_0x00f0
            int r3 = r2 - r3
            int r0 = r0 - r3
            r3 = r2
        L_0x00f0:
            int r3 = r3 - r2
            int r12 = r7 + r43
            r45 = r1
            int r1 = kotlin.ranges.RangesKt.e(r12, r13)
            int r13 = -r3
            r17 = r45
            r46 = r3
            r18 = r4
            r3 = 0
            r16 = 0
        L_0x0103:
            int r4 = r14.size()
            if (r3 >= r4) goto L_0x0121
            if (r13 < r1) goto L_0x0111
            r14.remove(r3)
            r16 = 1
            goto L_0x0103
        L_0x0111:
            int r17 = r17 + 1
            java.lang.Object r4 = r14.get(r3)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r4 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r4
            int r4 = r4.d()
            int r13 = r13 + r4
            int r3 = r3 + 1
            goto L_0x0103
        L_0x0121:
            r4 = r46
            r3 = r13
            r13 = r16
            r5 = r17
        L_0x0128:
            if (r5 >= r15) goto L_0x017c
            if (r3 < r1) goto L_0x0134
            if (r3 <= 0) goto L_0x0134
            boolean r16 = r14.isEmpty()
            if (r16 == 0) goto L_0x017c
        L_0x0134:
            r46 = r1
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r1 = r6.c(r5)
            boolean r16 = r1.e()
            if (r16 == 0) goto L_0x0141
            goto L_0x017c
        L_0x0141:
            int r16 = r1.d()
            int r3 = r3 + r16
            if (r3 > r2) goto L_0x0168
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r16 = r1.b()
            java.lang.Object r16 = kotlin.collections.ArraysKt.D0(r16)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r16 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r16
            r17 = r2
            int r2 = r16.getIndex()
            r16 = r3
            int r3 = r15 + -1
            if (r2 == r3) goto L_0x016c
            int r2 = r5 + 1
            int r1 = r1.d()
            int r4 = r4 - r1
            r13 = 1
            goto L_0x0171
        L_0x0168:
            r17 = r2
            r16 = r3
        L_0x016c:
            r14.add(r1)
            r2 = r45
        L_0x0171:
            int r5 = r5 + 1
            r1 = r46
            r45 = r2
            r3 = r16
            r2 = r17
            goto L_0x0128
        L_0x017c:
            if (r3 >= r7) goto L_0x01a4
            int r1 = r7 - r3
            int r4 = r4 - r1
            int r3 = r3 + r1
        L_0x0182:
            r2 = r45
            if (r4 >= r8) goto L_0x019a
            if (r2 <= 0) goto L_0x019a
            int r2 = r2 + -1
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r5 = r6.c(r2)
            r45 = r2
            r2 = 0
            r14.add(r2, r5)
            int r2 = r5.d()
            int r4 = r4 + r2
            goto L_0x0182
        L_0x019a:
            int r1 = r1 + r0
            if (r4 >= 0) goto L_0x01a2
            int r1 = r1 + r4
            int r3 = r3 + r4
            r5 = r3
            r4 = 0
            goto L_0x01a6
        L_0x01a2:
            r5 = r3
            goto L_0x01a6
        L_0x01a4:
            r1 = r0
            goto L_0x01a2
        L_0x01a6:
            int r2 = java.lang.Math.round(r47)
            int r2 = kotlin.math.MathKt.a(r2)
            int r3 = kotlin.math.MathKt.a(r1)
            if (r2 != r3) goto L_0x01c5
            int r2 = java.lang.Math.round(r47)
            int r2 = java.lang.Math.abs(r2)
            int r3 = java.lang.Math.abs(r1)
            if (r2 < r3) goto L_0x01c5
            float r2 = (float) r1
            r3 = r2
            goto L_0x01c7
        L_0x01c5:
            r3 = r47
        L_0x01c7:
            float r2 = r47 - r3
            r16 = 0
            if (r59 == 0) goto L_0x01d9
            if (r1 <= r0) goto L_0x01d9
            int r17 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r17 > 0) goto L_0x01d9
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            r35 = r0
            goto L_0x01db
        L_0x01d9:
            r35 = r16
        L_0x01db:
            if (r4 < 0) goto L_0x01df
            r0 = 1
            goto L_0x01e0
        L_0x01df:
            r0 = 0
        L_0x01e0:
            if (r0 != 0) goto L_0x01e7
            java.lang.String r0 = "negative initial offset"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r0)
        L_0x01e7:
            int r2 = -r4
            java.lang.Object r0 = r14.first()
            r16 = r0
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r16 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r16
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r0 = r16.b()
            java.lang.Object r0 = kotlin.collections.ArraysKt.g0(r0)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r0 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r0
            if (r0 == 0) goto L_0x0202
            int r0 = r0.getIndex()
            r1 = r0
            goto L_0x0203
        L_0x0202:
            r1 = 0
        L_0x0203:
            java.lang.Object r0 = r14.q()
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r0 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r0
            if (r0 == 0) goto L_0x0220
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r0 = r0.b()
            if (r0 == 0) goto L_0x0220
            java.lang.Object r0 = kotlin.collections.ArraysKt.M0(r0)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r0 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r0
            if (r0 == 0) goto L_0x0220
            int r0 = r0.getIndex()
            r45 = r0
            goto L_0x0222
        L_0x0220:
            r45 = 0
        L_0x0222:
            r17 = r11
            java.util.Collection r17 = (java.util.Collection) r17
            int r0 = r17.size()
            r19 = 0
            r20 = r2
            r21 = r19
            r2 = 0
        L_0x0231:
            if (r2 >= r0) goto L_0x0278
            java.lang.Object r22 = r11.get(r2)
            java.lang.Number r22 = (java.lang.Number) r22
            r46 = r0
            int r0 = r22.intValue()
            if (r0 < 0) goto L_0x026b
            if (r0 >= r1) goto L_0x026b
            r22 = r1
            int r1 = r6.d(r0)
            r29 = r3
            r3 = 0
            long r27 = r6.a(r3, r1)
            r25 = 0
            r23 = r40
            r24 = r0
            r26 = r1
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r0 = r23.a(r24, r25, r26, r27)
            if (r21 != 0) goto L_0x0263
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
        L_0x0263:
            r1 = r21
            r1.add(r0)
            r21 = r1
            goto L_0x026f
        L_0x026b:
            r22 = r1
            r29 = r3
        L_0x026f:
            int r2 = r2 + 1
            r0 = r46
            r1 = r22
            r3 = r29
            goto L_0x0231
        L_0x0278:
            r22 = r1
            r29 = r3
            if (r21 != 0) goto L_0x0284
            java.util.List r0 = kotlin.collections.CollectionsKt.m()
            r21 = r0
        L_0x0284:
            r0 = r45
            r3 = r22
            r1 = r38
            r23 = r20
            r2 = r39
            r46 = r12
            r36 = r13
            r12 = r29
            r13 = r3
            r3 = r59
            r37 = r18
            r18 = r4
            r4 = r14
            r7 = r5
            r47 = r13
            r13 = r59
            r5 = r60
            java.util.List r0 = d(r0, r1, r2, r3, r4, r5)
            int r1 = r17.size()
            r2 = 0
        L_0x02ac:
            if (r2 >= r1) goto L_0x0325
            java.lang.Object r3 = r11.get(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r4 = r45 + 1
            if (r4 > r3) goto L_0x031b
            if (r3 >= r15) goto L_0x031b
            if (r13 == 0) goto L_0x02f5
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L_0x02c8:
            if (r5 >= r4) goto L_0x02f5
            java.lang.Object r17 = r0.get(r5)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r17 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r17
            r60 = r1
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r1 = r17.b()
            r17 = r4
            int r4 = r1.length
            r11 = 0
        L_0x02da:
            if (r11 >= r4) goto L_0x02ec
            r20 = r1[r11]
            r22 = r1
            int r1 = r20.getIndex()
            if (r1 != r3) goto L_0x02e7
            goto L_0x031d
        L_0x02e7:
            int r11 = r11 + 1
            r1 = r22
            goto L_0x02da
        L_0x02ec:
            int r5 = r5 + 1
            r11 = r57
            r1 = r60
            r4 = r17
            goto L_0x02c8
        L_0x02f5:
            r60 = r1
            int r1 = r6.d(r3)
            r4 = 0
            long r28 = r6.a(r4, r1)
            r26 = 0
            r24 = r40
            r25 = r3
            r27 = r1
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r1 = r24.a(r25, r26, r27, r28)
            if (r19 != 0) goto L_0x0313
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
        L_0x0313:
            r3 = r19
            r3.add(r1)
            r19 = r3
            goto L_0x031e
        L_0x031b:
            r60 = r1
        L_0x031d:
            r4 = 0
        L_0x031e:
            int r2 = r2 + 1
            r11 = r57
            r1 = r60
            goto L_0x02ac
        L_0x0325:
            r4 = 0
            if (r19 != 0) goto L_0x032e
            java.util.List r1 = kotlin.collections.CollectionsKt.m()
            r19 = r1
        L_0x032e:
            if (r8 > 0) goto L_0x0338
            if (r44 >= 0) goto L_0x0333
            goto L_0x0338
        L_0x0333:
            r1 = r16
            r2 = r18
            goto L_0x0364
        L_0x0338:
            int r1 = r14.size()
            r2 = r4
            r3 = r18
        L_0x033f:
            if (r2 >= r1) goto L_0x0361
            java.lang.Object r5 = r14.get(r2)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r5 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r5
            int r5 = r5.d()
            if (r3 == 0) goto L_0x0361
            if (r5 > r3) goto L_0x0361
            int r11 = kotlin.collections.CollectionsKt.o(r14)
            if (r2 == r11) goto L_0x0361
            int r3 = r3 - r5
            int r2 = r2 + 1
            java.lang.Object r5 = r14.get(r2)
            r16 = r5
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r16 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r16
            goto L_0x033f
        L_0x0361:
            r2 = r3
            r1 = r16
        L_0x0364:
            if (r50 == 0) goto L_0x036b
            int r3 = androidx.compose.ui.unit.Constraints.l(r48)
            goto L_0x036f
        L_0x036b:
            int r3 = androidx.compose.ui.unit.ConstraintsKt.g(r9, r7)
        L_0x036f:
            if (r50 == 0) goto L_0x0376
            int r5 = androidx.compose.ui.unit.ConstraintsKt.f(r9, r7)
            goto L_0x037a
        L_0x0376:
            int r5 = androidx.compose.ui.unit.Constraints.k(r48)
        L_0x037a:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x0383
            r16 = r14
            goto L_0x038b
        L_0x0383:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.x0(r14, r0)
            r16 = r0
        L_0x038b:
            r17 = r21
            r18 = r19
            r19 = r3
            r20 = r5
            r21 = r7
            r22 = r41
            r24 = r50
            r25 = r51
            r26 = r52
            r27 = r53
            r28 = r54
            java.util.List r0 = b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            int r11 = (int) r12
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r21 = r40.f()
            r16 = r55
            r17 = r11
            r18 = r3
            r19 = r5
            r20 = r0
            r22 = r40
            r23 = r50
            r24 = r59
            r25 = r56
            r26 = r58
            r27 = r2
            r28 = r7
            r29 = r61
            r30 = r63
            r16.m(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r13 != 0) goto L_0x0421
            r57 = r5
            long r4 = r55.i()
            androidx.compose.ui.unit.IntSize$Companion r11 = androidx.compose.ui.unit.IntSize.f19170b
            r14 = r7
            long r7 = r11.a()
            boolean r7 = androidx.compose.ui.unit.IntSize.e(r4, r7)
            if (r7 != 0) goto L_0x041c
            if (r50 == 0) goto L_0x03e5
            r7 = r57
        L_0x03e2:
            r29 = r12
            goto L_0x03e7
        L_0x03e5:
            r7 = r3
            goto L_0x03e2
        L_0x03e7:
            long r11 = r4 >> r33
            int r8 = (int) r11
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = androidx.compose.ui.unit.ConstraintsKt.g(r9, r3)
            long r4 = r4 & r31
            int r4 = (int) r4
            r5 = r57
            int r4 = java.lang.Math.max(r5, r4)
            int r5 = androidx.compose.ui.unit.ConstraintsKt.f(r9, r4)
            if (r50 == 0) goto L_0x0403
            r4 = r5
            goto L_0x0404
        L_0x0403:
            r4 = r3
        L_0x0404:
            if (r4 == r7) goto L_0x0423
            r7 = r0
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
        L_0x040e:
            if (r8 >= r7) goto L_0x0423
            java.lang.Object r9 = r0.get(r8)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r9 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r9
            r9.v(r4)
            int r8 = r8 + 1
            goto L_0x040e
        L_0x041c:
            r5 = r57
        L_0x041e:
            r29 = r12
            goto L_0x0423
        L_0x0421:
            r14 = r7
            goto L_0x041e
        L_0x0423:
            androidx.collection.IntList r18 = r40.e()
            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$stickingItems$1 r4 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$stickingItems$1
            r7 = r40
            r4.<init>(r6, r7)
            r16 = r65
            r17 = r0
            r19 = r42
            r20 = r43
            r21 = r3
            r22 = r5
            r23 = r4
            java.util.List r4 = androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt.b(r16, r17, r18, r19, r20, r21, r22, r23)
            int r6 = r15 + -1
            r7 = r45
            if (r7 != r6) goto L_0x044f
            r6 = r41
            r8 = r14
            if (r8 <= r6) goto L_0x044c
            goto L_0x044f
        L_0x044c:
            r34 = 0
            goto L_0x0451
        L_0x044f:
            r34 = 1
        L_0x0451:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6 r6 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6
            r8 = r62
            r6.<init>(r8, r0, r4, r13)
            r8 = r66
            java.lang.Object r3 = r8.d(r3, r5, r6)
            r5 = r3
            androidx.compose.ui.layout.MeasureResult r5 = (androidx.compose.ui.layout.MeasureResult) r5
            r3 = r47
            java.util.List r12 = androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt.c(r3, r7, r0, r4)
            if (r50 == 0) goto L_0x0476
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x0473:
            r17 = r0
            goto L_0x0479
        L_0x0476:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x0473
        L_0x0479:
            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r20 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult
            r0 = r20
            r3 = r34
            r4 = r29
            r6 = r35
            r7 = r36
            r8 = r61
            r9 = r54
            r10 = r56
            r11 = r64
            r14 = r46
            r13 = r37
            r15 = r38
            r16 = r53
            r18 = r43
            r19 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.e(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, kotlin.jvm.functions.Function3):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }
}
