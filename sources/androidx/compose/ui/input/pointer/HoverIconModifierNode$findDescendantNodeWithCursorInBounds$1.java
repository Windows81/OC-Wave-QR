package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1 extends Lambda implements Function1<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f16821z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f16821z = objectRef;
    }

    /* renamed from: b */
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        if (!hoverIconModifierNode.Q) {
            return traverseDescendantsAction;
        }
        this.f16821z.f40908z = hoverIconModifierNode;
        return hoverIconModifierNode.h3() ? TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : traverseDescendantsAction;
    }
}
