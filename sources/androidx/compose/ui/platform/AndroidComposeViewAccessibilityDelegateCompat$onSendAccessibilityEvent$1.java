package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 extends Lambda implements Function1<AccessibilityEvent, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f17565z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.f17565z = androidComposeViewAccessibilityDelegateCompat;
    }

    /* renamed from: b */
    public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
        return Boolean.valueOf(this.f17565z.i0().getParent().requestSendAccessibilityEvent(this.f17565z.i0(), accessibilityEvent));
    }
}
