package androidx.compose.ui.viewinterop;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f19257z;

    public /* synthetic */ a(Function0 function0) {
        this.f19257z = function0;
    }

    public final void run() {
        AndroidViewHolder.D(this.f19257z);
    }
}
