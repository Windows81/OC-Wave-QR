package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.R;
import androidx.core.os.BuildCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {
    public static final float f0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final AccessibilityDelegate g0 = new AccessibilityDelegate();
    public static final int[] h0 = {16843130};

    /* renamed from: A  reason: collision with root package name */
    public long f20453A;

    /* renamed from: B  reason: collision with root package name */
    public final Rect f20454B;
    public OverScroller C;
    public EdgeEffect D;
    public EdgeEffect E;
    public int F;
    public boolean G;
    public boolean H;
    public View I;
    public boolean J;
    public VelocityTracker K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final int[] R;
    public final int[] S;
    public int T;
    public int U;
    public SavedState V;
    public final NestedScrollingParentHelper W;
    public final NestedScrollingChildHelper a0;
    public float b0;
    public OnScrollChangeListener c0;
    public final DifferentialMotionFlingTargetImpl d0;
    public DifferentialMotionFlingController e0;

    /* renamed from: z  reason: collision with root package name */
    public final float f20455z;

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AccessibilityRecordCompat.a(accessibilityEvent, nestedScrollView.getScrollX());
            AccessibilityRecordCompat.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.g(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.i0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                accessibilityNodeInfoCompat.H0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20397r);
                    accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20396q);
                    accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.E);
                }
            }
        }

        public boolean j(View view, int i2, Bundle bundle) {
            if (super.j(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                } else if (i2 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    public static class Api21Impl {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public static final class Api35Impl {
        public static void a(View view, float f2) {
            try {
                view.setFrameContentVelocity(f2);
            } catch (LinkageError unused) {
            }
        }
    }

    public class DifferentialMotionFlingTargetImpl implements DifferentialMotionFlingTarget {
        public DifferentialMotionFlingTargetImpl() {
        }

        public boolean a(float f2) {
            if (f2 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f2);
            return true;
        }

        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        public void c() {
            NestedScrollView.this.C.abortAnimation();
        }
    }

    public interface OnScrollChangeListener {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: z  reason: collision with root package name */
        public int f20457z;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f20457z + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f20457z);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f20457z = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f19378c);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    public static int g(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    public final void A() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker == null) {
            this.K = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void B() {
        this.C = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.N = viewConfiguration.getScaledTouchSlop();
        this.O = viewConfiguration.getScaledMinimumFlingVelocity();
        this.P = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void C() {
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
    }

    public final void D(int i2, int i3) {
        this.F = i2;
        this.Q = i3;
        X(2, 0);
    }

    public final boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    public final boolean G(View view, int i2, int i3) {
        view.getDrawingRect(this.f20454B);
        offsetDescendantRectToMyCoords(view, this.f20454B);
        return this.f20454B.bottom + i2 >= getScrollY() && this.f20454B.top - i2 <= getScrollY() + i3;
    }

    public final void H(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.a0.d(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.F = (int) motionEvent.getY(i2);
            this.Q = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean J(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        boolean z3;
        boolean z4;
        int overScrollMode = getOverScrollMode();
        boolean z5 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z6 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        int i10 = i4 + i2;
        int i11 = !z7 ? 0 : i8;
        int i12 = i5 + i3;
        int i13 = !z8 ? 0 : i9;
        int i14 = -i11;
        int i15 = i11 + i6;
        int i16 = -i13;
        int i17 = i13 + i7;
        if (i10 > i15) {
            i10 = i15;
            z3 = true;
        } else if (i10 < i14) {
            z3 = true;
            i10 = i14;
        } else {
            z3 = false;
        }
        if (i12 > i17) {
            i12 = i17;
            z4 = true;
        } else if (i12 < i16) {
            z4 = true;
            i12 = i16;
        } else {
            z4 = false;
        }
        if (z4 && !y(1)) {
            this.C.springBack(i10, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i10, i12, z3, z4);
        return z3 || z4;
    }

    public boolean K(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f20454B.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f20454B;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f20454B.top = getScrollY() - height;
            Rect rect2 = this.f20454B;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f20454B;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return O(i2, i3, i4);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.D
            float r0 = androidx.core.widget.EdgeEffectCompat.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.D
            float r4 = -r4
            float r4 = androidx.core.widget.EdgeEffectCompat.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.D
            float r5 = androidx.core.widget.EdgeEffectCompat.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.D
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.E
            float r0 = androidx.core.widget.EdgeEffectCompat.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.E
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.EdgeEffectCompat.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.E
            float r5 = androidx.core.widget.EdgeEffectCompat.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.E
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0063
            r3.invalidate()
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    public final void N(boolean z2) {
        if (z2) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.U = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean O(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View u2 = u(z3, i3, i4);
        if (u2 == null) {
            u2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            P(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        }
        if (u2 != findFocus()) {
            u2.requestFocus(i2);
        }
        return z2;
    }

    public final int P(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        VelocityTracker velocityTracker;
        int i7 = i3;
        int i8 = i4;
        if (i8 == 1) {
            X(2, i8);
        }
        boolean z3 = false;
        if (j(0, i2, this.S, this.R, i4)) {
            i6 = i2 - this.S[1];
            i5 = this.R[1];
        } else {
            i6 = i2;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z4 = d() && !z2;
        int i9 = scrollRange;
        boolean z5 = J(0, i6, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i8);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.S;
        iArr[1] = 0;
        p(0, scrollY2, 0, i6 - scrollY2, this.R, i4, iArr);
        int i10 = i5 + this.R[1];
        int i11 = i6 - this.S[1];
        int i12 = scrollY + i11;
        if (i12 < 0) {
            if (z4) {
                EdgeEffectCompat.d(this.D, ((float) (-i11)) / ((float) getHeight()), ((float) i7) / ((float) getWidth()));
                if (!this.E.isFinished()) {
                    this.E.onRelease();
                }
            }
        } else if (i12 > i9 && z4) {
            EdgeEffectCompat.d(this.E, ((float) i11) / ((float) getHeight()), 1.0f - (((float) i7) / ((float) getWidth())));
            if (!this.D.isFinished()) {
                this.D.onRelease();
            }
        }
        if (!this.D.isFinished() || !this.E.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            z3 = z5;
        }
        if (z3 && i8 == 0 && (velocityTracker = this.K) != null) {
            velocityTracker.clear();
        }
        if (i8 == 1) {
            Z(i8);
            this.D.onRelease();
            this.E.onRelease();
        }
        return i10;
    }

    public final void Q(View view) {
        view.getDrawingRect(this.f20454B);
        offsetDescendantRectToMyCoords(view, this.f20454B);
        int h2 = h(this.f20454B);
        if (h2 != 0) {
            scrollBy(0, h2);
        }
    }

    public final boolean R(Rect rect, boolean z2) {
        int h2 = h(rect);
        boolean z3 = h2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, h2);
            } else {
                T(0, h2);
            }
        }
        return z3;
    }

    public final boolean S(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        return x(-i2) < EdgeEffectCompat.b(edgeEffect) * ((float) getHeight());
    }

    public final void T(int i2, int i3) {
        U(i2, i3, 250, false);
    }

    public final void U(int i2, int i3, int i4, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f20453A > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.C;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
                N(z2);
            } else {
                if (!this.C.isFinished()) {
                    a();
                }
                scrollBy(i2, i3);
            }
            this.f20453A = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public void V(int i2, int i3, int i4, boolean z2) {
        U(i2 - getScrollX(), i3 - getScrollY(), i4, z2);
    }

    public void W(int i2, int i3, boolean z2) {
        V(i2, i3, 250, z2);
    }

    public boolean X(int i2, int i3) {
        return this.a0.m(i2, i3);
    }

    public final boolean Y(MotionEvent motionEvent) {
        boolean z2;
        if (EdgeEffectCompat.b(this.D) != 0.0f) {
            EdgeEffectCompat.d(this.D, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z2 = true;
        } else {
            z2 = false;
        }
        if (EdgeEffectCompat.b(this.E) == 0.0f) {
            return z2;
        }
        EdgeEffectCompat.d(this.E, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public void Z(int i2) {
        this.a0.n(i2);
    }

    public final void a() {
        this.C.abortAnimation();
        Z(1);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean c(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f20454B);
            offsetDescendantRectToMyCoords(findNextFocus, this.f20454B);
            P(h(this.f20454B), 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.C.isFinished()) {
            this.C.computeScrollOffset();
            int currY = this.C.getCurrY();
            int i2 = i(currY - this.U);
            this.U = currY;
            int[] iArr = this.S;
            iArr[1] = 0;
            j(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.S[1];
            int scrollRange = getScrollRange();
            if (BuildCompat.d()) {
                Api35Impl.a(this, Math.abs(this.C.getCurrVelocity()));
            }
            if (i3 != 0) {
                int scrollY = getScrollY();
                J(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.S;
                iArr2[1] = 0;
                p(0, scrollY2, 0, i4, this.R, 1, iArr2);
                i3 = i4 - this.S[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (this.D.isFinished()) {
                            this.D.onAbsorb((int) this.C.getCurrVelocity());
                        }
                    } else if (this.E.isFinished()) {
                        this.E.onAbsorb((int) this.C.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.C.isFinished()) {
                postInvalidateOnAnimation();
            } else {
                Z(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.a0.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.a0.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return j(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.a0.e(i2, i3, i4, i5, iArr);
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i3 = 0;
        if (!this.D.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (Api21Impl.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (Api21Impl.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i2, (float) min);
            this.D.setSize(width, height);
            if (this.D.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (!this.E.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (Api21Impl.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i3 = getPaddingLeft();
            }
            if (Api21Impl.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i3 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.E.setSize(width2, height2);
            if (this.E.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        H(i5, i6, iArr);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.W.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.b0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.b0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.b0;
    }

    public int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public int i(int i2) {
        int height = getHeight();
        if (i2 > 0 && EdgeEffectCompat.b(this.D) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * EdgeEffectCompat.d(this.D, (((float) (-i2)) * 4.0f) / ((float) height), 0.5f));
            if (round != i2) {
                this.D.finish();
            }
            return i2 - round;
        } else if (i2 >= 0 || EdgeEffectCompat.b(this.E) == 0.0f) {
            return i2;
        } else {
            float f2 = (float) height;
            int round2 = Math.round((f2 / 4.0f) * EdgeEffectCompat.d(this.E, (((float) i2) * 4.0f) / f2, 0.5f));
            if (round2 != i2) {
                this.E.finish();
            }
            return i2 - round2;
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.a0.j();
    }

    public boolean j(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.a0.c(i2, i3, iArr, iArr2, i4);
    }

    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        H(i5, i6, (int[]) null);
    }

    public boolean l(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public void m(View view, View view2, int i2, int i3) {
        this.W.c(view, view2, i2, i3);
        X(2, i3);
    }

    public void measureChild(View view, int i2, int i3) {
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i2) {
        this.W.d(view, i2);
        Z(i2);
    }

    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        j(i2, i3, iArr, (int[]) null, i4);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        int i3;
        if (motionEvent.getAction() == 8 && !this.J) {
            if (MotionEventCompat.a(motionEvent, 2)) {
                i3 = 9;
                f2 = motionEvent.getAxisValue(9);
                i2 = (int) motionEvent.getX();
            } else if (MotionEventCompat.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i2 = getWidth() / 2;
                i3 = 26;
                f2 = axisValue;
            } else {
                i3 = 0;
                i2 = 0;
                f2 = 0.0f;
            }
            if (f2 != 0.0f) {
                P(-((int) (f2 * getVerticalScrollFactorCompat())), i2, 1, MotionEventCompat.a(motionEvent, 8194));
                if (i3 != 0) {
                    this.e0.g(motionEvent, i3);
                }
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.J) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.Q;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.F) > this.N && (2 & getNestedScrollAxes()) == 0) {
                                this.J = true;
                                this.F = y2;
                                C();
                                this.K.addMovement(motionEvent);
                                this.T = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        I(motionEvent);
                    }
                }
            }
            this.J = false;
            this.Q = -1;
            L();
            if (this.C.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else {
            int y3 = (int) motionEvent.getY();
            if (!z((int) motionEvent.getX(), y3)) {
                if (!Y(motionEvent) && this.C.isFinished()) {
                    z2 = false;
                }
                this.J = z2;
                L();
            } else {
                this.F = y3;
                this.Q = motionEvent.getPointerId(0);
                A();
                this.K.addMovement(motionEvent);
                this.C.computeScrollOffset();
                if (!Y(motionEvent) && this.C.isFinished()) {
                    z2 = false;
                }
                this.J = z2;
                X(2, 0);
            }
        }
        return this.J;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.G = false;
        View view = this.I;
        if (view != null && F(view, this)) {
            Q(this.I);
        }
        this.I = null;
        if (!this.H) {
            if (this.V != null) {
                scrollTo(getScrollX(), this.V.f20457z);
                this.V = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int g2 = g(scrollY, paddingTop, i6);
            if (g2 != scrollY) {
                scrollTo(getScrollX(), g2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.H = true;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.L && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        v((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        o(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        H(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        m(view, view2, i2, 0);
    }

    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && !E(findNextFocus)) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.V = savedState;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f20457z = getScrollY();
        return savedState;
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        OnScrollChangeListener onScrollChangeListener = this.c0;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.a(this, i2, i3, i4, i5);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && G(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.f20454B);
            offsetDescendantRectToMyCoords(findFocus, this.f20454B);
            q(h(this.f20454B));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return l(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.T = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.T);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.K;
                velocityTracker.computeCurrentVelocity(1000, (float) this.P);
                int yVelocity = (int) velocityTracker.getYVelocity(this.Q);
                if (Math.abs(yVelocity) >= this.O) {
                    if (!r(yVelocity)) {
                        int i2 = -yVelocity;
                        float f2 = (float) i2;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            v(i2);
                        }
                    }
                } else if (this.C.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.Q);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.Q + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.F - y2;
                    int M2 = i3 - M(i3, motionEvent.getX(findPointerIndex));
                    if (!this.J && Math.abs(M2) > this.N) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.J = true;
                        M2 = M2 > 0 ? M2 - this.N : M2 + this.N;
                    }
                    if (this.J) {
                        int P2 = P(M2, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.F = y2 - P2;
                        this.T += P2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.J && getChildCount() > 0 && this.C.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.F = (int) motionEvent.getY(actionIndex);
                this.Q = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.F = (int) motionEvent.getY(motionEvent.findPointerIndex(this.Q));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.J && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.C.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.K;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.a0.d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void q(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.M) {
            T(0, i2);
        } else {
            scrollBy(0, i2);
        }
    }

    public final boolean r(int i2) {
        if (EdgeEffectCompat.b(this.D) != 0.0f) {
            if (S(this.D, i2)) {
                this.D.onAbsorb(i2);
            } else {
                v(-i2);
            }
        } else if (EdgeEffectCompat.b(this.E) == 0.0f) {
            return false;
        } else {
            int i3 = -i2;
            if (S(this.E, i3)) {
                this.E.onAbsorb(i3);
            } else {
                v(i3);
            }
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.G) {
            Q(view2);
        } else {
            this.I = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.G = true;
        super.requestLayout();
    }

    public final void s() {
        this.Q = -1;
        this.J = false;
        L();
        Z(0);
        this.D.onRelease();
        this.E.onRelease();
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int g2 = g(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int g3 = g(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (g2 != getScrollX() || g3 != getScrollY()) {
                super.scrollTo(g2, g3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.L) {
            this.L = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.a0.k(z2);
    }

    public void setOnScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        this.c0 = onScrollChangeListener;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.M = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return X(i2, 0);
    }

    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f20454B.setEmpty();
        int i2 = 130;
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : c(130);
            }
            if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i2 = 33;
                }
                K(i2);
                return false;
            } else if (keyCode == 92) {
                return w(33);
            } else {
                if (keyCode == 93) {
                    return w(130);
                }
                if (keyCode == 122) {
                    K(33);
                    return false;
                } else if (keyCode != 123) {
                    return false;
                } else {
                    K(130);
                    return false;
                }
            }
        }
    }

    public final View u(boolean z2, int i2, int i3) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    public void v(int i2) {
        if (getChildCount() > 0) {
            this.C.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
            if (BuildCompat.d()) {
                Api35Impl.a(this, Math.abs(this.C.getCurrVelocity()));
            }
        }
    }

    public boolean w(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f20454B;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f20454B.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f20454B;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f20454B;
        return O(i2, rect3.top, rect3.bottom);
    }

    public final float x(int i2) {
        double log = Math.log((double) ((((float) Math.abs(i2)) * 0.35f) / (this.f20455z * 0.015f)));
        float f2 = f0;
        return (float) (((double) (this.f20455z * 0.015f)) * Math.exp((((double) f2) / (((double) f2) - 1.0d)) * log));
    }

    public boolean y(int i2) {
        return this.a0.i(i2);
    }

    public final boolean z(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f20454B = new Rect();
        this.G = true;
        this.H = false;
        this.I = null;
        this.J = false;
        this.M = true;
        this.Q = -1;
        this.R = new int[2];
        this.S = new int[2];
        DifferentialMotionFlingTargetImpl differentialMotionFlingTargetImpl = new DifferentialMotionFlingTargetImpl();
        this.d0 = differentialMotionFlingTargetImpl;
        this.e0 = new DifferentialMotionFlingController(getContext(), differentialMotionFlingTargetImpl);
        this.D = EdgeEffectCompat.a(context, attributeSet);
        this.E = EdgeEffectCompat.a(context, attributeSet);
        this.f20455z = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.W = new NestedScrollingParentHelper(this);
        this.a0 = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.U(this, g0);
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
