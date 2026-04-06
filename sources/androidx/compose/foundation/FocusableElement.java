package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FocusableElement extends ModifierNodeElement<FocusableNode> {

    /* renamed from: z  reason: collision with root package name */
    public final MutableInteractionSource f3070z;

    public FocusableElement(MutableInteractionSource mutableInteractionSource) {
        this.f3070z = mutableInteractionSource;
    }

    /* renamed from: c */
    public FocusableNode a() {
        return new FocusableNode(this.f3070z, 0, (Function1) null, 6, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(FocusableNode focusableNode) {
        focusableNode.o3(this.f3070z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && Intrinsics.d(this.f3070z, ((FocusableElement) obj).f3070z);
    }

    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.f3070z;
        if (mutableInteractionSource != null) {
            return mutableInteractionSource.hashCode();
        }
        return 0;
    }
}
