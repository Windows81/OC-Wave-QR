package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeProviderCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20413a;

    public static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final AccessibilityNodeProviderCompat f20414a;

        public AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f20414a = accessibilityNodeProviderCompat;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            AccessibilityNodeInfoCompat b2 = this.f20414a.b(i2);
            if (b2 == null) {
                return null;
            }
            return b2.U0();
        }

        public List findAccessibilityNodeInfosByText(String str, int i2) {
            List c2 = this.f20414a.c(str, i2);
            if (c2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c2.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((AccessibilityNodeInfoCompat) c2.get(i3)).U0());
            }
            return arrayList;
        }

        public AccessibilityNodeInfo findFocus(int i2) {
            AccessibilityNodeInfoCompat d2 = this.f20414a.d(i2);
            if (d2 == null) {
                return null;
            }
            return d2.U0();
        }

        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.f20414a.f(i2, i3, bundle);
        }
    }

    public static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        public AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f20414a.a(i2, AccessibilityNodeInfoCompat.V0(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        this.f20413a = new AccessibilityNodeProviderApi26(this);
    }

    public void a(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    public AccessibilityNodeInfoCompat b(int i2) {
        return null;
    }

    public List c(String str, int i2) {
        return null;
    }

    public AccessibilityNodeInfoCompat d(int i2) {
        return null;
    }

    public Object e() {
        return this.f20413a;
    }

    public boolean f(int i2, int i3, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.f20413a = obj;
    }
}
