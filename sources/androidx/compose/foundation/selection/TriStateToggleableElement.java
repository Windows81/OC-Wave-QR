package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TriStateToggleableElement extends ModifierNodeElement<TriStateToggleableNode> {

    /* renamed from: A  reason: collision with root package name */
    public final MutableInteractionSource f5447A;

    /* renamed from: B  reason: collision with root package name */
    public final IndicationNodeFactory f5448B;
    public final boolean C;
    public final Role D;
    public final Function0 E;

    /* renamed from: z  reason: collision with root package name */
    public final ToggleableState f5449z;

    public /* synthetic */ TriStateToggleableElement(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(toggleableState, mutableInteractionSource, indicationNodeFactory, z2, role, function0);
    }

    /* renamed from: c */
    public TriStateToggleableNode a() {
        return new TriStateToggleableNode(this.f5449z, this.f5447A, this.f5448B, this.C, this.D, this.E, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(TriStateToggleableNode triStateToggleableNode) {
        triStateToggleableNode.F3(this.f5449z, this.f5447A, this.f5448B, this.C, this.D, this.E);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f5449z == triStateToggleableElement.f5449z && Intrinsics.d(this.f5447A, triStateToggleableElement.f5447A) && Intrinsics.d(this.f5448B, triStateToggleableElement.f5448B) && this.C == triStateToggleableElement.C && Intrinsics.d(this.D, triStateToggleableElement.D) && this.E == triStateToggleableElement.E;
    }

    public int hashCode() {
        int hashCode = this.f5449z.hashCode() * 31;
        MutableInteractionSource mutableInteractionSource = this.f5447A;
        int i2 = 0;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f5448B;
        int hashCode3 = (((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.C)) * 31;
        Role role = this.D;
        if (role != null) {
            i2 = Role.n(role.p());
        }
        return ((hashCode3 + i2) * 31) + this.E.hashCode();
    }

    public TriStateToggleableElement(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, Function0 function0) {
        this.f5449z = toggleableState;
        this.f5447A = mutableInteractionSource;
        this.f5448B = indicationNodeFactory;
        this.C = z2;
        this.D = role;
        this.E = function0;
    }
}
