package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    public static final float a(int i2, int i3, float[] fArr) {
        return fArr[(i2 - i3) * 2];
    }

    public static final float b(int i2, int i3, float[] fArr) {
        return fArr[((i2 - i3) * 2) + 1];
    }

    public static final int c(LayoutHelper.BidiRun bidiRun, RectF rectF, int i2, int i3, int i4, float f2, float f3, float[] fArr, SegmentFinder segmentFinder, Function2 function2) {
        int i5;
        int d2;
        if (!g(rectF, f2, f3)) {
            return -1;
        }
        if ((bidiRun.c() || rectF.right < f3) && (!bidiRun.c() || rectF.left > f2)) {
            i5 = bidiRun.b();
            int a2 = bidiRun.a();
            while (a2 - i5 > 1) {
                int i6 = (a2 + i5) / 2;
                float a3 = a(i6, i2, fArr);
                if ((bidiRun.c() || a3 <= rectF.right) && (!bidiRun.c() || a3 >= rectF.left)) {
                    i5 = i6;
                } else {
                    a2 = i6;
                }
            }
            if (bidiRun.c()) {
                i5 = a2;
            }
        } else {
            i5 = bidiRun.a() - 1;
        }
        int c2 = segmentFinder.c(i5 + 1);
        if (c2 == -1 || (d2 = segmentFinder.d(c2)) <= bidiRun.b()) {
            return -1;
        }
        int e2 = RangesKt.e(c2, bidiRun.b());
        int j2 = RangesKt.j(d2, bidiRun.a());
        RectF rectF2 = new RectF(0.0f, (float) i3, 0.0f, (float) i4);
        while (true) {
            rectF2.left = bidiRun.c() ? a(j2 - 1, i2, fArr) : a(e2, i2, fArr);
            rectF2.right = bidiRun.c() ? b(e2, i2, fArr) : b(j2 - 1, i2, fArr);
            if (((Boolean) function2.m(rectF2, rectF)).booleanValue()) {
                return j2;
            }
            j2 = segmentFinder.b(j2);
            if (j2 == -1 || j2 <= bidiRun.b()) {
                return -1;
            }
            e2 = RangesKt.e(segmentFinder.c(j2), bidiRun.b());
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] d(androidx.compose.ui.text.android.TextLayout r17, android.text.Layout r18, androidx.compose.ui.text.android.LayoutHelper r19, android.graphics.RectF r20, int r21, kotlin.jvm.functions.Function2 r22) {
        /*
            r8 = r17
            r9 = r18
            r10 = r20
            r11 = 1
            r0 = r21
            if (r0 != r11) goto L_0x001a
            androidx.compose.ui.text.android.selection.WordSegmentFinder r0 = new androidx.compose.ui.text.android.selection.WordSegmentFinder
            java.lang.CharSequence r1 = r17.G()
            androidx.compose.ui.text.android.selection.WordIterator r2 = r17.I()
            r0.<init>(r1, r2)
        L_0x0018:
            r12 = r0
            goto L_0x0027
        L_0x001a:
            java.lang.CharSequence r0 = r17.G()
            android.text.TextPaint r1 = r17.H()
            androidx.compose.ui.text.android.selection.SegmentFinder r0 = androidx.compose.ui.text.android.selection.SegmentFinder_androidKt.a(r0, r1)
            goto L_0x0018
        L_0x0027:
            float r0 = r10.top
            int r0 = (int) r0
            int r0 = r9.getLineForVertical(r0)
            float r1 = r10.top
            float r2 = r8.l(r0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r13 = 0
            if (r1 <= 0) goto L_0x0042
            int r0 = r0 + 1
            int r1 = r17.m()
            if (r0 < r1) goto L_0x0042
            return r13
        L_0x0042:
            r14 = r0
            float r0 = r10.bottom
            int r0 = (int) r0
            int r15 = r9.getLineForVertical(r0)
            if (r15 != 0) goto L_0x0058
            float r0 = r10.bottom
            r1 = 0
            float r1 = r8.w(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            return r13
        L_0x0058:
            r7 = 1
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r14
            r4 = r20
            r5 = r12
            r6 = r22
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0069:
            r7 = r14
            r14 = r0
            r6 = -1
            if (r14 != r6) goto L_0x0084
            if (r7 >= r15) goto L_0x0084
            int r14 = r7 + 1
            r7 = 1
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r14
            r4 = r20
            r5 = r12
            r6 = r22
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0069
        L_0x0084:
            if (r14 != r6) goto L_0x0087
            return r13
        L_0x0087:
            r16 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r15
            r4 = r20
            r5 = r12
            r11 = r6
            r6 = r22
            r13 = r7
            r7 = r16
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x009d:
            if (r0 != r11) goto L_0x00b5
            if (r13 >= r15) goto L_0x00b5
            int r15 = r15 + -1
            r7 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r15
            r4 = r20
            r5 = r12
            r6 = r22
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x009d
        L_0x00b5:
            if (r0 != r11) goto L_0x00b9
            r1 = 0
            return r1
        L_0x00b9:
            r1 = 1
            int r14 = r14 + r1
            int r2 = r12.c(r14)
            int r0 = r0 - r1
            int r0 = r12.d(r0)
            int[] r0 = new int[]{r2, r0}
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayoutGetRangeForRectExtensions_androidKt.d(androidx.compose.ui.text.android.TextLayout, android.text.Layout, androidx.compose.ui.text.android.LayoutHelper, android.graphics.RectF, int, kotlin.jvm.functions.Function2):int[]");
    }

    public static final int e(LayoutHelper.BidiRun bidiRun, RectF rectF, int i2, int i3, int i4, float f2, float f3, float[] fArr, SegmentFinder segmentFinder, Function2 function2) {
        int i5;
        int c2;
        if (!g(rectF, f2, f3)) {
            return -1;
        }
        if ((bidiRun.c() || rectF.left > f2) && (!bidiRun.c() || rectF.right < f3)) {
            i5 = bidiRun.b();
            int a2 = bidiRun.a();
            while (a2 - i5 > 1) {
                int i6 = (a2 + i5) / 2;
                float a3 = a(i6, i2, fArr);
                if ((bidiRun.c() || a3 <= rectF.left) && (!bidiRun.c() || a3 >= rectF.right)) {
                    i5 = i6;
                } else {
                    a2 = i6;
                }
            }
            if (bidiRun.c()) {
                i5 = a2;
            }
        } else {
            i5 = bidiRun.b();
        }
        int d2 = segmentFinder.d(i5);
        if (d2 == -1 || (c2 = segmentFinder.c(d2)) >= bidiRun.a()) {
            return -1;
        }
        int e2 = RangesKt.e(c2, bidiRun.b());
        int j2 = RangesKt.j(d2, bidiRun.a());
        RectF rectF2 = new RectF(0.0f, (float) i3, 0.0f, (float) i4);
        while (true) {
            rectF2.left = bidiRun.c() ? a(j2 - 1, i2, fArr) : a(e2, i2, fArr);
            rectF2.right = bidiRun.c() ? b(e2, i2, fArr) : b(j2 - 1, i2, fArr);
            if (((Boolean) function2.m(rectF2, rectF)).booleanValue()) {
                return e2;
            }
            e2 = segmentFinder.a(e2);
            if (e2 == -1 || e2 >= bidiRun.a()) {
                return -1;
            }
            j2 = RangesKt.j(segmentFinder.d(e2), bidiRun.a());
        }
        return -1;
    }

    public static final int f(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i2, RectF rectF, SegmentFinder segmentFinder, Function2 function2, boolean z2) {
        LayoutHelper.BidiRun[] bidiRunArr;
        int i3;
        int i4;
        int i5;
        Layout layout2 = layout;
        int i6 = i2;
        int lineTop = layout2.getLineTop(i6);
        int lineBottom = layout2.getLineBottom(i6);
        int lineStart = layout2.getLineStart(i6);
        int lineEnd = layout2.getLineEnd(i6);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[((lineEnd - lineStart) * 2)];
        textLayout.b(i6, fArr);
        LayoutHelper.BidiRun[] d2 = layoutHelper.d(i2);
        IntProgression i0 = z2 ? ArraysKt.i0(d2) : RangesKt.s(ArraysKt.m0(d2), 0);
        int n2 = i0.n();
        int o2 = i0.o();
        int p2 = i0.p();
        if ((p2 <= 0 || n2 > o2) && (p2 >= 0 || o2 > n2)) {
            return -1;
        }
        int i7 = n2;
        while (true) {
            LayoutHelper.BidiRun bidiRun = d2[i7];
            float a2 = bidiRun.c() ? a(bidiRun.a() - 1, lineStart, fArr) : a(bidiRun.b(), lineStart, fArr);
            float b2 = bidiRun.c() ? b(bidiRun.b(), lineStart, fArr) : b(bidiRun.a() - 1, lineStart, fArr);
            if (z2) {
                i4 = i7;
                bidiRunArr = d2;
                i3 = o2;
                i5 = e(bidiRun, rectF, lineStart, lineTop, lineBottom, a2, b2, fArr, segmentFinder, function2);
            } else {
                i4 = i7;
                bidiRunArr = d2;
                i3 = o2;
                i5 = c(bidiRun, rectF, lineStart, lineTop, lineBottom, a2, b2, fArr, segmentFinder, function2);
            }
            if (i5 >= 0) {
                return i5;
            }
            if (i4 == i3) {
                return -1;
            }
            i7 = i4 + p2;
            o2 = i3;
            d2 = bidiRunArr;
        }
    }

    public static final boolean g(RectF rectF, float f2, float f3) {
        return f3 >= rectF.left && f2 <= rectF.right;
    }
}
