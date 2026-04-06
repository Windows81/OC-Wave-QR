package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f18580a;

    /* renamed from: b  reason: collision with root package name */
    public final TextUtils.TruncateAt f18581b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18582c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18583d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutIntrinsics f18584e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f18585f;

    /* renamed from: g  reason: collision with root package name */
    public WordIterator f18586g;

    /* renamed from: h  reason: collision with root package name */
    public final Layout f18587h;

    /* renamed from: i  reason: collision with root package name */
    public final int f18588i;

    /* renamed from: j  reason: collision with root package name */
    public final int f18589j;

    /* renamed from: k  reason: collision with root package name */
    public final int f18590k;

    /* renamed from: l  reason: collision with root package name */
    public final float f18591l;

    /* renamed from: m  reason: collision with root package name */
    public final float f18592m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f18593n;

    /* renamed from: o  reason: collision with root package name */
    public final Paint.FontMetricsInt f18594o;

    /* renamed from: p  reason: collision with root package name */
    public final int f18595p;

    /* renamed from: q  reason: collision with root package name */
    public final LineHeightStyleSpan[] f18596q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f18597r;

    /* renamed from: s  reason: collision with root package name */
    public LayoutHelper f18598s;

    public TextLayout(CharSequence charSequence, float f2, TextPaint textPaint, int i2, TextUtils.TruncateAt truncateAt, int i3, float f3, float f4, boolean z2, boolean z3, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z4;
        boolean z5;
        Layout layout;
        boolean z6;
        CharSequence charSequence2 = charSequence;
        float f5 = f2;
        this.f18580a = textPaint;
        this.f18581b = truncateAt;
        this.f18582c = z2;
        this.f18583d = z3;
        this.f18584e = layoutIntrinsics;
        this.f18597r = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic k2 = TextLayout_androidKt.k(i3);
        Layout.Alignment a2 = TextAlignmentAdapter.f18576a.a(i2);
        boolean z7 = (charSequence2 instanceof Spanned) && ((Spanned) charSequence2).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics e2 = layoutIntrinsics.e();
            Layout.Alignment alignment = a2;
            double d2 = (double) f5;
            int ceil = (int) ((float) Math.ceil(d2));
            if (e2 == null || layoutIntrinsics.i() > f5 || z7) {
                z5 = true;
                this.f18593n = false;
                z4 = false;
                textDirectionHeuristic = k2;
                layout = StaticLayoutFactory.f18545a.a(charSequence, textPaint, ceil, 0, charSequence.length(), k2, alignment, i4, truncateAt, (int) ((float) Math.ceil(d2)), f3, f4, i9, z2, z3, i5, i6, i7, i8, iArr, iArr2);
            } else {
                this.f18593n = true;
                z5 = true;
                layout = BoringLayoutFactory.f18508a.a(charSequence, textPaint, ceil, e2, alignment, z2, z3, truncateAt, ceil);
                textDirectionHeuristic = k2;
                z4 = false;
            }
            this.f18587h = layout;
            Trace.endSection();
            int i10 = i4;
            int min = Math.min(layout.getLineCount(), i10);
            this.f18588i = min;
            int i11 = min - 1;
            if (min >= i10 && (layout.getEllipsisCount(i11) > 0 || layout.getLineEnd(i11) != charSequence.length())) {
                z6 = z5;
            } else {
                z6 = z4;
            }
            this.f18585f = z6;
            long f6 = TextLayout_androidKt.l(this);
            LineHeightStyleSpan[] d3 = TextLayout_androidKt.j(this);
            this.f18596q = d3;
            long c2 = d3 != null ? TextLayout_androidKt.i(d3) : TextLayout_androidKt.f18600b;
            this.f18589j = Math.max(VerticalPaddings.d(f6), VerticalPaddings.d(c2));
            this.f18590k = Math.max(VerticalPaddings.c(f6), VerticalPaddings.c(c2));
            Paint.FontMetricsInt b2 = TextLayout_androidKt.h(this, textPaint, textDirectionHeuristic, d3);
            this.f18595p = b2 != null ? b2.bottom - ((int) s(i11)) : z4;
            this.f18594o = b2;
            this.f18591l = IndentationFixSpan_androidKt.b(layout, i11, (Paint) null, 2, (Object) null);
            this.f18592m = IndentationFixSpan_androidKt.d(layout, i11, (Paint) null, 2, (Object) null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ float B(TextLayout textLayout, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return textLayout.A(i2, z2);
    }

    public static /* synthetic */ float E(TextLayout textLayout, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return textLayout.D(i2, z2);
    }

    public final float A(int i2, boolean z2) {
        return j().c(i2, true, z2) + g(q(i2));
    }

    public final int[] C(RectF rectF, int i2, Function2 function2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AndroidLayoutApi34.f18507a.c(this, rectF, i2, function2);
        }
        return TextLayoutGetRangeForRectExtensions_androidKt.d(this, this.f18587h, j(), rectF, i2, function2);
    }

    public final float D(int i2, boolean z2) {
        return j().c(i2, false, z2) + g(q(i2));
    }

    public final void F(int i2, int i3, Path path) {
        this.f18587h.getSelectionPath(i2, i3, path);
        if (this.f18589j != 0 && !path.isEmpty()) {
            path.offset(0.0f, (float) this.f18589j);
        }
    }

    public final CharSequence G() {
        return this.f18587h.getText();
    }

    public final TextPaint H() {
        return this.f18580a;
    }

    public final WordIterator I() {
        WordIterator wordIterator = this.f18586g;
        if (wordIterator != null) {
            return wordIterator;
        }
        WordIterator wordIterator2 = new WordIterator(this.f18587h.getText(), 0, this.f18587h.getText().length(), this.f18580a.getTextLocale());
        this.f18586g = wordIterator2;
        return wordIterator2;
    }

    public final boolean J() {
        if (this.f18593n) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.f18508a;
            Layout layout = this.f18587h;
            Intrinsics.g(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.b((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.f18545a;
        Layout layout2 = this.f18587h;
        Intrinsics.g(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.c((StaticLayout) layout2, this.f18583d);
    }

    public final boolean K(int i2) {
        return TextLayout_androidKt.m(this.f18587h, i2);
    }

    public final boolean L(int i2) {
        return this.f18587h.isRtlCharAt(i2);
    }

    public final void M(Canvas canvas) {
        if (canvas.getClipBounds(this.f18597r)) {
            int i2 = this.f18589j;
            if (i2 != 0) {
                canvas.translate(0.0f, (float) i2);
            }
            TextAndroidCanvas e2 = TextLayout_androidKt.f18599a;
            e2.a(canvas);
            this.f18587h.draw(e2);
            int i3 = this.f18589j;
            if (i3 != 0) {
                canvas.translate(0.0f, ((float) -1) * ((float) i3));
            }
        }
    }

    public final void a(int i2, int i3, float[] fArr, int i4) {
        float f2;
        float f3;
        int i5 = i2;
        int i6 = i3;
        float[] fArr2 = fArr;
        int length = G().length();
        if (!(i5 >= 0)) {
            InlineClassHelperKt.a("startOffset must be > 0");
        }
        if (!(i5 < length)) {
            InlineClassHelperKt.a("startOffset must be less than text length");
        }
        if (!(i6 > i5)) {
            InlineClassHelperKt.a("endOffset must be greater than startOffset");
        }
        if (!(i6 <= length)) {
            InlineClassHelperKt.a("endOffset must be smaller or equal to text length");
        }
        if (!(fArr2.length - i4 >= (i6 - i5) * 4)) {
            InlineClassHelperKt.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int q2 = q(i2);
        int q3 = q(i6 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (q2 <= q3) {
            int i7 = q2;
            int i8 = i4;
            while (true) {
                int v2 = v(i7);
                int p2 = p(i7);
                int min = Math.min(i6, p2);
                float w2 = w(i7);
                float l2 = l(i7);
                boolean z2 = z(i7) == 1;
                for (int max = Math.max(i5, v2); max < min; max++) {
                    boolean L = L(max);
                    if (z2 && !L) {
                        f2 = horizontalPositionCache.b(max);
                        f3 = horizontalPositionCache.c(max + 1);
                    } else if (z2 && L) {
                        f3 = horizontalPositionCache.d(max);
                        f2 = horizontalPositionCache.e(max + 1);
                    } else if (z2 || !L) {
                        f2 = horizontalPositionCache.d(max);
                        f3 = horizontalPositionCache.e(max + 1);
                    } else {
                        f3 = horizontalPositionCache.b(max);
                        f2 = horizontalPositionCache.c(max + 1);
                    }
                    fArr2[i8] = f2;
                    fArr2[i8 + 1] = w2;
                    fArr2[i8 + 2] = f3;
                    fArr2[i8 + 3] = l2;
                    i8 += 4;
                }
                if (i7 != q3) {
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(int i2, float[] fArr) {
        float f2;
        float f3;
        int v2 = v(i2);
        int p2 = p(i2);
        int i3 = 0;
        boolean z2 = true;
        if (!(fArr.length >= (p2 - v2) * 2)) {
            InlineClassHelperKt.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (z(i2) != 1) {
            z2 = false;
        }
        while (v2 < p2) {
            boolean L = L(v2);
            if (z2 && !L) {
                f2 = horizontalPositionCache.b(v2);
                f3 = horizontalPositionCache.c(v2 + 1);
            } else if (z2 && L) {
                f3 = horizontalPositionCache.d(v2);
                f2 = horizontalPositionCache.e(v2 + 1);
            } else if (L) {
                f3 = horizontalPositionCache.b(v2);
                f2 = horizontalPositionCache.c(v2 + 1);
            } else {
                f2 = horizontalPositionCache.d(v2);
                f3 = horizontalPositionCache.e(v2 + 1);
            }
            fArr[i3] = f2;
            fArr[i3 + 1] = f3;
            i3 += 2;
            v2++;
        }
    }

    public final RectF c(int i2) {
        float f2;
        float f3;
        float A2;
        float A3;
        int q2 = q(i2);
        float w2 = w(q2);
        float l2 = l(q2);
        boolean z2 = z(q2) == 1;
        boolean isRtlCharAt = this.f18587h.isRtlCharAt(i2);
        if (!z2 || isRtlCharAt) {
            if (z2 && isRtlCharAt) {
                A2 = D(i2, false);
                A3 = D(i2 + 1, true);
            } else if (isRtlCharAt) {
                A2 = A(i2, false);
                A3 = A(i2 + 1, true);
            } else {
                f3 = D(i2, false);
                f2 = D(i2 + 1, true);
            }
            float f4 = A2;
            f3 = A3;
            f2 = f4;
        } else {
            f3 = A(i2, false);
            f2 = A(i2 + 1, true);
        }
        return new RectF(f3, w2, f2, l2);
    }

    public final boolean d() {
        return this.f18585f;
    }

    public final boolean e() {
        return this.f18583d;
    }

    public final int f() {
        return (this.f18585f ? this.f18587h.getLineBottom(this.f18588i - 1) : this.f18587h.getHeight()) + this.f18589j + this.f18590k + this.f18595p;
    }

    public final float g(int i2) {
        if (i2 == this.f18588i - 1) {
            return this.f18591l + this.f18592m;
        }
        return 0.0f;
    }

    public final boolean h() {
        return this.f18582c;
    }

    public final Layout i() {
        return this.f18587h;
    }

    public final LayoutHelper j() {
        LayoutHelper layoutHelper = this.f18598s;
        if (layoutHelper == null) {
            LayoutHelper layoutHelper2 = new LayoutHelper(this.f18587h);
            this.f18598s = layoutHelper2;
            return layoutHelper2;
        }
        Intrinsics.f(layoutHelper);
        return layoutHelper;
    }

    public final float k(int i2) {
        return ((float) this.f18589j) + ((i2 != this.f18588i + -1 || this.f18594o == null) ? (float) this.f18587h.getLineBaseline(i2) : w(i2) - ((float) this.f18594o.ascent));
    }

    public final float l(int i2) {
        if (i2 == this.f18588i - 1 && this.f18594o != null) {
            return ((float) this.f18587h.getLineBottom(i2 - 1)) + ((float) this.f18594o.bottom);
        }
        return ((float) this.f18589j) + ((float) this.f18587h.getLineBottom(i2)) + ((float) (i2 == this.f18588i + -1 ? this.f18590k : 0));
    }

    public final int m() {
        return this.f18588i;
    }

    public final int n(int i2) {
        return this.f18587h.getEllipsisCount(i2);
    }

    public final int o(int i2) {
        return this.f18587h.getEllipsisStart(i2);
    }

    public final int p(int i2) {
        return (!TextLayout_androidKt.m(this.f18587h, i2) || this.f18581b != TextUtils.TruncateAt.END) ? this.f18587h.getLineEnd(i2) : this.f18587h.getText().length();
    }

    public final int q(int i2) {
        return this.f18587h.getLineForOffset(i2);
    }

    public final int r(int i2) {
        return this.f18587h.getLineForVertical(i2 - this.f18589j);
    }

    public final float s(int i2) {
        return l(i2) - w(i2);
    }

    public final float t(int i2) {
        return this.f18587h.getLineLeft(i2) + (i2 == this.f18588i + -1 ? this.f18591l : 0.0f);
    }

    public final float u(int i2) {
        return this.f18587h.getLineRight(i2) + (i2 == this.f18588i + -1 ? this.f18592m : 0.0f);
    }

    public final int v(int i2) {
        return this.f18587h.getLineStart(i2);
    }

    public final float w(int i2) {
        return ((float) this.f18587h.getLineTop(i2)) + ((float) (i2 == 0 ? 0 : this.f18589j));
    }

    public final int x(int i2) {
        return (!TextLayout_androidKt.m(this.f18587h, i2) || this.f18581b != TextUtils.TruncateAt.END) ? j().e(i2) : this.f18587h.getLineStart(i2) + this.f18587h.getEllipsisStart(i2);
    }

    public final int y(int i2, float f2) {
        return this.f18587h.getOffsetForHorizontal(i2, f2 + (((float) -1) * g(i2)));
    }

    public final int z(int i2) {
        return this.f18587h.getParagraphDirection(i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextLayout(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, androidx.compose.ui.text.android.LayoutIntrinsics r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r27
        L_0x000b:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r8 = r3
            goto L_0x0014
        L_0x0012:
            r8 = r28
        L_0x0014:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            r1 = 2
            r9 = r1
            goto L_0x001d
        L_0x001b:
            r9 = r29
        L_0x001d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0025
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L_0x0027
        L_0x0025:
            r10 = r30
        L_0x0027:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002e
            r1 = 0
            r11 = r1
            goto L_0x0030
        L_0x002e:
            r11 = r31
        L_0x0030:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0036
            r12 = r2
            goto L_0x0038
        L_0x0036:
            r12 = r32
        L_0x0038:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x003f
            r1 = 1
            r13 = r1
            goto L_0x0041
        L_0x003f:
            r13 = r33
        L_0x0041:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004a
            r1 = 2147483647(0x7fffffff, float:NaN)
            r14 = r1
            goto L_0x004c
        L_0x004a:
            r14 = r34
        L_0x004c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0052
            r15 = r2
            goto L_0x0054
        L_0x0052:
            r15 = r35
        L_0x0054:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005b
            r16 = r2
            goto L_0x005d
        L_0x005b:
            r16 = r36
        L_0x005d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0064
            r17 = r2
            goto L_0x0066
        L_0x0064:
            r17 = r37
        L_0x0066:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x006d
            r18 = r2
            goto L_0x006f
        L_0x006d:
            r18 = r38
        L_0x006f:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0078
            r19 = r2
            goto L_0x007a
        L_0x0078:
            r19 = r39
        L_0x007a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0082
            r20 = r3
            goto L_0x0084
        L_0x0082:
            r20 = r40
        L_0x0084:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008c
            r21 = r3
            goto L_0x008e
        L_0x008c:
            r21 = r41
        L_0x008e:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x009f
            androidx.compose.ui.text.android.LayoutIntrinsics r0 = new androidx.compose.ui.text.android.LayoutIntrinsics
            r1 = r24
            r2 = r26
            r0.<init>(r1, r2, r9)
            r22 = r0
            goto L_0x00a5
        L_0x009f:
            r1 = r24
            r2 = r26
            r22 = r42
        L_0x00a5:
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
