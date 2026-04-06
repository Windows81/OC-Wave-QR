package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    public static final Interpolator F = new AccelerateInterpolator();
    public static final Interpolator G = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    public boolean f658A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f659B;
    public final ViewPropertyAnimatorListener C = new ViewPropertyAnimatorListenerAdapter() {
        public void b(View view) {
            View view2;
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f680u && (view2 = windowDecorActionBar.f667h) != null) {
                view2.setTranslationY(0.0f);
                WindowDecorActionBar.this.f664e.setTranslationY(0.0f);
            }
            WindowDecorActionBar.this.f664e.setVisibility(8);
            WindowDecorActionBar.this.f664e.setTransitioning(false);
            WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
            windowDecorActionBar2.f685z = null;
            windowDecorActionBar2.y();
            ActionBarOverlayLayout actionBarOverlayLayout = WindowDecorActionBar.this.f663d;
            if (actionBarOverlayLayout != null) {
                ViewCompat.R(actionBarOverlayLayout);
            }
        }
    };
    public final ViewPropertyAnimatorListener D = new ViewPropertyAnimatorListenerAdapter() {
        public void b(View view) {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            windowDecorActionBar.f685z = null;
            windowDecorActionBar.f664e.requestLayout();
        }
    };
    public final ViewPropertyAnimatorUpdateListener E = new ViewPropertyAnimatorUpdateListener() {
        public void a(View view) {
            ((View) WindowDecorActionBar.this.f664e.getParent()).invalidate();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Context f660a;

    /* renamed from: b  reason: collision with root package name */
    public Context f661b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f662c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarOverlayLayout f663d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f664e;

    /* renamed from: f  reason: collision with root package name */
    public DecorToolbar f665f;

    /* renamed from: g  reason: collision with root package name */
    public ActionBarContextView f666g;

    /* renamed from: h  reason: collision with root package name */
    public View f667h;

    /* renamed from: i  reason: collision with root package name */
    public ScrollingTabContainerView f668i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f669j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public TabImpl f670k;

    /* renamed from: l  reason: collision with root package name */
    public int f671l = -1;

    /* renamed from: m  reason: collision with root package name */
    public boolean f672m;

    /* renamed from: n  reason: collision with root package name */
    public ActionModeImpl f673n;

    /* renamed from: o  reason: collision with root package name */
    public ActionMode f674o;

    /* renamed from: p  reason: collision with root package name */
    public ActionMode.Callback f675p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f676q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f677r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public boolean f678s;

    /* renamed from: t  reason: collision with root package name */
    public int f679t = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f680u = true;

    /* renamed from: v  reason: collision with root package name */
    public boolean f681v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f682w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f683x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f684y = true;

    /* renamed from: z  reason: collision with root package name */
    public ViewPropertyAnimatorCompatSet f685z;

    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {

        /* renamed from: B  reason: collision with root package name */
        public final Context f689B;
        public final MenuBuilder C;
        public ActionMode.Callback D;
        public WeakReference E;

        public ActionModeImpl(Context context, ActionMode.Callback callback) {
            this.f689B = context;
            this.D = callback;
            MenuBuilder S = new MenuBuilder(context).S(1);
            this.C = S;
            S.R(this);
        }

        public boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            ActionMode.Callback callback = this.D;
            if (callback != null) {
                return callback.d(this, menuItem);
            }
            return false;
        }

        public void b(MenuBuilder menuBuilder) {
            if (this.D != null) {
                k();
                WindowDecorActionBar.this.f666g.g();
            }
        }

        public void c() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f673n == this) {
                if (!WindowDecorActionBar.x(windowDecorActionBar.f681v, windowDecorActionBar.f682w, false)) {
                    WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
                    windowDecorActionBar2.f674o = this;
                    windowDecorActionBar2.f675p = this.D;
                } else {
                    this.D.a(this);
                }
                this.D = null;
                WindowDecorActionBar.this.w(false);
                WindowDecorActionBar.this.f666g.h();
                WindowDecorActionBar windowDecorActionBar3 = WindowDecorActionBar.this;
                windowDecorActionBar3.f663d.setHideOnContentScrollEnabled(windowDecorActionBar3.f659B);
                WindowDecorActionBar.this.f673n = null;
            }
        }

        public View d() {
            WeakReference weakReference = this.E;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.C;
        }

        public MenuInflater f() {
            return new SupportMenuInflater(this.f689B);
        }

        public CharSequence g() {
            return WindowDecorActionBar.this.f666g.getSubtitle();
        }

        public CharSequence i() {
            return WindowDecorActionBar.this.f666g.getTitle();
        }

        public void k() {
            if (WindowDecorActionBar.this.f673n == this) {
                this.C.d0();
                try {
                    this.D.c(this, this.C);
                } finally {
                    this.C.c0();
                }
            }
        }

        public boolean l() {
            return WindowDecorActionBar.this.f666g.k();
        }

        public void m(View view) {
            WindowDecorActionBar.this.f666g.setCustomView(view);
            this.E = new WeakReference(view);
        }

        public void n(int i2) {
            o(WindowDecorActionBar.this.f660a.getResources().getString(i2));
        }

        public void o(CharSequence charSequence) {
            WindowDecorActionBar.this.f666g.setSubtitle(charSequence);
        }

        public void q(int i2) {
            r(WindowDecorActionBar.this.f660a.getResources().getString(i2));
        }

        public void r(CharSequence charSequence) {
            WindowDecorActionBar.this.f666g.setTitle(charSequence);
        }

        public void s(boolean z2) {
            super.s(z2);
            WindowDecorActionBar.this.f666g.setTitleOptional(z2);
        }

        public boolean t() {
            this.C.d0();
            try {
                return this.D.b(this, this.C);
            } finally {
                this.C.c0();
            }
        }
    }

    public class TabImpl extends ActionBar.Tab {

        /* renamed from: a  reason: collision with root package name */
        public ActionBar.TabListener f690a;

        /* renamed from: b  reason: collision with root package name */
        public Drawable f691b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f692c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f693d;

        /* renamed from: e  reason: collision with root package name */
        public int f694e;

        /* renamed from: f  reason: collision with root package name */
        public View f695f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ WindowDecorActionBar f696g;

        public CharSequence a() {
            return this.f693d;
        }

        public View b() {
            return this.f695f;
        }

        public Drawable c() {
            return this.f691b;
        }

        public int d() {
            return this.f694e;
        }

        public CharSequence e() {
            return this.f692c;
        }

        public void f() {
            this.f696g.F(this);
        }

        public ActionBar.TabListener g() {
            return this.f690a;
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z2) {
        this.f662c = activity;
        View decorView = activity.getWindow().getDecorView();
        E(decorView);
        if (!z2) {
            this.f667h = decorView.findViewById(16908290);
        }
    }

    public static boolean x(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    public void A(boolean z2) {
        View view;
        View view2;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f685z;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.a();
        }
        this.f664e.setVisibility(0);
        if (this.f679t != 0 || (!this.f658A && !z2)) {
            this.f664e.setAlpha(1.0f);
            this.f664e.setTranslationY(0.0f);
            if (this.f680u && (view = this.f667h) != null) {
                view.setTranslationY(0.0f);
            }
            this.D.b((View) null);
        } else {
            this.f664e.setTranslationY(0.0f);
            float f2 = (float) (-this.f664e.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.f664e.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.f664e.setTranslationY(f2);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat m2 = ViewCompat.c(this.f664e).m(0.0f);
            m2.k(this.E);
            viewPropertyAnimatorCompatSet2.c(m2);
            if (this.f680u && (view2 = this.f667h) != null) {
                view2.setTranslationY(f2);
                viewPropertyAnimatorCompatSet2.c(ViewCompat.c(this.f667h).m(0.0f));
            }
            viewPropertyAnimatorCompatSet2.f(G);
            viewPropertyAnimatorCompatSet2.e(250);
            viewPropertyAnimatorCompatSet2.g(this.D);
            this.f685z = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f663d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.R(actionBarOverlayLayout);
        }
    }

    public final DecorToolbar B(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int C() {
        return this.f665f.o();
    }

    public final void D() {
        if (this.f683x) {
            this.f683x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f663d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            O(false);
        }
    }

    public final void E(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.f391q);
        this.f663d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f665f = B(view.findViewById(R.id.f375a));
        this.f666g = (ActionBarContextView) view.findViewById(R.id.f380f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.f377c);
        this.f664e = actionBarContainer;
        DecorToolbar decorToolbar = this.f665f;
        if (decorToolbar == null || this.f666g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f660a = decorToolbar.f();
        boolean z2 = (this.f665f.u() & 4) != 0;
        if (z2) {
            this.f672m = true;
        }
        ActionBarPolicy b2 = ActionBarPolicy.b(this.f660a);
        L(b2.a() || z2);
        J(b2.g());
        TypedArray obtainStyledAttributes = this.f660a.obtainStyledAttributes((AttributeSet) null, R.styleable.f447a, R.attr.f297c, 0);
        if (obtainStyledAttributes.getBoolean(R.styleable.f457k, false)) {
            K(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.f455i, 0);
        if (dimensionPixelSize != 0) {
            I((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void F(ActionBar.Tab tab) {
        int i2 = -1;
        if (C() != 2) {
            if (tab != null) {
                i2 = tab.d();
            }
            this.f671l = i2;
            return;
        }
        FragmentTransaction m2 = (!(this.f662c instanceof FragmentActivity) || this.f665f.s().isInEditMode()) ? null : ((FragmentActivity) this.f662c).f0().p().m();
        TabImpl tabImpl = this.f670k;
        if (tabImpl != tab) {
            ScrollingTabContainerView scrollingTabContainerView = this.f668i;
            if (tab != null) {
                i2 = tab.d();
            }
            scrollingTabContainerView.setTabSelected(i2);
            TabImpl tabImpl2 = this.f670k;
            if (tabImpl2 != null) {
                tabImpl2.g().b(this.f670k, m2);
            }
            TabImpl tabImpl3 = (TabImpl) tab;
            this.f670k = tabImpl3;
            if (tabImpl3 != null) {
                tabImpl3.g().a(this.f670k, m2);
            }
        } else if (tabImpl != null) {
            tabImpl.g().c(this.f670k, m2);
            this.f668i.a(tab.d());
        }
        if (m2 != null && !m2.o()) {
            m2.h();
        }
    }

    public void G(boolean z2) {
        H(z2 ? 4 : 0, 4);
    }

    public void H(int i2, int i3) {
        int u2 = this.f665f.u();
        if ((i3 & 4) != 0) {
            this.f672m = true;
        }
        this.f665f.l((i2 & i3) | ((~i3) & u2));
    }

    public void I(float f2) {
        ViewCompat.a0(this.f664e, f2);
    }

    public final void J(boolean z2) {
        this.f678s = z2;
        if (!z2) {
            this.f665f.j((ScrollingTabContainerView) null);
            this.f664e.setTabContainer(this.f668i);
        } else {
            this.f664e.setTabContainer((ScrollingTabContainerView) null);
            this.f665f.j(this.f668i);
        }
        boolean z3 = true;
        boolean z4 = C() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f668i;
        if (scrollingTabContainerView != null) {
            if (z4) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f663d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.R(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f665f.y(!this.f678s && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f663d;
        if (this.f678s || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    public void K(boolean z2) {
        if (!z2 || this.f663d.w()) {
            this.f659B = z2;
            this.f663d.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void L(boolean z2) {
        this.f665f.t(z2);
    }

    public final boolean M() {
        return ViewCompat.D(this.f664e);
    }

    public final void N() {
        if (!this.f683x) {
            this.f683x = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f663d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            O(false);
        }
    }

    public final void O(boolean z2) {
        if (x(this.f681v, this.f682w, this.f683x)) {
            if (!this.f684y) {
                this.f684y = true;
                A(z2);
            }
        } else if (this.f684y) {
            this.f684y = false;
            z(z2);
        }
    }

    public void a() {
        if (this.f682w) {
            this.f682w = false;
            O(true);
        }
    }

    public void b() {
    }

    public void c(boolean z2) {
        this.f680u = z2;
    }

    public void d() {
        if (!this.f682w) {
            this.f682w = true;
            O(true);
        }
    }

    public void e() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f685z;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.a();
            this.f685z = null;
        }
    }

    public void f(int i2) {
        this.f679t = i2;
    }

    public boolean h() {
        DecorToolbar decorToolbar = this.f665f;
        if (decorToolbar == null || !decorToolbar.k()) {
            return false;
        }
        this.f665f.collapseActionView();
        return true;
    }

    public void i(boolean z2) {
        if (z2 != this.f676q) {
            this.f676q = z2;
            int size = this.f677r.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ActionBar.OnMenuVisibilityListener) this.f677r.get(i2)).a(z2);
            }
        }
    }

    public int j() {
        return this.f665f.u();
    }

    public Context k() {
        if (this.f661b == null) {
            TypedValue typedValue = new TypedValue();
            this.f660a.getTheme().resolveAttribute(R.attr.f301g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f661b = new ContextThemeWrapper(this.f660a, i2);
            } else {
                this.f661b = this.f660a;
            }
        }
        return this.f661b;
    }

    public void m(Configuration configuration) {
        J(ActionBarPolicy.b(this.f660a).g());
    }

    public boolean o(int i2, KeyEvent keyEvent) {
        Menu e2;
        ActionModeImpl actionModeImpl = this.f673n;
        if (actionModeImpl == null || (e2 = actionModeImpl.e()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        e2.setQwertyMode(z2);
        return e2.performShortcut(i2, keyEvent, 0);
    }

    public void r(boolean z2) {
        if (!this.f672m) {
            G(z2);
        }
    }

    public void s(int i2) {
        this.f665f.v(i2);
    }

    public void t(boolean z2) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.f658A = z2;
        if (!z2 && (viewPropertyAnimatorCompatSet = this.f685z) != null) {
            viewPropertyAnimatorCompatSet.a();
        }
    }

    public void u(CharSequence charSequence) {
        this.f665f.setWindowTitle(charSequence);
    }

    public ActionMode v(ActionMode.Callback callback) {
        ActionModeImpl actionModeImpl = this.f673n;
        if (actionModeImpl != null) {
            actionModeImpl.c();
        }
        this.f663d.setHideOnContentScrollEnabled(false);
        this.f666g.l();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.f666g.getContext(), callback);
        if (!actionModeImpl2.t()) {
            return null;
        }
        this.f673n = actionModeImpl2;
        actionModeImpl2.k();
        this.f666g.i(actionModeImpl2);
        w(true);
        return actionModeImpl2;
    }

    public void w(boolean z2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        if (z2) {
            N();
        } else {
            D();
        }
        if (M()) {
            if (z2) {
                viewPropertyAnimatorCompat = this.f665f.p(4, 100);
                viewPropertyAnimatorCompat2 = this.f666g.f(0, 200);
            } else {
                viewPropertyAnimatorCompat2 = this.f665f.p(0, 200);
                viewPropertyAnimatorCompat = this.f666g.f(8, 100);
            }
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
            viewPropertyAnimatorCompatSet.d(viewPropertyAnimatorCompat, viewPropertyAnimatorCompat2);
            viewPropertyAnimatorCompatSet.h();
        } else if (z2) {
            this.f665f.r(4);
            this.f666g.setVisibility(0);
        } else {
            this.f665f.r(0);
            this.f666g.setVisibility(8);
        }
    }

    public void y() {
        ActionMode.Callback callback = this.f675p;
        if (callback != null) {
            callback.a(this.f674o);
            this.f674o = null;
            this.f675p = null;
        }
    }

    public void z(boolean z2) {
        View view;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f685z;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.a();
        }
        if (this.f679t != 0 || (!this.f658A && !z2)) {
            this.C.b((View) null);
            return;
        }
        this.f664e.setAlpha(1.0f);
        this.f664e.setTransitioning(true);
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
        float f2 = (float) (-this.f664e.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.f664e.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        ViewPropertyAnimatorCompat m2 = ViewCompat.c(this.f664e).m(f2);
        m2.k(this.E);
        viewPropertyAnimatorCompatSet2.c(m2);
        if (this.f680u && (view = this.f667h) != null) {
            viewPropertyAnimatorCompatSet2.c(ViewCompat.c(view).m(f2));
        }
        viewPropertyAnimatorCompatSet2.f(F);
        viewPropertyAnimatorCompatSet2.e(250);
        viewPropertyAnimatorCompatSet2.g(this.C);
        this.f685z = viewPropertyAnimatorCompatSet2;
        viewPropertyAnimatorCompatSet2.h();
    }

    public WindowDecorActionBar(Dialog dialog) {
        E(dialog.getWindow().getDecorView());
    }
}
