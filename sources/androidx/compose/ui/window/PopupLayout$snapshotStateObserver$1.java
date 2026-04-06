package androidx.compose.ui.window;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PopupLayout$snapshotStateObserver$1 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f19329z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupLayout$snapshotStateObserver$1(PopupLayout popupLayout) {
        super(1);
        this.f19329z = popupLayout;
    }

    /* access modifiers changed from: private */
    public static final void e(Function0 function0) {
        function0.invoke();
    }

    public final void c(Function0 function0) {
        Handler handler = this.f19329z.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            function0.invoke();
            return;
        }
        Handler handler2 = this.f19329z.getHandler();
        if (handler2 != null) {
            handler2.post(new b(function0));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        c((Function0) obj);
        return Unit.f40552a;
    }
}
