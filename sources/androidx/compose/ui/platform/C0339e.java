package androidx.compose.ui.platform;

/* renamed from: androidx.compose.ui.platform.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0339e implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17978z;

    public /* synthetic */ C0339e(AndroidComposeView androidComposeView) {
        this.f17978z = androidComposeView;
    }

    public final void run() {
        AndroidComposeView.d1(this.f17978z);
    }
}
