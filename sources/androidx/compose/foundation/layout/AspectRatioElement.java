package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class AspectRatioElement extends ModifierNodeElement<AspectRatioNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f3771A;

    /* renamed from: B  reason: collision with root package name */
    public final Function1 f3772B;

    /* renamed from: z  reason: collision with root package name */
    public final float f3773z;

    public AspectRatioElement(float f2, boolean z2, Function1 function1) {
        this.f3773z = f2;
        this.f3771A = z2;
        this.f3772B = function1;
        if (!(f2 > 0.0f)) {
            InlineClassHelperKt.a("aspectRatio " + f2 + " must be > 0");
        }
    }

    /* renamed from: c */
    public AspectRatioNode a() {
        return new AspectRatioNode(this.f3773z, this.f3771A);
    }

    /* renamed from: d */
    public void b(AspectRatioNode aspectRatioNode) {
        aspectRatioNode.a3(this.f3773z);
        aspectRatioNode.b3(this.f3771A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        return this.f3773z == aspectRatioElement.f3773z && this.f3771A == ((AspectRatioElement) obj).f3771A;
    }

    public int hashCode() {
        return (Float.hashCode(this.f3773z) * 31) + Boolean.hashCode(this.f3771A);
    }
}
