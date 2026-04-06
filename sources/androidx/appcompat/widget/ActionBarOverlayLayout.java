package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {
    public static final int[] h0 = {R.attr.f296b, 16842841};

    /* renamed from: A  reason: collision with root package name */
    public int f993A = 0;

    /* renamed from: B  reason: collision with root package name */
    public ContentFrameLayout f994B;
    public ActionBarContainer C;
    public DecorToolbar D;
    public Drawable E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public final Rect M = new Rect();
    public final Rect N = new Rect();
    public final Rect O = new Rect();
    public final Rect P = new Rect();
    public final Rect Q = new Rect();
    public final Rect R = new Rect();
    public final Rect S = new Rect();
    public WindowInsetsCompat T;
    public WindowInsetsCompat U;
    public WindowInsetsCompat V;
    public WindowInsetsCompat W;
    public ActionBarVisibilityCallback a0;
    public OverScroller b0;
    public ViewPropertyAnimator c0;
    public final AnimatorListenerAdapter d0;
    public final Runnable e0;
    public final Runnable f0;
    public final NestedScrollingParentHelper g0;

    /* renamed from: z  reason: collision with root package name */
    public int f995z;

    public interface ActionBarVisibilityCallback {
        void a();

        void b();

        void c(boolean z2);

        void d();

        void e();

        void f(int i2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
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

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f20331b;
        this.T = windowInsetsCompat;
        this.U = windowInsetsCompat;
        this.V = windowInsetsCompat;
        this.W = windowInsetsCompat;
        this.d0 = new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.c0 = null;
                actionBarOverlayLayout.J = false;
            }

            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.c0 = null;
                actionBarOverlayLayout.J = false;
            }
        };
        this.e0 = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.u();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.c0 = actionBarOverlayLayout.C.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.d0);
            }
        };
        this.f0 = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.u();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.c0 = actionBarOverlayLayout.C.animate().translationY((float) (-ActionBarOverlayLayout.this.C.getHeight())).setListener(ActionBarOverlayLayout.this.d0);
            }
        };
        v(context);
        this.g0 = new NestedScrollingParentHelper(this);
    }

    public final void A() {
        u();
        this.e0.run();
    }

    public final boolean B(float f2) {
        this.b0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.b0.getFinalY() > this.C.getHeight();
    }

    public void a(Menu menu, MenuPresenter.Callback callback) {
        z();
        this.D.a(menu, callback);
    }

    public boolean b() {
        z();
        return this.D.b();
    }

    public void c() {
        z();
        this.D.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean d() {
        z();
        return this.D.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.E != null && !this.F) {
            int bottom = this.C.getVisibility() == 0 ? (int) (((float) this.C.getBottom()) + this.C.getTranslationY() + 0.5f) : 0;
            this.E.setBounds(0, bottom, getWidth(), this.E.getIntrinsicHeight() + bottom);
            this.E.draw(canvas);
        }
    }

    public boolean e() {
        z();
        return this.D.e();
    }

    public void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        k(view, i2, i3, i4, i5, i6);
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        z();
        return this.D.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.C;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.g0.a();
    }

    public CharSequence getTitle() {
        z();
        return this.D.getTitle();
    }

    public boolean h() {
        z();
        return this.D.h();
    }

    public void i(int i2) {
        z();
        if (i2 == 2) {
            this.D.w();
        } else if (i2 == 5) {
            this.D.x();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public void j() {
        z();
        this.D.i();
    }

    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public boolean l(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public void m(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public void n(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        WindowInsetsCompat y2 = WindowInsetsCompat.y(windowInsets, this);
        boolean q2 = q(this.C, new Rect(y2.j(), y2.l(), y2.k(), y2.i()), true, true, false, true);
        ViewCompat.d(this, y2, this.M);
        Rect rect = this.M;
        WindowInsetsCompat n2 = y2.n(rect.left, rect.top, rect.right, rect.bottom);
        this.T = n2;
        boolean z2 = true;
        if (!this.U.equals(n2)) {
            this.U = this.T;
            q2 = true;
        }
        if (!this.N.equals(this.M)) {
            this.N.set(this.M);
        } else {
            z2 = q2;
        }
        if (z2) {
            requestLayout();
        }
        return y2.a().c().b().w();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        ViewCompat.R(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = layoutParams.leftMargin + paddingLeft;
                int i8 = layoutParams.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        z();
        measureChildWithMargins(this.C, i2, 0, i3, 0);
        LayoutParams layoutParams = (LayoutParams) this.C.getLayoutParams();
        int max = Math.max(0, this.C.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.C.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.C.getMeasuredState());
        boolean z2 = (ViewCompat.z(this) & 256) != 0;
        if (z2) {
            i4 = this.f995z;
            if (this.H && this.C.getTabContainer() != null) {
                i4 += this.f995z;
            }
        } else {
            i4 = this.C.getVisibility() != 8 ? this.C.getMeasuredHeight() : 0;
        }
        this.O.set(this.M);
        WindowInsetsCompat windowInsetsCompat = this.T;
        this.V = windowInsetsCompat;
        if (this.G || z2) {
            this.V = new WindowInsetsCompat.Builder(this.V).d(Insets.b(windowInsetsCompat.j(), this.V.l() + i4, this.V.k(), this.V.i())).a();
        } else {
            Rect rect = this.O;
            rect.top += i4;
            rect.bottom = rect.bottom;
            this.V = windowInsetsCompat.n(0, i4, 0, 0);
        }
        q(this.f994B, this.O, true, true, true, true);
        if (!this.W.equals(this.V)) {
            WindowInsetsCompat windowInsetsCompat2 = this.V;
            this.W = windowInsetsCompat2;
            ViewCompat.e(this.f994B, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f994B, i2, 0, i3, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f994B.getLayoutParams();
        int max3 = Math.max(max, this.f994B.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f994B.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f994B.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.I || !z2) {
            return false;
        }
        if (B(f3)) {
            p();
        } else {
            A();
        }
        this.J = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.K + i3;
        this.K = i6;
        setActionBarHideOffset(i6);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.g0.b(view, view2, i2);
        this.K = getActionBarHideOffset();
        u();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.a0;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.C.getVisibility() != 0) {
            return false;
        }
        return this.I;
    }

    public void onStopNestedScroll(View view) {
        if (this.I && !this.J) {
            if (this.K <= this.C.getHeight()) {
                y();
            } else {
                x();
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.a0;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        z();
        int i3 = this.L ^ i2;
        this.L = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.a0;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.c(!z2);
            if (z3 || !z2) {
                this.a0.a();
            } else {
                this.a0.d();
            }
        }
        if ((i3 & 256) != 0 && this.a0 != null) {
            ViewCompat.R(this);
        }
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f993A = i2;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.a0;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.f(i2);
        }
    }

    public final void p() {
        u();
        this.f0.run();
    }

    public final boolean q(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z2 || layoutParams.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            layoutParams.leftMargin = i5;
            z6 = true;
        }
        if (z3 && layoutParams.topMargin != (i4 = rect.top)) {
            layoutParams.topMargin = i4;
            z6 = true;
        }
        if (z5 && layoutParams.rightMargin != (i3 = rect.right)) {
            layoutParams.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || layoutParams.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        layoutParams.bottomMargin = i2;
        return true;
    }

    /* renamed from: r */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: s */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.C.setTranslationY((float) (-Math.max(0, Math.min(i2, this.C.getHeight()))));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.a0 = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.a0.f(this.f993A);
            int i2 = this.L;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                ViewCompat.R(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.H = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.I) {
            this.I = z2;
            if (!z2) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        z();
        this.D.setIcon(i2);
    }

    public void setLogo(int i2) {
        z();
        this.D.n(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.G = z2;
        this.F = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.D.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.D.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final DecorToolbar t(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void u() {
        removeCallbacks(this.e0);
        removeCallbacks(this.f0);
        ViewPropertyAnimator viewPropertyAnimator = this.c0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(h0);
        boolean z2 = false;
        this.f995z = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.E = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.F = z2;
        this.b0 = new OverScroller(context);
    }

    public boolean w() {
        return this.G;
    }

    public final void x() {
        u();
        postDelayed(this.f0, 600);
    }

    public final void y() {
        u();
        postDelayed(this.e0, 600);
    }

    public void z() {
        if (this.f994B == null) {
            this.f994B = (ContentFrameLayout) findViewById(R.id.f376b);
            this.C = (ActionBarContainer) findViewById(R.id.f377c);
            this.D = t(findViewById(R.id.f375a));
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.D.setIcon(drawable);
    }
}
