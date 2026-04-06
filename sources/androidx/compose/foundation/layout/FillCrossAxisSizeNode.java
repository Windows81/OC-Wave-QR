package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FillCrossAxisSizeNode extends Modifier.Node implements ParentDataModifierNode {
    public float N;

    public FillCrossAxisSizeNode(float f2) {
        this.N = f2;
    }

    public final float Z2() {
        return this.N;
    }

    /* renamed from: a3 */
    public RowColumnParentData F(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, (FlowLayoutData) null, 15, (DefaultConstructorMarker) null);
        }
        FlowLayoutData c2 = rowColumnParentData.c();
        if (c2 == null) {
            c2 = new FlowLayoutData(this.N);
        }
        rowColumnParentData.g(c2);
        FlowLayoutData c3 = rowColumnParentData.c();
        Intrinsics.f(c3);
        c3.b(this.N);
        return rowColumnParentData;
    }

    public final void b3(float f2) {
        this.N = f2;
    }
}
