package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

public abstract class BaseMenuPresenter implements MenuPresenter {

    /* renamed from: A  reason: collision with root package name */
    public Context f858A;

    /* renamed from: B  reason: collision with root package name */
    public MenuBuilder f859B;
    public LayoutInflater C;
    public LayoutInflater D;
    public MenuPresenter.Callback E;
    public int F;
    public int G;
    public MenuView H;
    public int I;

    /* renamed from: z  reason: collision with root package name */
    public Context f860z;

    public BaseMenuPresenter(Context context, int i2, int i3) {
        this.f860z = context;
        this.C = LayoutInflater.from(context);
        this.F = i2;
        this.G = i3;
    }

    public void b(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.H).addView(view, i2);
    }

    public void c(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.E;
        if (callback != null) {
            callback.c(menuBuilder, z2);
        }
    }

    public void d(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.H;
        if (viewGroup != null) {
            MenuBuilder menuBuilder = this.f859B;
            int i2 = 0;
            if (menuBuilder != null) {
                menuBuilder.r();
                ArrayList E2 = this.f859B.E();
                int size = E2.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) E2.get(i4);
                    if (r(i3, menuItemImpl)) {
                        View childAt = viewGroup.getChildAt(i3);
                        MenuItemImpl itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                        View o2 = o(menuItemImpl, childAt, viewGroup);
                        if (menuItemImpl != itemData) {
                            o2.setPressed(false);
                            o2.jumpDrawablesToCurrentState();
                        }
                        if (o2 != childAt) {
                            b(o2, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!m(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public boolean e() {
        return false;
    }

    public boolean f(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean g(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public void h(MenuPresenter.Callback callback) {
        this.E = callback;
    }

    public void i(Context context, MenuBuilder menuBuilder) {
        this.f858A = context;
        this.D = LayoutInflater.from(context);
        this.f859B = menuBuilder;
    }

    public abstract void j(MenuItemImpl menuItemImpl, MenuView.ItemView itemView);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.appcompat.view.menu.SubMenuBuilder r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.E
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.f859B
        L_0x0009:
            boolean r2 = r0.d(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.BaseMenuPresenter.k(androidx.appcompat.view.menu.SubMenuBuilder):boolean");
    }

    public MenuView.ItemView l(ViewGroup viewGroup) {
        return (MenuView.ItemView) this.C.inflate(this.G, viewGroup, false);
    }

    public boolean m(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public MenuPresenter.Callback n() {
        return this.E;
    }

    public View o(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        MenuView.ItemView l2 = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : l(viewGroup);
        j(menuItemImpl, l2);
        return (View) l2;
    }

    public MenuView p(ViewGroup viewGroup) {
        if (this.H == null) {
            MenuView menuView = (MenuView) this.C.inflate(this.F, viewGroup, false);
            this.H = menuView;
            menuView.b(this.f859B);
            d(true);
        }
        return this.H;
    }

    public void q(int i2) {
        this.I = i2;
    }

    public boolean r(int i2, MenuItemImpl menuItemImpl) {
        return true;
    }
}
