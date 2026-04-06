package androidx.activity;

import android.window.OnBackInvokedCallback;
import androidx.activity.OnBackPressedDispatcher;
import kotlin.jvm.functions.Function0;

/* renamed from: androidx.activity.r  reason: case insensitive filesystem */
public final /* synthetic */ class C0011r implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function0 f215a;

    public /* synthetic */ C0011r(Function0 function0) {
        this.f215a = function0;
    }

    public final void onBackInvoked() {
        OnBackPressedDispatcher.Api33Impl.c(this.f215a);
    }
}
