package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RenderInTransitionOverlayNodeElement extends ModifierNodeElement<RenderInTransitionOverlayNode> {

    /* renamed from: A  reason: collision with root package name */
    public Function0 f2294A;

    /* renamed from: B  reason: collision with root package name */
    public final float f2295B;
    public final Function2 C;

    /* renamed from: z  reason: collision with root package name */
    public SharedTransitionScopeImpl f2296z;

    /* renamed from: c */
    public RenderInTransitionOverlayNode a() {
        return new RenderInTransitionOverlayNode(this.f2296z, this.f2294A, this.f2295B, this.C);
    }

    /* renamed from: d */
    public void b(RenderInTransitionOverlayNode renderInTransitionOverlayNode) {
        renderInTransitionOverlayNode.g3(this.f2296z);
        renderInTransitionOverlayNode.f3(this.f2294A);
        renderInTransitionOverlayNode.h3(this.f2295B);
        renderInTransitionOverlayNode.e3(this.C);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RenderInTransitionOverlayNodeElement)) {
            return false;
        }
        RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) obj;
        return Intrinsics.d(this.f2296z, renderInTransitionOverlayNodeElement.f2296z) && this.f2294A == renderInTransitionOverlayNodeElement.f2294A && this.f2295B == renderInTransitionOverlayNodeElement.f2295B && this.C == renderInTransitionOverlayNodeElement.C;
    }

    public int hashCode() {
        return (((((this.f2296z.hashCode() * 31) + this.f2294A.hashCode()) * 31) + Float.hashCode(this.f2295B)) * 31) + this.C.hashCode();
    }

    public String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=" + this.f2296z + ", renderInOverlay=" + this.f2294A + ", zIndexInOverlay=" + this.f2295B + ", clipInOverlay=" + this.C + ')';
    }
}
