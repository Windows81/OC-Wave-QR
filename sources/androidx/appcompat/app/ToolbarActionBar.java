package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

class ToolbarActionBar extends ActionBar {

    /* renamed from: a  reason: collision with root package name */
    public final DecorToolbar f635a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f636b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f637c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f638d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f639e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f640f;

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f641g;

    /* renamed from: androidx.appcompat.app.ToolbarActionBar$1  reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ToolbarActionBar f642z;

        public void run() {
            this.f642z.x();
        }
    }

    /* renamed from: androidx.appcompat.app.ToolbarActionBar$2  reason: invalid class name */
    public class AnonymousClass2 implements Toolbar.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ToolbarActionBar f643a;

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f643a.f636b.onMenuItemSelected(0, menuItem);
        }
    }

    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {

        /* renamed from: z  reason: collision with root package name */
        public boolean f645z;

        public ActionMenuPresenterCallback() {
        }

        public void c(MenuBuilder menuBuilder, boolean z2) {
            if (!this.f645z) {
                this.f645z = true;
                ToolbarActionBar.this.f635a.i();
                ToolbarActionBar.this.f636b.onPanelClosed(108, menuBuilder);
                this.f645z = false;
            }
        }

        public boolean d(MenuBuilder menuBuilder) {
            ToolbarActionBar.this.f636b.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public final class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        public boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        public void b(MenuBuilder menuBuilder) {
            if (ToolbarActionBar.this.f635a.b()) {
                ToolbarActionBar.this.f636b.onPanelClosed(108, menuBuilder);
            } else if (ToolbarActionBar.this.f636b.onPreparePanel(0, (View) null, menuBuilder)) {
                ToolbarActionBar.this.f636b.onMenuOpened(108, menuBuilder);
            }
        }
    }

    public class ToolbarMenuCallback implements AppCompatDelegateImpl.ActionBarMenuCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ToolbarActionBar f647a;

        public boolean a(int i2) {
            if (i2 != 0) {
                return false;
            }
            ToolbarActionBar toolbarActionBar = this.f647a;
            if (toolbarActionBar.f637c) {
                return false;
            }
            toolbarActionBar.f635a.c();
            this.f647a.f637c = true;
            return false;
        }

        public View onCreatePanelView(int i2) {
            if (i2 == 0) {
                return new View(this.f647a.f635a.f());
            }
            return null;
        }
    }

    public boolean g() {
        return this.f635a.g();
    }

    public boolean h() {
        if (!this.f635a.k()) {
            return false;
        }
        this.f635a.collapseActionView();
        return true;
    }

    public void i(boolean z2) {
        if (z2 != this.f639e) {
            this.f639e = z2;
            int size = this.f640f.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ActionBar.OnMenuVisibilityListener) this.f640f.get(i2)).a(z2);
            }
        }
    }

    public int j() {
        return this.f635a.u();
    }

    public Context k() {
        return this.f635a.f();
    }

    public boolean l() {
        this.f635a.s().removeCallbacks(this.f641g);
        ViewCompat.P(this.f635a.s(), this.f641g);
        return true;
    }

    public void m(Configuration configuration) {
        super.m(configuration);
    }

    public void n() {
        this.f635a.s().removeCallbacks(this.f641g);
    }

    public boolean o(int i2, KeyEvent keyEvent) {
        Menu w2 = w();
        if (w2 == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        w2.setQwertyMode(z2);
        return w2.performShortcut(i2, keyEvent, 0);
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    public boolean q() {
        return this.f635a.h();
    }

    public void r(boolean z2) {
    }

    public void s(int i2) {
        this.f635a.v(i2);
    }

    public void t(boolean z2) {
    }

    public void u(CharSequence charSequence) {
        this.f635a.setWindowTitle(charSequence);
    }

    public final Menu w() {
        if (!this.f638d) {
            this.f635a.q(new ActionMenuPresenterCallback(), new MenuBuilderCallback());
            this.f638d = true;
        }
        return this.f635a.m();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.w()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.MenuBuilder
            r2 = 0
            if (r1 == 0) goto L_0x000d
            r1 = r0
            androidx.appcompat.view.menu.MenuBuilder r1 = (androidx.appcompat.view.menu.MenuBuilder) r1
            goto L_0x000e
        L_0x000d:
            r1 = r2
        L_0x000e:
            if (r1 == 0) goto L_0x0013
            r1.d0()
        L_0x0013:
            r0.clear()     // Catch:{ all -> 0x0028 }
            android.view.Window$Callback r3 = r5.f636b     // Catch:{ all -> 0x0028 }
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            android.view.Window$Callback r3 = r5.f636b     // Catch:{ all -> 0x0028 }
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x002d
            goto L_0x002a
        L_0x0028:
            r0 = move-exception
            goto L_0x0033
        L_0x002a:
            r0.clear()     // Catch:{ all -> 0x0028 }
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.c0()
        L_0x0032:
            return
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.c0()
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.ToolbarActionBar.x():void");
    }
}
