package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int a0 = R.layout.f407g;

    /* renamed from: A  reason: collision with root package name */
    public final Context f864A;

    /* renamed from: B  reason: collision with root package name */
    public final int f865B;
    public final int C;
    public final int D;
    public final boolean E;
    public final Handler F;
    public final List G = new ArrayList();
    public final List H = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener I = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (CascadingMenuPopup.this.a() && CascadingMenuPopup.this.H.size() > 0 && !((CascadingMenuInfo) CascadingMenuPopup.this.H.get(0)).f872a.x()) {
                View view = CascadingMenuPopup.this.O;
                if (view == null || !view.isShown()) {
                    CascadingMenuPopup.this.dismiss();
                    return;
                }
                for (CascadingMenuInfo cascadingMenuInfo : CascadingMenuPopup.this.H) {
                    cascadingMenuInfo.f872a.b();
                }
            }
        }
    };
    public final View.OnAttachStateChangeListener J = new View.OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.X;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.X = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.X.removeGlobalOnLayoutListener(cascadingMenuPopup.I);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public final MenuItemHoverListener K = new MenuItemHoverListener() {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(final androidx.appcompat.view.menu.MenuBuilder r6, final android.view.MenuItem r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.CascadingMenuPopup r0 = androidx.appcompat.view.menu.CascadingMenuPopup.this
                android.os.Handler r0 = r0.F
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.CascadingMenuPopup r0 = androidx.appcompat.view.menu.CascadingMenuPopup.this
                java.util.List r0 = r0.H
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.CascadingMenuPopup r4 = androidx.appcompat.view.menu.CascadingMenuPopup.this
                java.util.List r4 = r4.H
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r4 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r4
                androidx.appcompat.view.menu.MenuBuilder r4 = r4.f873b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.CascadingMenuPopup r0 = androidx.appcompat.view.menu.CascadingMenuPopup.this
                java.util.List r0 = r0.H
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.CascadingMenuPopup r0 = androidx.appcompat.view.menu.CascadingMenuPopup.this
                java.util.List r0 = r0.H
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r1 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r1
            L_0x0041:
                androidx.appcompat.view.menu.CascadingMenuPopup$3$1 r0 = new androidx.appcompat.view.menu.CascadingMenuPopup$3$1
                r0.<init>(r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.CascadingMenuPopup r7 = androidx.appcompat.view.menu.CascadingMenuPopup.this
                android.os.Handler r7 = r7.F
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.CascadingMenuPopup.AnonymousClass3.d(androidx.appcompat.view.menu.MenuBuilder, android.view.MenuItem):void");
        }

        public void g(MenuBuilder menuBuilder, MenuItem menuItem) {
            CascadingMenuPopup.this.F.removeCallbacksAndMessages(menuBuilder);
        }
    };
    public int L = 0;
    public int M = 0;
    public View N;
    public View O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public MenuPresenter.Callback W;
    public ViewTreeObserver X;
    public PopupWindow.OnDismissListener Y;
    public boolean Z;

    public static class CascadingMenuInfo {

        /* renamed from: a  reason: collision with root package name */
        public final MenuPopupWindow f872a;

        /* renamed from: b  reason: collision with root package name */
        public final MenuBuilder f873b;

        /* renamed from: c  reason: collision with root package name */
        public final int f874c;

        public CascadingMenuInfo(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i2) {
            this.f872a = menuPopupWindow;
            this.f873b = menuBuilder;
            this.f874c = i2;
        }

        public ListView a() {
            return this.f872a.j();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public CascadingMenuPopup(Context context, View view, int i2, int i3, boolean z2) {
        this.f864A = context;
        this.N = view;
        this.C = i2;
        this.D = i3;
        this.E = z2;
        this.U = false;
        this.P = D();
        Resources resources = context.getResources();
        this.f865B = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f333d));
        this.F = new Handler();
    }

    public final int A(MenuBuilder menuBuilder) {
        int size = this.H.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (menuBuilder == ((CascadingMenuInfo) this.H.get(i2)).f873b) {
                return i2;
            }
        }
        return -1;
    }

    public final MenuItem B(MenuBuilder menuBuilder, MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menuBuilder.getItem(i2);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(CascadingMenuInfo cascadingMenuInfo, MenuBuilder menuBuilder) {
        int i2;
        MenuAdapter menuAdapter;
        int firstVisiblePosition;
        MenuItem B2 = B(cascadingMenuInfo.f873b, menuBuilder);
        if (B2 == null) {
            return null;
        }
        ListView a2 = cascadingMenuInfo.a();
        ListAdapter adapter = a2.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
        } else {
            menuAdapter = (MenuAdapter) adapter;
            i2 = 0;
        }
        int count = menuAdapter.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (B2 == menuAdapter.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int D() {
        return ViewCompat.s(this.N) == 1 ? 0 : 1;
    }

    public final int E(int i2) {
        List list = this.H;
        ListView a2 = ((CascadingMenuInfo) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.O.getWindowVisibleDisplayFrame(rect);
        return this.P == 1 ? (iArr[0] + a2.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    public final void F(MenuBuilder menuBuilder) {
        View view;
        CascadingMenuInfo cascadingMenuInfo;
        LayoutInflater from = LayoutInflater.from(this.f864A);
        MenuAdapter menuAdapter = new MenuAdapter(menuBuilder, from, this.E, a0);
        if (!a() && this.U) {
            menuAdapter.d(true);
        } else if (a()) {
            menuAdapter.d(MenuPopup.x(menuBuilder));
        }
        int o2 = MenuPopup.o(menuAdapter, (ViewGroup) null, this.f864A, this.f865B);
        MenuPopupWindow z2 = z();
        z2.p(menuAdapter);
        z2.B(o2);
        z2.C(this.M);
        if (this.H.size() > 0) {
            List list = this.H;
            cascadingMenuInfo = (CascadingMenuInfo) list.get(list.size() - 1);
            view = C(cascadingMenuInfo, menuBuilder);
        } else {
            cascadingMenuInfo = null;
            view = null;
        }
        if (view != null) {
            z2.Q(false);
            z2.N((Object) null);
            int E2 = E(o2);
            boolean z3 = E2 == 1;
            this.P = E2;
            z2.z(view);
            if ((this.M & 5) != 5) {
                o2 = z3 ? view.getWidth() : 0 - o2;
            } else if (!z3) {
                o2 = 0 - view.getWidth();
            }
            z2.e(o2);
            z2.I(true);
            z2.l(0);
        } else {
            if (this.Q) {
                z2.e(this.S);
            }
            if (this.R) {
                z2.l(this.T);
            }
            z2.D(n());
        }
        this.H.add(new CascadingMenuInfo(z2, menuBuilder, this.P));
        z2.b();
        ListView j2 = z2.j();
        j2.setOnKeyListener(this);
        if (cascadingMenuInfo == null && this.V && menuBuilder.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.f414n, j2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(menuBuilder.x());
            j2.addHeaderView(frameLayout, (Object) null, false);
            z2.b();
        }
    }

    public boolean a() {
        return this.H.size() > 0 && ((CascadingMenuInfo) this.H.get(0)).f872a.a();
    }

    public void b() {
        if (!a()) {
            for (MenuBuilder F2 : this.G) {
                F(F2);
            }
            this.G.clear();
            View view = this.N;
            this.O = view;
            if (view != null) {
                boolean z2 = this.X == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.X = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.I);
                }
                this.O.addOnAttachStateChangeListener(this.J);
            }
        }
    }

    public void c(MenuBuilder menuBuilder, boolean z2) {
        int A2 = A(menuBuilder);
        if (A2 >= 0) {
            int i2 = A2 + 1;
            if (i2 < this.H.size()) {
                ((CascadingMenuInfo) this.H.get(i2)).f873b.e(false);
            }
            CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) this.H.remove(A2);
            cascadingMenuInfo.f873b.O(this);
            if (this.Z) {
                cascadingMenuInfo.f872a.O((Object) null);
                cascadingMenuInfo.f872a.A(0);
            }
            cascadingMenuInfo.f872a.dismiss();
            int size = this.H.size();
            if (size > 0) {
                this.P = ((CascadingMenuInfo) this.H.get(size - 1)).f874c;
            } else {
                this.P = D();
            }
            if (size == 0) {
                dismiss();
                MenuPresenter.Callback callback = this.W;
                if (callback != null) {
                    callback.c(menuBuilder, true);
                }
                ViewTreeObserver viewTreeObserver = this.X;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.X.removeGlobalOnLayoutListener(this.I);
                    }
                    this.X = null;
                }
                this.O.removeOnAttachStateChangeListener(this.J);
                this.Y.onDismiss();
            } else if (z2) {
                ((CascadingMenuInfo) this.H.get(0)).f873b.e(false);
            }
        }
    }

    public void d(boolean z2) {
        for (CascadingMenuInfo a2 : this.H) {
            MenuPopup.y(a2.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public void dismiss() {
        int size = this.H.size();
        if (size > 0) {
            CascadingMenuInfo[] cascadingMenuInfoArr = (CascadingMenuInfo[]) this.H.toArray(new CascadingMenuInfo[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i2];
                if (cascadingMenuInfo.f872a.a()) {
                    cascadingMenuInfo.f872a.dismiss();
                }
            }
        }
    }

    public boolean e() {
        return false;
    }

    public void h(MenuPresenter.Callback callback) {
        this.W = callback;
    }

    public ListView j() {
        if (this.H.isEmpty()) {
            return null;
        }
        List list = this.H;
        return ((CascadingMenuInfo) list.get(list.size() - 1)).a();
    }

    public boolean k(SubMenuBuilder subMenuBuilder) {
        for (CascadingMenuInfo cascadingMenuInfo : this.H) {
            if (subMenuBuilder == cascadingMenuInfo.f873b) {
                cascadingMenuInfo.a().requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        l(subMenuBuilder);
        MenuPresenter.Callback callback = this.W;
        if (callback != null) {
            callback.d(subMenuBuilder);
        }
        return true;
    }

    public void l(MenuBuilder menuBuilder) {
        menuBuilder.c(this, this.f864A);
        if (a()) {
            F(menuBuilder);
        } else {
            this.G.add(menuBuilder);
        }
    }

    public boolean m() {
        return false;
    }

    public void onDismiss() {
        CascadingMenuInfo cascadingMenuInfo;
        int size = this.H.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = (CascadingMenuInfo) this.H.get(i2);
            if (!cascadingMenuInfo.f872a.a()) {
                break;
            }
            i2++;
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.f873b.e(false);
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
        if (this.N != view) {
            this.N = view;
            this.M = GravityCompat.b(this.L, ViewCompat.s(view));
        }
    }

    public void r(boolean z2) {
        this.U = z2;
    }

    public void s(int i2) {
        if (this.L != i2) {
            this.L = i2;
            this.M = GravityCompat.b(i2, ViewCompat.s(this.N));
        }
    }

    public void t(int i2) {
        this.Q = true;
        this.S = i2;
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.Y = onDismissListener;
    }

    public void v(boolean z2) {
        this.V = z2;
    }

    public void w(int i2) {
        this.R = true;
        this.T = i2;
    }

    public final MenuPopupWindow z() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f864A, (AttributeSet) null, this.C, this.D);
        menuPopupWindow.P(this.K);
        menuPopupWindow.H(this);
        menuPopupWindow.G(this);
        menuPopupWindow.z(this.N);
        menuPopupWindow.C(this.M);
        menuPopupWindow.F(true);
        menuPopupWindow.E(2);
        return menuPopupWindow;
    }
}
