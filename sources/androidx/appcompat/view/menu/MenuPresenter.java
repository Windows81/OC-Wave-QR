package androidx.appcompat.view.menu;

import android.content.Context;

public interface MenuPresenter {

    public interface Callback {
        void c(MenuBuilder menuBuilder, boolean z2);

        boolean d(MenuBuilder menuBuilder);
    }

    void c(MenuBuilder menuBuilder, boolean z2);

    void d(boolean z2);

    boolean e();

    boolean f(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean g(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    void h(Callback callback);

    void i(Context context, MenuBuilder menuBuilder);

    boolean k(SubMenuBuilder subMenuBuilder);
}
