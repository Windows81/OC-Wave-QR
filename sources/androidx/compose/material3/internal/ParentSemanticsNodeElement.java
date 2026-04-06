package androidx.compose.material3.internal;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ParentSemanticsNodeElement extends ModifierNodeElement<ParentSemanticsNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f12312z;

    public ParentSemanticsNodeElement(Function1 function1) {
        this.f12312z = function1;
    }

    /* renamed from: c */
    public ParentSemanticsNode a() {
        return new ParentSemanticsNode(this.f12312z);
    }

    /* renamed from: d */
    public void b(ParentSemanticsNode parentSemanticsNode) {
        parentSemanticsNode.b3(this.f12312z);
        SemanticsModifierNodeKt.b(parentSemanticsNode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSemanticsNodeElement)) {
            return false;
        }
        return this.f12312z == ((ParentSemanticsNodeElement) obj).f12312z;
    }

    public int hashCode() {
        return this.f12312z.hashCode();
    }
}
