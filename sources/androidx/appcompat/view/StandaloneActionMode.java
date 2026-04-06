package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {

    /* renamed from: B  reason: collision with root package name */
    public Context f784B;
    public ActionBarContextView C;
    public ActionMode.Callback D;
    public WeakReference E;
    public boolean F;
    public boolean G;
    public MenuBuilder H;

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z2) {
        this.f784B = context;
        this.C = actionBarContextView;
        this.D = callback;
        MenuBuilder S = new MenuBuilder(actionBarContextView.getContext()).S(1);
        this.H = S;
        S.R(this);
        this.G = z2;
    }

    public boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.D.d(this, menuItem);
    }

    public void b(MenuBuilder menuBuilder) {
        k();
        this.C.g();
    }

    public void c() {
        if (!this.F) {
            this.F = true;
            this.D.a(this);
        }
    }

    public View d() {
        WeakReference weakReference = this.E;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.H;
    }

    public MenuInflater f() {
        return new SupportMenuInflater(this.C.getContext());
    }

    public CharSequence g() {
        return this.C.getSubtitle();
    }

    public CharSequence i() {
        return this.C.getTitle();
    }

    public void k() {
        this.D.c(this, this.H);
    }

    public boolean l() {
        return this.C.k();
    }

    public void m(View view) {
        this.C.setCustomView(view);
        this.E = view != null ? new WeakReference(view) : null;
    }

    public void n(int i2) {
        o(this.f784B.getString(i2));
    }

    public void o(CharSequence charSequence) {
        this.C.setSubtitle(charSequence);
    }

    public void q(int i2) {
        r(this.f784B.getString(i2));
    }

    public void r(CharSequence charSequence) {
        this.C.setTitle(charSequence);
    }

    public void s(boolean z2) {
        super.s(z2);
        this.C.setTitleOptional(z2);
    }
}
