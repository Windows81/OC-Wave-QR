package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Metadata;

@Metadata
public final class AndroidComposeView$addAndroidView$1 extends AccessibilityDelegateCompat {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17500d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f17501e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17502f;

    public AndroidComposeView$addAndroidView$1(AndroidComposeView androidComposeView, LayoutNode layoutNode, AndroidComposeView androidComposeView2) {
        this.f17500d = androidComposeView;
        this.f17501e = layoutNode;
        this.f17502f = androidComposeView2;
    }

    public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Integer num;
        super.g(view, accessibilityNodeInfoCompat);
        if (this.f17500d.U.m0()) {
            accessibilityNodeInfoCompat.T0(false);
        }
        LayoutNode C0 = this.f17501e.C0();
        while (true) {
            num = null;
            if (C0 == null) {
                C0 = null;
                break;
            } else if (C0.u0().p(NodeKind.a(8))) {
                break;
            } else {
                C0 = C0.C0();
            }
        }
        if (C0 != null) {
            num = Integer.valueOf(C0.v());
        }
        if (num == null || num.intValue() == this.f17500d.getSemanticsOwner().d().o()) {
            num = -1;
        }
        accessibilityNodeInfoCompat.C0(this.f17502f, num.intValue());
        int v2 = this.f17501e.v();
        int e2 = this.f17500d.U.e0().e(v2, -1);
        if (e2 != -1) {
            View h2 = SemanticsUtils_androidKt.h(this.f17500d.getAndroidViewsHandler$ui_release(), e2);
            if (h2 != null) {
                accessibilityNodeInfoCompat.Q0(h2);
            } else {
                accessibilityNodeInfoCompat.R0(this.f17502f, e2);
            }
            this.f17500d.q0(v2, accessibilityNodeInfoCompat.U0(), this.f17500d.U.c0());
        }
        int e3 = this.f17500d.U.d0().e(v2, -1);
        if (e3 != -1) {
            View h3 = SemanticsUtils_androidKt.h(this.f17500d.getAndroidViewsHandler$ui_release(), e3);
            if (h3 != null) {
                accessibilityNodeInfoCompat.O0(h3);
            } else {
                accessibilityNodeInfoCompat.P0(this.f17502f, e3);
            }
            this.f17500d.q0(v2, accessibilityNodeInfoCompat.U0(), this.f17500d.U.b0());
        }
    }
}
