package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.internal.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0128a implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f12388A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Listener f12389z;

    public /* synthetic */ C0128a(Listener listener, AccessibilityManager accessibilityManager) {
        this.f12389z = listener;
        this.f12388A = accessibilityManager;
    }

    public final Object invoke(Object obj) {
        return AccessibilityServiceStateProvider_androidKt.o(this.f12389z, this.f12388A, (Lifecycle.Event) obj);
    }
}
