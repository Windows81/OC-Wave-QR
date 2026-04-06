package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class ExcludeFromSystemGestureElement extends ModifierNodeElement<ExcludeFromSystemGestureNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f3067z;

    /* renamed from: c */
    public ExcludeFromSystemGestureNode a() {
        return new ExcludeFromSystemGestureNode(this.f3067z);
    }

    /* renamed from: d */
    public void b(ExcludeFromSystemGestureNode excludeFromSystemGestureNode) {
        excludeFromSystemGestureNode.e3(this.f3067z);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExcludeFromSystemGestureElement) && this.f3067z == ((ExcludeFromSystemGestureElement) obj).f3067z;
    }

    public int hashCode() {
        Function1 function1 = this.f3067z;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }
}
