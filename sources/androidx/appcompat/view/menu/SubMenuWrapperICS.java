package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportSubMenu;

class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final SupportSubMenu f979e;

    public SubMenuWrapperICS(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f979e = supportSubMenu;
    }

    public void clearHeader() {
        this.f979e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f979e.getItem());
    }

    public SubMenu setHeaderIcon(int i2) {
        this.f979e.setHeaderIcon(i2);
        return this;
    }

    public SubMenu setHeaderTitle(int i2) {
        this.f979e.setHeaderTitle(i2);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f979e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i2) {
        this.f979e.setIcon(i2);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f979e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f979e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f979e.setIcon(drawable);
        return this;
    }
}
