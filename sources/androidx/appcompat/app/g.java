package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;

public final /* synthetic */ class g implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f698a;

    public /* synthetic */ g(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f698a = appCompatDelegateImpl;
    }

    public final void onBackInvoked() {
        this.f698a.A0();
    }
}
