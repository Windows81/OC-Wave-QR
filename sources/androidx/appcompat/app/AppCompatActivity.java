package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.LocaleListCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

public class AppCompatActivity extends FragmentActivity implements AppCompatCallback, TaskStackBuilder.SupportParentable, ActionBarDrawerToggle.DelegateProvider {
    public AppCompatDelegate a0;
    public Resources b0;

    /* renamed from: androidx.appcompat.app.AppCompatActivity$1  reason: invalid class name */
    class AnonymousClass1 implements SavedStateRegistry.SavedStateProvider {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f569a;

        public Bundle a() {
            Bundle bundle = new Bundle();
            this.f569a.p0().B(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatActivity$2  reason: invalid class name */
    class AnonymousClass2 implements OnContextAvailableListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f570a;

        public void a(Context context) {
            AppCompatDelegate p0 = this.f570a.p0();
            p0.s();
            p0.x(this.f570a.v().a("androidx:appcompat"));
        }
    }

    public boolean A0(Intent intent) {
        return NavUtils.f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r0();
        p0().e(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(p0().g(context));
    }

    public void closeOptionsMenu() {
        ActionBar q0 = q0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (q0 == null || !q0.g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar q0 = q0();
        if (keyCode != 82 || q0 == null || !q0.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public View findViewById(int i2) {
        return p0().j(i2);
    }

    public MenuInflater getMenuInflater() {
        return p0().p();
    }

    public Resources getResources() {
        if (this.b0 == null && VectorEnabledTintResources.c()) {
            this.b0 = new VectorEnabledTintResources(this, super.getResources());
        }
        Resources resources = this.b0;
        return resources == null ? super.getResources() : resources;
    }

    public void h(ActionMode actionMode) {
    }

    public void i(ActionMode actionMode) {
    }

    public void invalidateOptionsMenu() {
        p0().t();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p0().w(configuration);
        if (this.b0 != null) {
            this.b0.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        w0();
    }

    public void onDestroy() {
        super.onDestroy();
        p0().y();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (y0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        ActionBar q0 = q0();
        if (menuItem.getItemId() != 16908332 || q0 == null || (q0.j() & 4) == 0) {
            return false;
        }
        return x0();
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        p0().z(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        p0().A();
    }

    public void onStart() {
        super.onStart();
        p0().C();
    }

    public void onStop() {
        super.onStop();
        p0().D();
    }

    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        p0().M(charSequence);
    }

    public void openOptionsMenu() {
        ActionBar q0 = q0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (q0 == null || !q0.q()) {
            super.openOptionsMenu();
        }
    }

    public AppCompatDelegate p0() {
        if (this.a0 == null) {
            this.a0 = AppCompatDelegate.h(this, this);
        }
        return this.a0;
    }

    public ActionBar q0() {
        return p0().r();
    }

    public Intent r() {
        return NavUtils.a(this);
    }

    public final void r0() {
        ViewTreeLifecycleOwner.b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.b(getWindow().getDecorView(), this);
    }

    public void s0(TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.h(this);
    }

    public void setContentView(int i2) {
        r0();
        p0().H(i2);
    }

    public void setTheme(int i2) {
        super.setTheme(i2);
        p0().L(i2);
    }

    public ActionMode t(ActionMode.Callback callback) {
        return null;
    }

    public void t0(LocaleListCompat localeListCompat) {
    }

    public void u0(int i2) {
    }

    public void v0(TaskStackBuilder taskStackBuilder) {
    }

    public void w0() {
    }

    public boolean x0() {
        Intent r2 = r();
        if (r2 == null) {
            return false;
        }
        if (A0(r2)) {
            TaskStackBuilder m2 = TaskStackBuilder.m(this);
            s0(m2);
            v0(m2);
            m2.p();
            try {
                ActivityCompat.o(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            z0(r2);
            return true;
        }
    }

    public final boolean y0(KeyEvent keyEvent) {
        return false;
    }

    public void z0(Intent intent) {
        NavUtils.e(this, intent);
    }

    public void setContentView(View view) {
        r0();
        p0().I(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r0();
        p0().J(view, layoutParams);
    }
}
