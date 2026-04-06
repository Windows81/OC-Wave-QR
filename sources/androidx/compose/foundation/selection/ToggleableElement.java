package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ToggleableElement extends ModifierNodeElement<ToggleableNode> {

    /* renamed from: A  reason: collision with root package name */
    public final MutableInteractionSource f5423A;

    /* renamed from: B  reason: collision with root package name */
    public final IndicationNodeFactory f5424B;
    public final boolean C;
    public final Role D;
    public final Function1 E;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f5425z;

    public /* synthetic */ ToggleableElement(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, mutableInteractionSource, indicationNodeFactory, z3, role, function1);
    }

    /* renamed from: c */
    public ToggleableNode a() {
        return new ToggleableNode(this.f5425z, this.f5423A, this.f5424B, this.C, this.D, this.E, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(ToggleableNode toggleableNode) {
        toggleableNode.H3(this.f5425z, this.f5423A, this.f5424B, this.C, this.D, this.E);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f5425z == toggleableElement.f5425z && Intrinsics.d(this.f5423A, toggleableElement.f5423A) && Intrinsics.d(this.f5424B, toggleableElement.f5424B) && this.C == toggleableElement.C && Intrinsics.d(this.D, toggleableElement.D) && this.E == toggleableElement.E;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f5425z) * 31;
        MutableInteractionSource mutableInteractionSource = this.f5423A;
        int i2 = 0;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f5424B;
        int hashCode3 = (((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.C)) * 31;
        Role role = this.D;
        if (role != null) {
            i2 = Role.n(role.p());
        }
        return ((hashCode3 + i2) * 31) + this.E.hashCode();
    }

    public ToggleableElement(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function1 function1) {
        this.f5425z = z2;
        this.f5423A = mutableInteractionSource;
        this.f5424B = indicationNodeFactory;
        this.C = z3;
        this.D = role;
        this.E = function1;
    }
}
