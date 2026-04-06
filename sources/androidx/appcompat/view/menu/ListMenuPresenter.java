package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {

    /* renamed from: A  reason: collision with root package name */
    public LayoutInflater f881A;

    /* renamed from: B  reason: collision with root package name */
    public MenuBuilder f882B;
    public ExpandedMenuView C;
    public int D;
    public int E;
    public int F;
    public MenuPresenter.Callback G;
    public MenuAdapter H;

    /* renamed from: z  reason: collision with root package name */
    public Context f883z;

    public class MenuAdapter extends BaseAdapter {

        /* renamed from: z  reason: collision with root package name */
        public int f885z = -1;

        public MenuAdapter() {
            a();
        }

        public void a() {
            MenuItemImpl v2 = ListMenuPresenter.this.f882B.v();
            if (v2 != null) {
                ArrayList z2 = ListMenuPresenter.this.f882B.z();
                int size = z2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((MenuItemImpl) z2.get(i2)) == v2) {
                        this.f885z = i2;
                        return;
                    }
                }
            }
            this.f885z = -1;
        }

        /* renamed from: b */
        public MenuItemImpl getItem(int i2) {
            ArrayList z2 = ListMenuPresenter.this.f882B.z();
            int i3 = i2 + ListMenuPresenter.this.D;
            int i4 = this.f885z;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return (MenuItemImpl) z2.get(i3);
        }

        public int getCount() {
            int size = ListMenuPresenter.this.f882B.z().size() - ListMenuPresenter.this.D;
            return this.f885z < 0 ? size : size - 1;
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
                view = listMenuPresenter.f881A.inflate(listMenuPresenter.F, viewGroup, false);
            }
            ((MenuView.ItemView) view).d(getItem(i2), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context, int i2) {
        this(i2, 0);
        this.f883z = context;
        this.f881A = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.H == null) {
            this.H = new MenuAdapter();
        }
        return this.H;
    }

    public MenuView b(ViewGroup viewGroup) {
        if (this.C == null) {
            this.C = (ExpandedMenuView) this.f881A.inflate(R.layout.f409i, viewGroup, false);
            if (this.H == null) {
                this.H = new MenuAdapter();
            }
            this.C.setAdapter(this.H);
            this.C.setOnItemClickListener(this);
        }
        return this.C;
    }

    public void c(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.G;
        if (callback != null) {
            callback.c(menuBuilder, z2);
        }
    }

    public void d(boolean z2) {
        MenuAdapter menuAdapter = this.H;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
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
        this.G = callback;
    }

    public void i(Context context, MenuBuilder menuBuilder) {
        if (this.E != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.E);
            this.f883z = contextThemeWrapper;
            this.f881A = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f883z != null) {
            this.f883z = context;
            if (this.f881A == null) {
                this.f881A = LayoutInflater.from(context);
            }
        }
        this.f882B = menuBuilder;
        MenuAdapter menuAdapter = this.H;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    public boolean k(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        new MenuDialogHelper(subMenuBuilder).b((IBinder) null);
        MenuPresenter.Callback callback = this.G;
        if (callback == null) {
            return true;
        }
        callback.d(subMenuBuilder);
        return true;
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f882B.M(this.H.getItem(i2), this, 0);
    }

    public ListMenuPresenter(int i2, int i3) {
        this.F = i2;
        this.E = i3;
    }
}
