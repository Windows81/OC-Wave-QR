package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

public class ToolbarWidgetWrapper implements DecorToolbar {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f1337a;

    /* renamed from: b  reason: collision with root package name */
    public int f1338b;

    /* renamed from: c  reason: collision with root package name */
    public View f1339c;

    /* renamed from: d  reason: collision with root package name */
    public View f1340d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1341e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1342f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1343g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1344h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1345i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1346j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1347k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1348l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1349m;

    /* renamed from: n  reason: collision with root package name */
    public ActionMenuPresenter f1350n;

    /* renamed from: o  reason: collision with root package name */
    public int f1351o;

    /* renamed from: p  reason: collision with root package name */
    public int f1352p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f1353q;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z2) {
        this(toolbar, z2, R.string.f423a, R.drawable.f360n);
    }

    public void A(View view) {
        View view2 = this.f1340d;
        if (!(view2 == null || (this.f1338b & 16) == 0)) {
            this.f1337a.removeView(view2);
        }
        this.f1340d = view;
        if (view != null && (this.f1338b & 16) != 0) {
            this.f1337a.addView(view);
        }
    }

    public void B(int i2) {
        if (i2 != this.f1352p) {
            this.f1352p = i2;
            if (TextUtils.isEmpty(this.f1337a.getNavigationContentDescription())) {
                v(this.f1352p);
            }
        }
    }

    public void C(Drawable drawable) {
        this.f1342f = drawable;
        K();
    }

    public void D(CharSequence charSequence) {
        this.f1347k = charSequence;
        I();
    }

    public void E(Drawable drawable) {
        this.f1343g = drawable;
        J();
    }

    public void F(CharSequence charSequence) {
        this.f1346j = charSequence;
        if ((this.f1338b & 8) != 0) {
            this.f1337a.setSubtitle(charSequence);
        }
    }

    public void G(CharSequence charSequence) {
        this.f1344h = true;
        H(charSequence);
    }

    public final void H(CharSequence charSequence) {
        this.f1345i = charSequence;
        if ((this.f1338b & 8) != 0) {
            this.f1337a.setTitle(charSequence);
            if (this.f1344h) {
                ViewCompat.W(this.f1337a.getRootView(), charSequence);
            }
        }
    }

    public final void I() {
        if ((this.f1338b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1347k)) {
            this.f1337a.setNavigationContentDescription(this.f1352p);
        } else {
            this.f1337a.setNavigationContentDescription(this.f1347k);
        }
    }

    public final void J() {
        if ((this.f1338b & 4) != 0) {
            Toolbar toolbar = this.f1337a;
            Drawable drawable = this.f1343g;
            if (drawable == null) {
                drawable = this.f1353q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1337a.setNavigationIcon((Drawable) null);
    }

    public final void K() {
        Drawable drawable;
        int i2 = this.f1338b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f1342f;
            if (drawable == null) {
                drawable = this.f1341e;
            }
        } else {
            drawable = this.f1341e;
        }
        this.f1337a.setLogo(drawable);
    }

    public void a(Menu menu, MenuPresenter.Callback callback) {
        if (this.f1350n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1337a.getContext());
            this.f1350n = actionMenuPresenter;
            actionMenuPresenter.q(R.id.f381g);
        }
        this.f1350n.h(callback);
        this.f1337a.M((MenuBuilder) menu, this.f1350n);
    }

    public boolean b() {
        return this.f1337a.D();
    }

    public void c() {
        this.f1349m = true;
    }

    public void collapseActionView() {
        this.f1337a.f();
    }

    public boolean d() {
        return this.f1337a.e();
    }

    public boolean e() {
        return this.f1337a.C();
    }

    public Context f() {
        return this.f1337a.getContext();
    }

    public boolean g() {
        return this.f1337a.x();
    }

    public CharSequence getTitle() {
        return this.f1337a.getTitle();
    }

    public boolean h() {
        return this.f1337a.S();
    }

    public void i() {
        this.f1337a.g();
    }

    public void j(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.f1339c;
        if (view != null && view.getParent() == (toolbar = this.f1337a)) {
            toolbar.removeView(this.f1339c);
        }
        this.f1339c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f1351o == 2) {
            this.f1337a.addView(scrollingTabContainerView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1339c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f473a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    public boolean k() {
        return this.f1337a.w();
    }

    public void l(int i2) {
        View view;
        int i3 = this.f1338b ^ i2;
        this.f1338b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    I();
                }
                J();
            }
            if ((i3 & 3) != 0) {
                K();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f1337a.setTitle(this.f1345i);
                    this.f1337a.setSubtitle(this.f1346j);
                } else {
                    this.f1337a.setTitle((CharSequence) null);
                    this.f1337a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.f1340d) != null) {
                if ((i2 & 16) != 0) {
                    this.f1337a.addView(view);
                } else {
                    this.f1337a.removeView(view);
                }
            }
        }
    }

    public Menu m() {
        return this.f1337a.getMenu();
    }

    public void n(int i2) {
        C(i2 != 0 ? AppCompatResources.b(f(), i2) : null);
    }

    public int o() {
        return this.f1351o;
    }

    public ViewPropertyAnimatorCompat p(final int i2, long j2) {
        return ViewCompat.c(this.f1337a).b(i2 == 0 ? 1.0f : 0.0f).f(j2).h(new ViewPropertyAnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public boolean f1356a = false;

            public void a(View view) {
                this.f1356a = true;
            }

            public void b(View view) {
                if (!this.f1356a) {
                    ToolbarWidgetWrapper.this.f1337a.setVisibility(i2);
                }
            }

            public void c(View view) {
                ToolbarWidgetWrapper.this.f1337a.setVisibility(0);
            }
        });
    }

    public void q(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.f1337a.N(callback, callback2);
    }

    public void r(int i2) {
        this.f1337a.setVisibility(i2);
    }

    public ViewGroup s() {
        return this.f1337a;
    }

    public void setIcon(int i2) {
        setIcon(i2 != 0 ? AppCompatResources.b(f(), i2) : null);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1348l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1344h) {
            H(charSequence);
        }
    }

    public void t(boolean z2) {
    }

    public int u() {
        return this.f1338b;
    }

    public void v(int i2) {
        D(i2 == 0 ? null : f().getString(i2));
    }

    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void y(boolean z2) {
        this.f1337a.setCollapsible(z2);
    }

    public final int z() {
        if (this.f1337a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1353q = this.f1337a.getNavigationIcon();
        return 15;
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z2, int i2, int i3) {
        Drawable drawable;
        this.f1351o = 0;
        this.f1352p = 0;
        this.f1337a = toolbar;
        this.f1345i = toolbar.getTitle();
        this.f1346j = toolbar.getSubtitle();
        this.f1344h = this.f1345i != null;
        this.f1343g = toolbar.getNavigationIcon();
        TintTypedArray u2 = TintTypedArray.u(toolbar.getContext(), (AttributeSet) null, R.styleable.f447a, R.attr.f297c, 0);
        this.f1353q = u2.f(R.styleable.f458l);
        if (z2) {
            CharSequence o2 = u2.o(R.styleable.f464r);
            if (!TextUtils.isEmpty(o2)) {
                G(o2);
            }
            CharSequence o3 = u2.o(R.styleable.f462p);
            if (!TextUtils.isEmpty(o3)) {
                F(o3);
            }
            Drawable f2 = u2.f(R.styleable.f460n);
            if (f2 != null) {
                C(f2);
            }
            Drawable f3 = u2.f(R.styleable.f459m);
            if (f3 != null) {
                setIcon(f3);
            }
            if (this.f1343g == null && (drawable = this.f1353q) != null) {
                E(drawable);
            }
            l(u2.j(R.styleable.f454h, 0));
            int m2 = u2.m(R.styleable.f453g, 0);
            if (m2 != 0) {
                A(LayoutInflater.from(this.f1337a.getContext()).inflate(m2, this.f1337a, false));
                l(this.f1338b | 16);
            }
            int l2 = u2.l(R.styleable.f456j, 0);
            if (l2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1337a.getLayoutParams();
                layoutParams.height = l2;
                this.f1337a.setLayoutParams(layoutParams);
            }
            int d2 = u2.d(R.styleable.f452f, -1);
            int d3 = u2.d(R.styleable.f451e, -1);
            if (d2 >= 0 || d3 >= 0) {
                this.f1337a.L(Math.max(d2, 0), Math.max(d3, 0));
            }
            int m3 = u2.m(R.styleable.f465s, 0);
            if (m3 != 0) {
                Toolbar toolbar2 = this.f1337a;
                toolbar2.P(toolbar2.getContext(), m3);
            }
            int m4 = u2.m(R.styleable.f463q, 0);
            if (m4 != 0) {
                Toolbar toolbar3 = this.f1337a;
                toolbar3.O(toolbar3.getContext(), m4);
            }
            int m5 = u2.m(R.styleable.f461o, 0);
            if (m5 != 0) {
                this.f1337a.setPopupTheme(m5);
            }
        } else {
            this.f1338b = z();
        }
        u2.v();
        B(i2);
        this.f1347k = this.f1337a.getNavigationContentDescription();
        this.f1337a.setNavigationOnClickListener(new View.OnClickListener() {

            /* renamed from: z  reason: collision with root package name */
            public final ActionMenuItem f1355z;

            {
                this.f1355z = new ActionMenuItem(ToolbarWidgetWrapper.this.f1337a.getContext(), 0, 16908332, 0, 0, ToolbarWidgetWrapper.this.f1345i);
            }

            public void onClick(View view) {
                ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
                Window.Callback callback = toolbarWidgetWrapper.f1348l;
                if (callback != null && toolbarWidgetWrapper.f1349m) {
                    callback.onMenuItemSelected(0, this.f1355z);
                }
            }
        });
    }

    public void setIcon(Drawable drawable) {
        this.f1341e = drawable;
        K();
    }
}
