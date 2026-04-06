package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;

final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, MenuPresenter, View.OnKeyListener {
    public static final int U = R.layout.f415o;

    /* renamed from: A  reason: collision with root package name */
    public final Context f974A;

    /* renamed from: B  reason: collision with root package name */
    public final MenuBuilder f975B;
    public final MenuAdapter C;
    public final boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final MenuPopupWindow H;
    public final ViewTreeObserver.OnGlobalLayoutListener I = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (StandardMenuPopup.this.a() && !StandardMenuPopup.this.H.x()) {
                View view = StandardMenuPopup.this.M;
                if (view == null || !view.isShown()) {
                    StandardMenuPopup.this.dismiss();
                } else {
                    StandardMenuPopup.this.H.b();
                }
            }
        }
    };
    public final View.OnAttachStateChangeListener J = new View.OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = StandardMenuPopup.this.O;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    StandardMenuPopup.this.O = view.getViewTreeObserver();
                }
                StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
                standardMenuPopup.O.removeGlobalOnLayoutListener(standardMenuPopup.I);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public PopupWindow.OnDismissListener K;
    public View L;
    public View M;
    public MenuPresenter.Callback N;
    public ViewTreeObserver O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S = 0;
    public boolean T;

    public StandardMenuPopup(Context context, MenuBuilder menuBuilder, View view, int i2, int i3, boolean z2) {
        this.f974A = context;
        this.f975B = menuBuilder;
        this.D = z2;
        this.C = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z2, U);
        this.F = i2;
        this.G = i3;
        Resources resources = context.getResources();
        this.E = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f333d));
        this.L = view;
        this.H = new MenuPopupWindow(context, (AttributeSet) null, i2, i3);
        menuBuilder.c(this, context);
    }

    public boolean a() {
        return !this.P && this.H.a();
    }

    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void c(MenuBuilder menuBuilder, boolean z2) {
        if (menuBuilder == this.f975B) {
            dismiss();
            MenuPresenter.Callback callback = this.N;
            if (callback != null) {
                callback.c(menuBuilder, z2);
            }
        }
    }

    public void d(boolean z2) {
        this.Q = false;
        MenuAdapter menuAdapter = this.C;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    public void dismiss() {
        if (a()) {
            this.H.dismiss();
        }
    }

    public boolean e() {
        return false;
    }

    public void h(MenuPresenter.Callback callback) {
        this.N = callback;
    }

    public ListView j() {
        return this.H.j();
    }

    public boolean k(SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.f974A, subMenuBuilder, this.M, this.D, this.F, this.G);
            menuPopupHelper.j(this.N);
            menuPopupHelper.g(MenuPopup.x(subMenuBuilder));
            menuPopupHelper.i(this.K);
            this.K = null;
            this.f975B.e(false);
            int c2 = this.H.c();
            int o2 = this.H.o();
            if ((Gravity.getAbsoluteGravity(this.S, ViewCompat.s(this.L)) & 7) == 5) {
                c2 += this.L.getWidth();
            }
            if (menuPopupHelper.n(c2, o2)) {
                MenuPresenter.Callback callback = this.N;
                if (callback == null) {
                    return true;
                }
                callback.d(subMenuBuilder);
                return true;
            }
        }
        return false;
    }

    public void l(MenuBuilder menuBuilder) {
    }

    public void onDismiss() {
        this.P = true;
        this.f975B.close();
        ViewTreeObserver viewTreeObserver = this.O;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.O = this.M.getViewTreeObserver();
            }
            this.O.removeGlobalOnLayoutListener(this.I);
            this.O = null;
        }
        this.M.removeOnAttachStateChangeListener(this.J);
        PopupWindow.OnDismissListener onDismissListener = this.K;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(View view) {
        this.L = view;
    }

    public void r(boolean z2) {
        this.C.d(z2);
    }

    public void s(int i2) {
        this.S = i2;
    }

    public void t(int i2) {
        this.H.e(i2);
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.K = onDismissListener;
    }

    public void v(boolean z2) {
        this.T = z2;
    }

    public void w(int i2) {
        this.H.l(i2);
    }

    public final boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.P || (view = this.L) == null) {
            return false;
        }
        this.M = view;
        this.H.G(this);
        this.H.H(this);
        this.H.F(true);
        View view2 = this.M;
        boolean z2 = this.O == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.O = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.I);
        }
        view2.addOnAttachStateChangeListener(this.J);
        this.H.z(view2);
        this.H.C(this.S);
        if (!this.Q) {
            this.R = MenuPopup.o(this.C, (ViewGroup) null, this.f974A, this.E);
            this.Q = true;
        }
        this.H.B(this.R);
        this.H.E(2);
        this.H.D(n());
        this.H.b();
        ListView j2 = this.H.j();
        j2.setOnKeyListener(this);
        if (this.T && this.f975B.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f974A).inflate(R.layout.f414n, j2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f975B.x());
            }
            frameLayout.setEnabled(false);
            j2.addHeaderView(frameLayout, (Object) null, false);
        }
        this.H.p(this.C);
        this.H.b();
        return true;
    }
}
