package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BringIntoViewRequesterElement extends ModifierNodeElement<BringIntoViewRequesterNode> {

    /* renamed from: z  reason: collision with root package name */
    public final BringIntoViewRequester f5403z;

    public BringIntoViewRequesterElement(BringIntoViewRequester bringIntoViewRequester) {
        this.f5403z = bringIntoViewRequester;
    }

    /* renamed from: c */
    public BringIntoViewRequesterNode a() {
        return new BringIntoViewRequesterNode(this.f5403z);
    }

    /* renamed from: d */
    public void b(BringIntoViewRequesterNode bringIntoViewRequesterNode) {
        bringIntoViewRequesterNode.a3(this.f5403z);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BringIntoViewRequesterElement) && Intrinsics.d(this.f5403z, ((BringIntoViewRequesterElement) obj).f5403z));
    }

    public int hashCode() {
        return this.f5403z.hashCode();
    }
}
