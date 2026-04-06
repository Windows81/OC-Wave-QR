package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class OnGloballyPositionedElement extends ModifierNodeElement<OnGloballyPositionedNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f17131z;

    public OnGloballyPositionedElement(Function1 function1) {
        this.f17131z = function1;
    }

    /* renamed from: c */
    public OnGloballyPositionedNode a() {
        return new OnGloballyPositionedNode(this.f17131z);
    }

    /* renamed from: d */
    public void b(OnGloballyPositionedNode onGloballyPositionedNode) {
        onGloballyPositionedNode.Z2(this.f17131z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return this.f17131z == ((OnGloballyPositionedElement) obj).f17131z;
    }

    public int hashCode() {
        return this.f17131z.hashCode();
    }
}
