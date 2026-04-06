package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FocusEventElement extends ModifierNodeElement<FocusEventNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f15739z;

    /* renamed from: c */
    public FocusEventNode a() {
        return new FocusEventNode(this.f15739z);
    }

    /* renamed from: d */
    public void b(FocusEventNode focusEventNode) {
        focusEventNode.Z2(this.f15739z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && Intrinsics.d(this.f15739z, ((FocusEventElement) obj).f15739z);
    }

    public int hashCode() {
        return this.f15739z.hashCode();
    }

    public String toString() {
        return "FocusEventElement(onFocusEvent=" + this.f15739z + ')';
    }
}
