package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TransformableElement extends ModifierNodeElement<TransformableNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f3611A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f3612B;
    public final boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final TransformableState f3613z;

    /* renamed from: c */
    public TransformableNode a() {
        return new TransformableNode(this.f3613z, this.f3611A, this.f3612B, this.C);
    }

    /* renamed from: d */
    public void b(TransformableNode transformableNode) {
        transformableNode.l3(this.f3613z, this.f3611A, this.f3612B, this.C);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformableElement.class != obj.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return Intrinsics.d(this.f3613z, transformableElement.f3613z) && this.f3611A == transformableElement.f3611A && this.f3612B == transformableElement.f3612B && this.C == transformableElement.C;
    }

    public int hashCode() {
        return (((((this.f3613z.hashCode() * 31) + this.f3611A.hashCode()) * 31) + Boolean.hashCode(this.f3612B)) * 31) + Boolean.hashCode(this.C);
    }
}
