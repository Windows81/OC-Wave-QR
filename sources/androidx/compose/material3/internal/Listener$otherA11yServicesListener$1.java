package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;

@Metadata
public final class Listener$otherA11yServicesListener$1 implements AccessibilityManager$AccessibilityServicesStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f12289a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f12290b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Listener f12291c;

    public Listener$otherA11yServicesListener$1(Listener listener) {
        this.f12291c = listener;
        Boolean bool = Boolean.FALSE;
        this.f12289a = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f12290b = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final boolean a() {
        return ((Boolean) this.f12289a.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.f12290b.getValue()).booleanValue();
    }

    public final void c(boolean z2) {
        this.f12289a.setValue(Boolean.valueOf(z2));
    }

    public final void d(boolean z2) {
        this.f12290b.setValue(Boolean.valueOf(z2));
    }

    public void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        c(this.f12291c.m(accessibilityManager));
        d(this.f12291c.u(accessibilityManager));
    }
}
