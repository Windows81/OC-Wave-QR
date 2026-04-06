package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    public MenuBuilder O;
    public Context P;
    public int Q;
    public boolean R;
    public ActionMenuPresenter S;
    public MenuPresenter.Callback T;
    public MenuBuilder.Callback U;
    public boolean V;
    public int W;
    public int a0;
    public int b0;
    public OnMenuItemClickListener c0;

    public interface ActionMenuChildView {
        boolean a();

        boolean b();
    }

    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public void c(MenuBuilder menuBuilder, boolean z2) {
        }

        public boolean d(MenuBuilder menuBuilder) {
            return false;
        }
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1006a;

        /* renamed from: b  reason: collision with root package name */
        public int f1007b;

        /* renamed from: c  reason: collision with root package name */
        public int f1008c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1009d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1010e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1011f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1006a = layoutParams.f1006a;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f1006a = false;
        }
    }

    public class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        public boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.c0;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        public void b(MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.U;
            if (callback != null) {
                callback.b(menuBuilder);
            }
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static int J(View view, int i2, int i3, int i4, int i5) {
        int i6;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = false;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.r();
        if (i3 > 0) {
            i6 = 2;
            if (!z3 || i3 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i7 = measuredWidth / i2;
                if (measuredWidth % i2 != 0) {
                    i7++;
                }
                if (!z3 || i7 >= 2) {
                    i6 = i7;
                }
                if (!layoutParams.f1006a && z3) {
                    z2 = true;
                }
                layoutParams.f1009d = z2;
                layoutParams.f1007b = i6;
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
                return i6;
            }
        }
        i6 = 0;
        z2 = true;
        layoutParams.f1009d = z2;
        layoutParams.f1007b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    /* renamed from: A */
    public LayoutParams k() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* renamed from: B */
    public LayoutParams l(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: C */
    public LayoutParams m(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return k();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.gravity <= 0) {
            layoutParams2.gravity = 16;
        }
        return layoutParams2;
    }

    public LayoutParams D() {
        LayoutParams A2 = k();
        A2.f1006a = true;
        return A2;
    }

    public boolean E(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z2 = ((ActionMenuChildView) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? z2 : z2 | ((ActionMenuChildView) childAt2).b();
    }

    public boolean F() {
        ActionMenuPresenter actionMenuPresenter = this.S;
        return actionMenuPresenter != null && actionMenuPresenter.C();
    }

    public boolean G() {
        ActionMenuPresenter actionMenuPresenter = this.S;
        return actionMenuPresenter != null && actionMenuPresenter.E();
    }

    public boolean H() {
        ActionMenuPresenter actionMenuPresenter = this.S;
        return actionMenuPresenter != null && actionMenuPresenter.F();
    }

    public boolean I() {
        return this.R;
    }

    public final void K(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        int i8;
        boolean z5;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.a0;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        boolean z6 = false;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        long j2 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i19 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i20 = i16 + 1;
                if (z7) {
                    int i21 = this.b0;
                    i8 = i20;
                    z5 = false;
                    childAt.setPadding(i21, 0, i21, 0);
                } else {
                    i8 = i20;
                    z5 = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f1011f = z5;
                layoutParams.f1008c = z5 ? 1 : 0;
                layoutParams.f1007b = z5;
                layoutParams.f1009d = z5;
                layoutParams.leftMargin = z5;
                layoutParams.rightMargin = z5;
                layoutParams.f1010e = z7 && ((ActionMenuItemView) childAt).r();
                int J = J(childAt, i13, layoutParams.f1006a ? 1 : i11, childMeasureSpec, paddingTop);
                i17 = Math.max(i17, J);
                if (layoutParams.f1009d) {
                    i18++;
                }
                if (layoutParams.f1006a) {
                    z6 = true;
                }
                i11 -= J;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (J == 1) {
                    j2 |= (long) (1 << i15);
                    i14 = i14;
                } else {
                    int i22 = i14;
                }
                i16 = i8;
            }
            i15++;
            size2 = i19;
        }
        int i23 = size2;
        boolean z8 = z6 && i16 == 2;
        boolean z9 = false;
        while (true) {
            if (i18 <= 0 || i11 <= 0) {
                i6 = mode;
                i4 = i9;
                z2 = z9;
                i5 = i14;
            } else {
                int i24 = Integer.MAX_VALUE;
                int i25 = 0;
                int i26 = 0;
                long j3 = 0;
                while (i26 < childCount) {
                    boolean z10 = z9;
                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i26).getLayoutParams();
                    int i27 = i14;
                    if (layoutParams2.f1009d) {
                        int i28 = layoutParams2.f1007b;
                        if (i28 < i24) {
                            j3 = 1 << i26;
                            i24 = i28;
                            i25 = 1;
                        } else if (i28 == i24) {
                            i25++;
                            j3 |= 1 << i26;
                        }
                    }
                    i26++;
                    i14 = i27;
                    z9 = z10;
                }
                z2 = z9;
                i5 = i14;
                j2 |= j3;
                if (i25 > i11) {
                    i6 = mode;
                    i4 = i9;
                    break;
                }
                int i29 = i24 + 1;
                int i30 = 0;
                while (i30 < childCount) {
                    View childAt2 = getChildAt(i30);
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    int i31 = i9;
                    int i32 = mode;
                    long j4 = (long) (1 << i30);
                    if ((j3 & j4) == 0) {
                        if (layoutParams3.f1007b == i29) {
                            j2 |= j4;
                        }
                        z4 = z8;
                    } else {
                        if (!z8 || !layoutParams3.f1010e || i11 != 1) {
                            z4 = z8;
                        } else {
                            int i33 = this.b0;
                            z4 = z8;
                            childAt2.setPadding(i33 + i13, 0, i33, 0);
                        }
                        layoutParams3.f1007b++;
                        layoutParams3.f1011f = true;
                        i11--;
                    }
                    i30++;
                    mode = i32;
                    i9 = i31;
                    z8 = z4;
                }
                i14 = i5;
                z9 = true;
            }
        }
        boolean z11 = !z6 && i16 == 1;
        if (i11 <= 0 || j2 == 0 || (i11 >= i16 - 1 && !z11 && i17 <= 1)) {
            i7 = 0;
            z3 = z2;
        } else {
            float bitCount = (float) Long.bitCount(j2);
            if (!z11) {
                i7 = 0;
                if ((j2 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f1010e) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount - 1;
                if ((j2 & ((long) (1 << i34))) != 0 && !((LayoutParams) getChildAt(i34).getLayoutParams()).f1010e) {
                    bitCount -= 0.5f;
                }
            } else {
                i7 = 0;
            }
            int i35 = bitCount > 0.0f ? (int) (((float) (i11 * i13)) / bitCount) : i7;
            z3 = z2;
            for (int i36 = i7; i36 < childCount; i36++) {
                if ((j2 & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f1008c = i35;
                        layoutParams4.f1011f = true;
                        if (i36 == 0 && !layoutParams4.f1010e) {
                            layoutParams4.leftMargin = (-i35) / 2;
                        }
                        z3 = true;
                    } else if (layoutParams4.f1006a) {
                        layoutParams4.f1008c = i35;
                        layoutParams4.f1011f = true;
                        layoutParams4.rightMargin = (-i35) / 2;
                        z3 = true;
                    } else {
                        if (i36 != 0) {
                            layoutParams4.leftMargin = i35 / 2;
                        }
                        if (i36 != childCount - 1) {
                            layoutParams4.rightMargin = i35 / 2;
                        }
                    }
                }
            }
        }
        if (z3) {
            for (int i37 = i7; i37 < childCount; i37++) {
                View childAt4 = getChildAt(i37);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f1011f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f1007b * i13) + layoutParams5.f1008c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i6 != 1073741824 ? i5 : i23);
    }

    public MenuBuilder L() {
        return this.O;
    }

    public void M(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.T = callback;
        this.U = callback2;
    }

    public boolean N() {
        ActionMenuPresenter actionMenuPresenter = this.S;
        return actionMenuPresenter != null && actionMenuPresenter.L();
    }

    public boolean a(MenuItemImpl menuItemImpl) {
        return this.O.L(menuItemImpl, 0);
    }

    public void b(MenuBuilder menuBuilder) {
        this.O = menuBuilder;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.O == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.O = menuBuilder;
            menuBuilder.R(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.S = actionMenuPresenter;
            actionMenuPresenter.K(true);
            ActionMenuPresenter actionMenuPresenter2 = this.S;
            MenuPresenter.Callback callback = this.T;
            if (callback == null) {
                callback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.h(callback);
            this.O.c(this.S, this.P);
            this.S.I(this);
        }
        return this.O;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.S.B();
    }

    public int getPopupTheme() {
        return this.Q;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.S;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.d(false);
            if (this.S.F()) {
                this.S.C();
                this.S.L();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (!this.V) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i4 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = ViewUtils.b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1006a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + layoutParams.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    E(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (b2) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1006a) {
                    int i18 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1006a) {
                int i21 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        MenuBuilder menuBuilder;
        boolean z2 = this.V;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.V = z3;
        if (z2 != z3) {
            this.W = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.V || (menuBuilder = this.O) == null || size == this.W)) {
            this.W = size;
            menuBuilder.K(true);
        }
        int childCount = getChildCount();
        if (!this.V || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        K(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.S.H(z2);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.c0 = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.S.J(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.R = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.Q != i2) {
            this.Q = i2;
            if (i2 == 0) {
                this.P = getContext();
            } else {
                this.P = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.S = actionMenuPresenter;
        actionMenuPresenter.I(this);
    }

    public void z() {
        ActionMenuPresenter actionMenuPresenter = this.S;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.z();
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a0 = (int) (56.0f * f2);
        this.b0 = (int) (f2 * 4.0f);
        this.P = context;
        this.Q = 0;
    }
}
