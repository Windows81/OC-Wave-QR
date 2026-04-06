package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public int f1216A;

    /* renamed from: B  reason: collision with root package name */
    public int f1217B;
    public int C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public int[] H;
    public int[] I;
    public Drawable J;
    public int K;
    public int L;
    public int M;
    public int N;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1218z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void j(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View q2 = q(i4);
            if (q2.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) q2.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i5 = layoutParams.height;
                    layoutParams.height = q2.getMeasuredHeight();
                    measureChildWithMargins(q2, makeMeasureSpec, 0, i3, 0);
                    layoutParams.height = i5;
                }
            }
        }
    }

    private void y(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void e(Canvas canvas) {
        int i2;
        int left;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean b2 = ViewUtils.b(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View q2 = q(i4);
            if (!(q2 == null || q2.getVisibility() == 8 || !r(i4))) {
                LayoutParams layoutParams = (LayoutParams) q2.getLayoutParams();
                h(canvas, b2 ? q2.getRight() + layoutParams.rightMargin : (q2.getLeft() - layoutParams.leftMargin) - this.K);
            }
        }
        if (r(virtualChildCount)) {
            View q3 = q(virtualChildCount - 1);
            if (q3 != null) {
                LayoutParams layoutParams2 = (LayoutParams) q3.getLayoutParams();
                if (b2) {
                    left = q3.getLeft() - layoutParams2.leftMargin;
                    i3 = this.K;
                } else {
                    i2 = q3.getRight() + layoutParams2.rightMargin;
                    h(canvas, i2);
                }
            } else if (b2) {
                i2 = getPaddingLeft();
                h(canvas, i2);
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.K;
            }
            i2 = left - i3;
            h(canvas, i2);
        }
    }

    public void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View q2 = q(i2);
            if (!(q2 == null || q2.getVisibility() == 8 || !r(i2))) {
                g(canvas, (q2.getTop() - ((LayoutParams) q2.getLayoutParams()).topMargin) - this.L);
            }
        }
        if (r(virtualChildCount)) {
            View q3 = q(virtualChildCount - 1);
            g(canvas, q3 == null ? (getHeight() - getPaddingBottom()) - this.L : q3.getBottom() + ((LayoutParams) q3.getLayoutParams()).bottomMargin);
        }
    }

    public void g(Canvas canvas, int i2) {
        this.J.setBounds(getPaddingLeft() + this.N, i2, (getWidth() - getPaddingRight()) - this.N, this.L + i2);
        this.J.draw(canvas);
    }

    public int getBaseline() {
        int i2;
        if (this.f1216A < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1216A;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f1217B;
                if (this.C == 1 && (i2 = this.D & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.E) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.E;
                    }
                }
                return i4 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1216A == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1216A;
    }

    public Drawable getDividerDrawable() {
        return this.J;
    }

    public int getDividerPadding() {
        return this.N;
    }

    public int getDividerWidth() {
        return this.K;
    }

    public int getGravity() {
        return this.D;
    }

    public int getOrientation() {
        return this.C;
    }

    public int getShowDividers() {
        return this.M;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.F;
    }

    public void h(Canvas canvas, int i2) {
        this.J.setBounds(i2, getPaddingTop() + this.N, this.K + i2, (getHeight() - getPaddingBottom()) - this.N);
        this.J.draw(canvas);
    }

    public final void i(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View q2 = q(i4);
            if (q2.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) q2.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i5 = layoutParams.width;
                    layoutParams.width = q2.getMeasuredWidth();
                    measureChildWithMargins(q2, i3, 0, makeMeasureSpec, 0);
                    layoutParams.width = i5;
                }
            }
        }
    }

    /* renamed from: k */
    public LayoutParams generateDefaultLayoutParams() {
        int i2 = this.C;
        if (i2 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* renamed from: l */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: m */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int n(View view, int i2) {
        return 0;
    }

    public int o(View view) {
        return 0;
    }

    public void onDraw(Canvas canvas) {
        if (this.J != null) {
            if (this.C == 1) {
                f(canvas);
            } else {
                e(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.C == 1) {
            t(i2, i3, i4, i5);
        } else {
            s(i2, i3, i4, i5);
        }
    }

    public void onMeasure(int i2, int i3) {
        if (this.C == 1) {
            x(i2, i3);
        } else {
            v(i2, i3);
        }
    }

    public int p(View view) {
        return 0;
    }

    public View q(int i2) {
        return getChildAt(i2);
    }

    public boolean r(int i2) {
        if (i2 == 0) {
            return (this.M & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.M & 4) != 0;
        }
        if ((this.M & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.ViewUtils.b(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.D
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f1218z
            int[] r13 = r6.H
            int[] r14 = r6.I
            int r1 = androidx.core.view.ViewCompat.s(r24)
            int r1 = androidx.core.view.GravityCompat.b(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.E
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.E
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = r2
            r17 = r5
        L_0x0064:
            r3 = r2
        L_0x0065:
            if (r3 >= r10) goto L_0x014a
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.q(r2)
            if (r0 != 0) goto L_0x0082
            int r0 = r6.w(r2)
            int r1 = r1 + r0
            r21 = r5
            r23 = r7
            r19 = r10
            r20 = r11
        L_0x007e:
            r22 = -1
            goto L_0x013d
        L_0x0082:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0131
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            r18 = r3
            if (r12 == 0) goto L_0x00aa
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00ac
            int r10 = r0.getBaseline()
            goto L_0x00ad
        L_0x00aa:
            r19 = r10
        L_0x00ac:
            r10 = -1
        L_0x00ad:
            int r3 = r4.gravity
            if (r3 >= 0) goto L_0x00b2
            r3 = r11
        L_0x00b2:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto L_0x00ec
            r11 = 48
            if (r3 == r11) goto L_0x00dd
            r11 = 80
            if (r3 == r11) goto L_0x00c7
            r3 = r7
            r11 = -1
        L_0x00c4:
            r21 = 1
            goto L_0x00fa
        L_0x00c7:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto L_0x00c4
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r10
            r10 = 2
            r22 = r14[r10]
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto L_0x00c4
        L_0x00dd:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto L_0x00c4
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto L_0x00fa
        L_0x00ec:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00fa:
            boolean r10 = r6.r(r2)
            if (r10 == 0) goto L_0x0103
            int r10 = r6.K
            int r1 = r1 + r10
        L_0x0103:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.o(r0)
            int r22 = r10 + r1
            r25 = r0
            r0 = r24
            r1 = r25
            r11 = r2
            r2 = r22
            r23 = r7
            r22 = -1
            r7 = r4
            r4 = r15
            r0.y(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.p(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.n(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x013d
        L_0x0131:
            r18 = r3
            r23 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            goto L_0x007e
        L_0x013d:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r5 = r21
            r7 = r23
            r15 = 2
            goto L_0x0065
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f1218z = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1216A = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.J) {
            this.J = drawable;
            boolean z2 = false;
            if (drawable != null) {
                this.K = drawable.getIntrinsicWidth();
                this.L = drawable.getIntrinsicHeight();
            } else {
                this.K = 0;
                this.L = 0;
            }
            if (drawable == null) {
                z2 = true;
            }
            setWillNotDraw(z2);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.N = i2;
    }

    public void setGravity(int i2) {
        if (this.D != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.D = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.D;
        if ((8388615 & i4) != i3) {
            this.D = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.G = z2;
    }

    public void setOrientation(int i2) {
        if (this.C != i2) {
            this.C = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.M) {
            requestLayout();
        }
        this.M = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.D;
        if ((i4 & 112) != i3) {
            this.D = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.F = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int paddingRight = i10 - getPaddingRight();
        int paddingRight2 = (i10 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i11 = this.D;
        int i12 = i11 & 112;
        int i13 = i11 & 8388615;
        int paddingTop = i12 != 16 ? i12 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.E : getPaddingTop() + (((i5 - i3) - this.E) / 2);
        int i14 = 0;
        while (i14 < virtualChildCount) {
            View q2 = q(i14);
            if (q2 == null) {
                paddingTop += w(i14);
            } else if (q2.getVisibility() != 8) {
                int measuredWidth = q2.getMeasuredWidth();
                int measuredHeight = q2.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) q2.getLayoutParams();
                int i15 = layoutParams.gravity;
                if (i15 < 0) {
                    i15 = i13;
                }
                int b2 = GravityCompat.b(i15, ViewCompat.s(this)) & 7;
                if (b2 == 1) {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i8 = layoutParams.rightMargin;
                    i9 = i7 - i8;
                } else if (b2 != 5) {
                    i9 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i7 = paddingRight - measuredWidth;
                    i8 = layoutParams.rightMargin;
                    i9 = i7 - i8;
                }
                int i16 = i9;
                if (r(i14)) {
                    paddingTop += this.L;
                }
                int i17 = paddingTop + layoutParams.topMargin;
                y(q2, i16, i17 + o(q2), measuredWidth, measuredHeight);
                i14 += n(q2, i14);
                paddingTop = i17 + measuredHeight + layoutParams.bottomMargin + p(q2);
                i6 = 1;
                i14 += i6;
            }
            i6 = 1;
            i14 += i6;
        }
    }

    public void u(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:192:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(int r40, int r41) {
        /*
            r39 = this;
            r7 = r39
            r8 = r40
            r9 = r41
            r10 = 0
            r7.E = r10
            int r11 = r39.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r40)
            int r13 = android.view.View.MeasureSpec.getMode(r41)
            int[] r0 = r7.H
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.I
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.H = r0
            int[] r0 = new int[r14]
            r7.I = r0
        L_0x0026:
            int[] r15 = r7.H
            int[] r6 = r7.I
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f1218z
            boolean r3 = r7.G
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = r18
            goto L_0x004e
        L_0x004c:
            r19 = r10
        L_0x004e:
            r20 = 0
            r1 = r10
            r14 = r1
            r21 = r14
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r27 = r25
            r26 = r18
            r0 = r20
        L_0x0062:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0204
            android.view.View r6 = r7.q(r1)
            if (r6 != 0) goto L_0x0082
            int r5 = r7.E
            int r6 = r7.w(r1)
            int r5 = r5 + r6
            r7.E = r5
        L_0x0077:
            r33 = r3
            r37 = r4
            r38 = r2
            r2 = r1
            r1 = r38
            goto L_0x01f1
        L_0x0082:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x008e
            int r5 = r7.n(r6, r1)
            int r1 = r1 + r5
            goto L_0x0077
        L_0x008e:
            boolean r5 = r7.r(r1)
            if (r5 == 0) goto L_0x009b
            int r5 = r7.E
            int r10 = r7.K
            int r5 = r5 + r10
            r7.E = r5
        L_0x009b:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            float r5 = r10.weight
            float r32 = r0 + r5
            if (r12 != r2) goto L_0x00ef
            int r0 = r10.width
            if (r0 != 0) goto L_0x00ef
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            if (r19 == 0) goto L_0x00bd
            int r0 = r7.E
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.E = r0
            goto L_0x00cb
        L_0x00bd:
            int r0 = r7.E
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.E = r0
        L_0x00cb:
            if (r4 == 0) goto L_0x00e0
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r29 = -2
            goto L_0x0167
        L_0x00e0:
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r24 = r18
            r1 = 1073741824(0x40000000, float:2.0)
            r29 = -2
            goto L_0x0169
        L_0x00ef:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00fc
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fc
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00ff
        L_0x00fc:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ff:
            int r0 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0108
            int r0 = r7.E
            r29 = r0
            goto L_0x010a
        L_0x0108:
            r29 = 0
        L_0x010a:
            r34 = 0
            r0 = r39
            r35 = r1
            r1 = r6
            r36 = r2
            r2 = r35
            r33 = r3
            r3 = r40
            r37 = r4
            r4 = r29
            r29 = r5
            r9 = -1
            r5 = r41
            r31 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r34
            r0.u(r1, r2, r3, r4, r5, r6)
            r0 = r36
            if (r0 == r9) goto L_0x0131
            r10.width = r0
        L_0x0131:
            int r0 = r31.getMeasuredWidth()
            if (r19 == 0) goto L_0x014a
            int r1 = r7.E
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r31
            int r4 = r7.p(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.E = r1
            goto L_0x0161
        L_0x014a:
            r3 = r31
            int r1 = r7.E
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.p(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.E = r1
        L_0x0161:
            if (r33 == 0) goto L_0x0167
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0167:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0169:
            if (r13 == r1) goto L_0x0175
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0175
            r0 = r18
            r27 = r0
            goto L_0x0176
        L_0x0175:
            r0 = 0
        L_0x0176:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r37 == 0) goto L_0x01b3
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01b3
            int r6 = r10.gravity
            if (r6 >= 0) goto L_0x0199
            int r6 = r7.D
        L_0x0199:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01b3:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L_0x01c3
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L_0x01c3
            r26 = r18
            goto L_0x01c5
        L_0x01c3:
            r26 = 0
        L_0x01c5:
            float r5 = r10.weight
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d9
            if (r0 == 0) goto L_0x01d0
        L_0x01cd:
            r10 = r23
            goto L_0x01d2
        L_0x01d0:
            r2 = r4
            goto L_0x01cd
        L_0x01d2:
            int r23 = java.lang.Math.max(r10, r2)
        L_0x01d6:
            r10 = r35
            goto L_0x01e9
        L_0x01d9:
            r10 = r23
            if (r0 == 0) goto L_0x01e0
        L_0x01dd:
            r4 = r22
            goto L_0x01e2
        L_0x01e0:
            r2 = r4
            goto L_0x01dd
        L_0x01e2:
            int r22 = java.lang.Math.max(r4, r2)
            r23 = r10
            goto L_0x01d6
        L_0x01e9:
            int r0 = r7.n(r3, r10)
            int r0 = r0 + r10
            r2 = r0
            r0 = r32
        L_0x01f1:
            int r2 = r2 + 1
            r9 = r41
            r6 = r28
            r3 = r33
            r4 = r37
            r5 = -1
            r10 = 0
            r38 = r2
            r2 = r1
            r1 = r38
            goto L_0x0062
        L_0x0204:
            r1 = r2
            r33 = r3
            r37 = r4
            r2 = r21
            r4 = r22
            r10 = r23
            r6 = r25
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = -2
            int r3 = r7.E
            if (r3 <= 0) goto L_0x0226
            boolean r3 = r7.r(r11)
            if (r3 == 0) goto L_0x0226
            int r3 = r7.E
            int r1 = r7.K
            int r3 = r3 + r1
            r7.E = r3
        L_0x0226:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L_0x023e
            r21 = 0
            r5 = r15[r21]
            if (r5 != r3) goto L_0x023e
            r5 = r15[r17]
            if (r5 != r3) goto L_0x023e
            r5 = r15[r16]
            if (r5 == r3) goto L_0x023a
            goto L_0x023e
        L_0x023a:
            r1 = r2
            r21 = r6
            goto L_0x026d
        L_0x023e:
            r3 = r15[r16]
            r5 = 0
            r9 = r15[r5]
            r5 = r15[r17]
            int r1 = java.lang.Math.max(r1, r5)
            int r1 = java.lang.Math.max(r9, r1)
            int r1 = java.lang.Math.max(r3, r1)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r21 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
        L_0x026d:
            if (r33 == 0) goto L_0x0277
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r2) goto L_0x0275
            if (r12 != 0) goto L_0x0277
        L_0x0275:
            r2 = 0
            goto L_0x027a
        L_0x0277:
            r23 = r1
            goto L_0x02d4
        L_0x027a:
            r7.E = r2
            r2 = 0
        L_0x027d:
            if (r2 >= r11) goto L_0x0277
            android.view.View r3 = r7.q(r2)
            if (r3 != 0) goto L_0x028f
            int r3 = r7.E
            int r5 = r7.w(r2)
            int r3 = r3 + r5
            r7.E = r3
            goto L_0x029c
        L_0x028f:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x029f
            int r3 = r7.n(r3, r2)
            int r2 = r2 + r3
        L_0x029c:
            r23 = r1
            goto L_0x02cf
        L_0x029f:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            if (r19 == 0) goto L_0x02b8
            int r6 = r7.E
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r3 = r7.p(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            r7.E = r6
            goto L_0x029c
        L_0x02b8:
            int r6 = r7.E
            int r9 = r6 + r14
            r23 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.p(r3)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.E = r1
        L_0x02cf:
            int r2 = r2 + 1
            r1 = r23
            goto L_0x027d
        L_0x02d4:
            int r1 = r7.E
            int r2 = r39.getPaddingLeft()
            int r3 = r39.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.E = r1
            int r2 = r39.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.E
            int r2 = r2 - r3
            if (r24 != 0) goto L_0x0343
            if (r2 == 0) goto L_0x02ff
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02ff
            goto L_0x0343
        L_0x02ff:
            int r0 = java.lang.Math.max(r4, r10)
            if (r33 == 0) goto L_0x033b
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x033b
            r10 = 0
        L_0x030a:
            if (r10 >= r11) goto L_0x033b
            android.view.View r2 = r7.q(r10)
            if (r2 == 0) goto L_0x0338
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x031b
            goto L_0x0338
        L_0x031b:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            float r4 = r4.weight
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0338
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r6 = r2.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r2.measure(r5, r6)
        L_0x0338:
            int r10 = r10 + 1
            goto L_0x030a
        L_0x033b:
            r2 = r41
            r25 = r11
            r9 = r21
            goto L_0x04db
        L_0x0343:
            float r5 = r7.F
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x034a
            r0 = r5
        L_0x034a:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r28[r16] = r5
            r28[r17] = r5
            r28[r18] = r5
            r28[r6] = r5
            r7.E = r6
            r6 = r4
            r4 = r5
            r9 = r21
            r10 = 0
        L_0x0363:
            if (r10 >= r11) goto L_0x0485
            android.view.View r14 = r7.q(r10)
            if (r14 == 0) goto L_0x0373
            int r5 = r14.getVisibility()
            r3 = 8
            if (r5 != r3) goto L_0x037a
        L_0x0373:
            r3 = r2
            r25 = r11
            r2 = r41
            goto L_0x047b
        L_0x037a:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r3 = r5.weight
            int r23 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03e2
            float r8 = (float) r2
            float r8 = r8 * r3
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r3
            int r2 = r2 - r8
            int r3 = r39.getPaddingTop()
            int r23 = r39.getPaddingBottom()
            int r3 = r3 + r23
            r23 = r0
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r0 = r5.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.height
            r24 = r2
            r25 = r11
            r11 = -1
            r2 = r41
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r0)
            int r3 = r5.width
            if (r3 != 0) goto L_0x03c0
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x03b4
            goto L_0x03c2
        L_0x03b4:
            if (r8 <= 0) goto L_0x03b7
            goto L_0x03b8
        L_0x03b7:
            r8 = 0
        L_0x03b8:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
            goto L_0x03d2
        L_0x03c0:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x03c2:
            int r30 = r14.getMeasuredWidth()
            int r8 = r30 + r8
            if (r8 >= 0) goto L_0x03cb
            r8 = 0
        L_0x03cb:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
        L_0x03d2:
            int r0 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r23
            r3 = r24
            goto L_0x03e8
        L_0x03e2:
            r3 = r2
            r25 = r11
            r11 = -1
            r2 = r41
        L_0x03e8:
            if (r19 == 0) goto L_0x0407
            int r8 = r7.E
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.p(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.E = r8
            r23 = r0
        L_0x0404:
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x0422
        L_0x0407:
            int r8 = r7.E
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r0
            int r0 = r5.leftMargin
            int r11 = r11 + r0
            int r0 = r5.rightMargin
            int r11 = r11 + r0
            int r0 = r7.p(r14)
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r8, r11)
            r7.E = r0
            goto L_0x0404
        L_0x0422:
            if (r13 == r0) goto L_0x042c
            int r0 = r5.height
            r8 = -1
            if (r0 != r8) goto L_0x042c
            r0 = r18
            goto L_0x042d
        L_0x042c:
            r0 = 0
        L_0x042d:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r4 = java.lang.Math.max(r4, r11)
            if (r0 == 0) goto L_0x043e
            goto L_0x043f
        L_0x043e:
            r8 = r11
        L_0x043f:
            int r0 = java.lang.Math.max(r6, r8)
            if (r26 == 0) goto L_0x044d
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L_0x044e
            r6 = r18
            goto L_0x044f
        L_0x044d:
            r8 = -1
        L_0x044e:
            r6 = 0
        L_0x044f:
            if (r37 == 0) goto L_0x0476
            int r14 = r14.getBaseline()
            if (r14 == r8) goto L_0x0476
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x045d
            int r5 = r7.D
        L_0x045d:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r5 = r5 >> r8
            r5 = r5 & -2
            int r5 = r5 >> 1
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r14)
            r15[r5] = r8
            r8 = r28[r5]
            int r11 = r11 - r14
            int r8 = java.lang.Math.max(r8, r11)
            r28[r5] = r8
        L_0x0476:
            r26 = r6
            r6 = r0
            r0 = r23
        L_0x047b:
            int r10 = r10 + 1
            r8 = r40
            r2 = r3
            r11 = r25
            r5 = -1
            goto L_0x0363
        L_0x0485:
            r2 = r41
            r25 = r11
            int r0 = r7.E
            int r3 = r39.getPaddingLeft()
            int r5 = r39.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.E = r0
            r0 = r15[r18]
            r3 = -1
            if (r0 != r3) goto L_0x04ac
            r5 = 0
            r8 = r15[r5]
            if (r8 != r3) goto L_0x04ac
            r5 = r15[r17]
            if (r5 != r3) goto L_0x04ac
            r5 = r15[r16]
            if (r5 == r3) goto L_0x04aa
            goto L_0x04ac
        L_0x04aa:
            r0 = r4
            goto L_0x04d8
        L_0x04ac:
            r3 = r15[r16]
            r5 = 0
            r8 = r15[r5]
            r10 = r15[r17]
            int r0 = java.lang.Math.max(r0, r10)
            int r0 = java.lang.Math.max(r8, r0)
            int r0 = java.lang.Math.max(r3, r0)
            r3 = r28[r16]
            r5 = r28[r5]
            r8 = r28[r18]
            r10 = r28[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r5 = java.lang.Math.max(r5, r8)
            int r3 = java.lang.Math.max(r3, r5)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r4, r0)
        L_0x04d8:
            r23 = r0
            r0 = r6
        L_0x04db:
            if (r26 != 0) goto L_0x04e2
            r3 = 1073741824(0x40000000, float:2.0)
            if (r13 == r3) goto L_0x04e2
            goto L_0x04e4
        L_0x04e2:
            r0 = r23
        L_0x04e4:
            int r3 = r39.getPaddingTop()
            int r4 = r39.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r39.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 & r9
            r1 = r1 | r3
            int r3 = r9 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r3)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x050c
            r0 = r40
            r1 = r25
            r7.i(r1, r0)
        L_0x050c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.v(int, int):void");
    }

    public int w(int i2) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x031b, code lost:
        if (r14.width == -1) goto L_0x0322;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.E = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f1216A
            boolean r15 = r7.G
            r16 = 1
            r17 = 0
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r18 = r6
            r20 = r18
            r19 = r16
            r0 = r17
        L_0x002b:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x019b
            android.view.View r4 = r7.q(r6)
            if (r4 != 0) goto L_0x0048
            int r4 = r7.E
            int r10 = r7.w(r6)
            int r4 = r4 + r10
            r7.E = r4
            r24 = r13
            r4 = r22
            r22 = r11
            goto L_0x018f
        L_0x0048:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005f
            int r1 = r7.n(r4, r6)
            int r6 = r6 + r1
            r4 = r22
            r1 = r24
            r22 = r11
            r24 = r13
            goto L_0x018f
        L_0x005f:
            boolean r1 = r7.r(r6)
            if (r1 == 0) goto L_0x006c
            int r1 = r7.E
            int r10 = r7.L
            int r1 = r1 + r10
            r7.E = r1
        L_0x006c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            float r1 = r10.weight
            float r25 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto L_0x00a6
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a6
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            int r0 = r7.E
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.E = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r18 = r16
            r8 = r24
            r29 = r26
            r24 = r13
            r13 = r22
            r22 = r11
            r11 = r6
            goto L_0x0114
        L_0x00a6:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b5
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b5
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b7
        L_0x00b5:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b7:
            int r0 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            int r0 = r7.E
            r27 = r0
            goto L_0x00c2
        L_0x00c0:
            r27 = 0
        L_0x00c2:
            r28 = 0
            r23 = 1073741824(0x40000000, float:2.0)
            r0 = r33
            r8 = r24
            r1 = r4
            r30 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r24 = r13
            r13 = r22
            r22 = r11
            r11 = r23
            r23 = r4
            r4 = r28
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r27
            r0.u(r1, r2, r3, r4, r5, r6)
            r1 = r30
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x00f1
            r10.height = r1
        L_0x00f1:
            int r0 = r23.getMeasuredHeight()
            int r1 = r7.E
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r23
            int r4 = r7.p(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.E = r1
            if (r15 == 0) goto L_0x0113
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0114
        L_0x0113:
            r0 = r9
        L_0x0114:
            if (r14 < 0) goto L_0x011e
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x011e
            int r1 = r7.E
            r7.f1217B = r1
        L_0x011e:
            if (r11 >= r14) goto L_0x0126
            float r1 = r10.weight
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 > 0) goto L_0x0129
        L_0x0126:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0131
        L_0x0129:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0131:
            if (r12 == r1) goto L_0x013d
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x013d
            r1 = r16
            r20 = r1
            goto L_0x013e
        L_0x013d:
            r1 = 0
        L_0x013e:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0160
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0160
            r19 = r16
            goto L_0x0162
        L_0x0160:
            r19 = 0
        L_0x0162:
            float r8 = r10.weight
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x0171
            if (r1 == 0) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r2 = r4
        L_0x016c:
            int r4 = java.lang.Math.max(r13, r2)
            goto L_0x017f
        L_0x0171:
            if (r1 == 0) goto L_0x0176
        L_0x0173:
            r1 = r31
            goto L_0x0178
        L_0x0176:
            r2 = r4
            goto L_0x0173
        L_0x0178:
            int r1 = java.lang.Math.max(r1, r2)
            r31 = r1
            r4 = r13
        L_0x017f:
            int r1 = r7.n(r3, r11)
            int r1 = r1 + r11
            r3 = r0
            r2 = r5
            r0 = r25
            r5 = r31
            r32 = r6
            r6 = r1
            r1 = r32
        L_0x018f:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r11 = r22
            r13 = r24
            goto L_0x002b
        L_0x019b:
            r8 = r1
            r9 = r3
            r1 = r5
            r24 = r13
            r13 = r22
            r5 = r2
            r22 = r11
            int r2 = r7.E
            if (r2 <= 0) goto L_0x01b9
            r2 = r22
            boolean r3 = r7.r(r2)
            if (r3 == 0) goto L_0x01bb
            int r3 = r7.E
            int r4 = r7.L
            int r3 = r3 + r4
            r7.E = r3
            goto L_0x01bb
        L_0x01b9:
            r2 = r22
        L_0x01bb:
            r3 = r24
            if (r15 == 0) goto L_0x020a
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c5
            if (r3 != 0) goto L_0x020a
        L_0x01c5:
            r4 = 0
            r7.E = r4
            r4 = 0
        L_0x01c9:
            if (r4 >= r2) goto L_0x020a
            android.view.View r6 = r7.q(r4)
            if (r6 != 0) goto L_0x01db
            int r6 = r7.E
            int r11 = r7.w(r4)
            int r6 = r6 + r11
            r7.E = r6
            goto L_0x0205
        L_0x01db:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01e7
            int r6 = r7.n(r6, r4)
            int r4 = r4 + r6
            goto L_0x0205
        L_0x01e7:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            int r14 = r7.E
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.p(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.E = r6
        L_0x0205:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01c9
        L_0x020a:
            int r4 = r7.E
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.E = r4
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.E
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0279
            if (r9 == 0) goto L_0x0238
            int r11 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r11 <= 0) goto L_0x0238
            goto L_0x0279
        L_0x0238:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0274
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0274
            r1 = 0
        L_0x0243:
            if (r1 >= r2) goto L_0x0274
            android.view.View r3 = r7.q(r1)
            if (r3 == 0) goto L_0x0271
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0254
            goto L_0x0271
        L_0x0254:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            float r9 = r9.weight
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 <= 0) goto L_0x0271
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x0271:
            int r1 = r1 + 1
            goto L_0x0243
        L_0x0274:
            r11 = r34
            r1 = r8
            goto L_0x0367
        L_0x0279:
            float r10 = r7.F
            int r11 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r11 <= 0) goto L_0x0280
            r0 = r10
        L_0x0280:
            r10 = 0
            r7.E = r10
            r11 = r9
            r9 = r1
            r1 = r8
            r8 = r10
        L_0x0287:
            if (r8 >= r2) goto L_0x0356
            android.view.View r13 = r7.q(r8)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x029b
            r21 = r11
            r11 = r34
            goto L_0x034f
        L_0x029b:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            float r10 = r14.weight
            int r18 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r18 <= 0) goto L_0x02fd
            float r15 = (float) r11
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r11 = r11 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r0
            int r0 = r14.leftMargin
            int r10 = r10 + r0
            int r0 = r14.rightMargin
            int r10 = r10 + r0
            int r0 = r14.width
            r21 = r11
            r11 = r34
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r0)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02de
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02d2
            goto L_0x02e0
        L_0x02d2:
            if (r15 <= 0) goto L_0x02d5
            goto L_0x02d6
        L_0x02d5:
            r15 = 0
        L_0x02d6:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
            goto L_0x02f0
        L_0x02de:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02e0:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02e9
            r15 = 0
        L_0x02e9:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
        L_0x02f0:
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r0)
            r0 = r18
            goto L_0x0302
        L_0x02fd:
            r10 = r11
            r11 = r34
            r21 = r10
        L_0x0302:
            int r10 = r14.leftMargin
            int r15 = r14.rightMargin
            int r10 = r10 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r10
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x031e
            int r0 = r14.width
            r23 = r1
            r1 = -1
            if (r0 != r1) goto L_0x0321
            goto L_0x0322
        L_0x031e:
            r23 = r1
            r1 = -1
        L_0x0321:
            r10 = r15
        L_0x0322:
            int r0 = java.lang.Math.max(r9, r10)
            if (r19 == 0) goto L_0x032f
            int r9 = r14.width
            if (r9 != r1) goto L_0x032f
            r9 = r16
            goto L_0x0330
        L_0x032f:
            r9 = 0
        L_0x0330:
            int r10 = r7.E
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.p(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.E = r1
            r19 = r9
            r1 = r23
            r9 = r0
            r0 = r18
        L_0x034f:
            int r8 = r8 + 1
            r11 = r21
            r10 = 0
            goto L_0x0287
        L_0x0356:
            r11 = r34
            int r0 = r7.E
            int r3 = r33.getPaddingTop()
            int r8 = r33.getPaddingBottom()
            int r3 = r3 + r8
            int r0 = r0 + r3
            r7.E = r0
            r0 = r9
        L_0x0367:
            if (r19 != 0) goto L_0x036e
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x036e
            goto L_0x036f
        L_0x036e:
            r0 = r5
        L_0x036f:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x038d
            r7.j(r2, r6)
        L_0x038d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.x(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1218z = true;
        this.f1216A = -1;
        this.f1217B = 0;
        this.D = 8388659;
        TintTypedArray u2 = TintTypedArray.u(context, attributeSet, R.styleable.c1, i2, 0);
        ViewCompat.S(this, context, R.styleable.c1, attributeSet, u2.q(), i2, 0);
        int j2 = u2.j(R.styleable.e1, -1);
        if (j2 >= 0) {
            setOrientation(j2);
        }
        int j3 = u2.j(R.styleable.d1, -1);
        if (j3 >= 0) {
            setGravity(j3);
        }
        boolean a2 = u2.a(R.styleable.f1, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.F = u2.h(R.styleable.h1, -1.0f);
        this.f1216A = u2.j(R.styleable.g1, -1);
        this.G = u2.a(R.styleable.k1, false);
        setDividerDrawable(u2.f(R.styleable.i1));
        this.M = u2.j(R.styleable.l1, 0);
        this.N = u2.e(R.styleable.j1, 0);
        u2.v();
    }
}
