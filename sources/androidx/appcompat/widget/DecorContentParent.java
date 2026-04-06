package androidx.appcompat.widget;

import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.MenuPresenter;

public interface DecorContentParent {
    void a(Menu menu, MenuPresenter.Callback callback);

    boolean b();

    void c();

    boolean d();

    boolean e();

    boolean g();

    boolean h();

    void i(int i2);

    void j();

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
