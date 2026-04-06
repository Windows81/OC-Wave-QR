package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class NestedScrollElement extends ModifierNodeElement<NestedScrollNode> {

    /* renamed from: A  reason: collision with root package name */
    public final NestedScrollDispatcher f16791A;

    /* renamed from: z  reason: collision with root package name */
    public final NestedScrollConnection f16792z;

    public NestedScrollElement(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.f16792z = nestedScrollConnection;
        this.f16791A = nestedScrollDispatcher;
    }

    /* renamed from: c */
    public NestedScrollNode a() {
        return new NestedScrollNode(this.f16792z, this.f16791A);
    }

    /* renamed from: d */
    public void b(NestedScrollNode nestedScrollNode) {
        nestedScrollNode.g3(this.f16792z, this.f16791A);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return Intrinsics.d(nestedScrollElement.f16792z, this.f16792z) && Intrinsics.d(nestedScrollElement.f16791A, this.f16791A);
    }

    public int hashCode() {
        int hashCode = this.f16792z.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.f16791A;
        return hashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }
}
