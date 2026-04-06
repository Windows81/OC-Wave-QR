package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class SiblingsAlignedNode extends Modifier.Node implements ParentDataModifierNode {

    @Metadata
    public static final class WithAlignmentLineBlockNode extends SiblingsAlignedNode {
        public Function1 N;

        public WithAlignmentLineBlockNode(Function1 function1) {
            super((DefaultConstructorMarker) null);
            this.N = function1;
        }

        public Object F(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, (FlowLayoutData) null, 15, (DefaultConstructorMarker) null);
            }
            rowColumnParentData.e(CrossAxisAlignment.f3867a.a(new AlignmentLineProvider.Block(this.N)));
            return rowColumnParentData;
        }

        public final void Z2(Function1 function1) {
            this.N = function1;
        }
    }

    @Metadata
    public static final class WithAlignmentLineNode extends SiblingsAlignedNode {
        public AlignmentLine N;

        public WithAlignmentLineNode(AlignmentLine alignmentLine) {
            super((DefaultConstructorMarker) null);
            this.N = alignmentLine;
        }

        public Object F(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, (FlowLayoutData) null, 15, (DefaultConstructorMarker) null);
            }
            rowColumnParentData.e(CrossAxisAlignment.f3867a.a(new AlignmentLineProvider.Value(this.N)));
            return rowColumnParentData;
        }

        public final void Z2(AlignmentLine alignmentLine) {
            this.N = alignmentLine;
        }
    }

    public /* synthetic */ SiblingsAlignedNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public SiblingsAlignedNode() {
    }
}
