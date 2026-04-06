package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1 extends Lambda implements Function1<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f16820z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(Ref.BooleanRef booleanRef) {
        super(1);
        this.f16820z = booleanRef;
    }

    /* renamed from: b */
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
        if (!hoverIconModifierNode.Q) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        this.f16820z.f40901z = false;
        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
    }
}
