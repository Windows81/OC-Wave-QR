package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Toolbar extends ViewGroup implements MenuHost {

    /* renamed from: A  reason: collision with root package name */
    public TextView f1325A;

    /* renamed from: B  reason: collision with root package name */
    public TextView f1326B;
    public ImageButton C;
    public ImageView D;
    public Drawable E;
    public CharSequence F;
    public ImageButton G;
    public View H;
    public Context I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public RtlSpacingHelper S;
    public int T;
    public int U;
    public int V;
    public CharSequence W;
    public CharSequence a0;
    public ColorStateList b0;
    public ColorStateList c0;
    public boolean d0;
    public boolean e0;
    public final ArrayList f0;
    public final ArrayList g0;
    public final int[] h0;
    public final MenuHostHelper i0;
    public ArrayList j0;
    public OnMenuItemClickListener k0;
    public final ActionMenuView.OnMenuItemClickListener l0;
    public ToolbarWidgetWrapper m0;
    public ActionMenuPresenter n0;
    public ExpandedActionViewMenuPresenter o0;
    public MenuPresenter.Callback p0;
    public MenuBuilder.Callback q0;
    public boolean r0;
    public OnBackInvokedCallback s0;
    public OnBackInvokedDispatcher t0;
    public boolean u0;
    public final Runnable v0;

    /* renamed from: z  reason: collision with root package name */
    public ActionMenuView f1327z;

    public static class Api33Impl {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new i(runnable);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class ExpandedActionViewMenuPresenter implements MenuPresenter {

        /* renamed from: A  reason: collision with root package name */
        public MenuItemImpl f1332A;

        /* renamed from: z  reason: collision with root package name */
        public MenuBuilder f1334z;

        public ExpandedActionViewMenuPresenter() {
        }

        public void c(MenuBuilder menuBuilder, boolean z2) {
        }

        public void d(boolean z2) {
            if (this.f1332A != null) {
                MenuBuilder menuBuilder = this.f1334z;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    int i2 = 0;
                    while (i2 < size) {
                        if (this.f1334z.getItem(i2) != this.f1332A) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
                f(this.f1334z, this.f1332A);
            }
        }

        public boolean e() {
            return false;
        }

        public boolean f(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            View view = Toolbar.this.H;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.H);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.G);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.H = null;
            toolbar3.a();
            this.f1332A = null;
            Toolbar.this.requestLayout();
            menuItemImpl.r(false);
            Toolbar.this.T();
            return true;
        }

        public boolean g(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar.this.h();
            ViewParent parent = Toolbar.this.G.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.G);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.G);
            }
            Toolbar.this.H = menuItemImpl.getActionView();
            this.f1332A = menuItemImpl;
            ViewParent parent2 = Toolbar.this.H.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.H);
                }
                LayoutParams n2 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                n2.f473a = (toolbar4.M & 112) | 8388611;
                n2.f1335b = 2;
                toolbar4.H.setLayoutParams(n2);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.H);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            menuItemImpl.r(true);
            View view = Toolbar.this.H;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).c();
            }
            Toolbar.this.T();
            return true;
        }

        public void i(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.f1334z;
            if (!(menuBuilder2 == null || (menuItemImpl = this.f1332A) == null)) {
                menuBuilder2.f(menuItemImpl);
            }
            this.f1334z = menuBuilder;
        }

        public boolean k(SubMenuBuilder subMenuBuilder) {
            return false;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.R);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    public void A() {
        Iterator it = this.j0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        I();
    }

    public final boolean B(View view) {
        return view.getParent() == this || this.g0.contains(view);
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f1327z;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.f1327z;
        return actionMenuView != null && actionMenuView.H();
    }

    public final int E(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int r2 = r(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, r2, max + measuredWidth, view.getMeasuredHeight() + r2);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    public final int F(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int r2 = r(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, r2, max, view.getMeasuredHeight() + r2);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    public final int G(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void H(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.i0.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.j0 = currentMenuItems2;
    }

    public final void J() {
        removeCallbacks(this.v0);
        post(this.v0);
    }

    public void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f1335b == 2 || childAt == this.f1327z)) {
                removeViewAt(childCount);
                this.g0.add(childAt);
            }
        }
    }

    public void L(int i2, int i3) {
        i();
        this.S.g(i2, i3);
    }

    public void M(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder != null || this.f1327z != null) {
            l();
            MenuBuilder L2 = this.f1327z.L();
            if (L2 != menuBuilder) {
                if (L2 != null) {
                    L2.O(this.n0);
                    L2.O(this.o0);
                }
                if (this.o0 == null) {
                    this.o0 = new ExpandedActionViewMenuPresenter();
                }
                actionMenuPresenter.H(true);
                if (menuBuilder != null) {
                    menuBuilder.c(actionMenuPresenter, this.I);
                    menuBuilder.c(this.o0, this.I);
                } else {
                    actionMenuPresenter.i(this.I, (MenuBuilder) null);
                    this.o0.i(this.I, (MenuBuilder) null);
                    actionMenuPresenter.d(true);
                    this.o0.d(true);
                }
                this.f1327z.setPopupTheme(this.J);
                this.f1327z.setPresenter(actionMenuPresenter);
                this.n0 = actionMenuPresenter;
                T();
            }
        }
    }

    public void N(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.p0 = callback;
        this.q0 = callback2;
        ActionMenuView actionMenuView = this.f1327z;
        if (actionMenuView != null) {
            actionMenuView.M(callback, callback2);
        }
    }

    public void O(Context context, int i2) {
        this.L = i2;
        TextView textView = this.f1326B;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void P(Context context, int i2) {
        this.K = i2;
        TextView textView = this.f1325A;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public final boolean Q() {
        if (!this.r0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (R(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean S() {
        ActionMenuView actionMenuView = this.f1327z;
        return actionMenuView != null && actionMenuView.N();
    }

    public void T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = Api33Impl.a(this);
            boolean z2 = w() && a2 != null && ViewCompat.C(this) && this.u0;
            if (z2 && this.t0 == null) {
                if (this.s0 == null) {
                    this.s0 = Api33Impl.b(new g(this));
                }
                Api33Impl.c(a2, this.s0);
                this.t0 = a2;
            } else if (!z2 && (onBackInvokedDispatcher = this.t0) != null) {
                Api33Impl.d(onBackInvokedDispatcher, this.s0);
                this.t0 = null;
            }
        }
    }

    public void a() {
        for (int size = this.g0.size() - 1; size >= 0; size--) {
            addView((View) this.g0.get(size));
        }
        this.g0.clear();
    }

    public final void b(List list, int i2) {
        boolean z2 = ViewCompat.s(this) == 1;
        int childCount = getChildCount();
        int b2 = GravityCompat.b(i2, ViewCompat.s(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1335b == 0 && R(childAt) && q(layoutParams.f473a) == b2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1335b == 0 && R(childAt2) && q(layoutParams2.f473a) == b2) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams n2 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        n2.f1335b = 1;
        if (!z2 || this.H == null) {
            addView(view, n2);
            return;
        }
        view.setLayoutParams(n2);
        this.g0.add(view);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void d(MenuProvider menuProvider) {
        this.i0.f(menuProvider);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1327z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1327z
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.I()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.e():boolean");
    }

    public void f() {
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.o0;
        MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.f1332A;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    public void g() {
        ActionMenuView actionMenuView = this.f1327z;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.G;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.G;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        RtlSpacingHelper rtlSpacingHelper = this.S;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.U;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        RtlSpacingHelper rtlSpacingHelper = this.S;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        RtlSpacingHelper rtlSpacingHelper = this.S;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        RtlSpacingHelper rtlSpacingHelper = this.S;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.T;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.L();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1327z
            if (r0 == 0) goto L_0x0020
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.L()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0020
            int r0 = r3.getContentInsetEnd()
            int r1 = r3.U
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0024
        L_0x0020:
            int r0 = r3.getContentInsetEnd()
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return ViewCompat.s(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return ViewCompat.s(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.T, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.D;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.D;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        k();
        return this.f1327z.getMenu();
    }

    public View getNavButtonView() {
        return this.C;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.C;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.C;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.n0;
    }

    public Drawable getOverflowIcon() {
        k();
        return this.f1327z.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.I;
    }

    public int getPopupTheme() {
        return this.J;
    }

    public CharSequence getSubtitle() {
        return this.a0;
    }

    public final TextView getSubtitleTextView() {
        return this.f1326B;
    }

    public CharSequence getTitle() {
        return this.W;
    }

    public int getTitleMarginBottom() {
        return this.R;
    }

    public int getTitleMarginEnd() {
        return this.P;
    }

    public int getTitleMarginStart() {
        return this.O;
    }

    public int getTitleMarginTop() {
        return this.Q;
    }

    public final TextView getTitleTextView() {
        return this.f1325A;
    }

    public DecorToolbar getWrapper() {
        if (this.m0 == null) {
            this.m0 = new ToolbarWidgetWrapper(this, true);
        }
        return this.m0;
    }

    public void h() {
        if (this.G == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, R.attr.Q);
            this.G = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.E);
            this.G.setContentDescription(this.F);
            LayoutParams n2 = generateDefaultLayoutParams();
            n2.f473a = (this.M & 112) | 8388611;
            n2.f1335b = 2;
            this.G.setLayoutParams(n2);
            this.G.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toolbar.this.f();
                }
            });
        }
    }

    public final void i() {
        if (this.S == null) {
            this.S = new RtlSpacingHelper();
        }
    }

    public final void j() {
        if (this.D == null) {
            this.D = new AppCompatImageView(getContext());
        }
    }

    public final void k() {
        l();
        if (this.f1327z.L() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.f1327z.getMenu();
            if (this.o0 == null) {
                this.o0 = new ExpandedActionViewMenuPresenter();
            }
            this.f1327z.setExpandedActionViewsExclusive(true);
            menuBuilder.c(this.o0, this.I);
            T();
        }
    }

    public final void l() {
        if (this.f1327z == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1327z = actionMenuView;
            actionMenuView.setPopupTheme(this.J);
            this.f1327z.setOnMenuItemClickListener(this.l0);
            this.f1327z.M(this.p0, new MenuBuilder.Callback() {
                public boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
                    MenuBuilder.Callback callback = Toolbar.this.q0;
                    return callback != null && callback.a(menuBuilder, menuItem);
                }

                public void b(MenuBuilder menuBuilder) {
                    if (!Toolbar.this.f1327z.H()) {
                        Toolbar.this.i0.e(menuBuilder);
                    }
                    MenuBuilder.Callback callback = Toolbar.this.q0;
                    if (callback != null) {
                        callback.b(menuBuilder);
                    }
                }
            });
            LayoutParams n2 = generateDefaultLayoutParams();
            n2.f473a = (this.M & 112) | 8388613;
            this.f1327z.setLayoutParams(n2);
            c(this.f1327z, false);
        }
    }

    public final void m() {
        if (this.C == null) {
            this.C = new AppCompatImageButton(getContext(), (AttributeSet) null, R.attr.Q);
            LayoutParams n2 = generateDefaultLayoutParams();
            n2.f473a = (this.M & 112) | 8388611;
            this.C.setLayoutParams(n2);
        }
    }

    /* renamed from: n */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: o */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.v0);
        T();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.e0 = false;
        }
        if (!this.e0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.e0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.e0 = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a1 A[LOOP:0: B:103:0x029f->B:104:0x02a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02c3 A[LOOP:1: B:106:0x02c1->B:107:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fc A[LOOP:2: B:114:0x02fa->B:115:0x02fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.ViewCompat.s(r19)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.h0
            r11[r3] = r2
            r11[r2] = r2
            int r12 = androidx.core.view.ViewCompat.t(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r2
        L_0x003b:
            android.widget.ImageButton r13 = r0.C
            boolean r13 = r0.R(r13)
            if (r13 == 0) goto L_0x0056
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.C
            int r13 = r0.F(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0058
        L_0x004e:
            android.widget.ImageButton r13 = r0.C
            int r13 = r0.E(r13, r6, r11, r12)
        L_0x0054:
            r14 = r10
            goto L_0x0058
        L_0x0056:
            r13 = r6
            goto L_0x0054
        L_0x0058:
            android.widget.ImageButton r15 = r0.G
            boolean r15 = r0.R(r15)
            if (r15 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x0069
            android.widget.ImageButton r15 = r0.G
            int r14 = r0.F(r15, r14, r11, r12)
            goto L_0x006f
        L_0x0069:
            android.widget.ImageButton r15 = r0.G
            int r13 = r0.E(r15, r13, r11, r12)
        L_0x006f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1327z
            boolean r15 = r0.R(r15)
            if (r15 == 0) goto L_0x0086
            if (r1 == 0) goto L_0x0080
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1327z
            int r13 = r0.E(r15, r13, r11, r12)
            goto L_0x0086
        L_0x0080:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1327z
            int r14 = r0.F(r15, r14, r11, r12)
        L_0x0086:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.H
            boolean r13 = r0.R(r13)
            if (r13 == 0) goto L_0x00c3
            if (r1 == 0) goto L_0x00bd
            android.view.View r13 = r0.H
            int r10 = r0.F(r13, r10, r11, r12)
            goto L_0x00c3
        L_0x00bd:
            android.view.View r13 = r0.H
            int r3 = r0.E(r13, r3, r11, r12)
        L_0x00c3:
            android.widget.ImageView r13 = r0.D
            boolean r13 = r0.R(r13)
            if (r13 == 0) goto L_0x00da
            if (r1 == 0) goto L_0x00d4
            android.widget.ImageView r13 = r0.D
            int r10 = r0.F(r13, r10, r11, r12)
            goto L_0x00da
        L_0x00d4:
            android.widget.ImageView r13 = r0.D
            int r3 = r0.E(r13, r3, r11, r12)
        L_0x00da:
            android.widget.TextView r13 = r0.f1325A
            boolean r13 = r0.R(r13)
            android.widget.TextView r14 = r0.f1326B
            boolean r14 = r0.R(r14)
            if (r13 == 0) goto L_0x00ff
            android.widget.TextView r15 = r0.f1325A
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r15 = (androidx.appcompat.widget.Toolbar.LayoutParams) r15
            int r2 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1325A
            int r7 = r7.getMeasuredHeight()
            int r2 = r2 + r7
            int r7 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x0102
        L_0x00ff:
            r23 = r7
            r2 = 0
        L_0x0102:
            if (r14 == 0) goto L_0x011c
            android.widget.TextView r7 = r0.f1326B
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1326B
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r2 = r2 + r15
            goto L_0x011e
        L_0x011c:
            r16 = r4
        L_0x011e:
            if (r13 != 0) goto L_0x012a
            if (r14 == 0) goto L_0x0123
            goto L_0x012a
        L_0x0123:
            r18 = r6
            r22 = r12
        L_0x0127:
            r2 = 0
            goto L_0x0291
        L_0x012a:
            if (r13 == 0) goto L_0x012f
            android.widget.TextView r4 = r0.f1325A
            goto L_0x0131
        L_0x012f:
            android.widget.TextView r4 = r0.f1326B
        L_0x0131:
            if (r14 == 0) goto L_0x0136
            android.widget.TextView r7 = r0.f1326B
            goto L_0x0138
        L_0x0136:
            android.widget.TextView r7 = r0.f1325A
        L_0x0138:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            if (r13 == 0) goto L_0x014e
            android.widget.TextView r15 = r0.f1325A
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0158
        L_0x014e:
            if (r14 == 0) goto L_0x015b
            android.widget.TextView r15 = r0.f1326B
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015b
        L_0x0158:
            r17 = 1
            goto L_0x015d
        L_0x015b:
            r17 = 0
        L_0x015d:
            int r15 = r0.V
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a5
            r6 = 80
            if (r15 == r6) goto L_0x0197
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.Q
            r24 = r3
            int r3 = r15 + r12
            if (r6 >= r3) goto L_0x0180
            int r6 = r15 + r12
            goto L_0x0195
        L_0x0180:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.R
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0195
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0195:
            int r8 = r8 + r6
            goto L_0x01b4
        L_0x0197:
            r24 = r3
            r22 = r12
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.R
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01b4
        L_0x01a5:
            r24 = r3
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.Q
            int r8 = r2 + r3
        L_0x01b4:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.O
        L_0x01ba:
            r2 = 1
            goto L_0x01be
        L_0x01bc:
            r1 = 0
            goto L_0x01ba
        L_0x01be:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f1325A
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f1325A
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1325A
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1325A
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.P
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f1326B
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1326B
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1326B
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1326B
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.P
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r3 = r24
            goto L_0x0127
        L_0x0227:
            if (r17 == 0) goto L_0x022e
            int r2 = r0.O
            r1 = r2
        L_0x022c:
            r2 = 0
            goto L_0x0230
        L_0x022e:
            r1 = 0
            goto L_0x022c
        L_0x0230:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r24 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0265
            android.widget.TextView r1 = r0.f1325A
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r4 = r0.f1325A
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.f1325A
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1325A
            r6.layout(r3, r8, r4, r5)
            int r6 = r0.P
            int r4 = r4 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x0266
        L_0x0265:
            r4 = r3
        L_0x0266:
            if (r14 == 0) goto L_0x028a
            android.widget.TextView r1 = r0.f1326B
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1326B
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r5 = r0.f1326B
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1326B
            r6.layout(r3, r8, r1, r5)
            int r5 = r0.P
            int r1 = r1 + r5
            goto L_0x028b
        L_0x028a:
            r1 = r3
        L_0x028b:
            if (r17 == 0) goto L_0x0291
            int r3 = java.lang.Math.max(r4, r1)
        L_0x0291:
            java.util.ArrayList r1 = r0.f0
            r4 = 3
            r0.b(r1, r4)
            java.util.ArrayList r1 = r0.f0
            int r1 = r1.size()
            r4 = r3
            r3 = r2
        L_0x029f:
            if (r3 >= r1) goto L_0x02b2
            java.util.ArrayList r5 = r0.f0
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.E(r5, r4, r11, r12)
            int r3 = r3 + 1
            goto L_0x029f
        L_0x02b2:
            r12 = r22
            java.util.ArrayList r1 = r0.f0
            r3 = 5
            r0.b(r1, r3)
            java.util.ArrayList r1 = r0.f0
            int r1 = r1.size()
            r3 = r2
        L_0x02c1:
            if (r3 >= r1) goto L_0x02d2
            java.util.ArrayList r5 = r0.f0
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.F(r5, r10, r11, r12)
            int r3 = r3 + 1
            goto L_0x02c1
        L_0x02d2:
            java.util.ArrayList r1 = r0.f0
            r3 = 1
            r0.b(r1, r3)
            java.util.ArrayList r1 = r0.f0
            int r1 = r0.v(r1, r11)
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r6 = r18 + r3
            int r3 = r1 / 2
            int r6 = r6 - r3
            int r1 = r1 + r6
            if (r6 >= r4) goto L_0x02ed
            goto L_0x02f4
        L_0x02ed:
            if (r1 <= r10) goto L_0x02f3
            int r1 = r1 - r10
            int r4 = r6 - r1
            goto L_0x02f4
        L_0x02f3:
            r4 = r6
        L_0x02f4:
            java.util.ArrayList r1 = r0.f0
            int r1 = r1.size()
        L_0x02fa:
            if (r2 >= r1) goto L_0x030b
            java.util.ArrayList r3 = r0.f0
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.E(r3, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x02fa
        L_0x030b:
            java.util.ArrayList r1 = r0.f0
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.h0;
        char b2 = ViewUtils.b(this);
        int i11 = 0;
        char c2 = b2 ^ 1;
        if (R(this.C)) {
            H(this.C, i2, 0, i3, 0, this.N);
            i6 = this.C.getMeasuredWidth() + t(this.C);
            i5 = Math.max(0, this.C.getMeasuredHeight() + u(this.C));
            i4 = View.combineMeasuredStates(0, this.C.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (R(this.G)) {
            H(this.G, i2, 0, i3, 0, this.N);
            i6 = this.G.getMeasuredWidth() + t(this.G);
            i5 = Math.max(i5, this.G.getMeasuredHeight() + u(this.G));
            i4 = View.combineMeasuredStates(i4, this.G.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        iArr[b2] = Math.max(0, currentContentInsetStart - i6);
        if (R(this.f1327z)) {
            H(this.f1327z, i2, max, i3, 0, this.N);
            i7 = this.f1327z.getMeasuredWidth() + t(this.f1327z);
            i5 = Math.max(i5, this.f1327z.getMeasuredHeight() + u(this.f1327z));
            i4 = View.combineMeasuredStates(i4, this.f1327z.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (R(this.H)) {
            max2 += G(this.H, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.H.getMeasuredHeight() + u(this.H));
            i4 = View.combineMeasuredStates(i4, this.H.getMeasuredState());
        }
        if (R(this.D)) {
            max2 += G(this.D, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.D.getMeasuredHeight() + u(this.D));
            i4 = View.combineMeasuredStates(i4, this.D.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((LayoutParams) childAt.getLayoutParams()).f1335b == 0 && R(childAt)) {
                max2 += G(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + u(childAt));
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.Q + this.R;
        int i14 = this.O + this.P;
        if (R(this.f1325A)) {
            G(this.f1325A, i2, max2 + i14, i3, i13, iArr);
            int measuredWidth = this.f1325A.getMeasuredWidth() + t(this.f1325A);
            i8 = this.f1325A.getMeasuredHeight() + u(this.f1325A);
            i10 = View.combineMeasuredStates(i4, this.f1325A.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i8 = 0;
            i10 = i4;
            i9 = 0;
        }
        if (R(this.f1326B)) {
            i9 = Math.max(i9, G(this.f1326B, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 += this.f1326B.getMeasuredHeight() + u(this.f1326B);
            i10 = View.combineMeasuredStates(i10, this.f1326B.getMeasuredState());
        } else {
            int i15 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingLeft = max2 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (!Q()) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f1327z;
        MenuBuilder L2 = actionMenuView != null ? actionMenuView.L() : null;
        int i2 = savedState.f1336B;
        if (!(i2 == 0 || this.o0 == null || L2 == null || (findItem = L2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.C) {
            J();
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        i();
        RtlSpacingHelper rtlSpacingHelper = this.S;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        rtlSpacingHelper.f(z2);
    }

    public Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.o0;
        if (!(expandedActionViewMenuPresenter == null || (menuItemImpl = expandedActionViewMenuPresenter.f1332A) == null)) {
            savedState.f1336B = menuItemImpl.getItemId();
        }
        savedState.C = D();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d0 = false;
        }
        if (!this.d0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.d0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.d0 = false;
        }
        return true;
    }

    /* renamed from: p */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final int q(int i2) {
        int s2 = ViewCompat.s(this);
        int b2 = GravityCompat.b(i2, s2) & 7;
        return (b2 == 1 || b2 == 3 || b2 == 5) ? b2 : s2 == 1 ? 5 : 3;
    }

    public final int r(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int s2 = s(layoutParams.f473a);
        if (s2 == 48) {
            return getPaddingTop() - i3;
        }
        if (s2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = layoutParams.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = layoutParams.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final int s(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.V & 112;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.u0 != z2) {
            this.u0 = z2;
            T();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AppCompatResources.b(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.r0 = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.U) {
            this.U = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.T) {
            this.T = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AppCompatResources.b(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AppCompatResources.b(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m();
        this.C.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.k0 = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        k();
        this.f1327z.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.J != i2) {
            this.J = i2;
            if (i2 == 0) {
                this.I = getContext();
            } else {
                this.I = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.R = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.P = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.O = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.Q = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return MarginLayoutParamsCompat.b(marginLayoutParams) + MarginLayoutParamsCompat.a(marginLayoutParams);
    }

    public final int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int v(List list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = (View) list.get(i4);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i6 = layoutParams.leftMargin - i2;
            int i7 = layoutParams.rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    public boolean w() {
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.o0;
        return (expandedActionViewMenuPresenter == null || expandedActionViewMenuPresenter.f1332A == null) ? false : true;
    }

    public boolean x() {
        ActionMenuView actionMenuView = this.f1327z;
        return actionMenuView != null && actionMenuView.F();
    }

    public void y(MenuProvider menuProvider) {
        this.i0.a(menuProvider);
    }

    public void z(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b  reason: collision with root package name */
        public int f1335b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f473a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1335b = layoutParams.f1335b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.V = 8388627;
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.h0 = new int[2];
        this.i0 = new MenuHostHelper(new h(this));
        this.j0 = new ArrayList();
        this.l0 = new ActionMenuView.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (Toolbar.this.i0.d(menuItem)) {
                    return true;
                }
                OnMenuItemClickListener onMenuItemClickListener = Toolbar.this.k0;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.v0 = new Runnable() {
            public void run() {
                Toolbar.this.S();
            }
        };
        TintTypedArray u2 = TintTypedArray.u(getContext(), attributeSet, R.styleable.Q2, i2, 0);
        ViewCompat.S(this, context, R.styleable.Q2, attributeSet, u2.q(), i2, 0);
        this.K = u2.m(R.styleable.s3, 0);
        this.L = u2.m(R.styleable.j3, 0);
        this.V = u2.k(R.styleable.R2, this.V);
        this.M = u2.k(R.styleable.S2, 48);
        int d2 = u2.d(R.styleable.m3, 0);
        d2 = u2.r(R.styleable.r3) ? u2.d(R.styleable.r3, d2) : d2;
        this.R = d2;
        this.Q = d2;
        this.P = d2;
        this.O = d2;
        int d3 = u2.d(R.styleable.p3, -1);
        if (d3 >= 0) {
            this.O = d3;
        }
        int d4 = u2.d(R.styleable.o3, -1);
        if (d4 >= 0) {
            this.P = d4;
        }
        int d5 = u2.d(R.styleable.q3, -1);
        if (d5 >= 0) {
            this.Q = d5;
        }
        int d6 = u2.d(R.styleable.n3, -1);
        if (d6 >= 0) {
            this.R = d6;
        }
        this.N = u2.e(R.styleable.d3, -1);
        int d7 = u2.d(R.styleable.Z2, Integer.MIN_VALUE);
        int d8 = u2.d(R.styleable.V2, Integer.MIN_VALUE);
        int e2 = u2.e(R.styleable.X2, 0);
        int e3 = u2.e(R.styleable.Y2, 0);
        i();
        this.S.e(e2, e3);
        if (!(d7 == Integer.MIN_VALUE && d8 == Integer.MIN_VALUE)) {
            this.S.g(d7, d8);
        }
        this.T = u2.d(R.styleable.a3, Integer.MIN_VALUE);
        this.U = u2.d(R.styleable.W2, Integer.MIN_VALUE);
        this.E = u2.f(R.styleable.U2);
        this.F = u2.o(R.styleable.T2);
        CharSequence o2 = u2.o(R.styleable.l3);
        if (!TextUtils.isEmpty(o2)) {
            setTitle(o2);
        }
        CharSequence o3 = u2.o(R.styleable.i3);
        if (!TextUtils.isEmpty(o3)) {
            setSubtitle(o3);
        }
        this.I = getContext();
        setPopupTheme(u2.m(R.styleable.h3, 0));
        Drawable f2 = u2.f(R.styleable.g3);
        if (f2 != null) {
            setNavigationIcon(f2);
        }
        CharSequence o4 = u2.o(R.styleable.f3);
        if (!TextUtils.isEmpty(o4)) {
            setNavigationContentDescription(o4);
        }
        Drawable f3 = u2.f(R.styleable.b3);
        if (f3 != null) {
            setLogo(f3);
        }
        CharSequence o5 = u2.o(R.styleable.c3);
        if (!TextUtils.isEmpty(o5)) {
            setLogoDescription(o5);
        }
        if (u2.r(R.styleable.t3)) {
            setTitleTextColor(u2.c(R.styleable.t3));
        }
        if (u2.r(R.styleable.k3)) {
            setSubtitleTextColor(u2.c(R.styleable.k3));
        }
        if (u2.r(R.styleable.e3)) {
            z(u2.m(R.styleable.e3, 0));
        }
        u2.v();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        ImageButton imageButton = this.G;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            this.G.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.G;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.E);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!B(this.D)) {
                c(this.D, true);
            }
        } else {
            ImageView imageView = this.D;
            if (imageView != null && B(imageView)) {
                removeView(this.D);
                this.g0.remove(this.D);
            }
        }
        ImageView imageView2 = this.D;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.C;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            TooltipCompat.a(this.C, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!B(this.C)) {
                c(this.C, true);
            }
        } else {
            ImageButton imageButton = this.C;
            if (imageButton != null && B(imageButton)) {
                removeView(this.C);
                this.g0.remove(this.C);
            }
        }
        ImageButton imageButton2 = this.C;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1326B == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1326B = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1326B.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.L;
                if (i2 != 0) {
                    this.f1326B.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.c0;
                if (colorStateList != null) {
                    this.f1326B.setTextColor(colorStateList);
                }
            }
            if (!B(this.f1326B)) {
                c(this.f1326B, true);
            }
        } else {
            TextView textView = this.f1326B;
            if (textView != null && B(textView)) {
                removeView(this.f1326B);
                this.g0.remove(this.f1326B);
            }
        }
        TextView textView2 = this.f1326B;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.a0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.c0 = colorStateList;
        TextView textView = this.f1326B;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1325A == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1325A = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1325A.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.K;
                if (i2 != 0) {
                    this.f1325A.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.b0;
                if (colorStateList != null) {
                    this.f1325A.setTextColor(colorStateList);
                }
            }
            if (!B(this.f1325A)) {
                c(this.f1325A, true);
            }
        } else {
            TextView textView = this.f1325A;
            if (textView != null && B(textView)) {
                removeView(this.f1325A);
                this.g0.remove(this.f1325A);
            }
        }
        TextView textView2 = this.f1325A;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.W = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.b0 = colorStateList;
        TextView textView = this.f1325A;
        if (textView != null) {
            textView.setTextColor(colorStateList);
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
        public int f1336B;
        public boolean C;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1336B = parcel.readInt();
            this.C = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1336B);
            parcel.writeInt(this.C ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
