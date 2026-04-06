package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0338d implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17977z;

    public /* synthetic */ C0338d(AndroidComposeView androidComposeView) {
        this.f17977z = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z2) {
        AndroidComposeView.i1(this.f17977z, z2);
    }
}
