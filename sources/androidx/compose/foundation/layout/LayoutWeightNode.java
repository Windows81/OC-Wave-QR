package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LayoutWeightNode extends Modifier.Node implements ParentDataModifierNode {
    public float N;
    public boolean O;

    public LayoutWeightNode(float f2, boolean z2) {
        this.N = f2;
        this.O = z2;
    }

    /* renamed from: Z2 */
    public RowColumnParentData F(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, (FlowLayoutData) null, 15, (DefaultConstructorMarker) null);
        }
        rowColumnParentData.h(this.N);
        rowColumnParentData.f(this.O);
        return rowColumnParentData;
    }

    public final void a3(boolean z2) {
        this.O = z2;
    }

    public final void b3(float f2) {
        this.N = f2;
    }
}
