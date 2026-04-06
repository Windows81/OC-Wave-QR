package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewParentCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.customview.widget.FocusStrategy;
import java.util.ArrayList;
import java.util.List;

public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {

    /* renamed from: m  reason: collision with root package name */
    public static final Rect f20491m = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: n  reason: collision with root package name */
    public static final FocusStrategy.BoundsAdapter f20492n = new FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat>() {
        /* renamed from: b */
        public void a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.k(rect);
        }
    };

    /* renamed from: o  reason: collision with root package name */
    public static final FocusStrategy.CollectionAdapter f20493o = new FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat>() {
    };

    /* renamed from: d  reason: collision with root package name */
    public final Rect f20494d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f20495e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f20496f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f20497g;

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f20498h;

    /* renamed from: i  reason: collision with root package name */
    public final View f20499i;

    /* renamed from: j  reason: collision with root package name */
    public MyNodeProvider f20500j;

    /* renamed from: k  reason: collision with root package name */
    public int f20501k;

    /* renamed from: l  reason: collision with root package name */
    public int f20502l;

    public class MyNodeProvider extends AccessibilityNodeProviderCompat {
        public MyNodeProvider() {
        }

        public AccessibilityNodeInfoCompat b(int i2) {
            return AccessibilityNodeInfoCompat.W(ExploreByTouchHelper.this.w(i2));
        }

        public AccessibilityNodeInfoCompat d(int i2) {
            int i3 = i2 == 2 ? ExploreByTouchHelper.this.f20501k : ExploreByTouchHelper.this.f20502l;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i3);
        }

        public boolean f(int i2, int i3, Bundle bundle) {
            return ExploreByTouchHelper.this.D(i2, i3, bundle);
        }
    }

    private boolean G(int i2) {
        int i3;
        if (!this.f20498h.isEnabled() || !this.f20498h.isTouchExplorationEnabled() || (i3 = this.f20501k) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            n(i3);
        }
        this.f20501k = i2;
        this.f20499i.invalidate();
        I(i2, 32768);
        return true;
    }

    private boolean n(int i2) {
        if (this.f20501k != i2) {
            return false;
        }
        this.f20501k = Integer.MIN_VALUE;
        this.f20499i.invalidate();
        I(i2, 65536);
        return true;
    }

    private AccessibilityEvent p(int i2, int i3) {
        return i2 != -1 ? q(i2, i3) : r(i3);
    }

    public void A(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void B(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public void C(int i2, boolean z2) {
    }

    public boolean D(int i2, int i3, Bundle bundle) {
        return i2 != -1 ? E(i2, i3, bundle) : F(i3, bundle);
    }

    public final boolean E(int i2, int i3, Bundle bundle) {
        return i3 != 1 ? i3 != 2 ? i3 != 64 ? i3 != 128 ? x(i2, i3, bundle) : n(i2) : G(i2) : o(i2) : H(i2);
    }

    public final boolean F(int i2, Bundle bundle) {
        return ViewCompat.M(this.f20499i, i2, bundle);
    }

    public final boolean H(int i2) {
        int i3;
        if ((!this.f20499i.isFocused() && !this.f20499i.requestFocus()) || (i3 = this.f20502l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        this.f20502l = i2;
        C(i2, true);
        I(i2, 8);
        return true;
    }

    public final boolean I(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.f20498h.isEnabled() || (parent = this.f20499i.getParent()) == null) {
            return false;
        }
        return ViewParentCompat.h(parent, this.f20499i, p(i2, i3));
    }

    public AccessibilityNodeProviderCompat b(View view) {
        if (this.f20500j == null) {
            this.f20500j = new MyNodeProvider();
        }
        return this.f20500j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        y(accessibilityEvent);
    }

    public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.g(view, accessibilityNodeInfoCompat);
        A(accessibilityNodeInfoCompat);
    }

    public final boolean o(int i2) {
        if (this.f20502l != i2) {
            return false;
        }
        this.f20502l = Integer.MIN_VALUE;
        C(i2, false);
        I(i2, 8);
        return true;
    }

    public final AccessibilityEvent q(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        AccessibilityNodeInfoCompat w2 = w(i2);
        obtain.getText().add(w2.y());
        obtain.setContentDescription(w2.r());
        obtain.setScrollable(w2.Q());
        obtain.setPassword(w2.P());
        obtain.setEnabled(w2.J());
        obtain.setChecked(w2.G());
        z(i2, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(w2.o());
            AccessibilityRecordCompat.c(obtain, this.f20499i, i2);
            obtain.setPackageName(this.f20499i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    public final AccessibilityEvent r(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.f20499i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final AccessibilityNodeInfoCompat s(int i2) {
        AccessibilityNodeInfoCompat U = AccessibilityNodeInfoCompat.U();
        U.p0(true);
        U.r0(true);
        U.i0("android.view.View");
        Rect rect = f20491m;
        U.d0(rect);
        U.e0(rect);
        U.B0(this.f20499i);
        B(i2, U);
        if (U.y() == null && U.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        U.k(this.f20495e);
        if (!this.f20495e.equals(rect)) {
            int i3 = U.i();
            if ((i3 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((i3 & 128) == 0) {
                U.z0(this.f20499i.getContext().getPackageName());
                U.K0(this.f20499i, i2);
                if (this.f20501k == i2) {
                    U.a0(true);
                    U.a(128);
                } else {
                    U.a0(false);
                    U.a(64);
                }
                boolean z2 = this.f20502l == i2;
                if (z2) {
                    U.a(2);
                } else if (U.K()) {
                    U.a(1);
                }
                U.s0(z2);
                this.f20499i.getLocationOnScreen(this.f20497g);
                U.l(this.f20494d);
                if (this.f20494d.equals(rect)) {
                    U.k(this.f20494d);
                    if (U.f20380b != -1) {
                        AccessibilityNodeInfoCompat U2 = AccessibilityNodeInfoCompat.U();
                        for (int i4 = U.f20380b; i4 != -1; i4 = U2.f20380b) {
                            U2.C0(this.f20499i, -1);
                            U2.d0(f20491m);
                            B(i4, U2);
                            U2.k(this.f20495e);
                            Rect rect2 = this.f20494d;
                            Rect rect3 = this.f20495e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        U2.Y();
                    }
                    this.f20494d.offset(this.f20497g[0] - this.f20499i.getScrollX(), this.f20497g[1] - this.f20499i.getScrollY());
                }
                if (this.f20499i.getLocalVisibleRect(this.f20496f)) {
                    this.f20496f.offset(this.f20497g[0] - this.f20499i.getScrollX(), this.f20497g[1] - this.f20499i.getScrollY());
                    if (this.f20494d.intersect(this.f20496f)) {
                        U.e0(this.f20494d);
                        if (v(this.f20494d)) {
                            U.T0(true);
                        }
                    }
                }
                return U;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public final AccessibilityNodeInfoCompat t() {
        AccessibilityNodeInfoCompat V = AccessibilityNodeInfoCompat.V(this.f20499i);
        ViewCompat.K(this.f20499i, V);
        ArrayList arrayList = new ArrayList();
        u(arrayList);
        if (V.n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                V.d(this.f20499i, ((Integer) arrayList.get(i2)).intValue());
            }
            return V;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract void u(List list);

    public final boolean v(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f20499i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f20499i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public AccessibilityNodeInfoCompat w(int i2) {
        return i2 == -1 ? t() : s(i2);
    }

    public abstract boolean x(int i2, int i3, Bundle bundle);

    public void y(AccessibilityEvent accessibilityEvent) {
    }

    public void z(int i2, AccessibilityEvent accessibilityEvent) {
    }
}
