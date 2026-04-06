package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

public class SupportActionModeWrapper extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f785a;

    /* renamed from: b  reason: collision with root package name */
    public final ActionMode f786b;

    public static class CallbackWrapper implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f787a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f788b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f789c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final SimpleArrayMap f790d = new SimpleArrayMap();

        public CallbackWrapper(Context context, ActionMode.Callback callback) {
            this.f788b = context;
            this.f787a = callback;
        }

        public void a(ActionMode actionMode) {
            this.f787a.onDestroyActionMode(e(actionMode));
        }

        public boolean b(ActionMode actionMode, Menu menu) {
            return this.f787a.onCreateActionMode(e(actionMode), f(menu));
        }

        public boolean c(ActionMode actionMode, Menu menu) {
            return this.f787a.onPrepareActionMode(e(actionMode), f(menu));
        }

        public boolean d(ActionMode actionMode, MenuItem menuItem) {
            return this.f787a.onActionItemClicked(e(actionMode), new MenuItemWrapperICS(this.f788b, (SupportMenuItem) menuItem));
        }

        public android.view.ActionMode e(ActionMode actionMode) {
            int size = this.f789c.size();
            for (int i2 = 0; i2 < size; i2++) {
                SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper) this.f789c.get(i2);
                if (supportActionModeWrapper != null && supportActionModeWrapper.f786b == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.f788b, actionMode);
            this.f789c.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f790d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuWrapperICS menuWrapperICS = new MenuWrapperICS(this.f788b, (SupportMenu) menu);
            this.f790d.put(menu, menuWrapperICS);
            return menuWrapperICS;
        }
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.f785a = context;
        this.f786b = actionMode;
    }

    public void finish() {
        this.f786b.c();
    }

    public View getCustomView() {
        return this.f786b.d();
    }

    public Menu getMenu() {
        return new MenuWrapperICS(this.f785a, (SupportMenu) this.f786b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f786b.f();
    }

    public CharSequence getSubtitle() {
        return this.f786b.g();
    }

    public Object getTag() {
        return this.f786b.h();
    }

    public CharSequence getTitle() {
        return this.f786b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f786b.j();
    }

    public void invalidate() {
        this.f786b.k();
    }

    public boolean isTitleOptional() {
        return this.f786b.l();
    }

    public void setCustomView(View view) {
        this.f786b.m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f786b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.f786b.p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f786b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z2) {
        this.f786b.s(z2);
    }

    public void setSubtitle(int i2) {
        this.f786b.n(i2);
    }

    public void setTitle(int i2) {
        this.f786b.q(i2);
    }
}
