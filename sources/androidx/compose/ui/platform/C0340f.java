package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;

/* renamed from: androidx.compose.ui.platform.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0340f implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f17979z;

    public /* synthetic */ C0340f(Function0 function0) {
        this.f17979z = function0;
    }

    public final void run() {
        AndroidComposeView$snapshotObserver$1.e(this.f17979z);
    }
}
