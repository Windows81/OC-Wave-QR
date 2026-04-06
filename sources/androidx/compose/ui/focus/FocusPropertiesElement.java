package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FocusPropertiesElement extends ModifierNodeElement<FocusPropertiesNode> {

    /* renamed from: z  reason: collision with root package name */
    public final FocusPropertiesScope f15786z;

    /* renamed from: c */
    public FocusPropertiesNode a() {
        return new FocusPropertiesNode(this.f15786z);
    }

    /* renamed from: d */
    public void b(FocusPropertiesNode focusPropertiesNode) {
        focusPropertiesNode.Z2(this.f15786z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && Intrinsics.d(this.f15786z, ((FocusPropertiesElement) obj).f15786z);
    }

    public int hashCode() {
        return this.f15786z.hashCode();
    }

    public String toString() {
        return "FocusPropertiesElement(scope=" + this.f15786z + ')';
    }
}
