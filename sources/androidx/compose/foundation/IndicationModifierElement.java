package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class IndicationModifierElement extends ModifierNodeElement<IndicationModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final IndicationNodeFactory f3094A;

    /* renamed from: z  reason: collision with root package name */
    public final InteractionSource f3095z;

    public IndicationModifierElement(InteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory) {
        this.f3095z = interactionSource;
        this.f3094A = indicationNodeFactory;
    }

    /* renamed from: c */
    public IndicationModifierNode a() {
        return new IndicationModifierNode(this.f3094A.b(this.f3095z));
    }

    /* renamed from: d */
    public void b(IndicationModifierNode indicationModifierNode) {
        indicationModifierNode.f3(this.f3094A.b(this.f3095z));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.d(this.f3095z, indicationModifierElement.f3095z) && Intrinsics.d(this.f3094A, indicationModifierElement.f3094A);
    }

    public int hashCode() {
        return (this.f3095z.hashCode() * 31) + this.f3094A.hashCode();
    }
}
