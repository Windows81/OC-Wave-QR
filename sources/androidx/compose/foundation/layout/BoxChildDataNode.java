package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
final class BoxChildDataNode extends Modifier.Node implements ParentDataModifierNode {
    public Alignment N;
    public boolean O;

    public BoxChildDataNode(Alignment alignment, boolean z2) {
        this.N = alignment;
        this.O = z2;
    }

    public final Alignment Z2() {
        return this.N;
    }

    public final boolean a3() {
        return this.O;
    }

    /* renamed from: b3 */
    public BoxChildDataNode F(Density density, Object obj) {
        return this;
    }

    public final void c3(Alignment alignment) {
        this.N = alignment;
    }

    public final void d3(boolean z2) {
        this.O = z2;
    }
}
