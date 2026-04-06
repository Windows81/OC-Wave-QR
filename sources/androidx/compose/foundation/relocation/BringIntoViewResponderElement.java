package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BringIntoViewResponderElement extends ModifierNodeElement<BringIntoViewResponderNode> {

    /* renamed from: z  reason: collision with root package name */
    public final BringIntoViewResponder f5406z;

    /* renamed from: c */
    public BringIntoViewResponderNode a() {
        return new BringIntoViewResponderNode(this.f5406z);
    }

    /* renamed from: d */
    public void b(BringIntoViewResponderNode bringIntoViewResponderNode) {
        bringIntoViewResponderNode.c3(this.f5406z);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BringIntoViewResponderElement) && Intrinsics.d(this.f5406z, ((BringIntoViewResponderElement) obj).f5406z));
    }

    public int hashCode() {
        return this.f5406z.hashCode();
    }
}
