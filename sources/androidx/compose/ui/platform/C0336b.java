package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0336b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17971z;

    public /* synthetic */ C0336b(AndroidComposeView androidComposeView) {
        this.f17971z = androidComposeView;
    }

    public final void onGlobalLayout() {
        AndroidComposeView.D0(this.f17971z);
    }
}
