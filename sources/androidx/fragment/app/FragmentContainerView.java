package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: A  reason: collision with root package name */
    public final List f21592A = new ArrayList();

    /* renamed from: B  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f21593B;
    public boolean C = true;

    /* renamed from: z  reason: collision with root package name */
    public final List f21594z = new ArrayList();

    @Metadata
    public static final class Api20Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api20Impl f21595a = new Api20Impl();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            Intrinsics.i(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.i(view, "v");
            Intrinsics.i(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            Intrinsics.h(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        Intrinsics.i(context, "context");
        Intrinsics.i(attributeSet, "attrs");
        Intrinsics.i(fragmentManager, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = R.styleable.f21485e;
        Intrinsics.h(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(R.styleable.f21486f) : classAttribute;
        String string = obtainStyledAttributes.getString(R.styleable.f21487g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment k0 = fragmentManager.k0(id);
        if (classAttribute != null && k0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a2 = fragmentManager.x0().a(context.getClassLoader(), classAttribute);
            Intrinsics.h(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.L0(context, attributeSet, (Bundle) null);
            fragmentManager.p().r(true).d(this, a2, string).k();
        }
        fragmentManager.c1(this);
    }

    public final void a(View view) {
        if (this.f21592A.contains(view)) {
            this.f21594z.add(view);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.i(view, "child");
        if (FragmentManager.H0(view) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompat;
        Intrinsics.i(windowInsets, "insets");
        WindowInsetsCompat x2 = WindowInsetsCompat.x(windowInsets);
        Intrinsics.h(x2, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f21593B;
        if (onApplyWindowInsetsListener != null) {
            Api20Impl api20Impl = Api20Impl.f21595a;
            Intrinsics.f(onApplyWindowInsetsListener);
            windowInsetsCompat = WindowInsetsCompat.x(api20Impl.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            windowInsetsCompat = ViewCompat.J(this, x2);
        }
        Intrinsics.h(windowInsetsCompat, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!windowInsetsCompat.p()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewCompat.e(getChildAt(i2), windowInsetsCompat);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        Intrinsics.i(canvas, "canvas");
        if (this.C) {
            for (View drawChild : this.f21594z) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        Intrinsics.i(canvas, "canvas");
        Intrinsics.i(view, "child");
        if (!this.C || this.f21594z.isEmpty() || !this.f21594z.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    public void endViewTransition(View view) {
        Intrinsics.i(view, "view");
        this.f21592A.remove(view);
        if (this.f21594z.remove(view)) {
            this.C = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return FragmentManager.n0(this).k0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Intrinsics.i(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                Intrinsics.h(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(View view) {
        Intrinsics.i(view, "view");
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        Intrinsics.h(childAt, "view");
        a(childAt);
        super.removeViewAt(i2);
    }

    public void removeViewInLayout(View view) {
        Intrinsics.i(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            Intrinsics.h(childAt, "view");
            a(childAt);
        }
        super.removeViews(i2, i3);
    }

    public void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            Intrinsics.h(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i2, i3);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.C = z2;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Intrinsics.i(onApplyWindowInsetsListener, "listener");
        this.f21593B = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        Intrinsics.i(view, "view");
        if (view.getParent() == this) {
            this.f21592A.add(view);
        }
        super.startViewTransition(view);
    }
}
