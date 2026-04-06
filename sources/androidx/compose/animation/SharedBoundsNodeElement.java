package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SharedBoundsNodeElement extends ModifierNodeElement<SharedBoundsNode> {

    /* renamed from: z  reason: collision with root package name */
    public final SharedElementInternalState f2314z;

    public SharedBoundsNodeElement(SharedElementInternalState sharedElementInternalState) {
        this.f2314z = sharedElementInternalState;
    }

    /* renamed from: c */
    public SharedBoundsNode a() {
        return new SharedBoundsNode(this.f2314z);
    }

    /* renamed from: d */
    public void b(SharedBoundsNode sharedBoundsNode) {
        sharedBoundsNode.n3(this.f2314z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && Intrinsics.d(this.f2314z, ((SharedBoundsNodeElement) obj).f2314z);
    }

    public int hashCode() {
        return this.f2314z.hashCode();
    }

    public String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.f2314z + ')';
    }
}
