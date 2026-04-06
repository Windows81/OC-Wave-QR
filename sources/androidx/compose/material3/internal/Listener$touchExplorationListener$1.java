package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;

@Metadata
public final class Listener$touchExplorationListener$1 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f12292a = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    public final boolean a() {
        return ((Boolean) this.f12292a.getValue()).booleanValue();
    }

    public final void b(boolean z2) {
        this.f12292a.setValue(Boolean.valueOf(z2));
    }

    public void onTouchExplorationStateChanged(boolean z2) {
        b(z2);
    }
}
