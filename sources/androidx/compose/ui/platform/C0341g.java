package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0341g implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f17980z;

    public /* synthetic */ C0341g(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.f17980z = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onAccessibilityStateChanged(boolean z2) {
        AndroidComposeViewAccessibilityDelegateCompat.X(this.f17980z, z2);
    }
}
