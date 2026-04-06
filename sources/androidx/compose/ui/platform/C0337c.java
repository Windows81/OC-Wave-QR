package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0337c implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17972a;

    public /* synthetic */ C0337c(AndroidComposeView androidComposeView) {
        this.f17972a = androidComposeView;
    }

    public final void onScrollChanged() {
        AndroidComposeView.c1(this.f17972a);
    }
}
