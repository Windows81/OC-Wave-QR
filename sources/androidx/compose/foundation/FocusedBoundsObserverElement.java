package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class FocusedBoundsObserverElement extends ModifierNodeElement<FocusedBoundsObserverNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f3076z;

    /* renamed from: c */
    public FocusedBoundsObserverNode a() {
        return new FocusedBoundsObserverNode(this.f3076z);
    }

    /* renamed from: d */
    public void b(FocusedBoundsObserverNode focusedBoundsObserverNode) {
        focusedBoundsObserverNode.a3(this.f3076z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        FocusedBoundsObserverElement focusedBoundsObserverElement = obj instanceof FocusedBoundsObserverElement ? (FocusedBoundsObserverElement) obj : null;
        if (focusedBoundsObserverElement == null) {
            return false;
        }
        return this.f3076z == focusedBoundsObserverElement.f3076z;
    }

    public int hashCode() {
        return this.f3076z.hashCode();
    }
}
