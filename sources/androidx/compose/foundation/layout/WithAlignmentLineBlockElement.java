package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class WithAlignmentLineBlockElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineBlockNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f4288z;

    /* renamed from: c */
    public SiblingsAlignedNode.WithAlignmentLineBlockNode a() {
        return new SiblingsAlignedNode.WithAlignmentLineBlockNode(this.f4288z);
    }

    /* renamed from: d */
    public void b(SiblingsAlignedNode.WithAlignmentLineBlockNode withAlignmentLineBlockNode) {
        withAlignmentLineBlockNode.Z2(this.f4288z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineBlockElement withAlignmentLineBlockElement = obj instanceof WithAlignmentLineBlockElement ? (WithAlignmentLineBlockElement) obj : null;
        if (withAlignmentLineBlockElement == null) {
            return false;
        }
        return this.f4288z == withAlignmentLineBlockElement.f4288z;
    }

    public int hashCode() {
        return this.f4288z.hashCode();
    }
}
