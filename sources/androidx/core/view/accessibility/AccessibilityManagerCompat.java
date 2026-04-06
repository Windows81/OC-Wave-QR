package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

public final class AccessibilityManagerCompat {

    @Deprecated
    public interface AccessibilityStateChangeListener {
        void onAccessibilityStateChanged(boolean z2);
    }

    @Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements AccessibilityStateChangeListener {
    }

    public static class AccessibilityStateChangeListenerWrapper implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: z  reason: collision with root package name */
        public AccessibilityStateChangeListener f20377z;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccessibilityStateChangeListenerWrapper)) {
                return false;
            }
            return this.f20377z.equals(((AccessibilityStateChangeListenerWrapper) obj).f20377z);
        }

        public int hashCode() {
            return this.f20377z.hashCode();
        }

        public void onAccessibilityStateChanged(boolean z2) {
            this.f20377z.onAccessibilityStateChanged(z2);
        }
    }

    public static class Api34Impl {
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z2);
    }

    public static final class TouchExplorationStateChangeListenerWrapper implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final TouchExplorationStateChangeListener f20378a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TouchExplorationStateChangeListenerWrapper)) {
                return false;
            }
            return this.f20378a.equals(((TouchExplorationStateChangeListenerWrapper) obj).f20378a);
        }

        public int hashCode() {
            return this.f20378a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z2) {
            this.f20378a.onTouchExplorationStateChanged(z2);
        }
    }
}
