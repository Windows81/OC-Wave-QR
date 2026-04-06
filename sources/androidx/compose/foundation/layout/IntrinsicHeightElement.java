package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class IntrinsicHeightElement extends ModifierNodeElement<IntrinsicHeightNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f4059A;

    /* renamed from: B  reason: collision with root package name */
    public final Function1 f4060B;

    /* renamed from: z  reason: collision with root package name */
    public final IntrinsicSize f4061z;

    public IntrinsicHeightElement(IntrinsicSize intrinsicSize, boolean z2, Function1 function1) {
        this.f4061z = intrinsicSize;
        this.f4059A = z2;
        this.f4060B = function1;
    }

    /* renamed from: c */
    public IntrinsicHeightNode a() {
        return new IntrinsicHeightNode(this.f4061z, this.f4059A);
    }

    /* renamed from: d */
    public void b(IntrinsicHeightNode intrinsicHeightNode) {
        intrinsicHeightNode.c3(this.f4061z);
        intrinsicHeightNode.b3(this.f4059A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        if (intrinsicHeightElement == null) {
            return false;
        }
        return this.f4061z == intrinsicHeightElement.f4061z && this.f4059A == intrinsicHeightElement.f4059A;
    }

    public int hashCode() {
        return (this.f4061z.hashCode() * 31) + Boolean.hashCode(this.f4059A);
    }
}
