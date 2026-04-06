package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FocusRestorerElement extends ModifierNodeElement<FocusRestorerNode> {

    /* renamed from: z  reason: collision with root package name */
    public final FocusRequester f15811z;

    /* renamed from: c */
    public FocusRestorerNode a() {
        return new FocusRestorerNode(this.f15811z);
    }

    /* renamed from: d */
    public void b(FocusRestorerNode focusRestorerNode) {
        focusRestorerNode.c3(this.f15811z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRestorerElement) && Intrinsics.d(this.f15811z, ((FocusRestorerElement) obj).f15811z);
    }

    public int hashCode() {
        return this.f15811z.hashCode();
    }

    public String toString() {
        return "FocusRestorerElement(fallback=" + this.f15811z + ')';
    }
}
