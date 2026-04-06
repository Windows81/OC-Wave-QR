package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f17566A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollObservationScope f17567z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.f17567z = scrollObservationScope;
        this.f17566A = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void invoke() {
        SemanticsNode b2;
        LayoutNode q2;
        ScrollAxisRange a2 = this.f17567z.a();
        ScrollAxisRange e2 = this.f17567z.e();
        Float b3 = this.f17567z.b();
        Float c2 = this.f17567z.c();
        float floatValue = (a2 == null || b3 == null) ? 0.0f : ((Number) a2.c().invoke()).floatValue() - b3.floatValue();
        float floatValue2 = (e2 == null || c2 == null) ? 0.0f : ((Number) e2.c().invoke()).floatValue() - c2.floatValue();
        if (!(floatValue == 0.0f && floatValue2 == 0.0f)) {
            int J = this.f17566A.B0(this.f17567z.d());
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.f17566A.a0().b(this.f17566A.f17543o);
            if (semanticsNodeWithAdjustedBounds != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f17566A;
                try {
                    AccessibilityNodeInfoCompat w2 = androidComposeViewAccessibilityDelegateCompat.f17545q;
                    if (w2 != null) {
                        w2.e0(androidComposeViewAccessibilityDelegateCompat.N(semanticsNodeWithAdjustedBounds));
                        Unit unit = Unit.f40552a;
                    }
                } catch (IllegalStateException unused) {
                    Unit unit2 = Unit.f40552a;
                }
            }
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.f17566A.a0().b(this.f17566A.f17544p);
            if (semanticsNodeWithAdjustedBounds2 != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.f17566A;
                try {
                    AccessibilityNodeInfoCompat x2 = androidComposeViewAccessibilityDelegateCompat2.f17546r;
                    if (x2 != null) {
                        x2.e0(androidComposeViewAccessibilityDelegateCompat2.N(semanticsNodeWithAdjustedBounds2));
                        Unit unit3 = Unit.f40552a;
                    }
                } catch (IllegalStateException unused2) {
                    Unit unit4 = Unit.f40552a;
                }
            }
            this.f17566A.i0().invalidate();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) this.f17566A.a0().b(J);
            if (!(semanticsNodeWithAdjustedBounds3 == null || (b2 = semanticsNodeWithAdjustedBounds3.b()) == null || (q2 = b2.q()) == null)) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this.f17566A;
                if (a2 != null) {
                    androidComposeViewAccessibilityDelegateCompat3.f17548t.r(J, a2);
                }
                if (e2 != null) {
                    androidComposeViewAccessibilityDelegateCompat3.f17549u.r(J, e2);
                }
                androidComposeViewAccessibilityDelegateCompat3.o0(q2);
            }
        }
        if (a2 != null) {
            this.f17567z.g((Float) a2.c().invoke());
        }
        if (e2 != null) {
            this.f17567z.h((Float) e2.c().invoke());
        }
    }
}
