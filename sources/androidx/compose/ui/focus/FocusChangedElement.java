package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FocusChangedElement extends ModifierNodeElement<FocusChangedNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f15728z;

    public FocusChangedElement(Function1 function1) {
        this.f15728z = function1;
    }

    /* renamed from: c */
    public FocusChangedNode a() {
        return new FocusChangedNode(this.f15728z);
    }

    /* renamed from: d */
    public void b(FocusChangedNode focusChangedNode) {
        focusChangedNode.Z2(this.f15728z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.d(this.f15728z, ((FocusChangedElement) obj).f15728z);
    }

    public int hashCode() {
        return this.f15728z.hashCode();
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f15728z + ')';
    }
}
