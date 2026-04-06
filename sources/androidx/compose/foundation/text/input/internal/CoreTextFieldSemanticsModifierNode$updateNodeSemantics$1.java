package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldSemanticsModifierNode$updateNodeSemantics$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f6157z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldSemanticsModifierNode$updateNodeSemantics$1(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        super(0);
        this.f6157z = coreTextFieldSemanticsModifierNode;
    }

    public final void invoke() {
        DelegatableNodeKt.i(this.f6157z);
    }
}
