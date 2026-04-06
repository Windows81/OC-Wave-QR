package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public final Context f980A;

    /* renamed from: B  reason: collision with root package name */
    public ActionMenuView f981B;
    public ActionMenuPresenter C;
    public int D;
    public ViewPropertyAnimatorCompat E;
    public boolean F;
    public boolean G;

    /* renamed from: z  reason: collision with root package name */
    public final VisibilityAnimListener f982z = new VisibilityAnimListener();

    /* renamed from: androidx.appcompat.widget.AbsActionBarView$1  reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ AbsActionBarView f983z;

        public void run() {
            this.f983z.g();
        }
    }

    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f984a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f985b;

        public VisibilityAnimListener() {
        }

        public void a(View view) {
            this.f984a = true;
        }

        public void b(View view) {
            if (!this.f984a) {
                AbsActionBarView absActionBarView = AbsActionBarView.this;
                absActionBarView.E = null;
                AbsActionBarView.super.setVisibility(this.f985b);
            }
        }

        public void c(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f984a = false;
        }

        public VisibilityAnimListener d(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i2) {
            AbsActionBarView.this.E = viewPropertyAnimatorCompat;
            this.f985b = i2;
            return this;
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.f295a, typedValue, true) || typedValue.resourceId == 0) {
            this.f980A = context;
        } else {
            this.f980A = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i2, int i3, boolean z2) {
        return z2 ? i2 - i3 : i2 + i3;
    }

    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int e(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public ViewPropertyAnimatorCompat f(int i2, long j2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.E;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.c();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimatorCompat b2 = ViewCompat.c(this).b(1.0f);
            b2.f(j2);
            b2.h(this.f982z.d(b2, i2));
            return b2;
        }
        ViewPropertyAnimatorCompat b3 = ViewCompat.c(this).b(0.0f);
        b3.f(j2);
        b3.h(this.f982z.d(b3, i2));
        return b3;
    }

    public boolean g() {
        ActionMenuPresenter actionMenuPresenter = this.C;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.L();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.E != null ? this.f982z.f985b : getVisibility();
    }

    public int getContentHeight() {
        return this.D;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.f447a, R.attr.f297c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R.styleable.f456j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.C;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.G(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.D = i2;
        requestLayout();
    }

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.E;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.c();
            }
            super.setVisibility(i2);
        }
    }
}
