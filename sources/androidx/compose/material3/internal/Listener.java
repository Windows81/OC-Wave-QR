package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f12285A;

    /* renamed from: B  reason: collision with root package name */
    public final MutableState f12286B = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    public final Listener$touchExplorationListener$1 C;
    public final Listener$otherA11yServicesListener$1 D;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f12287z;

    @Metadata
    public static final class Api33Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api33Impl f12288a = new Api33Impl();

        public static final void a(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        public static final void b(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    public Listener(boolean z2, boolean z3, boolean z4) {
        this.f12287z = z3;
        this.f12285A = z4;
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1 = null;
        this.C = z2 ? new Listener$touchExplorationListener$1() : null;
        if ((z3 || z4) && Build.VERSION.SDK_INT >= 33) {
            listener$otherA11yServicesListener$1 = new Listener$otherA11yServicesListener$1(this);
        }
        this.D = listener$otherA11yServicesListener$1;
    }

    public final boolean i() {
        return ((Boolean) this.f12286B.getValue()).booleanValue();
    }

    public final boolean m(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i2).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.U(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public void onAccessibilityStateChanged(boolean z2) {
        w(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0.a() == true) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (r0.b() == true) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0.a() == true) goto L_0x0031;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean getValue() {
        /*
            r2 = this;
            boolean r0 = r2.i()
            if (r0 == 0) goto L_0x0030
            androidx.compose.material3.internal.Listener$touchExplorationListener$1 r0 = r2.C
            r1 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.a()
            if (r0 != r1) goto L_0x0012
            goto L_0x0031
        L_0x0012:
            boolean r0 = r2.f12287z
            if (r0 == 0) goto L_0x0021
            androidx.compose.material3.internal.Listener$otherA11yServicesListener$1 r0 = r2.D
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.a()
            if (r0 != r1) goto L_0x0021
            goto L_0x0031
        L_0x0021:
            boolean r0 = r2.f12285A
            if (r0 == 0) goto L_0x0030
            androidx.compose.material3.internal.Listener$otherA11yServicesListener$1 r0 = r2.D
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.b()
            if (r0 != r1) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.Listener.getValue():java.lang.Boolean");
    }

    public final boolean u(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i2).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.U(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final void v(AccessibilityManager accessibilityManager) {
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        w(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.C;
        if (listener$touchExplorationListener$1 != null) {
            listener$touchExplorationListener$1.b(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT >= 33 && (listener$otherA11yServicesListener$1 = this.D) != null) {
            listener$otherA11yServicesListener$1.c(m(accessibilityManager));
            listener$otherA11yServicesListener$1.d(u(accessibilityManager));
            Api33Impl.a(accessibilityManager, Q.a(listener$otherA11yServicesListener$1));
        }
    }

    public final void w(boolean z2) {
        this.f12286B.setValue(Boolean.valueOf(z2));
    }

    public final void x(AccessibilityManager accessibilityManager) {
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.C;
        if (listener$touchExplorationListener$1 != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT >= 33 && (listener$otherA11yServicesListener$1 = this.D) != null) {
            Api33Impl.b(accessibilityManager, Q.a(listener$otherA11yServicesListener$1));
        }
    }
}
