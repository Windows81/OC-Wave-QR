package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

public final /* synthetic */ class i implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f1378a;

    public /* synthetic */ i(Runnable runnable) {
        this.f1378a = runnable;
    }

    public final void onBackInvoked() {
        this.f1378a.run();
    }
}
