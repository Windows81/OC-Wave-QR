package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WithAlignmentLineElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineNode> {

    /* renamed from: z  reason: collision with root package name */
    public final AlignmentLine f4289z;

    public WithAlignmentLineElement(AlignmentLine alignmentLine) {
        this.f4289z = alignmentLine;
    }

    /* renamed from: c */
    public SiblingsAlignedNode.WithAlignmentLineNode a() {
        return new SiblingsAlignedNode.WithAlignmentLineNode(this.f4289z);
    }

    /* renamed from: d */
    public void b(SiblingsAlignedNode.WithAlignmentLineNode withAlignmentLineNode) {
        withAlignmentLineNode.Z2(this.f4289z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return Intrinsics.d(this.f4289z, withAlignmentLineElement.f4289z);
    }

    public int hashCode() {
        return this.f4289z.hashCode();
    }
}
