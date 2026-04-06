package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SelectableElement extends ModifierNodeElement<SelectableNode> {

    /* renamed from: A  reason: collision with root package name */
    public final MutableInteractionSource f5410A;

    /* renamed from: B  reason: collision with root package name */
    public final IndicationNodeFactory f5411B;
    public final boolean C;
    public final Role D;
    public final Function0 E;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f5412z;

    public /* synthetic */ SelectableElement(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, mutableInteractionSource, indicationNodeFactory, z3, role, function0);
    }

    /* renamed from: c */
    public SelectableNode a() {
        return new SelectableNode(this.f5412z, this.f5410A, this.f5411B, this.C, this.D, this.E, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(SelectableNode selectableNode) {
        selectableNode.F3(this.f5412z, this.f5410A, this.f5411B, this.C, this.D, this.E);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f5412z == selectableElement.f5412z && Intrinsics.d(this.f5410A, selectableElement.f5410A) && Intrinsics.d(this.f5411B, selectableElement.f5411B) && this.C == selectableElement.C && Intrinsics.d(this.D, selectableElement.D) && this.E == selectableElement.E;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f5412z) * 31;
        MutableInteractionSource mutableInteractionSource = this.f5410A;
        int i2 = 0;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f5411B;
        int hashCode3 = (((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.C)) * 31;
        Role role = this.D;
        if (role != null) {
            i2 = Role.n(role.p());
        }
        return ((hashCode3 + i2) * 31) + this.E.hashCode();
    }

    public SelectableElement(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function0 function0) {
        this.f5412z = z2;
        this.f5410A = mutableInteractionSource;
        this.f5411B = indicationNodeFactory;
        this.C = z3;
        this.D = role;
        this.E = function0;
    }
}
