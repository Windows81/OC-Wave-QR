package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata
public /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements Function2<FocusState, FocusState, Unit> {
    public FocusableNode$focusTargetNode$1(Object obj) {
        super(2, obj, FocusableNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        v((FocusState) obj, (FocusState) obj2);
        return Unit.f40552a;
    }

    public final void v(FocusState focusState, FocusState focusState2) {
        ((FocusableNode) this.f40885A).m3(focusState, focusState2);
    }
}
