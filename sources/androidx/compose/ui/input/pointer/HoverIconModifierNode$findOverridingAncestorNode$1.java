package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class HoverIconModifierNode$findOverridingAncestorNode$1 extends Lambda implements Function1<HoverIconModifierNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f16822z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverIconModifierNode$findOverridingAncestorNode$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f16822z = objectRef;
    }

    /* renamed from: b */
    public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
        if (hoverIconModifierNode.h3() && hoverIconModifierNode.Q) {
            this.f16822z.f40908z = hoverIconModifierNode;
        }
        return Boolean.TRUE;
    }
}
