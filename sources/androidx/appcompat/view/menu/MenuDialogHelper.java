package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuPresenter;

class MenuDialogHelper implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback {

    /* renamed from: A  reason: collision with root package name */
    public AlertDialog f916A;

    /* renamed from: B  reason: collision with root package name */
    public ListMenuPresenter f917B;
    public MenuPresenter.Callback C;

    /* renamed from: z  reason: collision with root package name */
    public MenuBuilder f918z;

    public MenuDialogHelper(MenuBuilder menuBuilder) {
        this.f918z = menuBuilder;
    }

    public void a() {
        AlertDialog alertDialog = this.f916A;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        MenuBuilder menuBuilder = this.f918z;
        AlertDialog.Builder builder = new AlertDialog.Builder(menuBuilder.u());
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.b(), R.layout.f412l);
        this.f917B = listMenuPresenter;
        listMenuPresenter.h(this);
        this.f918z.b(this.f917B);
        builder.c(this.f917B.a(), this);
        View y2 = menuBuilder.y();
        if (y2 != null) {
            builder.d(y2);
        } else {
            builder.e(menuBuilder.w()).i(menuBuilder.x());
        }
        builder.g(this);
        AlertDialog a2 = builder.a();
        this.f916A = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f916A.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f916A.show();
    }

    public void c(MenuBuilder menuBuilder, boolean z2) {
        if (z2 || menuBuilder == this.f918z) {
            a();
        }
        MenuPresenter.Callback callback = this.C;
        if (callback != null) {
            callback.c(menuBuilder, z2);
        }
    }

    public boolean d(MenuBuilder menuBuilder) {
        MenuPresenter.Callback callback = this.C;
        if (callback != null) {
            return callback.d(menuBuilder);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f918z.L((MenuItemImpl) this.f917B.a().getItem(i2), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f917B.c(this.f918z, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f916A.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f916A.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f918z.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f918z.performShortcut(i2, keyEvent, 0);
    }
}
