package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

public class MenuAdapter extends BaseAdapter {

    /* renamed from: A  reason: collision with root package name */
    public int f886A = -1;

    /* renamed from: B  reason: collision with root package name */
    public boolean f887B;
    public final boolean C;
    public final LayoutInflater D;
    public final int E;

    /* renamed from: z  reason: collision with root package name */
    public MenuBuilder f888z;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.C = z2;
        this.D = layoutInflater;
        this.f888z = menuBuilder;
        this.E = i2;
        a();
    }

    public void a() {
        MenuItemImpl v2 = this.f888z.v();
        if (v2 != null) {
            ArrayList z2 = this.f888z.z();
            int size = z2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((MenuItemImpl) z2.get(i2)) == v2) {
                    this.f886A = i2;
                    return;
                }
            }
        }
        this.f886A = -1;
    }

    public MenuBuilder b() {
        return this.f888z;
    }

    /* renamed from: c */
    public MenuItemImpl getItem(int i2) {
        ArrayList z2 = this.C ? this.f888z.z() : this.f888z.E();
        int i3 = this.f886A;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (MenuItemImpl) z2.get(i2);
    }

    public void d(boolean z2) {
        this.f887B = z2;
    }

    public int getCount() {
        ArrayList z2 = this.C ? this.f888z.z() : this.f888z.E();
        return this.f886A < 0 ? z2.size() : z2.size() - 1;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.D.inflate(this.E, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f888z.F() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.f887B) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.d(getItem(i2), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
