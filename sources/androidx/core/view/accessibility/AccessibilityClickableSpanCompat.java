package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class AccessibilityClickableSpanCompat extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f20374a;

    /* renamed from: b  reason: collision with root package name */
    public final AccessibilityNodeInfoCompat f20375b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20376c;

    public AccessibilityClickableSpanCompat(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i3) {
        this.f20374a = i2;
        this.f20375b = accessibilityNodeInfoCompat;
        this.f20376c = i3;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f20374a);
        this.f20375b.X(this.f20376c, bundle);
    }
}
