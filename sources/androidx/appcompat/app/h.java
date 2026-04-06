package androidx.appcompat.app;

import android.view.KeyEvent;
import androidx.core.view.KeyEventDispatcher;

public final /* synthetic */ class h implements KeyEventDispatcher.Component {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppCompatDialog f699z;

    public /* synthetic */ h(AppCompatDialog appCompatDialog) {
        this.f699z = appCompatDialog;
    }

    public final boolean w(KeyEvent keyEvent) {
        return this.f699z.k(keyEvent);
    }
}
