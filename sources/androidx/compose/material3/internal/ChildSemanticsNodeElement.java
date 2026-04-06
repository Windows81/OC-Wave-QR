package androidx.compose.material3.internal;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ChildSemanticsNodeElement extends ModifierNodeElement<ChildSemanticsNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f12203z;

    public ChildSemanticsNodeElement(Function1 function1) {
        this.f12203z = function1;
    }

    /* renamed from: c */
    public ChildSemanticsNode a() {
        return new ChildSemanticsNode(this.f12203z);
    }

    /* renamed from: d */
    public void b(ChildSemanticsNode childSemanticsNode) {
        childSemanticsNode.d3(this.f12203z);
        SemanticsModifierNodeKt.b(childSemanticsNode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildSemanticsNodeElement)) {
            return false;
        }
        return this.f12203z == ((ChildSemanticsNodeElement) obj).f12203z;
    }

    public int hashCode() {
        return this.f12203z.hashCode();
    }
}
