package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class AccessibilityDelegateCompat {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f20190c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f20191a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f20192b;

    public static final class AccessibilityDelegateAdapter extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final AccessibilityDelegateCompat f20193a;

        public AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            this.f20193a = accessibilityDelegateCompat;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f20193a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat b2 = this.f20193a.b(view);
            if (b2 != null) {
                return (AccessibilityNodeProvider) b2.e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f20193a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat V0 = AccessibilityNodeInfoCompat.V0(accessibilityNodeInfo);
            V0.G0(ViewCompat.E(view));
            V0.t0(ViewCompat.B(view));
            V0.A0(ViewCompat.l(view));
            V0.L0(ViewCompat.x(view));
            this.f20193a.g(view, V0);
            V0.e(accessibilityNodeInfo.getText(), view);
            List c2 = AccessibilityDelegateCompat.c(view);
            for (int i2 = 0; i2 < c2.size(); i2++) {
                V0.b((AccessibilityNodeInfoCompat.AccessibilityActionCompat) c2.get(i2));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f20193a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f20193a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f20193a.j(view, i2, bundle);
        }

        public void sendAccessibilityEvent(View view, int i2) {
            this.f20193a.l(view, i2);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f20193a.m(view, accessibilityEvent);
        }
    }

    public AccessibilityDelegateCompat() {
        this(f20190c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(R.id.H);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f20191a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public AccessibilityNodeProviderCompat b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f20191a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f20192b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] p2 = AccessibilityNodeInfoCompat.p(view.createAccessibilityNodeInfo().getText());
            int i2 = 0;
            while (p2 != null && i2 < p2.length) {
                if (clickableSpan.equals(p2[i2])) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f20191a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f20191a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.U0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f20191a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f20191a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i2, Bundle bundle) {
        List c2 = c(view);
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= c2.size()) {
                break;
            }
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat) c2.get(i3);
            if (accessibilityActionCompat.a() == i2) {
                z2 = accessibilityActionCompat.c(view, bundle);
                break;
            }
            i3++;
        }
        if (!z2) {
            z2 = this.f20191a.performAccessibilityAction(view, i2, bundle);
        }
        return (z2 || i2 != R.id.f19386a || bundle == null) ? z2 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i2) {
        this.f20191a.sendAccessibilityEvent(view, i2);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f20191a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public AccessibilityDelegateCompat(View.AccessibilityDelegate accessibilityDelegate) {
        this.f20191a = accessibilityDelegate;
        this.f20192b = new AccessibilityDelegateAdapter(this);
    }
}
