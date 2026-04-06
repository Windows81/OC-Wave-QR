package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

public class ActionBarContextView extends AbsActionBarView {
    public CharSequence H;
    public CharSequence I;
    public View J;
    public View K;
    public View L;
    public LinearLayout M;
    public TextView N;
    public TextView O;
    public int P;
    public int Q;
    public boolean R;
    public int S;

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat f(int i2, long j2) {
        return super.f(i2, j2);
    }

    public boolean g() {
        ActionMenuPresenter actionMenuPresenter = this.C;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.L();
        }
        return false;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.I;
    }

    public CharSequence getTitle() {
        return this.H;
    }

    public void h() {
        if (this.J == null) {
            l();
        }
    }

    public void i(final ActionMode actionMode) {
        View view = this.J;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.S, this, false);
            this.J = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.J);
        }
        View findViewById = this.J.findViewById(R.id.f383i);
        this.K = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actionMode.c();
            }
        });
        MenuBuilder menuBuilder = (MenuBuilder) actionMode.e();
        ActionMenuPresenter actionMenuPresenter = this.C;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.z();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.C = actionMenuPresenter2;
        actionMenuPresenter2.K(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder.c(this.C, this.f980A);
        ActionMenuView actionMenuView = (ActionMenuView) this.C.p(this);
        this.f981B = actionMenuView;
        ViewCompat.X(actionMenuView, (Drawable) null);
        addView(this.f981B, layoutParams);
    }

    public final void j() {
        if (this.M == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.f401a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.M = linearLayout;
            this.N = (TextView) linearLayout.findViewById(R.id.f379e);
            this.O = (TextView) this.M.findViewById(R.id.f378d);
            if (this.P != 0) {
                this.N.setTextAppearance(getContext(), this.P);
            }
            if (this.Q != 0) {
                this.O.setTextAppearance(getContext(), this.Q);
            }
        }
        this.N.setText(this.H);
        this.O.setText(this.I);
        boolean isEmpty = TextUtils.isEmpty(this.H);
        boolean isEmpty2 = TextUtils.isEmpty(this.I);
        int i2 = 8;
        this.O.setVisibility(!isEmpty2 ? 0 : 8);
        LinearLayout linearLayout2 = this.M;
        if (!isEmpty || !isEmpty2) {
            i2 = 0;
        }
        linearLayout2.setVisibility(i2);
        if (this.M.getParent() == null) {
            addView(this.M);
        }
    }

    public boolean k() {
        return this.R;
    }

    public void l() {
        removeAllViews();
        this.L = null;
        this.f981B = null;
        this.C = null;
        View view = this.K;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.C;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.C();
            this.C.D();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean b2 = ViewUtils.b(this);
        int paddingRight = b2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.J;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
            int i6 = b2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d2 = AbsActionBarView.d(paddingRight, i6, b2);
            paddingRight = AbsActionBarView.d(d2 + e(this.J, d2, paddingTop, paddingTop2, b2), i7, b2);
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.M;
        if (!(linearLayout == null || this.L != null || linearLayout.getVisibility() == 8)) {
            i8 += e(this.M, i8, paddingTop, paddingTop2, b2);
        }
        int i9 = i8;
        View view2 = this.L;
        if (view2 != null) {
            e(view2, i9, paddingTop, paddingTop2, b2);
        }
        int paddingLeft = b2 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f981B;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b2);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.D;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            View view = this.J;
            if (view != null) {
                int c2 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
                paddingLeft = c2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f981B;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f981B, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.M;
            if (linearLayout != null && this.L == null) {
                if (this.R) {
                    this.M.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.M.getMeasuredWidth();
                    boolean z2 = measuredWidth <= paddingLeft;
                    if (z2) {
                        paddingLeft -= measuredWidth;
                    }
                    this.M.setVisibility(z2 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.L;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.L.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.D <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i2) {
        this.D = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.L;
        if (view2 != null) {
            removeView(view2);
        }
        this.L = view;
        if (!(view == null || (linearLayout = this.M) == null)) {
            removeView(linearLayout);
            this.M = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.I = charSequence;
        j();
    }

    public void setTitle(CharSequence charSequence) {
        this.H = charSequence;
        j();
        ViewCompat.W(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.R) {
            requestLayout();
        }
        this.R = z2;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f305k);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TintTypedArray u2 = TintTypedArray.u(context, attributeSet, R.styleable.f471y, i2, 0);
        ViewCompat.X(this, u2.f(R.styleable.f472z));
        this.P = u2.m(R.styleable.D, 0);
        this.Q = u2.m(R.styleable.C, 0);
        this.D = u2.l(R.styleable.f446B, 0);
        this.S = u2.m(R.styleable.f445A, R.layout.f404d);
        u2.v();
    }
}
