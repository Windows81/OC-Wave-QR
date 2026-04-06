package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FocusRequesterElement extends ModifierNodeElement<FocusRequesterNode> {

    /* renamed from: z  reason: collision with root package name */
    public final FocusRequester f15809z;

    public FocusRequesterElement(FocusRequester focusRequester) {
        this.f15809z = focusRequester;
    }

    /* renamed from: c */
    public FocusRequesterNode a() {
        return new FocusRequesterNode(this.f15809z);
    }

    /* renamed from: d */
    public void b(FocusRequesterNode focusRequesterNode) {
        focusRequesterNode.d1().f().v(focusRequesterNode);
        focusRequesterNode.Z2(this.f15809z);
        focusRequesterNode.d1().f().d(focusRequesterNode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.d(this.f15809z, ((FocusRequesterElement) obj).f15809z);
    }

    public int hashCode() {
        return this.f15809z.hashCode();
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f15809z + ')';
    }
}
