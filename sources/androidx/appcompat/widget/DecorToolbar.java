package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewPropertyAnimatorCompat;

public interface DecorToolbar {
    void a(Menu menu, MenuPresenter.Callback callback);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    Context f();

    boolean g();

    CharSequence getTitle();

    boolean h();

    void i();

    void j(ScrollingTabContainerView scrollingTabContainerView);

    boolean k();

    void l(int i2);

    Menu m();

    void n(int i2);

    int o();

    ViewPropertyAnimatorCompat p(int i2, long j2);

    void q(MenuPresenter.Callback callback, MenuBuilder.Callback callback2);

    void r(int i2);

    ViewGroup s();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z2);

    int u();

    void v(int i2);

    void w();

    void x();

    void y(boolean z2);
}
