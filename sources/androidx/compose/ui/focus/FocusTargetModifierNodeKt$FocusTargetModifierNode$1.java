package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata
final /* synthetic */ class FocusTargetModifierNodeKt$FocusTargetModifierNode$1 extends FunctionReferenceImpl implements Function1<FocusTargetNode, Unit> {
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FocusTargetNode) obj);
        return Unit.f40552a;
    }

    public final void v(FocusTargetNode focusTargetNode) {
        ((InvalidateSemantics) this.f40885A).a(focusTargetNode);
    }
}
