package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;

public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    public AppCompatDelegate C;
    public final KeyEventDispatcher.Component D = new h(this);

    public AppCompatDialog(Context context, int i2) {
        super(context, j(context, i2));
        AppCompatDelegate g2 = g();
        g2.L(j(context, i2));
        g2.x((Bundle) null);
    }

    public static int j(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f294B, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().e(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        g().y();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.e(this.D, getWindow().getDecorView(), this, keyEvent);
    }

    public View findViewById(int i2) {
        return g().j(i2);
    }

    public AppCompatDelegate g() {
        if (this.C == null) {
            this.C = AppCompatDelegate.i(this, this);
        }
        return this.C;
    }

    public void h(ActionMode actionMode) {
    }

    public void i(ActionMode actionMode) {
    }

    public void invalidateOptionsMenu() {
        g().t();
    }

    public boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean l(int i2) {
        return g().G(i2);
    }

    public void onCreate(Bundle bundle) {
        g().s();
        super.onCreate(bundle);
        g().x(bundle);
    }

    public void onStop() {
        super.onStop();
        g().D();
    }

    public void setContentView(int i2) {
        g().H(i2);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        g().M(charSequence);
    }

    public ActionMode t(ActionMode.Callback callback) {
        return null;
    }

    public void setContentView(View view) {
        g().I(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().J(view, layoutParams);
    }

    public void setTitle(int i2) {
        super.setTitle(i2);
        g().M(getContext().getString(i2));
    }
}
