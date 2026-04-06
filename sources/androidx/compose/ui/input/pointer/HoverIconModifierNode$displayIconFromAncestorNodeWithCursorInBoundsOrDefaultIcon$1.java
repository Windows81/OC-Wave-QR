package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1 extends Lambda implements Function1<HoverIconModifierNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f16819z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f16819z = objectRef;
    }

    /* renamed from: b */
    public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
        if (this.f16819z.f40908z == null && hoverIconModifierNode.Q) {
            this.f16819z.f40908z = hoverIconModifierNode;
        } else if (this.f16819z.f40908z != null && hoverIconModifierNode.h3() && hoverIconModifierNode.Q) {
            this.f16819z.f40908z = hoverIconModifierNode;
        }
        return Boolean.TRUE;
    }
}
