package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class OnSizeChangedModifier extends ModifierNodeElement<OnSizeChangedNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f17136z;

    public OnSizeChangedModifier(Function1 function1) {
        this.f17136z = function1;
    }

    /* renamed from: c */
    public OnSizeChangedNode a() {
        return new OnSizeChangedNode(this.f17136z);
    }

    /* renamed from: d */
    public void b(OnSizeChangedNode onSizeChangedNode) {
        onSizeChangedNode.Z2(this.f17136z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSizeChangedModifier)) {
            return false;
        }
        return this.f17136z == ((OnSizeChangedModifier) obj).f17136z;
    }

    public int hashCode() {
        return this.f17136z.hashCode();
    }
}
