package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.TintTypedArray;

public final class ExpandedMenuView extends ListView implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener {

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f875B = {16842964, 16843049};

    /* renamed from: A  reason: collision with root package name */
    public int f876A;

    /* renamed from: z  reason: collision with root package name */
    public MenuBuilder f877z;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public boolean a(MenuItemImpl menuItemImpl) {
        return this.f877z.L(menuItemImpl, 0);
    }

    public void b(MenuBuilder menuBuilder) {
        this.f877z = menuBuilder;
    }

    public int getWindowAnimations() {
        return this.f876A;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((MenuItemImpl) getAdapter().getItem(i2));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray u2 = TintTypedArray.u(context, attributeSet, f875B, i2, 0);
        if (u2.r(0)) {
            setBackgroundDrawable(u2.f(0));
        }
        if (u2.r(1)) {
            setDivider(u2.f(1));
        }
        u2.v();
    }
}
