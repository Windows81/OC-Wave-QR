package androidx.appcompat.view.menu;

public interface MenuView {

    public interface ItemView {
        boolean c();

        void d(MenuItemImpl menuItemImpl, int i2);

        MenuItemImpl getItemData();
    }

    void b(MenuBuilder menuBuilder);
}
