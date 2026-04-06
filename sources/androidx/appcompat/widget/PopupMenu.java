package androidx.appcompat.widget;

import android.view.MenuItem;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

public class PopupMenu {

    /* renamed from: a  reason: collision with root package name */
    public final MenuPopupHelper f1229a;

    /* renamed from: b  reason: collision with root package name */
    public OnMenuItemClickListener f1230b;

    /* renamed from: c  reason: collision with root package name */
    public OnDismissListener f1231c;

    /* renamed from: androidx.appcompat.widget.PopupMenu$1  reason: invalid class name */
    class AnonymousClass1 implements MenuBuilder.Callback {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ PopupMenu f1232z;

        public boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = this.f1232z.f1230b;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }

        public void b(MenuBuilder menuBuilder) {
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$2  reason: invalid class name */
    class AnonymousClass2 implements PopupWindow.OnDismissListener {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ PopupMenu f1233z;

        public void onDismiss() {
            PopupMenu popupMenu = this.f1233z;
            OnDismissListener onDismissListener = popupMenu.f1231c;
            if (onDismissListener != null) {
                onDismissListener.a(popupMenu);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$3  reason: invalid class name */
    class AnonymousClass3 extends ForwardingListener {
        public final /* synthetic */ PopupMenu I;

        public ShowableListMenu b() {
            return this.I.f1229a.c();
        }

        public boolean c() {
            this.I.b();
            return true;
        }

        public boolean d() {
            this.I.a();
            return true;
        }
    }

    public interface OnDismissListener {
        void a(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public void a() {
        this.f1229a.b();
    }

    public void b() {
        this.f1229a.k();
    }
}
