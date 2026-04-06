package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    public static final int[] n0 = {16843828};
    public static final int[] o0 = {16842931};
    public static final boolean p0 = true;
    public static final boolean q0 = true;

    /* renamed from: A  reason: collision with root package name */
    public float f21234A;

    /* renamed from: B  reason: collision with root package name */
    public int f21235B;
    public int C;
    public float D;
    public Paint E;
    public final ViewDragHelper F;
    public final ViewDragHelper G;
    public final ViewDragCallback H;
    public final ViewDragCallback I;
    public int J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public DrawerListener S;
    public List T;
    public float U;
    public float V;
    public Drawable W;
    public Drawable a0;
    public Drawable b0;
    public CharSequence c0;
    public CharSequence d0;
    public Object e0;
    public boolean f0;
    public Drawable g0;
    public Drawable h0;
    public Drawable i0;
    public Drawable j0;
    public final ArrayList k0;
    public Rect l0;
    public Matrix m0;

    /* renamed from: z  reason: collision with root package name */
    public final ChildAccessibilityDelegate f21236z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$1  reason: invalid class name */
    class AnonymousClass1 implements View.OnApplyWindowInsetsListener {
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).R(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class AccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f21237d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ DrawerLayout f21238e;

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s2;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View p2 = this.f21238e.p();
            if (p2 == null || (s2 = this.f21238e.s(this.f21238e.t(p2))) == null) {
                return true;
            }
            text.add(s2);
            return true;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.p0) {
                super.g(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfoCompat W = AccessibilityNodeInfoCompat.W(accessibilityNodeInfoCompat);
                super.g(view, W);
                accessibilityNodeInfoCompat.J0(view);
                ViewParent v2 = ViewCompat.v(view);
                if (v2 instanceof View) {
                    accessibilityNodeInfoCompat.B0((View) v2);
                }
                o(accessibilityNodeInfoCompat, W);
                W.Y();
                n(accessibilityNodeInfoCompat, (ViewGroup) view);
            }
            accessibilityNodeInfoCompat.i0(DrawerLayout.class.getName());
            accessibilityNodeInfoCompat.r0(false);
            accessibilityNodeInfoCompat.s0(false);
            accessibilityNodeInfoCompat.Z(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20384e);
            accessibilityNodeInfoCompat.Z(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20385f);
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.p0 || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (DrawerLayout.A(childAt)) {
                    accessibilityNodeInfoCompat.c(childAt);
                }
            }
        }

        public final void o(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.f21237d;
            accessibilityNodeInfoCompat2.k(rect);
            accessibilityNodeInfoCompat.d0(rect);
            accessibilityNodeInfoCompat2.l(rect);
            accessibilityNodeInfoCompat.e0(rect);
            accessibilityNodeInfoCompat.T0(accessibilityNodeInfoCompat2.T());
            accessibilityNodeInfoCompat.z0(accessibilityNodeInfoCompat2.w());
            accessibilityNodeInfoCompat.i0(accessibilityNodeInfoCompat2.o());
            accessibilityNodeInfoCompat.m0(accessibilityNodeInfoCompat2.r());
            accessibilityNodeInfoCompat.p0(accessibilityNodeInfoCompat2.J());
            accessibilityNodeInfoCompat.j0(accessibilityNodeInfoCompat2.H());
            accessibilityNodeInfoCompat.r0(accessibilityNodeInfoCompat2.K());
            accessibilityNodeInfoCompat.s0(accessibilityNodeInfoCompat2.L());
            accessibilityNodeInfoCompat.a0(accessibilityNodeInfoCompat2.E());
            accessibilityNodeInfoCompat.I0(accessibilityNodeInfoCompat2.R());
            accessibilityNodeInfoCompat.w0(accessibilityNodeInfoCompat2.O());
            accessibilityNodeInfoCompat.a(accessibilityNodeInfoCompat2.i());
        }
    }

    public static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            if (!DrawerLayout.A(view)) {
                accessibilityNodeInfoCompat.B0((View) null);
            }
        }
    }

    public interface DrawerListener {
        void a(View view);

        void b(View view);

        void c(int i2);

        void d(View view, float f2);
    }

    public static abstract class SimpleDrawerListener implements DrawerListener {
        public void a(View view) {
        }

        public void b(View view) {
        }

        public void c(int i2) {
        }

        public void d(View view, float f2) {
        }
    }

    public class ViewDragCallback extends ViewDragHelper.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final int f21244a;

        /* renamed from: b  reason: collision with root package name */
        public ViewDragHelper f21245b;

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f21246c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ DrawerLayout f21247d;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1  reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ ViewDragCallback f21248z;

            public void run() {
                this.f21248z.o();
            }
        }

        public int a(View view, int i2, int i3) {
            if (this.f21247d.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i2, 0));
            }
            int width = this.f21247d.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i2, width));
        }

        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        public int d(View view) {
            if (this.f21247d.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public void f(int i2, int i3) {
            View n2 = (i2 & 1) == 1 ? this.f21247d.n(3) : this.f21247d.n(5);
            if (n2 != null && this.f21247d.r(n2) == 0) {
                this.f21245b.b(n2, i3);
            }
        }

        public boolean g(int i2) {
            return false;
        }

        public void h(int i2, int i3) {
            this.f21247d.postDelayed(this.f21246c, 160);
        }

        public void i(View view, int i2) {
            ((LayoutParams) view.getLayoutParams()).f21241c = false;
            n();
        }

        public void j(int i2) {
            this.f21247d.V(this.f21244a, i2, this.f21245b.t());
        }

        public void k(View view, int i2, int i3, int i4, int i5) {
            int width = view.getWidth();
            float width2 = (this.f21247d.c(view, 3) ? (float) (i2 + width) : (float) (this.f21247d.getWidth() - i2)) / ((float) width);
            this.f21247d.T(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            this.f21247d.invalidate();
        }

        public void l(View view, float f2, float f3) {
            int i2;
            float u2 = this.f21247d.u(view);
            int width = view.getWidth();
            if (this.f21247d.c(view, 3)) {
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                i2 = (i3 > 0 || (i3 == 0 && u2 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = this.f21247d.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && u2 > 0.5f)) {
                    width2 -= width;
                }
                i2 = width2;
            }
            this.f21245b.I(i2, view.getTop());
            this.f21247d.invalidate();
        }

        public boolean m(View view, int i2) {
            return this.f21247d.D(view) && this.f21247d.c(view, this.f21244a) && this.f21247d.r(view) == 0;
        }

        public final void n() {
            int i2 = 3;
            if (this.f21244a == 3) {
                i2 = 5;
            }
            View n2 = this.f21247d.n(i2);
            if (n2 != null) {
                this.f21247d.f(n2);
            }
        }

        public void o() {
            View view;
            int i2;
            int u2 = this.f21245b.u();
            int i3 = 0;
            boolean z2 = this.f21244a == 3;
            if (z2) {
                view = this.f21247d.n(3);
                if (view != null) {
                    i3 = -view.getWidth();
                }
                i2 = i3 + u2;
            } else {
                view = this.f21247d.n(5);
                i2 = this.f21247d.getWidth() - u2;
            }
            if (view == null) {
                return;
            }
            if (((z2 && view.getLeft() < i2) || (!z2 && view.getLeft() > i2)) && this.f21247d.r(view) == 0) {
                this.f21245b.K(view, i2, view.getTop());
                ((LayoutParams) view.getLayoutParams()).f21241c = true;
                this.f21247d.invalidate();
                n();
                this.f21247d.b();
            }
        }

        public void p() {
            this.f21247d.removeCallbacks(this.f21246c);
        }
    }

    public static boolean A(View view) {
        return (ViewCompat.r(view) == 4 || ViewCompat.r(view) == 2) ? false : true;
    }

    public static String w(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    public static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public boolean B(View view) {
        return ((LayoutParams) view.getLayoutParams()).f21239a == 0;
    }

    public boolean C(View view) {
        if (D(view)) {
            return (((LayoutParams) view.getLayoutParams()).f21242d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean D(View view) {
        int b2 = GravityCompat.b(((LayoutParams) view.getLayoutParams()).f21239a, ViewCompat.s(view));
        return ((b2 & 3) == 0 && (b2 & 5) == 0) ? false : true;
    }

    public boolean E(int i2) {
        View n2 = n(i2);
        if (n2 != null) {
            return F(n2);
        }
        return false;
    }

    public boolean F(View view) {
        if (D(view)) {
            return ((LayoutParams) view.getLayoutParams()).f21240b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean G(float f2, float f3, View view) {
        if (this.l0 == null) {
            this.l0 = new Rect();
        }
        view.getHitRect(this.l0);
        return this.l0.contains((int) f2, (int) f3);
    }

    public final boolean H(Drawable drawable, int i2) {
        if (drawable == null || !DrawableCompat.g(drawable)) {
            return false;
        }
        DrawableCompat.l(drawable, i2);
        return true;
    }

    public void I(View view, float f2) {
        float u2 = u(view);
        float width = (float) view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (u2 * width));
        if (!c(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        T(view, f2);
    }

    public void J(int i2) {
        K(i2, true);
    }

    public void K(int i2, boolean z2) {
        View n2 = n(i2);
        if (n2 != null) {
            M(n2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i2));
    }

    public void L(View view) {
        M(view, true);
    }

    public void M(View view, boolean z2) {
        if (D(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.L) {
                layoutParams.f21240b = 1.0f;
                layoutParams.f21242d = 1;
                U(view, true);
            } else if (z2) {
                layoutParams.f21242d |= 2;
                if (c(view, 3)) {
                    this.F.K(view, 0, view.getTop());
                } else {
                    this.G.K(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                I(view, 1.0f);
                V(layoutParams.f21239a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void N(DrawerListener drawerListener) {
        List list;
        if (drawerListener != null && (list = this.T) != null) {
            list.remove(drawerListener);
        }
    }

    public final Drawable O() {
        int s2 = ViewCompat.s(this);
        if (s2 == 0) {
            Drawable drawable = this.g0;
            if (drawable != null) {
                H(drawable, s2);
                return this.g0;
            }
        } else {
            Drawable drawable2 = this.h0;
            if (drawable2 != null) {
                H(drawable2, s2);
                return this.h0;
            }
        }
        return this.i0;
    }

    public final Drawable P() {
        int s2 = ViewCompat.s(this);
        if (s2 == 0) {
            Drawable drawable = this.h0;
            if (drawable != null) {
                H(drawable, s2);
                return this.h0;
            }
        } else {
            Drawable drawable2 = this.g0;
            if (drawable2 != null) {
                H(drawable2, s2);
                return this.g0;
            }
        }
        return this.j0;
    }

    public final void Q() {
        if (!q0) {
            this.a0 = O();
            this.b0 = P();
        }
    }

    public void R(Object obj, boolean z2) {
        this.e0 = obj;
        this.f0 = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    public void S(int i2, int i3) {
        View n2;
        int b2 = GravityCompat.b(i3, ViewCompat.s(this));
        if (i3 == 3) {
            this.M = i2;
        } else if (i3 == 5) {
            this.N = i2;
        } else if (i3 == 8388611) {
            this.O = i2;
        } else if (i3 == 8388613) {
            this.P = i2;
        }
        if (i2 != 0) {
            (b2 == 3 ? this.F : this.G).a();
        }
        if (i2 == 1) {
            View n3 = n(b2);
            if (n3 != null) {
                f(n3);
            }
        } else if (i2 == 2 && (n2 = n(b2)) != null) {
            L(n2);
        }
    }

    public void T(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 != layoutParams.f21240b) {
            layoutParams.f21240b = f2;
            l(view, f2);
        }
    }

    public final void U(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z2 || D(childAt)) && (!z2 || childAt != view)) {
                ViewCompat.b0(childAt, 4);
            } else {
                ViewCompat.b0(childAt, 1);
            }
        }
    }

    public void V(int i2, int i3, View view) {
        int i4;
        int x2 = this.F.x();
        int x3 = this.G.x();
        if (x2 == 1 || x3 == 1) {
            i4 = 1;
        } else {
            i4 = 2;
            if (!(x2 == 2 || x3 == 2)) {
                i4 = 0;
            }
        }
        if (view != null && i3 == 0) {
            float f2 = ((LayoutParams) view.getLayoutParams()).f21240b;
            if (f2 == 0.0f) {
                j(view);
            } else if (f2 == 1.0f) {
                k(view);
            }
        }
        if (i4 != this.J) {
            this.J = i4;
            List list = this.T;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.T.get(size)).c(i4);
                }
            }
        }
    }

    public void a(DrawerListener drawerListener) {
        if (drawerListener != null) {
            if (this.T == null) {
                this.T = new ArrayList();
            }
            this.T.add(drawerListener);
        }
    }

    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!D(childAt)) {
                    this.k0.add(childAt);
                } else if (C(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.k0.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = (View) this.k0.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.k0.clear();
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (o() != null || D(view)) {
            ViewCompat.b0(view, 4);
        } else {
            ViewCompat.b0(view, 1);
        }
        if (!p0) {
            ViewCompat.U(view, this.f21236z);
        }
    }

    public void b() {
        if (!this.R) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.R = true;
        }
    }

    public boolean c(View view, int i2) {
        return (t(view) & i2) == i2;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((LayoutParams) getChildAt(i2).getLayoutParams()).f21240b);
        }
        this.D = f2;
        boolean m2 = this.F.m(true);
        boolean m3 = this.G.m(true);
        if (m2 || m3) {
            ViewCompat.O(this);
        }
    }

    public void d(int i2) {
        e(i2, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.D <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (G(x2, y2, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B2 = B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (B2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.D;
        if (f2 > 0.0f && B2) {
            int i5 = this.C;
            this.E.setColor((i5 & 16777215) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) width, (float) getHeight(), this.E);
        } else if (this.a0 != null && c(view2, 3)) {
            int intrinsicWidth = this.a0.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.F.u()), 1.0f));
            this.a0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.a0.setAlpha((int) (max * 255.0f));
            this.a0.draw(canvas);
        } else if (this.b0 != null && c(view2, 5)) {
            int intrinsicWidth2 = this.b0.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.G.u()), 1.0f));
            this.b0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.b0.setAlpha((int) (max2 * 255.0f));
            this.b0.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i2, boolean z2) {
        View n2 = n(i2);
        if (n2 != null) {
            g(n2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i2));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z2) {
        if (D(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.L) {
                layoutParams.f21240b = 0.0f;
                layoutParams.f21242d = 0;
            } else if (z2) {
                layoutParams.f21242d |= 4;
                if (c(view, 3)) {
                    this.F.K(view, -view.getWidth(), view.getTop());
                } else {
                    this.G.K(view, getWidth(), view.getTop());
                }
            } else {
                I(view, 0.0f);
                V(layoutParams.f21239a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (q0) {
            return this.f21234A;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.W;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z2) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (D(childAt) && (!z2 || layoutParams.f21241c)) {
                z3 |= c(childAt, 3) ? this.F.K(childAt, -childAt.getWidth(), childAt.getTop()) : this.G.K(childAt, getWidth(), childAt.getTop());
                layoutParams.f21241c = false;
            }
        }
        this.H.p();
        this.I.p();
        if (z3) {
            invalidate();
        }
    }

    public void j(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f21242d & 1) == 1) {
            layoutParams.f21242d = 0;
            List list = this.T;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.T.get(size)).b(view);
                }
            }
            U(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    public void k(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f21242d & 1) == 0) {
            layoutParams.f21242d = 1;
            List list = this.T;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.T.get(size)).a(view);
                }
            }
            U(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f2) {
        List list = this.T;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((DrawerListener) this.T.get(size)).d(view, f2);
            }
        }
    }

    public final boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v2 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v2);
            v2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    public View n(int i2) {
        int b2 = GravityCompat.b(i2, ViewCompat.s(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((t(childAt) & 7) == b2) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).f21242d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f0 && this.W != null) {
            Object obj = this.e0;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.W.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.W.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r7 = r6.F.r((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.ViewDragHelper r1 = r6.F
            boolean r1 = r1.J(r7)
            androidx.customview.widget.ViewDragHelper r2 = r6.G
            boolean r2 = r2.J(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0038
        L_0x001e:
            androidx.customview.widget.ViewDragHelper r7 = r6.F
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L_0x0038
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r7 = r6.H
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r7 = r6.I
            r7.p()
            goto L_0x0038
        L_0x0031:
            r6.i(r2)
            r6.Q = r3
            r6.R = r3
        L_0x0038:
            r7 = r3
            goto L_0x0064
        L_0x003a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.U = r0
            r6.V = r7
            float r4 = r6.D
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            androidx.customview.widget.ViewDragHelper r4 = r6.F
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.r(r0, r7)
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L_0x005f
            r7 = r2
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            r6.Q = r3
            r6.R = r3
        L_0x0064:
            if (r1 != 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.y()
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.R
            if (r7 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = r3
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !z()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View p2 = p();
        if (p2 != null && r(p2) == 0) {
            h();
        }
        return p2 != null;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f2;
        int i6;
        boolean z3 = true;
        this.K = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i9 = layoutParams.leftMargin;
                    childAt.layout(i9, layoutParams.topMargin, childAt.getMeasuredWidth() + i9, layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (layoutParams.f21240b * f3));
                        f2 = ((float) (measuredWidth + i6)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        int i10 = i7 - ((int) (layoutParams.f21240b * f4));
                        f2 = ((float) (i7 - i10)) / f4;
                        i6 = i10;
                    }
                    boolean z4 = f2 != layoutParams.f21240b ? z3 : false;
                    int i11 = layoutParams.f21239a & 112;
                    if (i11 == 16) {
                        int i12 = i5 - i3;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = layoutParams.topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = layoutParams.bottomMargin;
                            if (i15 > i12 - i16) {
                                i13 = (i12 - i16) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i13, measuredWidth + i6, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = layoutParams.topMargin;
                        childAt.layout(i6, i17, measuredWidth + i6, measuredHeight + i17);
                    } else {
                        int i18 = i5 - i3;
                        childAt.layout(i6, (i18 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i18 - layoutParams.bottomMargin);
                    }
                    if (z4) {
                        T(childAt, f2);
                    }
                    int i19 = layoutParams.f21240b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
            i8++;
            z3 = true;
        }
        this.K = false;
        this.L = false;
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        boolean z2 = this.e0 != null && ViewCompat.q(this);
        int s2 = ViewCompat.s(this);
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z2) {
                    int b2 = GravityCompat.b(layoutParams.f21239a, s2);
                    if (ViewCompat.q(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.e0;
                        if (b2 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.e0;
                        if (b2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (D(childAt)) {
                    if (q0) {
                        float o2 = ViewCompat.o(childAt);
                        float f2 = this.f21234A;
                        if (o2 != f2) {
                            ViewCompat.a0(childAt, f2);
                        }
                    }
                    int t2 = t(childAt) & 7;
                    boolean z5 = t2 == 3;
                    if ((!z5 || !z3) && (z5 || !z4)) {
                        if (z5) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.f21235B + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), ViewGroup.getChildMeasureSpec(i3, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t2) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i5 = i2;
            int i6 = i3;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View n2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i2 = savedState.f21243B;
        if (!(i2 == 0 || (n2 = n(i2)) == null)) {
            L(n2);
        }
        int i3 = savedState.C;
        if (i3 != 3) {
            S(i3, 3);
        }
        int i4 = savedState.D;
        if (i4 != 3) {
            S(i4, 5);
        }
        int i5 = savedState.E;
        if (i5 != 3) {
            S(i5, 8388611);
        }
        int i6 = savedState.F;
        if (i6 != 3) {
            S(i6, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        Q();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            int i3 = layoutParams.f21242d;
            boolean z2 = true;
            boolean z3 = i3 == 1;
            if (i3 != 2) {
                z2 = false;
            }
            if (z3 || z2) {
                savedState.f21243B = layoutParams.f21239a;
            } else {
                i2++;
            }
        }
        savedState.C = this.M;
        savedState.D = this.N;
        savedState.E = this.O;
        savedState.F = this.P;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View o2;
        this.F.C(motionEvent);
        this.G.C(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.U = x2;
            this.V = y2;
            this.Q = false;
            this.R = false;
        } else if (action == 1) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            View r2 = this.F.r((int) x3, (int) y3);
            if (r2 != null && B(r2)) {
                float f2 = x3 - this.U;
                float f3 = y3 - this.V;
                int w2 = this.F.w();
                if (!((f2 * f2) + (f3 * f3) >= ((float) (w2 * w2)) || (o2 = o()) == null || r(o2) == 2)) {
                    z2 = false;
                    i(z2);
                    this.Q = false;
                }
            }
            z2 = true;
            i(z2);
            this.Q = false;
        } else if (action == 3) {
            i(true);
            this.Q = false;
            this.R = false;
        }
        return true;
    }

    public View p() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (D(childAt) && F(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i2) {
        int s2 = ViewCompat.s(this);
        if (i2 == 3) {
            int i3 = this.M;
            if (i3 != 3) {
                return i3;
            }
            int i4 = s2 == 0 ? this.O : this.P;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 5) {
            int i5 = this.N;
            if (i5 != 3) {
                return i5;
            }
            int i6 = s2 == 0 ? this.P : this.O;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i7 = this.O;
            if (i7 != 3) {
                return i7;
            }
            int i8 = s2 == 0 ? this.M : this.N;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i9 = this.P;
            if (i9 != 3) {
                return i9;
            }
            int i10 = s2 == 0 ? this.N : this.M;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    public int r(View view) {
        if (D(view)) {
            return q(((LayoutParams) view.getLayoutParams()).f21239a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        this.Q = z2;
        if (z2) {
            i(true);
        }
    }

    public void requestLayout() {
        if (!this.K) {
            super.requestLayout();
        }
    }

    public CharSequence s(int i2) {
        int b2 = GravityCompat.b(i2, ViewCompat.s(this));
        if (b2 == 3) {
            return this.c0;
        }
        if (b2 == 5) {
            return this.d0;
        }
        return null;
    }

    public void setDrawerElevation(float f2) {
        this.f21234A = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (D(childAt)) {
                ViewCompat.a0(childAt, this.f21234A);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        DrawerListener drawerListener2 = this.S;
        if (drawerListener2 != null) {
            N(drawerListener2);
        }
        if (drawerListener != null) {
            a(drawerListener);
        }
        this.S = drawerListener;
    }

    public void setDrawerLockMode(int i2) {
        S(i2, 3);
        S(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.C = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.W = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.W = new ColorDrawable(i2);
        invalidate();
    }

    public int t(View view) {
        return GravityCompat.b(((LayoutParams) view.getLayoutParams()).f21239a, ViewCompat.s(this));
    }

    public float u(View view) {
        return ((LayoutParams) view.getLayoutParams()).f21240b;
    }

    public final MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.m0 == null) {
                this.m0 = new Matrix();
            }
            matrix.invert(this.m0);
            obtain.transform(this.m0);
        }
        return obtain;
    }

    public final boolean y() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((LayoutParams) getChildAt(i2).getLayoutParams()).f21241c) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return p() != null;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setStatusBarBackground(int i2) {
        this.W = i2 != 0 ? ContextCompat.e(getContext(), i2) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f21239a = 0;

        /* renamed from: b  reason: collision with root package name */
        public float f21240b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f21241c;

        /* renamed from: d  reason: collision with root package name */
        public int f21242d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.o0);
            this.f21239a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f21239a = layoutParams.f21239a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: B  reason: collision with root package name */
        public int f21243B = 0;
        public int C;
        public int D;
        public int E;
        public int F;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f21243B = parcel.readInt();
            this.C = parcel.readInt();
            this.D = parcel.readInt();
            this.E = parcel.readInt();
            this.F = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f21243B);
            parcel.writeInt(this.C);
            parcel.writeInt(this.D);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
