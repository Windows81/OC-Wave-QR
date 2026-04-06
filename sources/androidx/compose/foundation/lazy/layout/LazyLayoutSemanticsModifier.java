package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LazyLayoutSemanticsModifier extends ModifierNodeElement<LazyLayoutSemanticsModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final LazyLayoutSemanticState f4926A;

    /* renamed from: B  reason: collision with root package name */
    public final Orientation f4927B;
    public final boolean C;
    public final boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final Function0 f4928z;

    public LazyLayoutSemanticsModifier(Function0 function0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z2, boolean z3) {
        this.f4928z = function0;
        this.f4926A = lazyLayoutSemanticState;
        this.f4927B = orientation;
        this.C = z2;
        this.D = z3;
    }

    /* renamed from: c */
    public LazyLayoutSemanticsModifierNode a() {
        return new LazyLayoutSemanticsModifierNode(this.f4928z, this.f4926A, this.f4927B, this.C, this.D);
    }

    /* renamed from: d */
    public void b(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        lazyLayoutSemanticsModifierNode.d3(this.f4928z, this.f4926A, this.f4927B, this.C, this.D);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f4928z == lazyLayoutSemanticsModifier.f4928z && Intrinsics.d(this.f4926A, lazyLayoutSemanticsModifier.f4926A) && this.f4927B == lazyLayoutSemanticsModifier.f4927B && this.C == lazyLayoutSemanticsModifier.C && this.D == lazyLayoutSemanticsModifier.D;
    }

    public int hashCode() {
        return (((((((this.f4928z.hashCode() * 31) + this.f4926A.hashCode()) * 31) + this.f4927B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D);
    }
}
