package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

abstract class BaseMenuWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f861a;

    /* renamed from: b  reason: collision with root package name */
    public SimpleArrayMap f862b;

    /* renamed from: c  reason: collision with root package name */
    public SimpleArrayMap f863c;

    public BaseMenuWrapper(Context context) {
        this.f861a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f862b == null) {
            this.f862b = new SimpleArrayMap();
        }
        MenuItem menuItem2 = (MenuItem) this.f862b.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f861a, supportMenuItem);
        this.f862b.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f863c == null) {
            this.f863c = new SimpleArrayMap();
        }
        SubMenu subMenu2 = (SubMenu) this.f863c.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.f861a, supportSubMenu);
        this.f863c.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }

    public final void e() {
        SimpleArrayMap simpleArrayMap = this.f862b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap simpleArrayMap2 = this.f863c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    public final void f(int i2) {
        if (this.f862b != null) {
            int i3 = 0;
            while (i3 < this.f862b.size()) {
                if (((SupportMenuItem) this.f862b.g(i3)).getGroupId() == i2) {
                    this.f862b.h(i3);
                    i3--;
                }
                i3++;
            }
        }
    }

    public final void g(int i2) {
        if (this.f862b != null) {
            for (int i3 = 0; i3 < this.f862b.size(); i3++) {
                if (((SupportMenuItem) this.f862b.g(i3)).getItemId() == i2) {
                    this.f862b.h(i3);
                    return;
                }
            }
        }
    }
}
