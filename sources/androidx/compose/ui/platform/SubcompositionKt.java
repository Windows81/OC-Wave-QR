package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

@Metadata
public final class SubcompositionKt {
    public static final ReusableComposition a(LayoutNode layoutNode, CompositionContext compositionContext) {
        return CompositionKt.b(Wrapper_androidKt.a(layoutNode), compositionContext);
    }
}
