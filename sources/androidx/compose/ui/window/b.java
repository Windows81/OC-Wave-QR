package androidx.compose.ui.window;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f19344z;

    public /* synthetic */ b(Function0 function0) {
        this.f19344z = function0;
    }

    public final void run() {
        PopupLayout$snapshotStateObserver$1.e(this.f19344z);
    }
}
