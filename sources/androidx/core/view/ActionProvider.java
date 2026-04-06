package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class ActionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Context f20194a;

    /* renamed from: b  reason: collision with root package name */
    public SubUiVisibilityListener f20195b;

    /* renamed from: c  reason: collision with root package name */
    public VisibilityListener f20196c;

    public interface SubUiVisibilityListener {
        void a(boolean z2);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean z2);
    }

    public ActionProvider(Context context) {
        this.f20194a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f20196c = null;
        this.f20195b = null;
    }

    public void i(SubUiVisibilityListener subUiVisibilityListener) {
        this.f20195b = subUiVisibilityListener;
    }

    public void j(VisibilityListener visibilityListener) {
        if (!(this.f20196c == null || visibilityListener == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f20196c = visibilityListener;
    }

    public void k(boolean z2) {
        SubUiVisibilityListener subUiVisibilityListener = this.f20195b;
        if (subUiVisibilityListener != null) {
            subUiVisibilityListener.a(z2);
        }
    }
}
