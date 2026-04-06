package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.functions.Function0;

/* renamed from: androidx.compose.material3.internal.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0129b implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f12393A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Listener f12394z;

    public /* synthetic */ C0129b(Listener listener, AccessibilityManager accessibilityManager) {
        this.f12394z = listener;
        this.f12393A = accessibilityManager;
    }

    public final Object invoke() {
        return AccessibilityServiceStateProvider_androidKt.p(this.f12394z, this.f12393A);
    }
}
