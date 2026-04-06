package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class VerticalAlignNode extends Modifier.Node implements ParentDataModifierNode {
    public Alignment.Vertical N;

    public VerticalAlignNode(Alignment.Vertical vertical) {
        this.N = vertical;
    }

    /* renamed from: Z2 */
    public RowColumnParentData F(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, (FlowLayoutData) null, 15, (DefaultConstructorMarker) null);
        }
        rowColumnParentData.e(CrossAxisAlignment.f3867a.c(this.N));
        return rowColumnParentData;
    }

    public final void a3(Alignment.Vertical vertical) {
        this.N = vertical;
    }
}
