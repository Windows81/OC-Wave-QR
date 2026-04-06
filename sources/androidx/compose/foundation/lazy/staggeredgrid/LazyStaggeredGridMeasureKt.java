package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class LazyStaggeredGridMeasureKt {
    public static final List a(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque[] arrayDequeArr, int[] iArr, int i2, int i3, int i4) {
        int i5 = 0;
        for (ArrayDeque size : arrayDequeArr) {
            i5 += size.size();
        }
        ArrayList arrayList = new ArrayList(i5);
        while (true) {
            int length = arrayDequeArr.length;
            int i6 = 0;
            while (i6 < length) {
                if (!arrayDequeArr[i6].isEmpty()) {
                    int length2 = arrayDequeArr.length;
                    int i7 = -1;
                    int i8 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < length2; i9++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDequeArr[i9].o();
                        int index = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getIndex() : Integer.MAX_VALUE;
                        if (i8 > index) {
                            i7 = i9;
                            i8 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDequeArr[i7].removeFirst();
                    if (lazyStaggeredGridMeasuredItem2.c() == i7) {
                        long a2 = SpanRange.a(lazyStaggeredGridMeasuredItem2.c(), lazyStaggeredGridMeasuredItem2.j());
                        int g2 = g(iArr, a2);
                        int i10 = lazyStaggeredGridMeasureContext.p().a()[i7];
                        if (lazyStaggeredGridMeasuredItem2.q() + g2 >= i3 && g2 <= i4) {
                            lazyStaggeredGridMeasuredItem2.t(g2, i10, i2);
                            arrayList.add(lazyStaggeredGridMeasuredItem2);
                        }
                        int i11 = (int) (a2 & 4294967295L);
                        for (int i12 = (int) (a2 >> 32); i12 < i11; i12++) {
                            iArr[i12] = lazyStaggeredGridMeasuredItem2.h() + g2;
                        }
                    }
                } else {
                    i6++;
                }
            }
            return arrayList;
        }
    }

    public static final void b(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i2) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                while (true) {
                    if (iArr[length] < i2 && lazyStaggeredGridMeasureContext.j().a(iArr[length], length)) {
                        break;
                    }
                    iArr[length] = c(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
                if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.t(lazyStaggeredGridMeasureContext.h(), iArr[length])) {
                    lazyStaggeredGridMeasureContext.j().l(iArr[length], length);
                }
                if (i3 >= 0) {
                    length = i3;
                } else {
                    return;
                }
            }
        }
    }

    public static final int c(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i2, int i3) {
        return lazyStaggeredGridMeasureContext.j().f(i2, i3);
    }

    public static final int d(int[] iArr) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i3 < i5) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    public static final int e(int[] iArr, int i2) {
        int length = iArr.length;
        int i3 = -1;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i2 + 1;
            int i7 = iArr[i5];
            if (i6 <= i7 && i7 < i4) {
                i3 = i5;
                i4 = i7;
            }
        }
        return i3;
    }

    public static /* synthetic */ int f(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        return e(iArr, i2);
    }

    public static final int g(int[] iArr, long j2) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = Integer.MIN_VALUE;
        for (int i4 = (int) (j2 >> 32); i4 < i2; i4++) {
            i3 = Math.max(i3, iArr[i4]);
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0235, code lost:
        r3 = f(r9, 0, 1, (java.lang.Object) null);
        r0 = kotlin.collections.ArraysKt.O0(r7) + 1;
        r15 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0240, code lost:
        if (r0 < r15) goto L_0x095a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f0, code lost:
        r2 = f(r12, 0, 1, (java.lang.Object) null);
        r3 = d(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02fb, code lost:
        if (r2 == r3) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0301, code lost:
        if (r12[r2] != r12[r3]) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0303, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0305, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0306, code lost:
        r3 = r28[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0309, code lost:
        if (r3 != -1) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x030b, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x030c, code lost:
        r3 = c(r6, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0310, code lost:
        if (r3 >= 0) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0312, code lost:
        r13 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0314, code lost:
        if (r0 != false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x031a, code lost:
        if (j(r13, r6, r12, r2) == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x031d, code lost:
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0320, code lost:
        if (r55 == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0322, code lost:
        r51.j().j();
        r0 = r13.length;
        r1 = new int[r0];
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x032d, code lost:
        if (r3 >= r0) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x032f, code lost:
        r1[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0335, code lost:
        r0 = r12.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0339, code lost:
        if (r4 >= r0) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x033b, code lost:
        r3[r4] = r12[r2];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0349, code lost:
        return h(r6, r31, r1, r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x034a, code lost:
        r52 = r7;
        r25 = r8;
        r29 = r14;
        r26 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0354, code lost:
        r13 = r28;
        r11 = r31;
        r52 = r7;
        r25 = r8;
        r7 = r6.r(r51.h(), r3, r2);
        r2 = r51.j();
        r29 = r14;
        r26 = r15;
        r10 = (int) (r7 & 4294967295L);
        r14 = (int) (r7 >> 32);
        r15 = r10 - r14;
        r54 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0377, code lost:
        if (r15 == 1) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0379, code lost:
        r0 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x037b, code lost:
        r0 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x037c, code lost:
        r2.l(r3, r0);
        r0 = r51.n().e(r3, r7);
        r2 = g(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x038c, code lost:
        if (r15 == 1) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x038e, code lost:
        r7 = r51.j().g(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0397, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0398, code lost:
        r8 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x039a, code lost:
        if (r14 >= r10) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x039e, code lost:
        if (r12[r14] == r2) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03a0, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03a1, code lost:
        r5[r14].addFirst(r0);
        r13[r14] = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03a8, code lost:
        if (r7 != null) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03aa, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ac, code lost:
        r15 = r7[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03ae, code lost:
        r12[r14] = (r2 + r0.h()) + r15;
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x055b, code lost:
        if ((r0 != null ? r0.getIndex() : -1) > r2) goto L_0x055d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0636, code lost:
        r1 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r1.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x095a, code lost:
        r35 = r53;
        r19 = r54;
        r1 = r7;
        r33 = r14;
        r32 = r15;
        r34 = r24;
        r14 = r27;
        r24 = r28;
        r11 = r31;
        r15 = r6;
        r6 = r8;
        r2 = r15.r(r51.h(), r0, r3);
        r12 = r51.j();
        r7 = (int) (r2 & 4294967295L);
        r8 = (int) (r2 >> 32);
        r13 = r7 - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0984, code lost:
        if (r13 == 1) goto L_0x0989;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0986, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0989, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x098b, code lost:
        if (r20 == false) goto L_0x098f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x098d, code lost:
        r14 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x098f, code lost:
        r14 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0990, code lost:
        r12.l(r0, r14);
        r12 = r51.n().e(r0, r2);
        r2 = g(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x09a0, code lost:
        if (r13 == 1) goto L_0x09a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x09a2, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x09a4, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x09a5, code lost:
        if (r13 == false) goto L_0x09b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x09a7, code lost:
        r13 = r51.j().g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x09af, code lost:
        if (r13 != null) goto L_0x09b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x09b1, code lost:
        r13 = new int[r51.i()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x09b8, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x09b9, code lost:
        r14 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x09ba, code lost:
        if (r14 >= r7) goto L_0x09d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x09bc, code lost:
        if (r13 == null) goto L_0x09c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x09be, code lost:
        r13[r14] = r2 - r9[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x09c4, code lost:
        r1[r14] = r0;
        r9[r14] = r2 + r12.h();
        r5[r14].addLast(r12);
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x09d7, code lost:
        r51.j().k(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x09de, code lost:
        if (r2 >= r10) goto L_0x09e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x09e2, code lost:
        if (r9[r8] > r10) goto L_0x09e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x09e4, code lost:
        r12.u(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021d, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05b7 A[LOOP:24: B:244:0x052f->B:274:0x05b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x06fd  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0702 A[LOOP:27: B:304:0x0663->B:342:0x0702, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x071e  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0770  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x07ff  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0851  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x08be  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x08d3  */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x05b4 A[EDGE_INSN: B:528:0x05b4->B:273:0x05b4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x070e A[EDGE_INSN: B:536:0x070e->B:344:0x070e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x08d0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult h(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r51, int r52, int[] r53, int[] r54, boolean r55) {
        /*
            r6 = r51
            r0 = r52
            r1 = r53
            r2 = r54
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope r15 = r51.m()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r3 = r51.h()
            int r14 = r3.b()
            r16 = 32
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r14 <= 0) goto L_0x0023
            int r3 = r51.i()
            if (r3 != 0) goto L_0x002a
        L_0x0023:
            r32 = r14
            r34 = r15
            r15 = r6
            goto L_0x09fb
        L_0x002a:
            int r3 = r1.length
            int[] r13 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r3 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.h(r13, r3)
            int r1 = r2.length
            int[] r12 = java.util.Arrays.copyOf(r2, r1)
            kotlin.jvm.internal.Intrinsics.h(r12, r3)
            b(r6, r13, r14)
            int r1 = -r0
            l(r12, r1)
            int r4 = r51.i()
            kotlin.collections.ArrayDeque[] r5 = new kotlin.collections.ArrayDeque[r4]
            r1 = 0
        L_0x004a:
            if (r1 >= r4) goto L_0x0058
            kotlin.collections.ArrayDeque r2 = new kotlin.collections.ArrayDeque
            r8 = 16
            r2.<init>(r8)
            r5[r1] = r2
            int r1 = r1 + 1
            goto L_0x004a
        L_0x0058:
            int r1 = r51.c()
            int r1 = -r1
            l(r12, r1)
            r1 = 0
        L_0x0061:
            boolean r2 = i(r13, r12, r6)
            if (r2 == 0) goto L_0x00ea
            int r2 = d(r13)
            r8 = r13[r2]
            int r9 = r12.length
            r10 = 0
        L_0x006f:
            if (r10 >= r9) goto L_0x0082
            r7 = r13[r10]
            r11 = r13[r2]
            if (r7 == r11) goto L_0x007f
            r7 = r12[r10]
            r11 = r12[r2]
            if (r7 >= r11) goto L_0x007f
            r12[r10] = r11
        L_0x007f:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x0082:
            int r7 = c(r6, r8, r2)
            if (r7 >= 0) goto L_0x008d
            r25 = r14
            r24 = r15
            goto L_0x00ef
        L_0x008d:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r8 = r51.h()
            long r8 = r6.r(r8, r7, r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r51.j()
            long r10 = r8 & r17
            int r10 = (int) r10
            r25 = r14
            r24 = r15
            long r14 = r8 >> r16
            int r11 = (int) r14
            int r14 = r10 - r11
            r15 = 1
            if (r14 == r15) goto L_0x00aa
            r15 = -2
            goto L_0x00ab
        L_0x00aa:
            r15 = r11
        L_0x00ab:
            r2.l(r7, r15)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r2 = r51.n()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r2 = r2.e(r7, r8)
            int r8 = g(r12, r8)
            r9 = 1
            if (r14 == r9) goto L_0x00c6
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r9 = r51.j()
            int[] r9 = r9.g(r7)
            goto L_0x00c7
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            if (r11 >= r10) goto L_0x00e4
            r13[r11] = r7
            if (r9 != 0) goto L_0x00cf
            r14 = 0
            goto L_0x00d1
        L_0x00cf:
            r14 = r9[r11]
        L_0x00d1:
            int r15 = r2.h()
            int r15 = r15 + r8
            int r15 = r15 + r14
            r12[r11] = r15
            int r14 = r51.k()
            int r14 = r14 + r15
            if (r14 > 0) goto L_0x00e1
            r1 = 1
        L_0x00e1:
            int r11 = r11 + 1
            goto L_0x00c7
        L_0x00e4:
            r15 = r24
            r14 = r25
            goto L_0x0061
        L_0x00ea:
            r25 = r14
            r24 = r15
            r2 = -1
        L_0x00ef:
            int r7 = r51.c()
            int r15 = -r7
            r7 = 0
            r8 = r12[r7]
            if (r8 >= r15) goto L_0x0101
            int r9 = r15 - r8
            int r8 = r15 - r8
            l(r12, r8)
            int r0 = r0 - r9
        L_0x0101:
            int r8 = r51.c()
            l(r12, r8)
            r8 = -1
            if (r2 != r8) goto L_0x010f
            int r2 = kotlin.collections.ArraysKt.r0(r13, r7)
        L_0x010f:
            if (r2 == r8) goto L_0x013f
            boolean r7 = j(r13, r6, r12, r2)
            if (r7 == 0) goto L_0x013f
            if (r55 == 0) goto L_0x013f
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r1 = r51.j()
            r1.j()
            int r1 = r13.length
            int[] r3 = new int[r1]
            r4 = 0
        L_0x0124:
            if (r4 >= r1) goto L_0x012c
            r3[r4] = r8
            int r4 = r4 + 1
            r8 = -1
            goto L_0x0124
        L_0x012c:
            int r1 = r12.length
            int[] r4 = new int[r1]
            r5 = 0
        L_0x0130:
            if (r5 >= r1) goto L_0x0139
            r7 = r12[r2]
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x0130
        L_0x0139:
            r5 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = h(r6, r0, r3, r4, r5)
            return r0
        L_0x013f:
            int r2 = r13.length
            int[] r7 = java.util.Arrays.copyOf(r13, r2)
            kotlin.jvm.internal.Intrinsics.h(r7, r3)
            int r8 = r12.length
            int[] r9 = new int[r8]
            r2 = 0
        L_0x014b:
            if (r2 >= r8) goto L_0x0155
            r10 = r12[r2]
            int r10 = -r10
            r9[r2] = r10
            int r2 = r2 + 1
            goto L_0x014b
        L_0x0155:
            int r2 = r51.l()
            int r10 = r15 + r2
            int r2 = r51.k()
            int r11 = r51.a()
            int r2 = r2 + r11
            r11 = 0
            int r14 = kotlin.ranges.RangesKt.e(r2, r11)
            r53 = r1
            r1 = 1
            r2 = 0
            int r26 = f(r7, r11, r1, r2)
            r30 = r53
            r2 = r26
            r1 = 0
        L_0x0176:
            r11 = -1
            if (r2 == r11) goto L_0x0200
            int r11 = r51.i()
            if (r1 >= r11) goto L_0x0200
            r11 = r7[r2]
            int r26 = e(r7, r11)
            int r1 = r1 + 1
            r52 = r1
            if (r11 < 0) goto L_0x01fc
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r1 = r51.h()
            long r1 = r6.r(r1, r11, r2)
            r53 = r15
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r15 = r51.n()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r15 = r15.e(r11, r1)
            r27 = r3
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r3 = r51.j()
            r54 = r12
            r28 = r13
            long r12 = r1 & r17
            int r12 = (int) r12
            r29 = r14
            long r13 = r1 >> r16
            int r13 = (int) r13
            int r14 = r12 - r13
            r31 = r0
            r0 = 1
            if (r14 == r0) goto L_0x01b8
            r0 = -2
            goto L_0x01b9
        L_0x01b8:
            r0 = r13
        L_0x01b9:
            r3.l(r11, r0)
            int r0 = g(r9, r1)
            r1 = r13
        L_0x01c1:
            if (r1 >= r12) goto L_0x01d4
            int r2 = r15.h()
            int r2 = r2 + r0
            r9[r1] = r2
            r7[r1] = r11
            r2 = r5[r1]
            r2.addLast(r15)
            int r1 = r1 + 1
            goto L_0x01c1
        L_0x01d4:
            if (r0 >= r10) goto L_0x01e2
            r0 = r9[r13]
            if (r0 > r10) goto L_0x01e2
            r0 = 0
            r15.u(r0)
            r0 = 1
            r30 = 1
            goto L_0x01e3
        L_0x01e2:
            r0 = 1
        L_0x01e3:
            if (r14 == r0) goto L_0x01f9
            int r1 = r51.i()
        L_0x01e9:
            r15 = r53
            r12 = r54
            r2 = r26
            r3 = r27
            r13 = r28
            r14 = r29
            r0 = r31
            goto L_0x0176
        L_0x01f9:
            r1 = r52
            goto L_0x01e9
        L_0x01fc:
            r2 = r26
            goto L_0x0176
        L_0x0200:
            r31 = r0
            r27 = r3
            r54 = r12
            r28 = r13
            r29 = r14
            r53 = r15
        L_0x020c:
            r0 = 0
        L_0x020d:
            if (r0 >= r8) goto L_0x0221
            r1 = r9[r0]
            r14 = r29
            if (r1 < r14) goto L_0x021d
            if (r1 > 0) goto L_0x0218
            goto L_0x021d
        L_0x0218:
            int r0 = r0 + 1
            r29 = r14
            goto L_0x020d
        L_0x021d:
            r0 = 0
            r1 = 0
            r2 = 1
            goto L_0x0235
        L_0x0221:
            r14 = r29
            r0 = 0
        L_0x0224:
            if (r0 >= r4) goto L_0x021d
            r1 = r5[r0]
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0232
            r15 = r25
            r2 = 1
            goto L_0x0242
        L_0x0232:
            int r0 = r0 + 1
            goto L_0x0224
        L_0x0235:
            int r3 = f(r9, r0, r2, r1)
            int r0 = kotlin.collections.ArraysKt.O0(r7)
            int r0 = r0 + r2
            r15 = r25
            if (r0 < r15) goto L_0x095a
        L_0x0242:
            r0 = 0
        L_0x0243:
            if (r0 >= r4) goto L_0x0299
            r1 = r5[r0]
        L_0x0247:
            int r3 = r1.size()
            if (r3 <= r2) goto L_0x0285
            java.lang.Object r3 = r1.first()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r3 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r3
            boolean r3 = r3.r()
            if (r3 != 0) goto L_0x0285
            java.lang.Object r3 = r1.removeFirst()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r3 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r3
            int r10 = r3.j()
            if (r10 == r2) goto L_0x0272
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r51.j()
            int r10 = r3.getIndex()
            int[] r2 = r2.g(r10)
            goto L_0x0273
        L_0x0272:
            r2 = 0
        L_0x0273:
            r10 = r54[r0]
            int r3 = r3.h()
            if (r2 != 0) goto L_0x027d
            r2 = 0
            goto L_0x027f
        L_0x027d:
            r2 = r2[r0]
        L_0x027f:
            int r3 = r3 + r2
            int r10 = r10 - r3
            r54[r0] = r10
            r2 = 1
            goto L_0x0247
        L_0x0285:
            java.lang.Object r1 = r1.o()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r1 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r1
            if (r1 == 0) goto L_0x0292
            int r1 = r1.getIndex()
            goto L_0x0293
        L_0x0292:
            r1 = -1
        L_0x0293:
            r28[r0] = r1
            int r0 = r0 + 1
            r2 = 1
            goto L_0x0243
        L_0x0299:
            int r0 = r7.length
            r1 = 0
        L_0x029b:
            if (r1 >= r0) goto L_0x02af
            r2 = r7[r1]
            int r3 = r15 + -1
            if (r2 != r3) goto L_0x02ac
            int r0 = r51.l()
            int r0 = -r0
            l(r9, r0)
            goto L_0x02af
        L_0x02ac:
            int r1 = r1 + 1
            goto L_0x029b
        L_0x02af:
            r0 = 0
        L_0x02b0:
            if (r0 >= r8) goto L_0x02cf
            r1 = r9[r0]
            int r2 = r51.k()
            if (r1 >= r2) goto L_0x02bd
            int r0 = r0 + 1
            goto L_0x02b0
        L_0x02bd:
            r12 = r54
            r52 = r7
            r25 = r8
            r29 = r14
            r26 = r15
            r13 = r28
            r1 = r31
            r11 = r1
            r7 = 0
            goto L_0x040b
        L_0x02cf:
            int r0 = d(r9)
            int r1 = r51.k()
            r0 = r9[r0]
            int r1 = r1 - r0
            int r0 = -r1
            r12 = r54
            l(r12, r0)
            l(r9, r1)
            r0 = 0
        L_0x02e4:
            int r2 = r12.length
            r3 = 0
        L_0x02e6:
            if (r3 >= r2) goto L_0x03da
            r10 = r12[r3]
            int r11 = r51.c()
            if (r10 >= r11) goto L_0x03ca
            r10 = 0
            r11 = 0
            r13 = 1
            int r2 = f(r12, r10, r13, r11)
            int r3 = d(r28)
            if (r2 == r3) goto L_0x0306
            r10 = r12[r2]
            r11 = r12[r3]
            if (r10 != r11) goto L_0x0305
            r2 = r3
            goto L_0x0306
        L_0x0305:
            r0 = 1
        L_0x0306:
            r3 = r28[r2]
            r10 = -1
            if (r3 != r10) goto L_0x030c
            r3 = r15
        L_0x030c:
            int r3 = c(r6, r3, r2)
            if (r3 >= 0) goto L_0x0354
            r13 = r28
            if (r0 != 0) goto L_0x0320
            boolean r3 = j(r13, r6, r12, r2)
            if (r3 == 0) goto L_0x031d
            goto L_0x0320
        L_0x031d:
            r11 = r31
            goto L_0x034a
        L_0x0320:
            if (r55 == 0) goto L_0x031d
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r0 = r51.j()
            r0.j()
            int r0 = r13.length
            int[] r1 = new int[r0]
            r3 = 0
        L_0x032d:
            if (r3 >= r0) goto L_0x0335
            r4 = -1
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x032d
        L_0x0335:
            int r0 = r12.length
            int[] r3 = new int[r0]
            r4 = 0
        L_0x0339:
            if (r4 >= r0) goto L_0x0342
            r5 = r12[r2]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L_0x0339
        L_0x0342:
            r11 = r31
            r4 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = h(r6, r11, r1, r3, r4)
            return r0
        L_0x034a:
            r52 = r7
            r25 = r8
            r29 = r14
            r26 = r15
            goto L_0x03e6
        L_0x0354:
            r13 = r28
            r11 = r31
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r10 = r51.h()
            r52 = r7
            r25 = r8
            long r7 = r6.r(r10, r3, r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r51.j()
            r29 = r14
            r26 = r15
            long r14 = r7 & r17
            int r10 = (int) r14
            long r14 = r7 >> r16
            int r14 = (int) r14
            int r15 = r10 - r14
            r54 = r0
            r0 = 1
            if (r15 == r0) goto L_0x037b
            r0 = -2
            goto L_0x037c
        L_0x037b:
            r0 = r14
        L_0x037c:
            r2.l(r3, r0)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r0 = r51.n()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r0 = r0.e(r3, r7)
            int r2 = g(r12, r7)
            r7 = 1
            if (r15 == r7) goto L_0x0397
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r7 = r51.j()
            int[] r7 = r7.g(r3)
            goto L_0x0398
        L_0x0397:
            r7 = 0
        L_0x0398:
            r8 = r54
        L_0x039a:
            if (r14 >= r10) goto L_0x03bb
            r15 = r12[r14]
            if (r15 == r2) goto L_0x03a1
            r8 = 1
        L_0x03a1:
            r15 = r5[r14]
            r15.addFirst(r0)
            r13[r14] = r3
            if (r7 != 0) goto L_0x03ac
            r15 = 0
            goto L_0x03ae
        L_0x03ac:
            r15 = r7[r14]
        L_0x03ae:
            int r28 = r0.h()
            int r28 = r2 + r28
            int r28 = r28 + r15
            r12[r14] = r28
            int r14 = r14 + 1
            goto L_0x039a
        L_0x03bb:
            r7 = r52
            r0 = r8
            r31 = r11
            r28 = r13
            r8 = r25
            r15 = r26
            r14 = r29
            goto L_0x02e4
        L_0x03ca:
            r52 = r7
            r25 = r8
            r29 = r14
            r26 = r15
            r13 = r28
            r11 = r31
            int r3 = r3 + 1
            goto L_0x02e6
        L_0x03da:
            r52 = r7
            r25 = r8
            r29 = r14
            r26 = r15
            r13 = r28
            r11 = r31
        L_0x03e6:
            if (r0 == 0) goto L_0x03f7
            if (r55 == 0) goto L_0x03f7
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r0 = r51.j()
            r0.j()
            r0 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = h(r6, r11, r13, r12, r0)
            return r0
        L_0x03f7:
            r0 = 0
            int r1 = r1 + r11
            r2 = 1
            r7 = 0
            int r3 = f(r12, r0, r2, r7)
            r0 = r12[r3]
            if (r0 >= 0) goto L_0x040b
            int r1 = r1 + r0
            l(r9, r0)
            int r0 = -r0
            l(r12, r0)
        L_0x040b:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r0 = r51.s()
            boolean r2 = r24.w1()
            float r0 = r0.L(r2)
            int r2 = java.lang.Math.round(r0)
            int r2 = kotlin.math.MathKt.a(r2)
            int r3 = kotlin.math.MathKt.a(r1)
            if (r2 != r3) goto L_0x0436
            int r2 = java.lang.Math.round(r0)
            int r2 = java.lang.Math.abs(r2)
            int r3 = java.lang.Math.abs(r1)
            if (r2 < r3) goto L_0x0436
            float r2 = (float) r1
            r15 = r2
            goto L_0x0437
        L_0x0436:
            r15 = r0
        L_0x0437:
            float r0 = r0 - r15
            boolean r2 = r24.w1()
            r3 = 0
            if (r2 == 0) goto L_0x044b
            if (r1 <= r11) goto L_0x044b
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x044b
            int r1 = r1 - r11
            float r1 = (float) r1
            float r1 = r1 + r0
            r20 = r1
            goto L_0x044d
        L_0x044b:
            r20 = r3
        L_0x044d:
            int r0 = r12.length
            int[] r8 = java.util.Arrays.copyOf(r12, r0)
            r14 = r27
            kotlin.jvm.internal.Intrinsics.h(r8, r14)
            int r0 = r8.length
            r1 = 0
        L_0x0459:
            if (r1 >= r0) goto L_0x0463
            r2 = r8[r1]
            int r2 = -r2
            r8[r1] = r2
            int r1 = r1 + 1
            goto L_0x0459
        L_0x0463:
            int r0 = r51.c()
            int r1 = r51.l()
            if (r0 <= r1) goto L_0x04b7
            r0 = 0
        L_0x046e:
            if (r0 >= r4) goto L_0x04b7
            r1 = r5[r0]
            int r2 = r1.size()
            r3 = 0
        L_0x0477:
            if (r3 >= r2) goto L_0x04b4
            java.lang.Object r10 = r1.get(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r10 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r10
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r11 = r51.j()
            int r14 = r10.getIndex()
            int[] r11 = r11.g(r14)
            int r10 = r10.h()
            if (r11 != 0) goto L_0x0493
            r11 = 0
            goto L_0x0495
        L_0x0493:
            r11 = r11[r0]
        L_0x0495:
            int r10 = r10 + r11
            int r11 = kotlin.collections.CollectionsKt.o(r1)
            if (r3 == r11) goto L_0x04b4
            r11 = r12[r0]
            if (r11 == 0) goto L_0x04b4
            if (r11 < r10) goto L_0x04b4
            int r11 = r11 - r10
            r12[r0] = r11
            int r3 = r3 + 1
            java.lang.Object r10 = r1.get(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r10 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r10
            int r10 = r10.getIndex()
            r13[r0] = r10
            goto L_0x0477
        L_0x04b4:
            int r0 = r0 + 1
            goto L_0x046e
        L_0x04b7:
            int r0 = r51.c()
            int r1 = r51.a()
            int r10 = r0 + r1
            boolean r0 = r51.v()
            if (r0 == 0) goto L_0x04d1
            long r0 = r51.d()
            int r0 = androidx.compose.ui.unit.Constraints.l(r0)
        L_0x04cf:
            r11 = r0
            goto L_0x04df
        L_0x04d1:
            long r0 = r51.d()
            int r2 = kotlin.collections.ArraysKt.O0(r9)
            int r2 = r2 + r10
            int r0 = androidx.compose.ui.unit.ConstraintsKt.g(r0, r2)
            goto L_0x04cf
        L_0x04df:
            boolean r0 = r51.v()
            if (r0 == 0) goto L_0x04f4
            long r0 = r51.d()
            int r2 = kotlin.collections.ArraysKt.O0(r9)
            int r2 = r2 + r10
            int r0 = androidx.compose.ui.unit.ConstraintsKt.f(r0, r2)
        L_0x04f2:
            r14 = r0
            goto L_0x04fd
        L_0x04f4:
            long r0 = r51.d()
            int r0 = androidx.compose.ui.unit.Constraints.k(r0)
            goto L_0x04f2
        L_0x04fd:
            boolean r0 = r51.v()
            if (r0 == 0) goto L_0x0505
            r0 = r14
            goto L_0x0506
        L_0x0505:
            r0 = r11
        L_0x0506:
            int r1 = r51.k()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r51.c()
            int r0 = r0 - r1
            int r1 = r51.a()
            int r3 = r0 + r1
            r0 = 0
            r1 = r8[r0]
            java.util.List r0 = r51.o()
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r21 = -1
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x05c2
            r27 = r7
        L_0x052f:
            int r28 = r2 + -1
            java.lang.Object r2 = r0.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r7 = r51.j()
            int r7 = r7.h(r2)
            r54 = r0
            r0 = -2
            if (r7 == r0) goto L_0x0561
            r0 = -1
            if (r7 == r0) goto L_0x0561
            r0 = r5[r7]
            java.lang.Object r0 = r0.o()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r0
            if (r0 == 0) goto L_0x055a
            int r0 = r0.getIndex()
            goto L_0x055b
        L_0x055a:
            r0 = -1
        L_0x055b:
            if (r0 <= r2) goto L_0x055f
        L_0x055d:
            r0 = 1
            goto L_0x057f
        L_0x055f:
            r0 = 0
            goto L_0x057f
        L_0x0561:
            r0 = 0
        L_0x0562:
            if (r0 >= r4) goto L_0x055d
            r7 = r5[r0]
            java.lang.Object r7 = r7.o()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r7 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r7
            if (r7 == 0) goto L_0x0573
            int r7 = r7.getIndex()
            goto L_0x0574
        L_0x0573:
            r7 = -1
        L_0x0574:
            if (r7 <= r2) goto L_0x0578
            r7 = 1
            goto L_0x0579
        L_0x0578:
            r7 = 0
        L_0x0579:
            if (r7 != 0) goto L_0x057c
            goto L_0x055f
        L_0x057c:
            int r0 = r0 + 1
            goto L_0x0562
        L_0x057f:
            if (r0 == 0) goto L_0x05ae
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r0 = r51.h()
            r46 = r13
            r55 = r14
            r7 = 0
            long r13 = r6.r(r0, r2, r7)
            if (r27 != 0) goto L_0x0595
            java.util.ArrayList r27 = new java.util.ArrayList
            r27.<init>()
        L_0x0595:
            r0 = r27
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r7 = r51.n()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r2 = r7.e(r2, r13)
            int r7 = r2.h()
            int r1 = r1 - r7
            r7 = 0
            r2.t(r1, r7, r3)
            r0.add(r2)
            r27 = r0
            goto L_0x05b2
        L_0x05ae:
            r46 = r13
            r55 = r14
        L_0x05b2:
            if (r28 >= 0) goto L_0x05b7
            r2 = r27
            goto L_0x05c7
        L_0x05b7:
            r0 = r54
            r14 = r55
            r2 = r28
            r13 = r46
            r7 = 0
            goto L_0x052f
        L_0x05c2:
            r46 = r13
            r55 = r14
            r2 = 0
        L_0x05c7:
            if (r2 != 0) goto L_0x05cd
            java.util.List r2 = kotlin.collections.CollectionsKt.m()
        L_0x05cd:
            r7 = r2
            r0 = r51
            r1 = r5
            r2 = r8
            r13 = r3
            r4 = r53
            r5 = r29
            java.util.List r0 = a(r0, r1, r2, r3, r4, r5)
            r1 = 0
            r2 = r8[r1]
            java.lang.Object r1 = kotlin.collections.CollectionsKt.q0(r0)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r1 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r1
            if (r1 == 0) goto L_0x05ec
            int r1 = r1.getIndex()
            r8 = r1
            goto L_0x05ed
        L_0x05ec:
            r8 = -1
        L_0x05ed:
            boolean r1 = r24.w1()
            if (r1 == 0) goto L_0x0709
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r1 = r51.b()
            if (r1 == 0) goto L_0x0709
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r1 = r51.b()
            java.util.List r1 = r1.k()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0709
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r1 = r51.b()
            java.util.List r1 = r1.k()
            int r3 = r1.size()
            r4 = 1
            int r3 = r3 - r4
        L_0x0617:
            r4 = -1
            if (r4 >= r3) goto L_0x0640
            java.lang.Object r4 = r1.get(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r4
            int r4 = r4.getIndex()
            if (r4 <= r8) goto L_0x063d
            if (r3 == 0) goto L_0x0636
            int r4 = r3 + -1
            java.lang.Object r4 = r1.get(r4)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r4
            int r4 = r4.getIndex()
            if (r4 > r8) goto L_0x063d
        L_0x0636:
            java.lang.Object r1 = r1.get(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r1 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r1
            goto L_0x0641
        L_0x063d:
            int r3 = r3 + -1
            goto L_0x0617
        L_0x0640:
            r1 = 0
        L_0x0641:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r3 = r51.b()
            java.util.List r3 = r3.k()
            java.lang.Object r3 = kotlin.collections.CollectionsKt.p0(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r3 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r3
            if (r1 == 0) goto L_0x0709
            int r1 = r1.getIndex()
            int r3 = r3.getIndex()
            int r14 = r26 + -1
            int r3 = java.lang.Math.min(r3, r14)
            if (r1 > r3) goto L_0x0709
            r4 = r2
            r2 = 0
        L_0x0663:
            if (r2 == 0) goto L_0x068c
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r8 = 0
        L_0x066d:
            if (r8 >= r5) goto L_0x0686
            java.lang.Object r14 = r2.get(r8)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r14 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r14
            int r14 = r14.getIndex()
            if (r14 != r1) goto L_0x067d
            r14 = 1
            goto L_0x067e
        L_0x067d:
            r14 = 0
        L_0x067e:
            if (r14 == 0) goto L_0x0683
            r5 = 1
        L_0x0681:
            r8 = 1
            goto L_0x0688
        L_0x0683:
            int r8 = r8 + 1
            goto L_0x066d
        L_0x0686:
            r5 = 0
            goto L_0x0681
        L_0x0688:
            if (r5 != r8) goto L_0x068c
            r5 = 1
            goto L_0x068d
        L_0x068c:
            r5 = 0
        L_0x068d:
            if (r5 != 0) goto L_0x06fd
            if (r2 != 0) goto L_0x0696
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0696:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r5 = r51.b()
            java.util.List r5 = r5.k()
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r14 = 0
        L_0x06a6:
            if (r14 >= r8) goto L_0x06c3
            java.lang.Object r27 = r5.get(r14)
            r28 = r27
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r28 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r28
            r54 = r5
            int r5 = r28.getIndex()
            if (r5 != r1) goto L_0x06ba
            r5 = 1
            goto L_0x06bb
        L_0x06ba:
            r5 = 0
        L_0x06bb:
            if (r5 == 0) goto L_0x06be
            goto L_0x06c5
        L_0x06be:
            int r14 = r14 + 1
            r5 = r54
            goto L_0x06a6
        L_0x06c3:
            r27 = 0
        L_0x06c5:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r27 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r27
            if (r27 == 0) goto L_0x06ce
            int r5 = r27.c()
            goto L_0x06cf
        L_0x06ce:
            r5 = 0
        L_0x06cf:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r8 = r51.h()
            r54 = r10
            r14 = r11
            long r10 = r6.r(r8, r1, r5)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r8 = r51.n()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r8 = r8.e(r1, r10)
            r2.add(r8)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots r10 = r51.p()
            int[] r10 = r10.a()
            int r11 = r10.length
            if (r11 <= r5) goto L_0x06f3
            r5 = r10[r5]
            goto L_0x06f4
        L_0x06f3:
            r5 = 0
        L_0x06f4:
            r8.t(r4, r5, r13)
            int r5 = r8.h()
            int r4 = r4 + r5
            goto L_0x0700
        L_0x06fd:
            r54 = r10
            r14 = r11
        L_0x0700:
            if (r1 == r3) goto L_0x070e
            int r1 = r1 + 1
            r10 = r54
            r11 = r14
            goto L_0x0663
        L_0x0709:
            r54 = r10
            r14 = r11
            r4 = r2
            r2 = 0
        L_0x070e:
            java.util.List r1 = r51.o()
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r5 = 0
            r31 = 0
        L_0x071c:
            if (r5 >= r3) goto L_0x07e1
            java.lang.Object r8 = r1.get(r5)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r11 = r26
            if (r8 < r11) goto L_0x0735
            r26 = r1
            r28 = r3
            r3 = 0
            r1 = r52
            goto L_0x079d
        L_0x0735:
            if (r2 == 0) goto L_0x0765
            int r10 = r2.size()
            r26 = r1
            r1 = 0
        L_0x073e:
            if (r1 >= r10) goto L_0x075b
            java.lang.Object r27 = r2.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r27 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r27
            r28 = r3
            int r3 = r27.getIndex()
            if (r3 != r8) goto L_0x0750
            r3 = 1
            goto L_0x0751
        L_0x0750:
            r3 = 0
        L_0x0751:
            if (r3 == 0) goto L_0x0756
            r1 = 1
        L_0x0754:
            r3 = 1
            goto L_0x075f
        L_0x0756:
            int r1 = r1 + 1
            r3 = r28
            goto L_0x073e
        L_0x075b:
            r28 = r3
            r1 = 0
            goto L_0x0754
        L_0x075f:
            if (r1 != r3) goto L_0x0763
            r1 = 1
            goto L_0x076a
        L_0x0763:
            r1 = 0
            goto L_0x076a
        L_0x0765:
            r26 = r1
            r28 = r3
            goto L_0x0763
        L_0x076a:
            if (r1 == 0) goto L_0x0770
        L_0x076c:
            r1 = r52
        L_0x076e:
            r3 = 0
            goto L_0x079d
        L_0x0770:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r1 = r51.j()
            int r1 = r1.h(r8)
            r3 = -2
            r10 = -1
            if (r1 == r3) goto L_0x0786
            if (r1 == r10) goto L_0x0786
            r1 = r52[r1]
            if (r1 >= r8) goto L_0x076c
            r1 = r52
        L_0x0784:
            r3 = 1
            goto L_0x079d
        L_0x0786:
            r1 = r52
            int r3 = r1.length
            r10 = 0
        L_0x078a:
            if (r10 >= r3) goto L_0x0784
            r27 = r3
            r3 = r1[r10]
            if (r3 >= r8) goto L_0x0794
            r3 = 1
            goto L_0x0795
        L_0x0794:
            r3 = 0
        L_0x0795:
            if (r3 != 0) goto L_0x0798
            goto L_0x076e
        L_0x0798:
            int r10 = r10 + 1
            r3 = r27
            goto L_0x078a
        L_0x079d:
            if (r3 == 0) goto L_0x07cb
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r3 = r51.h()
            r52 = r11
            r27 = r12
            r10 = 0
            long r11 = r6.r(r3, r8, r10)
            if (r31 != 0) goto L_0x07b3
            java.util.ArrayList r31 = new java.util.ArrayList
            r31.<init>()
        L_0x07b3:
            r3 = r31
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r6 = r51.n()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r6 = r6.e(r8, r11)
            r6.t(r4, r10, r13)
            int r8 = r6.h()
            int r4 = r4 + r8
            r3.add(r6)
            r31 = r3
            goto L_0x07cf
        L_0x07cb:
            r52 = r11
            r27 = r12
        L_0x07cf:
            int r5 = r5 + 1
            r6 = r51
            r12 = r27
            r3 = r28
            r50 = r26
            r26 = r52
            r52 = r1
            r1 = r50
            goto L_0x071c
        L_0x07e1:
            r1 = r52
            r27 = r12
            r52 = r26
            if (r31 != 0) goto L_0x07ed
            java.util.List r31 = kotlin.collections.CollectionsKt.m()
        L_0x07ed:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            r3.addAll(r7)
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            r3.addAll(r4)
            if (r2 == 0) goto L_0x0802
            r3.addAll(r2)
        L_0x0802:
            r2 = r31
            java.util.Collection r2 = (java.util.Collection) r2
            r3.addAll(r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = r51.s()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r31 = r2.v()
            int r2 = (int) r15
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r4 = r51.n()
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r36 = r4.f()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r37 = r51.n()
            boolean r38 = r51.v()
            int r40 = r51.i()
            boolean r39 = r24.w1()
            boolean r41 = r51.u()
            int r42 = kotlin.collections.ArraysKt.R0(r27)
            int r4 = kotlin.collections.ArraysKt.O0(r9)
            int r43 = r4 + r54
            kotlinx.coroutines.CoroutineScope r44 = r51.f()
            androidx.compose.ui.graphics.GraphicsContext r45 = r51.g()
            r32 = r2
            r33 = r14
            r34 = r55
            r35 = r3
            r31.m(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r2 = r24.w1()
            if (r2 != 0) goto L_0x08b5
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = r51.s()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r2 = r2.v()
            long r4 = r2.i()
            androidx.compose.ui.unit.IntSize$Companion r2 = androidx.compose.ui.unit.IntSize.f19170b
            long r6 = r2.a()
            boolean r2 = androidx.compose.ui.unit.IntSize.e(r4, r6)
            if (r2 != 0) goto L_0x08b5
            boolean r2 = r51.v()
            if (r2 == 0) goto L_0x0872
            r2 = r55
            goto L_0x0873
        L_0x0872:
            r2 = r14
        L_0x0873:
            long r6 = r51.d()
            long r10 = r4 >> r16
            int r8 = (int) r10
            r10 = r14
            int r8 = java.lang.Math.max(r10, r8)
            int r11 = androidx.compose.ui.unit.ConstraintsKt.g(r6, r8)
            long r6 = r51.d()
            long r4 = r4 & r17
            int r4 = (int) r4
            r5 = r55
            int r4 = java.lang.Math.max(r5, r4)
            int r14 = androidx.compose.ui.unit.ConstraintsKt.f(r6, r4)
            boolean r4 = r51.v()
            if (r4 == 0) goto L_0x089c
            r4 = r14
            goto L_0x089d
        L_0x089c:
            r4 = r11
        L_0x089d:
            if (r4 == r2) goto L_0x08b2
            int r2 = r3.size()
            r7 = 0
        L_0x08a4:
            if (r7 >= r2) goto L_0x08b2
            java.lang.Object r5 = r3.get(r7)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r5
            r5.v(r4)
            int r7 = r7 + 1
            goto L_0x08a4
        L_0x08b2:
            r2 = r11
            r5 = r14
            goto L_0x08b9
        L_0x08b5:
            r5 = r55
            r10 = r14
            r2 = r10
        L_0x08b9:
            r6 = r25
            r7 = 0
        L_0x08bc:
            if (r7 >= r6) goto L_0x08d0
            r4 = r9[r7]
            int r8 = r51.k()
            if (r4 <= r8) goto L_0x08c8
            r4 = 1
            goto L_0x08c9
        L_0x08c8:
            r4 = 0
        L_0x08c9:
            if (r4 == 0) goto L_0x08cd
            r4 = 1
            goto L_0x08d1
        L_0x08cd:
            int r7 = r7 + 1
            goto L_0x08bc
        L_0x08d0:
            r4 = 0
        L_0x08d1:
            if (r4 != 0) goto L_0x08ee
            int r4 = r1.length
            r7 = 0
        L_0x08d5:
            if (r7 >= r4) goto L_0x08e7
            r6 = r1[r7]
            int r14 = r52 + -1
            if (r6 >= r14) goto L_0x08df
            r6 = 1
            goto L_0x08e0
        L_0x08df:
            r6 = 0
        L_0x08e0:
            if (r6 != 0) goto L_0x08e4
            r1 = 0
            goto L_0x08e8
        L_0x08e4:
            int r7 = r7 + 1
            goto L_0x08d5
        L_0x08e7:
            r1 = 1
        L_0x08e8:
            if (r1 == 0) goto L_0x08eb
            goto L_0x08ee
        L_0x08eb:
            r23 = 0
            goto L_0x08f0
        L_0x08ee:
            r23 = 1
        L_0x08f0:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33 r11 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
            r1 = r51
            r4 = r24
            r11.<init>(r1, r3, r4)
            r12 = 4
            r13 = 0
            r10 = 0
            r7 = r4
            r8 = r2
            r9 = r5
            r3 = r52
            r19 = r27
            r24 = r46
            androidx.compose.ui.layout.MeasureResult r11 = androidx.compose.ui.layout.MeasureScope.R1(r7, r8, r9, r10, r11, r12, r13)
            boolean r14 = r51.v()
            r32 = r3
            r33 = r29
            long r2 = (long) r2
            long r2 = r2 << r16
            long r5 = (long) r5
            long r5 = r5 & r17
            long r2 = r2 | r5
            long r21 = androidx.compose.ui.unit.IntSize.c(r2)
            int r25 = r51.c()
            int r26 = r51.a()
            int r27 = r51.l()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots r16 = r51.p()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r2 = r51.h()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider r17 = r2.g()
            kotlinx.coroutines.CoroutineScope r28 = r51.f()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r1 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult
            r7 = r1
            r29 = 0
            r8 = r24
            r9 = r19
            r10 = r15
            r12 = r20
            r13 = r23
            r35 = r53
            r34 = r4
            r15 = r30
            r18 = r34
            r19 = r32
            r20 = r0
            r23 = r35
            r24 = r33
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x095a:
            r35 = r53
            r19 = r54
            r1 = r7
            r33 = r14
            r32 = r15
            r34 = r24
            r14 = r27
            r24 = r28
            r11 = r31
            r7 = -2
            r15 = r6
            r6 = r8
            r8 = -1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r2 = r51.h()
            long r2 = r15.r(r2, r0, r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r12 = r51.j()
            long r7 = r2 & r17
            int r7 = (int) r7
            long r13 = r2 >> r16
            int r8 = (int) r13
            int r13 = r7 - r8
            r14 = 1
            if (r13 == r14) goto L_0x0989
            r20 = r14
            goto L_0x098b
        L_0x0989:
            r20 = 0
        L_0x098b:
            if (r20 == 0) goto L_0x098f
            r14 = -2
            goto L_0x0990
        L_0x098f:
            r14 = r8
        L_0x0990:
            r12.l(r0, r14)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r12 = r51.n()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r12 = r12.e(r0, r2)
            int r2 = g(r9, r2)
            r3 = 1
            if (r13 == r3) goto L_0x09a4
            r13 = r3
            goto L_0x09a5
        L_0x09a4:
            r13 = 0
        L_0x09a5:
            if (r13 == 0) goto L_0x09b8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r13 = r51.j()
            int[] r13 = r13.g(r0)
            if (r13 != 0) goto L_0x09b9
            int r13 = r51.i()
            int[] r13 = new int[r13]
            goto L_0x09b9
        L_0x09b8:
            r13 = 0
        L_0x09b9:
            r14 = r8
        L_0x09ba:
            if (r14 >= r7) goto L_0x09d7
            if (r13 == 0) goto L_0x09c4
            r20 = r9[r14]
            int r20 = r2 - r20
            r13[r14] = r20
        L_0x09c4:
            r1[r14] = r0
            int r20 = r12.h()
            int r20 = r2 + r20
            r9[r14] = r20
            r3 = r5[r14]
            r3.addLast(r12)
            int r14 = r14 + 1
            r3 = 1
            goto L_0x09ba
        L_0x09d7:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r3 = r51.j()
            r3.k(r0, r13)
            if (r2 >= r10) goto L_0x09e8
            r0 = r9[r8]
            if (r0 > r10) goto L_0x09e8
            r0 = 0
            r12.u(r0)
        L_0x09e8:
            r7 = r1
            r8 = r6
            r31 = r11
            r6 = r15
            r54 = r19
            r28 = r24
            r25 = r32
            r29 = r33
            r24 = r34
            r53 = r35
            goto L_0x020c
        L_0x09fb:
            long r3 = r51.d()
            int r0 = androidx.compose.ui.unit.Constraints.n(r3)
            long r3 = r51.d()
            int r3 = androidx.compose.ui.unit.Constraints.m(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r4 = r51.s()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r35 = r4.v()
            java.util.ArrayList r39 = new java.util.ArrayList
            r39.<init>()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r4 = r51.n()
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r40 = r4.f()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r41 = r51.n()
            int r44 = r51.i()
            boolean r42 = r51.v()
            boolean r43 = r34.w1()
            boolean r45 = r51.u()
            kotlinx.coroutines.CoroutineScope r48 = r51.f()
            androidx.compose.ui.graphics.GraphicsContext r49 = r51.g()
            r46 = 0
            r47 = 0
            r36 = 0
            r37 = r0
            r38 = r3
            r35.m(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            boolean r4 = r34.w1()
            if (r4 != 0) goto L_0x0a7d
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r4 = r51.s()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r4 = r4.v()
            long r4 = r4.i()
            androidx.compose.ui.unit.IntSize$Companion r6 = androidx.compose.ui.unit.IntSize.f19170b
            long r6 = r6.a()
            boolean r6 = androidx.compose.ui.unit.IntSize.e(r4, r6)
            if (r6 != 0) goto L_0x0a7d
            long r6 = r51.d()
            long r8 = r4 >> r16
            int r0 = (int) r8
            int r0 = androidx.compose.ui.unit.ConstraintsKt.g(r6, r0)
            long r6 = r51.d()
            long r3 = r4 & r17
            int r3 = (int) r3
            int r3 = androidx.compose.ui.unit.ConstraintsKt.f(r6, r3)
        L_0x0a7d:
            r8 = r0
            r9 = r3
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1 r11 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1.f5101z
            r12 = 4
            r13 = 0
            r10 = 0
            r7 = r34
            androidx.compose.ui.layout.MeasureResult r11 = androidx.compose.ui.layout.MeasureScope.R1(r7, r8, r9, r10, r11, r12, r13)
            boolean r14 = r51.v()
            java.util.List r20 = kotlin.collections.CollectionsKt.m()
            long r3 = r51.d()
            int r0 = androidx.compose.ui.unit.Constraints.n(r3)
            long r3 = r51.d()
            int r3 = androidx.compose.ui.unit.Constraints.m(r3)
            long r4 = (long) r0
            long r4 = r4 << r16
            long r6 = (long) r3
            long r6 = r6 & r17
            long r3 = r4 | r6
            long r21 = androidx.compose.ui.unit.IntSize.c(r3)
            int r0 = r51.c()
            int r0 = -r0
            r23 = r0
            int r0 = r51.k()
            int r3 = r51.a()
            int r24 = r0 + r3
            int r25 = r51.c()
            int r26 = r51.a()
            int r27 = r51.l()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots r16 = r51.p()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r0 = r51.h()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider r17 = r0.g()
            kotlinx.coroutines.CoroutineScope r28 = r51.f()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult
            r7 = r0
            r15 = 0
            r29 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r8 = r53
            r9 = r54
            r18 = r34
            r19 = r32
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.h(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    public static final boolean i(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (iArr2[i2] < Math.max(-lazyStaggeredGridMeasureContext.l(), 0) && i3 > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (c(lazyStaggeredGridMeasureContext, iArr[i3], i3) == -1 && iArr2[i3] != iArr2[i2]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (c(lazyStaggeredGridMeasureContext, iArr[i4], i4) != -1 && iArr2[i4] >= iArr2[i2]) {
                return true;
            }
        }
        int h2 = lazyStaggeredGridMeasureContext.j().h(0);
        return (h2 == 0 || h2 == -1 || h2 == -2) ? false : true;
    }

    public static final LazyStaggeredGridMeasureResult k(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z2, boolean z3, long j3, int i2, int i3, int i4, int i5, CoroutineScope coroutineScope, boolean z4, boolean z5, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        boolean z6;
        int i6;
        LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = r0;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState2, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j2, z2, lazyLayoutMeasureScope, i2, j3, i4, i5, z3, i3, coroutineScope, z4, z5, lazyStaggeredGridLayoutInfo, graphicsContext, (DefaultConstructorMarker) null);
        int[] R = lazyStaggeredGridState2.R(lazyStaggeredGridItemProvider, lazyStaggeredGridState.H().d());
        int[] g2 = lazyStaggeredGridState.H().g();
        if (R.length != lazyStaggeredGridMeasureContext.i()) {
            lazyStaggeredGridMeasureContext.j().j();
            int i7 = lazyStaggeredGridMeasureContext.i();
            int[] iArr = new int[i7];
            int i8 = 0;
            while (i8 < i7) {
                if (i8 >= R.length || (i6 = R[i8]) == -1) {
                    i6 = i8 == 0 ? 0 : g(iArr, SpanRange.a(0, i8)) + 1;
                }
                iArr[i8] = i6;
                lazyStaggeredGridMeasureContext.j().l(iArr[i8], i8);
                i8++;
            }
            R = iArr;
        }
        if (g2.length == lazyStaggeredGridMeasureContext.i()) {
            z6 = z5;
        } else {
            int i9 = lazyStaggeredGridMeasureContext.i();
            int[] iArr2 = new int[i9];
            int i10 = 0;
            while (i10 < i9) {
                iArr2[i10] = i10 < g2.length ? g2[i10] : i10 == 0 ? 0 : iArr2[i10 - 1];
                i10++;
            }
            z6 = z5;
            g2 = iArr2;
        }
        return h(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState2.L(z6)), R, g2, true);
    }

    public static final void l(int[] iArr, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = iArr[i3] + i2;
        }
    }
}
