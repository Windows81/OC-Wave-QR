package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {
    public Object N;

    public LayoutIdModifier(Object obj) {
        this.N = obj;
    }

    public Object F(Density density, Object obj) {
        return this;
    }

    public void Z2(Object obj) {
        this.N = obj;
    }

    public Object u0() {
        return this.N;
    }
}
