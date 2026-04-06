package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    public Function0 N;
    public LazyLayoutSemanticState O;
    public Orientation P;
    public boolean Q;
    public boolean R;
    public ScrollAxisRange S;
    public final Function1 T = new LazyLayoutSemanticsModifierNode$indexForKeyMapping$1(this);
    public Function1 U;

    public LazyLayoutSemanticsModifierNode(Function0 function0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z2, boolean z3) {
        this.N = function0;
        this.O = lazyLayoutSemanticState;
        this.P = orientation;
        this.Q = z2;
        this.R = z3;
        e3();
    }

    private final boolean c3() {
        return this.P == Orientation.Vertical;
    }

    public boolean D2() {
        return false;
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.H0(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.v(semanticsPropertyReceiver, this.T);
        if (c3()) {
            ScrollAxisRange scrollAxisRange = this.S;
            if (scrollAxisRange == null) {
                Intrinsics.y("scrollAxisRange");
                scrollAxisRange = null;
            }
            SemanticsPropertiesKt.J0(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.S;
            if (scrollAxisRange2 == null) {
                Intrinsics.y("scrollAxisRange");
                scrollAxisRange2 = null;
            }
            SemanticsPropertiesKt.k0(semanticsPropertyReceiver, scrollAxisRange2);
        }
        Function1 function1 = this.U;
        if (function1 != null) {
            SemanticsPropertiesKt.Z(semanticsPropertyReceiver, (String) null, function1, 1, (Object) null);
        }
        SemanticsPropertiesKt.s(semanticsPropertyReceiver, (String) null, new LazyLayoutSemanticsModifierNode$applySemantics$2(this), 1, (Object) null);
        SemanticsPropertiesKt.b0(semanticsPropertyReceiver, b3());
    }

    public final CollectionInfo b3() {
        return this.O.f();
    }

    public final void d3(Function0 function0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z2, boolean z3) {
        this.N = function0;
        this.O = lazyLayoutSemanticState;
        if (this.P != orientation) {
            this.P = orientation;
            SemanticsModifierNodeKt.b(this);
        }
        if (this.Q != z2 || this.R != z3) {
            this.Q = z2;
            this.R = z3;
            e3();
            SemanticsModifierNodeKt.b(this);
        }
    }

    public final void e3() {
        this.S = new ScrollAxisRange(new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1(this), new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$2(this), this.R);
        this.U = this.Q ? new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3(this) : null;
    }
}
