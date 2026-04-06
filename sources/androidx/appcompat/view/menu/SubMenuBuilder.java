package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;

public class SubMenuBuilder extends MenuBuilder implements SubMenu {

    /* renamed from: B  reason: collision with root package name */
    public MenuBuilder f978B;
    public MenuItemImpl C;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.f978B = menuBuilder;
        this.C = menuItemImpl;
    }

    public MenuBuilder D() {
        return this.f978B.D();
    }

    public boolean F() {
        return this.f978B.F();
    }

    public boolean G() {
        return this.f978B.G();
    }

    public boolean H() {
        return this.f978B.H();
    }

    public void R(MenuBuilder.Callback callback) {
        this.f978B.R(callback);
    }

    public Menu e0() {
        return this.f978B;
    }

    public boolean f(MenuItemImpl menuItemImpl) {
        return this.f978B.f(menuItemImpl);
    }

    public MenuItem getItem() {
        return this.C;
    }

    public boolean h(MenuBuilder menuBuilder, MenuItem menuItem) {
        return super.h(menuBuilder, menuItem) || this.f978B.h(menuBuilder, menuItem);
    }

    public boolean k(MenuItemImpl menuItemImpl) {
        return this.f978B.k(menuItemImpl);
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.f978B.setGroupDividerEnabled(z2);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.V(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.Z(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z2) {
        this.f978B.setQwertyMode(z2);
    }

    public String t() {
        MenuItemImpl menuItemImpl = this.C;
        int itemId = menuItemImpl != null ? menuItemImpl.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }

    public SubMenu setHeaderIcon(int i2) {
        return (SubMenu) super.U(i2);
    }

    public SubMenu setHeaderTitle(int i2) {
        return (SubMenu) super.X(i2);
    }

    public SubMenu setIcon(int i2) {
        this.C.setIcon(i2);
        return this;
    }
}
