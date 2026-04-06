package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata
public final class LayoutNodeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Density f17303a = DensityKt.b(1.0f, 0.0f, 2, (Object) null);

    public static final Owner b(LayoutNode layoutNode) {
        Owner B0 = layoutNode.B0();
        if (B0 != null) {
            return B0;
        }
        InlineClassHelperKt.d("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
