package androidx.compose.ui.window;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class a implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function0 f19343a;

    public /* synthetic */ a(Function0 function0) {
        this.f19343a = function0;
    }

    public final void onBackInvoked() {
        Api33Impl.c(this.f19343a);
    }
}
